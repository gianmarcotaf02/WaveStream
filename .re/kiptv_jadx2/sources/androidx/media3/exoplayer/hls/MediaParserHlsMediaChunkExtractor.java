package androidx.media3.exoplayer.hls;

import android.media.MediaParser;
import android.media.MediaParser$OutputConsumer;
import android.media.MediaParser$SeekableInputReader;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import androidx.media3.common.FileTypes;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.TimestampAdjuster;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.source.mediaparser.InputReaderAdapterV30;
import androidx.media3.exoplayer.source.mediaparser.MediaParserUtil;
import androidx.media3.exoplayer.source.mediaparser.OutputConsumerAdapterV30;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.text.SubtitleParser;
import com.google.android.gms.internal.play_billing.AbstractC1864o0;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import p076i4.AbstractC2186b0;
import p076i4.S0;
import p076i4.Y;

public final class MediaParserHlsMediaChunkExtractor implements HlsMediaChunkExtractor {
    public static final HlsExtractorFactory FACTORY = new n();
    private final Format format;
    private final InputReaderAdapterV30 inputReaderAdapter = new InputReaderAdapterV30();
    private final MediaParser mediaParser;
    private final AbstractC2186b0 muxedCaptionMediaFormats;
    private final OutputConsumerAdapterV30 outputConsumerAdapter;
    private final boolean overrideInBandCaptionDeclarations;
    private int pendingSkipBytes;
    private final PlayerId playerId;

    public static final class PeekingInputReader implements MediaParser$SeekableInputReader {
        private final ExtractorInput extractorInput;
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
            throw new UnsupportedOperationException();
        }

        private PeekingInputReader(ExtractorInput extractorInput) {
            this.extractorInput = extractorInput;
        }
    }

    public MediaParserHlsMediaChunkExtractor(MediaParser mediaParser, OutputConsumerAdapterV30 outputConsumerAdapterV30, Format format, boolean z6, AbstractC2186b0 abstractC2186b0, int i3, PlayerId playerId) {
        this.mediaParser = mediaParser;
        this.outputConsumerAdapter = outputConsumerAdapterV30;
        this.overrideInBandCaptionDeclarations = z6;
        this.muxedCaptionMediaFormats = abstractC2186b0;
        this.format = format;
        this.playerId = playerId;
        this.pendingSkipBytes = i3;
    }

    private static MediaParser createMediaParserInstance(MediaParser$OutputConsumer mediaParser$OutputConsumer, Format format, boolean z6, AbstractC2186b0 abstractC2186b0, PlayerId playerId, String... strArr) {
        MediaParser mediaParserCreateByName = strArr.length == 1 ? MediaParser.createByName(strArr[0], mediaParser$OutputConsumer) : MediaParser.create(mediaParser$OutputConsumer, strArr);
        mediaParserCreateByName.setParameter(MediaParserUtil.PARAMETER_EXPOSE_CAPTION_FORMATS, abstractC2186b0);
        mediaParserCreateByName.setParameter(MediaParserUtil.PARAMETER_OVERRIDE_IN_BAND_CAPTION_DECLARATIONS, Boolean.valueOf(z6));
        mediaParserCreateByName.setParameter(MediaParserUtil.PARAMETER_IN_BAND_CRYPTO_INFO, Boolean.TRUE);
        mediaParserCreateByName.setParameter(MediaParserUtil.PARAMETER_EAGERLY_EXPOSE_TRACK_TYPE, Boolean.TRUE);
        mediaParserCreateByName.setParameter(MediaParserUtil.PARAMETER_IGNORE_TIMESTAMP_OFFSET, Boolean.TRUE);
        mediaParserCreateByName.setParameter("android.media.mediaparser.ts.ignoreSpliceInfoStream", Boolean.TRUE);
        mediaParserCreateByName.setParameter("android.media.mediaparser.ts.mode", "hls");
        String str = format.codecs;
        if (!TextUtils.isEmpty(str)) {
            if (!MimeTypes.AUDIO_AAC.equals(MimeTypes.getAudioMediaMimeType(str))) {
                mediaParserCreateByName.setParameter("android.media.mediaparser.ts.ignoreAacStream", Boolean.TRUE);
            }
            if (!MimeTypes.VIDEO_H264.equals(MimeTypes.getVideoMediaMimeType(str))) {
                mediaParserCreateByName.setParameter("android.media.mediaparser.ts.ignoreAvcStream", Boolean.TRUE);
            }
        }
        if (Build.VERSION.SDK_INT >= 31) {
            MediaParserUtil.setLogSessionIdOnMediaParser(mediaParserCreateByName, playerId);
        }
        return mediaParserCreateByName;
    }

    public static HlsMediaChunkExtractor lambda$static$0(Uri uri, Format format, List list, TimestampAdjuster timestampAdjuster, Map map, ExtractorInput extractorInput, PlayerId playerId) throws IOException {
        if (FileTypes.inferFileTypeFromMimeType(format.sampleMimeType) == 13) {
            return new BundledHlsMediaChunkExtractor(new WebvttExtractor(format.language, timestampAdjuster, SubtitleParser.Factory.UNSUPPORTED, false), format, timestampAdjuster);
        }
        boolean z6 = list != null;
        Y yS = AbstractC2186b0.s();
        if (list != null) {
            for (int i3 = 0; i3 < list.size(); i3++) {
                yS.c(MediaParserUtil.toCaptionsMediaFormat((Format) list.get(i3)));
            }
        } else {
            yS.c(MediaParserUtil.toCaptionsMediaFormat(new Format.Builder().setSampleMimeType(MimeTypes.APPLICATION_CEA608).build()));
        }
        S0 s0F = yS.f();
        OutputConsumerAdapterV30 outputConsumerAdapterV30 = new OutputConsumerAdapterV30();
        if (list == null) {
            list = S0.f22832l;
        }
        outputConsumerAdapterV30.setMuxedCaptionFormats(list);
        outputConsumerAdapterV30.setTimestampAdjuster(timestampAdjuster);
        MediaParser mediaParserCreateMediaParserInstance = createMediaParserInstance(outputConsumerAdapterV30, format, z6, s0F, playerId, "android.media.mediaparser.FragmentedMp4Parser", "android.media.mediaparser.Ac3Parser", "android.media.mediaparser.Ac4Parser", "android.media.mediaparser.AdtsParser", "android.media.mediaparser.Mp3Parser", "android.media.mediaparser.TsParser");
        PeekingInputReader peekingInputReader = new PeekingInputReader(extractorInput);
        mediaParserCreateMediaParserInstance.advance(peekingInputReader);
        outputConsumerAdapterV30.setSelectedParserName(mediaParserCreateMediaParserInstance.getParserName());
        return new MediaParserHlsMediaChunkExtractor(mediaParserCreateMediaParserInstance, outputConsumerAdapterV30, format, z6, s0F, peekingInputReader.totalPeekedBytes, playerId);
    }

    @Override
    public void init(ExtractorOutput extractorOutput) {
        this.outputConsumerAdapter.setExtractorOutput(extractorOutput);
    }

    @Override
    public boolean isPackedAudioExtractor() {
        String parserName = this.mediaParser.getParserName();
        return "android.media.mediaparser.Ac3Parser".equals(parserName) || "android.media.mediaparser.Ac4Parser".equals(parserName) || "android.media.mediaparser.AdtsParser".equals(parserName) || "android.media.mediaparser.Mp3Parser".equals(parserName);
    }

    @Override
    public boolean isReusable() {
        String parserName = this.mediaParser.getParserName();
        return "android.media.mediaparser.FragmentedMp4Parser".equals(parserName) || "android.media.mediaparser.TsParser".equals(parserName);
    }

    @Override
    public void onTruncatedSegmentParsed() {
        MediaParser mediaParser = this.mediaParser;
        MediaParser.SeekPoint unused = MediaParser.SeekPoint.START;
        mediaParser.seek(MediaParser.SeekPoint.START);
    }

    @Override
    public boolean read(ExtractorInput extractorInput) {
        extractorInput.skipFully(this.pendingSkipBytes);
        this.pendingSkipBytes = 0;
        this.inputReaderAdapter.setDataReader(extractorInput, extractorInput.getLength());
        return this.mediaParser.advance(this.inputReaderAdapter);
    }

    @Override
    public HlsMediaChunkExtractor recreate() {
        AbstractC1864o0.Y(!isReusable());
        return new MediaParserHlsMediaChunkExtractor(createMediaParserInstance(this.outputConsumerAdapter, this.format, this.overrideInBandCaptionDeclarations, this.muxedCaptionMediaFormats, this.playerId, this.mediaParser.getParserName()), this.outputConsumerAdapter, this.format, this.overrideInBandCaptionDeclarations, this.muxedCaptionMediaFormats, 0, this.playerId);
    }
}
