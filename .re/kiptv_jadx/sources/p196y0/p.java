package p196y0;

/* JADX INFO: loaded from: classes.dex */
public final class p extends kotlin.jvm.internal.o implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f31776h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p196y0.q f31777i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(p196y0.q qVar, int i3) {
        super(1);
        this.f31776h = i3;
        this.f31777i = qVar;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        switch (this.f31776h) {
            case 0:
                double dDoubleValue = ((java.lang.Number) obj).doubleValue();
                p196y0.q qVar = this.f31777i;
                return java.lang.Double.valueOf(qVar.f31787n.c(O7.r.q(dDoubleValue, qVar.f31780e, qVar.f31781f)));
            default:
                double dDoubleValue2 = ((java.lang.Number) obj).doubleValue();
                p196y0.q qVar2 = this.f31777i;
                return java.lang.Double.valueOf(O7.r.q(qVar2.f31784k.c(dDoubleValue2), qVar2.f31780e, qVar2.f31781f));
        }
    }
}
