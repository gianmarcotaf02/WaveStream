package p048f1;

import kotlin.jvm.internal.m;

public final class C2147e {

    public final y f21645a;

    public C2147e(y yVar) {
        this.f21645a = yVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2147e) {
            return m.a(this.f21645a, ((C2147e) obj).f21645a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f21645a.hashCode() * 31;
    }

    public final String toString() {
        return "Key(font=" + this.f21645a + ", loaderKey=null)";
    }
}
