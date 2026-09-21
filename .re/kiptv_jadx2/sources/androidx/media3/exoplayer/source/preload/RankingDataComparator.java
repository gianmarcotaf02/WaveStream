package androidx.media3.exoplayer.source.preload;

import java.util.Comparator;

public interface RankingDataComparator<T> extends Comparator<T> {

    public interface InvalidationListener {
        void onRankingDataComparatorInvalidated();
    }

    void setInvalidationListener(InvalidationListener invalidationListener);
}
