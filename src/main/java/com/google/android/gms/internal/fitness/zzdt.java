package com.google.android.gms.internal.fitness;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.request.zzai;
import com.google.android.gms.fitness.result.ListSubscriptionsResult;

/* compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
final class zzdt extends zzan<ListSubscriptionsResult> {
    private final /* synthetic */ DataType zznm;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzdt(zzdr zzdr, GoogleApiClient googleApiClient, DataType dataType) {
        super(googleApiClient);
        this.zznm = dataType;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.fitness.request.zzai.<init>(com.google.android.gms.fitness.data.DataType, com.google.android.gms.internal.fitness.zzcf):void
     arg types: [com.google.android.gms.fitness.data.DataType, com.google.android.gms.internal.fitness.zzdx]
     candidates:
      com.google.android.gms.fitness.request.zzai.<init>(com.google.android.gms.fitness.data.DataType, android.os.IBinder):void
      com.google.android.gms.fitness.request.zzai.<init>(com.google.android.gms.fitness.data.DataType, com.google.android.gms.internal.fitness.zzcf):void */
    /* access modifiers changed from: protected */
    public final /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((zzbz) ((zzai) anyClient).getService()).zza(new zzai(this.zznm, (zzcf) new zzdx(this, null)));
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Result createFailedResult(Status status) {
        return ListSubscriptionsResult.zzd(status);
    }
}
