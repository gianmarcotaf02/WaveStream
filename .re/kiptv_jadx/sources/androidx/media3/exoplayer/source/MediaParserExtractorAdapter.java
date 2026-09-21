package androidx.media3.exoplayer.source;

/* JADX INFO: loaded from: classes.dex */
public final class MediaParserExtractorAdapter implements androidx.media3.exoplayer.source.ProgressiveMediaExtractor {

    @java.lang.Deprecated
    public static final androidx.media3.exoplayer.source.ProgressiveMediaExtractor.Factory FACTORY = new androidx.media3.exoplayer.source.n(2);
    private final androidx.media3.exoplayer.source.mediaparser.InputReaderAdapterV30 inputReaderAdapter;
    private final android.media.MediaParser mediaParser;
    private final androidx.media3.exoplayer.source.mediaparser.OutputConsumerAdapterV30 outputConsumerAdapter;
    private java.lang.String parserName;

    public static final class Factory implements androidx.media3.exoplayer.source.ProgressiveMediaExtractor.Factory {
        private static final java.util.Map<java.lang.String, java.lang.Object> parameters = new java.util.HashMap();

        public void setConstantBitrateSeekingEnabled(boolean z6) {
            if (!z6) {
                java.util.Map<java.lang.String, java.lang.Object> map = parameters;
                map.remove("android.media.mediaparser.adts.enableCbrSeeking");
                map.remove("android.media.mediaparser.amr.enableCbrSeeking");
                map.remove("android.media.mediaparser.mp3.enableCbrSeeking");
                return;
            }
            java.util.Map<java.lang.String, java.lang.Object> map2 = parameters;
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            map2.put("android.media.mediaparser.adts.enableCbrSeeking", bool);
            map2.put("android.media.mediaparser.amr.enableCbrSeeking", bool);
            map2.put("android.media.mediaparser.mp3.enableCbrSeeking", bool);
        }

        @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor.Factory
        public androidx.media3.exoplayer.source.MediaParserExtractorAdapter createProgressiveMediaExtractor(androidx.media3.exoplayer.analytics.PlayerId playerId) {
            return new androidx.media3.exoplayer.source.MediaParserExtractorAdapter(playerId, parameters);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ androidx.media3.exoplayer.source.ProgressiveMediaExtractor lambda$static$0(androidx.media3.exoplayer.analytics.PlayerId playerId) {
        return new androidx.media3.exoplayer.source.MediaParserExtractorAdapter(playerId, p076i4.X0.f22848n);
    }

    @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor
    public void disableSeekingOnMp3Streams() {
        if ("android.media.mediaparser.Mp3Parser".equals(this.parserName)) {
            this.outputConsumerAdapter.disableSeeking();
        }
    }

    @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor
    public long getCurrentInputPosition() {
        return this.inputReaderAdapter.getPosition();
    }

    @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor
    public java.lang.String getUnderlyingImplementationName() {
        if (this.mediaParser.getParserName().equals("android.media.mediaparser.UNKNOWN")) {
            return null;
        }
        return this.mediaParser.getParserName();
    }

    @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor
    public void init(androidx.media3.common.DataReader dataReader, android.net.Uri uri, java.util.Map<java.lang.String, java.util.List<java.lang.String>> map, long j, long j9, androidx.media3.extractor.ExtractorOutput extractorOutput) throws java.io.IOException {
        this.outputConsumerAdapter.setExtractorOutput(extractorOutput);
        this.inputReaderAdapter.setDataReader(dataReader, j9);
        this.inputReaderAdapter.setCurrentPosition(j);
        java.lang.String parserName = this.mediaParser.getParserName();
        if ("android.media.mediaparser.UNKNOWN".equals(parserName)) {
            this.mediaParser.advance(this.inputReaderAdapter);
            java.lang.String parserName2 = this.mediaParser.getParserName();
            this.parserName = parserName2;
            this.outputConsumerAdapter.setSelectedParserName(parserName2);
            return;
        }
        if (parserName.equals(this.parserName)) {
            return;
        }
        java.lang.String parserName3 = this.mediaParser.getParserName();
        this.parserName = parserName3;
        this.outputConsumerAdapter.setSelectedParserName(parserName3);
    }

    @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor
    public int read(androidx.media3.extractor.PositionHolder positionHolder) throws java.io.IOException {
        boolean zAdvance = this.mediaParser.advance(this.inputReaderAdapter);
        long andResetSeekPosition = this.inputReaderAdapter.getAndResetSeekPosition();
        positionHolder.position = andResetSeekPosition;
        if (zAdvance) {
            return andResetSeekPosition != -1 ? 1 : 0;
        }
        return -1;
    }

    @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor
    public void release() {
        this.mediaParser.release();
    }

    @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor
    public void seek(long j, long j9) {
        this.inputReaderAdapter.setCurrentPosition(j);
        android.util.Pair<android.media.MediaParser.SeekPoint, android.media.MediaParser.SeekPoint> seekPoints = this.outputConsumerAdapter.getSeekPoints(j9);
        this.mediaParser.seek(androidx.media3.exoplayer.hls.m.j(androidx.media3.exoplayer.hls.m.j(seekPoints.second).position == j ? seekPoints.second : seekPoints.first));
    }

    @java.lang.Deprecated
    public MediaParserExtractorAdapter(androidx.media3.exoplayer.analytics.PlayerId playerId) {
        this(playerId, p076i4.X0.f22848n);
    }

    private MediaParserExtractorAdapter(androidx.media3.exoplayer.analytics.PlayerId playerId, java.util.Map<java.lang.String, java.lang.Object> map) {
        androidx.media3.exoplayer.source.mediaparser.OutputConsumerAdapterV30 outputConsumerAdapterV30 = new androidx.media3.exoplayer.source.mediaparser.OutputConsumerAdapterV30();
        this.outputConsumerAdapter = outputConsumerAdapterV30;
        this.inputReaderAdapter = new androidx.media3.exoplayer.source.mediaparser.InputReaderAdapterV30();
        android.media.MediaParser mediaParserCreate = android.media.MediaParser.create(outputConsumerAdapterV30, new java.lang.String[0]);
        this.mediaParser = mediaParserCreate;
        mediaParserCreate.setParameter(androidx.media3.exoplayer.source.mediaparser.MediaParserUtil.PARAMETER_EAGERLY_EXPOSE_TRACK_TYPE, java.lang.Boolean.TRUE);
        mediaParserCreate.setParameter(androidx.media3.exoplayer.source.mediaparser.MediaParserUtil.PARAMETER_IN_BAND_CRYPTO_INFO, java.lang.Boolean.TRUE);
        mediaParserCreate.setParameter(androidx.media3.exoplayer.source.mediaparser.MediaParserUtil.PARAMETER_INCLUDE_SUPPLEMENTAL_DATA, java.lang.Boolean.TRUE);
        for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry : map.entrySet()) {
            this.mediaParser.setParameter(entry.getKey(), entry.getValue());
        }
        this.parserName = "android.media.mediaparser.UNKNOWN";
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            androidx.media3.exoplayer.source.mediaparser.MediaParserUtil.setLogSessionIdOnMediaParser(this.mediaParser, playerId);
        }
    }
}
