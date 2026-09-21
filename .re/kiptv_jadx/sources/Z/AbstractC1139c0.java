package Z;

/* JADX INFO: renamed from: Z.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1139c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p020c0.f1 f12370a = new p020c0.f1(Z.C1172u.f12548p);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p020c0.C f12371b = new p020c0.C(Z.C1172u.f12547o);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final androidx.compose.material3.c f12372c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final androidx.compose.material3.c f12373d;

    static {
        long j = p188x0.C3098s.g;
        f12372c = new androidx.compose.material3.c(true, Float.NaN, j);
        f12373d = new androidx.compose.material3.c(false, Float.NaN, j);
    }

    public static final v.InterfaceC2874b0 a(float f9, p020c0.C1700q c1700q, int i3, int i9) {
        v.InterfaceC2874b0 cVar;
        boolean z6 = true;
        boolean z9 = (i9 & 1) != 0;
        if ((i9 & 2) != 0) {
            f9 = Float.NaN;
        }
        long j = p188x0.C3098s.g;
        c1700q.c0(-1280632857);
        if (((java.lang.Boolean) c1700q.j(f12370a)).booleanValue()) {
            p163t.D0 d4 = Y.u.f11016a;
            p020c0.X xF = p020c0.AbstractC1703s.F(new p188x0.C3098s(j), c1700q);
            boolean z10 = (((i3 & 14) ^ 6) > 4 && c1700q.g(z9)) || (i3 & 6) == 4;
            if ((((i3 & 112) ^ 48) <= 32 || !c1700q.c(f9)) && (i3 & 48) != 32) {
                z6 = false;
            }
            boolean z11 = z10 | z6;
            java.lang.Object objQ = c1700q.Q();
            if (z11 || objQ == p020c0.C1690l.f18284a) {
                objQ = new Y.f(z9, f9, xF);
                c1700q.n0(objQ);
            }
            cVar = (Y.f) objQ;
        } else if (p113n1.f.c(f9, Float.NaN) && p188x0.C3098s.d(j, j)) {
            cVar = z9 ? f12372c : f12373d;
        } else {
            cVar = new androidx.compose.material3.c(z9, f9, j);
        }
        c1700q.p(false);
        return cVar;
    }
}
