package p099l5;

import Y6.f;
import kotlin.jvm.internal.m;

public final class u extends v {

    public final String f24795i;

    public u(String details) {
        super("Video stalled: ".concat(details));
        m.e(details, "details");
        this.f24795i = details;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && m.a(this.f24795i, ((u) obj).f24795i);
    }

    public final int hashCode() {
        return this.f24795i.hashCode();
    }

    @Override
    public final String toString() {
        return f.m(new StringBuilder("VideoStalled(details="), this.f24795i, ")");
    }
}
