package androidx.media3.exoplayer.upstream;

/* JADX INFO: loaded from: classes.dex */
public final class CachedRegionTracker implements androidx.media3.datasource.cache.Cache.Listener {
    public static final int CACHED_TO_END = -2;
    public static final int NOT_CACHED = -1;
    private static final java.lang.String TAG = "CachedRegionTracker";
    private final androidx.media3.datasource.cache.Cache cache;
    private final java.lang.String cacheKey;
    private final androidx.media3.extractor.ChunkIndex chunkIndex;
    private final java.util.TreeSet<androidx.media3.exoplayer.upstream.CachedRegionTracker.Region> regions = new java.util.TreeSet<>();
    private final androidx.media3.exoplayer.upstream.CachedRegionTracker.Region lookupRegion = new androidx.media3.exoplayer.upstream.CachedRegionTracker.Region(0, 0);

    public static class Region implements java.lang.Comparable<androidx.media3.exoplayer.upstream.CachedRegionTracker.Region> {
        public long endOffset;
        public int endOffsetIndex;
        public long startOffset;

        public Region(long j, long j9) {
            this.startOffset = j;
            this.endOffset = j9;
        }

        @Override // java.lang.Comparable
        public int compareTo(androidx.media3.exoplayer.upstream.CachedRegionTracker.Region region) {
            return java.lang.Long.compare(this.startOffset, region.startOffset);
        }
    }

    public CachedRegionTracker(androidx.media3.datasource.cache.Cache cache, java.lang.String str, androidx.media3.extractor.ChunkIndex chunkIndex) {
        this.cache = cache;
        this.cacheKey = str;
        this.chunkIndex = chunkIndex;
        synchronized (this) {
            try {
                java.util.Iterator<androidx.media3.datasource.cache.CacheSpan> itDescendingIterator = cache.addListener(str, this).descendingIterator();
                while (itDescendingIterator.hasNext()) {
                    mergeSpan(itDescendingIterator.next());
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    private void mergeSpan(androidx.media3.datasource.cache.CacheSpan cacheSpan) {
        long j = cacheSpan.position;
        androidx.media3.exoplayer.upstream.CachedRegionTracker.Region region = new androidx.media3.exoplayer.upstream.CachedRegionTracker.Region(j, cacheSpan.length + j);
        androidx.media3.exoplayer.upstream.CachedRegionTracker.Region regionFloor = this.regions.floor(region);
        androidx.media3.exoplayer.upstream.CachedRegionTracker.Region regionCeiling = this.regions.ceiling(region);
        boolean zRegionsConnect = regionsConnect(regionFloor, region);
        if (regionsConnect(region, regionCeiling)) {
            if (zRegionsConnect) {
                regionFloor.endOffset = regionCeiling.endOffset;
                regionFloor.endOffsetIndex = regionCeiling.endOffsetIndex;
            } else {
                region.endOffset = regionCeiling.endOffset;
                region.endOffsetIndex = regionCeiling.endOffsetIndex;
                this.regions.add(region);
            }
            this.regions.remove(regionCeiling);
            return;
        }
        if (!zRegionsConnect) {
            int iBinarySearch = java.util.Arrays.binarySearch(this.chunkIndex.offsets, region.endOffset);
            if (iBinarySearch < 0) {
                iBinarySearch = (-iBinarySearch) - 2;
            }
            region.endOffsetIndex = iBinarySearch;
            this.regions.add(region);
            return;
        }
        regionFloor.endOffset = region.endOffset;
        int i3 = regionFloor.endOffsetIndex;
        while (true) {
            androidx.media3.extractor.ChunkIndex chunkIndex = this.chunkIndex;
            if (i3 >= chunkIndex.length - 1) {
                break;
            }
            int i9 = i3 + 1;
            if (chunkIndex.offsets[i9] > regionFloor.endOffset) {
                break;
            } else {
                i3 = i9;
            }
        }
        regionFloor.endOffsetIndex = i3;
    }

    private boolean regionsConnect(androidx.media3.exoplayer.upstream.CachedRegionTracker.Region region, androidx.media3.exoplayer.upstream.CachedRegionTracker.Region region2) {
        return (region == null || region2 == null || region.endOffset != region2.startOffset) ? false : true;
    }

    public synchronized int getRegionEndTimeMs(long j) {
        int i3;
        androidx.media3.exoplayer.upstream.CachedRegionTracker.Region region = this.lookupRegion;
        region.startOffset = j;
        androidx.media3.exoplayer.upstream.CachedRegionTracker.Region regionFloor = this.regions.floor(region);
        if (regionFloor != null) {
            long j9 = regionFloor.endOffset;
            if (j <= j9 && (i3 = regionFloor.endOffsetIndex) != -1) {
                androidx.media3.extractor.ChunkIndex chunkIndex = this.chunkIndex;
                if (i3 == chunkIndex.length - 1) {
                    if (j9 == chunkIndex.offsets[i3] + ((long) chunkIndex.sizes[i3])) {
                        return -2;
                    }
                }
                return (int) ((chunkIndex.timesUs[i3] + ((chunkIndex.durationsUs[i3] * (j9 - chunkIndex.offsets[i3])) / ((long) chunkIndex.sizes[i3]))) / 1000);
            }
        }
        return -1;
    }

    @Override // androidx.media3.datasource.cache.Cache.Listener
    public synchronized void onSpanAdded(androidx.media3.datasource.cache.Cache cache, androidx.media3.datasource.cache.CacheSpan cacheSpan) {
        mergeSpan(cacheSpan);
    }

    @Override // androidx.media3.datasource.cache.Cache.Listener
    public synchronized void onSpanRemoved(androidx.media3.datasource.cache.Cache cache, androidx.media3.datasource.cache.CacheSpan cacheSpan) {
        long j = cacheSpan.position;
        androidx.media3.exoplayer.upstream.CachedRegionTracker.Region region = new androidx.media3.exoplayer.upstream.CachedRegionTracker.Region(j, cacheSpan.length + j);
        androidx.media3.exoplayer.upstream.CachedRegionTracker.Region regionFloor = this.regions.floor(region);
        if (regionFloor == null) {
            androidx.media3.common.util.Log.e(TAG, "Removed a span we were not aware of");
            return;
        }
        this.regions.remove(regionFloor);
        long j9 = regionFloor.startOffset;
        long j10 = region.startOffset;
        if (j9 < j10) {
            androidx.media3.exoplayer.upstream.CachedRegionTracker.Region region2 = new androidx.media3.exoplayer.upstream.CachedRegionTracker.Region(j9, j10);
            int iBinarySearch = java.util.Arrays.binarySearch(this.chunkIndex.offsets, region2.endOffset);
            if (iBinarySearch < 0) {
                iBinarySearch = (-iBinarySearch) - 2;
            }
            region2.endOffsetIndex = iBinarySearch;
            this.regions.add(region2);
        }
        long j11 = regionFloor.endOffset;
        long j12 = region.endOffset;
        if (j11 > j12) {
            androidx.media3.exoplayer.upstream.CachedRegionTracker.Region region3 = new androidx.media3.exoplayer.upstream.CachedRegionTracker.Region(j12 + 1, j11);
            region3.endOffsetIndex = regionFloor.endOffsetIndex;
            this.regions.add(region3);
        }
    }

    @Override // androidx.media3.datasource.cache.Cache.Listener
    public void onSpanTouched(androidx.media3.datasource.cache.Cache cache, androidx.media3.datasource.cache.CacheSpan cacheSpan, androidx.media3.datasource.cache.CacheSpan cacheSpan2) {
    }

    public void release() {
        this.cache.removeListener(this.cacheKey, this);
    }
}
