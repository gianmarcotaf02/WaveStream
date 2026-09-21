package androidx.media3.extractor.text;

/* JADX INFO: loaded from: classes.dex */
public final class CueEncoder {
    public byte[] encode(java.util.List<androidx.media3.common.text.Cue> list, long j) {
        java.util.ArrayList<android.os.Bundle> bundleArrayList = androidx.media3.common.util.BundleCollectionUtil.toBundleArrayList(list, new androidx.media3.extractor.text.a(1));
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelableArrayList("c", bundleArrayList);
        bundle.putLong("d", j);
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        parcelObtain.writeBundle(bundle);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        return bArrMarshall;
    }
}
