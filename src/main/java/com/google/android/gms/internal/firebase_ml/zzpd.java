package com.google.android.gms.internal.firebase_ml;

import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.internal.Preconditions;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.firebase:firebase-ml-common@@22.0.1 */
public class zzpd {
    private static final GmsLogger zzbbo = new GmsLogger("LibraryVersion", "");
    private static zzpd zzbbp = new zzpd();
    private final ConcurrentHashMap<String, String> zzbbq = new ConcurrentHashMap<>();

    public static zzpd zznm() {
        return zzbbp;
    }

    private zzpd() {
    }

    public final String getVersion(String str) {
        Preconditions.checkNotEmpty(str, "Please provide a valid libraryName");
        if (this.zzbbq.containsKey(str)) {
            return this.zzbbq.get(str);
        }
        Properties properties = new Properties();
        String str2 = null;
        try {
            InputStream resourceAsStream = zzpd.class.getResourceAsStream(String.format("/%s.properties", str));
            if (resourceAsStream != null) {
                properties.load(resourceAsStream);
                str2 = properties.getProperty("version", null);
                GmsLogger gmsLogger = zzbbo;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12 + String.valueOf(str2).length());
                sb.append(str);
                sb.append(" version is ");
                sb.append(str2);
                gmsLogger.v("LibraryVersion", sb.toString());
            } else {
                GmsLogger gmsLogger2 = zzbbo;
                String valueOf = String.valueOf(str);
                gmsLogger2.e("LibraryVersion", valueOf.length() != 0 ? "Failed to get app version for libraryName: ".concat(valueOf) : new String("Failed to get app version for libraryName: "));
            }
        } catch (IOException e) {
            GmsLogger gmsLogger3 = zzbbo;
            String valueOf2 = String.valueOf(str);
            gmsLogger3.e("LibraryVersion", valueOf2.length() != 0 ? "Failed to get app version for libraryName: ".concat(valueOf2) : new String("Failed to get app version for libraryName: "), e);
        }
        if (str2 == null) {
            zzbbo.d("LibraryVersion", ".properties file is dropped during release process. Failure to read app version isexpected druing Google internal testing where locally-built libraries are used");
            str2 = "UNKNOWN";
        }
        this.zzbbq.put(str, str2);
        return str2;
    }
}
