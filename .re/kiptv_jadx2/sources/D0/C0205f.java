package D0;

import p188x0.C3098s;

public final class C0205f {

    public static int f1874k;

    public static final B3.o f1875l = new B3.o(8);

    public final String f1876a;

    public final float f1877b;

    public final float f1878c;

    public final float f1879d;

    public final float f1880e;

    public final H f1881f;
    public final long g;

    public final int f1882h;

    public final boolean f1883i;
    public final int j;

    public C0205f(String str, float f9, float f10, float f11, float f12, H h9, long j, int i3, boolean z6) {
        int i9;
        synchronized (f1875l) {
            i9 = f1874k;
            f1874k = i9 + 1;
        }
        this.f1876a = str;
        this.f1877b = f9;
        this.f1878c = f10;
        this.f1879d = f11;
        this.f1880e = f12;
        this.f1881f = h9;
        this.g = j;
        this.f1882h = i3;
        this.f1883i = z6;
        this.j = i9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0205f)) {
            return false;
        }
        C0205f c0205f = (C0205f) obj;
        return kotlin.jvm.internal.m.a(this.f1876a, c0205f.f1876a) && p113n1.f.c(this.f1877b, c0205f.f1877b) && p113n1.f.c(this.f1878c, c0205f.f1878c) && this.f1879d == c0205f.f1879d && this.f1880e == c0205f.f1880e && this.f1881f.equals(c0205f.f1881f) && C3098s.d(this.g, c0205f.g) && this.f1882h == c0205f.f1882h && this.f1883i == c0205f.f1883i;
    }

    public final int hashCode() {
        int iHashCode = (this.f1881f.hashCode() + p121o0.p.c(this.f1880e, p121o0.p.c(this.f1879d, p121o0.p.c(this.f1878c, p121o0.p.c(this.f1877b, this.f1876a.hashCode() * 31, 31), 31), 31), 31)) * 31;
        int i3 = C3098s.f31128h;
        return Boolean.hashCode(this.f1883i) + p121o0.p.d(this.f1882h, p121o0.p.e(iHashCode, 31, this.g), 31);
    }
}
