package androidx.media3.extractor.text;

/* JADX INFO: loaded from: classes.dex */
public final class CueDecoder {
    static final java.lang.String BUNDLE_FIELD_CUES = "c";
    static final java.lang.String BUNDLE_FIELD_DURATION_US = "d";

    public androidx.media3.extractor.text.CuesWithTiming decode(long j, byte[] bArr, int i3, int i9) {
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        parcelObtain.unmarshall(bArr, i3, i9);
        parcelObtain.setDataPosition(0);
        android.os.Bundle bundle = parcelObtain.readBundle(android.os.Bundle.class.getClassLoader());
        parcelObtain.recycle();
        java.util.ArrayList parcelableArrayList = bundle.getParcelableArrayList(BUNDLE_FIELD_CUES);
        parcelableArrayList.getClass();
        return new androidx.media3.extractor.text.CuesWithTiming(androidx.media3.common.util.BundleCollectionUtil.fromBundleList(new androidx.media3.common.b(14), parcelableArrayList), j, bundle.getLong("d"));
    }
}
