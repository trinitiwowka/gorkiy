package kotlinx.coroutines;

import com.google.android.gms.fitness.FitnessActivities;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'¨\u0006\u0006"}, d2 = {"Lkotlinx/coroutines/ChildJob;", "Lkotlinx/coroutines/Job;", "parentCancelled", "", "parentJob", "Lkotlinx/coroutines/ParentJob;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 16})
@Deprecated(level = DeprecationLevel.ERROR, message = "This is internal API and may be removed in the future releases")
/* compiled from: Job.kt */
public interface ChildJob extends Job {

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 16})
    /* compiled from: Job.kt */
    public static final class DefaultImpls {
        public static <R> R fold(ChildJob childJob, R r, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
            Intrinsics.checkParameterIsNotNull(function2, "operation");
            return Job.DefaultImpls.fold(childJob, r, function2);
        }

        public static <E extends CoroutineContext.Element> E get(ChildJob childJob, CoroutineContext.Key<E> key) {
            Intrinsics.checkParameterIsNotNull(key, "key");
            return Job.DefaultImpls.get(childJob, key);
        }

        public static CoroutineContext minusKey(ChildJob childJob, CoroutineContext.Key<?> key) {
            Intrinsics.checkParameterIsNotNull(key, "key");
            return Job.DefaultImpls.minusKey(childJob, key);
        }

        public static CoroutineContext plus(ChildJob childJob, CoroutineContext coroutineContext) {
            Intrinsics.checkParameterIsNotNull(coroutineContext, "context");
            return Job.DefaultImpls.plus(childJob, coroutineContext);
        }

        /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
         method: kotlinx.coroutines.Job.DefaultImpls.plus(kotlinx.coroutines.Job, kotlinx.coroutines.Job):kotlinx.coroutines.Job
         arg types: [kotlinx.coroutines.ChildJob, kotlinx.coroutines.Job]
         candidates:
          kotlinx.coroutines.Job.DefaultImpls.plus(kotlinx.coroutines.Job, kotlin.coroutines.CoroutineContext):kotlin.coroutines.CoroutineContext
          kotlinx.coroutines.Job.DefaultImpls.plus(kotlinx.coroutines.Job, kotlinx.coroutines.Job):kotlinx.coroutines.Job */
        @Deprecated(level = DeprecationLevel.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        public static Job plus(ChildJob childJob, Job job) {
            Intrinsics.checkParameterIsNotNull(job, FitnessActivities.OTHER);
            return Job.DefaultImpls.plus((Job) childJob, job);
        }
    }

    void parentCancelled(ParentJob parentJob);
}
