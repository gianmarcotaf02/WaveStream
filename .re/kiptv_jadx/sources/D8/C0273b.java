package D8;

/* JADX INFO: renamed from: D8.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0273b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final M8.C0685m f2503d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final M8.C0685m f2504e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final M8.C0685m f2505f;
    public static final M8.C0685m g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final M8.C0685m f2506h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final M8.C0685m f2507i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final M8.C0685m f2508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final M8.C0685m f2509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2510c;

    static {
        M8.C0685m c0685m = M8.C0685m.f7261k;
        f2503d = B3.o.j(":");
        f2504e = B3.o.j(":status");
        f2505f = B3.o.j(":method");
        g = B3.o.j(":path");
        f2506h = B3.o.j(":scheme");
        f2507i = B3.o.j(":authority");
    }

    public C0273b(M8.C0685m name, M8.C0685m value) {
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(value, "value");
        this.f2508a = name;
        this.f2509b = value;
        this.f2510c = value.d() + name.d() + 32;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D8.C0273b)) {
            return false;
        }
        D8.C0273b c0273b = (D8.C0273b) obj;
        return kotlin.jvm.internal.m.a(this.f2508a, c0273b.f2508a) && kotlin.jvm.internal.m.a(this.f2509b, c0273b.f2509b);
    }

    public final int hashCode() {
        return this.f2509b.hashCode() + (this.f2508a.hashCode() * 31);
    }

    public final java.lang.String toString() {
        return this.f2508a.r() + ": " + this.f2509b.r();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0273b(java.lang.String name, java.lang.String value) {
        this(B3.o.j(name), B3.o.j(value));
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(value, "value");
        M8.C0685m c0685m = M8.C0685m.f7261k;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0273b(M8.C0685m name, java.lang.String value) {
        this(name, B3.o.j(value));
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(value, "value");
        M8.C0685m c0685m = M8.C0685m.f7261k;
    }
}
