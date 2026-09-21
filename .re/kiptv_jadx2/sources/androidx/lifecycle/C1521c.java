package androidx.lifecycle;

import java.lang.reflect.Method;

public final class C1521c {

    public final int f16340a;

    public final Method f16341b;

    public C1521c(int i3, Method method) {
        this.f16340a = i3;
        this.f16341b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1521c)) {
            return false;
        }
        C1521c c1521c = (C1521c) obj;
        return this.f16340a == c1521c.f16340a && this.f16341b.getName().equals(c1521c.f16341b.getName());
    }

    public final int hashCode() {
        return this.f16341b.getName().hashCode() + (this.f16340a * 31);
    }
}
