package I5;

/* JADX INFO: renamed from: I5.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C0468i implements kotlin.jvm.functions.Function0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f5160h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p020c0.X f5161i;
    public final /* synthetic */ p194x6.j j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p020c0.X f5162k;

    public /* synthetic */ C0468i(p020c0.X x9, p194x6.j jVar, p020c0.X x10, int i3) {
        this.f5160h = i3;
        this.f5161i = x9;
        this.j = jVar;
        this.f5162k = x10;
    }

    @Override // kotlin.jvm.functions.Function0
    public final java.lang.Object invoke() {
        switch (this.f5160h) {
            case 0:
                p099l5.y yVar = p099l5.y.ExoPlayer;
                E8.d.w(this.f5161i, this.j, this.f5162k, yVar);
                break;
            case 1:
                p099l5.y yVar2 = p099l5.y.VLC;
                E8.d.w(this.f5161i, this.j, this.f5162k, yVar2);
                break;
            case 2:
                p020c0.X x9 = this.f5161i;
                com.kiptv.core.model.WatchProgress watchProgress = ((p208z5.C3224q) x9.getValue()).j;
                if (watchProgress == null || !watchProgress.g()) {
                    this.j.invoke(new C5.C0102d0(((p208z5.C3224q) x9.getValue()).f32788b, false));
                } else {
                    this.f5162k.setValue(java.lang.Boolean.TRUE);
                }
                break;
            default:
                this.f5161i.setValue(java.lang.Boolean.FALSE);
                this.j.invoke(new C5.C0102d0(((p208z5.C3224q) this.f5162k.getValue()).f32788b, true));
                break;
        }
        return p070h6.A.f22523a;
    }

    public /* synthetic */ C0468i(p194x6.j jVar, p020c0.X x9, p020c0.X x10, int i3) {
        this.f5160h = i3;
        this.j = jVar;
        this.f5161i = x9;
        this.f5162k = x10;
    }
}
