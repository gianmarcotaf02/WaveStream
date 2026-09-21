package p076i4;

import androidx.media3.exoplayer.trackselection.a;
import java.io.Serializable;

public final class G extends O0 implements Serializable {

    public final a f22798h;

    public G(a aVar) {
        this.f22798h = aVar;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        return this.f22798h.compare(obj, obj2);
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof G) {
            return this.f22798h.equals(((G) obj).f22798h);
        }
        return false;
    }

    public final int hashCode() {
        return this.f22798h.hashCode();
    }

    public final String toString() {
        return this.f22798h.toString();
    }
}
