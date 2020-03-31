package com.google.android.gms.fitness;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.internal.PendingResultUtil;
import com.google.android.gms.fitness.result.ListSubscriptionsResult;

/* compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
final /* synthetic */ class zzm implements PendingResultUtil.ResultConverter {
    static final PendingResultUtil.ResultConverter zzho = new zzm();

    private zzm() {
    }

    public final Object convert(Result result) {
        return ((ListSubscriptionsResult) result).getSubscriptions();
    }
}
