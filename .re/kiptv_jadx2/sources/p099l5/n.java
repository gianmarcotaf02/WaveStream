package p099l5;

import Y6.f;
import kotlin.jvm.internal.m;

public final class n extends v {

    public final String f24788i;

    public n(String str) {
        super(str);
        this.f24788i = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && m.a(this.f24788i, ((n) obj).f24788i);
    }

    public final int hashCode() {
        return this.f24788i.hashCode();
    }

    @Override
    public final String toString() {
        return f.m(new StringBuilder("EngineCrash(msg="), this.f24788i, ")");
    }
}
