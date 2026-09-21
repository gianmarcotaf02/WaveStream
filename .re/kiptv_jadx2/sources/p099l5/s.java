package p099l5;

import Y6.f;
import kotlin.jvm.internal.m;

public final class s extends v {

    public final String f24793i;

    public s(String str) {
        super(str);
        this.f24793i = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s) && m.a(this.f24793i, ((s) obj).f24793i);
    }

    public final int hashCode() {
        return this.f24793i.hashCode();
    }

    @Override
    public final String toString() {
        return f.m(new StringBuilder("Unknown(msg="), this.f24793i, ")");
    }
}
