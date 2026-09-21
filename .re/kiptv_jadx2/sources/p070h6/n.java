package p070h6;

import java.io.Serializable;
import kotlin.jvm.internal.m;

public final class n implements Serializable {

    public final Object f22542h;

    public static final Throwable a(Object obj) {
        if (obj instanceof m) {
            return ((m) obj).f22541h;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            return m.a(this.f22542h, ((n) obj).f22542h);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f22542h;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f22542h;
        if (obj instanceof m) {
            return ((m) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
