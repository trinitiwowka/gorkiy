package com.google.android.gms.location;

import android.os.Parcelable;

public final class zzaa implements Parcelable.Creator<LocationAvailability> {
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r14) {
        /*
            r13 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r14)
            r1 = 1
            r2 = 1000(0x3e8, float:1.401E-42)
            r3 = 0
            r5 = 0
            r8 = r1
            r9 = r8
            r7 = r2
            r10 = r3
            r12 = r5
        L_0x000f:
            int r2 = r14.dataPosition()
            if (r2 >= r0) goto L_0x004d
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r14)
            int r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r2)
            if (r3 == r1) goto L_0x0048
            r4 = 2
            if (r3 == r4) goto L_0x0043
            r4 = 3
            if (r3 == r4) goto L_0x003e
            r4 = 4
            if (r3 == r4) goto L_0x0039
            r4 = 5
            if (r3 == r4) goto L_0x002f
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r14, r2)
            goto L_0x000f
        L_0x002f:
            android.os.Parcelable$Creator<com.google.android.gms.location.zzaj> r3 = com.google.android.gms.location.zzaj.CREATOR
            java.lang.Object[] r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedArray(r14, r2, r3)
            r12 = r2
            com.google.android.gms.location.zzaj[] r12 = (com.google.android.gms.location.zzaj[]) r12
            goto L_0x000f
        L_0x0039:
            int r7 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r14, r2)
            goto L_0x000f
        L_0x003e:
            long r10 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(r14, r2)
            goto L_0x000f
        L_0x0043:
            int r9 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r14, r2)
            goto L_0x000f
        L_0x0048:
            int r8 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r14, r2)
            goto L_0x000f
        L_0x004d:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r14, r0)
            com.google.android.gms.location.LocationAvailability r14 = new com.google.android.gms.location.LocationAvailability
            r6 = r14
            r6.<init>(r7, r8, r9, r10, r12)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.location.zzaa.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationAvailability[i];
    }
}
