package p121o0;

import I3.b;
import O0.S;
import Q0.C0768d;
import Q0.C0770e;
import Q0.C0772f;
import j1.l;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.m;
import p015b5.u;
import p020c0.AbstractC1703s;
import p020c0.C1700q;
import p020c0.InterfaceC1691l0;
import p020c0.X;
import p114n2.C2650i;
import p114n2.y;
import p154s.C2724j;
import p158s4.a;
import p188x0.C3098s;

public abstract class p {
    public static void A(Number number, C2724j c2724j, String str, C2650i c2650i, String str2) {
        number.intValue();
        m.e(c2724j, str);
        m.e(c2650i, str2);
    }

    public static boolean B(C1700q c1700q, boolean z6, int i3, y yVar) {
        c1700q.p(z6);
        c1700q.c0(i3);
        return c1700q.h(yVar);
    }

    public static String C(String str, String str2) {
        return str + str2;
    }

    public static final boolean a(int i3) {
        return !a.a();
    }

    public static final boolean b(int i3) {
        Boolean bool;
        if (a.a()) {
            try {
                bool = (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", null).invoke(null, null);
            } catch (Exception unused) {
                a.f27265a.info("Conscrypt is not available or does not support checking for FIPS build.");
                bool = Boolean.FALSE;
            }
            if (!bool.booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static int c(float f9, int i3, int i9) {
        return (Float.hashCode(f9) + i3) * i9;
    }

    public static int d(int i3, int i9, int i10) {
        return (Integer.hashCode(i3) + i9) * i10;
    }

    public static int e(int i3, int i9, long j) {
        return (Long.hashCode(j) + i3) * i9;
    }

    public static int f(int i3, int i9, boolean z6) {
        return (Boolean.hashCode(z6) + i3) * i9;
    }

    public static int g(Set set, int i3, int i9) {
        return (set.hashCode() + i3) * i9;
    }

    public static b h(String str) {
        N0.a.c(str);
        return new b();
    }

    public static ClassCastException i(Object obj) {
        obj.getClass();
        return new ClassCastException();
    }

    public static Integer j(C1700q c1700q, S s9, C1700q c1700q2, InterfaceC1691l0 interfaceC1691l0, int i3) {
        AbstractC1703s.H(c1700q, s9, C0772f.f8427e);
        AbstractC1703s.H(c1700q2, interfaceC1691l0, C0772f.f8426d);
        return Integer.valueOf(i3);
    }

    public static Object k(int i3, C1700q c1700q) {
        c1700q.p(false);
        c1700q.c0(i3);
        return c1700q.Q();
    }

    public static Object l(C1700q c1700q, boolean z6, int i3, X x9) {
        c1700q.p(z6);
        c1700q.c0(i3);
        return x9.getValue();
    }

    public static String m(C1700q c1700q, int i3, String str, int i9) {
        c1700q.c0(i3);
        String strA = u.a(str);
        c1700q.c0(i9);
        return strA;
    }

    public static String n(Object obj, String str) {
        return (str + obj).toString();
    }

    public static String o(String str, String str2) {
        return str + str2;
    }

    public static String p(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String q(StringBuilder sb, float f9, char c9) {
        sb.append(f9);
        sb.append(c9);
        return sb.toString();
    }

    public static String r(StringBuilder sb, Map map, char c9) {
        sb.append(map);
        sb.append(c9);
        return sb.toString();
    }

    public static StringBuilder s(int i3, int i9, String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i3);
        sb.append(str2);
        sb.append(i9);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder t(int i3, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i3);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder u(long j, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(j);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder v(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }

    public static void w(int i3, C1700q c1700q, C0770e c0770e, C1700q c1700q2, C0768d c0768d) {
        AbstractC1703s.w(c1700q, Integer.valueOf(i3), c0770e);
        AbstractC1703s.D(c1700q2, c0768d);
    }

    public static void x(long j, String str, StringBuilder sb) {
        sb.append((Object) C3098s.j(j));
        sb.append(str);
    }

    public static void y(C1700q c1700q, Integer num, C1700q c1700q2, C1700q c1700q3, p137q0.p pVar) {
        AbstractC1703s.w(c1700q, num, C0772f.f8428f);
        AbstractC1703s.D(c1700q2, C0772f.g);
        AbstractC1703s.H(c1700q3, pVar, C0772f.f8425c);
    }

    public static void z(l lVar, long j) {
        lVar.j().p();
        lVar.A(j);
    }
}
