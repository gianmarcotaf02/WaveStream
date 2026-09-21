package D8;

import M8.C0685m;

public final class C0273b {

    public static final C0685m f2503d;

    public static final C0685m f2504e;

    public static final C0685m f2505f;
    public static final C0685m g;

    public static final C0685m f2506h;

    public static final C0685m f2507i;

    public final C0685m f2508a;

    public final C0685m f2509b;

    public final int f2510c;

    static {
        C0685m c0685m = C0685m.f7261k;
        f2503d = B3.o.j(":");
        f2504e = B3.o.j(":status");
        f2505f = B3.o.j(":method");
        g = B3.o.j(":path");
        f2506h = B3.o.j(":scheme");
        f2507i = B3.o.j(":authority");
    }

    public C0273b(C0685m name, C0685m value) {
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(value, "value");
        this.f2508a = name;
        this.f2509b = value;
        this.f2510c = value.d() + name.d() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0273b)) {
            return false;
        }
        C0273b c0273b = (C0273b) obj;
        return kotlin.jvm.internal.m.a(this.f2508a, c0273b.f2508a) && kotlin.jvm.internal.m.a(this.f2509b, c0273b.f2509b);
    }

    public final int hashCode() {
        return this.f2509b.hashCode() + (this.f2508a.hashCode() * 31);
    }

    public final String toString() {
        return this.f2508a.r() + ": " + this.f2509b.r();
    }

    public C0273b(String name, String value) {
        this(B3.o.j(name), B3.o.j(value));
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(value, "value");
        C0685m c0685m = C0685m.f7261k;
    }

    public C0273b(C0685m name, String value) {
        this(name, B3.o.j(value));
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(value, "value");
        C0685m c0685m = C0685m.f7261k;
    }
}
