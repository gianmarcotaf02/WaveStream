package Z;

/* JADX INFO: loaded from: classes.dex */
public final class Q extends kotlin.jvm.internal.o implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f12300h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f12301i;
    public final /* synthetic */ java.lang.Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Q(java.lang.Object obj, int i3, int i9) {
        super(1);
        this.f12300h = i9;
        this.j = obj;
        this.f12301i = i3;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        switch (this.f12300h) {
            case 0:
                ((O0.f0) obj).g((O0.g0) this.j, 0, -this.f12301i, 0.0f);
                return p070h6.A.f22523a;
            default:
                java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(((p175v0.F) obj).U0(this.f12301i));
                ((kotlin.jvm.internal.A) this.j).f24539h = boolValueOf;
                return boolValueOf;
        }
    }
}
