package H6;

import java.lang.reflect.Type;
import java.util.Arrays;

public final class X implements Type {

    public final Type[] f4400a;

    public final int f4401b;

    public X(Type[] types) {
        kotlin.jvm.internal.m.e(types, "types");
        this.f4400a = types;
        this.f4401b = Arrays.hashCode(types);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof X) {
            return Arrays.equals(this.f4400a, ((X) obj).f4400a);
        }
        return false;
    }

    @Override
    public final String getTypeName() {
        return p078i6.m.v0(this.f4400a, ", ", "[", "]", null, 56);
    }

    public final int hashCode() {
        return this.f4401b;
    }

    public final String toString() {
        return getTypeName();
    }
}
