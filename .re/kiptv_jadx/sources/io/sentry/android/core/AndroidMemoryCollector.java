package io.sentry.android.core;

/* JADX INFO: loaded from: classes4.dex */
public class AndroidMemoryCollector implements io.sentry.IPerformanceSnapshotCollector {
    @Override // io.sentry.IPerformanceSnapshotCollector
    public void collect(io.sentry.PerformanceCollectionData performanceCollectionData) {
        performanceCollectionData.addMemoryData(new io.sentry.MemoryCollectionData(java.lang.System.currentTimeMillis(), java.lang.Runtime.getRuntime().totalMemory() - java.lang.Runtime.getRuntime().freeMemory(), android.os.Debug.getNativeHeapSize() - android.os.Debug.getNativeHeapFreeSize()));
    }

    @Override // io.sentry.IPerformanceSnapshotCollector
    public void setup() {
    }
}
