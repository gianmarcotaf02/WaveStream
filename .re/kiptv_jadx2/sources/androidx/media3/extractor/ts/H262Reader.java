package androidx.media3.extractor.ts;

import android.util.Pair;
import androidx.media3.common.C;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.container.NalUnitUtil;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.TrackOutput;
import java.util.Arrays;
import java.util.Collections;

public final class H262Reader implements ElementaryStreamReader {
    private static final double[] FRAME_RATE_VALUES = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    private static final int START_EXTENSION = 181;
    private static final int START_GROUP = 184;
    private static final int START_PICTURE = 0;
    private static final int START_SEQUENCE_HEADER = 179;
    private static final int START_USER_DATA = 178;
    private final String containerMimeType;
    private final CsdBuffer csdBuffer;
    private String formatId;
    private long frameDurationUs;
    private boolean hasOutputFormat;
    private TrackOutput output;
    private long pesTimeUs;
    private final boolean[] prefixFlags;
    private boolean sampleHasPicture;
    private boolean sampleIsKeyframe;
    private long samplePosition;
    private long sampleTimeUs;
    private boolean startedFirstSample;
    private long totalBytesWritten;
    private final NalUnitTargetBuffer userData;
    private final ParsableByteArray userDataParsable;
    private final UserDataReader userDataReader;

    public static final class CsdBuffer {
        private static final byte[] START_CODE = {0, 0, 1};
        public byte[] data;
        private boolean isFilling;
        public int length;
        public int sequenceExtensionPosition;

        public CsdBuffer(int i3) {
            this.data = new byte[i3];
        }

        public void onData(byte[] bArr, int i3, int i9) {
            if (this.isFilling) {
                int i10 = i9 - i3;
                byte[] bArr2 = this.data;
                int length = bArr2.length;
                int i11 = this.length;
                if (length < i11 + i10) {
                    this.data = Arrays.copyOf(bArr2, (i11 + i10) * 2);
                }
                System.arraycopy(bArr, i3, this.data, this.length, i10);
                this.length += i10;
            }
        }

        public boolean onStartCode(int i3, int i9) {
            if (this.isFilling) {
                int i10 = this.length - i9;
                this.length = i10;
                if (this.sequenceExtensionPosition != 0 || i3 != H262Reader.START_EXTENSION) {
                    this.isFilling = false;
                    return true;
                }
                this.sequenceExtensionPosition = i10;
            } else if (i3 == H262Reader.START_SEQUENCE_HEADER) {
                this.isFilling = true;
            }
            byte[] bArr = START_CODE;
            onData(bArr, 0, bArr.length);
            return false;
        }

        public void reset() {
            this.isFilling = false;
            this.length = 0;
            this.sequenceExtensionPosition = 0;
        }
    }

    public H262Reader(String str) {
        this(null, str);
    }

    private static Pair<Format, Long> parseCsdBuffer(CsdBuffer csdBuffer, String str, String str2) {
        float f9;
        int i3;
        float f10;
        int i9;
        long j;
        double[] dArr;
        double d4;
        int i10;
        int i11;
        byte[] bArrCopyOf = Arrays.copyOf(csdBuffer.data, csdBuffer.length);
        int i12 = bArrCopyOf[4] & 255;
        byte b9 = bArrCopyOf[5];
        int i13 = (i12 << 4) | ((b9 & 255) >> 4);
        int i14 = ((b9 & 15) << 8) | (bArrCopyOf[6] & 255);
        int i15 = (bArrCopyOf[7] & 240) >> 4;
        if (i15 == 2) {
            f9 = i14 * 4;
            i3 = i13 * 3;
        } else {
            if (i15 != 3) {
                if (i15 != 4) {
                    f10 = 1.0f;
                } else {
                    f9 = i14 * 121;
                    i3 = i13 * 100;
                }
                Format formatBuild = new Format.Builder().setId(str).setContainerMimeType(str2).setSampleMimeType(MimeTypes.VIDEO_MPEG2).setWidth(i13).setHeight(i14).setPixelWidthHeightRatio(f10).setInitializationData(Collections.singletonList(bArrCopyOf)).build();
                i9 = (bArrCopyOf[7] & 15) - 1;
                if (i9 >= 0) {
                    dArr = FRAME_RATE_VALUES;
                    if (i9 < dArr.length) {
                        d4 = dArr[i9];
                        byte b10 = bArrCopyOf[csdBuffer.sequenceExtensionPosition + 9];
                        i10 = (b10 & 96) >> 5;
                        i11 = b10 & 31;
                        if (i10 != i11) {
                            d4 *= (((double) i10) + 1.0d) / ((double) (i11 + 1));
                        }
                        j = (long) (1000000.0d / d4);
                    } else {
                        j = 0;
                    }
                } else {
                    j = 0;
                }
                return Pair.create(formatBuild, Long.valueOf(j));
            }
            f9 = i14 * 16;
            i3 = i13 * 9;
        }
        f10 = f9 / i3;
        Format formatBuild2 = new Format.Builder().setId(str).setContainerMimeType(str2).setSampleMimeType(MimeTypes.VIDEO_MPEG2).setWidth(i13).setHeight(i14).setPixelWidthHeightRatio(f10).setInitializationData(Collections.singletonList(bArrCopyOf)).build();
        i9 = (bArrCopyOf[7] & 15) - 1;
        if (i9 >= 0) {
            dArr = FRAME_RATE_VALUES;
            if (i9 < dArr.length) {
                d4 = dArr[i9];
                byte b11 = bArrCopyOf[csdBuffer.sequenceExtensionPosition + 9];
                i10 = (b11 & 96) >> 5;
                i11 = b11 & 31;
                if (i10 != i11) {
                    d4 *= (((double) i10) + 1.0d) / ((double) (i11 + 1));
                }
                j = (long) (1000000.0d / d4);
            } else {
                j = 0;
            }
        } else {
            j = 0;
        }
        return Pair.create(formatBuild2, Long.valueOf(j));
    }

    @Override
    public void consume(ParsableByteArray parsableByteArray) {
        boolean z6;
        int i3;
        this.output.getClass();
        int position = parsableByteArray.getPosition();
        int iLimit = parsableByteArray.limit();
        byte[] data = parsableByteArray.getData();
        this.totalBytesWritten += (long) parsableByteArray.bytesLeft();
        this.output.sampleData(parsableByteArray, parsableByteArray.bytesLeft());
        while (true) {
            int iFindNalUnit = NalUnitUtil.findNalUnit(data, position, iLimit, this.prefixFlags);
            if (iFindNalUnit == iLimit) {
                break;
            }
            int i9 = iFindNalUnit + 3;
            int i10 = parsableByteArray.getData()[i9] & 255;
            int i11 = iFindNalUnit - position;
            if (!this.hasOutputFormat) {
                if (i11 > 0) {
                    this.csdBuffer.onData(data, position, iFindNalUnit);
                }
                if (this.csdBuffer.onStartCode(i10, i11 < 0 ? -i11 : 0)) {
                    CsdBuffer csdBuffer = this.csdBuffer;
                    String str = this.formatId;
                    str.getClass();
                    Pair<Format, Long> csdBuffer2 = parseCsdBuffer(csdBuffer, str, this.containerMimeType);
                    this.output.format((Format) csdBuffer2.first);
                    this.frameDurationUs = ((Long) csdBuffer2.second).longValue();
                    this.hasOutputFormat = true;
                }
            }
            NalUnitTargetBuffer nalUnitTargetBuffer = this.userData;
            if (nalUnitTargetBuffer != null) {
                if (i11 > 0) {
                    nalUnitTargetBuffer.appendToNalUnit(data, position, iFindNalUnit);
                    i3 = 0;
                } else {
                    i3 = -i11;
                }
                if (this.userData.endNalUnit(i3)) {
                    NalUnitTargetBuffer nalUnitTargetBuffer2 = this.userData;
                    ((ParsableByteArray) Util.castNonNull(this.userDataParsable)).reset(this.userData.nalData, NalUnitUtil.unescapeStream(nalUnitTargetBuffer2.nalData, nalUnitTargetBuffer2.nalLength));
                    ((UserDataReader) Util.castNonNull(this.userDataReader)).consume(this.sampleTimeUs, this.userDataParsable);
                }
                if (i10 == START_USER_DATA && parsableByteArray.getData()[iFindNalUnit + 2] == 1) {
                    this.userData.startNalUnit(i10);
                }
            }
            if (i10 == 0 || i10 == START_SEQUENCE_HEADER) {
                int i12 = iLimit - iFindNalUnit;
                if (this.sampleHasPicture && this.hasOutputFormat) {
                    long j = this.sampleTimeUs;
                    if (j != C.TIME_UNSET) {
                        this.output.sampleMetadata(j, this.sampleIsKeyframe ? 1 : 0, ((int) (this.totalBytesWritten - this.samplePosition)) - i12, i12, null);
                    }
                }
                if (!this.startedFirstSample || this.sampleHasPicture) {
                    this.samplePosition = this.totalBytesWritten - ((long) i12);
                    long j9 = this.pesTimeUs;
                    if (j9 == C.TIME_UNSET) {
                        long j10 = this.sampleTimeUs;
                        j9 = j10 != C.TIME_UNSET ? j10 + this.frameDurationUs : -9223372036854775807L;
                    }
                    this.sampleTimeUs = j9;
                    this.sampleIsKeyframe = false;
                    this.pesTimeUs = C.TIME_UNSET;
                    z6 = true;
                    this.startedFirstSample = true;
                } else {
                    z6 = true;
                }
                this.sampleHasPicture = i10 == 0 ? z6 : false;
            } else {
                if (i10 == START_GROUP) {
                    this.sampleIsKeyframe = true;
                }
                iLimit = iLimit;
            }
            iLimit = iLimit;
            position = i9;
        }
        if (!this.hasOutputFormat) {
            this.csdBuffer.onData(data, position, iLimit);
        }
        NalUnitTargetBuffer nalUnitTargetBuffer3 = this.userData;
        if (nalUnitTargetBuffer3 != null) {
            nalUnitTargetBuffer3.appendToNalUnit(data, position, iLimit);
        }
    }

    @Override
    public void createTracks(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        trackIdGenerator.generateNewId();
        this.formatId = trackIdGenerator.getFormatId();
        this.output = extractorOutput.track(trackIdGenerator.getTrackId(), 2);
        UserDataReader userDataReader = this.userDataReader;
        if (userDataReader != null) {
            userDataReader.createTracks(extractorOutput, trackIdGenerator);
        }
    }

    @Override
    public void packetFinished(boolean z6) {
        this.output.getClass();
        if (z6) {
            boolean z9 = this.sampleIsKeyframe;
            this.output.sampleMetadata(this.sampleTimeUs, z9 ? 1 : 0, (int) (this.totalBytesWritten - this.samplePosition), 0, null);
        }
    }

    @Override
    public void packetStarted(long j, int i3) {
        this.pesTimeUs = j;
    }

    @Override
    public void seek() {
        NalUnitUtil.clearPrefixFlags(this.prefixFlags);
        this.csdBuffer.reset();
        NalUnitTargetBuffer nalUnitTargetBuffer = this.userData;
        if (nalUnitTargetBuffer != null) {
            nalUnitTargetBuffer.reset();
        }
        this.totalBytesWritten = 0L;
        this.startedFirstSample = false;
        this.pesTimeUs = C.TIME_UNSET;
        this.sampleTimeUs = C.TIME_UNSET;
    }

    public H262Reader(UserDataReader userDataReader, String str) {
        this.userDataReader = userDataReader;
        this.containerMimeType = str;
        this.prefixFlags = new boolean[4];
        this.csdBuffer = new CsdBuffer(128);
        if (userDataReader != null) {
            this.userData = new NalUnitTargetBuffer(START_USER_DATA, 128);
            this.userDataParsable = new ParsableByteArray();
        } else {
            this.userData = null;
            this.userDataParsable = null;
        }
        this.pesTimeUs = C.TIME_UNSET;
        this.sampleTimeUs = C.TIME_UNSET;
    }
}
