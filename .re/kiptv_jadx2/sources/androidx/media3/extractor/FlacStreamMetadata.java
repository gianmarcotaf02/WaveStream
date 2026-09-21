package androidx.media3.extractor;

import androidx.media3.common.C;
import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.Util;
import androidx.media3.container.OpusUtil;
import androidx.media3.extractor.metadata.flac.PictureFrame;
import androidx.media3.session.legacy.PlaybackStateCompat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class FlacStreamMetadata {
    public static final int NOT_IN_LOOKUP_TABLE = -1;
    private static final String TAG = "FlacStreamMetadata";
    public final int bitsPerSample;
    public final int bitsPerSampleLookupKey;
    public final int channels;
    public final int maxBlockSizeSamples;
    public final int maxFrameSize;
    private final Metadata metadata;
    public final int minBlockSizeSamples;
    public final int minFrameSize;
    public final int sampleRate;
    public final int sampleRateLookupKey;
    public final SeekTable seekTable;
    public final long totalSamples;

    public static class SeekTable {
        public final long[] pointOffsets;
        public final long[] pointSampleNumbers;

        public SeekTable(long[] jArr, long[] jArr2) {
            this.pointSampleNumbers = jArr;
            this.pointOffsets = jArr2;
        }
    }

    public FlacStreamMetadata(byte[] bArr, int i3) {
        ParsableBitArray parsableBitArray = new ParsableBitArray(bArr);
        parsableBitArray.setPosition(i3 * 8);
        this.minBlockSizeSamples = parsableBitArray.readBits(16);
        this.maxBlockSizeSamples = parsableBitArray.readBits(16);
        this.minFrameSize = parsableBitArray.readBits(24);
        this.maxFrameSize = parsableBitArray.readBits(24);
        int bits = parsableBitArray.readBits(20);
        this.sampleRate = bits;
        this.sampleRateLookupKey = getSampleRateLookupKey(bits);
        this.channels = parsableBitArray.readBits(3) + 1;
        int bits2 = parsableBitArray.readBits(5) + 1;
        this.bitsPerSample = bits2;
        this.bitsPerSampleLookupKey = getBitsPerSampleLookupKey(bits2);
        this.totalSamples = parsableBitArray.readBitsToLong(36);
        this.seekTable = null;
        this.metadata = null;
    }

    private static Metadata concatenateVorbisMetadata(List<String> list, List<PictureFrame> list2) {
        Metadata vorbisComments = VorbisUtil.parseVorbisComments(list);
        if (vorbisComments == null && list2.isEmpty()) {
            return null;
        }
        return new Metadata(list2).copyWithAppendedEntriesFrom(vorbisComments);
    }

    private static int getBitsPerSampleLookupKey(int i3) {
        if (i3 == 8) {
            return 1;
        }
        if (i3 == 12) {
            return 2;
        }
        if (i3 == 16) {
            return 4;
        }
        if (i3 == 20) {
            return 5;
        }
        if (i3 != 24) {
            return i3 != 32 ? -1 : 7;
        }
        return 6;
    }

    private static int getSampleRateLookupKey(int i3) {
        switch (i3) {
            case 8000:
                return 4;
            case AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case OpusUtil.SAMPLE_RATE:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND:
                return 3;
            default:
                return -1;
        }
    }

    public FlacStreamMetadata copyWithPictureFrames(List<PictureFrame> list) {
        return new FlacStreamMetadata(this.minBlockSizeSamples, this.maxBlockSizeSamples, this.minFrameSize, this.maxFrameSize, this.sampleRate, this.channels, this.bitsPerSample, this.totalSamples, this.seekTable, getMetadataCopyWithAppendedEntriesFrom(new Metadata(list)));
    }

    public FlacStreamMetadata copyWithSeekTable(SeekTable seekTable) {
        return new FlacStreamMetadata(this.minBlockSizeSamples, this.maxBlockSizeSamples, this.minFrameSize, this.maxFrameSize, this.sampleRate, this.channels, this.bitsPerSample, this.totalSamples, seekTable, this.metadata);
    }

    public FlacStreamMetadata copyWithVorbisComments(List<String> list) {
        return new FlacStreamMetadata(this.minBlockSizeSamples, this.maxBlockSizeSamples, this.minFrameSize, this.maxFrameSize, this.sampleRate, this.channels, this.bitsPerSample, this.totalSamples, this.seekTable, getMetadataCopyWithAppendedEntriesFrom(VorbisUtil.parseVorbisComments(list)));
    }

    public long getApproxBytesPerFrame() {
        long j;
        long j9;
        int i3 = this.maxFrameSize;
        if (i3 > 0) {
            j = (((long) i3) + ((long) this.minFrameSize)) / 2;
            j9 = 1;
        } else {
            int i9 = this.minBlockSizeSamples;
            j = ((((i9 != this.maxBlockSizeSamples || i9 <= 0) ? PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM : i9) * ((long) this.channels)) * ((long) this.bitsPerSample)) / 8;
            j9 = 64;
        }
        return j + j9;
    }

    public int getDecodedBitrate() {
        return this.bitsPerSample * this.sampleRate * this.channels;
    }

    public long getDurationUs() {
        long j = this.totalSamples;
        return j == 0 ? C.TIME_UNSET : (j * 1000000) / ((long) this.sampleRate);
    }

    public Format getFormat(byte[] bArr, Metadata metadata) {
        bArr[4] = -128;
        int i3 = this.maxFrameSize;
        if (i3 <= 0) {
            i3 = -1;
        }
        return new Format.Builder().setSampleMimeType(MimeTypes.AUDIO_FLAC).setMaxInputSize(i3).setChannelCount(this.channels).setSampleRate(this.sampleRate).setPcmEncoding(Util.getPcmEncoding(this.bitsPerSample)).setInitializationData(Collections.singletonList(bArr)).setMetadata(getMetadataCopyWithAppendedEntriesFrom(metadata)).build();
    }

    public int getMaxDecodedFrameSize() {
        return (this.bitsPerSample / 8) * this.maxBlockSizeSamples * this.channels;
    }

    public Metadata getMetadataCopyWithAppendedEntriesFrom(Metadata metadata) {
        Metadata metadata2 = this.metadata;
        return metadata2 == null ? metadata : metadata2.copyWithAppendedEntriesFrom(metadata);
    }

    public long getSampleNumber(long j) {
        return Util.constrainValue((j * ((long) this.sampleRate)) / 1000000, 0L, this.totalSamples - 1);
    }

    public FlacStreamMetadata(int i3, int i9, int i10, int i11, int i12, int i13, int i14, long j, ArrayList<String> arrayList, ArrayList<PictureFrame> arrayList2) {
        this(i3, i9, i10, i11, i12, i13, i14, j, (SeekTable) null, concatenateVorbisMetadata(arrayList, arrayList2));
    }

    public FlacStreamMetadata(int i3, int i9, int i10, int i11, int i12, int i13, int i14, long j, SeekTable seekTable, Metadata metadata) {
        this.minBlockSizeSamples = i3;
        this.maxBlockSizeSamples = i9;
        this.minFrameSize = i10;
        this.maxFrameSize = i11;
        this.sampleRate = i12;
        this.sampleRateLookupKey = getSampleRateLookupKey(i12);
        this.channels = i13;
        this.bitsPerSample = i14;
        this.bitsPerSampleLookupKey = getBitsPerSampleLookupKey(i14);
        this.totalSamples = j;
        this.seekTable = seekTable;
        this.metadata = metadata;
    }
}
