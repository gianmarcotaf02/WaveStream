package p146r1;

/* JADX INFO: loaded from: classes.dex */
public final class t extends kotlin.jvm.internal.o implements p194x6.m {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final p146r1.t f26773i = new p146r1.t(2, 0);
    public static final p146r1.t j = new p146r1.t(2, 1);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f26774h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(int i3, int i9) {
        super(i3);
        this.f26774h = i9;
    }

    @Override // p194x6.m
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.f26774h) {
            case 0:
                p020c0.C1700q c1700q = (p020c0.C1700q) obj;
                int iIntValue = ((java.lang.Number) obj2).intValue();
                if (!c1700q.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c1700q.W();
                }
                break;
            default:
                p020c0.C1700q c1700q2 = (p020c0.C1700q) obj;
                int iIntValue2 = ((java.lang.Number) obj2).intValue();
                if (!c1700q2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    c1700q2.W();
                }
                break;
        }
        return p070h6.A.f22523a;
    }
}
