package J5;

/* JADX INFO: renamed from: J5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0561a implements p194x6.o {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final J5.C0561a f6337i = new J5.C0561a(0);
    public static final J5.C0561a j = new J5.C0561a(1);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f6338h;

    public /* synthetic */ C0561a(int i3) {
        this.f6338h = i3;
    }

    @Override // p194x6.o
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        int i3;
        int i9;
        switch (this.f6338h) {
            case 0:
                B.a0 TvFocusableRow = (B.a0) obj;
                boolean zBooleanValue = ((java.lang.Boolean) obj2).booleanValue();
                p020c0.C1700q c1700q = (p020c0.C1700q) obj3;
                int iIntValue = ((java.lang.Number) obj4).intValue();
                kotlin.jvm.internal.m.e(TvFocusableRow, "$this$TvFocusableRow");
                if ((iIntValue & 6) == 0) {
                    i3 = (c1700q.f(TvFocusableRow) ? 4 : 2) | iIntValue;
                } else {
                    i3 = iIntValue;
                }
                if ((iIntValue & 48) == 0) {
                    i3 |= c1700q.g(zBooleanValue) ? 32 : 16;
                }
                if ((i3 & 147) == 146 && c1700q.F()) {
                    c1700q.W();
                } else {
                    v.AbstractC2901v.b(p000a.a.C(com.kiptv.tv.R.drawable.kiptv_logo_gold, c1700q, 0), null, androidx.compose.foundation.layout.b.l(p137q0.m.f26474b, 40), null, null, 0.0f, c1700q, 440, 120);
                    p137q0.p pVarA = B.a0.a(TvFocusableRow, 1.0f);
                    B.C0085x c0085xA = B.AbstractC0083v.a(B.AbstractC0071i.f538c, p137q0.c.f26460t, c1700q, 0);
                    int iHashCode = java.lang.Long.hashCode(c1700q.f18323T);
                    p020c0.InterfaceC1691l0 interfaceC1691l0L = c1700q.l();
                    p137q0.p pVarC = p137q0.a.c(c1700q, pVarA);
                    Q0.InterfaceC0773g.f8436c.getClass();
                    Q0.C0790y c0790y = Q0.C0772f.f8424b;
                    c1700q.g0();
                    if (c1700q.f18322S) {
                        c1700q.k(c0790y);
                    } else {
                        c1700q.q0();
                    }
                    p020c0.AbstractC1703s.H(c1700q, c0085xA, Q0.C0772f.f8427e);
                    p020c0.AbstractC1703s.H(c1700q, interfaceC1691l0L, Q0.C0772f.f8426d);
                    p020c0.AbstractC1703s.w(c1700q, java.lang.Integer.valueOf(iHashCode), Q0.C0772f.f8428f);
                    p020c0.AbstractC1703s.D(c1700q, Q0.C0772f.g);
                    p020c0.AbstractC1703s.H(c1700q, pVarC, Q0.C0772f.f8425c);
                    java.lang.String strA = p015b5.u.a("premium.upgradeToPremium");
                    p020c0.f1 f1Var = Z.S0.f12323a;
                    Z.K0.b(strA, null, zBooleanValue ? p188x0.C3098s.f31123b : p188x0.C3098s.f31124c, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((Z.R0) c1700q.j(f1Var)).f12314h, c1700q, 0, 0, 65530);
                    Z.K0.b(p015b5.u.a("premium.streamingUnlimited"), null, p188x0.C3098s.c(zBooleanValue ? p188x0.C3098s.f31123b : p188x0.C3098s.f31124c, 0.6f), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((Z.R0) c1700q.j(f1Var)).f12317l, c1700q, 0, 0, 65530);
                    c1700q.p(true);
                }
                break;
            default:
                B.a0 TvFocusableRow2 = (B.a0) obj;
                boolean zBooleanValue2 = ((java.lang.Boolean) obj2).booleanValue();
                p020c0.C1700q c1700q2 = (p020c0.C1700q) obj3;
                int iIntValue2 = ((java.lang.Number) obj4).intValue();
                kotlin.jvm.internal.m.e(TvFocusableRow2, "$this$TvFocusableRow");
                if ((iIntValue2 & 6) == 0) {
                    i9 = (c1700q2.f(TvFocusableRow2) ? 4 : 2) | iIntValue2;
                } else {
                    i9 = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i9 |= c1700q2.g(zBooleanValue2) ? 32 : 16;
                }
                if ((i9 & 147) == 146 && c1700q2.F()) {
                    c1700q2.W();
                } else {
                    v.AbstractC2901v.b(p000a.a.C(com.kiptv.tv.R.drawable.kiptv_logo_gold, c1700q2, 0), null, androidx.compose.foundation.layout.b.l(p137q0.m.f26474b, 40), null, null, 0.0f, c1700q2, 440, 120);
                    p137q0.p pVarA2 = B.a0.a(TvFocusableRow2, 1.0f);
                    B.C0085x c0085xA2 = B.AbstractC0083v.a(B.AbstractC0071i.f538c, p137q0.c.f26460t, c1700q2, 0);
                    int iHashCode2 = java.lang.Long.hashCode(c1700q2.f18323T);
                    p020c0.InterfaceC1691l0 interfaceC1691l0L2 = c1700q2.l();
                    p137q0.p pVarC2 = p137q0.a.c(c1700q2, pVarA2);
                    Q0.InterfaceC0773g.f8436c.getClass();
                    Q0.C0790y c0790y2 = Q0.C0772f.f8424b;
                    c1700q2.g0();
                    if (c1700q2.f18322S) {
                        c1700q2.k(c0790y2);
                    } else {
                        c1700q2.q0();
                    }
                    p020c0.AbstractC1703s.H(c1700q2, c0085xA2, Q0.C0772f.f8427e);
                    p020c0.AbstractC1703s.H(c1700q2, interfaceC1691l0L2, Q0.C0772f.f8426d);
                    p020c0.AbstractC1703s.w(c1700q2, java.lang.Integer.valueOf(iHashCode2), Q0.C0772f.f8428f);
                    p020c0.AbstractC1703s.D(c1700q2, Q0.C0772f.g);
                    p020c0.AbstractC1703s.H(c1700q2, pVarC2, Q0.C0772f.f8425c);
                    java.lang.String strA2 = p015b5.u.a("premium.upgradeToPremium");
                    p020c0.f1 f1Var2 = Z.S0.f12323a;
                    Z.K0.b(strA2, null, zBooleanValue2 ? p188x0.C3098s.f31123b : p188x0.C3098s.f31124c, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((Z.R0) c1700q2.j(f1Var2)).f12314h, c1700q2, 0, 0, 65530);
                    Z.K0.b(p015b5.u.a("premium.streamingUnlimited"), null, p188x0.C3098s.c(zBooleanValue2 ? p188x0.C3098s.f31123b : p188x0.C3098s.f31124c, 0.6f), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((Z.R0) c1700q2.j(f1Var2)).f12317l, c1700q2, 0, 0, 65530);
                    c1700q2.p(true);
                }
                break;
        }
        return p070h6.A.f22523a;
    }
}
