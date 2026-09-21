package p005a5;

import Y6.f;
import kotlin.jvm.internal.m;

public final class U1 {

    public final String f13960a;

    public U1(String str) {
        this.f13960a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof U1) && m.a(this.f13960a, ((U1) obj).f13960a);
    }

    public final int hashCode() {
        String str = this.f13960a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return f.m(new StringBuilder("Optional(url="), this.f13960a, ")");
    }
}
