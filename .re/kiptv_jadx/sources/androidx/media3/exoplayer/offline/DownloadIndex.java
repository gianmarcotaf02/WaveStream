package androidx.media3.exoplayer.offline;

/* JADX INFO: loaded from: classes.dex */
public interface DownloadIndex {
    androidx.media3.exoplayer.offline.Download getDownload(java.lang.String str);

    androidx.media3.exoplayer.offline.DownloadCursor getDownloads(int... iArr);
}
