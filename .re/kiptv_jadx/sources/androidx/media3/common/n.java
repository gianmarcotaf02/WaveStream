package androidx.media3.common;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements p068h4.v {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16429h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f16430i;
    public final /* synthetic */ java.lang.Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f16431k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f16432l;

    public /* synthetic */ n(androidx.media3.common.SimpleBasePlayer simpleBasePlayer, androidx.media3.common.SimpleBasePlayer.State state, java.util.List list, int i3) {
        this.j = simpleBasePlayer;
        this.f16431k = state;
        this.f16432l = list;
        this.f16430i = i3;
    }

    @Override // p068h4.v
    public final java.lang.Object get() {
        switch (this.f16429h) {
            case 0:
                return ((androidx.media3.common.SimpleBasePlayer) this.j).lambda$addMediaItems$3((androidx.media3.common.SimpleBasePlayer.State) this.f16431k, (java.util.List) this.f16432l, this.f16430i);
            default:
                return ((androidx.media3.exoplayer.dash.offline.DashDownloader) this.j).lambda$getSegmentIndex$0((androidx.media3.datasource.DataSource) this.f16431k, this.f16430i, (androidx.media3.exoplayer.dash.manifest.Representation) this.f16432l);
        }
    }

    public /* synthetic */ n(androidx.media3.exoplayer.dash.offline.DashDownloader dashDownloader, androidx.media3.datasource.DataSource dataSource, int i3, androidx.media3.exoplayer.dash.manifest.Representation representation) {
        this.j = dashDownloader;
        this.f16431k = dataSource;
        this.f16430i = i3;
        this.f16432l = representation;
    }
}
