package v5;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class L {
    public static java.lang.String a(java.lang.StringBuilder sb, boolean z6, char c9) {
        sb.append(z6);
        sb.append(c9);
        return sb.toString();
    }

    public static void b(int i3, p020c0.C1700q c1700q, Q0.C0770e c0770e, p020c0.C1700q c1700q2, Q0.C0768d c0768d) {
        p020c0.AbstractC1703s.w(c1700q, java.lang.Integer.valueOf(i3), c0770e);
        p020c0.AbstractC1703s.D(c1700q2, c0768d);
    }

    public static void c(p020c0.C1700q c1700q, java.lang.String str, kotlin.jvm.functions.Function0 function0, int i3, p086j6.b bVar) {
        c1700q.p(false);
        bVar.add(new t5.P(str, function0, i3));
    }

    public static boolean d(p020c0.C1700q c1700q, boolean z6, int i3, p208z5.J1 j9) {
        c1700q.p(z6);
        c1700q.c0(i3);
        return c1700q.h(j9);
    }
}
