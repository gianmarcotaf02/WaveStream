package androidx.media;

import C2.d;
import android.util.SparseIntArray;

public class AudioAttributesCompat implements d {

    public static final int f16384b = 0;

    public AudioAttributesImpl f16385a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesCompat)) {
            return false;
        }
        AudioAttributesCompat audioAttributesCompat = (AudioAttributesCompat) obj;
        AudioAttributesImpl audioAttributesImpl = this.f16385a;
        if (audioAttributesImpl == null) {
            return audioAttributesCompat.f16385a == null;
        }
        return audioAttributesImpl.equals(audioAttributesCompat.f16385a);
    }

    public final int hashCode() {
        return this.f16385a.hashCode();
    }

    public final String toString() {
        return this.f16385a.toString();
    }
}
