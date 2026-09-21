package I5;

/* JADX INFO: loaded from: classes4.dex */
public final class G implements kotlin.jvm.functions.Function0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f4739h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.kiptv.core.model.TMDBVideo f4740i;
    public final /* synthetic */ p020c0.X j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p020c0.X f4741k;

    public /* synthetic */ G(com.kiptv.core.model.TMDBVideo tMDBVideo, p020c0.X x9, p020c0.X x10, int i3) {
        this.f4739h = i3;
        this.f4740i = tMDBVideo;
        this.j = x9;
        this.f4741k = x10;
    }

    @Override // kotlin.jvm.functions.Function0
    public final java.lang.Object invoke() {
        switch (this.f4739h) {
            case 0:
                com.kiptv.core.model.TMDBVideo tMDBVideo = this.f4740i;
                this.j.setValue(tMDBVideo.f20342b);
                this.f4741k.setValue(tMDBVideo.f20343c);
                break;
            default:
                com.kiptv.core.model.TMDBVideo tMDBVideo2 = this.f4740i;
                this.j.setValue(tMDBVideo2.f20342b);
                this.f4741k.setValue(tMDBVideo2.f20343c);
                break;
        }
        return p070h6.A.f22523a;
    }
}
