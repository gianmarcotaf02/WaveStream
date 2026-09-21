package androidx.media3.session.legacy;

/* JADX INFO: loaded from: classes.dex */
public final class LegacyParcelableUtil {
    private LegacyParcelableUtil() {
    }

    public static <T extends android.os.Parcelable, U extends android.os.Parcelable> T convert(U u6, android.os.Parcelable.Creator<T> creator) {
        if (u6 == null) {
            return null;
        }
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        try {
            u6.writeToParcel(parcelObtain, 0);
            parcelObtain.setDataPosition(0);
            return creator.createFromParcel(parcelObtain);
        } finally {
            parcelObtain.recycle();
        }
    }

    public static <T extends android.os.Parcelable, U extends android.os.Parcelable> java.util.ArrayList<T> convertList(java.util.List<U> list, android.os.Parcelable.Creator<T> creator) {
        if (list == null) {
            return null;
        }
        io.sentry.android.replay.RootViewsSpy$delegatingViewList$1 rootViewsSpy$delegatingViewList$1 = (java.util.ArrayList<T>) new java.util.ArrayList();
        for (int i3 = 0; i3 < list.size(); i3++) {
            rootViewsSpy$delegatingViewList$1.add(convert(list.get(i3), creator));
        }
        return rootViewsSpy$delegatingViewList$1;
    }
}
