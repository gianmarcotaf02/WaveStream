package androidx.media;

/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesCompatParcelizer {
    public static androidx.media.AudioAttributesCompat read(C2.b bVar) {
        androidx.media.AudioAttributesCompat audioAttributesCompat = new androidx.media.AudioAttributesCompat();
        C2.d dVarH = audioAttributesCompat.f16385a;
        if (bVar.e(1)) {
            dVarH = bVar.h();
        }
        audioAttributesCompat.f16385a = (androidx.media.AudioAttributesImpl) dVarH;
        return audioAttributesCompat;
    }

    public static void write(androidx.media.AudioAttributesCompat audioAttributesCompat, C2.b bVar) {
        bVar.getClass();
        androidx.media.AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.f16385a;
        bVar.i(1);
        bVar.l(audioAttributesImpl);
    }
}
