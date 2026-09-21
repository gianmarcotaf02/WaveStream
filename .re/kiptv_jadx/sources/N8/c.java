package N8;

/* JADX INFO: loaded from: classes4.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final M8.C0685m f7475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final M8.C0685m f7476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final M8.C0685m f7477c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final M8.C0685m f7478d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final M8.C0685m f7479e;

    static {
        M8.C0685m c0685m = M8.C0685m.f7261k;
        f7475a = B3.o.j("/");
        f7476b = B3.o.j("\\");
        f7477c = B3.o.j("/\\");
        f7478d = B3.o.j(".");
        f7479e = B3.o.j("..");
    }

    public static final int a(M8.A a2) {
        if (a2.f7208h.d() != 0) {
            M8.C0685m c0685m = a2.f7208h;
            if (c0685m.i(0) != 47) {
                if (c0685m.i(0) == 92) {
                    if (c0685m.d() > 2 && c0685m.i(1) == 92) {
                        M8.C0685m other = f7476b;
                        kotlin.jvm.internal.m.e(other, "other");
                        int iF = c0685m.f(other.f7262h, 2);
                        return iF == -1 ? c0685m.d() : iF;
                    }
                } else if (c0685m.d() > 2 && c0685m.i(1) == 58 && c0685m.i(2) == 92) {
                    char cI = (char) c0685m.i(0);
                    if ('a' <= cI && cI < '{') {
                        return 3;
                    }
                    if ('A' <= cI && cI < '[') {
                        return 3;
                    }
                }
            }
            return 1;
        }
        return -1;
    }

    public static final M8.A b(M8.A a2, M8.A child, boolean z6) {
        kotlin.jvm.internal.m.e(a2, "<this>");
        kotlin.jvm.internal.m.e(child, "child");
        if (a(child) != -1 || child.h() != null) {
            return child;
        }
        M8.C0685m c0685mC = c(a2);
        if (c0685mC == null && (c0685mC = c(child)) == null) {
            c0685mC = f(M8.A.f7207i);
        }
        M8.C0682j c0682j = new M8.C0682j();
        c0682j.X(a2.f7208h);
        if (c0682j.f7260i > 0) {
            c0682j.X(c0685mC);
        }
        c0682j.X(child.f7208h);
        return d(c0682j, z6);
    }

    public static final M8.C0685m c(M8.A a2) {
        M8.C0685m c0685m = a2.f7208h;
        M8.C0685m c0685m2 = f7475a;
        if (M8.C0685m.g(c0685m, c0685m2) != -1) {
            return c0685m2;
        }
        M8.C0685m c0685m3 = f7476b;
        if (M8.C0685m.g(a2.f7208h, c0685m3) != -1) {
            return c0685m3;
        }
        return null;
    }

    public static final M8.A d(M8.C0682j c0682j, boolean z6) throws java.io.EOFException {
        long j;
        M8.C0685m c0685m;
        M8.C0685m c0685m2;
        char cI;
        M8.C0685m c0685m3;
        M8.C0685m c0685mZ;
        M8.C0682j c0682j2 = new M8.C0682j();
        M8.C0685m c0685mE = null;
        int i3 = 0;
        while (true) {
            j = 0;
            if (!c0682j.Q(0L, f7475a)) {
                c0685m = f7476b;
                if (!c0682j.Q(0L, c0685m)) {
                    break;
                }
            }
            byte b9 = c0682j.readByte();
            if (c0685mE == null) {
                c0685mE = e(b9);
            }
            i3++;
        }
        boolean z9 = i3 >= 2 && kotlin.jvm.internal.m.a(c0685mE, c0685m);
        M8.C0685m c0685m4 = f7477c;
        if (z9) {
            kotlin.jvm.internal.m.b(c0685mE);
            c0682j2.X(c0685mE);
            c0682j2.X(c0685mE);
        } else if (i3 > 0) {
            kotlin.jvm.internal.m.b(c0685mE);
            c0682j2.X(c0685mE);
        } else {
            long jH = c0682j.h(c0685m4);
            if (c0685mE == null) {
                c0685mE = jH == -1 ? f(M8.A.f7207i) : e(c0682j.i(jH));
            }
            if (kotlin.jvm.internal.m.a(c0685mE, c0685m)) {
                c0685m2 = c0685mE;
                if (c0682j.f7260i >= 2 && c0682j.i(1L) == 58 && (('a' <= (cI = (char) c0682j.i(0L)) && cI < '{') || ('A' <= cI && cI < '['))) {
                    if (jH == 2) {
                        c0682j2.J(3L, c0682j);
                    } else {
                        c0682j2.J(2L, c0682j);
                    }
                }
            } else {
                c0685m2 = c0685mE;
            }
            c0685mE = c0685m2;
        }
        boolean z10 = c0682j2.f7260i > 0;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (true) {
            boolean zO = c0682j.o();
            c0685m3 = f7478d;
            if (zO) {
                break;
            }
            long j9 = j;
            long jH2 = c0682j.h(c0685m4);
            if (jH2 == -1) {
                c0685mZ = c0682j.z(c0682j.f7260i);
            } else {
                c0685mZ = c0682j.z(jH2);
                c0682j.readByte();
            }
            M8.C0685m c0685m5 = f7479e;
            if (kotlin.jvm.internal.m.a(c0685mZ, c0685m5)) {
                if (!z10 || !arrayList.isEmpty()) {
                    if (!z6 || (!z10 && (arrayList.isEmpty() || kotlin.jvm.internal.m.a(p078i6.o.q1(arrayList), c0685m5)))) {
                        arrayList.add(c0685mZ);
                    } else if (!z9 || arrayList.size() != 1) {
                        p078i6.u.U0(arrayList);
                    }
                }
            } else if (!kotlin.jvm.internal.m.a(c0685mZ, c0685m3) && !kotlin.jvm.internal.m.a(c0685mZ, M8.C0685m.f7261k)) {
                arrayList.add(c0685mZ);
            }
            j = j9;
        }
        long j10 = j;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            if (i9 > 0) {
                c0682j2.X(c0685mE);
            }
            c0682j2.X((M8.C0685m) arrayList.get(i9));
        }
        if (c0682j2.f7260i == j10) {
            c0682j2.X(c0685m3);
        }
        return new M8.A(c0682j2.z(c0682j2.f7260i));
    }

    public static final M8.C0685m e(byte b9) {
        if (b9 == 47) {
            return f7475a;
        }
        if (b9 == 92) {
            return f7476b;
        }
        throw new java.lang.IllegalArgumentException(com.google.android.gms.internal.play_billing.M0.l(b9, "not a directory separator: "));
    }

    public static final M8.C0685m f(java.lang.String str) {
        if (kotlin.jvm.internal.m.a(str, "/")) {
            return f7475a;
        }
        if (kotlin.jvm.internal.m.a(str, "\\")) {
            return f7476b;
        }
        throw new java.lang.IllegalArgumentException(p121o0.p.C("not a directory separator: ", str));
    }
}
