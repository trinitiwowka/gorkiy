package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
final class zau implements zabs {
    private final /* synthetic */ zaq zaet;

    private zau(zaq zaq) {
        this.zaet = zaq;
    }

    public final void zab(Bundle bundle) {
        this.zaet.zaer.lock();
        try {
            ConnectionResult unused = this.zaet.zaep = ConnectionResult.RESULT_SUCCESS;
            this.zaet.zav();
        } finally {
            this.zaet.zaer.unlock();
        }
    }

    public final void zac(ConnectionResult connectionResult) {
        this.zaet.zaer.lock();
        try {
            ConnectionResult unused = this.zaet.zaep = connectionResult;
            this.zaet.zav();
        } finally {
            this.zaet.zaer.unlock();
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.common.api.internal.zaq.zaa(com.google.android.gms.common.api.internal.zaq, boolean):boolean
     arg types: [com.google.android.gms.common.api.internal.zaq, int]
     candidates:
      com.google.android.gms.common.api.internal.zaq.zaa(com.google.android.gms.common.api.internal.zaq, com.google.android.gms.common.ConnectionResult):com.google.android.gms.common.ConnectionResult
      com.google.android.gms.common.api.internal.zaq.zaa(int, boolean):void
      com.google.android.gms.common.api.internal.zaq.zaa(com.google.android.gms.common.api.internal.zaq, android.os.Bundle):void
      com.google.android.gms.common.api.internal.zaq.zaa(com.google.android.gms.common.api.internal.zaq, boolean):boolean */
    public final void zab(int i, boolean z) {
        this.zaet.zaer.lock();
        try {
            if (this.zaet.zaeq) {
                boolean unused = this.zaet.zaeq = false;
                this.zaet.zaa(i, z);
                return;
            }
            boolean unused2 = this.zaet.zaeq = true;
            this.zaet.zaei.onConnectionSuspended(i);
            this.zaet.zaer.unlock();
        } finally {
            this.zaet.zaer.unlock();
        }
    }

    /* synthetic */ zau(zaq zaq, zat zat) {
        this(zaq);
    }
}
