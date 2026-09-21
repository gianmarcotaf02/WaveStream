package androidx.media3.exoplayer.upstream;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements androidx.media3.exoplayer.upstream.CmcdConfiguration.Factory, androidx.media3.common.util.Consumer {
    @Override // androidx.media3.common.util.Consumer
    public void accept(java.lang.Object obj) {
        ((java.util.concurrent.ExecutorService) obj).shutdown();
    }

    @Override // androidx.media3.exoplayer.upstream.CmcdConfiguration.Factory
    public androidx.media3.exoplayer.upstream.CmcdConfiguration createCmcdConfiguration(androidx.media3.common.MediaItem mediaItem) {
        return androidx.media3.exoplayer.upstream.CmcdConfiguration.Factory.lambda$static$0(mediaItem);
    }
}
