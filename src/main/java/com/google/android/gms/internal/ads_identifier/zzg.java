package com.google.android.gms.internal.ads_identifier;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import io.fabric.sdk.android.services.common.AdvertisingInfoServiceStrategy;

public final class zzg extends zza implements zze {
    zzg(IBinder iBinder) {
        super(iBinder, AdvertisingInfoServiceStrategy.AdvertisingInterface.ADVERTISING_ID_SERVICE_INTERFACE_TOKEN);
    }

    public final String getId() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken());
        String readString = transactAndReadException.readString();
        transactAndReadException.recycle();
        return readString;
    }

    public final boolean zzb(boolean z) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzc.zza(obtainAndWriteInterfaceToken, true);
        Parcel transactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken);
        boolean zza = zzc.zza(transactAndReadException);
        transactAndReadException.recycle();
        return zza;
    }

    public final boolean zzc() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(6, obtainAndWriteInterfaceToken());
        boolean zza = zzc.zza(transactAndReadException);
        transactAndReadException.recycle();
        return zza;
    }
}
