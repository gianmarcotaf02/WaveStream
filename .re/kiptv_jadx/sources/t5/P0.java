package t5;

/* JADX INFO: loaded from: classes4.dex */
public final class P0 implements kotlin.jvm.functions.Function0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f28029h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p194x6.m f28030i;
    public final /* synthetic */ java.lang.String j;

    public /* synthetic */ P0(p194x6.m mVar, java.lang.String str, int i3) {
        this.f28029h = i3;
        this.f28030i = mVar;
        this.j = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final java.lang.Object invoke() {
        switch (this.f28029h) {
            case 0:
                this.f28030i.invoke(this.j, java.lang.Boolean.TRUE);
                break;
            default:
                this.f28030i.invoke(this.j, java.lang.Boolean.FALSE);
                break;
        }
        return p070h6.A.f22523a;
    }
}
