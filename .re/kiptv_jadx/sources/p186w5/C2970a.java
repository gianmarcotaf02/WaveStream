package p186w5;

/* JADX INFO: renamed from: w5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2970a implements p194x6.m {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final p186w5.C2970a f30183i = new p186w5.C2970a(0);
    public static final p186w5.C2970a j = new p186w5.C2970a(1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final p186w5.C2970a f30184k = new p186w5.C2970a(2);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final p186w5.C2970a f30185l = new p186w5.C2970a(3);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f30186h;

    public /* synthetic */ C2970a(int i3) {
        this.f30186h = i3;
    }

    @Override // p194x6.m
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.f30186h) {
            case 0:
                p020c0.C1700q c1700q = (p020c0.C1700q) obj;
                if ((((java.lang.Number) obj2).intValue() & 3) == 2 && c1700q.F()) {
                    c1700q.W();
                } else {
                    com.google.common.util.concurrent.U.K(0, c1700q);
                }
                break;
            case 1:
                p020c0.C1700q c1700q2 = (p020c0.C1700q) obj;
                if ((((java.lang.Number) obj2).intValue() & 3) == 2 && c1700q2.F()) {
                    c1700q2.W();
                } else {
                    com.google.common.util.concurrent.U.O(0, c1700q2);
                }
                break;
            case 2:
                p020c0.C1700q c1700q3 = (p020c0.C1700q) obj;
                if ((((java.lang.Number) obj2).intValue() & 3) == 2 && c1700q3.F()) {
                    c1700q3.W();
                } else {
                    com.google.common.util.concurrent.U.P(0, c1700q3);
                }
                break;
            default:
                p020c0.C1700q c1700q4 = (p020c0.C1700q) obj;
                if ((((java.lang.Number) obj2).intValue() & 3) == 2 && c1700q4.F()) {
                    c1700q4.W();
                } else {
                    v.AbstractC2901v.b(p000a.a.C(com.kiptv.tv.R.drawable.trakt_full_logo, c1700q4, 0), "Trakt", androidx.compose.foundation.layout.b.g(p137q0.m.f26474b, 30), null, O0.C0718g.f7636b, 0.0f, c1700q4, 25016, 104);
                }
                break;
        }
        return p070h6.A.f22523a;
    }
}
