package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public final class JavaMemoryCollector implements io.sentry.IPerformanceSnapshotCollector {
    private final java.lang.Runtime runtime = java.lang.Runtime.getRuntime();

    @Override // io.sentry.IPerformanceSnapshotCollector
    public void collect(io.sentry.PerformanceCollectionData performanceCollectionData) {
        performanceCollectionData.addMemoryData(new io.sentry.MemoryCollectionData(java.lang.System.currentTimeMillis(), this.runtime.totalMemory() - this.runtime.freeMemory()));
    }

    @Override // io.sentry.IPerformanceSnapshotCollector
    public void setup() {
    }
}
