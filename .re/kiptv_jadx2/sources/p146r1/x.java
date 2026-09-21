package p146r1;

import p121o0.p;

public final class x {

    public final boolean f26783a;

    public final boolean f26784b;

    public final G f26785c;

    public final boolean f26786d;

    public final boolean f26787e;

    public final String f26788f;

    public x(int i3) {
        this(true, (i3 & 2) != 0, (i3 & 4) != 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.f26783a == xVar.f26783a && this.f26784b == xVar.f26784b && this.f26785c == xVar.f26785c && this.f26786d == xVar.f26786d && this.f26787e == xVar.f26787e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f26787e) + p.f((this.f26785c.hashCode() + p.f(Boolean.hashCode(this.f26783a) * 31, 31, this.f26784b)) * 31, 31, this.f26786d);
    }

    public x(boolean z6, boolean z9, boolean z10) {
        G g = G.f26720h;
        this.f26783a = z6;
        this.f26784b = z9;
        this.f26785c = g;
        this.f26786d = z10;
        this.f26787e = true;
        this.f26788f = "";
    }
}
