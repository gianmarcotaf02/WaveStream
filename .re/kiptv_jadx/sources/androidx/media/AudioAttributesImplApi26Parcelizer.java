package androidx.media;

/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplApi26Parcelizer {
    public static androidx.media.AudioAttributesImplApi26 read(C2.b bVar) {
        androidx.media.AudioAttributesImplApi26 audioAttributesImplApi26 = new androidx.media.AudioAttributesImplApi26();
        audioAttributesImplApi26.f16386a = (android.media.AudioAttributes) bVar.g(audioAttributesImplApi26.f16386a, 1);
        audioAttributesImplApi26.f16387b = bVar.f(audioAttributesImplApi26.f16387b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(androidx.media.AudioAttributesImplApi26 audioAttributesImplApi26, C2.b bVar) {
        bVar.getClass();
        bVar.k(audioAttributesImplApi26.f16386a, 1);
        bVar.j(audioAttributesImplApi26.f16387b, 2);
    }
}
