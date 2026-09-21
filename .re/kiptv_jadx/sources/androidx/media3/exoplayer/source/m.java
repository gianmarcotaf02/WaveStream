package androidx.media3.exoplayer.source;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements p068h4.v {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16748h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f16749i;
    public final /* synthetic */ java.lang.Object j;

    public /* synthetic */ m(java.lang.Object obj, java.lang.Object obj2, int i3) {
        this.f16748h = i3;
        this.f16749i = obj;
        this.j = obj2;
    }

    @Override // p068h4.v
    public final java.lang.Object get() {
        switch (this.f16748h) {
            case 0:
                return androidx.media3.exoplayer.source.ProgressiveMediaSource.Factory.lambda$setDownloadExecutor$1((p068h4.v) this.f16749i, (androidx.media3.common.util.Consumer) this.j);
            case 1:
                return androidx.media3.exoplayer.source.SingleSampleMediaSource.Factory.lambda$setDownloadExecutor$0((p068h4.v) this.f16749i, (androidx.media3.common.util.Consumer) this.j);
            default:
                return ((androidx.media3.exoplayer.source.DefaultMediaSourceFactory.DelegateFactoryLoader) this.f16749i).lambda$loadSupplier$4((androidx.media3.datasource.DataSource.Factory) this.j);
        }
    }
}
