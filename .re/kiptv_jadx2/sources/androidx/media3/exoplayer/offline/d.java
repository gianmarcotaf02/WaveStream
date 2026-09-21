package androidx.media3.exoplayer.offline;

import java.util.Comparator;

public final class d implements Comparator {
    @Override
    public final int compare(Object obj, Object obj2) {
        return DownloadManager.InternalHandler.compareStartTimes((Download) obj, (Download) obj2);
    }
}
