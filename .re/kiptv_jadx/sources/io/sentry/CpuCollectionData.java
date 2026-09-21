package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public final class CpuCollectionData {
    final double cpuUsagePercentage;
    final long timestampMillis;

    public CpuCollectionData(long j, double d4) {
        this.timestampMillis = j;
        this.cpuUsagePercentage = d4;
    }

    public double getCpuUsagePercentage() {
        return this.cpuUsagePercentage;
    }

    public long getTimestampMillis() {
        return this.timestampMillis;
    }
}
