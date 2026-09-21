package androidx.media3.exoplayer.offline;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements androidx.media3.exoplayer.drm.DrmSessionManagerProvider, androidx.media3.exoplayer.scheduler.RequirementsWatcher.Listener, androidx.media3.datasource.cache.CacheWriter.ProgressListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f16701a;

    public /* synthetic */ a(java.lang.Object obj) {
        this.f16701a = obj;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionManagerProvider
    public androidx.media3.exoplayer.drm.DrmSessionManager get(androidx.media3.common.MediaItem mediaItem) {
        return androidx.media3.exoplayer.offline.DownloadHelper.lambda$createMediaSourceInternal$4((androidx.media3.exoplayer.drm.DrmSessionManager) this.f16701a, mediaItem);
    }

    @Override // androidx.media3.datasource.cache.CacheWriter.ProgressListener
    public void onProgress(long j, long j9, long j10) {
        ((androidx.media3.exoplayer.offline.ProgressiveDownloader) this.f16701a).onProgress(j, j9, j10);
    }

    @Override // androidx.media3.exoplayer.scheduler.RequirementsWatcher.Listener
    public void onRequirementsStateChanged(androidx.media3.exoplayer.scheduler.RequirementsWatcher requirementsWatcher, int i3) {
        ((androidx.media3.exoplayer.offline.DownloadManager) this.f16701a).onRequirementsStateChanged(requirementsWatcher, i3);
    }
}
