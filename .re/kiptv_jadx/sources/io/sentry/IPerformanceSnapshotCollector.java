package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public interface IPerformanceSnapshotCollector extends io.sentry.IPerformanceCollector {
    void collect(io.sentry.PerformanceCollectionData performanceCollectionData);

    void setup();
}
