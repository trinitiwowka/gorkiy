package com.google.android.gms.common;

import com.google.android.gms.common.api.internal.ApiKey;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
final class zaa implements Continuation<Map<ApiKey<?>, String>, Void> {
    zaa(GoogleApiAvailability googleApiAvailability) {
    }

    public final /* synthetic */ Object then(Task task) throws Exception {
        task.getResult();
        return null;
    }
}
