package androidx.media;

/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplApi21 implements androidx.media.AudioAttributesImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public android.media.AudioAttributes f16386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f16387b = -1;

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof androidx.media.AudioAttributesImplApi21) {
            return this.f16386a.equals(((androidx.media.AudioAttributesImplApi21) obj).f16386a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f16386a.hashCode();
    }

    public final java.lang.String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f16386a;
    }
}
