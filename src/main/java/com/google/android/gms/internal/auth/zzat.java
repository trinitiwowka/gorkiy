package com.google.android.gms.internal.auth;

import com.google.android.gms.auth.api.proxy.ProxyResponse;
import com.google.android.gms.common.api.Result;

final class zzat extends zzaj {
    private final /* synthetic */ zzas zzcf;

    zzat(zzas zzas) {
        this.zzcf = zzas;
    }

    public final void zza(ProxyResponse proxyResponse) {
        this.zzcf.setResult((Result) new zzaw(proxyResponse));
    }
}
