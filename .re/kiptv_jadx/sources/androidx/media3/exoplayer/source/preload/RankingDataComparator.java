package androidx.media3.exoplayer.source.preload;

/* JADX INFO: loaded from: classes.dex */
public interface RankingDataComparator<T> extends java.util.Comparator<T> {

    public interface InvalidationListener {
        void onRankingDataComparatorInvalidated();
    }

    void setInvalidationListener(androidx.media3.exoplayer.source.preload.RankingDataComparator.InvalidationListener invalidationListener);
}
