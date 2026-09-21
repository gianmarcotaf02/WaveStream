package androidx.media3.exoplayer.hls;

/* JADX INFO: loaded from: classes.dex */
public final class MediaParserHlsMediaChunkExtractor implements androidx.media3.exoplayer.hls.HlsMediaChunkExtractor {
    public static final androidx.media3.exoplayer.hls.HlsExtractorFactory FACTORY = new androidx.media3.exoplayer.hls.n();
    private final androidx.media3.common.Format format;
    private final androidx.media3.exoplayer.source.mediaparser.InputReaderAdapterV30 inputReaderAdapter = new androidx.media3.exoplayer.source.mediaparser.InputReaderAdapterV30();
    private final android.media.MediaParser mediaParser;
    private final p076i4.AbstractC2186b0 muxedCaptionMediaFormats;
    private final androidx.media3.exoplayer.source.mediaparser.OutputConsumerAdapterV30 outputConsumerAdapter;
    private final boolean overrideInBandCaptionDeclarations;
    private int pendingSkipBytes;
    private final androidx.media3.exoplayer.analytics.PlayerId playerId;

    public static final class PeekingInputReader implements android.media.MediaParser$SeekableInputReader {
        private final androidx.media3.extractor.ExtractorInput extractorInput;
        private int totalPeekedBytes;

        public long getLength() {
            return this.extractorInput.getLength();
        }

        public long getPosition() {
            return this.extractorInput.getPeekPosition();
        }

        public int read(byte[] bArr, int i3, int i9) {
            int iPeek = this.extractorInput.peek(bArr, i3, i9);
            this.totalPeekedBytes += iPeek;
            return iPeek;
        }

        public void seekToPosition(long j) {
            throw new java.lang.UnsupportedOperationException();
        }

        private PeekingInputReader(androidx.media3.extractor.ExtractorInput extractorInput) {
            this.extractorInput = extractorInput;
        }
    }

    public MediaParserHlsMediaChunkExtractor(android.media.MediaParser mediaParser, androidx.media3.exoplayer.source.mediaparser.OutputConsumerAdapterV30 outputConsumerAdapterV30, androidx.media3.common.Format format, boolean z6, p076i4.AbstractC2186b0 abstractC2186b0, int i3, androidx.media3.exoplayer.analytics.PlayerId playerId) {
        this.mediaParser = mediaParser;
        this.outputConsumerAdapter = outputConsumerAdapterV30;
        this.overrideInBandCaptionDeclarations = z6;
        this.muxedCaptionMediaFormats = abstractC2186b0;
        this.format = format;
        this.playerId = playerId;
        this.pendingSkipBytes = i3;
    }

    private static android.media.MediaParser createMediaParserInstance(android.media.MediaParser$OutputConsumer mediaParser$OutputConsumer, androidx.media3.common.Format format, boolean z6, p076i4.AbstractC2186b0 abstractC2186b0, androidx.media3.exoplayer.analytics.PlayerId playerId, java.lang.String... strArr) {
        android.media.MediaParser mediaParserCreateByName = strArr.length == 1 ? android.media.MediaParser.createByName(strArr[0], mediaParser$OutputConsumer) : android.media.MediaParser.create(mediaParser$OutputConsumer, strArr);
        mediaParserCreateByName.setParameter(androidx.media3.exoplayer.source.mediaparser.MediaParserUtil.PARAMETER_EXPOSE_CAPTION_FORMATS, abstractC2186b0);
        mediaParserCreateByName.setParameter(androidx.media3.exoplayer.source.mediaparser.MediaParserUtil.PARAMETER_OVERRIDE_IN_BAND_CAPTION_DECLARATIONS, java.lang.Boolean.valueOf(z6));
        mediaParserCreateByName.setParameter(androidx.media3.exoplayer.source.mediaparser.MediaParserUtil.PARAMETER_IN_BAND_CRYPTO_INFO, java.lang.Boolean.TRUE);
        mediaParserCreateByName.setParameter(androidx.media3.exoplayer.source.mediaparser.MediaParserUtil.PARAMETER_EAGERLY_EXPOSE_TRACK_TYPE, java.lang.Boolean.TRUE);
        mediaParserCreateByName.setParameter(androidx.media3.exoplayer.source.mediaparser.MediaParserUtil.PARAMETER_IGNORE_TIMESTAMP_OFFSET, java.lang.Boolean.TRUE);
        mediaParserCreateByName.setParameter("android.media.mediaparser.ts.ignoreSpliceInfoStream", java.lang.Boolean.TRUE);
        mediaParserCreateByName.setParameter("android.media.mediaparser.ts.mode", "hls");
        java.lang.String str = format.codecs;
        if (!android.text.TextUtils.isEmpty(str)) {
            if (!androidx.media3.common.MimeTypes.AUDIO_AAC.equals(androidx.media3.common.MimeTypes.getAudioMediaMimeType(str))) {
                mediaParserCreateByName.setParameter("android.media.mediaparser.ts.ignoreAacStream", java.lang.Boolean.TRUE);
            }
            if (!androidx.media3.common.MimeTypes.VIDEO_H264.equals(androidx.media3.common.MimeTypes.getVideoMediaMimeType(str))) {
                mediaParserCreateByName.setParameter("android.media.mediaparser.ts.ignoreAvcStream", java.lang.Boolean.TRUE);
            }
        }
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            androidx.media3.exoplayer.source.mediaparser.MediaParserUtil.setLogSessionIdOnMediaParser(mediaParserCreateByName, playerId);
        }
        return mediaParserCreateByName;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static androidx.media3.exoplayer.hls.HlsMediaChunkExtractor lambda$static$0(android.net.Uri uri, androidx.media3.common.Format format, java.util.List list, androidx.media3.common.util.TimestampAdjuster timestampAdjuster, java.util.Map map, androidx.media3.extractor.ExtractorInput extractorInput, androidx.media3.exoplayer.analytics.PlayerId playerId) throws java.io.IOException {
        if (androidx.media3.common.FileTypes.inferFileTypeFromMimeType(format.sampleMimeType) == 13) {
            return new androidx.media3.exoplayer.hls.BundledHlsMediaChunkExtractor(new androidx.media3.exoplayer.hls.WebvttExtractor(format.language, timestampAdjuster, androidx.media3.extractor.text.SubtitleParser.Factory.UNSUPPORTED, false), format, timestampAdjuster);
        }
        boolean z6 = list != null;
        p076i4.Y yS = p076i4.AbstractC2186b0.s();
        if (list != null) {
            for (int i3 = 0; i3 < list.size(); i3++) {
                yS.c(androidx.media3.exoplayer.source.mediaparser.MediaParserUtil.toCaptionsMediaFormat((androidx.media3.common.Format) list.get(i3)));
            }
        } else {
            yS.c(androidx.media3.exoplayer.source.mediaparser.MediaParserUtil.toCaptionsMediaFormat(new androidx.media3.common.Format.Builder().setSampleMimeType(androidx.media3.common.MimeTypes.APPLICATION_CEA608).build()));
        }
        p076i4.S0 s0F = yS.f();
        androidx.media3.exoplayer.source.mediaparser.OutputConsumerAdapterV30 outputConsumerAdapterV30 = new androidx.media3.exoplayer.source.mediaparser.OutputConsumerAdapterV30();
        if (list == null) {
            list = p076i4.S0.f22832l;
        }
        outputConsumerAdapterV30.setMuxedCaptionFormats(list);
        outputConsumerAdapterV30.setTimestampAdjuster(timestampAdjuster);
        android.media.MediaParser mediaParserCreateMediaParserInstance = createMediaParserInstance(outputConsumerAdapterV30, format, z6, s0F, playerId, "android.media.mediaparser.FragmentedMp4Parser", "android.media.mediaparser.Ac3Parser", "android.media.mediaparser.Ac4Parser", "android.media.mediaparser.AdtsParser", "android.media.mediaparser.Mp3Parser", "android.media.mediaparser.TsParser");
        androidx.media3.exoplayer.hls.MediaParserHlsMediaChunkExtractor.PeekingInputReader peekingInputReader = new androidx.media3.exoplayer.hls.MediaParserHlsMediaChunkExtractor.PeekingInputReader(extractorInput);
        mediaParserCreateMediaParserInstance.advance(peekingInputReader);
        outputConsumerAdapterV30.setSelectedParserName(mediaParserCreateMediaParserInstance.getParserName());
        return new androidx.media3.exoplayer.hls.MediaParserHlsMediaChunkExtractor(mediaParserCreateMediaParserInstance, outputConsumerAdapterV30, format, z6, s0F, peekingInputReader.totalPeekedBytes, playerId);
    }

    @Override // androidx.media3.exoplayer.hls.HlsMediaChunkExtractor
    public void init(androidx.media3.extractor.ExtractorOutput extractorOutput) {
        this.outputConsumerAdapter.setExtractorOutput(extractorOutput);
    }

    @Override // androidx.media3.exoplayer.hls.HlsMediaChunkExtractor
    public boolean isPackedAudioExtractor() {
        java.lang.String parserName = this.mediaParser.getParserName();
        return "android.media.mediaparser.Ac3Parser".equals(parserName) || "android.media.mediaparser.Ac4Parser".equals(parserName) || "android.media.mediaparser.AdtsParser".equals(parserName) || "android.media.mediaparser.Mp3Parser".equals(parserName);
    }

    @Override // androidx.media3.exoplayer.hls.HlsMediaChunkExtractor
    public boolean isReusable() {
        java.lang.String parserName = this.mediaParser.getParserName();
        return "android.media.mediaparser.FragmentedMp4Parser".equals(parserName) || "android.media.mediaparser.TsParser".equals(parserName);
    }

    @Override // androidx.media3.exoplayer.hls.HlsMediaChunkExtractor
    public void onTruncatedSegmentParsed() {
        android.media.MediaParser mediaParser = this.mediaParser;
        android.media.MediaParser.SeekPoint unused = android.media.MediaParser.SeekPoint.START;
        mediaParser.seek(android.media.MediaParser.SeekPoint.START);
    }

    @Override // androidx.media3.exoplayer.hls.HlsMediaChunkExtractor
    public boolean read(androidx.media3.extractor.ExtractorInput extractorInput) {
        extractorInput.skipFully(this.pendingSkipBytes);
        this.pendingSkipBytes = 0;
        this.inputReaderAdapter.setDataReader(extractorInput, extractorInput.getLength());
        return this.mediaParser.advance(this.inputReaderAdapter);
    }

    @Override // androidx.media3.exoplayer.hls.HlsMediaChunkExtractor
    public androidx.media3.exoplayer.hls.HlsMediaChunkExtractor recreate() {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(!isReusable());
        return new androidx.media3.exoplayer.hls.MediaParserHlsMediaChunkExtractor(createMediaParserInstance(this.outputConsumerAdapter, this.format, this.overrideInBandCaptionDeclarations, this.muxedCaptionMediaFormats, this.playerId, this.mediaParser.getParserName()), this.outputConsumerAdapter, this.format, this.overrideInBandCaptionDeclarations, this.muxedCaptionMediaFormats, 0, this.playerId);
    }
}
