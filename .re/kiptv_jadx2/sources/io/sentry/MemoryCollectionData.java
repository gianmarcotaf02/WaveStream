package io.sentry;

public final class MemoryCollectionData {
    final long timestampMillis;
    final long usedHeapMemory;
    final long usedNativeMemory;

    public MemoryCollectionData(long j, long j9, long j10) {
        this.timestampMillis = j;
        this.usedHeapMemory = j9;
        this.usedNativeMemory = j10;
    }

    public long getTimestampMillis() {
        return this.timestampMillis;
    }

    public long getUsedHeapMemory() {
        return this.usedHeapMemory;
    }

    public long getUsedNativeMemory() {
        return this.usedNativeMemory;
    }

    public MemoryCollectionData(long j, long j9) {
        this(j, j9, -1L);
    }
}
