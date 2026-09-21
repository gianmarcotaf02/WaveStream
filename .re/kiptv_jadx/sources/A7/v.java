package A7;

/* JADX INFO: loaded from: classes4.dex */
public final class v implements kotlin.jvm.functions.Function0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f350h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final A7.x f351i;
    public final A7.y j;

    public /* synthetic */ v(A7.x xVar, A7.y yVar, int i3) {
        this.f350h = i3;
        this.f351i = xVar;
        this.j = yVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final java.lang.Object invoke() {
        switch (this.f350h) {
            case 0:
                return p078i6.I.o0(this.f351i.f355a.keySet(), this.j.o());
            default:
                return p078i6.I.o0(this.f351i.f356b.keySet(), this.j.p());
        }
    }
}
