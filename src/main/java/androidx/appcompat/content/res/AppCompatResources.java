package androidx.appcompat.content.res;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.appcompat.widget.ResourceManagerInternal;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ColorStateListInflaterCompat;
import java.util.WeakHashMap;

public final class AppCompatResources {
    private static final String LOG_TAG = "AppCompatResources";
    private static final ThreadLocal<TypedValue> TL_TYPED_VALUE = new ThreadLocal<>();
    private static final Object sColorStateCacheLock = new Object();
    private static final WeakHashMap<Context, SparseArray<ColorStateListCacheEntry>> sColorStateCaches = new WeakHashMap<>(0);

    private AppCompatResources() {
    }

    public static ColorStateList getColorStateList(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i);
        }
        ColorStateList cachedColorStateList = getCachedColorStateList(context, i);
        if (cachedColorStateList != null) {
            return cachedColorStateList;
        }
        ColorStateList inflateColorStateList = inflateColorStateList(context, i);
        if (inflateColorStateList == null) {
            return ContextCompat.getColorStateList(context, i);
        }
        addColorStateListToCache(context, i, inflateColorStateList);
        return inflateColorStateList;
    }

    public static Drawable getDrawable(Context context, int i) {
        return ResourceManagerInternal.get().getDrawable(context, i);
    }

    private static ColorStateList inflateColorStateList(Context context, int i) {
        if (isColorInt(context, i)) {
            return null;
        }
        Resources resources = context.getResources();
        try {
            return ColorStateListInflaterCompat.createFromXml(resources, resources.getXml(i), context.getTheme());
        } catch (Exception e) {
            Log.e(LOG_TAG, "Failed to inflate ColorStateList, leaving it to the framework", e);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0033, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.res.ColorStateList getCachedColorStateList(android.content.Context r4, int r5) {
        /*
            java.lang.Object r0 = androidx.appcompat.content.res.AppCompatResources.sColorStateCacheLock
            monitor-enter(r0)
            java.util.WeakHashMap<android.content.Context, android.util.SparseArray<androidx.appcompat.content.res.AppCompatResources$ColorStateListCacheEntry>> r1 = androidx.appcompat.content.res.AppCompatResources.sColorStateCaches     // Catch:{ all -> 0x0035 }
            java.lang.Object r1 = r1.get(r4)     // Catch:{ all -> 0x0035 }
            android.util.SparseArray r1 = (android.util.SparseArray) r1     // Catch:{ all -> 0x0035 }
            if (r1 == 0) goto L_0x0032
            int r2 = r1.size()     // Catch:{ all -> 0x0035 }
            if (r2 <= 0) goto L_0x0032
            java.lang.Object r2 = r1.get(r5)     // Catch:{ all -> 0x0035 }
            androidx.appcompat.content.res.AppCompatResources$ColorStateListCacheEntry r2 = (androidx.appcompat.content.res.AppCompatResources.ColorStateListCacheEntry) r2     // Catch:{ all -> 0x0035 }
            if (r2 == 0) goto L_0x0032
            android.content.res.Configuration r3 = r2.configuration     // Catch:{ all -> 0x0035 }
            android.content.res.Resources r4 = r4.getResources()     // Catch:{ all -> 0x0035 }
            android.content.res.Configuration r4 = r4.getConfiguration()     // Catch:{ all -> 0x0035 }
            boolean r4 = r3.equals(r4)     // Catch:{ all -> 0x0035 }
            if (r4 == 0) goto L_0x002f
            android.content.res.ColorStateList r4 = r2.value     // Catch:{ all -> 0x0035 }
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            return r4
        L_0x002f:
            r1.remove(r5)     // Catch:{ all -> 0x0035 }
        L_0x0032:
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            r4 = 0
            return r4
        L_0x0035:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.content.res.AppCompatResources.getCachedColorStateList(android.content.Context, int):android.content.res.ColorStateList");
    }

    private static void addColorStateListToCache(Context context, int i, ColorStateList colorStateList) {
        synchronized (sColorStateCacheLock) {
            SparseArray sparseArray = sColorStateCaches.get(context);
            if (sparseArray == null) {
                sparseArray = new SparseArray();
                sColorStateCaches.put(context, sparseArray);
            }
            sparseArray.append(i, new ColorStateListCacheEntry(colorStateList, context.getResources().getConfiguration()));
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.res.Resources.getValue(int, android.util.TypedValue, boolean):void throws android.content.res.Resources$NotFoundException}
     arg types: [int, android.util.TypedValue, int]
     candidates:
      ClspMth{android.content.res.Resources.getValue(java.lang.String, android.util.TypedValue, boolean):void throws android.content.res.Resources$NotFoundException}
      ClspMth{android.content.res.Resources.getValue(int, android.util.TypedValue, boolean):void throws android.content.res.Resources$NotFoundException} */
    private static boolean isColorInt(Context context, int i) {
        Resources resources = context.getResources();
        TypedValue typedValue = getTypedValue();
        resources.getValue(i, typedValue, true);
        if (typedValue.type < 28 || typedValue.type > 31) {
            return false;
        }
        return true;
    }

    private static TypedValue getTypedValue() {
        TypedValue typedValue = TL_TYPED_VALUE.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        TL_TYPED_VALUE.set(typedValue2);
        return typedValue2;
    }

    private static class ColorStateListCacheEntry {
        final Configuration configuration;
        final ColorStateList value;

        ColorStateListCacheEntry(ColorStateList colorStateList, Configuration configuration2) {
            this.value = colorStateList;
            this.configuration = configuration2;
        }
    }
}
