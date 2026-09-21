package p099l5;

import Y6.f;
import kotlin.jvm.internal.m;

public final class t extends v {

    public final String f24794i;

    public t(String str) {
        super("Unsupported format: ".concat(str));
        this.f24794i = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t) && m.a(this.f24794i, ((t) obj).f24794i);
    }

    public final int hashCode() {
        return this.f24794i.hashCode();
    }

    @Override
    public final String toString() {
        return f.m(new StringBuilder("UnsupportedFormat(format="), this.f24794i, ")");
    }
}
