package M8;

/* JADX INFO: loaded from: classes4.dex */
public final class A implements java.lang.Comparable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final java.lang.String f7207i;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final M8.C0685m f7208h;

    static {
        java.lang.String separator = java.io.File.separator;
        kotlin.jvm.internal.m.d(separator, "separator");
        f7207i = separator;
    }

    public A(M8.C0685m bytes) {
        kotlin.jvm.internal.m.e(bytes, "bytes");
        this.f7208h = bytes;
    }

    public final java.util.ArrayList a() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int iA = N8.c.a(this);
        M8.C0685m c0685m = this.f7208h;
        if (iA == -1) {
            iA = 0;
        } else if (iA < c0685m.d() && c0685m.i(iA) == 92) {
            iA++;
        }
        int iD = c0685m.d();
        int i3 = iA;
        while (iA < iD) {
            if (c0685m.i(iA) == 47 || c0685m.i(iA) == 92) {
                arrayList.add(c0685m.n(i3, iA));
                i3 = iA + 1;
            }
            iA++;
        }
        if (i3 < c0685m.d()) {
            arrayList.add(c0685m.n(i3, c0685m.d()));
        }
        return arrayList;
    }

    public final java.lang.String b() {
        M8.C0685m c0685m = N8.c.f7475a;
        M8.C0685m c0685m2 = N8.c.f7475a;
        M8.C0685m c0685mO = this.f7208h;
        int iK = M8.C0685m.k(c0685mO, c0685m2);
        if (iK == -1) {
            iK = M8.C0685m.k(c0685mO, N8.c.f7476b);
        }
        if (iK != -1) {
            c0685mO = M8.C0685m.o(c0685mO, iK + 1, 0, 2);
        } else if (h() != null && c0685mO.d() == 2) {
            c0685mO = M8.C0685m.f7261k;
        }
        return c0685mO.r();
    }

    public final M8.A c() {
        M8.C0685m c0685m = N8.c.f7478d;
        M8.C0685m c0685m2 = this.f7208h;
        if (kotlin.jvm.internal.m.a(c0685m2, c0685m)) {
            return null;
        }
        M8.C0685m c0685m3 = N8.c.f7475a;
        if (kotlin.jvm.internal.m.a(c0685m2, c0685m3)) {
            return null;
        }
        M8.C0685m prefix = N8.c.f7476b;
        if (kotlin.jvm.internal.m.a(c0685m2, prefix)) {
            return null;
        }
        M8.C0685m suffix = N8.c.f7479e;
        c0685m2.getClass();
        kotlin.jvm.internal.m.e(suffix, "suffix");
        int iD = c0685m2.d();
        byte[] bArr = suffix.f7262h;
        if (c0685m2.m(iD - bArr.length, suffix, bArr.length) && (c0685m2.d() == 2 || c0685m2.m(c0685m2.d() - 3, c0685m3, 1) || c0685m2.m(c0685m2.d() - 3, prefix, 1))) {
            return null;
        }
        int iK = M8.C0685m.k(c0685m2, c0685m3);
        if (iK == -1) {
            iK = M8.C0685m.k(c0685m2, prefix);
        }
        if (iK == 2 && h() != null) {
            if (c0685m2.d() == 3) {
                return null;
            }
            return new M8.A(M8.C0685m.o(c0685m2, 0, 3, 1));
        }
        if (iK == 1) {
            kotlin.jvm.internal.m.e(prefix, "prefix");
            if (c0685m2.m(0, prefix, prefix.d())) {
                return null;
            }
        }
        if (iK != -1 || h() == null) {
            if (iK == -1) {
                return new M8.A(c0685m);
            }
            return iK == 0 ? new M8.A(M8.C0685m.o(c0685m2, 0, 1, 1)) : new M8.A(M8.C0685m.o(c0685m2, 0, iK, 1));
        }
        if (c0685m2.d() == 2) {
            return null;
        }
        return new M8.A(M8.C0685m.o(c0685m2, 0, 2, 1));
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object obj) {
        M8.A other = (M8.A) obj;
        kotlin.jvm.internal.m.e(other, "other");
        return this.f7208h.compareTo(other.f7208h);
    }

    public final M8.A d(M8.A other) {
        kotlin.jvm.internal.m.e(other, "other");
        int iA = N8.c.a(this);
        M8.C0685m c0685m = this.f7208h;
        M8.A a2 = iA == -1 ? null : new M8.A(c0685m.n(0, iA));
        int iA2 = N8.c.a(other);
        M8.C0685m c0685m2 = other.f7208h;
        if (!kotlin.jvm.internal.m.a(a2, iA2 != -1 ? new M8.A(c0685m2.n(0, iA2)) : null)) {
            throw new java.lang.IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + this + " and " + other).toString());
        }
        java.util.ArrayList arrayListA = a();
        java.util.ArrayList arrayListA2 = other.a();
        int iMin = java.lang.Math.min(arrayListA.size(), arrayListA2.size());
        int i3 = 0;
        while (i3 < iMin && kotlin.jvm.internal.m.a(arrayListA.get(i3), arrayListA2.get(i3))) {
            i3++;
        }
        if (i3 == iMin && c0685m.d() == c0685m2.d()) {
            return B3.o.k(".", false);
        }
        if (arrayListA2.subList(i3, arrayListA2.size()).indexOf(N8.c.f7479e) != -1) {
            throw new java.lang.IllegalArgumentException(("Impossible relative path to resolve: " + this + " and " + other).toString());
        }
        if (kotlin.jvm.internal.m.a(c0685m2, N8.c.f7478d)) {
            return this;
        }
        M8.C0682j c0682j = new M8.C0682j();
        M8.C0685m c0685mC = N8.c.c(other);
        if (c0685mC == null && (c0685mC = N8.c.c(this)) == null) {
            c0685mC = N8.c.f(f7207i);
        }
        int size = arrayListA2.size();
        for (int i9 = i3; i9 < size; i9++) {
            c0682j.X(N8.c.f7479e);
            c0682j.X(c0685mC);
        }
        int size2 = arrayListA.size();
        while (i3 < size2) {
            c0682j.X((M8.C0685m) arrayListA.get(i3));
            c0682j.X(c0685mC);
            i3++;
        }
        return N8.c.d(c0682j, false);
    }

    public final M8.A e(java.lang.String child) {
        kotlin.jvm.internal.m.e(child, "child");
        M8.C0682j c0682j = new M8.C0682j();
        c0682j.d0(child);
        return N8.c.b(this, N8.c.d(c0682j, false), false);
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof M8.A) && kotlin.jvm.internal.m.a(((M8.A) obj).f7208h, this.f7208h);
    }

    public final java.io.File f() {
        return new java.io.File(this.f7208h.r());
    }

    public final java.nio.file.Path g() {
        java.nio.file.Path path = java.nio.file.Paths.get(this.f7208h.r(), new java.lang.String[0]);
        kotlin.jvm.internal.m.d(path, "get(...)");
        return path;
    }

    public final java.lang.Character h() {
        M8.C0685m c0685m = N8.c.f7475a;
        M8.C0685m c0685m2 = this.f7208h;
        if (M8.C0685m.g(c0685m2, c0685m) != -1 || c0685m2.d() < 2 || c0685m2.i(1) != 58) {
            return null;
        }
        char cI = (char) c0685m2.i(0);
        if (('a' > cI || cI >= '{') && ('A' > cI || cI >= '[')) {
            return null;
        }
        return java.lang.Character.valueOf(cI);
    }

    public final int hashCode() {
        return this.f7208h.hashCode();
    }

    public final java.lang.String toString() {
        return this.f7208h.r();
    }
}
