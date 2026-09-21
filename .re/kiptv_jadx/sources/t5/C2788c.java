package t5;

/* JADX INFO: renamed from: t5.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2788c implements p194x6.n {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final t5.C2788c f28141i = new t5.C2788c(0);
    public static final t5.C2788c j = new t5.C2788c(1);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f28142h;

    public /* synthetic */ C2788c(int i3) {
        this.f28142h = i3;
    }

    @Override // p194x6.n
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        switch (this.f28142h) {
            case 0:
                B.a0 TextButton = (B.a0) obj;
                p020c0.C1700q c1700q = (p020c0.C1700q) obj2;
                int iIntValue = ((java.lang.Number) obj3).intValue();
                kotlin.jvm.internal.m.e(TextButton, "$this$TextButton");
                if ((iIntValue & 17) == 16 && c1700q.F()) {
                    c1700q.W();
                } else {
                    Z.K0.b(p015b5.u.a("detail.alreadyWatched.restart"), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, c1700q, 0, 0, 131070);
                }
                break;
            default:
                B.a0 TextButton2 = (B.a0) obj;
                p020c0.C1700q c1700q2 = (p020c0.C1700q) obj2;
                int iIntValue2 = ((java.lang.Number) obj3).intValue();
                kotlin.jvm.internal.m.e(TextButton2, "$this$TextButton");
                if ((iIntValue2 & 17) == 16 && c1700q2.F()) {
                    c1700q2.W();
                } else {
                    Z.K0.b(p015b5.u.a("common.cancel"), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, c1700q2, 0, 0, 131070);
                }
                break;
        }
        return p070h6.A.f22523a;
    }
}
