package p019c;

/* JADX INFO: loaded from: classes.dex */
public final class p extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f18077h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p019c.u f18078i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(p019c.u uVar, int i3) {
        super(0);
        this.f18077h = i3;
        this.f18078i = uVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final java.lang.Object invoke() {
        switch (this.f18077h) {
            case 0:
                this.f18078i.c();
                break;
            case 1:
                this.f18078i.b();
                break;
            default:
                this.f18078i.c();
                break;
        }
        return p070h6.A.f22523a;
    }
}
