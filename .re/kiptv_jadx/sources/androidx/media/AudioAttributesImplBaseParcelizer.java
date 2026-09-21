package androidx.media;

/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplBaseParcelizer {
    public static androidx.media.AudioAttributesImplBase read(C2.b bVar) {
        androidx.media.AudioAttributesImplBase audioAttributesImplBase = new androidx.media.AudioAttributesImplBase();
        audioAttributesImplBase.f16388a = bVar.f(audioAttributesImplBase.f16388a, 1);
        audioAttributesImplBase.f16389b = bVar.f(audioAttributesImplBase.f16389b, 2);
        audioAttributesImplBase.f16390c = bVar.f(audioAttributesImplBase.f16390c, 3);
        audioAttributesImplBase.f16391d = bVar.f(audioAttributesImplBase.f16391d, 4);
        return audioAttributesImplBase;
    }

    public static void write(androidx.media.AudioAttributesImplBase audioAttributesImplBase, C2.b bVar) {
        bVar.getClass();
        bVar.j(audioAttributesImplBase.f16388a, 1);
        bVar.j(audioAttributesImplBase.f16389b, 2);
        bVar.j(audioAttributesImplBase.f16390c, 3);
        bVar.j(audioAttributesImplBase.f16391d, 4);
    }
}
