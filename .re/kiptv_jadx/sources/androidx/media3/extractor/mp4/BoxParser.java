package androidx.media3.extractor.mp4;

/* JADX INFO: loaded from: classes.dex */
public final class BoxParser {
    private static final int EDIT_LIST_DURATION_TOLERANCE_TIMESCALE_UNITS = 2;
    private static final int MAX_GAPLESS_TRIM_SIZE_SAMPLES = 4;
    private static final int SAMPLE_RATE_AMR_NB = 8000;
    private static final int SAMPLE_RATE_AMR_WB = 16000;
    private static final java.lang.String TAG = "BoxParsers";
    private static final int TYPE_clcp = 1668047728;
    private static final int TYPE_mdta = 1835299937;
    private static final int TYPE_meta = 1835365473;
    private static final int TYPE_nclc = 1852009571;
    private static final int TYPE_nclx = 1852009592;
    private static final int TYPE_sbtl = 1935832172;
    private static final int TYPE_soun = 1936684398;
    private static final int TYPE_subp = 1937072752;
    private static final int TYPE_subt = 1937072756;
    private static final int TYPE_text = 1952807028;
    private static final int TYPE_vide = 1986618469;
    private static final byte[] opusMagic = androidx.media3.common.util.Util.getUtf8Bytes("OpusHead");

    public static final class BtrtData {
        private final long avgBitrate;
        private final long maxBitrate;

        public BtrtData(long j, long j9) {
            this.avgBitrate = j;
            this.maxBitrate = j9;
        }
    }

    public static final class ChunkIterator {
        private final androidx.media3.common.util.ParsableByteArray chunkOffsets;
        private final boolean chunkOffsetsAreLongs;
        public int index;
        public final int length;
        private int nextSamplesPerChunkChangeIndex;
        public int numSamples;
        public long offset;
        private int remainingSamplesPerChunkChanges;
        private final androidx.media3.common.util.ParsableByteArray stsc;

        public ChunkIterator(androidx.media3.common.util.ParsableByteArray parsableByteArray, androidx.media3.common.util.ParsableByteArray parsableByteArray2, boolean z6) throws androidx.media3.common.ParserException {
            this.stsc = parsableByteArray;
            this.chunkOffsets = parsableByteArray2;
            this.chunkOffsetsAreLongs = z6;
            parsableByteArray2.setPosition(12);
            this.length = parsableByteArray2.readUnsignedIntToInt();
            parsableByteArray.setPosition(12);
            this.remainingSamplesPerChunkChanges = parsableByteArray.readUnsignedIntToInt();
            androidx.media3.extractor.ExtractorUtil.checkContainerInput(parsableByteArray.readInt() == 1, "first_chunk must be 1");
            this.index = -1;
        }

        public boolean moveNext() {
            int i3 = this.index + 1;
            this.index = i3;
            if (i3 == this.length) {
                return false;
            }
            this.offset = this.chunkOffsetsAreLongs ? this.chunkOffsets.readUnsignedLongToLong() : this.chunkOffsets.readUnsignedInt();
            if (this.index == this.nextSamplesPerChunkChangeIndex) {
                this.numSamples = this.stsc.readUnsignedIntToInt();
                this.stsc.skipBytes(4);
                int i9 = this.remainingSamplesPerChunkChanges - 1;
                this.remainingSamplesPerChunkChanges = i9;
                this.nextSamplesPerChunkChangeIndex = i9 > 0 ? this.stsc.readUnsignedIntToInt() - 1 : -1;
            }
            return true;
        }
    }

    public static final class EsdsData {
        private final long bitrate;
        private final byte[] initializationData;
        private final java.lang.String mimeType;
        private final long peakBitrate;

        public EsdsData(java.lang.String str, byte[] bArr, long j, long j9) {
            this.mimeType = str;
            this.initializationData = bArr;
            this.bitrate = j;
            this.peakBitrate = j9;
        }
    }

    public static final class EyesData {
        private final androidx.media3.extractor.mp4.BoxParser.StriData striData;

        public EyesData(androidx.media3.extractor.mp4.BoxParser.StriData striData) {
            this.striData = striData;
        }
    }

    public static final class MdhdData {
        private final java.lang.String language;
        private final long mediaDurationUs;
        private final long timescale;

        public MdhdData(long j, long j9, java.lang.String str) {
            this.timescale = j;
            this.mediaDurationUs = j9;
            this.language = str;
        }
    }

    public interface SampleSizeBox {
        int getFixedSampleSize();

        int getSampleCount();

        int readNextSampleSize();
    }

    public static final class StriData {
        private final boolean eyeViewsReversed;
        private final boolean hasLeftEyeView;
        private final boolean hasRightEyeView;

        public StriData(boolean z6, boolean z9, boolean z10) {
            this.hasLeftEyeView = z6;
            this.hasRightEyeView = z9;
            this.eyeViewsReversed = z10;
        }
    }

    public static final class StsdData {
        public static final int STSD_HEADER_SIZE = 8;
        public androidx.media3.common.Format format;
        public int nalUnitLengthFieldLength;
        public int requiredSampleTransformation = 0;
        public final androidx.media3.extractor.mp4.TrackEncryptionBox[] trackEncryptionBoxes;

        public StsdData(int i3) {
            this.trackEncryptionBoxes = new androidx.media3.extractor.mp4.TrackEncryptionBox[i3];
        }
    }

    public static final class StszSampleSizeBox implements androidx.media3.extractor.mp4.BoxParser.SampleSizeBox {
        private final androidx.media3.common.util.ParsableByteArray data;
        private final int fixedSampleSize;
        private final int sampleCount;

        public StszSampleSizeBox(androidx.media3.container.Mp4Box.LeafBox leafBox, androidx.media3.common.Format format) {
            androidx.media3.common.util.ParsableByteArray parsableByteArray = leafBox.data;
            this.data = parsableByteArray;
            parsableByteArray.setPosition(12);
            int unsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
            if (androidx.media3.common.MimeTypes.AUDIO_RAW.equals(format.sampleMimeType)) {
                int pcmFrameSize = androidx.media3.common.util.Util.getPcmFrameSize(format.pcmEncoding, format.channelCount);
                if (unsignedIntToInt % pcmFrameSize != 0) {
                    androidx.media3.common.util.Log.w(androidx.media3.extractor.mp4.BoxParser.TAG, "Audio sample size mismatch. stsd sample size: " + pcmFrameSize + ", stsz sample size: " + unsignedIntToInt);
                    unsignedIntToInt = pcmFrameSize;
                }
            }
            this.fixedSampleSize = unsignedIntToInt == 0 ? -1 : unsignedIntToInt;
            this.sampleCount = parsableByteArray.readUnsignedIntToInt();
        }

        @Override // androidx.media3.extractor.mp4.BoxParser.SampleSizeBox
        public int getFixedSampleSize() {
            return this.fixedSampleSize;
        }

        @Override // androidx.media3.extractor.mp4.BoxParser.SampleSizeBox
        public int getSampleCount() {
            return this.sampleCount;
        }

        @Override // androidx.media3.extractor.mp4.BoxParser.SampleSizeBox
        public int readNextSampleSize() {
            int i3 = this.fixedSampleSize;
            return i3 == -1 ? this.data.readUnsignedIntToInt() : i3;
        }
    }

    public static final class Stz2SampleSizeBox implements androidx.media3.extractor.mp4.BoxParser.SampleSizeBox {
        private int currentByte;
        private final androidx.media3.common.util.ParsableByteArray data;
        private final int fieldSize;
        private final int sampleCount;
        private int sampleIndex;

        public Stz2SampleSizeBox(androidx.media3.container.Mp4Box.LeafBox leafBox) {
            androidx.media3.common.util.ParsableByteArray parsableByteArray = leafBox.data;
            this.data = parsableByteArray;
            parsableByteArray.setPosition(12);
            this.fieldSize = parsableByteArray.readUnsignedIntToInt() & 255;
            this.sampleCount = parsableByteArray.readUnsignedIntToInt();
        }

        @Override // androidx.media3.extractor.mp4.BoxParser.SampleSizeBox
        public int getFixedSampleSize() {
            return -1;
        }

        @Override // androidx.media3.extractor.mp4.BoxParser.SampleSizeBox
        public int getSampleCount() {
            return this.sampleCount;
        }

        @Override // androidx.media3.extractor.mp4.BoxParser.SampleSizeBox
        public int readNextSampleSize() {
            int i3 = this.fieldSize;
            if (i3 == 8) {
                return this.data.readUnsignedByte();
            }
            if (i3 == 16) {
                return this.data.readUnsignedShort();
            }
            int i9 = this.sampleIndex;
            this.sampleIndex = i9 + 1;
            if (i9 % 2 != 0) {
                return this.currentByte & 15;
            }
            int unsignedByte = this.data.readUnsignedByte();
            this.currentByte = unsignedByte;
            return (unsignedByte & androidx.media3.extractor.ts.PsExtractor.VIDEO_STREAM_MASK) >> 4;
        }
    }

    public static final class TkhdData {
        private final int alternateGroup;
        private final long duration;
        private final int height;
        private final int id;
        private final int rotationDegrees;
        private final int width;

        public TkhdData(int i3, long j, int i9, int i10, int i11, int i12) {
            this.id = i3;
            this.duration = j;
            this.alternateGroup = i9;
            this.rotationDegrees = i10;
            this.width = i11;
            this.height = i12;
        }
    }

    public static final class VexuData {
        private final androidx.media3.extractor.mp4.BoxParser.EyesData eyesData;

        public VexuData(androidx.media3.extractor.mp4.BoxParser.EyesData eyesData) {
            this.eyesData = eyesData;
        }

        public boolean hasBothEyeViews() {
            androidx.media3.extractor.mp4.BoxParser.EyesData eyesData = this.eyesData;
            return eyesData != null && eyesData.striData.hasLeftEyeView && this.eyesData.striData.hasRightEyeView;
        }
    }

    private BoxParser() {
    }

    private static java.nio.ByteBuffer allocateHdrStaticInfo() {
        return java.nio.ByteBuffer.allocate(25).order(java.nio.ByteOrder.LITTLE_ENDIAN);
    }

    private static boolean canApplyEditWithGaplessInfo(long[] jArr, long j, long j9, long j10) {
        int length = jArr.length - 1;
        return jArr[0] <= j9 && j9 < jArr[androidx.media3.common.util.Util.constrainValue(4, 0, length)] && jArr[androidx.media3.common.util.Util.constrainValue(jArr.length - 4, 0, length)] < j10 && j10 <= j + 2;
    }

    private static int findBoxPosition(androidx.media3.common.util.ParsableByteArray parsableByteArray, int i3, int i9, int i10) throws androidx.media3.common.ParserException {
        int position = parsableByteArray.getPosition();
        androidx.media3.extractor.ExtractorUtil.checkContainerInput(position >= i9, null);
        while (position - i9 < i10) {
            parsableByteArray.setPosition(position);
            int i11 = parsableByteArray.readInt();
            androidx.media3.extractor.ExtractorUtil.checkContainerInput(i11 > 0, "childAtomSize must be positive");
            if (parsableByteArray.readInt() == i3) {
                return position;
            }
            position += i11;
        }
        return -1;
    }

    private static java.lang.String formatVobsubIdx(byte[] bArr, int i3, int i9) {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(bArr.length == 64);
        java.util.ArrayList arrayList = new java.util.ArrayList(16);
        for (int i10 = 0; i10 < bArr.length - 3; i10 += 4) {
            arrayList.add(java.lang.String.format("%06x", java.lang.Integer.valueOf(vobsubYuvToRgb(com.google.crypto.tink.shaded.protobuf.q0.u(bArr[i10], bArr[i10 + 1], bArr[i10 + 2], bArr[i10 + 3])))));
        }
        java.lang.StringBuilder sbS = p121o0.p.s(i3, i9, "size: ", "x", "\npalette: ");
        sbS.append(new p068h4.k(", ").b(arrayList));
        sbS.append("\n");
        return sbS.toString();
    }

    private static java.lang.String getLanguageFromCode(int i3) {
        char[] cArr = {(char) (((i3 >> 10) & 31) + 96), (char) (((i3 >> 5) & 31) + 96), (char) ((i3 & 31) + 96)};
        for (int i9 = 0; i9 < 3; i9++) {
            char c9 = cArr[i9];
            if (c9 < 'a' || c9 > 'z') {
                return null;
            }
        }
        return new java.lang.String(cArr);
    }

    private static int getTrackTypeForHdlr(int i3) {
        if (i3 == TYPE_soun) {
            return 1;
        }
        if (i3 == TYPE_vide) {
            return 2;
        }
        if (i3 == TYPE_text || i3 == TYPE_sbtl || i3 == TYPE_subt || i3 == TYPE_clcp || i3 == TYPE_subp) {
            return 3;
        }
        return i3 == 1835365473 ? 5 : -1;
    }

    public static void maybeSkipRemainingMetaBoxHeaderBytes(androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        int position = parsableByteArray.getPosition();
        parsableByteArray.skipBytes(4);
        if (parsableByteArray.readInt() != 1751411826) {
            position += 4;
        }
        parsableByteArray.setPosition(position);
    }

    private static androidx.media3.common.ColorInfo parseApvc(androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        androidx.media3.common.ColorInfo.Builder builder = new androidx.media3.common.ColorInfo.Builder();
        androidx.media3.common.util.ParsableBitArray parsableBitArray = new androidx.media3.common.util.ParsableBitArray(parsableByteArray.getData());
        parsableBitArray.setPosition(parsableByteArray.getPosition() * 8);
        parsableBitArray.skipBytes(1);
        int bits = parsableBitArray.readBits(8);
        for (int i3 = 0; i3 < bits; i3++) {
            parsableBitArray.skipBytes(1);
            int bits2 = parsableBitArray.readBits(8);
            for (int i9 = 0; i9 < bits2; i9++) {
                parsableBitArray.skipBits(6);
                boolean bit = parsableBitArray.readBit();
                parsableBitArray.skipBit();
                parsableBitArray.skipBytes(11);
                parsableBitArray.skipBits(4);
                int bits3 = parsableBitArray.readBits(4) + 8;
                builder.setLumaBitdepth(bits3);
                builder.setChromaBitdepth(bits3);
                parsableBitArray.skipBytes(1);
                if (bit) {
                    int bits4 = parsableBitArray.readBits(8);
                    int bits5 = parsableBitArray.readBits(8);
                    parsableBitArray.skipBytes(1);
                    builder.setColorSpace(androidx.media3.common.ColorInfo.isoColorPrimariesToColorSpace(bits4)).setColorRange(parsableBitArray.readBit() ? 1 : 2).setColorTransfer(androidx.media3.common.ColorInfo.isoTransferCharacteristicsToColorTransfer(bits5));
                }
            }
        }
        return builder.build();
    }

    /* JADX WARN: Code duplicated, block: B:142:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:144:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:146:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:149:0x0200  */
    /* JADX WARN: Code duplicated, block: B:151:0x0216  */
    /* JADX WARN: Code duplicated, block: B:153:0x0226  */
    /* JADX WARN: Code duplicated, block: B:156:0x0245  */
    /* JADX WARN: Code duplicated, block: B:157:0x024a  */
    /* JADX WARN: Code duplicated, block: B:161:0x0262  */
    /* JADX WARN: Code duplicated, block: B:163:0x0269  */
    /* JADX WARN: Code duplicated, block: B:165:0x0274  */
    /* JADX WARN: Code duplicated, block: B:167:0x027c  */
    /* JADX WARN: Code duplicated, block: B:168:0x0281  */
    /* JADX WARN: Code duplicated, block: B:169:0x028c  */
    /* JADX WARN: Code duplicated, block: B:174:0x0298  */
    /* JADX WARN: Code duplicated, block: B:208:0x03a6 A[PHI: r2 r8 r9 r13 r16 r24
  0x03a6: PHI (r2v17 java.util.List<byte[]>) = 
  (r2v2 java.util.List<byte[]>)
  (r2v2 java.util.List<byte[]>)
  (r2v16 java.util.List<byte[]>)
  (r2v2 java.util.List<byte[]>)
  (r2v26 java.util.List<byte[]>)
 binds: [B:241:0x0455, B:243:0x0463, B:246:0x046d, B:234:0x0419, B:207:0x0376] A[DONT_GENERATE, DONT_INLINE]
  0x03a6: PHI (r8v11 int) = (r8v8 int), (r8v8 int), (r8v8 int), (r8v8 int), (r8v15 int) binds: [B:241:0x0455, B:243:0x0463, B:246:0x046d, B:234:0x0419, B:207:0x0376] A[DONT_GENERATE, DONT_INLINE]
  0x03a6: PHI (r9v8 int) = (r9v5 int), (r9v5 int), (r9v5 int), (r9v5 int), (r9v10 int) binds: [B:241:0x0455, B:243:0x0463, B:246:0x046d, B:234:0x0419, B:207:0x0376] A[DONT_GENERATE, DONT_INLINE]
  0x03a6: PHI (r13v50 java.lang.String) = 
  (r13v48 java.lang.String)
  (r13v49 java.lang.String)
  (r13v49 java.lang.String)
  (r13v51 java.lang.String)
  (r13v48 java.lang.String)
 binds: [B:241:0x0455, B:243:0x0463, B:246:0x046d, B:234:0x0419, B:207:0x0376] A[DONT_GENERATE, DONT_INLINE]
  0x03a6: PHI (r16v3 androidx.media3.extractor.mp4.BoxParser$EsdsData) = 
  (r16v1 androidx.media3.extractor.mp4.BoxParser$EsdsData)
  (r16v2 androidx.media3.extractor.mp4.BoxParser$EsdsData)
  (r16v2 androidx.media3.extractor.mp4.BoxParser$EsdsData)
  (r16v1 androidx.media3.extractor.mp4.BoxParser$EsdsData)
  (r16v1 androidx.media3.extractor.mp4.BoxParser$EsdsData)
 binds: [B:241:0x0455, B:243:0x0463, B:246:0x046d, B:234:0x0419, B:207:0x0376] A[DONT_GENERATE, DONT_INLINE]
  0x03a6: PHI (r24v2 int) = (r24v1 int), (r24v1 int), (r24v1 int), (r24v3 int), (r24v4 int) binds: [B:241:0x0455, B:243:0x0463, B:246:0x046d, B:234:0x0419, B:207:0x0376] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:238:0x044d  */
    /* JADX WARN: Code duplicated, block: B:240:0x0450  */
    /* JADX WARN: Code duplicated, block: B:242:0x0457  */
    /* JADX WARN: Code duplicated, block: B:244:0x0465  */
    /* JADX WARN: Code duplicated, block: B:246:0x046d  */
    /* JADX WARN: Code duplicated, block: B:247:0x0473  */
    /* JADX WARN: Code duplicated, block: B:249:0x047b  */
    /* JADX WARN: Code duplicated, block: B:250:0x0486  */
    /* JADX WARN: Code duplicated, block: B:38:0x0095  */
    /* JADX WARN: Code duplicated, block: B:93:0x0156  */
    private static void parseAudioSampleEntry(androidx.media3.common.util.ParsableByteArray parsableByteArray, int i3, int i9, int i10, int i11, java.lang.String str, boolean z6, androidx.media3.common.DrmInitData drmInitData, androidx.media3.extractor.mp4.BoxParser.StsdData stsdData, int i12) throws androidx.media3.common.ParserException {
        int unsignedShort;
        int i13;
        int unsignedShort2;
        int unsignedFixedPoint1616;
        int i14;
        int i15;
        java.lang.String str2;
        int i16;
        java.util.List<byte[]> vorbisCsdFromEsdsInitializationData;
        java.lang.String str3;
        androidx.media3.extractor.mp4.BoxParser.EsdsData esdsFromParent;
        int i17;
        boolean z9;
        java.lang.String str4;
        int i18;
        java.lang.String str5;
        int iFindBoxPosition;
        byte[] bArr;
        java.lang.String str6;
        java.lang.String str7;
        int pcmEncoding;
        int i19;
        int unsignedByte;
        byte[] bArr2;
        int unsignedByte2;
        java.lang.String str8;
        byte[] bArr3;
        int iIntValue = i3;
        int i20 = i10;
        androidx.media3.common.DrmInitData drmInitDataCopyWithSchemeType = drmInitData;
        parsableByteArray.setPosition(i9 + 16);
        if (z6) {
            unsignedShort = parsableByteArray.readUnsignedShort();
            parsableByteArray.skipBytes(6);
        } else {
            parsableByteArray.skipBytes(8);
            unsignedShort = 0;
        }
        if (unsignedShort == 0 || unsignedShort == 1) {
            i13 = 2;
            unsignedShort2 = parsableByteArray.readUnsignedShort();
            parsableByteArray.skipBytes(6);
            unsignedFixedPoint1616 = parsableByteArray.readUnsignedFixedPoint1616();
            parsableByteArray.setPosition(parsableByteArray.getPosition() - 4);
            i14 = parsableByteArray.readInt();
            if (unsignedShort == 1) {
                parsableByteArray.skipBytes(16);
            }
            i15 = -1;
        } else {
            if (unsignedShort != 2) {
                return;
            }
            parsableByteArray.skipBytes(16);
            i13 = 2;
            unsignedFixedPoint1616 = (int) java.lang.Math.round(parsableByteArray.readDouble());
            int unsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
            parsableByteArray.skipBytes(4);
            int unsignedIntToInt2 = parsableByteArray.readUnsignedIntToInt();
            int unsignedIntToInt3 = parsableByteArray.readUnsignedIntToInt();
            boolean z10 = (unsignedIntToInt3 & 1) != 0;
            boolean z11 = (unsignedIntToInt3 & 2) != 0;
            if (z10) {
                if (z11 || unsignedIntToInt2 != 32) {
                    i15 = -1;
                } else {
                    i15 = 4;
                }
            } else if (unsignedIntToInt2 == 8) {
                i15 = 3;
            } else if (unsignedIntToInt2 == 16) {
                i15 = z11 ? 268435456 : 2;
            } else if (unsignedIntToInt2 == 24) {
                i15 = z11 ? androidx.media3.common.C.ENCODING_PCM_24BIT_BIG_ENDIAN : 21;
            } else if (unsignedIntToInt2 == 32) {
                i15 = z11 ? androidx.media3.common.C.ENCODING_PCM_32BIT_BIG_ENDIAN : 22;
            } else {
                i15 = -1;
            }
            parsableByteArray.skipBytes(8);
            unsignedShort2 = unsignedIntToInt;
            i14 = 0;
        }
        if (iIntValue == 1767992678) {
            unsignedFixedPoint1616 = -1;
            unsignedShort2 = -1;
        } else {
            if (iIntValue != 1935764850) {
                unsignedFixedPoint1616 = iIntValue == 1935767394 ? 16000 : 8000;
            }
            unsignedShort2 = 1;
        }
        int position = parsableByteArray.getPosition();
        if (iIntValue == 1701733217) {
            android.util.Pair<java.lang.Integer, androidx.media3.extractor.mp4.TrackEncryptionBox> sampleEntryEncryptionData = parseSampleEntryEncryptionData(parsableByteArray, i9, i20);
            if (sampleEntryEncryptionData != null) {
                iIntValue = ((java.lang.Integer) sampleEntryEncryptionData.first).intValue();
                drmInitDataCopyWithSchemeType = drmInitDataCopyWithSchemeType == null ? null : drmInitDataCopyWithSchemeType.copyWithSchemeType(((androidx.media3.extractor.mp4.TrackEncryptionBox) sampleEntryEncryptionData.second).schemeType);
                stsdData.trackEncryptionBoxes[i12] = (androidx.media3.extractor.mp4.TrackEncryptionBox) sampleEntryEncryptionData.second;
            }
            parsableByteArray.setPosition(position);
        }
        java.lang.String str9 = androidx.media3.common.MimeTypes.AUDIO_MPEGH_MHM1;
        if (iIntValue == 1633889587) {
            str2 = androidx.media3.common.MimeTypes.AUDIO_AC3;
        } else if (iIntValue == 1700998451) {
            str2 = androidx.media3.common.MimeTypes.AUDIO_E_AC3;
        } else if (iIntValue == 1633889588) {
            str2 = androidx.media3.common.MimeTypes.AUDIO_AC4;
        } else if (iIntValue == 1685353315) {
            str2 = androidx.media3.common.MimeTypes.AUDIO_DTS;
        } else if (iIntValue == 1685353320 || iIntValue == 1685353324) {
            str2 = androidx.media3.common.MimeTypes.AUDIO_DTS_HD;
        } else if (iIntValue == 1685353317) {
            str2 = androidx.media3.common.MimeTypes.AUDIO_DTS_EXPRESS;
        } else if (iIntValue == 1685353336) {
            str2 = androidx.media3.common.MimeTypes.AUDIO_DTS_X;
        } else if (iIntValue == 1935764850) {
            str2 = androidx.media3.common.MimeTypes.AUDIO_AMR_NB;
        } else {
            if (iIntValue != 1935767394) {
                if (iIntValue == 1936684916) {
                    i16 = i13;
                    str2 = androidx.media3.common.MimeTypes.AUDIO_RAW;
                } else if (iIntValue == 1953984371) {
                    str2 = androidx.media3.common.MimeTypes.AUDIO_RAW;
                    i16 = 268435456;
                } else if (iIntValue == 1819304813) {
                    if (i15 == -1) {
                        i16 = i13;
                    } else {
                        i16 = i15;
                    }
                    str2 = androidx.media3.common.MimeTypes.AUDIO_RAW;
                } else if (iIntValue == 778924082 || iIntValue == 778924083) {
                    str2 = androidx.media3.common.MimeTypes.AUDIO_MPEG;
                } else if (iIntValue == 1835557169) {
                    str2 = androidx.media3.common.MimeTypes.AUDIO_MPEGH_MHA1;
                } else if (iIntValue == 1835560241) {
                    i16 = i15;
                    str2 = androidx.media3.common.MimeTypes.AUDIO_MPEGH_MHM1;
                } else if (iIntValue == 1634492771) {
                    str2 = androidx.media3.common.MimeTypes.AUDIO_ALAC;
                } else if (iIntValue == 1634492791) {
                    str2 = androidx.media3.common.MimeTypes.AUDIO_ALAW;
                } else if (iIntValue == 1970037111) {
                    str2 = androidx.media3.common.MimeTypes.AUDIO_MLAW;
                } else if (iIntValue == 1332770163) {
                    str2 = androidx.media3.common.MimeTypes.AUDIO_OPUS;
                } else if (iIntValue == 1716281667) {
                    str2 = androidx.media3.common.MimeTypes.AUDIO_FLAC;
                } else if (iIntValue == 1835823201) {
                    str2 = androidx.media3.common.MimeTypes.AUDIO_TRUEHD;
                } else if (iIntValue == 1767992678) {
                    str2 = androidx.media3.common.MimeTypes.AUDIO_IAMF;
                } else {
                    i16 = i15;
                    str2 = null;
                }
                int pcmEncoding2 = i16;
                vorbisCsdFromEsdsInitializationData = null;
                str3 = null;
                esdsFromParent = null;
                androidx.media3.extractor.mp4.BoxParser.BtrtData btrtFromParent = null;
                while (position - i9 < i20) {
                    parsableByteArray.setPosition(position);
                    i17 = parsableByteArray.readInt();
                    if (i17 > 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    str4 = str3;
                    androidx.media3.extractor.ExtractorUtil.checkContainerInput(z9, "childAtomSize must be positive");
                    i18 = parsableByteArray.readInt();
                    if (i18 == 1835557187) {
                        parsableByteArray.setPosition(position + 8);
                        parsableByteArray.skipBytes(1);
                        unsignedByte2 = parsableByteArray.readUnsignedByte();
                        parsableByteArray.skipBytes(1);
                        if (java.util.Objects.equals(str2, str9)) {
                            str8 = java.lang.String.format("mhm1.%02X", java.lang.Integer.valueOf(unsignedByte2));
                        } else {
                            str8 = java.lang.String.format("mha1.%02X", java.lang.Integer.valueOf(unsignedByte2));
                        }
                        java.lang.String str10 = str8;
                        int unsignedShort3 = parsableByteArray.readUnsignedShort();
                        str4 = str10;
                        bArr3 = new byte[unsignedShort3];
                        str5 = str9;
                        parsableByteArray.readBytes(bArr3, 0, unsignedShort3);
                        if (vorbisCsdFromEsdsInitializationData == null) {
                            vorbisCsdFromEsdsInitializationData = p076i4.AbstractC2186b0.y(bArr3);
                        } else {
                            vorbisCsdFromEsdsInitializationData = p076i4.AbstractC2186b0.z(bArr3, vorbisCsdFromEsdsInitializationData.get(0));
                        }
                    } else {
                        str5 = str9;
                        if (i18 == 1835557200) {
                            parsableByteArray.setPosition(position + 8);
                            unsignedByte = parsableByteArray.readUnsignedByte();
                            if (unsignedByte > 0) {
                                bArr2 = new byte[unsignedByte];
                                parsableByteArray.readBytes(bArr2, 0, unsignedByte);
                                if (vorbisCsdFromEsdsInitializationData == null) {
                                    vorbisCsdFromEsdsInitializationData = p076i4.AbstractC2186b0.y(bArr2);
                                } else {
                                    vorbisCsdFromEsdsInitializationData = p076i4.AbstractC2186b0.z(vorbisCsdFromEsdsInitializationData.get(0), bArr2);
                                }
                            }
                        } else {
                            if (i18 != 1702061171 || (z6 && i18 == 2002876005)) {
                                if (i18 == 1702061171) {
                                    iFindBoxPosition = position;
                                } else {
                                    iFindBoxPosition = findBoxPosition(parsableByteArray, androidx.media3.container.Mp4Box.TYPE_esds, position, i17);
                                }
                                if (iFindBoxPosition != -1) {
                                    esdsFromParent = parseEsdsFromParent(parsableByteArray, iFindBoxPosition);
                                    str2 = esdsFromParent.mimeType;
                                    bArr = esdsFromParent.initializationData;
                                    if (bArr == null) {
                                        str7 = str4;
                                    } else if (androidx.media3.common.MimeTypes.AUDIO_VORBIS.equals(str2)) {
                                        vorbisCsdFromEsdsInitializationData = androidx.media3.extractor.VorbisUtil.parseVorbisCsdFromEsdsInitializationData(bArr);
                                        str7 = str4;
                                    } else {
                                        if (androidx.media3.common.MimeTypes.AUDIO_AAC.equals(str2)) {
                                            androidx.media3.extractor.AacUtil.Config audioSpecificConfig = androidx.media3.extractor.AacUtil.parseAudioSpecificConfig(bArr);
                                            unsignedFixedPoint1616 = audioSpecificConfig.sampleRateHz;
                                            unsignedShort2 = audioSpecificConfig.channelCount;
                                            str6 = audioSpecificConfig.codecs;
                                        } else {
                                            str6 = str4;
                                        }
                                        p076i4.S0 s0Y = p076i4.AbstractC2186b0.y(bArr);
                                        str7 = str6;
                                        vorbisCsdFromEsdsInitializationData = s0Y;
                                    }
                                } else {
                                    str7 = str4;
                                }
                            } else if (i18 == 1651798644) {
                                btrtFromParent = parseBtrtFromParent(parsableByteArray, position);
                            } else {
                                if (i18 == 1684103987) {
                                    parsableByteArray.setPosition(position + 8);
                                    stsdData.format = androidx.media3.extractor.Ac3Util.parseAc3AnnexFFormat(parsableByteArray, java.lang.Integer.toString(i11), str, drmInitDataCopyWithSchemeType);
                                } else if (i18 == 1684366131) {
                                    parsableByteArray.setPosition(position + 8);
                                    stsdData.format = androidx.media3.extractor.Ac3Util.parseEAc3AnnexFFormat(parsableByteArray, java.lang.Integer.toString(i11), str, drmInitDataCopyWithSchemeType);
                                } else if (i18 == 1684103988) {
                                    parsableByteArray.setPosition(position + 8);
                                    stsdData.format = androidx.media3.extractor.Ac4Util.parseAc4AnnexEFormat(parsableByteArray, java.lang.Integer.toString(i11), str, drmInitDataCopyWithSchemeType);
                                } else if (i18 != 1684892784) {
                                    if (i18 == 1684305011 || i18 == 1969517683) {
                                        stsdData.format = new androidx.media3.common.Format.Builder().setId(i11).setSampleMimeType(str2).setChannelCount(unsignedShort2).setSampleRate(unsignedFixedPoint1616).setDrmInitData(drmInitDataCopyWithSchemeType).setLanguage(str).build();
                                    } else if (i18 == 1682927731) {
                                        int i21 = i17 - 8;
                                        byte[] bArr4 = opusMagic;
                                        byte[] bArrCopyOf = java.util.Arrays.copyOf(bArr4, bArr4.length + i21);
                                        parsableByteArray.setPosition(position + 8);
                                        parsableByteArray.readBytes(bArrCopyOf, bArr4.length, i21);
                                        vorbisCsdFromEsdsInitializationData = androidx.media3.container.OpusUtil.buildInitializationData(bArrCopyOf);
                                    } else if (i18 == 1684425825) {
                                        byte[] bArr5 = new byte[i17 - 8];
                                        bArr5[0] = 102;
                                        bArr5[1] = 76;
                                        bArr5[i13] = 97;
                                        bArr5[3] = 67;
                                        parsableByteArray.setPosition(position + 12);
                                        parsableByteArray.readBytes(bArr5, 4, i17 - 12);
                                        vorbisCsdFromEsdsInitializationData = p076i4.AbstractC2186b0.y(bArr5);
                                    } else {
                                        if (i18 == 1634492771) {
                                            int i22 = i17 - 12;
                                            byte[] bArr6 = new byte[i22];
                                            parsableByteArray.setPosition(position + 12);
                                            parsableByteArray.readBytes(bArr6, 0, i22);
                                            int[] alacAudioSpecificConfig = androidx.media3.common.util.CodecSpecificDataUtil.parseAlacAudioSpecificConfig(bArr6);
                                            int i23 = alacAudioSpecificConfig[0];
                                            unsignedShort2 = alacAudioSpecificConfig[1];
                                            unsignedFixedPoint1616 = i23;
                                            pcmEncoding2 = androidx.media3.common.util.Util.getPcmEncoding(alacAudioSpecificConfig[i13]);
                                            vorbisCsdFromEsdsInitializationData = p076i4.AbstractC2186b0.y(bArr6);
                                        } else if (i18 == 1767990114) {
                                            parsableByteArray.setPosition(position + 9);
                                            int unsignedLeb128ToInt = parsableByteArray.readUnsignedLeb128ToInt();
                                            byte[] bArr7 = new byte[unsignedLeb128ToInt];
                                            parsableByteArray.readBytes(bArr7, 0, unsignedLeb128ToInt);
                                            java.lang.String strBuildIamfCodecString = androidx.media3.common.util.CodecSpecificDataUtil.buildIamfCodecString(bArr7);
                                            p076i4.S0 s0Y2 = p076i4.AbstractC2186b0.y(bArr7);
                                            str7 = strBuildIamfCodecString;
                                            vorbisCsdFromEsdsInitializationData = s0Y2;
                                        } else if (i18 == 1885564227) {
                                            parsableByteArray.setPosition(position + 12);
                                            java.nio.ByteOrder byteOrder = (parsableByteArray.readUnsignedByte() & 1) != 0 ? java.nio.ByteOrder.LITTLE_ENDIAN : java.nio.ByteOrder.BIG_ENDIAN;
                                            int unsignedByte3 = parsableByteArray.readUnsignedByte();
                                            if (iIntValue == 1768973165) {
                                                pcmEncoding = androidx.media3.common.util.Util.getPcmEncoding(unsignedByte3, byteOrder);
                                                i19 = -1;
                                            } else {
                                                pcmEncoding = (iIntValue == 1718641517 && unsignedByte3 == 32 && byteOrder.equals(java.nio.ByteOrder.LITTLE_ENDIAN)) ? 4 : pcmEncoding2;
                                                i19 = -1;
                                            }
                                            pcmEncoding2 = pcmEncoding;
                                            if (pcmEncoding != i19) {
                                                str2 = androidx.media3.common.MimeTypes.AUDIO_RAW;
                                            }
                                        }
                                        str7 = str4;
                                    }
                                    str7 = str4;
                                } else {
                                    if (i14 <= 0) {
                                        throw androidx.media3.common.ParserException.createForMalformedContainer("Invalid sample rate for Dolby TrueHD MLP stream: " + i14, null);
                                    }
                                    str7 = str4;
                                    unsignedFixedPoint1616 = i14;
                                    unsignedShort2 = i13;
                                }
                                str7 = str4;
                            }
                            position += i17;
                            str9 = str5;
                            str3 = str7;
                            i20 = i10;
                        }
                    }
                    str7 = str4;
                    position += i17;
                    str9 = str5;
                    str3 = str7;
                    i20 = i10;
                }
                java.lang.String str11 = str3;
                if (stsdData.format == null || str2 == null) {
                }
                androidx.media3.common.Format.Builder language = new androidx.media3.common.Format.Builder().setId(i11).setSampleMimeType(str2).setCodecs(str11).setChannelCount(unsignedShort2).setSampleRate(unsignedFixedPoint1616).setPcmEncoding(pcmEncoding2).setInitializationData(vorbisCsdFromEsdsInitializationData).setDrmInitData(drmInitDataCopyWithSchemeType).setLanguage(str);
                if (esdsFromParent != null) {
                    language.setAverageBitrate(com.google.crypto.tink.shaded.protobuf.q0.F(esdsFromParent.bitrate)).setPeakBitrate(com.google.crypto.tink.shaded.protobuf.q0.F(esdsFromParent.peakBitrate));
                } else if (btrtFromParent != null) {
                    language.setAverageBitrate(com.google.crypto.tink.shaded.protobuf.q0.F(btrtFromParent.avgBitrate)).setPeakBitrate(com.google.crypto.tink.shaded.protobuf.q0.F(btrtFromParent.maxBitrate));
                }
                stsdData.format = language.build();
                return;
            }
            str2 = androidx.media3.common.MimeTypes.AUDIO_AMR_WB;
        }
        i16 = i15;
        int pcmEncoding3 = i16;
        vorbisCsdFromEsdsInitializationData = null;
        str3 = null;
        esdsFromParent = null;
        androidx.media3.extractor.mp4.BoxParser.BtrtData btrtFromParent2 = null;
        while (position - i9 < i20) {
            parsableByteArray.setPosition(position);
            i17 = parsableByteArray.readInt();
            if (i17 > 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            str4 = str3;
            androidx.media3.extractor.ExtractorUtil.checkContainerInput(z9, "childAtomSize must be positive");
            i18 = parsableByteArray.readInt();
            if (i18 == 1835557187) {
                parsableByteArray.setPosition(position + 8);
                parsableByteArray.skipBytes(1);
                unsignedByte2 = parsableByteArray.readUnsignedByte();
                parsableByteArray.skipBytes(1);
                if (java.util.Objects.equals(str2, str9)) {
                    str8 = java.lang.String.format("mhm1.%02X", java.lang.Integer.valueOf(unsignedByte2));
                } else {
                    str8 = java.lang.String.format("mha1.%02X", java.lang.Integer.valueOf(unsignedByte2));
                }
                java.lang.String str12 = str8;
                int unsignedShort4 = parsableByteArray.readUnsignedShort();
                str4 = str12;
                bArr3 = new byte[unsignedShort4];
                str5 = str9;
                parsableByteArray.readBytes(bArr3, 0, unsignedShort4);
                if (vorbisCsdFromEsdsInitializationData == null) {
                    vorbisCsdFromEsdsInitializationData = p076i4.AbstractC2186b0.y(bArr3);
                } else {
                    vorbisCsdFromEsdsInitializationData = p076i4.AbstractC2186b0.z(bArr3, vorbisCsdFromEsdsInitializationData.get(0));
                }
            } else {
                str5 = str9;
                if (i18 == 1835557200) {
                    parsableByteArray.setPosition(position + 8);
                    unsignedByte = parsableByteArray.readUnsignedByte();
                    if (unsignedByte > 0) {
                        bArr2 = new byte[unsignedByte];
                        parsableByteArray.readBytes(bArr2, 0, unsignedByte);
                        if (vorbisCsdFromEsdsInitializationData == null) {
                            vorbisCsdFromEsdsInitializationData = p076i4.AbstractC2186b0.y(bArr2);
                        } else {
                            vorbisCsdFromEsdsInitializationData = p076i4.AbstractC2186b0.z(vorbisCsdFromEsdsInitializationData.get(0), bArr2);
                        }
                    }
                } else {
                    if (i18 != 1702061171) {
                        if (i18 == 1702061171) {
                            iFindBoxPosition = position;
                        } else {
                            iFindBoxPosition = findBoxPosition(parsableByteArray, androidx.media3.container.Mp4Box.TYPE_esds, position, i17);
                        }
                        if (iFindBoxPosition != -1) {
                            esdsFromParent = parseEsdsFromParent(parsableByteArray, iFindBoxPosition);
                            str2 = esdsFromParent.mimeType;
                            bArr = esdsFromParent.initializationData;
                            if (bArr == null) {
                                str7 = str4;
                            } else if (androidx.media3.common.MimeTypes.AUDIO_VORBIS.equals(str2)) {
                                vorbisCsdFromEsdsInitializationData = androidx.media3.extractor.VorbisUtil.parseVorbisCsdFromEsdsInitializationData(bArr);
                                str7 = str4;
                            } else {
                                if (androidx.media3.common.MimeTypes.AUDIO_AAC.equals(str2)) {
                                    androidx.media3.extractor.AacUtil.Config audioSpecificConfig2 = androidx.media3.extractor.AacUtil.parseAudioSpecificConfig(bArr);
                                    unsignedFixedPoint1616 = audioSpecificConfig2.sampleRateHz;
                                    unsignedShort2 = audioSpecificConfig2.channelCount;
                                    str6 = audioSpecificConfig2.codecs;
                                } else {
                                    str6 = str4;
                                }
                                p076i4.S0 s0Y3 = p076i4.AbstractC2186b0.y(bArr);
                                str7 = str6;
                                vorbisCsdFromEsdsInitializationData = s0Y3;
                            }
                        } else {
                            str7 = str4;
                        }
                    } else {
                        if (i18 == 1702061171) {
                            iFindBoxPosition = position;
                        } else {
                            iFindBoxPosition = findBoxPosition(parsableByteArray, androidx.media3.container.Mp4Box.TYPE_esds, position, i17);
                        }
                        if (iFindBoxPosition != -1) {
                            esdsFromParent = parseEsdsFromParent(parsableByteArray, iFindBoxPosition);
                            str2 = esdsFromParent.mimeType;
                            bArr = esdsFromParent.initializationData;
                            if (bArr == null) {
                                str7 = str4;
                            } else if (androidx.media3.common.MimeTypes.AUDIO_VORBIS.equals(str2)) {
                                vorbisCsdFromEsdsInitializationData = androidx.media3.extractor.VorbisUtil.parseVorbisCsdFromEsdsInitializationData(bArr);
                                str7 = str4;
                            } else {
                                if (androidx.media3.common.MimeTypes.AUDIO_AAC.equals(str2)) {
                                    androidx.media3.extractor.AacUtil.Config audioSpecificConfig3 = androidx.media3.extractor.AacUtil.parseAudioSpecificConfig(bArr);
                                    unsignedFixedPoint1616 = audioSpecificConfig3.sampleRateHz;
                                    unsignedShort2 = audioSpecificConfig3.channelCount;
                                    str6 = audioSpecificConfig3.codecs;
                                } else {
                                    str6 = str4;
                                }
                                p076i4.S0 s0Y4 = p076i4.AbstractC2186b0.y(bArr);
                                str7 = str6;
                                vorbisCsdFromEsdsInitializationData = s0Y4;
                            }
                        } else {
                            str7 = str4;
                        }
                    }
                    position += i17;
                    str9 = str5;
                    str3 = str7;
                    i20 = i10;
                }
            }
            str7 = str4;
            position += i17;
            str9 = str5;
            str3 = str7;
            i20 = i10;
        }
        java.lang.String str13 = str3;
        if (stsdData.format == null) {
        }
    }

    private static androidx.media3.common.ColorInfo parseAv1c(androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        androidx.media3.common.ColorInfo.Builder builder = new androidx.media3.common.ColorInfo.Builder();
        androidx.media3.common.util.ParsableBitArray parsableBitArray = new androidx.media3.common.util.ParsableBitArray(parsableByteArray.getData());
        parsableBitArray.setPosition(parsableByteArray.getPosition() * 8);
        parsableBitArray.skipBytes(1);
        int bits = parsableBitArray.readBits(3);
        parsableBitArray.skipBits(6);
        boolean bit = parsableBitArray.readBit();
        boolean bit2 = parsableBitArray.readBit();
        if (bits == 2 && bit) {
            builder.setLumaBitdepth(bit2 ? 12 : 10);
            builder.setChromaBitdepth(bit2 ? 12 : 10);
        } else if (bits <= 2) {
            builder.setLumaBitdepth(bit ? 10 : 8);
            builder.setChromaBitdepth(bit ? 10 : 8);
        }
        parsableBitArray.skipBits(13);
        parsableBitArray.skipBit();
        int bits2 = parsableBitArray.readBits(4);
        if (bits2 != 1) {
            androidx.media3.common.util.Log.i(TAG, "Unsupported obu_type: " + bits2);
            return builder.build();
        }
        if (parsableBitArray.readBit()) {
            androidx.media3.common.util.Log.i(TAG, "Unsupported obu_extension_flag");
            return builder.build();
        }
        boolean bit3 = parsableBitArray.readBit();
        parsableBitArray.skipBit();
        if (bit3 && parsableBitArray.readBits(8) > 127) {
            androidx.media3.common.util.Log.i(TAG, "Excessive obu_size");
            return builder.build();
        }
        int bits3 = parsableBitArray.readBits(3);
        parsableBitArray.skipBit();
        if (parsableBitArray.readBit()) {
            androidx.media3.common.util.Log.i(TAG, "Unsupported reduced_still_picture_header");
            return builder.build();
        }
        if (parsableBitArray.readBit()) {
            androidx.media3.common.util.Log.i(TAG, "Unsupported timing_info_present_flag");
            return builder.build();
        }
        if (parsableBitArray.readBit()) {
            androidx.media3.common.util.Log.i(TAG, "Unsupported initial_display_delay_present_flag");
            return builder.build();
        }
        int bits4 = parsableBitArray.readBits(5);
        boolean z6 = false;
        for (int i3 = 0; i3 <= bits4; i3++) {
            parsableBitArray.skipBits(12);
            if (parsableBitArray.readBits(5) > 7) {
                parsableBitArray.skipBit();
            }
        }
        int bits5 = parsableBitArray.readBits(4);
        int bits6 = parsableBitArray.readBits(4);
        parsableBitArray.skipBits(bits5 + 1);
        parsableBitArray.skipBits(bits6 + 1);
        if (parsableBitArray.readBit()) {
            parsableBitArray.skipBits(7);
        }
        parsableBitArray.skipBits(7);
        boolean bit4 = parsableBitArray.readBit();
        if (bit4) {
            parsableBitArray.skipBits(2);
        }
        if ((parsableBitArray.readBit() ? 2 : parsableBitArray.readBits(1)) > 0 && !parsableBitArray.readBit()) {
            parsableBitArray.skipBits(1);
        }
        if (bit4) {
            parsableBitArray.skipBits(3);
        }
        parsableBitArray.skipBits(3);
        boolean bit5 = parsableBitArray.readBit();
        if (bits3 == 2 && bit5) {
            parsableBitArray.skipBit();
        }
        if (bits3 != 1 && parsableBitArray.readBit()) {
            z6 = true;
        }
        if (parsableBitArray.readBit()) {
            int bits7 = parsableBitArray.readBits(8);
            int bits8 = parsableBitArray.readBits(8);
            builder.setColorSpace(androidx.media3.common.ColorInfo.isoColorPrimariesToColorSpace(bits7)).setColorRange(((z6 || bits7 != 1 || bits8 != 13 || parsableBitArray.readBits(8) != 0) ? parsableBitArray.readBits(1) : 1) != 1 ? 2 : 1).setColorTransfer(androidx.media3.common.ColorInfo.isoTransferCharacteristicsToColorTransfer(bits8));
        }
        return builder.build();
    }

    private static androidx.media3.extractor.mp4.BoxParser.BtrtData parseBtrtFromParent(androidx.media3.common.util.ParsableByteArray parsableByteArray, int i3) {
        parsableByteArray.setPosition(i3 + 8);
        parsableByteArray.skipBytes(4);
        return new androidx.media3.extractor.mp4.BoxParser.BtrtData(parsableByteArray.readUnsignedInt(), parsableByteArray.readUnsignedInt());
    }

    public static android.util.Pair<java.lang.Integer, androidx.media3.extractor.mp4.TrackEncryptionBox> parseCommonEncryptionSinfFromParent(androidx.media3.common.util.ParsableByteArray parsableByteArray, int i3, int i9) throws androidx.media3.common.ParserException {
        int i10 = i3 + 8;
        int i11 = -1;
        int i12 = 0;
        java.lang.String string = null;
        java.lang.Integer numValueOf = null;
        while (i10 - i3 < i9) {
            parsableByteArray.setPosition(i10);
            int i13 = parsableByteArray.readInt();
            int i14 = parsableByteArray.readInt();
            if (i14 == 1718775137) {
                numValueOf = java.lang.Integer.valueOf(parsableByteArray.readInt());
            } else if (i14 == 1935894637) {
                parsableByteArray.skipBytes(4);
                string = parsableByteArray.readString(4);
            } else if (i14 == 1935894633) {
                i11 = i10;
                i12 = i13;
            }
            i10 += i13;
        }
        if (!androidx.media3.common.C.CENC_TYPE_cenc.equals(string) && !androidx.media3.common.C.CENC_TYPE_cbc1.equals(string) && !androidx.media3.common.C.CENC_TYPE_cens.equals(string) && !androidx.media3.common.C.CENC_TYPE_cbcs.equals(string)) {
            return null;
        }
        androidx.media3.extractor.ExtractorUtil.checkContainerInput(numValueOf != null, "frma atom is mandatory");
        androidx.media3.extractor.ExtractorUtil.checkContainerInput(i11 != -1, "schi atom is mandatory");
        androidx.media3.extractor.mp4.TrackEncryptionBox schiFromParent = parseSchiFromParent(parsableByteArray, i11, i12, string);
        androidx.media3.extractor.ExtractorUtil.checkContainerInput(schiFromParent != null, "tenc atom is mandatory");
        return android.util.Pair.create(numValueOf, (androidx.media3.extractor.mp4.TrackEncryptionBox) androidx.media3.common.util.Util.castNonNull(schiFromParent));
    }

    private static android.util.Pair<long[], long[]> parseEdts(androidx.media3.container.Mp4Box.ContainerBox containerBox) {
        androidx.media3.container.Mp4Box.LeafBox leafBoxOfType = containerBox.getLeafBoxOfType(androidx.media3.container.Mp4Box.TYPE_elst);
        if (leafBoxOfType == null) {
            return null;
        }
        androidx.media3.common.util.ParsableByteArray parsableByteArray = leafBoxOfType.data;
        parsableByteArray.setPosition(8);
        int fullBoxVersion = parseFullBoxVersion(parsableByteArray.readInt());
        int unsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
        long[] jArr = new long[unsignedIntToInt];
        long[] jArr2 = new long[unsignedIntToInt];
        for (int i3 = 0; i3 < unsignedIntToInt; i3++) {
            jArr[i3] = fullBoxVersion == 1 ? parsableByteArray.readUnsignedLongToLong() : parsableByteArray.readUnsignedInt();
            jArr2[i3] = fullBoxVersion == 1 ? parsableByteArray.readLong() : parsableByteArray.readInt();
            if (parsableByteArray.readShort() != 1) {
                throw new java.lang.IllegalArgumentException("Unsupported media rate.");
            }
            parsableByteArray.skipBytes(2);
        }
        return android.util.Pair.create(jArr, jArr2);
    }

    private static androidx.media3.extractor.mp4.BoxParser.EsdsData parseEsdsFromParent(androidx.media3.common.util.ParsableByteArray parsableByteArray, int i3) {
        parsableByteArray.setPosition(i3 + 12);
        parsableByteArray.skipBytes(1);
        parseExpandableClassSize(parsableByteArray);
        parsableByteArray.skipBytes(2);
        int unsignedByte = parsableByteArray.readUnsignedByte();
        if ((unsignedByte & 128) != 0) {
            parsableByteArray.skipBytes(2);
        }
        if ((unsignedByte & 64) != 0) {
            parsableByteArray.skipBytes(parsableByteArray.readUnsignedByte());
        }
        if ((unsignedByte & 32) != 0) {
            parsableByteArray.skipBytes(2);
        }
        parsableByteArray.skipBytes(1);
        parseExpandableClassSize(parsableByteArray);
        java.lang.String mimeTypeFromMp4ObjectType = androidx.media3.common.MimeTypes.getMimeTypeFromMp4ObjectType(parsableByteArray.readUnsignedByte());
        if (androidx.media3.common.MimeTypes.AUDIO_MPEG.equals(mimeTypeFromMp4ObjectType) || androidx.media3.common.MimeTypes.AUDIO_DTS.equals(mimeTypeFromMp4ObjectType) || androidx.media3.common.MimeTypes.AUDIO_DTS_HD.equals(mimeTypeFromMp4ObjectType)) {
            return new androidx.media3.extractor.mp4.BoxParser.EsdsData(mimeTypeFromMp4ObjectType, null, -1L, -1L);
        }
        parsableByteArray.skipBytes(4);
        long unsignedInt = parsableByteArray.readUnsignedInt();
        long unsignedInt2 = parsableByteArray.readUnsignedInt();
        parsableByteArray.skipBytes(1);
        int expandableClassSize = parseExpandableClassSize(parsableByteArray);
        long j = unsignedInt2;
        byte[] bArr = new byte[expandableClassSize];
        parsableByteArray.readBytes(bArr, 0, expandableClassSize);
        if (j <= 0) {
            j = -1;
        }
        return new androidx.media3.extractor.mp4.BoxParser.EsdsData(mimeTypeFromMp4ObjectType, bArr, j, unsignedInt > 0 ? unsignedInt : -1L);
    }

    private static int parseExpandableClassSize(androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        int unsignedByte = parsableByteArray.readUnsignedByte();
        int i3 = unsignedByte & 127;
        while ((unsignedByte & 128) == 128) {
            unsignedByte = parsableByteArray.readUnsignedByte();
            i3 = (i3 << 7) | (unsignedByte & 127);
        }
        return i3;
    }

    public static int parseFullBoxFlags(int i3) {
        return i3 & 16777215;
    }

    public static int parseFullBoxVersion(int i3) {
        return (i3 >> 24) & 255;
    }

    private static int parseHdlr(androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        parsableByteArray.setPosition(16);
        return parsableByteArray.readInt();
    }

    private static androidx.media3.common.Metadata parseIlst(androidx.media3.common.util.ParsableByteArray parsableByteArray, int i3) {
        parsableByteArray.skipBytes(8);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (parsableByteArray.getPosition() < i3) {
            androidx.media3.common.Metadata.Entry ilstElement = androidx.media3.extractor.mp4.MetadataUtil.parseIlstElement(parsableByteArray);
            if (ilstElement != null) {
                arrayList.add(ilstElement);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new androidx.media3.common.Metadata(arrayList);
    }

    private static androidx.media3.extractor.mp4.BoxParser.MdhdData parseMdhd(androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        long j;
        parsableByteArray.setPosition(8);
        int fullBoxVersion = parseFullBoxVersion(parsableByteArray.readInt());
        parsableByteArray.skipBytes(fullBoxVersion == 0 ? 8 : 16);
        long unsignedInt = parsableByteArray.readUnsignedInt();
        int position = parsableByteArray.getPosition();
        int i3 = fullBoxVersion == 0 ? 4 : 8;
        int i9 = 0;
        while (true) {
            j = androidx.media3.common.C.TIME_UNSET;
            if (i9 >= i3) {
                parsableByteArray.skipBytes(i3);
                break;
            }
            if (parsableByteArray.getData()[position + i9] != -1) {
                long unsignedInt2 = fullBoxVersion == 0 ? parsableByteArray.readUnsignedInt() : parsableByteArray.readUnsignedLongToLong();
                if (unsignedInt2 == 0) {
                    break;
                }
                long jScaleLargeTimestamp = androidx.media3.common.util.Util.scaleLargeTimestamp(unsignedInt2, 1000000L, unsignedInt);
                unsignedInt = unsignedInt;
                j = jScaleLargeTimestamp;
                break;
            }
            i9++;
        }
        return new androidx.media3.extractor.mp4.BoxParser.MdhdData(unsignedInt, j, getLanguageFromCode(parsableByteArray.readUnsignedShort()));
    }

    public static androidx.media3.common.Metadata parseMdtaFromMeta(androidx.media3.container.Mp4Box.ContainerBox containerBox) {
        androidx.media3.container.Mp4Box.LeafBox leafBoxOfType = containerBox.getLeafBoxOfType(androidx.media3.container.Mp4Box.TYPE_hdlr);
        androidx.media3.container.Mp4Box.LeafBox leafBoxOfType2 = containerBox.getLeafBoxOfType(androidx.media3.container.Mp4Box.TYPE_keys);
        androidx.media3.container.Mp4Box.LeafBox leafBoxOfType3 = containerBox.getLeafBoxOfType(androidx.media3.container.Mp4Box.TYPE_ilst);
        if (leafBoxOfType == null || leafBoxOfType2 == null || leafBoxOfType3 == null || parseHdlr(leafBoxOfType.data) != TYPE_mdta) {
            return null;
        }
        androidx.media3.common.util.ParsableByteArray parsableByteArray = leafBoxOfType2.data;
        parsableByteArray.setPosition(12);
        int i3 = parsableByteArray.readInt();
        java.lang.String[] strArr = new java.lang.String[i3];
        for (int i9 = 0; i9 < i3; i9++) {
            int i10 = parsableByteArray.readInt();
            parsableByteArray.skipBytes(4);
            strArr[i9] = parsableByteArray.readString(i10 - 8);
        }
        androidx.media3.common.util.ParsableByteArray parsableByteArray2 = leafBoxOfType3.data;
        parsableByteArray2.setPosition(8);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (parsableByteArray2.bytesLeft() > 8) {
            int position = parsableByteArray2.getPosition();
            int i11 = parsableByteArray2.readInt();
            int i12 = parsableByteArray2.readInt() - 1;
            if (i12 < 0 || i12 >= i3) {
                Y6.f.p(i12, "Skipped metadata with unknown key index: ", TAG);
            } else {
                androidx.media3.container.MdtaMetadataEntry mdtaMetadataEntryFromIlst = androidx.media3.extractor.mp4.MetadataUtil.parseMdtaMetadataEntryFromIlst(parsableByteArray2, position + i11, strArr[i12]);
                if (mdtaMetadataEntryFromIlst != null) {
                    arrayList.add(mdtaMetadataEntryFromIlst);
                }
            }
            parsableByteArray2.setPosition(position + i11);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new androidx.media3.common.Metadata(arrayList);
    }

    private static void parseMetaDataSampleEntry(androidx.media3.common.util.ParsableByteArray parsableByteArray, int i3, int i9, int i10, androidx.media3.extractor.mp4.BoxParser.StsdData stsdData) {
        parsableByteArray.setPosition(i9 + 16);
        if (i3 == 1835365492) {
            parsableByteArray.readNullTerminatedString();
            java.lang.String nullTerminatedString = parsableByteArray.readNullTerminatedString();
            if (nullTerminatedString != null) {
                stsdData.format = new androidx.media3.common.Format.Builder().setId(i10).setSampleMimeType(nullTerminatedString).build();
            }
        }
    }

    public static androidx.media3.container.Mp4TimestampData parseMvhd(androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        long unsignedInt;
        long unsignedInt2;
        parsableByteArray.setPosition(8);
        if (parseFullBoxVersion(parsableByteArray.readInt()) == 0) {
            unsignedInt = parsableByteArray.readUnsignedInt();
            unsignedInt2 = parsableByteArray.readUnsignedInt();
        } else {
            unsignedInt = parsableByteArray.readLong();
            unsignedInt2 = parsableByteArray.readLong();
        }
        return new androidx.media3.container.Mp4TimestampData(unsignedInt, unsignedInt2, parsableByteArray.readUnsignedInt());
    }

    private static float parsePaspFromParent(androidx.media3.common.util.ParsableByteArray parsableByteArray, int i3) {
        parsableByteArray.setPosition(i3 + 8);
        return parsableByteArray.readUnsignedIntToInt() / parsableByteArray.readUnsignedIntToInt();
    }

    private static byte[] parseProjFromParent(androidx.media3.common.util.ParsableByteArray parsableByteArray, int i3, int i9) {
        int i10 = i3 + 8;
        while (i10 - i3 < i9) {
            parsableByteArray.setPosition(i10);
            int i11 = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == 1886547818) {
                return java.util.Arrays.copyOfRange(parsableByteArray.getData(), i10, i11 + i10);
            }
            i10 += i11;
        }
        return null;
    }

    private static android.util.Pair<java.lang.Integer, androidx.media3.extractor.mp4.TrackEncryptionBox> parseSampleEntryEncryptionData(androidx.media3.common.util.ParsableByteArray parsableByteArray, int i3, int i9) throws androidx.media3.common.ParserException {
        android.util.Pair<java.lang.Integer, androidx.media3.extractor.mp4.TrackEncryptionBox> commonEncryptionSinfFromParent;
        int position = parsableByteArray.getPosition();
        while (position - i3 < i9) {
            parsableByteArray.setPosition(position);
            int i10 = parsableByteArray.readInt();
            androidx.media3.extractor.ExtractorUtil.checkContainerInput(i10 > 0, "childAtomSize must be positive");
            if (parsableByteArray.readInt() == 1936289382 && (commonEncryptionSinfFromParent = parseCommonEncryptionSinfFromParent(parsableByteArray, position, i10)) != null) {
                return commonEncryptionSinfFromParent;
            }
            position += i10;
        }
        return null;
    }

    private static androidx.media3.extractor.mp4.TrackEncryptionBox parseSchiFromParent(androidx.media3.common.util.ParsableByteArray parsableByteArray, int i3, int i9, java.lang.String str) {
        int i10;
        int i11;
        int i12 = i3 + 8;
        while (true) {
            byte[] bArr = null;
            if (i12 - i3 >= i9) {
                return null;
            }
            parsableByteArray.setPosition(i12);
            int i13 = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == 1952804451) {
                int fullBoxVersion = parseFullBoxVersion(parsableByteArray.readInt());
                parsableByteArray.skipBytes(1);
                if (fullBoxVersion == 0) {
                    parsableByteArray.skipBytes(1);
                    i11 = 0;
                    i10 = 0;
                } else {
                    int unsignedByte = parsableByteArray.readUnsignedByte();
                    i10 = unsignedByte & 15;
                    i11 = (unsignedByte & androidx.media3.extractor.ts.PsExtractor.VIDEO_STREAM_MASK) >> 4;
                }
                boolean z6 = parsableByteArray.readUnsignedByte() == 1;
                int unsignedByte2 = parsableByteArray.readUnsignedByte();
                byte[] bArr2 = new byte[16];
                parsableByteArray.readBytes(bArr2, 0, 16);
                if (z6 && unsignedByte2 == 0) {
                    int unsignedByte3 = parsableByteArray.readUnsignedByte();
                    bArr = new byte[unsignedByte3];
                    parsableByteArray.readBytes(bArr, 0, unsignedByte3);
                }
                return new androidx.media3.extractor.mp4.TrackEncryptionBox(z6, str, unsignedByte2, bArr2, i11, i10, bArr);
            }
            i12 += i13;
        }
    }

    /* JADX WARN: Failed to calculate best type for var: r26v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r26v2 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r26v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r26v3 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r26v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r26v7 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r27v11 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r27v11 ??, new type: int[]
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r27v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r27v7 ??, new type: int[]
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r27v9 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r27v9 ??, new type: int[]
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r29v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r29v0 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r29v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r29v1 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r29v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r29v2 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r4v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v1 ??, new type: androidx.media3.extractor.mp4.BoxParser$ChunkIterator
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r4v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v1 ??, new type: androidx.media3.extractor.mp4.BoxParser$ChunkIterator
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r4v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v2 ??, new type: androidx.media3.extractor.mp4.BoxParser$ChunkIterator
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r4v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v7 ??, new type: androidx.media3.extractor.mp4.BoxParser$ChunkIterator
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r5v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v6 ??, new type: int[]
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r7v11 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v11 ??, new type: int[]
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r7v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v12 ??, new type: int[]
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r7v13 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v13 ??, new type: int[]
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r7v30 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v30 ??, new type: int[]
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r7v32 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v32 ??, new type: int[]
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r7v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v8 ??, new type: int[]
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r7v9 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v9 ??, new type: int[]
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r8v16 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v16 ??, new type: int[]
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r8v18 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v18 ??, new type: int[]
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v3 ??, new type: boolean
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    public static androidx.media3.extractor.mp4.TrackSampleTable parseStbl(androidx.media3.extractor.mp4.Track r43, androidx.media3.container.Mp4Box.ContainerBox r44, androidx.media3.extractor.GaplessInfoHolder r45, boolean r46) {
        /*
            Method dump skipped, instruction units count: 1618
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.mp4.BoxParser.parseStbl(androidx.media3.extractor.mp4.Track, androidx.media3.container.Mp4Box$ContainerBox, androidx.media3.extractor.GaplessInfoHolder, boolean):androidx.media3.extractor.mp4.TrackSampleTable");
    }

    private static androidx.media3.extractor.mp4.BoxParser.EyesData parseStereoViewBox(androidx.media3.common.util.ParsableByteArray parsableByteArray, int i3, int i9) throws androidx.media3.common.ParserException {
        parsableByteArray.setPosition(i3 + 8);
        int position = parsableByteArray.getPosition();
        while (position - i3 < i9) {
            parsableByteArray.setPosition(position);
            int i10 = parsableByteArray.readInt();
            androidx.media3.extractor.ExtractorUtil.checkContainerInput(i10 > 0, "childAtomSize must be positive");
            if (parsableByteArray.readInt() == 1937011305) {
                parsableByteArray.skipBytes(4);
                int unsignedByte = parsableByteArray.readUnsignedByte();
                return new androidx.media3.extractor.mp4.BoxParser.EyesData(new androidx.media3.extractor.mp4.BoxParser.StriData((unsignedByte & 1) == 1, (unsignedByte & 2) == 2, (unsignedByte & 8) == 8));
            }
            position += i10;
        }
        return null;
    }

    private static androidx.media3.extractor.mp4.BoxParser.StsdData parseStsd(androidx.media3.common.util.ParsableByteArray parsableByteArray, androidx.media3.extractor.mp4.BoxParser.TkhdData tkhdData, java.lang.String str, androidx.media3.common.DrmInitData drmInitData, boolean z6) throws androidx.media3.common.ParserException {
        parsableByteArray.setPosition(12);
        int i3 = parsableByteArray.readInt();
        androidx.media3.extractor.mp4.BoxParser.StsdData stsdData = new androidx.media3.extractor.mp4.BoxParser.StsdData(i3);
        for (int i9 = 0; i9 < i3; i9++) {
            int position = parsableByteArray.getPosition();
            int i10 = parsableByteArray.readInt();
            androidx.media3.extractor.ExtractorUtil.checkContainerInput(i10 > 0, "childAtomSize must be positive");
            int i11 = parsableByteArray.readInt();
            if (i11 == 1635148593 || i11 == 1635148595 || i11 == 1701733238 || i11 == 1831958048 || i11 == 1836070006 || i11 == 1752589105 || i11 == 1751479857 || i11 == 1987470129 || i11 == 1987471665 || i11 == 1932670515 || i11 == 1211250227 || i11 == 1748121139 || i11 == 1987063864 || i11 == 1987063865 || i11 == 1635135537 || i11 == 1685479798 || i11 == 1685479729 || i11 == 1685481573 || i11 == 1685481521 || i11 == 1634760241 || i11 == 1684108849) {
                parseVideoSampleEntry(parsableByteArray, i11, position, i10, tkhdData.id, str, tkhdData.rotationDegrees, drmInitData, stsdData, i9);
            } else if (i11 == 1836069985 || i11 == 1701733217 || i11 == 1633889587 || i11 == 1700998451 || i11 == 1633889588 || i11 == 1835823201 || i11 == 1685353315 || i11 == 1685353317 || i11 == 1685353320 || i11 == 1685353324 || i11 == 1685353336 || i11 == 1935764850 || i11 == 1935767394 || i11 == 1819304813 || i11 == 1936684916 || i11 == 1953984371 || i11 == 778924082 || i11 == 778924083 || i11 == 1835557169 || i11 == 1835560241 || i11 == 1634492771 || i11 == 1634492791 || i11 == 1970037111 || i11 == 1332770163 || i11 == 1716281667 || i11 == 1767992678 || i11 == 1768973165 || i11 == 1718641517) {
                parseAudioSampleEntry(parsableByteArray, i11, position, i10, tkhdData.id, str, z6, drmInitData, stsdData, i9);
            } else if (i11 == 1414810956 || i11 == 1954034535 || i11 == 2004251764 || i11 == 1937010800 || i11 == 1664495672 || i11 == 1836070003) {
                androidx.media3.extractor.mp4.BoxParser.StsdData stsdData2 = stsdData;
                parseTextSampleEntry(parsableByteArray, i11, position, i10, tkhdData, str, stsdData2);
                stsdData = stsdData2;
            } else if (i11 == 1835365492) {
                parseMetaDataSampleEntry(parsableByteArray, i11, position, tkhdData.id, stsdData);
            } else if (i11 == 1667329389) {
                stsdData.format = new androidx.media3.common.Format.Builder().setId(tkhdData.id).setSampleMimeType(androidx.media3.common.MimeTypes.APPLICATION_CAMERA_MOTION).build();
            }
            parsableByteArray.setPosition(position + i10);
        }
        return stsdData;
    }

    private static void parseTextSampleEntry(androidx.media3.common.util.ParsableByteArray parsableByteArray, int i3, int i9, int i10, androidx.media3.extractor.mp4.BoxParser.TkhdData tkhdData, java.lang.String str, androidx.media3.extractor.mp4.BoxParser.StsdData stsdData) {
        parsableByteArray.setPosition(i9 + 16);
        java.lang.String str2 = androidx.media3.common.MimeTypes.APPLICATION_TTML;
        p076i4.S0 s0Y = null;
        long j = Long.MAX_VALUE;
        if (i3 != 1414810956) {
            if (i3 == 1954034535) {
                int i11 = i10 - 16;
                byte[] bArr = new byte[i11];
                parsableByteArray.readBytes(bArr, 0, i11);
                s0Y = p076i4.AbstractC2186b0.y(bArr);
                str2 = androidx.media3.common.MimeTypes.APPLICATION_TX3G;
            } else if (i3 == 2004251764) {
                str2 = androidx.media3.common.MimeTypes.APPLICATION_MP4VTT;
            } else if (i3 == 1937010800) {
                j = 0;
            } else if (i3 == 1664495672) {
                stsdData.requiredSampleTransformation = 1;
                str2 = androidx.media3.common.MimeTypes.APPLICATION_MP4CEA608;
            } else {
                if (i3 != 1836070003) {
                    throw new java.lang.IllegalStateException();
                }
                int position = parsableByteArray.getPosition();
                parsableByteArray.skipBytes(4);
                if (parsableByteArray.readInt() == 1702061171) {
                    androidx.media3.extractor.mp4.BoxParser.EsdsData esdsFromParent = parseEsdsFromParent(parsableByteArray, position);
                    if (esdsFromParent.initializationData == null || esdsFromParent.initializationData.length != 64) {
                        return;
                    }
                    s0Y = p076i4.AbstractC2186b0.y(androidx.media3.common.util.Util.getUtf8Bytes(formatVobsubIdx(esdsFromParent.initializationData, tkhdData.width, tkhdData.height)));
                    str2 = androidx.media3.common.MimeTypes.APPLICATION_VOBSUB;
                } else {
                    str2 = null;
                }
            }
        }
        if (str2 != null) {
            stsdData.format = new androidx.media3.common.Format.Builder().setId(tkhdData.id).setSampleMimeType(str2).setLanguage(str).setSubsampleOffsetUs(j).setInitializationData(s0Y).build();
        }
    }

    private static androidx.media3.extractor.mp4.BoxParser.TkhdData parseTkhd(androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        long j;
        parsableByteArray.setPosition(8);
        int fullBoxVersion = parseFullBoxVersion(parsableByteArray.readInt());
        parsableByteArray.skipBytes(fullBoxVersion == 0 ? 8 : 16);
        int i3 = parsableByteArray.readInt();
        parsableByteArray.skipBytes(4);
        int position = parsableByteArray.getPosition();
        int i9 = fullBoxVersion == 0 ? 4 : 8;
        int i10 = 0;
        while (true) {
            j = androidx.media3.common.C.TIME_UNSET;
            if (i10 >= i9) {
                parsableByteArray.skipBytes(i9);
                break;
            }
            if (parsableByteArray.getData()[position + i10] != -1) {
                long unsignedInt = fullBoxVersion == 0 ? parsableByteArray.readUnsignedInt() : parsableByteArray.readUnsignedLongToLong();
                if (unsignedInt == 0) {
                    break;
                }
                j = unsignedInt;
                break;
            }
            i10++;
        }
        parsableByteArray.skipBytes(10);
        int i11 = 0;
        long j9 = j;
        int unsignedShort = parsableByteArray.readUnsignedShort();
        parsableByteArray.skipBytes(4);
        int i12 = parsableByteArray.readInt();
        int i13 = parsableByteArray.readInt();
        parsableByteArray.skipBytes(4);
        int i14 = parsableByteArray.readInt();
        int i15 = parsableByteArray.readInt();
        if (i12 == 0 && i13 == 65536 && ((i14 == -65536 || i14 == 65536) && i15 == 0)) {
            i11 = 90;
        } else if (i12 == 0 && i13 == -65536 && ((i14 == 65536 || i14 == -65536) && i15 == 0)) {
            i11 = org.videolan.libvlc.MediaPlayer.Event.PausableChanged;
        } else if ((i12 == -65536 || i12 == 65536) && i13 == 0 && i14 == 0 && i15 == -65536) {
            i11 = 180;
        }
        int i16 = i11;
        parsableByteArray.skipBytes(16);
        short s9 = parsableByteArray.readShort();
        parsableByteArray.skipBytes(2);
        return new androidx.media3.extractor.mp4.BoxParser.TkhdData(i3, j9, unsignedShort, i16, s9, parsableByteArray.readShort());
    }

    public static androidx.media3.extractor.mp4.Track parseTrak(androidx.media3.container.Mp4Box.ContainerBox containerBox, androidx.media3.container.Mp4Box.LeafBox leafBox, long j, androidx.media3.common.DrmInitData drmInitData, boolean z6, boolean z9) throws androidx.media3.common.ParserException {
        long[] jArr;
        long[] jArr2;
        androidx.media3.common.Format formatBuild;
        androidx.media3.container.Mp4Box.ContainerBox containerBoxOfType;
        android.util.Pair<long[], long[]> edts;
        androidx.media3.container.Mp4Box.ContainerBox containerBoxOfType2 = containerBox.getContainerBoxOfType(androidx.media3.container.Mp4Box.TYPE_mdia);
        containerBoxOfType2.getClass();
        androidx.media3.container.Mp4Box.LeafBox leafBoxOfType = containerBoxOfType2.getLeafBoxOfType(androidx.media3.container.Mp4Box.TYPE_hdlr);
        leafBoxOfType.getClass();
        int trackTypeForHdlr = getTrackTypeForHdlr(parseHdlr(leafBoxOfType.data));
        if (trackTypeForHdlr == -1) {
            return null;
        }
        androidx.media3.container.Mp4Box.LeafBox leafBoxOfType2 = containerBox.getLeafBoxOfType(androidx.media3.container.Mp4Box.TYPE_tkhd);
        leafBoxOfType2.getClass();
        androidx.media3.extractor.mp4.BoxParser.TkhdData tkhd = parseTkhd(leafBoxOfType2.data);
        long jScaleLargeTimestamp = androidx.media3.common.C.TIME_UNSET;
        long j9 = j == androidx.media3.common.C.TIME_UNSET ? tkhd.duration : j;
        long j10 = parseMvhd(leafBox.data).timescale;
        if (j9 != androidx.media3.common.C.TIME_UNSET) {
            jScaleLargeTimestamp = androidx.media3.common.util.Util.scaleLargeTimestamp(j9, 1000000L, j10);
        }
        long j11 = jScaleLargeTimestamp;
        androidx.media3.container.Mp4Box.ContainerBox containerBoxOfType3 = containerBoxOfType2.getContainerBoxOfType(androidx.media3.container.Mp4Box.TYPE_minf);
        containerBoxOfType3.getClass();
        androidx.media3.container.Mp4Box.ContainerBox containerBoxOfType4 = containerBoxOfType3.getContainerBoxOfType(androidx.media3.container.Mp4Box.TYPE_stbl);
        containerBoxOfType4.getClass();
        androidx.media3.container.Mp4Box.LeafBox leafBoxOfType3 = containerBoxOfType2.getLeafBoxOfType(androidx.media3.container.Mp4Box.TYPE_mdhd);
        leafBoxOfType3.getClass();
        androidx.media3.extractor.mp4.BoxParser.MdhdData mdhd = parseMdhd(leafBoxOfType3.data);
        androidx.media3.container.Mp4Box.LeafBox leafBoxOfType4 = containerBoxOfType4.getLeafBoxOfType(androidx.media3.container.Mp4Box.TYPE_stsd);
        if (leafBoxOfType4 == null) {
            androidx.media3.common.util.Log.w(TAG, "Ignoring track where sample table (stbl) box is missing a sample description (stsd).");
            return null;
        }
        androidx.media3.extractor.mp4.BoxParser.StsdData stsd = parseStsd(leafBoxOfType4.data, tkhd, mdhd.language, drmInitData, z9);
        if (z6 || (containerBoxOfType = containerBox.getContainerBoxOfType(androidx.media3.container.Mp4Box.TYPE_edts)) == null || (edts = parseEdts(containerBoxOfType)) == null) {
            jArr = null;
            jArr2 = null;
        } else {
            long[] jArr3 = (long[]) edts.first;
            jArr2 = (long[]) edts.second;
            jArr = jArr3;
        }
        if (stsd.format == null) {
            return null;
        }
        if (tkhd.alternateGroup != 0) {
            androidx.media3.container.Mp4AlternateGroupData mp4AlternateGroupData = new androidx.media3.container.Mp4AlternateGroupData(tkhd.alternateGroup);
            androidx.media3.common.Format.Builder builderBuildUpon = stsd.format.buildUpon();
            androidx.media3.common.Metadata metadata = stsd.format.metadata;
            formatBuild = builderBuildUpon.setMetadata(metadata != null ? metadata.copyWithAppendedEntries(mp4AlternateGroupData) : new androidx.media3.common.Metadata(mp4AlternateGroupData)).build();
        } else {
            formatBuild = stsd.format;
        }
        return new androidx.media3.extractor.mp4.Track(tkhd.id, trackTypeForHdlr, mdhd.timescale, j10, j11, mdhd.mediaDurationUs, formatBuild, stsd.requiredSampleTransformation, stsd.trackEncryptionBoxes, stsd.nalUnitLengthFieldLength, jArr, jArr2);
    }

    public static java.util.List<androidx.media3.extractor.mp4.TrackSampleTable> parseTraks(androidx.media3.container.Mp4Box.ContainerBox containerBox, androidx.media3.extractor.GaplessInfoHolder gaplessInfoHolder, long j, androidx.media3.common.DrmInitData drmInitData, boolean z6, boolean z9, p068h4.j jVar, boolean z10) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i3 = 0; i3 < containerBox.containerChildren.size(); i3++) {
            androidx.media3.container.Mp4Box.ContainerBox containerBox2 = containerBox.containerChildren.get(i3);
            if (containerBox2.type == 1953653099) {
                androidx.media3.container.Mp4Box.LeafBox leafBoxOfType = containerBox.getLeafBoxOfType(androidx.media3.container.Mp4Box.TYPE_mvhd);
                leafBoxOfType.getClass();
                androidx.media3.extractor.mp4.Track track = (androidx.media3.extractor.mp4.Track) jVar.apply(parseTrak(containerBox2, leafBoxOfType, j, drmInitData, z6, z9));
                if (track != null) {
                    androidx.media3.container.Mp4Box.ContainerBox containerBoxOfType = containerBox2.getContainerBoxOfType(androidx.media3.container.Mp4Box.TYPE_mdia);
                    containerBoxOfType.getClass();
                    androidx.media3.container.Mp4Box.ContainerBox containerBoxOfType2 = containerBoxOfType.getContainerBoxOfType(androidx.media3.container.Mp4Box.TYPE_minf);
                    containerBoxOfType2.getClass();
                    androidx.media3.container.Mp4Box.ContainerBox containerBoxOfType3 = containerBoxOfType2.getContainerBoxOfType(androidx.media3.container.Mp4Box.TYPE_stbl);
                    containerBoxOfType3.getClass();
                    arrayList.add(parseStbl(track, containerBoxOfType3, gaplessInfoHolder, z10));
                }
            }
        }
        return arrayList;
    }

    public static androidx.media3.common.Metadata parseUdta(androidx.media3.container.Mp4Box.LeafBox leafBox) {
        androidx.media3.common.util.ParsableByteArray parsableByteArray = leafBox.data;
        parsableByteArray.setPosition(8);
        androidx.media3.common.Metadata metadata = new androidx.media3.common.Metadata(new androidx.media3.common.Metadata.Entry[0]);
        while (parsableByteArray.bytesLeft() >= 8) {
            int position = parsableByteArray.getPosition();
            int i3 = parsableByteArray.readInt();
            int i9 = parsableByteArray.readInt();
            if (i9 == 1835365473) {
                parsableByteArray.setPosition(position);
                metadata = metadata.copyWithAppendedEntriesFrom(parseUdtaMeta(parsableByteArray, position + i3));
            } else if (i9 == 1936553057) {
                parsableByteArray.setPosition(position);
                metadata = metadata.copyWithAppendedEntriesFrom(androidx.media3.extractor.mp4.SmtaAtomUtil.parseSmta(parsableByteArray, position + i3));
            } else if (i9 == -1451722374) {
                metadata = metadata.copyWithAppendedEntriesFrom(parseXyz(parsableByteArray));
            }
            parsableByteArray.setPosition(position + i3);
        }
        return metadata;
    }

    private static androidx.media3.common.Metadata parseUdtaMeta(androidx.media3.common.util.ParsableByteArray parsableByteArray, int i3) {
        parsableByteArray.skipBytes(8);
        maybeSkipRemainingMetaBoxHeaderBytes(parsableByteArray);
        while (parsableByteArray.getPosition() < i3) {
            int position = parsableByteArray.getPosition();
            int i9 = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == 1768715124) {
                parsableByteArray.setPosition(position);
                return parseIlst(parsableByteArray, position + i9);
            }
            parsableByteArray.setPosition(position + i9);
        }
        return null;
    }

    public static androidx.media3.extractor.mp4.BoxParser.VexuData parseVideoExtendedUsageBox(androidx.media3.common.util.ParsableByteArray parsableByteArray, int i3, int i9) throws androidx.media3.common.ParserException {
        parsableByteArray.setPosition(i3 + 8);
        int position = parsableByteArray.getPosition();
        androidx.media3.extractor.mp4.BoxParser.EyesData stereoViewBox = null;
        while (position - i3 < i9) {
            parsableByteArray.setPosition(position);
            int i10 = parsableByteArray.readInt();
            androidx.media3.extractor.ExtractorUtil.checkContainerInput(i10 > 0, "childAtomSize must be positive");
            if (parsableByteArray.readInt() == 1702454643) {
                stereoViewBox = parseStereoViewBox(parsableByteArray, position, i10);
            }
            position += i10;
        }
        if (stereoViewBox == null) {
            return null;
        }
        return new androidx.media3.extractor.mp4.BoxParser.VexuData(stereoViewBox);
    }

    /* JADX WARN: Code duplicated, block: B:217:0x0530  */
    private static void parseVideoSampleEntry(androidx.media3.common.util.ParsableByteArray parsableByteArray, int i3, int i9, int i10, int i11, java.lang.String str, int i12, androidx.media3.common.DrmInitData drmInitData, androidx.media3.extractor.mp4.BoxParser.StsdData stsdData, int i13) throws androidx.media3.common.ParserException {
        java.lang.String str2;
        byte[] bArr;
        java.lang.String str3;
        java.lang.String str4;
        androidx.media3.common.DrmInitData drmInitData2;
        byte[] bArrArray;
        int i14;
        java.lang.String str5;
        int i15;
        int iIsoTransferCharacteristicsToColorTransfer;
        java.lang.String str6;
        int i16;
        java.util.List<byte[]> list;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21 = i9;
        int i22 = i10;
        androidx.media3.common.DrmInitData drmInitDataCopyWithSchemeType = drmInitData;
        androidx.media3.extractor.mp4.BoxParser.StsdData stsdData2 = stsdData;
        parsableByteArray.setPosition(i21 + 16);
        parsableByteArray.skipBytes(16);
        int unsignedShort = parsableByteArray.readUnsignedShort();
        int unsignedShort2 = parsableByteArray.readUnsignedShort();
        parsableByteArray.skipBytes(50);
        int position = parsableByteArray.getPosition();
        int iIntValue = i3;
        if (iIntValue == 1701733238) {
            android.util.Pair<java.lang.Integer, androidx.media3.extractor.mp4.TrackEncryptionBox> sampleEntryEncryptionData = parseSampleEntryEncryptionData(parsableByteArray, i21, i22);
            if (sampleEntryEncryptionData != null) {
                iIntValue = ((java.lang.Integer) sampleEntryEncryptionData.first).intValue();
                drmInitDataCopyWithSchemeType = drmInitDataCopyWithSchemeType == null ? null : drmInitDataCopyWithSchemeType.copyWithSchemeType(((androidx.media3.extractor.mp4.TrackEncryptionBox) sampleEntryEncryptionData.second).schemeType);
                stsdData2.trackEncryptionBoxes[i13] = (androidx.media3.extractor.mp4.TrackEncryptionBox) sampleEntryEncryptionData.second;
            }
            parsableByteArray.setPosition(position);
        }
        java.lang.String str7 = androidx.media3.common.MimeTypes.VIDEO_H263;
        if (iIntValue == 1831958048) {
            str2 = androidx.media3.common.MimeTypes.VIDEO_MPEG;
        } else {
            str2 = iIntValue == 1211250227 ? androidx.media3.common.MimeTypes.VIDEO_H263 : null;
        }
        int i23 = 8;
        int i24 = 8;
        float paspFromParent = 1.0f;
        java.util.List<byte[]> listY = null;
        java.nio.ByteBuffer byteBufferAllocateHdrStaticInfo = null;
        androidx.media3.container.DolbyVisionConfig dolbyVisionConfig = null;
        java.lang.String strBuildApvCodecString = null;
        byte[] projFromParent = null;
        int i25 = -1;
        int i26 = -1;
        int i27 = -1;
        int i28 = -1;
        int i29 = -1;
        int iIsoColorPrimariesToColorSpace = -1;
        int i30 = -1;
        int i31 = -1;
        androidx.media3.extractor.mp4.BoxParser.BtrtData btrtFromParent = null;
        androidx.media3.extractor.mp4.BoxParser.EsdsData esdsFromParent = null;
        androidx.media3.container.NalUnitUtil.H265VpsData h265VpsData = null;
        boolean z6 = false;
        while (true) {
            if (position - i21 >= i22) {
                bArr = null;
                break;
            }
            parsableByteArray.setPosition(position);
            int position2 = parsableByteArray.getPosition();
            int i32 = parsableByteArray.readInt();
            if (i32 == 0 && parsableByteArray.getPosition() - i9 == i22) {
                bArr = null;
                break;
            }
            androidx.media3.extractor.ExtractorUtil.checkContainerInput(i32 > 0, "childAtomSize must be positive");
            int i33 = parsableByteArray.readInt();
            if (i33 == 1635148611) {
                androidx.media3.extractor.ExtractorUtil.checkContainerInput(str2 == null, null);
                parsableByteArray.setPosition(position2 + 8);
                androidx.media3.extractor.AvcConfig avcConfig = androidx.media3.extractor.AvcConfig.parse(parsableByteArray);
                listY = avcConfig.initializationData;
                stsdData2.nalUnitLengthFieldLength = avcConfig.nalUnitLengthFieldLength;
                if (!z6) {
                    paspFromParent = avcConfig.pixelWidthHeightRatio;
                }
                java.lang.String str8 = avcConfig.codecs;
                int i34 = avcConfig.maxNumReorderFrames;
                int i35 = avcConfig.colorSpace;
                int i36 = avcConfig.colorRange;
                int i37 = avcConfig.colorTransfer;
                strBuildApvCodecString = str8;
                int i38 = avcConfig.bitdepthLuma;
                int i39 = avcConfig.bitdepthChroma;
                drmInitDataCopyWithSchemeType = drmInitDataCopyWithSchemeType;
                i14 = position;
                iIsoColorPrimariesToColorSpace = i35;
                iIntValue = iIntValue;
                str5 = str7;
                i15 = i36;
                iIsoTransferCharacteristicsToColorTransfer = i37;
                str6 = androidx.media3.common.MimeTypes.VIDEO_H264;
                i23 = i38;
                i26 = i34;
                i24 = i39;
            } else {
                i14 = position;
                if (i33 == 1752589123) {
                    androidx.media3.extractor.ExtractorUtil.checkContainerInput(str2 == null, null);
                    parsableByteArray.setPosition(position2 + 8);
                    androidx.media3.extractor.HevcConfig hevcConfig = androidx.media3.extractor.HevcConfig.parse(parsableByteArray);
                    listY = hevcConfig.initializationData;
                    stsdData2.nalUnitLengthFieldLength = hevcConfig.nalUnitLengthFieldLength;
                    if (!z6) {
                        paspFromParent = hevcConfig.pixelWidthHeightRatio;
                    }
                    int i40 = hevcConfig.maxNumReorderPics;
                    int i41 = hevcConfig.maxSubLayers;
                    java.lang.String str9 = hevcConfig.codecs;
                    int i42 = hevcConfig.stereoMode;
                    if (i42 != -1) {
                        i25 = i42;
                    }
                    int i43 = hevcConfig.decodedWidth;
                    int i44 = hevcConfig.decodedHeight;
                    int i45 = hevcConfig.colorSpace;
                    int i46 = hevcConfig.colorRange;
                    int i47 = hevcConfig.colorTransfer;
                    int i48 = hevcConfig.bitdepthLuma;
                    int i49 = hevcConfig.bitdepthChroma;
                    h265VpsData = hevcConfig.vpsData;
                    str6 = androidx.media3.common.MimeTypes.VIDEO_H265;
                    str5 = str7;
                    iIsoColorPrimariesToColorSpace = i45;
                    i15 = i46;
                    iIsoTransferCharacteristicsToColorTransfer = i47;
                    i27 = i41;
                    i28 = i43;
                    i26 = i40;
                    i23 = i48;
                    i24 = i49;
                    strBuildApvCodecString = str9;
                    i29 = i44;
                } else {
                    str5 = str7;
                    if (i33 == 1818785347) {
                        androidx.media3.extractor.ExtractorUtil.checkContainerInput(androidx.media3.common.MimeTypes.VIDEO_H265.equals(str2), "lhvC must follow hvcC atom");
                        androidx.media3.container.NalUnitUtil.H265VpsData h265VpsData2 = h265VpsData;
                        androidx.media3.extractor.ExtractorUtil.checkContainerInput(h265VpsData2 != null && h265VpsData2.layerInfos.size() >= 2, "must have at least two layers");
                        parsableByteArray.setPosition(position2 + 8);
                        h265VpsData2.getClass();
                        androidx.media3.extractor.HevcConfig layered = androidx.media3.extractor.HevcConfig.parseLayered(parsableByteArray, h265VpsData2);
                        androidx.media3.extractor.ExtractorUtil.checkContainerInput(stsdData2.nalUnitLengthFieldLength == layered.nalUnitLengthFieldLength, "nalUnitLengthFieldLength must be same for both hvcC and lhvC atoms");
                        int i50 = layered.colorSpace;
                        int i51 = iIsoColorPrimariesToColorSpace;
                        if (i50 != -1) {
                            androidx.media3.extractor.ExtractorUtil.checkContainerInput(i51 == i50, "colorSpace must be the same for both views");
                        }
                        int i52 = layered.colorRange;
                        int i53 = i30;
                        if (i52 != -1) {
                            androidx.media3.extractor.ExtractorUtil.checkContainerInput(i53 == i52, "colorRange must be the same for both views");
                        }
                        int i54 = layered.colorTransfer;
                        if (i54 != -1) {
                            i20 = i31;
                            androidx.media3.extractor.ExtractorUtil.checkContainerInput(i20 == i54, "colorTransfer must be the same for both views");
                        } else {
                            i20 = i31;
                        }
                        androidx.media3.extractor.ExtractorUtil.checkContainerInput(i23 == layered.bitdepthLuma, "bitdepthLuma must be the same for both views");
                        androidx.media3.extractor.ExtractorUtil.checkContainerInput(i24 == layered.bitdepthChroma, "bitdepthChroma must be the same for both views");
                        if (listY != null) {
                            p076i4.Y yS = p076i4.AbstractC2186b0.s();
                            yS.d(listY);
                            yS.d(layered.initializationData);
                            listY = yS.f();
                        } else {
                            androidx.media3.extractor.ExtractorUtil.checkContainerInput(false, "initializationData must be already set from hvcC atom");
                        }
                        java.lang.String str10 = layered.codecs;
                        h265VpsData = h265VpsData2;
                        drmInitDataCopyWithSchemeType = drmInitDataCopyWithSchemeType;
                        str6 = androidx.media3.common.MimeTypes.VIDEO_MV_HEVC;
                        iIntValue = iIntValue;
                        i15 = i53;
                        iIsoTransferCharacteristicsToColorTransfer = i20;
                        iIsoColorPrimariesToColorSpace = i51;
                        strBuildApvCodecString = str10;
                    } else {
                        iIsoColorPrimariesToColorSpace = iIsoColorPrimariesToColorSpace;
                        i15 = i30;
                        iIsoTransferCharacteristicsToColorTransfer = i31;
                        androidx.media3.container.NalUnitUtil.H265VpsData h265VpsData3 = h265VpsData;
                        if (i33 == 1987470147) {
                            androidx.media3.extractor.ExtractorUtil.checkContainerInput(str2 == null, null);
                            parsableByteArray.setPosition(position2 + 8);
                            androidx.media3.extractor.VvcConfig vvcConfig = androidx.media3.extractor.VvcConfig.parse(parsableByteArray);
                            listY = vvcConfig.initializationData;
                            stsdData2.nalUnitLengthFieldLength = vvcConfig.nalUnitLengthFieldLength;
                            java.lang.String str11 = vvcConfig.codecs;
                            i23 = vvcConfig.bitdepthLuma;
                            h265VpsData = h265VpsData3;
                            drmInitDataCopyWithSchemeType = drmInitDataCopyWithSchemeType;
                            strBuildApvCodecString = str11;
                            iIsoColorPrimariesToColorSpace = iIsoColorPrimariesToColorSpace;
                            str6 = androidx.media3.common.MimeTypes.VIDEO_H266;
                            iIntValue = iIntValue;
                            i26 = 16;
                            i24 = i23;
                        } else if (i33 == 1986361461) {
                            androidx.media3.extractor.mp4.BoxParser.VexuData videoExtendedUsageBox = parseVideoExtendedUsageBox(parsableByteArray, position2, i32);
                            if (videoExtendedUsageBox == null || videoExtendedUsageBox.eyesData == null) {
                                i19 = i25;
                                i25 = i19;
                            } else if (h265VpsData3 == null || h265VpsData3.layerInfos.size() < 2) {
                                i19 = i25;
                                if (i19 == -1) {
                                    i25 = videoExtendedUsageBox.eyesData.striData.eyeViewsReversed ? 5 : 4;
                                } else {
                                    i25 = i19;
                                }
                            } else {
                                androidx.media3.extractor.ExtractorUtil.checkContainerInput(videoExtendedUsageBox.hasBothEyeViews(), "both eye views must be marked as available");
                                androidx.media3.extractor.ExtractorUtil.checkContainerInput(!videoExtendedUsageBox.eyesData.striData.eyeViewsReversed, "for MV-HEVC, eye_views_reversed must be set to false");
                                i19 = i25;
                                i25 = i19;
                            }
                            h265VpsData = h265VpsData3;
                            iIsoColorPrimariesToColorSpace = iIsoColorPrimariesToColorSpace;
                            str6 = str2;
                        } else {
                            int i55 = i25;
                            h265VpsData = h265VpsData3;
                            if (i33 == 1685480259 || i33 == 1685485123 || i33 == 1685485379) {
                                drmInitDataCopyWithSchemeType = drmInitDataCopyWithSchemeType;
                                i24 = i24;
                                str6 = str2;
                                iIntValue = iIntValue;
                                i16 = i23;
                                list = listY;
                                i17 = iIsoTransferCharacteristicsToColorTransfer;
                                dolbyVisionConfig = androidx.media3.container.DolbyVisionConfig.parse(parsableByteArray);
                            } else {
                                if (i33 == 1987076931) {
                                    androidx.media3.extractor.ExtractorUtil.checkContainerInput(str2 == null, null);
                                    java.lang.String str12 = iIntValue == 1987063864 ? androidx.media3.common.MimeTypes.VIDEO_VP8 : androidx.media3.common.MimeTypes.VIDEO_VP9;
                                    parsableByteArray.setPosition(position2 + 12);
                                    byte unsignedByte = (byte) parsableByteArray.readUnsignedByte();
                                    byte unsignedByte2 = (byte) parsableByteArray.readUnsignedByte();
                                    int unsignedByte3 = parsableByteArray.readUnsignedByte();
                                    i23 = unsignedByte3 >> 4;
                                    byte b9 = (byte) ((unsignedByte3 >> 1) & 7);
                                    if (str12.equals(androidx.media3.common.MimeTypes.VIDEO_VP9)) {
                                        listY = androidx.media3.common.util.CodecSpecificDataUtil.buildVp9CodecPrivateInitializationData(unsignedByte, unsignedByte2, (byte) i23, b9);
                                    }
                                    boolean z9 = (unsignedByte3 & 1) != 0;
                                    int unsignedByte4 = parsableByteArray.readUnsignedByte();
                                    int unsignedByte5 = parsableByteArray.readUnsignedByte();
                                    drmInitDataCopyWithSchemeType = drmInitDataCopyWithSchemeType;
                                    iIsoColorPrimariesToColorSpace = androidx.media3.common.ColorInfo.isoColorPrimariesToColorSpace(unsignedByte4);
                                    i24 = i23;
                                    i15 = z9 ? 1 : 2;
                                    iIsoTransferCharacteristicsToColorTransfer = androidx.media3.common.ColorInfo.isoTransferCharacteristicsToColorTransfer(unsignedByte5);
                                    str6 = str12;
                                    iIntValue = iIntValue;
                                } else if (i33 == 1635135811) {
                                    int i56 = i32 - 8;
                                    byte[] bArr2 = new byte[i56];
                                    parsableByteArray.readBytes(bArr2, 0, i56);
                                    listY = p076i4.AbstractC2186b0.y(bArr2);
                                    parsableByteArray.setPosition(position2 + 8);
                                    androidx.media3.common.ColorInfo av1c = parseAv1c(parsableByteArray);
                                    int i57 = av1c.lumaBitdepth;
                                    i24 = av1c.chromaBitdepth;
                                    int i58 = av1c.colorSpace;
                                    int i59 = av1c.colorRange;
                                    iIsoTransferCharacteristicsToColorTransfer = av1c.colorTransfer;
                                    drmInitDataCopyWithSchemeType = drmInitDataCopyWithSchemeType;
                                    iIsoColorPrimariesToColorSpace = i58;
                                    i15 = i59;
                                    iIntValue = iIntValue;
                                    str6 = androidx.media3.common.MimeTypes.VIDEO_AV1;
                                    h265VpsData = h265VpsData;
                                    i23 = i57;
                                    i25 = i55;
                                } else if (i33 == 1668050025) {
                                    if (byteBufferAllocateHdrStaticInfo == null) {
                                        byteBufferAllocateHdrStaticInfo = allocateHdrStaticInfo();
                                    }
                                    java.nio.ByteBuffer byteBuffer = byteBufferAllocateHdrStaticInfo;
                                    byteBuffer.position(21);
                                    byteBuffer.putShort(parsableByteArray.readShort());
                                    byteBuffer.putShort(parsableByteArray.readShort());
                                    byteBufferAllocateHdrStaticInfo = byteBuffer;
                                    drmInitDataCopyWithSchemeType = drmInitDataCopyWithSchemeType;
                                    iIsoColorPrimariesToColorSpace = iIsoColorPrimariesToColorSpace;
                                    str6 = str2;
                                    iIntValue = iIntValue;
                                } else if (i33 == 1835295606) {
                                    if (byteBufferAllocateHdrStaticInfo == null) {
                                        byteBufferAllocateHdrStaticInfo = allocateHdrStaticInfo();
                                    }
                                    java.nio.ByteBuffer byteBuffer2 = byteBufferAllocateHdrStaticInfo;
                                    short s9 = parsableByteArray.readShort();
                                    short s10 = parsableByteArray.readShort();
                                    str6 = str2;
                                    short s11 = parsableByteArray.readShort();
                                    iIntValue = iIntValue;
                                    short s12 = parsableByteArray.readShort();
                                    short s13 = parsableByteArray.readShort();
                                    int i60 = i24;
                                    short s14 = parsableByteArray.readShort();
                                    int i61 = i23;
                                    short s15 = parsableByteArray.readShort();
                                    drmInitDataCopyWithSchemeType = drmInitDataCopyWithSchemeType;
                                    short s16 = parsableByteArray.readShort();
                                    long unsignedInt = parsableByteArray.readUnsignedInt();
                                    long unsignedInt2 = parsableByteArray.readUnsignedInt();
                                    byteBuffer2.position(1);
                                    byteBuffer2.putShort(s13);
                                    byteBuffer2.putShort(s14);
                                    byteBuffer2.putShort(s9);
                                    byteBuffer2.putShort(s10);
                                    byteBuffer2.putShort(s11);
                                    byteBuffer2.putShort(s12);
                                    byteBuffer2.putShort(s15);
                                    byteBuffer2.putShort(s16);
                                    byteBuffer2.putShort((short) (unsignedInt / androidx.media3.exoplayer.Renderer.DEFAULT_DURATION_TO_PROGRESS_US));
                                    byteBuffer2.putShort((short) (unsignedInt2 / androidx.media3.exoplayer.Renderer.DEFAULT_DURATION_TO_PROGRESS_US));
                                    byteBufferAllocateHdrStaticInfo = byteBuffer2;
                                    iIsoColorPrimariesToColorSpace = iIsoColorPrimariesToColorSpace;
                                    i24 = i60;
                                    i23 = i61;
                                    listY = listY;
                                } else {
                                    drmInitDataCopyWithSchemeType = drmInitDataCopyWithSchemeType;
                                    i24 = i24;
                                    str6 = str2;
                                    iIntValue = iIntValue;
                                    i16 = i23;
                                    list = listY;
                                    if (i33 == 1681012275) {
                                        androidx.media3.extractor.ExtractorUtil.checkContainerInput(str6 == null, null);
                                        str6 = str5;
                                    } else if (i33 == 1702061171) {
                                        androidx.media3.extractor.ExtractorUtil.checkContainerInput(str6 == null, null);
                                        esdsFromParent = parseEsdsFromParent(parsableByteArray, position2);
                                        java.lang.String str13 = esdsFromParent.mimeType;
                                        byte[] bArr3 = esdsFromParent.initializationData;
                                        listY = bArr3 != null ? p076i4.AbstractC2186b0.y(bArr3) : list;
                                        str6 = str13;
                                        iIsoColorPrimariesToColorSpace = iIsoColorPrimariesToColorSpace;
                                        i24 = i24;
                                        i23 = i16;
                                    } else if (i33 == 1651798644) {
                                        btrtFromParent = parseBtrtFromParent(parsableByteArray, position2);
                                    } else if (i33 == 1885434736) {
                                        paspFromParent = parsePaspFromParent(parsableByteArray, position2);
                                        iIsoColorPrimariesToColorSpace = iIsoColorPrimariesToColorSpace;
                                        i24 = i24;
                                        i23 = i16;
                                        listY = list;
                                        z6 = true;
                                    } else if (i33 == 1937126244) {
                                        projFromParent = parseProjFromParent(parsableByteArray, position2, i32);
                                    } else if (i33 == 1936995172) {
                                        int unsignedByte6 = parsableByteArray.readUnsignedByte();
                                        parsableByteArray.skipBytes(3);
                                        if (unsignedByte6 != 0) {
                                            i18 = i55;
                                        } else {
                                            int unsignedByte7 = parsableByteArray.readUnsignedByte();
                                            if (unsignedByte7 == 0) {
                                                i18 = 0;
                                            } else if (unsignedByte7 == 1) {
                                                i18 = 1;
                                            } else if (unsignedByte7 == 2) {
                                                i18 = 2;
                                            } else if (unsignedByte7 != 3) {
                                                i18 = i55;
                                            } else {
                                                i18 = 3;
                                            }
                                        }
                                        i24 = i24;
                                        i23 = i16;
                                        listY = list;
                                        h265VpsData = h265VpsData;
                                        i25 = i18;
                                        iIsoColorPrimariesToColorSpace = iIsoColorPrimariesToColorSpace;
                                    } else {
                                        if (i33 == 1634760259) {
                                            int i62 = i32 - 12;
                                            byte[] bArr4 = new byte[i62];
                                            parsableByteArray.setPosition(position2 + 12);
                                            parsableByteArray.readBytes(bArr4, 0, i62);
                                            strBuildApvCodecString = androidx.media3.common.util.CodecSpecificDataUtil.buildApvCodecString(bArr4);
                                            listY = p076i4.AbstractC2186b0.y(bArr4);
                                            androidx.media3.common.ColorInfo apvc = parseApvc(new androidx.media3.common.util.ParsableByteArray(bArr4));
                                            int i63 = apvc.lumaBitdepth;
                                            int i64 = apvc.chromaBitdepth;
                                            int i65 = apvc.colorSpace;
                                            int i66 = apvc.colorRange;
                                            iIsoTransferCharacteristicsToColorTransfer = apvc.colorTransfer;
                                            i23 = i63;
                                            iIsoColorPrimariesToColorSpace = i65;
                                            i15 = i66;
                                            str6 = androidx.media3.common.MimeTypes.VIDEO_APV;
                                            i24 = i64;
                                        } else if (i33 == 1668246642) {
                                            i17 = iIsoTransferCharacteristicsToColorTransfer;
                                            if (iIsoColorPrimariesToColorSpace == -1 && i17 == -1) {
                                                int i67 = parsableByteArray.readInt();
                                                if (i67 == TYPE_nclx || i67 == TYPE_nclc) {
                                                    int unsignedShort3 = parsableByteArray.readUnsignedShort();
                                                    int unsignedShort4 = parsableByteArray.readUnsignedShort();
                                                    parsableByteArray.skipBytes(2);
                                                    boolean z10 = i32 == 19 && (parsableByteArray.readUnsignedByte() & 128) != 0;
                                                    iIsoColorPrimariesToColorSpace = androidx.media3.common.ColorInfo.isoColorPrimariesToColorSpace(unsignedShort3);
                                                    int i68 = z10 ? 1 : 2;
                                                    iIsoTransferCharacteristicsToColorTransfer = androidx.media3.common.ColorInfo.isoTransferCharacteristicsToColorTransfer(unsignedShort4);
                                                    i15 = i68;
                                                } else {
                                                    androidx.media3.common.util.Log.w(TAG, "Unsupported color type: " + androidx.media3.container.Mp4Box.getBoxTypeString(i67));
                                                }
                                            }
                                            i24 = i24;
                                            i23 = i16;
                                            listY = list;
                                        } else {
                                            i17 = iIsoTransferCharacteristicsToColorTransfer;
                                        }
                                    }
                                    i23 = i16;
                                    listY = list;
                                }
                                i25 = i55;
                            }
                            iIsoTransferCharacteristicsToColorTransfer = i17;
                            iIsoColorPrimariesToColorSpace = iIsoColorPrimariesToColorSpace;
                            i24 = i24;
                            i23 = i16;
                            listY = list;
                            i25 = i55;
                        }
                    }
                }
            }
            position = i14 + i32;
            i21 = i9;
            i22 = i10;
            stsdData2 = stsdData;
            str2 = str6;
            iIntValue = iIntValue;
            str7 = str5;
            i30 = i15;
            i31 = iIsoTransferCharacteristicsToColorTransfer;
            drmInitDataCopyWithSchemeType = drmInitDataCopyWithSchemeType;
        }
        if (dolbyVisionConfig != 0) {
            str3 = dolbyVisionConfig.codecs;
            str4 = androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION;
        } else {
            str3 = strBuildApvCodecString;
        }
        if (str4 == null) {
            str4 = str2;
            return;
        }
        str4 = str2;
        androidx.media3.common.Format.Builder language = new androidx.media3.common.Format.Builder().setId(i11).setSampleMimeType(str4).setCodecs(str3).setWidth(unsignedShort).setHeight(unsignedShort2).setDecodedWidth(i28).setDecodedHeight(i29).setPixelWidthHeightRatio(paspFromParent).setRotationDegrees(i12).setProjectionData(projFromParent).setStereoMode(i25).setInitializationData(listY).setMaxNumReorderSamples(i26).setMaxSubLayers(i27).setDrmInitData(drmInitData2).setLanguage(str);
        androidx.media3.common.ColorInfo.Builder colorTransfer = new androidx.media3.common.ColorInfo.Builder().setColorSpace(iIsoColorPrimariesToColorSpace).setColorRange(i30).setColorTransfer(i31);
        if (byteBufferAllocateHdrStaticInfo != null) {
            drmInitData2 = drmInitDataCopyWithSchemeType;
            bArrArray = byteBufferAllocateHdrStaticInfo.array();
        } else {
            drmInitData2 = drmInitDataCopyWithSchemeType;
            bArrArray = bArr;
        }
        androidx.media3.common.Format.Builder colorInfo = language.setColorInfo(colorTransfer.setHdrStaticInfo(bArrArray).setLumaBitdepth(i23).setChromaBitdepth(i24).build());
        if (btrtFromParent != null) {
            colorInfo.setAverageBitrate(com.google.crypto.tink.shaded.protobuf.q0.F(btrtFromParent.avgBitrate)).setPeakBitrate(com.google.crypto.tink.shaded.protobuf.q0.F(btrtFromParent.maxBitrate));
        } else if (esdsFromParent != null) {
            colorInfo.setAverageBitrate(com.google.crypto.tink.shaded.protobuf.q0.F(esdsFromParent.bitrate)).setPeakBitrate(com.google.crypto.tink.shaded.protobuf.q0.F(esdsFromParent.peakBitrate));
        }
        stsdData.format = colorInfo.build();
    }

    private static androidx.media3.common.Metadata parseXyz(androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        short s9 = parsableByteArray.readShort();
        parsableByteArray.skipBytes(2);
        java.lang.String string = parsableByteArray.readString(s9);
        int iMax = java.lang.Math.max(string.lastIndexOf(43), string.lastIndexOf(45));
        try {
            return new androidx.media3.common.Metadata(new androidx.media3.container.Mp4LocationData(java.lang.Float.parseFloat(string.substring(0, iMax)), java.lang.Float.parseFloat(string.substring(iMax, string.length() - 1))));
        } catch (java.lang.IndexOutOfBoundsException | java.lang.NumberFormatException unused) {
            return null;
        }
    }

    private static int vobsubYuvToRgb(int i3) {
        int i9 = (i3 >> 16) & 255;
        int i10 = ((i3 >> 8) & 255) - 128;
        int iC = Y6.f.c(i10, 14075, 10000, i9);
        int i11 = (i3 & 255) - 128;
        int i12 = (i9 - ((i11 * 3455) / 10000)) - ((i10 * 7169) / 10000);
        return androidx.media3.common.util.Util.constrainValue(Y6.f.c(i11, 17790, 10000, i9), 0, 255) | (androidx.media3.common.util.Util.constrainValue(iC, 0, 255) << 16) | (androidx.media3.common.util.Util.constrainValue(i12, 0, 255) << 8);
    }
}
