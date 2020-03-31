package androidx.work.impl.utils;

import androidx.work.WorkInfo;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.futures.SettableFuture;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.UUID;

public abstract class StatusRunnable<T> implements Runnable {
    private final SettableFuture<T> mFuture = SettableFuture.create();

    /* access modifiers changed from: package-private */
    public abstract T runInternal();

    public void run() {
        try {
            this.mFuture.set(runInternal());
        } catch (Throwable th) {
            this.mFuture.setException(th);
        }
    }

    public ListenableFuture<T> getFuture() {
        return this.mFuture;
    }

    public static StatusRunnable<List<WorkInfo>> forStringIds(final WorkManagerImpl workManagerImpl, final List<String> list) {
        return new StatusRunnable<List<WorkInfo>>() {
            /* class androidx.work.impl.utils.StatusRunnable.AnonymousClass1 */

            public List<WorkInfo> runInternal() {
                return WorkSpec.WORK_INFO_MAPPER.apply(workManagerImpl.getWorkDatabase().workSpecDao().getWorkStatusPojoForIds(list));
            }
        };
    }

    public static StatusRunnable<WorkInfo> forUUID(final WorkManagerImpl workManagerImpl, final UUID uuid) {
        return new StatusRunnable<WorkInfo>() {
            /* class androidx.work.impl.utils.StatusRunnable.AnonymousClass2 */

            /* access modifiers changed from: package-private */
            public WorkInfo runInternal() {
                WorkSpec.WorkInfoPojo workStatusPojoForId = workManagerImpl.getWorkDatabase().workSpecDao().getWorkStatusPojoForId(uuid.toString());
                if (workStatusPojoForId != null) {
                    return workStatusPojoForId.toWorkInfo();
                }
                return null;
            }
        };
    }

    public static StatusRunnable<List<WorkInfo>> forTag(final WorkManagerImpl workManagerImpl, final String str) {
        return new StatusRunnable<List<WorkInfo>>() {
            /* class androidx.work.impl.utils.StatusRunnable.AnonymousClass3 */

            /* access modifiers changed from: package-private */
            public List<WorkInfo> runInternal() {
                return WorkSpec.WORK_INFO_MAPPER.apply(workManagerImpl.getWorkDatabase().workSpecDao().getWorkStatusPojoForTag(str));
            }
        };
    }

    public static StatusRunnable<List<WorkInfo>> forUniqueWork(final WorkManagerImpl workManagerImpl, final String str) {
        return new StatusRunnable<List<WorkInfo>>() {
            /* class androidx.work.impl.utils.StatusRunnable.AnonymousClass4 */

            /* access modifiers changed from: package-private */
            public List<WorkInfo> runInternal() {
                return WorkSpec.WORK_INFO_MAPPER.apply(workManagerImpl.getWorkDatabase().workSpecDao().getWorkStatusPojoForName(str));
            }
        };
    }
}
