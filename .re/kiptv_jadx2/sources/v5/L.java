package v5;

import Q0.C0768d;
import Q0.C0770e;
import kotlin.jvm.functions.Function0;
import p020c0.AbstractC1703s;
import p020c0.C1700q;
import p208z5.J1;

public abstract class L {
    public static String a(StringBuilder sb, boolean z6, char c9) {
        sb.append(z6);
        sb.append(c9);
        return sb.toString();
    }

    public static void b(int i3, C1700q c1700q, C0770e c0770e, C1700q c1700q2, C0768d c0768d) {
        AbstractC1703s.w(c1700q, Integer.valueOf(i3), c0770e);
        AbstractC1703s.D(c1700q2, c0768d);
    }

    public static void c(C1700q c1700q, String str, Function0 function0, int i3, p086j6.b bVar) {
        c1700q.p(false);
        bVar.add(new t5.P(str, function0, i3));
    }

    public static boolean d(C1700q c1700q, boolean z6, int i3, J1 j9) {
        c1700q.p(z6);
        c1700q.c0(i3);
        return c1700q.h(j9);
    }
}
