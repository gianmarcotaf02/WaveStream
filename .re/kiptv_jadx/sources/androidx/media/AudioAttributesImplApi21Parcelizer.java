package androidx.media;

/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplApi21Parcelizer {
    public static androidx.media.AudioAttributesImplApi21 read(C2.b bVar) {
        androidx.media.AudioAttributesImplApi21 audioAttributesImplApi21 = new androidx.media.AudioAttributesImplApi21();
        audioAttributesImplApi21.f16386a = (android.media.AudioAttributes) bVar.g(audioAttributesImplApi21.f16386a, 1);
        audioAttributesImplApi21.f16387b = bVar.f(audioAttributesImplApi21.f16387b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(androidx.media.AudioAttributesImplApi21 audioAttributesImplApi21, C2.b bVar) {
        bVar.getClass();
        bVar.k(audioAttributesImplApi21.f16386a, 1);
        bVar.j(audioAttributesImplApi21.f16387b, 2);
    }
}
