package F5;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements p194x6.n {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final F5.a f3667i = new F5.a(0);
    public static final F5.a j = new F5.a(1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final F5.a f3668k = new F5.a(2);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final F5.a f3669l = new F5.a(3);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f3670h;

    public /* synthetic */ a(int i3) {
        this.f3670h = i3;
    }

    @Override // p194x6.n
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        switch (this.f3670h) {
            case 0:
                D.C0196c item = (D.C0196c) obj;
                p020c0.C1700q c1700q = (p020c0.C1700q) obj2;
                int iIntValue = ((java.lang.Number) obj3).intValue();
                kotlin.jvm.internal.m.e(item, "$this$item");
                if ((iIntValue & 17) == 16 && c1700q.F()) {
                    c1700q.W();
                } else {
                    F5.j.j(0, c1700q);
                }
                break;
            case 1:
                D.C0196c item2 = (D.C0196c) obj;
                p020c0.C1700q c1700q2 = (p020c0.C1700q) obj2;
                int iIntValue2 = ((java.lang.Number) obj3).intValue();
                kotlin.jvm.internal.m.e(item2, "$this$item");
                if ((iIntValue2 & 17) == 16 && c1700q2.F()) {
                    c1700q2.W();
                } else {
                    F5.j.b(0, c1700q2);
                }
                break;
            case 2:
                D.C0196c item3 = (D.C0196c) obj;
                p020c0.C1700q c1700q3 = (p020c0.C1700q) obj2;
                int iIntValue3 = ((java.lang.Number) obj3).intValue();
                kotlin.jvm.internal.m.e(item3, "$this$item");
                if ((iIntValue3 & 17) == 16 && c1700q3.F()) {
                    c1700q3.W();
                } else {
                    F5.j.d(0, c1700q3);
                }
                break;
            default:
                D.C0196c item4 = (D.C0196c) obj;
                p020c0.C1700q c1700q4 = (p020c0.C1700q) obj2;
                int iIntValue4 = ((java.lang.Number) obj3).intValue();
                kotlin.jvm.internal.m.e(item4, "$this$item");
                if ((iIntValue4 & 17) == 16 && c1700q4.F()) {
                    c1700q4.W();
                } else {
                    F5.j.e(0, c1700q4);
                }
                break;
        }
        return p070h6.A.f22523a;
    }
}
