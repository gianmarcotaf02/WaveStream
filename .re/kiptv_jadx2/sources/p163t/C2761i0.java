package p163t;

import kotlin.jvm.internal.m;
import p008a8.c;
import p121o0.p;

public final class C2761i0 implements A {

    public final float f27616a;

    public final float f27617b;

    public final Object f27618c;

    public C2761i0(float f9, float f10, Object obj) {
        this.f27616a = f9;
        this.f27617b = f10;
        this.f27618c = obj;
    }

    @Override
    public final G0 a(E0 e6) {
        Object obj = this.f27618c;
        return new c(this.f27616a, this.f27617b, obj == null ? null : (r) e6.f27453a.invoke(obj));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2761i0) {
            C2761i0 c2761i0 = (C2761i0) obj;
            if (c2761i0.f27616a == this.f27616a && c2761i0.f27617b == this.f27617b && m.a(c2761i0.f27618c, this.f27618c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f27618c;
        return Float.hashCode(this.f27617b) + p.c(this.f27616a, (obj != null ? obj.hashCode() : 0) * 31, 31);
    }

    public C2761i0(Object obj) {
        this(1.0f, 1500.0f, obj);
    }
}
