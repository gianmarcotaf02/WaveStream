package p070h6;

import java.io.Serializable;

public final class m implements Serializable {

    public final Throwable f22541h;

    public m(Throwable exception) {
        kotlin.jvm.internal.m.e(exception, "exception");
        this.f22541h = exception;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            return kotlin.jvm.internal.m.a(this.f22541h, ((m) obj).f22541h);
        }
        return false;
    }

    public final int hashCode() {
        return this.f22541h.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f22541h + ')';
    }
}
