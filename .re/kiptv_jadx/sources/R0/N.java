package R0;

/* JADX INFO: loaded from: classes.dex */
public final class N extends kotlin.jvm.internal.o implements p194x6.m {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f8827h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f8828i;
    public final /* synthetic */ p089k0.e j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f8829k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(androidx.compose.ui.platform.AndroidComposeView androidComposeView, R0.C0812a0 c0812a0, p089k0.e eVar) {
        super(2);
        this.f8827h = 0;
        this.f8829k = androidComposeView;
        this.f8828i = c0812a0;
        this.j = eVar;
    }

    @Override // p194x6.m
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.f8827h) {
            case 0:
                p020c0.C1700q c1700q = (p020c0.C1700q) obj;
                int iIntValue = ((java.lang.Number) obj2).intValue();
                if (c1700q.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    R0.AbstractC0844q0.a((androidx.compose.ui.platform.AndroidComposeView) this.f8829k, (R0.C0812a0) this.f8828i, this.j, c1700q, 0);
                } else {
                    c1700q.W();
                }
                break;
            case 1:
                ((java.lang.Number) obj2).intValue();
                R0.AbstractC0844q0.a((Q0.o0) this.f8829k, (R0.C0812a0) this.f8828i, this.j, (p020c0.C1700q) obj, p020c0.AbstractC1703s.K(1));
                break;
            case 2:
                ((java.lang.Number) obj2).intValue();
                int iK = p020c0.AbstractC1703s.K(7);
                Z.AbstractC1137b0.e((Z.C1170s0) this.f8829k, (p137q0.p) this.f8828i, this.j, (p020c0.C1700q) obj, iK);
                break;
            default:
                p020c0.C1700q c1700q2 = (p020c0.C1700q) obj;
                if ((((java.lang.Number) obj2).intValue() & 3) == 2 && c1700q2.F()) {
                    c1700q2.W();
                } else {
                    java.lang.Boolean bool = (java.lang.Boolean) ((p020c0.X) this.f8828i).getValue();
                    bool.booleanValue();
                    this.j.invoke((java.util.ArrayList) this.f8829k, bool, c1700q2, 0);
                }
                break;
        }
        return p070h6.A.f22523a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ N(java.lang.Object obj, java.lang.Object obj2, p089k0.e eVar, int i3, int i9) {
        super(2);
        this.f8827h = i9;
        this.f8829k = obj;
        this.f8828i = obj2;
        this.j = eVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(p089k0.e eVar, java.util.ArrayList arrayList, p020c0.X x9) {
        super(2);
        this.f8827h = 3;
        this.j = eVar;
        this.f8829k = arrayList;
        this.f8828i = x9;
    }
}
