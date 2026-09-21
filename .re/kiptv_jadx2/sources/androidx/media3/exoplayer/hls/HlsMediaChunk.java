package androidx.media3.exoplayer.hls;

import android.net.Uri;
import androidx.media3.common.C;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.TimestampAdjuster;
import androidx.media3.common.util.UriUtil;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSourceUtil;
import androidx.media3.datasource.DataSpec;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist;
import androidx.media3.exoplayer.source.chunk.MediaChunk;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.DefaultExtractorInput;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.metadata.id3.Id3Decoder;
import androidx.media3.extractor.metadata.id3.PrivFrame;
import com.google.android.gms.internal.play_billing.AbstractC1864o0;
import com.google.crypto.tink.shaded.protobuf.AbstractC1909d;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p076i4.AbstractC2186b0;
import p076i4.S0;
import p076i4.Z;

final class HlsMediaChunk extends MediaChunk {
    public static final String PRIV_TIMESTAMP_FRAME_OWNER = "com.apple.streaming.transportStreamTimestamp";
    private static final AtomicInteger uidSource = new AtomicInteger();
    public final int discontinuitySequenceNumber;
    private final DrmInitData drmInitData;
    private HlsMediaChunkExtractor extractor;
    private final HlsExtractorFactory extractorFactory;
    private boolean extractorInvalidated;
    private final boolean hasGapTag;
    private final Id3Decoder id3Decoder;
    private boolean initDataLoadRequired;
    private final DataSource initDataSource;
    private final DataSpec initDataSpec;
    private final boolean initSegmentEncrypted;
    public final boolean isIndependent;
    private final boolean isPrimaryTimestampSource;
    private volatile boolean loadCanceled;
    private boolean loadCompleted;
    private final boolean mediaSegmentEncrypted;
    private final List<Format> muxedCaptionFormats;
    private int nextLoadPosition;
    private HlsSampleStreamWrapper output;
    public final int partIndex;
    private final PlayerId playerId;
    public final Uri playlistUrl;
    private final HlsMediaChunkExtractor previousExtractor;
    private long publishedDurationUs;
    private AbstractC2186b0 sampleQueueFirstSampleIndices;
    private final ParsableByteArray scratchId3Data;
    private boolean shouldSpliceIn;
    private final TimestampAdjuster timestampAdjuster;
    private final long timestampAdjusterInitializationTimeoutMs;
    public final int uid;

    private HlsMediaChunk(HlsExtractorFactory hlsExtractorFactory, DataSource dataSource, DataSpec dataSpec, Format format, boolean z6, DataSource dataSource2, DataSpec dataSpec2, boolean z9, Uri uri, List<Format> list, int i3, Object obj, long j, long j9, long j10, int i9, boolean z10, int i10, boolean z11, boolean z12, TimestampAdjuster timestampAdjuster, long j11, DrmInitData drmInitData, HlsMediaChunkExtractor hlsMediaChunkExtractor, Id3Decoder id3Decoder, ParsableByteArray parsableByteArray, boolean z13, boolean z14, PlayerId playerId) {
        super(dataSource, dataSpec, format, i3, obj, j, j9, j10);
        this.mediaSegmentEncrypted = z6;
        this.partIndex = i9;
        this.publishedDurationUs = z10 ? j9 - j : C.TIME_UNSET;
        this.discontinuitySequenceNumber = i10;
        this.initDataSpec = dataSpec2;
        this.initDataSource = dataSource2;
        this.initDataLoadRequired = dataSpec2 != null;
        this.initSegmentEncrypted = z9;
        this.playlistUrl = uri;
        this.isPrimaryTimestampSource = z12;
        this.timestampAdjuster = timestampAdjuster;
        this.timestampAdjusterInitializationTimeoutMs = j11;
        this.hasGapTag = z11;
        this.extractorFactory = hlsExtractorFactory;
        this.muxedCaptionFormats = list;
        this.drmInitData = drmInitData;
        this.previousExtractor = hlsMediaChunkExtractor;
        this.id3Decoder = id3Decoder;
        this.scratchId3Data = parsableByteArray;
        this.shouldSpliceIn = z13;
        this.isIndependent = z14;
        this.playerId = playerId;
        Z z15 = AbstractC2186b0.f22868i;
        this.sampleQueueFirstSampleIndices = S0.f22832l;
        this.uid = uidSource.getAndIncrement();
    }

    private static DataSource buildDataSource(DataSource dataSource, byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return dataSource;
        }
        bArr2.getClass();
        return new Aes128DataSource(dataSource, bArr, bArr2);
    }

    public static HlsMediaChunk createInstance(HlsExtractorFactory hlsExtractorFactory, DataSource dataSource, Format format, long j, HlsMediaPlaylist hlsMediaPlaylist, HlsChunkSource.SegmentBaseHolder segmentBaseHolder, Uri uri, List<Format> list, int i3, Object obj, boolean z6, TimestampAdjusterProvider timestampAdjusterProvider, long j9, HlsMediaChunk hlsMediaChunk, byte[] bArr, byte[] bArr2, boolean z9, boolean z10, PlayerId playerId, CmcdData.Factory factory) {
        byte[] encryptionIvArray;
        boolean z11;
        DataSource dataSourceBuildDataSource;
        DataSpec dataSpecBuild;
        boolean z12;
        Uri uri2;
        Id3Decoder id3Decoder;
        ParsableByteArray parsableByteArray;
        HlsMediaChunkExtractor hlsMediaChunkExtractor;
        byte[] encryptionIvArray2;
        HlsMediaPlaylist.SegmentBase segmentBase = segmentBaseHolder.segmentBase;
        DataSpec dataSpecBuild2 = new DataSpec.Builder().setUri(UriUtil.resolveToUri(hlsMediaPlaylist.baseUri, segmentBase.url)).setPosition(segmentBase.byteRangeOffset).setLength(segmentBase.byteRangeLength).setFlags(segmentBaseHolder.isPreload ? 8 : 0).build();
        if (factory != null) {
            dataSpecBuild2 = factory.createCmcdData().addToDataSpec(dataSpecBuild2);
        }
        DataSpec dataSpec = dataSpecBuild2;
        boolean z13 = bArr != null;
        if (z13) {
            String str = segmentBase.encryptionIV;
            str.getClass();
            encryptionIvArray = getEncryptionIvArray(str);
        } else {
            encryptionIvArray = null;
        }
        DataSource dataSourceBuildDataSource2 = buildDataSource(dataSource, bArr, encryptionIvArray);
        HlsMediaPlaylist.Segment segment = segmentBase.initializationSegment;
        if (segment != null) {
            boolean z14 = bArr2 != null;
            if (z14) {
                String str2 = segment.encryptionIV;
                str2.getClass();
                encryptionIvArray2 = getEncryptionIvArray(str2);
            } else {
                encryptionIvArray2 = null;
            }
            z11 = true;
            dataSpecBuild = new DataSpec.Builder().setUri(UriUtil.resolveToUri(hlsMediaPlaylist.baseUri, segment.url)).setPosition(segment.byteRangeOffset).setLength(segment.byteRangeLength).build();
            if (factory != null) {
                dataSpecBuild = factory.setObjectType(CmcdData.OBJECT_TYPE_INIT_SEGMENT).createCmcdData().addToDataSpec(dataSpecBuild);
            }
            dataSourceBuildDataSource = buildDataSource(dataSource, bArr2, encryptionIvArray2);
            z12 = z14;
        } else {
            z11 = true;
            dataSourceBuildDataSource = null;
            dataSpecBuild = null;
            z12 = false;
        }
        long j10 = j + segmentBase.relativeStartTimeUs;
        long j11 = j10 + segmentBase.durationUs;
        int i9 = hlsMediaPlaylist.discontinuitySequence + segmentBase.relativeDiscontinuitySequence;
        if (hlsMediaChunk != null) {
            DataSpec dataSpec2 = hlsMediaChunk.initDataSpec;
            boolean z15 = (dataSpecBuild == dataSpec2 || (dataSpecBuild != null && dataSpec2 != null && dataSpecBuild.uri.equals(dataSpec2.uri) && dataSpecBuild.position == hlsMediaChunk.initDataSpec.position)) ? z11 : false;
            uri2 = uri;
            boolean z16 = (uri2.equals(hlsMediaChunk.playlistUrl) && hlsMediaChunk.loadCompleted) ? z11 : false;
            id3Decoder = hlsMediaChunk.id3Decoder;
            parsableByteArray = hlsMediaChunk.scratchId3Data;
            hlsMediaChunkExtractor = (z15 && z16 && !hlsMediaChunk.extractorInvalidated && hlsMediaChunk.discontinuitySequenceNumber == i9) ? hlsMediaChunk.extractor : null;
        } else {
            uri2 = uri;
            id3Decoder = new Id3Decoder();
            parsableByteArray = new ParsableByteArray(10);
            hlsMediaChunkExtractor = null;
        }
        return new HlsMediaChunk(hlsExtractorFactory, dataSourceBuildDataSource2, dataSpec, format, z13, dataSourceBuildDataSource, dataSpecBuild, z12, uri2, list, i3, obj, j10, j11, segmentBaseHolder.mediaSequence, segmentBaseHolder.partIndex, !segmentBaseHolder.isPreload, i9, segmentBase.hasGapTag, z6, timestampAdjusterProvider.getAdjuster(i9), j9, segmentBase.drmInitData, hlsMediaChunkExtractor, id3Decoder, parsableByteArray, z9, z10, playerId);
    }

    @RequiresNonNull({"output"})
    private void feedDataToExtractor(DataSource dataSource, DataSpec dataSpec, boolean z6, boolean z9) {
        DataSpec dataSpecSubrange;
        long position;
        long j;
        boolean z10 = false;
        if (z6) {
            z10 = this.nextLoadPosition != 0;
            dataSpecSubrange = dataSpec;
        } else {
            dataSpecSubrange = dataSpec.subrange(this.nextLoadPosition);
        }
        try {
            DefaultExtractorInput defaultExtractorInputPrepareExtraction = prepareExtraction(dataSource, dataSpecSubrange, z9);
            if (z10) {
                defaultExtractorInputPrepareExtraction.skipFully(this.nextLoadPosition);
            }
            while (!this.loadCanceled && this.extractor.read(defaultExtractorInputPrepareExtraction)) {
                try {
                    try {
                    } catch (EOFException e6) {
                        if ((this.trackFormat.roleFlags & 16384) == 0) {
                            throw e6;
                        }
                        this.extractor.onTruncatedSegmentParsed();
                        position = defaultExtractorInputPrepareExtraction.getPosition();
                        j = dataSpec.position;
                    }
                } catch (Throwable th) {
                    this.nextLoadPosition = (int) (defaultExtractorInputPrepareExtraction.getPosition() - dataSpec.position);
                    throw th;
                }
            }
            position = defaultExtractorInputPrepareExtraction.getPosition();
            j = dataSpec.position;
            this.nextLoadPosition = (int) (position - j);
            DataSourceUtil.closeQuietly(dataSource);
        } catch (Throwable th2) {
            DataSourceUtil.closeQuietly(dataSource);
            throw th2;
        }
    }

    private static byte[] getEncryptionIvArray(String str) {
        if (AbstractC1909d.i0(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    public static boolean lambda$peekId3PrivTimestamp$0(PrivFrame privFrame) {
        return privFrame.owner.equals(PRIV_TIMESTAMP_FRAME_OWNER);
    }

    @RequiresNonNull({"output"})
    private void loadMedia() {
        feedDataToExtractor(this.dataSource, this.dataSpec, this.mediaSegmentEncrypted, true);
    }

    @RequiresNonNull({"output"})
    private void maybeLoadInitData() {
        if (this.initDataLoadRequired) {
            this.initDataSource.getClass();
            this.initDataSpec.getClass();
            feedDataToExtractor(this.initDataSource, this.initDataSpec, this.initSegmentEncrypted, false);
            this.nextLoadPosition = 0;
            this.initDataLoadRequired = false;
        }
    }

    private long peekId3PrivTimestamp(ExtractorInput extractorInput) throws Throwable {
        PrivFrame privFrame;
        extractorInput.resetPeekPosition();
        try {
            this.scratchId3Data.reset(10);
            extractorInput.peekFully(this.scratchId3Data.getData(), 0, 10);
            if (this.scratchId3Data.readUnsignedInt24() != 4801587) {
                return C.TIME_UNSET;
            }
            this.scratchId3Data.skipBytes(3);
            int synchSafeInt = this.scratchId3Data.readSynchSafeInt();
            int i3 = synchSafeInt + 10;
            if (i3 > this.scratchId3Data.capacity()) {
                byte[] data = this.scratchId3Data.getData();
                this.scratchId3Data.reset(i3);
                System.arraycopy(data, 0, this.scratchId3Data.getData(), 0, 10);
            }
            extractorInput.peekFully(this.scratchId3Data.getData(), 10, synchSafeInt);
            Metadata metadataDecode = this.id3Decoder.decode(this.scratchId3Data.getData(), synchSafeInt);
            if (metadataDecode == null || (privFrame = (PrivFrame) metadataDecode.getFirstMatchingEntry(PrivFrame.class, new i())) == null) {
                return C.TIME_UNSET;
            }
            System.arraycopy(privFrame.privateData, 0, this.scratchId3Data.getData(), 0, 8);
            this.scratchId3Data.setPosition(0);
            this.scratchId3Data.setLimit(8);
            return this.scratchId3Data.readLong() & 8589934591L;
        } catch (EOFException unused) {
            return C.TIME_UNSET;
        }
    }

    @EnsuresNonNull({"extractor"})
    @RequiresNonNull({"output"})
    private DefaultExtractorInput prepareExtraction(DataSource dataSource, DataSpec dataSpec, boolean z6) throws Throwable {
        HlsMediaChunkExtractor hlsMediaChunkExtractorCreateExtractor;
        long jOpen = dataSource.open(dataSpec);
        if (z6) {
            try {
                this.timestampAdjuster.sharedInitializeOrWait(this.isPrimaryTimestampSource, this.startTimeUs, this.timestampAdjusterInitializationTimeoutMs);
            } catch (InterruptedException unused) {
                throw new InterruptedIOException();
            } catch (TimeoutException e6) {
                throw new IOException(e6);
            }
        }
        DefaultExtractorInput defaultExtractorInput = new DefaultExtractorInput(dataSource, dataSpec.position, jOpen);
        if (this.extractor == null) {
            long jPeekId3PrivTimestamp = peekId3PrivTimestamp(defaultExtractorInput);
            defaultExtractorInput.resetPeekPosition();
            HlsMediaChunkExtractor hlsMediaChunkExtractor = this.previousExtractor;
            if (hlsMediaChunkExtractor != null) {
                hlsMediaChunkExtractorCreateExtractor = hlsMediaChunkExtractor.recreate();
            } else {
                hlsMediaChunkExtractorCreateExtractor = this.extractorFactory.createExtractor(dataSpec.uri, this.trackFormat, this.muxedCaptionFormats, this.timestampAdjuster, dataSource.getResponseHeaders(), defaultExtractorInput, this.playerId);
                defaultExtractorInput = defaultExtractorInput;
            }
            this.extractor = hlsMediaChunkExtractorCreateExtractor;
            if (hlsMediaChunkExtractorCreateExtractor.isPackedAudioExtractor()) {
                this.output.setSampleOffsetUs(jPeekId3PrivTimestamp != C.TIME_UNSET ? this.timestampAdjuster.adjustTsTimestamp(jPeekId3PrivTimestamp) : this.startTimeUs);
            } else {
                this.output.setSampleOffsetUs(0L);
            }
            this.output.onNewExtractor();
            this.extractor.init(this.output);
        }
        this.output.setDrmInitData(this.drmInitData);
        return defaultExtractorInput;
    }

    public static boolean shouldSpliceIn(HlsMediaChunk hlsMediaChunk, long j, Uri uri, boolean z6, HlsChunkSource.SegmentBaseHolder segmentBaseHolder, long j9) {
        if (hlsMediaChunk == null) {
            return false;
        }
        if (uri.equals(hlsMediaChunk.playlistUrl) && hlsMediaChunk.loadCompleted) {
            return false;
        }
        return !z6 || j9 + segmentBaseHolder.segmentBase.relativeStartTimeUs < j;
    }

    @Override
    public void cancelLoad() {
        this.loadCanceled = true;
    }

    public void clearShouldSpliceIn() {
        this.shouldSpliceIn = false;
    }

    public int getFirstSampleIndex(int i3) {
        AbstractC1864o0.Y(!this.shouldSpliceIn);
        if (i3 >= this.sampleQueueFirstSampleIndices.size()) {
            return 0;
        }
        return ((Integer) this.sampleQueueFirstSampleIndices.get(i3)).intValue();
    }

    public long getPublishedEndTimeUs() {
        long j = this.publishedDurationUs;
        return j != C.TIME_UNSET ? this.startTimeUs + j : C.TIME_UNSET;
    }

    public void init(HlsSampleStreamWrapper hlsSampleStreamWrapper, AbstractC2186b0 abstractC2186b0) {
        this.output = hlsSampleStreamWrapper;
        this.sampleQueueFirstSampleIndices = abstractC2186b0;
    }

    public void invalidateExtractor() {
        this.extractorInvalidated = true;
    }

    @Override
    public boolean isLoadCompleted() {
        return this.loadCompleted;
    }

    public boolean isPublished() {
        return this.publishedDurationUs != C.TIME_UNSET;
    }

    @Override
    public void load() {
        HlsMediaChunkExtractor hlsMediaChunkExtractor;
        this.output.getClass();
        if (this.extractor == null && (hlsMediaChunkExtractor = this.previousExtractor) != null && hlsMediaChunkExtractor.isReusable()) {
            this.extractor = this.previousExtractor;
            this.initDataLoadRequired = false;
        }
        maybeLoadInitData();
        if (this.loadCanceled) {
            return;
        }
        if (!this.hasGapTag) {
            loadMedia();
        }
        this.loadCompleted = !this.loadCanceled;
    }

    public void publish(long j) {
        this.publishedDurationUs = j;
    }

    public boolean shouldSpliceIn() {
        return this.shouldSpliceIn;
    }
}
