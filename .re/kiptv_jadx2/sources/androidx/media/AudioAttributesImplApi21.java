package androidx.media;

import android.media.AudioAttributes;

public class AudioAttributesImplApi21 implements AudioAttributesImpl {

    public AudioAttributes f16386a;

    public int f16387b = -1;

    public final boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplApi21) {
            return this.f16386a.equals(((AudioAttributesImplApi21) obj).f16386a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f16386a.hashCode();
    }

    public final String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f16386a;
    }
}
