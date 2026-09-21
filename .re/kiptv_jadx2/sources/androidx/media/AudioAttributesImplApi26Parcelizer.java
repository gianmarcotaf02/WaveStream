package androidx.media;

import C2.b;
import android.media.AudioAttributes;

public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(b bVar) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.f16386a = (AudioAttributes) bVar.g(audioAttributesImplApi26.f16386a, 1);
        audioAttributesImplApi26.f16387b = bVar.f(audioAttributesImplApi26.f16387b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, b bVar) {
        bVar.getClass();
        bVar.k(audioAttributesImplApi26.f16386a, 1);
        bVar.j(audioAttributesImplApi26.f16387b, 2);
    }
}
