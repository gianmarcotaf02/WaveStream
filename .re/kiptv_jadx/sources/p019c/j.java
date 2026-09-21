package p019c;

/* JADX INFO: loaded from: classes.dex */
public final class j extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f18047h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p019c.k f18048i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(p019c.k kVar, int i3) {
        super(0);
        this.f18047h = i3;
        this.f18048i = kVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final java.lang.Object invoke() {
        switch (this.f18047h) {
            case 0:
                p019c.k kVar = this.f18048i;
                return new androidx.lifecycle.a0(kVar.getApplication(), kVar, kVar.getIntent() != null ? kVar.getIntent().getExtras() : null);
            case 1:
                this.f18048i.reportFullyDrawn();
                return p070h6.A.f22523a;
            case 2:
                p019c.k kVar2 = this.f18048i;
                return new p019c.m(kVar2.f18053m, new p019c.j(kVar2, 1));
            default:
                p019c.k kVar3 = this.f18048i;
                p019c.u uVar = new p019c.u(new p019c.c(kVar3, 1));
                if (android.os.Build.VERSION.SDK_INT >= 33) {
                    if (kotlin.jvm.internal.m.a(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
                        kVar3.f16022h.a(new p019c.e(uVar, kVar3));
                    } else {
                        new android.os.Handler(android.os.Looper.getMainLooper()).post(new T7.d(kVar3, uVar, 11));
                    }
                }
                return uVar;
        }
    }
}
