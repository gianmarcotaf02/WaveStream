package androidx.media;

/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesCompat implements C2.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f16384b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public androidx.media.AudioAttributesImpl f16385a;

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof androidx.media.AudioAttributesCompat)) {
            return false;
        }
        androidx.media.AudioAttributesCompat audioAttributesCompat = (androidx.media.AudioAttributesCompat) obj;
        androidx.media.AudioAttributesImpl audioAttributesImpl = this.f16385a;
        if (audioAttributesImpl == null) {
            return audioAttributesCompat.f16385a == null;
        }
        return audioAttributesImpl.equals(audioAttributesCompat.f16385a);
    }

    public final int hashCode() {
        return this.f16385a.hashCode();
    }

    public final java.lang.String toString() {
        return this.f16385a.toString();
    }
}
