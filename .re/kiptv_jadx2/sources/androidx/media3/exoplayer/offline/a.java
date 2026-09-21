package androidx.media3.exoplayer.offline;

import androidx.media3.common.MediaItem;
import androidx.media3.datasource.cache.CacheWriter;
import androidx.media3.exoplayer.drm.DrmSessionManager;
import androidx.media3.exoplayer.drm.DrmSessionManagerProvider;
import androidx.media3.exoplayer.scheduler.RequirementsWatcher;

public final class a implements DrmSessionManagerProvider, RequirementsWatcher.Listener, CacheWriter.ProgressListener {

    public final Object f16701a;

    public a(Object obj) {
        this.f16701a = obj;
    }

    @Override
    public DrmSessionManager get(MediaItem mediaItem) {
        return DownloadHelper.lambda$createMediaSourceInternal$4((DrmSessionManager) this.f16701a, mediaItem);
    }

    @Override
    public void onProgress(long j, long j9, long j10) {
        ((ProgressiveDownloader) this.f16701a).onProgress(j, j9, j10);
    }

    @Override
    public void onRequirementsStateChanged(RequirementsWatcher requirementsWatcher, int i3) {
        ((DownloadManager) this.f16701a).onRequirementsStateChanged(requirementsWatcher, i3);
    }
}
