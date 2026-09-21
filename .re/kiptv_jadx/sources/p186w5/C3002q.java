package p186w5;

/* JADX INFO: renamed from: w5.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C3002q implements kotlin.jvm.functions.Function0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f30371h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.kiptv.core.model.HomeSectionConfig f30372i;
    public final /* synthetic */ p020c0.X j;

    public /* synthetic */ C3002q(com.kiptv.core.model.HomeSectionConfig homeSectionConfig, p020c0.X x9, int i3) {
        this.f30371h = i3;
        this.f30372i = homeSectionConfig;
        this.j = x9;
    }

    @Override // kotlin.jvm.functions.Function0
    public final java.lang.Object invoke() {
        switch (this.f30371h) {
            case 0:
                this.j.setValue(this.f30372i);
                break;
            default:
                this.j.setValue(this.f30372i);
                break;
        }
        return p070h6.A.f22523a;
    }
}
