package p193x5;

import B2.a;
import kotlin.jvm.functions.Function0;
import p121o0.p;

public final class C3117g {

    public final String f31467a;

    public final String f31468b;

    public final boolean f31469c;

    public final Function0 f31470d;

    public C3117g(String str, String str2, boolean z6, Function0 function0) {
        this.f31467a = str;
        this.f31468b = str2;
        this.f31469c = z6;
        this.f31470d = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3117g)) {
            return false;
        }
        C3117g c3117g = (C3117g) obj;
        return this.f31467a.equals(c3117g.f31467a) && this.f31468b.equals(c3117g.f31468b) && this.f31469c == c3117g.f31469c && this.f31470d.equals(c3117g.f31470d);
    }

    public final int hashCode() {
        return this.f31470d.hashCode() + p.f(a.a(this.f31467a.hashCode() * 31, 31, this.f31468b), 31, this.f31469c);
    }

    public final String toString() {
        return "LiveGroupConfirmation(title=" + this.f31467a + ", message=" + this.f31468b + ", destructive=" + this.f31469c + ", action=" + this.f31470d + ")";
    }
}
