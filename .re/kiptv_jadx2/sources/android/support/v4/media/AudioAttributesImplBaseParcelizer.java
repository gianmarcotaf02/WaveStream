package android.support.v4.media;

import androidx.media.AudioAttributesImplBase;

public final class AudioAttributesImplBaseParcelizer extends androidx.media.AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(C2.b bVar) {
        return androidx.media.AudioAttributesImplBaseParcelizer.read(bVar);
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, C2.b bVar) {
        androidx.media.AudioAttributesImplBaseParcelizer.write(audioAttributesImplBase, bVar);
    }
}
