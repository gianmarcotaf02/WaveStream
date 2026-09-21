package androidx.media3.exoplayer.offline;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements java.util.Comparator {
    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        return androidx.media3.exoplayer.offline.DownloadManager.InternalHandler.compareStartTimes((androidx.media3.exoplayer.offline.Download) obj, (androidx.media3.exoplayer.offline.Download) obj2);
    }
}
