package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public final class PerformanceCollectionData {
    private io.sentry.MemoryCollectionData memoryData = null;
    private io.sentry.CpuCollectionData cpuData = null;

    public void addCpuData(io.sentry.CpuCollectionData cpuCollectionData) {
        if (cpuCollectionData != null) {
            this.cpuData = cpuCollectionData;
        }
    }

    public void addMemoryData(io.sentry.MemoryCollectionData memoryCollectionData) {
        if (memoryCollectionData != null) {
            this.memoryData = memoryCollectionData;
        }
    }

    public io.sentry.CpuCollectionData getCpuData() {
        return this.cpuData;
    }

    public io.sentry.MemoryCollectionData getMemoryData() {
        return this.memoryData;
    }
}
