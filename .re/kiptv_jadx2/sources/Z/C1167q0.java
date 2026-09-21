package Z;

public final class C1167q0 {

    public final String f12478a;

    public final int f12479b;

    public C1167q0(String str, int i3) {
        this.f12478a = str;
        this.f12479b = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1167q0.class != obj.getClass()) {
            return false;
        }
        C1167q0 c1167q0 = (C1167q0) obj;
        return kotlin.jvm.internal.m.a(this.f12478a, c1167q0.f12478a) && this.f12479b == c1167q0.f12479b;
    }

    public final int hashCode() {
        return AbstractC1149h0.c(this.f12479b) + p121o0.p.f(this.f12478a.hashCode() * 961, 31, false);
    }
}
