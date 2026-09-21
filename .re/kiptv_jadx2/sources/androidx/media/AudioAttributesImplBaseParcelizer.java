package androidx.media;

import C2.b;

public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(b bVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f16388a = bVar.f(audioAttributesImplBase.f16388a, 1);
        audioAttributesImplBase.f16389b = bVar.f(audioAttributesImplBase.f16389b, 2);
        audioAttributesImplBase.f16390c = bVar.f(audioAttributesImplBase.f16390c, 3);
        audioAttributesImplBase.f16391d = bVar.f(audioAttributesImplBase.f16391d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, b bVar) {
        bVar.getClass();
        bVar.j(audioAttributesImplBase.f16388a, 1);
        bVar.j(audioAttributesImplBase.f16389b, 2);
        bVar.j(audioAttributesImplBase.f16390c, 3);
        bVar.j(audioAttributesImplBase.f16391d, 4);
    }
}
