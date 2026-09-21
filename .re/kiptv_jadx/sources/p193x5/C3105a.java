package p193x5;

/* JADX INFO: renamed from: x5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3105a implements p194x6.n {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final p193x5.C3105a f31418i = new p193x5.C3105a(0);
    public static final p193x5.C3105a j = new p193x5.C3105a(1);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f31419h;

    public /* synthetic */ C3105a(int i3) {
        this.f31419h = i3;
    }

    @Override // p194x6.n
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        switch (this.f31419h) {
            case 0:
                D.C0196c item = (D.C0196c) obj;
                p020c0.C1700q c1700q = (p020c0.C1700q) obj2;
                int iIntValue = ((java.lang.Number) obj3).intValue();
                kotlin.jvm.internal.m.e(item, "$this$item");
                if ((iIntValue & 17) == 16 && c1700q.F()) {
                    c1700q.W();
                } else {
                    Z.K0.b(p015b5.u.a("livetv.epgSheet.refineSearch"), B.AbstractC0065c.p(p137q0.m.f26474b, 0.0f, 8, 1), p188x0.C3098s.c(p188x0.C3098s.f31124c, 0.45f), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((Z.R0) c1700q.j(Z.S0.f12323a)).f12320o, c1700q, 432, 0, 65528);
                }
                break;
            default:
                D.C0196c item2 = (D.C0196c) obj;
                p020c0.C1700q c1700q2 = (p020c0.C1700q) obj2;
                int iIntValue2 = ((java.lang.Number) obj3).intValue();
                kotlin.jvm.internal.m.e(item2, "$this$item");
                if ((iIntValue2 & 17) == 16 && c1700q2.F()) {
                    c1700q2.W();
                } else {
                    Z.K0.b(p015b5.u.a("livetv.categoriesSection"), B.AbstractC0065c.r(p137q0.m.f26474b, 12, 14, 0.0f, 6, 4), p188x0.C3098s.c(p188x0.C3098s.f31124c, 0.45f), 0L, p048f1.s.f21669m, null, 0L, null, 0L, 0, false, 0, 0, ((Z.R0) c1700q2.j(Z.S0.f12323a)).f12319n, c1700q2, 197040, 0, 65496);
                }
                break;
        }
        return p070h6.A.f22523a;
    }
}
