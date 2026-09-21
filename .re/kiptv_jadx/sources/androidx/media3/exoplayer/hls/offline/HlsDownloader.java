package androidx.media3.exoplayer.hls.offline;

/* JADX INFO: loaded from: classes.dex */
public final class HlsDownloader extends androidx.media3.exoplayer.offline.SegmentDownloader<androidx.media3.exoplayer.hls.playlist.HlsPlaylist> {

    public static final class Factory extends androidx.media3.exoplayer.offline.SegmentDownloader.BaseFactory<androidx.media3.exoplayer.hls.playlist.HlsPlaylist> {
        public Factory(androidx.media3.datasource.cache.CacheDataSource.Factory factory) {
            super(factory, new androidx.media3.exoplayer.hls.playlist.HlsPlaylistParser());
        }

        public androidx.media3.exoplayer.hls.offline.HlsDownloader.Factory setManifestParser(androidx.media3.exoplayer.hls.playlist.HlsPlaylistParser hlsPlaylistParser) {
            this.manifestParser = hlsPlaylistParser;
            return this;
        }

        @Override // androidx.media3.exoplayer.offline.SegmentDownloaderFactory
        public androidx.media3.exoplayer.hls.offline.HlsDownloader create(androidx.media3.common.MediaItem mediaItem) {
            return new androidx.media3.exoplayer.hls.offline.HlsDownloader(mediaItem, this.manifestParser, this.cacheDataSourceFactory, this.executor, this.maxMergedSegmentStartTimeDiffMs, this.startPositionUs, this.durationUs);
        }

        @Override // androidx.media3.exoplayer.offline.SegmentDownloader.BaseFactory, androidx.media3.exoplayer.offline.SegmentDownloaderFactory
        public androidx.media3.exoplayer.hls.offline.HlsDownloader.Factory setDurationUs(long j) {
            super.setDurationUs(j);
            return this;
        }

        @Override // androidx.media3.exoplayer.offline.SegmentDownloader.BaseFactory, androidx.media3.exoplayer.offline.SegmentDownloaderFactory
        public androidx.media3.exoplayer.hls.offline.HlsDownloader.Factory setExecutor(java.util.concurrent.Executor executor) {
            super.setExecutor(executor);
            return this;
        }

        @Override // androidx.media3.exoplayer.offline.SegmentDownloader.BaseFactory, androidx.media3.exoplayer.offline.SegmentDownloaderFactory
        public androidx.media3.exoplayer.hls.offline.HlsDownloader.Factory setMaxMergedSegmentStartTimeDiffMs(long j) {
            super.setMaxMergedSegmentStartTimeDiffMs(j);
            return this;
        }

        @Override // androidx.media3.exoplayer.offline.SegmentDownloader.BaseFactory, androidx.media3.exoplayer.offline.SegmentDownloaderFactory
        public androidx.media3.exoplayer.hls.offline.HlsDownloader.Factory setStartPositionUs(long j) {
            super.setStartPositionUs(j);
            return this;
        }
    }

    private void addMediaPlaylistDataSpecs(java.util.List<android.net.Uri> list, java.util.List<androidx.media3.datasource.DataSpec> list2) {
        for (int i3 = 0; i3 < list.size(); i3++) {
            list2.add(androidx.media3.exoplayer.offline.SegmentDownloader.getCompressibleDataSpec(list.get(i3)));
        }
    }

    private void addSegment(androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist hlsMediaPlaylist, androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Segment segment, java.util.HashSet<android.net.Uri> hashSet, java.util.ArrayList<androidx.media3.exoplayer.offline.SegmentDownloader.Segment> arrayList) {
        java.lang.String str = hlsMediaPlaylist.baseUri;
        long j = hlsMediaPlaylist.startTimeUs + segment.relativeStartTimeUs;
        java.lang.String str2 = segment.fullSegmentEncryptionKeyUri;
        if (str2 != null) {
            android.net.Uri uriResolveToUri = androidx.media3.common.util.UriUtil.resolveToUri(str, str2);
            if (hashSet.add(uriResolveToUri)) {
                arrayList.add(new androidx.media3.exoplayer.offline.SegmentDownloader.Segment(j, androidx.media3.exoplayer.offline.SegmentDownloader.getCompressibleDataSpec(uriResolveToUri)));
            }
        }
        arrayList.add(new androidx.media3.exoplayer.offline.SegmentDownloader.Segment(j, new androidx.media3.datasource.DataSpec(androidx.media3.common.util.UriUtil.resolveToUri(str, segment.url), segment.byteRangeOffset, segment.byteRangeLength)));
    }

    @java.lang.Deprecated
    public HlsDownloader(androidx.media3.common.MediaItem mediaItem, androidx.media3.datasource.cache.CacheDataSource.Factory factory) {
        this(mediaItem, factory, new androidx.media3.exoplayer.dash.offline.a());
    }

    @Override // androidx.media3.exoplayer.offline.SegmentDownloader
    public java.util.List<androidx.media3.exoplayer.offline.SegmentDownloader.Segment> getSegments(androidx.media3.datasource.DataSource dataSource, androidx.media3.exoplayer.hls.playlist.HlsPlaylist hlsPlaylist, boolean z6) throws java.io.IOException {
        java.util.Iterator it;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (hlsPlaylist instanceof androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist) {
            addMediaPlaylistDataSpecs(((androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist) hlsPlaylist).mediaPlaylistUrls, arrayList);
        } else {
            arrayList.add(androidx.media3.exoplayer.offline.SegmentDownloader.getCompressibleDataSpec(android.net.Uri.parse(hlsPlaylist.baseUri)));
        }
        java.util.ArrayList<androidx.media3.exoplayer.offline.SegmentDownloader.Segment> arrayList2 = new java.util.ArrayList<>();
        java.util.HashSet<android.net.Uri> hashSet = new java.util.HashSet<>();
        java.util.Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            androidx.media3.datasource.DataSpec dataSpec = (androidx.media3.datasource.DataSpec) it2.next();
            arrayList2.add(new androidx.media3.exoplayer.offline.SegmentDownloader.Segment(0L, dataSpec));
            try {
                androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist hlsMediaPlaylist = (androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist) getManifest(dataSource, dataSpec, z6);
                java.util.List<androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Segment> list = hlsMediaPlaylist.segments;
                long j = z6 == 0 ? this.startPositionUs : 0L;
                long j9 = z6 ? androidx.media3.common.C.TIME_UNSET : this.durationUs;
                androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Segment segment = null;
                int i3 = 0;
                while (true) {
                    if (i3 >= list.size()) {
                        it = it2;
                        break;
                    }
                    androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Segment segment2 = list.get(i3);
                    it = it2;
                    long j10 = hlsMediaPlaylist.startTimeUs + segment2.relativeStartTimeUs;
                    if (j10 + segment2.durationUs > j) {
                        if (j9 != androidx.media3.common.C.TIME_UNSET && j10 >= j + j9) {
                            break;
                        }
                        androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Segment segment3 = segment2.initializationSegment;
                        if (segment3 != null && segment3 != segment) {
                            addSegment(hlsMediaPlaylist, segment3, hashSet, arrayList2);
                            segment = segment3;
                        }
                        addSegment(hlsMediaPlaylist, segment2, hashSet, arrayList2);
                    }
                    i3++;
                    it2 = it;
                }
            } catch (java.io.IOException e6) {
                it = it2;
                if (!z6) {
                    throw e6;
                }
            }
            it2 = it;
        }
        return arrayList2;
    }

    @java.lang.Deprecated
    public HlsDownloader(androidx.media3.common.MediaItem mediaItem, androidx.media3.datasource.cache.CacheDataSource.Factory factory, java.util.concurrent.Executor executor) {
        this(mediaItem, new androidx.media3.exoplayer.hls.playlist.HlsPlaylistParser(), factory, executor, 20000L, 0L, androidx.media3.common.C.TIME_UNSET);
    }

    private HlsDownloader(androidx.media3.common.MediaItem mediaItem, androidx.media3.exoplayer.upstream.ParsingLoadable.Parser<androidx.media3.exoplayer.hls.playlist.HlsPlaylist> parser, androidx.media3.datasource.cache.CacheDataSource.Factory factory, java.util.concurrent.Executor executor, long j, long j9, long j10) {
        super(mediaItem, parser, factory, executor, j, j9, j10);
    }
}
