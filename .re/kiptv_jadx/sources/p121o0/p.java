package p121o0;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class p {
    public static void A(java.lang.Number number, p154s.C2724j c2724j, java.lang.String str, p114n2.C2650i c2650i, java.lang.String str2) {
        number.intValue();
        kotlin.jvm.internal.m.e(c2724j, str);
        kotlin.jvm.internal.m.e(c2650i, str2);
    }

    public static boolean B(p020c0.C1700q c1700q, boolean z6, int i3, p114n2.y yVar) {
        c1700q.p(z6);
        c1700q.c0(i3);
        return c1700q.h(yVar);
    }

    public static java.lang.String C(java.lang.String str, java.lang.String str2) {
        return str + str2;
    }

    public static final boolean a(int i3) {
        return !p158s4.a.a();
    }

    public static final boolean b(int i3) {
        java.lang.Boolean bool;
        if (p158s4.a.a()) {
            try {
                bool = (java.lang.Boolean) java.lang.Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", null).invoke(null, null);
            } catch (java.lang.Exception unused) {
                p158s4.a.f27265a.info("Conscrypt is not available or does not support checking for FIPS build.");
                bool = java.lang.Boolean.FALSE;
            }
            if (!bool.booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static int c(float f9, int i3, int i9) {
        return (java.lang.Float.hashCode(f9) + i3) * i9;
    }

    public static int d(int i3, int i9, int i10) {
        return (java.lang.Integer.hashCode(i3) + i9) * i10;
    }

    public static int e(int i3, int i9, long j) {
        return (java.lang.Long.hashCode(j) + i3) * i9;
    }

    public static int f(int i3, int i9, boolean z6) {
        return (java.lang.Boolean.hashCode(z6) + i3) * i9;
    }

    public static int g(java.util.Set set, int i3, int i9) {
        return (set.hashCode() + i3) * i9;
    }

    public static I3.b h(java.lang.String str) {
        N0.a.c(str);
        return new I3.b();
    }

    public static java.lang.ClassCastException i(java.lang.Object obj) {
        obj.getClass();
        return new java.lang.ClassCastException();
    }

    public static java.lang.Integer j(p020c0.C1700q c1700q, O0.S s9, p020c0.C1700q c1700q2, p020c0.InterfaceC1691l0 interfaceC1691l0, int i3) {
        p020c0.AbstractC1703s.H(c1700q, s9, Q0.C0772f.f8427e);
        p020c0.AbstractC1703s.H(c1700q2, interfaceC1691l0, Q0.C0772f.f8426d);
        return java.lang.Integer.valueOf(i3);
    }

    public static java.lang.Object k(int i3, p020c0.C1700q c1700q) {
        c1700q.p(false);
        c1700q.c0(i3);
        return c1700q.Q();
    }

    public static java.lang.Object l(p020c0.C1700q c1700q, boolean z6, int i3, p020c0.X x9) {
        c1700q.p(z6);
        c1700q.c0(i3);
        return x9.getValue();
    }

    public static java.lang.String m(p020c0.C1700q c1700q, int i3, java.lang.String str, int i9) {
        c1700q.c0(i3);
        java.lang.String strA = p015b5.u.a(str);
        c1700q.c0(i9);
        return strA;
    }

    public static java.lang.String n(java.lang.Object obj, java.lang.String str) {
        return (str + obj).toString();
    }

    public static java.lang.String o(java.lang.String str, java.lang.String str2) {
        return str + str2;
    }

    public static java.lang.String p(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return str + str2 + str3;
    }

    public static java.lang.String q(java.lang.StringBuilder sb, float f9, char c9) {
        sb.append(f9);
        sb.append(c9);
        return sb.toString();
    }

    public static java.lang.String r(java.lang.StringBuilder sb, java.util.Map map, char c9) {
        sb.append(map);
        sb.append(c9);
        return sb.toString();
    }

    public static java.lang.StringBuilder s(int i3, int i9, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str);
        sb.append(i3);
        sb.append(str2);
        sb.append(i9);
        sb.append(str3);
        return sb;
    }

    public static java.lang.StringBuilder t(int i3, java.lang.String str, java.lang.String str2) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str);
        sb.append(i3);
        sb.append(str2);
        return sb;
    }

    public static java.lang.StringBuilder u(long j, java.lang.String str, java.lang.String str2) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str);
        sb.append(j);
        sb.append(str2);
        return sb;
    }

    public static java.lang.StringBuilder v(java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        return sb;
    }

    public static void w(int i3, p020c0.C1700q c1700q, Q0.C0770e c0770e, p020c0.C1700q c1700q2, Q0.C0768d c0768d) {
        p020c0.AbstractC1703s.w(c1700q, java.lang.Integer.valueOf(i3), c0770e);
        p020c0.AbstractC1703s.D(c1700q2, c0768d);
    }

    public static void x(long j, java.lang.String str, java.lang.StringBuilder sb) {
        sb.append((java.lang.Object) p188x0.C3098s.j(j));
        sb.append(str);
    }

    public static void y(p020c0.C1700q c1700q, java.lang.Integer num, p020c0.C1700q c1700q2, p020c0.C1700q c1700q3, p137q0.p pVar) {
        p020c0.AbstractC1703s.w(c1700q, num, Q0.C0772f.f8428f);
        p020c0.AbstractC1703s.D(c1700q2, Q0.C0772f.g);
        p020c0.AbstractC1703s.H(c1700q3, pVar, Q0.C0772f.f8425c);
    }

    public static void z(j1.l lVar, long j) {
        lVar.j().p();
        lVar.A(j);
    }
}
