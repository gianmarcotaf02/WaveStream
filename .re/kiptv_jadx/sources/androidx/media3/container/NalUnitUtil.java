package androidx.media3.container;

/* JADX INFO: loaded from: classes.dex */
public final class NalUnitUtil {
    public static final int EXTENDED_SAR = 255;
    public static final int H264_NAL_UNIT_TYPE_AUD = 9;
    public static final int H264_NAL_UNIT_TYPE_IDR = 5;
    public static final int H264_NAL_UNIT_TYPE_NON_IDR = 1;
    public static final int H264_NAL_UNIT_TYPE_PARTITION_A = 2;
    public static final int H264_NAL_UNIT_TYPE_PPS = 8;
    public static final int H264_NAL_UNIT_TYPE_PREFIX = 14;
    public static final int H264_NAL_UNIT_TYPE_SEI = 6;
    public static final int H264_NAL_UNIT_TYPE_SPS = 7;
    public static final int H264_NAL_UNIT_TYPE_UNSPECIFIED = 24;
    public static final int H265_NAL_UNIT_TYPE_AUD = 35;
    public static final int H265_NAL_UNIT_TYPE_BLA_W_LP = 16;
    public static final int H265_NAL_UNIT_TYPE_CRA = 21;
    public static final int H265_NAL_UNIT_TYPE_PPS = 34;
    public static final int H265_NAL_UNIT_TYPE_PREFIX_SEI = 39;
    public static final int H265_NAL_UNIT_TYPE_RASL_R = 9;
    public static final int H265_NAL_UNIT_TYPE_SPS = 33;
    public static final int H265_NAL_UNIT_TYPE_SUFFIX_SEI = 40;
    public static final int H265_NAL_UNIT_TYPE_UNSPECIFIED = 48;
    public static final int H265_NAL_UNIT_TYPE_VPS = 32;
    private static final int INVALID_ID = -1;

    @java.lang.Deprecated
    public static final int NAL_UNIT_TYPE_AUD = 9;

    @java.lang.Deprecated
    public static final int NAL_UNIT_TYPE_IDR = 5;

    @java.lang.Deprecated
    public static final int NAL_UNIT_TYPE_NON_IDR = 1;

    @java.lang.Deprecated
    public static final int NAL_UNIT_TYPE_PARTITION_A = 2;

    @java.lang.Deprecated
    public static final int NAL_UNIT_TYPE_PPS = 8;

    @java.lang.Deprecated
    public static final int NAL_UNIT_TYPE_PREFIX = 14;

    @java.lang.Deprecated
    public static final int NAL_UNIT_TYPE_SEI = 6;

    @java.lang.Deprecated
    public static final int NAL_UNIT_TYPE_SPS = 7;
    private static final java.lang.String TAG = "NalUnitUtil";
    public static final int VVC_NAL_UNIT_TYPE_DCI = 13;
    public static final int VVC_NAL_UNIT_TYPE_OPI = 12;
    public static final int VVC_NAL_UNIT_TYPE_PREFIX_SEI = 23;
    public static final byte[] NAL_START_CODE = {0, 0, 0, 1};
    public static final float[] ASPECT_RATIO_IDC_VALUES = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    private static final java.lang.Object scratchEscapePositionsLock = new java.lang.Object();
    private static int[] scratchEscapePositions = new int[10];

    public static final class H265LayerInfo {
        public final int layerIdInVps;
        public final int viewId;

        public H265LayerInfo(int i3, int i9) {
            this.layerIdInVps = i3;
            this.viewId = i9;
        }
    }

    public static final class H265NalHeader {
        public final int layerId;
        public final int nalUnitType;
        public final int temporalId;

        public H265NalHeader(int i3, int i9, int i10) {
            this.nalUnitType = i3;
            this.layerId = i9;
            this.temporalId = i10;
        }
    }

    public static final class H265ProfileTierLevel {
        public final int[] constraintBytes;
        public final int generalLevelIdc;
        public final int generalProfileCompatibilityFlags;
        public final int generalProfileIdc;
        public final int generalProfileSpace;
        public final boolean generalTierFlag;

        public H265ProfileTierLevel(int i3, boolean z6, int i9, int i10, int[] iArr, int i11) {
            this.generalProfileSpace = i3;
            this.generalTierFlag = z6;
            this.generalProfileIdc = i9;
            this.generalProfileCompatibilityFlags = i10;
            this.constraintBytes = iArr;
            this.generalLevelIdc = i11;
        }
    }

    public static final class H265ProfileTierLevelsAndIndices {
        public final int[] indices;
        public final p076i4.AbstractC2186b0 profileTierLevels;

        public H265ProfileTierLevelsAndIndices(java.util.List<androidx.media3.container.NalUnitUtil.H265ProfileTierLevel> list, int[] iArr) {
            this.profileTierLevels = p076i4.AbstractC2186b0.u(list);
            this.indices = iArr;
        }
    }

    public static final class H265RepFormat {
        public final int bitDepthChromaMinus8;
        public final int bitDepthLumaMinus8;
        public final int chromaFormatIdc;
        public final int height;
        public final int width;

        public H265RepFormat(int i3, int i9, int i10, int i11, int i12) {
            this.chromaFormatIdc = i3;
            this.bitDepthLumaMinus8 = i9;
            this.bitDepthChromaMinus8 = i10;
            this.width = i11;
            this.height = i12;
        }
    }

    public static final class H265RepFormatsAndIndices {
        public final int[] indices;
        public final p076i4.AbstractC2186b0 repFormats;

        public H265RepFormatsAndIndices(java.util.List<androidx.media3.container.NalUnitUtil.H265RepFormat> list, int[] iArr) {
            this.repFormats = p076i4.AbstractC2186b0.u(list);
            this.indices = iArr;
        }
    }

    public static final class H265Sei3dRefDisplayInfoData {
        public final int exponentRefDisplayWidth;
        public final int exponentRefViewingDist;
        public final int leftViewId;
        public final int mantissaRefDisplayWidth;
        public final int mantissaRefViewingDist;
        public final int numRefDisplays;
        public final int precRefDisplayWidth;
        public final int precRefViewingDist;
        public final int rightViewId;

        public H265Sei3dRefDisplayInfoData(int i3, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
            this.precRefDisplayWidth = i3;
            this.precRefViewingDist = i9;
            this.numRefDisplays = i10;
            this.leftViewId = i11;
            this.rightViewId = i12;
            this.exponentRefDisplayWidth = i13;
            this.mantissaRefDisplayWidth = i14;
            this.exponentRefViewingDist = i15;
            this.mantissaRefViewingDist = i16;
        }
    }

    public static final class H265SpsData {
        public final int bitDepthChromaMinus8;
        public final int bitDepthLumaMinus8;
        public final int chromaFormatIdc;
        public final int colorRange;
        public final int colorSpace;
        public final int colorTransfer;
        public final int decodedHeight;
        public final int decodedWidth;
        public final int height;
        public final int maxNumReorderPics;
        public final int maxSubLayersMinus1;
        public final androidx.media3.container.NalUnitUtil.H265NalHeader nalHeader;
        public final float pixelWidthHeightRatio;
        public final androidx.media3.container.NalUnitUtil.H265ProfileTierLevel profileTierLevel;
        public final int seqParameterSetId;
        public final int width;

        public H265SpsData(androidx.media3.container.NalUnitUtil.H265NalHeader h265NalHeader, int i3, androidx.media3.container.NalUnitUtil.H265ProfileTierLevel h265ProfileTierLevel, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, float f9, int i17, int i18, int i19, int i20) {
            this.nalHeader = h265NalHeader;
            this.maxSubLayersMinus1 = i3;
            this.profileTierLevel = h265ProfileTierLevel;
            this.chromaFormatIdc = i9;
            this.bitDepthLumaMinus8 = i10;
            this.bitDepthChromaMinus8 = i11;
            this.seqParameterSetId = i12;
            this.width = i13;
            this.height = i14;
            this.pixelWidthHeightRatio = f9;
            this.maxNumReorderPics = i17;
            this.colorSpace = i18;
            this.colorRange = i19;
            this.colorTransfer = i20;
            this.decodedWidth = i15;
            this.decodedHeight = i16;
        }
    }

    public static final class H265VideoSignalInfo {
        public final int colorRange;
        public final int colorSpace;
        public final int colorTransfer;

        public H265VideoSignalInfo(int i3, int i9, int i10) {
            this.colorSpace = i3;
            this.colorRange = i9;
            this.colorTransfer = i10;
        }
    }

    public static final class H265VideoSignalInfosAndIndices {
        public final int[] indices;
        public final p076i4.AbstractC2186b0 videoSignalInfos;

        public H265VideoSignalInfosAndIndices(java.util.List<androidx.media3.container.NalUnitUtil.H265VideoSignalInfo> list, int[] iArr) {
            this.videoSignalInfos = p076i4.AbstractC2186b0.u(list);
            this.indices = iArr;
        }
    }

    public static final class H265VpsData {
        public final p076i4.AbstractC2186b0 layerInfos;
        public final androidx.media3.container.NalUnitUtil.H265NalHeader nalHeader;
        public final androidx.media3.container.NalUnitUtil.H265ProfileTierLevelsAndIndices profileTierLevelsAndIndices;
        public final androidx.media3.container.NalUnitUtil.H265RepFormatsAndIndices repFormatsAndIndices;
        public final androidx.media3.container.NalUnitUtil.H265VideoSignalInfosAndIndices videoSignalInfosAndIndices;

        public H265VpsData(androidx.media3.container.NalUnitUtil.H265NalHeader h265NalHeader, java.util.List<androidx.media3.container.NalUnitUtil.H265LayerInfo> list, androidx.media3.container.NalUnitUtil.H265ProfileTierLevelsAndIndices h265ProfileTierLevelsAndIndices, androidx.media3.container.NalUnitUtil.H265RepFormatsAndIndices h265RepFormatsAndIndices, androidx.media3.container.NalUnitUtil.H265VideoSignalInfosAndIndices h265VideoSignalInfosAndIndices) {
            p076i4.AbstractC2186b0 abstractC2186b0U;
            this.nalHeader = h265NalHeader;
            if (list != null) {
                abstractC2186b0U = p076i4.AbstractC2186b0.u(list);
            } else {
                p076i4.Z z6 = p076i4.AbstractC2186b0.f22868i;
                abstractC2186b0U = p076i4.S0.f22832l;
            }
            this.layerInfos = abstractC2186b0U;
            this.profileTierLevelsAndIndices = h265ProfileTierLevelsAndIndices;
            this.repFormatsAndIndices = h265RepFormatsAndIndices;
            this.videoSignalInfosAndIndices = h265VideoSignalInfosAndIndices;
        }
    }

    public static final class PpsData {
        public final boolean bottomFieldPicOrderInFramePresentFlag;
        public final int picParameterSetId;
        public final int seqParameterSetId;

        public PpsData(int i3, int i9, boolean z6) {
            this.picParameterSetId = i3;
            this.seqParameterSetId = i9;
            this.bottomFieldPicOrderInFramePresentFlag = z6;
        }
    }

    public static final class SpsData {
        public final int bitDepthChromaMinus8;
        public final int bitDepthLumaMinus8;
        public final int colorRange;
        public final int colorSpace;
        public final int colorTransfer;
        public final int constraintsFlagsAndReservedZero2Bits;
        public final boolean deltaPicOrderAlwaysZeroFlag;
        public final boolean frameMbsOnlyFlag;
        public final int frameNumLength;
        public final int height;
        public final int levelIdc;
        public final int maxNumRefFrames;
        public final int maxNumReorderFrames;
        public final int picOrderCntLsbLength;
        public final int picOrderCountType;
        public final float pixelWidthHeightRatio;
        public final int profileIdc;
        public final boolean separateColorPlaneFlag;
        public final int seqParameterSetId;
        public final int width;

        public SpsData(int i3, int i9, int i10, int i11, int i12, int i13, int i14, float f9, int i15, int i16, boolean z6, boolean z9, int i17, int i18, int i19, boolean z10, int i20, int i21, int i22, int i23) {
            this.profileIdc = i3;
            this.constraintsFlagsAndReservedZero2Bits = i9;
            this.levelIdc = i10;
            this.seqParameterSetId = i11;
            this.maxNumRefFrames = i12;
            this.width = i13;
            this.height = i14;
            this.pixelWidthHeightRatio = f9;
            this.bitDepthLumaMinus8 = i15;
            this.bitDepthChromaMinus8 = i16;
            this.separateColorPlaneFlag = z6;
            this.frameMbsOnlyFlag = z9;
            this.frameNumLength = i17;
            this.picOrderCountType = i18;
            this.picOrderCntLsbLength = i19;
            this.deltaPicOrderAlwaysZeroFlag = z10;
            this.colorSpace = i20;
            this.colorRange = i21;
            this.colorTransfer = i22;
            this.maxNumReorderFrames = i23;
        }
    }

    private NalUnitUtil() {
    }

    private static int applyConformanceWindowToHeight(int i3, int i9, int i10, int i11) {
        return i3 - ((i10 + i11) * (i9 == 1 ? 2 : 1));
    }

    private static int applyConformanceWindowToWidth(int i3, int i9, int i10, int i11) {
        int i12 = 2;
        if (i9 != 1 && i9 != 2) {
            i12 = 1;
        }
        return i3 - ((i10 + i11) * i12);
    }

    public static void clearPrefixFlags(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    private static java.lang.String createCodecStringFromH265SpsPalyoad(androidx.media3.container.ParsableNalUnitBitArray parsableNalUnitBitArray) {
        parsableNalUnitBitArray.skipBits(4);
        int bits = parsableNalUnitBitArray.readBits(3);
        parsableNalUnitBitArray.skipBit();
        androidx.media3.container.NalUnitUtil.H265ProfileTierLevel h265ProfileTierLevel = parseH265ProfileTierLevel(parsableNalUnitBitArray, true, bits, null);
        return androidx.media3.common.util.CodecSpecificDataUtil.buildHevcCodecString(h265ProfileTierLevel.generalProfileSpace, h265ProfileTierLevel.generalTierFlag, h265ProfileTierLevel.generalProfileIdc, h265ProfileTierLevel.generalProfileCompatibilityFlags, h265ProfileTierLevel.constraintBytes, h265ProfileTierLevel.generalLevelIdc);
    }

    public static void discardToSps(java.nio.ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int i3 = 0;
        int i9 = 0;
        while (true) {
            int i10 = i3 + 1;
            if (i10 >= iPosition) {
                byteBuffer.clear();
                return;
            }
            int i11 = byteBuffer.get(i3) & 255;
            if (i9 == 3) {
                if (i11 == 1 && (byteBuffer.get(i10) & 31) == 7) {
                    java.nio.ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
                    byteBufferDuplicate.position(i3 - 3);
                    byteBufferDuplicate.limit(iPosition);
                    byteBuffer.position(0);
                    byteBuffer.put(byteBufferDuplicate);
                    return;
                }
            } else if (i11 == 0) {
                i9++;
            }
            if (i11 != 0) {
                i9 = 0;
            }
            i3 = i10;
        }
    }

    public static int findNalUnit(byte[] bArr, int i3, int i9, boolean[] zArr) {
        int i10 = i9 - i3;
        com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(i10 >= 0);
        if (i10 == 0) {
            return i9;
        }
        if (zArr[0]) {
            clearPrefixFlags(zArr);
            return i3 - 3;
        }
        if (i10 > 1 && zArr[1] && bArr[i3] == 1) {
            clearPrefixFlags(zArr);
            return i3 - 2;
        }
        if (i10 > 2 && zArr[2] && bArr[i3] == 0 && bArr[i3 + 1] == 1) {
            clearPrefixFlags(zArr);
            return i3 - 1;
        }
        int i11 = i9 - 1;
        int i12 = i3 + 2;
        while (i12 < i11) {
            byte b9 = bArr[i12];
            if ((b9 & 254) == 0) {
                int i13 = i12 - 2;
                if (bArr[i13] == 0 && bArr[i12 - 1] == 0 && b9 == 1) {
                    clearPrefixFlags(zArr);
                    return i13;
                }
                i12 -= 2;
            }
            i12 += 3;
        }
        zArr[0] = i10 <= 2 ? !(i10 != 2 ? !(zArr[1] && bArr[i11] == 1) : !(zArr[2] && bArr[i9 + (-2)] == 0 && bArr[i11] == 1)) : bArr[i9 + (-3)] == 0 && bArr[i9 + (-2)] == 0 && bArr[i11] == 1;
        zArr[1] = i10 <= 1 ? zArr[2] && bArr[i11] == 0 : bArr[i9 + (-2)] == 0 && bArr[i11] == 0;
        zArr[2] = bArr[i11] == 0;
        return i9;
    }

    private static p076i4.AbstractC2186b0 findNalUnitPositions(byte[] bArr) {
        boolean[] zArr = new boolean[3];
        p076i4.Y yS = p076i4.AbstractC2186b0.s();
        int i3 = 0;
        while (i3 < bArr.length) {
            int iFindNalUnit = findNalUnit(bArr, i3, bArr.length, zArr);
            if (iFindNalUnit != bArr.length) {
                yS.c(java.lang.Integer.valueOf(iFindNalUnit));
            }
            i3 = iFindNalUnit + 3;
        }
        return yS.f();
    }

    private static int findNextUnescapeIndex(byte[] bArr, int i3, int i9) {
        while (i3 < i9 - 2) {
            if (bArr[i3] == 0 && bArr[i3 + 1] == 0 && bArr[i3 + 2] == 3) {
                return i3;
            }
            i3++;
        }
        return i9;
    }

    public static java.lang.String getH265BaseLayerCodecsString(java.util.List<byte[]> list) {
        for (int i3 = 0; i3 < list.size(); i3++) {
            byte[] bArr = list.get(i3);
            int length = bArr.length;
            if (length > 3) {
                p076i4.AbstractC2186b0 abstractC2186b0FindNalUnitPositions = findNalUnitPositions(bArr);
                for (int i9 = 0; i9 < abstractC2186b0FindNalUnitPositions.size(); i9++) {
                    if (((java.lang.Integer) abstractC2186b0FindNalUnitPositions.get(i9)).intValue() + 3 < length) {
                        androidx.media3.container.ParsableNalUnitBitArray parsableNalUnitBitArray = new androidx.media3.container.ParsableNalUnitBitArray(bArr, ((java.lang.Integer) abstractC2186b0FindNalUnitPositions.get(i9)).intValue() + 3, length);
                        androidx.media3.container.NalUnitUtil.H265NalHeader h265NalHeader = parseH265NalHeader(parsableNalUnitBitArray);
                        if (h265NalHeader.nalUnitType == 33 && h265NalHeader.layerId == 0) {
                            return createCodecStringFromH265SpsPalyoad(parsableNalUnitBitArray);
                        }
                    }
                }
            }
        }
        return null;
    }

    public static int getH265NalUnitType(byte[] bArr, int i3) {
        return (bArr[i3 + 3] & 126) >> 1;
    }

    private static java.lang.String getNalStructureMimeType(androidx.media3.common.Format format) {
        java.lang.String str;
        if (java.util.Objects.equals(format.sampleMimeType, androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION) && (str = format.codecs) != null) {
            if (str.startsWith("dva1") || format.codecs.startsWith("dvav")) {
                return androidx.media3.common.MimeTypes.VIDEO_H264;
            }
            if (format.codecs.startsWith("dvh1") || format.codecs.startsWith("dvhe")) {
                return androidx.media3.common.MimeTypes.VIDEO_H265;
            }
        }
        return format.sampleMimeType;
    }

    public static int getNalUnitType(byte[] bArr, int i3) {
        return bArr[i3 + 3] & 31;
    }

    public static boolean isDependedOn(byte[] bArr, int i3, int i9, androidx.media3.common.Format format) {
        if (java.util.Objects.equals(format.sampleMimeType, androidx.media3.common.MimeTypes.VIDEO_H264)) {
            return isH264NalUnitDependedOn(bArr[i3]);
        }
        if (java.util.Objects.equals(format.sampleMimeType, androidx.media3.common.MimeTypes.VIDEO_H265)) {
            return isH265NalUnitDependedOn(bArr, i3, i9, format);
        }
        return true;
    }

    public static boolean isH264NalUnitDependedOn(byte b9) {
        if (((b9 & 96) >> 5) != 0) {
            return true;
        }
        int i3 = b9 & 31;
        return (i3 == 1 || i3 == 9 || i3 == 14) ? false : true;
    }

    private static boolean isH265NalUnitDependedOn(byte[] bArr, int i3, int i9, androidx.media3.common.Format format) {
        androidx.media3.container.NalUnitUtil.H265NalHeader h265NalHeader = parseH265NalHeader(new androidx.media3.container.ParsableNalUnitBitArray(bArr, i3, i9 + i3));
        int i10 = h265NalHeader.nalUnitType;
        if (i10 == 35) {
            return false;
        }
        return (i10 <= 14 && i10 % 2 == 0 && h265NalHeader.temporalId == format.maxSubLayers - 1) ? false : true;
    }

    @java.lang.Deprecated
    public static boolean isNalUnitSei(java.lang.String str, byte b9) {
        return (androidx.media3.common.MimeTypes.VIDEO_H264.equals(str) && (b9 & 31) == 6) || (androidx.media3.common.MimeTypes.VIDEO_H265.equals(str) && ((b9 & 126) >> 1) == 39);
    }

    public static int numberOfBytesInNalUnitHeader(androidx.media3.common.Format format) {
        java.lang.String nalStructureMimeType = getNalStructureMimeType(format);
        if (java.util.Objects.equals(nalStructureMimeType, androidx.media3.common.MimeTypes.VIDEO_H264)) {
            return 1;
        }
        return (java.util.Objects.equals(nalStructureMimeType, androidx.media3.common.MimeTypes.VIDEO_H265) || java.util.Objects.equals(nalStructureMimeType, androidx.media3.common.MimeTypes.VIDEO_H266)) ? 2 : 0;
    }

    private static androidx.media3.container.NalUnitUtil.H265NalHeader parseH265NalHeader(androidx.media3.container.ParsableNalUnitBitArray parsableNalUnitBitArray) {
        parsableNalUnitBitArray.skipBit();
        return new androidx.media3.container.NalUnitUtil.H265NalHeader(parsableNalUnitBitArray.readBits(6), parsableNalUnitBitArray.readBits(6), parsableNalUnitBitArray.readBits(3) - 1);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005e  */
    /* JADX WARN: Code duplicated, block: B:23:0x0064  */
    /* JADX WARN: Code duplicated, block: B:26:0x006c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0076  */
    /* JADX WARN: Code duplicated, block: B:39:0x006e A[SYNTHETIC] */
    private static androidx.media3.container.NalUnitUtil.H265ProfileTierLevel parseH265ProfileTierLevel(androidx.media3.container.ParsableNalUnitBitArray parsableNalUnitBitArray, boolean z6, int i3, androidx.media3.container.NalUnitUtil.H265ProfileTierLevel h265ProfileTierLevel) {
        int[] iArr;
        int i9;
        boolean z9;
        int i10;
        int i11;
        boolean bit;
        int bits;
        int i12;
        int i13;
        int[] iArr2 = new int[6];
        if (!z6) {
            if (h265ProfileTierLevel != null) {
                int i14 = h265ProfileTierLevel.generalProfileSpace;
                bit = h265ProfileTierLevel.generalTierFlag;
                bits = h265ProfileTierLevel.generalProfileIdc;
                i12 = h265ProfileTierLevel.generalProfileCompatibilityFlags;
                iArr2 = h265ProfileTierLevel.constraintBytes;
                i9 = i14;
            } else {
                iArr = iArr2;
                i9 = 0;
                z9 = false;
                i10 = 0;
                i11 = 0;
            }
            int bits2 = parsableNalUnitBitArray.readBits(8);
            i13 = 0;
            for (int i15 = 0; i15 < i3; i15++) {
                if (parsableNalUnitBitArray.readBit()) {
                    i13 += 88;
                }
                if (parsableNalUnitBitArray.readBit()) {
                    i13 += 8;
                }
            }
            parsableNalUnitBitArray.skipBits(i13);
            if (i3 > 0) {
                parsableNalUnitBitArray.skipBits((8 - i3) * 2);
            }
            return new androidx.media3.container.NalUnitUtil.H265ProfileTierLevel(i9, z9, i10, i11, iArr, bits2);
        }
        int bits3 = parsableNalUnitBitArray.readBits(2);
        bit = parsableNalUnitBitArray.readBit();
        bits = parsableNalUnitBitArray.readBits(5);
        i12 = 0;
        for (int i16 = 0; i16 < 32; i16++) {
            if (parsableNalUnitBitArray.readBit()) {
                i12 |= 1 << i16;
            }
        }
        for (int i17 = 0; i17 < 6; i17++) {
            iArr2[i17] = parsableNalUnitBitArray.readBits(8);
        }
        i9 = bits3;
        iArr = iArr2;
        z9 = bit;
        i10 = bits;
        i11 = i12;
        int bits4 = parsableNalUnitBitArray.readBits(8);
        i13 = 0;
        while (i15 < i3) {
            if (parsableNalUnitBitArray.readBit()) {
                i13 += 88;
            }
            if (parsableNalUnitBitArray.readBit()) {
                i13 += 8;
            }
        }
        parsableNalUnitBitArray.skipBits(i13);
        if (i3 > 0) {
            parsableNalUnitBitArray.skipBits((8 - i3) * 2);
        }
        return new androidx.media3.container.NalUnitUtil.H265ProfileTierLevel(i9, z9, i10, i11, iArr, bits4);
    }

    private static androidx.media3.container.NalUnitUtil.H265RepFormat parseH265RepFormat(androidx.media3.container.ParsableNalUnitBitArray parsableNalUnitBitArray) {
        int i3;
        int i9;
        int bits;
        int bits2 = parsableNalUnitBitArray.readBits(16);
        int bits3 = parsableNalUnitBitArray.readBits(16);
        if (parsableNalUnitBitArray.readBit()) {
            int bits4 = parsableNalUnitBitArray.readBits(2);
            if (bits4 == 3) {
                parsableNalUnitBitArray.skipBit();
            }
            int bits5 = parsableNalUnitBitArray.readBits(4);
            bits = parsableNalUnitBitArray.readBits(4);
            i9 = bits5;
            i3 = bits4;
        } else {
            i3 = 0;
            i9 = 0;
            bits = 0;
        }
        if (parsableNalUnitBitArray.readBit()) {
            int unsignedExpGolombCodedInt = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            int unsignedExpGolombCodedInt2 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            int unsignedExpGolombCodedInt3 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            int unsignedExpGolombCodedInt4 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            bits2 = applyConformanceWindowToWidth(bits2, i3, unsignedExpGolombCodedInt, unsignedExpGolombCodedInt2);
            bits3 = applyConformanceWindowToHeight(bits3, i3, unsignedExpGolombCodedInt3, unsignedExpGolombCodedInt4);
        }
        return new androidx.media3.container.NalUnitUtil.H265RepFormat(i3, i9, bits, bits2, bits3);
    }

    private static androidx.media3.container.NalUnitUtil.H265RepFormatsAndIndices parseH265RepFormatsAndIndices(androidx.media3.container.ParsableNalUnitBitArray parsableNalUnitBitArray, int i3) {
        int unsignedExpGolombCodedInt = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        int i9 = unsignedExpGolombCodedInt + 1;
        p076i4.Y yT = p076i4.AbstractC2186b0.t(i9);
        int[] iArr = new int[i3];
        for (int i10 = 0; i10 < i9; i10++) {
            yT.c(parseH265RepFormat(parsableNalUnitBitArray));
        }
        int i11 = 1;
        if (i9 <= 1 || !parsableNalUnitBitArray.readBit()) {
            while (i11 < i3) {
                iArr[i11] = java.lang.Math.min(i11, unsignedExpGolombCodedInt);
                i11++;
            }
        } else {
            java.math.RoundingMode roundingMode = java.math.RoundingMode.CEILING;
            int iC = p091k4.c.c(i9);
            while (i11 < i3) {
                iArr[i11] = parsableNalUnitBitArray.readBits(iC);
                i11++;
            }
        }
        return new androidx.media3.container.NalUnitUtil.H265RepFormatsAndIndices(yT.f(), iArr);
    }

    public static androidx.media3.container.NalUnitUtil.H265Sei3dRefDisplayInfoData parseH265Sei3dRefDisplayInfo(byte[] bArr, int i3, int i9) {
        byte b9;
        int i10 = i3 + 2;
        int i11 = i9 - 1;
        while (true) {
            b9 = bArr[i11];
            if (b9 != 0 || i11 <= i10) {
                break;
            }
            i11--;
        }
        if (b9 != 0 && i11 > i10) {
            androidx.media3.container.ParsableNalUnitBitArray parsableNalUnitBitArray = new androidx.media3.container.ParsableNalUnitBitArray(bArr, i10, i11 + 1);
            while (parsableNalUnitBitArray.canReadBits(16)) {
                int bits = parsableNalUnitBitArray.readBits(8);
                int i12 = 0;
                while (bits == 255) {
                    i12 += 255;
                    bits = parsableNalUnitBitArray.readBits(8);
                }
                int i13 = i12 + bits;
                int bits2 = parsableNalUnitBitArray.readBits(8);
                int i14 = 0;
                while (bits2 == 255) {
                    i14 += 255;
                    bits2 = parsableNalUnitBitArray.readBits(8);
                }
                int i15 = i14 + bits2;
                if (i15 == 0 || !parsableNalUnitBitArray.canReadBits(i15)) {
                    break;
                }
                if (i13 == 176) {
                    int unsignedExpGolombCodedInt = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                    boolean bit = parsableNalUnitBitArray.readBit();
                    int unsignedExpGolombCodedInt2 = bit ? parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() : 0;
                    int unsignedExpGolombCodedInt3 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                    int unsignedExpGolombCodedInt4 = -1;
                    int unsignedExpGolombCodedInt5 = -1;
                    int bits3 = -1;
                    int bits4 = -1;
                    int i16 = -1;
                    int bits5 = -1;
                    for (int i17 = 0; i17 <= unsignedExpGolombCodedInt3; i17++) {
                        unsignedExpGolombCodedInt4 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                        unsignedExpGolombCodedInt5 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                        bits3 = parsableNalUnitBitArray.readBits(6);
                        if (bits3 == 63) {
                            return null;
                        }
                        bits4 = parsableNalUnitBitArray.readBits(bits3 == 0 ? java.lang.Math.max(0, unsignedExpGolombCodedInt - 30) : java.lang.Math.max(0, (bits3 + unsignedExpGolombCodedInt) - 31));
                        if (bit) {
                            int bits6 = parsableNalUnitBitArray.readBits(6);
                            if (bits6 == 63) {
                                return null;
                            }
                            i16 = bits6;
                            bits5 = parsableNalUnitBitArray.readBits(bits6 == 0 ? java.lang.Math.max(0, unsignedExpGolombCodedInt2 - 30) : java.lang.Math.max(0, (bits6 + unsignedExpGolombCodedInt2) - 31));
                        }
                        if (parsableNalUnitBitArray.readBit()) {
                            parsableNalUnitBitArray.skipBits(10);
                        }
                    }
                    return new androidx.media3.container.NalUnitUtil.H265Sei3dRefDisplayInfoData(unsignedExpGolombCodedInt, unsignedExpGolombCodedInt2, unsignedExpGolombCodedInt3 + 1, unsignedExpGolombCodedInt4, unsignedExpGolombCodedInt5, bits3, bits4, i16, bits5);
                }
                parsableNalUnitBitArray.skipBits(i15 * 8);
            }
        }
        return null;
    }

    public static androidx.media3.container.NalUnitUtil.H265SpsData parseH265SpsNalUnit(byte[] bArr, int i3, int i9, androidx.media3.container.NalUnitUtil.H265VpsData h265VpsData) {
        return parseH265SpsNalUnitPayload(bArr, i3 + 2, i9, parseH265NalHeader(new androidx.media3.container.ParsableNalUnitBitArray(bArr, i3, i9)), h265VpsData);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:88:0x01c9  */
    public static androidx.media3.container.NalUnitUtil.H265SpsData parseH265SpsNalUnitPayload(byte[] bArr, int i3, int i9, androidx.media3.container.NalUnitUtil.H265NalHeader h265NalHeader, androidx.media3.container.NalUnitUtil.H265VpsData h265VpsData) {
        int unsignedExpGolombCodedInt;
        int iApplyConformanceWindowToHeight;
        int iApplyConformanceWindowToWidth;
        int unsignedExpGolombCodedInt2;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int iMax;
        float f9;
        int i15;
        int i16;
        int i17;
        int i18;
        androidx.media3.container.NalUnitUtil.H265VideoSignalInfosAndIndices h265VideoSignalInfosAndIndices;
        int i19;
        int iIsoColorPrimariesToColorSpace;
        int iIsoTransferCharacteristicsToColorTransfer;
        androidx.media3.container.NalUnitUtil.H265RepFormatsAndIndices h265RepFormatsAndIndices;
        androidx.media3.container.ParsableNalUnitBitArray parsableNalUnitBitArray = new androidx.media3.container.ParsableNalUnitBitArray(bArr, i3, i9);
        parsableNalUnitBitArray.skipBits(4);
        int bits = parsableNalUnitBitArray.readBits(3);
        boolean z6 = h265NalHeader.layerId != 0 && bits == 7;
        int i20 = (h265VpsData == null || h265VpsData.layerInfos.isEmpty()) ? 0 : ((androidx.media3.container.NalUnitUtil.H265LayerInfo) h265VpsData.layerInfos.get(java.lang.Math.min(h265NalHeader.layerId, h265VpsData.layerInfos.size() - 1))).layerIdInVps;
        androidx.media3.container.NalUnitUtil.H265ProfileTierLevel h265ProfileTierLevel = null;
        if (!z6) {
            parsableNalUnitBitArray.skipBit();
            h265ProfileTierLevel = parseH265ProfileTierLevel(parsableNalUnitBitArray, true, bits, null);
        } else if (h265VpsData != null) {
            androidx.media3.container.NalUnitUtil.H265ProfileTierLevelsAndIndices h265ProfileTierLevelsAndIndices = h265VpsData.profileTierLevelsAndIndices;
            int i21 = h265ProfileTierLevelsAndIndices.indices[i20];
            if (h265ProfileTierLevelsAndIndices.profileTierLevels.size() > i21) {
                h265ProfileTierLevel = (androidx.media3.container.NalUnitUtil.H265ProfileTierLevel) h265VpsData.profileTierLevelsAndIndices.profileTierLevels.get(i21);
            }
        }
        int unsignedExpGolombCodedInt3 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        if (z6) {
            int bits2 = parsableNalUnitBitArray.readBit() ? parsableNalUnitBitArray.readBits(8) : -1;
            if (h265VpsData == null || (h265RepFormatsAndIndices = h265VpsData.repFormatsAndIndices) == null) {
                i11 = 0;
                i10 = 0;
                i13 = 0;
                i14 = 0;
                unsignedExpGolombCodedInt2 = 0;
                unsignedExpGolombCodedInt = 0;
                i12 = 0;
            } else {
                if (bits2 == -1) {
                    bits2 = h265RepFormatsAndIndices.indices[i20];
                }
                if (bits2 == -1 || h265RepFormatsAndIndices.repFormats.size() <= bits2) {
                    i11 = 0;
                    i10 = 0;
                    i13 = 0;
                    i14 = 0;
                    unsignedExpGolombCodedInt2 = 0;
                    unsignedExpGolombCodedInt = 0;
                    i12 = 0;
                } else {
                    androidx.media3.container.NalUnitUtil.H265RepFormat h265RepFormat = (androidx.media3.container.NalUnitUtil.H265RepFormat) h265VpsData.repFormatsAndIndices.repFormats.get(bits2);
                    unsignedExpGolombCodedInt = h265RepFormat.chromaFormatIdc;
                    i12 = h265RepFormat.width;
                    i10 = h265RepFormat.height;
                    i13 = h265RepFormat.bitDepthLumaMinus8;
                    unsignedExpGolombCodedInt2 = h265RepFormat.bitDepthChromaMinus8;
                    i11 = i10;
                    i14 = i12;
                }
            }
        } else {
            unsignedExpGolombCodedInt = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            if (unsignedExpGolombCodedInt == 3) {
                parsableNalUnitBitArray.skipBit();
            }
            int unsignedExpGolombCodedInt4 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            int unsignedExpGolombCodedInt5 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            if (parsableNalUnitBitArray.readBit()) {
                int unsignedExpGolombCodedInt6 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                int unsignedExpGolombCodedInt7 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                int unsignedExpGolombCodedInt8 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                int unsignedExpGolombCodedInt9 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                iApplyConformanceWindowToWidth = applyConformanceWindowToWidth(unsignedExpGolombCodedInt4, unsignedExpGolombCodedInt, unsignedExpGolombCodedInt6, unsignedExpGolombCodedInt7);
                iApplyConformanceWindowToHeight = applyConformanceWindowToHeight(unsignedExpGolombCodedInt5, unsignedExpGolombCodedInt, unsignedExpGolombCodedInt8, unsignedExpGolombCodedInt9);
            } else {
                iApplyConformanceWindowToHeight = unsignedExpGolombCodedInt5;
                iApplyConformanceWindowToWidth = unsignedExpGolombCodedInt4;
            }
            int unsignedExpGolombCodedInt10 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            unsignedExpGolombCodedInt2 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            i10 = iApplyConformanceWindowToHeight;
            i11 = unsignedExpGolombCodedInt5;
            i12 = iApplyConformanceWindowToWidth;
            i13 = unsignedExpGolombCodedInt10;
            i14 = unsignedExpGolombCodedInt4;
        }
        int unsignedExpGolombCodedInt11 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        if (z6) {
            iMax = -1;
        } else {
            int i22 = parsableNalUnitBitArray.readBit() ? 0 : bits;
            iMax = -1;
            while (i22 <= bits) {
                parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                iMax = java.lang.Math.max(parsableNalUnitBitArray.readUnsignedExpGolombCodedInt(), iMax);
                parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                i22++;
                i11 = i11;
            }
        }
        int i23 = i11;
        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        if (parsableNalUnitBitArray.readBit()) {
            if (z6 ? parsableNalUnitBitArray.readBit() : false) {
                parsableNalUnitBitArray.skipBits(6);
            } else if (parsableNalUnitBitArray.readBit()) {
                skipH265ScalingList(parsableNalUnitBitArray);
            }
        }
        int i24 = 2;
        parsableNalUnitBitArray.skipBits(2);
        if (parsableNalUnitBitArray.readBit()) {
            parsableNalUnitBitArray.skipBits(8);
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            parsableNalUnitBitArray.skipBit();
        }
        skipH265ShortTermReferencePictureSets(parsableNalUnitBitArray);
        if (parsableNalUnitBitArray.readBit()) {
            int unsignedExpGolombCodedInt12 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            int i25 = 0;
            while (i25 < unsignedExpGolombCodedInt12) {
                parsableNalUnitBitArray.skipBits(unsignedExpGolombCodedInt11 + 5);
                i25++;
                i24 = 2;
            }
        }
        parsableNalUnitBitArray.skipBits(i24);
        if (parsableNalUnitBitArray.readBit()) {
            if (parsableNalUnitBitArray.readBit()) {
                int bits3 = parsableNalUnitBitArray.readBits(8);
                if (bits3 == 255) {
                    int bits4 = parsableNalUnitBitArray.readBits(16);
                    int bits5 = parsableNalUnitBitArray.readBits(16);
                    if (bits4 == 0 || bits5 == 0) {
                        f9 = 1.0f;
                    } else {
                        f9 = bits4 / bits5;
                    }
                } else {
                    float[] fArr = ASPECT_RATIO_IDC_VALUES;
                    if (bits3 < fArr.length) {
                        f9 = fArr[bits3];
                    } else {
                        Y6.f.p(bits3, "Unexpected aspect_ratio_idc value: ", TAG);
                        f9 = 1.0f;
                    }
                }
            } else {
                f9 = 1.0f;
            }
            if (parsableNalUnitBitArray.readBit()) {
                parsableNalUnitBitArray.skipBit();
            }
            if (parsableNalUnitBitArray.readBit()) {
                parsableNalUnitBitArray.skipBits(3);
                i18 = parsableNalUnitBitArray.readBit() ? 1 : 2;
                if (parsableNalUnitBitArray.readBit()) {
                    int bits6 = parsableNalUnitBitArray.readBits(8);
                    int bits7 = parsableNalUnitBitArray.readBits(8);
                    parsableNalUnitBitArray.skipBits(8);
                    iIsoColorPrimariesToColorSpace = androidx.media3.common.ColorInfo.isoColorPrimariesToColorSpace(bits6);
                    iIsoTransferCharacteristicsToColorTransfer = androidx.media3.common.ColorInfo.isoTransferCharacteristicsToColorTransfer(bits7);
                } else {
                    iIsoColorPrimariesToColorSpace = -1;
                    iIsoTransferCharacteristicsToColorTransfer = -1;
                }
            } else if (h265VpsData == null || (h265VideoSignalInfosAndIndices = h265VpsData.videoSignalInfosAndIndices) == null || h265VideoSignalInfosAndIndices.videoSignalInfos.size() <= (i19 = h265VideoSignalInfosAndIndices.indices[i20])) {
                i18 = -1;
                iIsoColorPrimariesToColorSpace = -1;
                iIsoTransferCharacteristicsToColorTransfer = -1;
            } else {
                androidx.media3.container.NalUnitUtil.H265VideoSignalInfo h265VideoSignalInfo = (androidx.media3.container.NalUnitUtil.H265VideoSignalInfo) h265VpsData.videoSignalInfosAndIndices.videoSignalInfos.get(i19);
                iIsoColorPrimariesToColorSpace = h265VideoSignalInfo.colorSpace;
                int i26 = h265VideoSignalInfo.colorRange;
                iIsoTransferCharacteristicsToColorTransfer = h265VideoSignalInfo.colorTransfer;
                i18 = i26;
            }
            if (parsableNalUnitBitArray.readBit()) {
                parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            }
            parsableNalUnitBitArray.skipBit();
            if (parsableNalUnitBitArray.readBit()) {
                i10 *= 2;
            }
            i17 = iIsoTransferCharacteristicsToColorTransfer;
            i16 = i18;
            i15 = iIsoColorPrimariesToColorSpace;
        } else {
            f9 = 1.0f;
            i15 = -1;
            i16 = -1;
            i17 = -1;
        }
        return new androidx.media3.container.NalUnitUtil.H265SpsData(h265NalHeader, bits, h265ProfileTierLevel, unsignedExpGolombCodedInt, i13, unsignedExpGolombCodedInt2, unsignedExpGolombCodedInt3, i12, i10, i14, i23, f9, iMax, i15, i16, i17);
    }

    private static androidx.media3.container.NalUnitUtil.H265VideoSignalInfo parseH265VideoSignalInfo(androidx.media3.container.ParsableNalUnitBitArray parsableNalUnitBitArray) {
        parsableNalUnitBitArray.skipBits(3);
        int i3 = parsableNalUnitBitArray.readBit() ? 1 : 2;
        int iIsoColorPrimariesToColorSpace = androidx.media3.common.ColorInfo.isoColorPrimariesToColorSpace(parsableNalUnitBitArray.readBits(8));
        int iIsoTransferCharacteristicsToColorTransfer = androidx.media3.common.ColorInfo.isoTransferCharacteristicsToColorTransfer(parsableNalUnitBitArray.readBits(8));
        parsableNalUnitBitArray.skipBits(8);
        return new androidx.media3.container.NalUnitUtil.H265VideoSignalInfo(iIsoColorPrimariesToColorSpace, i3, iIsoTransferCharacteristicsToColorTransfer);
    }

    private static androidx.media3.container.NalUnitUtil.H265VideoSignalInfosAndIndices parseH265VideoSignalInfosAndIndices(androidx.media3.container.ParsableNalUnitBitArray parsableNalUnitBitArray, int i3, int i9, int[] iArr) {
        if (!parsableNalUnitBitArray.readBit() ? parsableNalUnitBitArray.readBit() : true) {
            parsableNalUnitBitArray.skipBit();
        }
        boolean bit = parsableNalUnitBitArray.readBit();
        boolean bit2 = parsableNalUnitBitArray.readBit();
        if (bit || bit2) {
            for (int i10 = 0; i10 < i9; i10++) {
                for (int i11 = 0; i11 < iArr[i10]; i11++) {
                    boolean bit3 = bit ? parsableNalUnitBitArray.readBit() : false;
                    boolean bit4 = bit2 ? parsableNalUnitBitArray.readBit() : false;
                    if (bit3) {
                        parsableNalUnitBitArray.skipBits(32);
                    }
                    if (bit4) {
                        parsableNalUnitBitArray.skipBits(18);
                    }
                }
            }
        }
        boolean bit5 = parsableNalUnitBitArray.readBit();
        int bits = bit5 ? parsableNalUnitBitArray.readBits(4) + 1 : i3;
        p076i4.Y yT = p076i4.AbstractC2186b0.t(bits);
        int[] iArr2 = new int[i3];
        for (int i12 = 0; i12 < bits; i12++) {
            yT.c(parseH265VideoSignalInfo(parsableNalUnitBitArray));
        }
        if (bit5 && bits > 1) {
            for (int i13 = 0; i13 < i3; i13++) {
                iArr2[i13] = parsableNalUnitBitArray.readBits(4);
            }
        }
        return new androidx.media3.container.NalUnitUtil.H265VideoSignalInfosAndIndices(yT.f(), iArr2);
    }

    public static androidx.media3.container.NalUnitUtil.H265VpsData parseH265VpsNalUnit(byte[] bArr, int i3, int i9) {
        androidx.media3.container.ParsableNalUnitBitArray parsableNalUnitBitArray = new androidx.media3.container.ParsableNalUnitBitArray(bArr, i3, i9);
        return parseH265VpsNalUnitPayload(parsableNalUnitBitArray, parseH265NalHeader(parsableNalUnitBitArray));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static androidx.media3.container.NalUnitUtil.H265VpsData parseH265VpsNalUnitPayload(androidx.media3.container.ParsableNalUnitBitArray parsableNalUnitBitArray, androidx.media3.container.NalUnitUtil.H265NalHeader h265NalHeader) {
        int[] iArr;
        int i3;
        int i9;
        androidx.media3.container.NalUnitUtil.H265VideoSignalInfosAndIndices h265VideoSignalInfosAndIndices;
        int i10;
        int i11;
        int i12;
        int[] iArr2;
        p076i4.S0 s9;
        int i13;
        boolean[][] zArr;
        int[] iArr3;
        int i14;
        parsableNalUnitBitArray.skipBits(4);
        boolean bit = parsableNalUnitBitArray.readBit();
        boolean bit2 = parsableNalUnitBitArray.readBit();
        int bits = parsableNalUnitBitArray.readBits(6);
        int i15 = bits + 1;
        int bits2 = parsableNalUnitBitArray.readBits(3);
        parsableNalUnitBitArray.skipBits(17);
        androidx.media3.container.NalUnitUtil.H265ProfileTierLevel h265ProfileTierLevel = parseH265ProfileTierLevel(parsableNalUnitBitArray, true, bits2, null);
        boolean z6 = false;
        for (int i16 = parsableNalUnitBitArray.readBit() ? 0 : bits2; i16 <= bits2; i16++) {
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        }
        int bits3 = parsableNalUnitBitArray.readBits(6);
        int unsignedExpGolombCodedInt = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 1;
        androidx.media3.container.NalUnitUtil.H265ProfileTierLevelsAndIndices h265ProfileTierLevelsAndIndices = new androidx.media3.container.NalUnitUtil.H265ProfileTierLevelsAndIndices(p076i4.AbstractC2186b0.y(h265ProfileTierLevel), new int[1]);
        java.lang.Object[] objArr = i15 >= 2 && unsignedExpGolombCodedInt >= 2;
        java.lang.Object[] objArr2 = bit && bit2;
        int i17 = bits3 + 1;
        java.lang.Object[] objArr3 = i17 >= i15;
        if (objArr != true || objArr2 != true || objArr3 != true) {
            return new androidx.media3.container.NalUnitUtil.H265VpsData(h265NalHeader, null, h265ProfileTierLevelsAndIndices, null, null);
        }
        java.lang.Class cls = java.lang.Integer.TYPE;
        int[][] iArr4 = (int[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) cls, unsignedExpGolombCodedInt, i17);
        int i18 = 1;
        int[] iArr5 = new int[unsignedExpGolombCodedInt];
        int[] iArr6 = new int[unsignedExpGolombCodedInt];
        iArr4[0][0] = 0;
        iArr5[0] = 1;
        iArr6[0] = 0;
        for (int i19 = 1; i19 < unsignedExpGolombCodedInt; i19++) {
            int i20 = 0;
            for (int i21 = 0; i21 <= bits3; i21++) {
                if (parsableNalUnitBitArray.readBit()) {
                    iArr4[i19][i20] = i21;
                    iArr6[i19] = i21;
                    i20++;
                }
                iArr5[i19] = i20;
            }
        }
        if (parsableNalUnitBitArray.readBit()) {
            parsableNalUnitBitArray.skipBits(64);
            if (parsableNalUnitBitArray.readBit()) {
                parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            }
            int unsignedExpGolombCodedInt2 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            int i22 = 0;
            while (i22 < unsignedExpGolombCodedInt2) {
                parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                if (i22 == 0 || parsableNalUnitBitArray.readBit()) {
                    z6 = true;
                }
                skipH265HrdParameters(parsableNalUnitBitArray, z6, bits2);
                i22++;
                z6 = false;
            }
        }
        if (!parsableNalUnitBitArray.readBit()) {
            return new androidx.media3.container.NalUnitUtil.H265VpsData(h265NalHeader, null, h265ProfileTierLevelsAndIndices, null, null);
        }
        parsableNalUnitBitArray.byteAlign();
        androidx.media3.container.NalUnitUtil.H265ProfileTierLevel h265ProfileTierLevel2 = parseH265ProfileTierLevel(parsableNalUnitBitArray, false, bits2, h265ProfileTierLevel);
        boolean bit3 = parsableNalUnitBitArray.readBit();
        int i23 = 6;
        boolean[] zArr2 = new boolean[16];
        int i24 = 0;
        for (int i25 = 0; i25 < 16; i25++) {
            boolean bit4 = parsableNalUnitBitArray.readBit();
            zArr2[i25] = bit4;
            if (bit4) {
                i24++;
            }
        }
        if (i24 == 0 || !zArr2[1]) {
            return new androidx.media3.container.NalUnitUtil.H265VpsData(h265NalHeader, null, h265ProfileTierLevelsAndIndices, null, null);
        }
        int[] iArr7 = new int[i24];
        for (int i26 = 0; i26 < i24 - (bit3 ? 1 : 0); i26++) {
            iArr7[i26] = parsableNalUnitBitArray.readBits(3);
        }
        int[] iArr8 = new int[i24 + 1];
        if (bit3) {
            int i27 = 1;
            while (i27 < i24) {
                int[] iArr9 = iArr8;
                for (int i28 = 0; i28 < i27; i28++) {
                    iArr9[i27] = iArr7[i28] + 1 + iArr9[i27];
                }
                i27++;
                iArr8 = iArr9;
            }
            iArr = iArr8;
            iArr[i24] = 6;
        } else {
            iArr = iArr8;
        }
        int[][] iArr10 = (int[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) cls, i15, i24);
        int[] iArr11 = new int[i15];
        iArr11[0] = 0;
        boolean bit5 = parsableNalUnitBitArray.readBit();
        int i29 = 1;
        while (i29 < i15) {
            if (bit5) {
                i14 = i29;
                iArr11[i14] = parsableNalUnitBitArray.readBits(i23);
            } else {
                i14 = i29;
                iArr11[i14] = i14;
            }
            if (bit3) {
                int i30 = 0;
                while (i30 < i24) {
                    int i31 = i30 + 1;
                    iArr10[i14][i30] = (iArr11[i14] & ((1 << iArr[i31]) - 1)) >> iArr[i30];
                    i30 = i31;
                }
            } else {
                int i32 = 0;
                while (i32 < i24) {
                    int i33 = i32;
                    iArr10[i14][i33] = parsableNalUnitBitArray.readBits(iArr7[i32] + 1);
                    i32 = i33 + 1;
                }
            }
            i29 = i14 + 1;
            i23 = 6;
        }
        int[] iArr12 = new int[i17];
        int i34 = 1;
        int i35 = 0;
        while (i35 < i15) {
            iArr12[iArr11[i35]] = -1;
            int[] iArr13 = iArr12;
            int i36 = 0;
            int i37 = 0;
            while (i36 < 16) {
                if (zArr2[i36]) {
                    if (i36 == i18) {
                        iArr13[iArr11[i35]] = iArr10[i35][i37];
                    }
                    i37++;
                }
                i36++;
                i18 = 1;
            }
            if (i35 > 0) {
                int i38 = 0;
                while (true) {
                    if (i38 >= i35) {
                        i34++;
                        break;
                    }
                    int i39 = i38;
                    if (iArr13[iArr11[i35]] == iArr13[iArr11[i38]]) {
                        break;
                    }
                    i38 = i39 + 1;
                }
            }
            i35++;
            iArr12 = iArr13;
            i18 = 1;
        }
        int[] iArr14 = iArr12;
        int bits4 = parsableNalUnitBitArray.readBits(4);
        if (i34 < 2 || bits4 == 0) {
            return new androidx.media3.container.NalUnitUtil.H265VpsData(h265NalHeader, null, h265ProfileTierLevelsAndIndices, null, null);
        }
        int[] iArr15 = new int[i34];
        for (int i40 = 0; i40 < i34; i40++) {
            iArr15[i40] = parsableNalUnitBitArray.readBits(bits4);
        }
        int[] iArr16 = new int[i17];
        int i41 = 0;
        while (i41 < i15) {
            int[] iArr17 = iArr16;
            iArr17[java.lang.Math.min(iArr11[i41], bits3)] = i41;
            i41++;
            iArr16 = iArr17;
        }
        int[] iArr18 = iArr16;
        p076i4.Y yS = p076i4.AbstractC2186b0.s();
        int i42 = 0;
        while (i42 <= bits3) {
            int i43 = i34;
            int[] iArr19 = iArr6;
            int iMin = java.lang.Math.min(iArr14[i42], i43 - 1);
            yS.c(new androidx.media3.container.NalUnitUtil.H265LayerInfo(iArr18[i42], iMin >= 0 ? iArr15[iMin] : -1));
            i42++;
            i34 = i43;
            iArr6 = iArr19;
            iArr15 = iArr15;
        }
        int[] iArr20 = iArr6;
        p076i4.S0 s0F = yS.f();
        if (((androidx.media3.container.NalUnitUtil.H265LayerInfo) s0F.get(0)).viewId == -1) {
            return new androidx.media3.container.NalUnitUtil.H265VpsData(h265NalHeader, null, h265ProfileTierLevelsAndIndices, null, null);
        }
        int i44 = 1;
        while (true) {
            if (i44 > bits3) {
                i3 = -1;
                i9 = -1;
                break;
            }
            i3 = -1;
            if (((androidx.media3.container.NalUnitUtil.H265LayerInfo) s0F.get(i44)).viewId != -1) {
                i9 = i44;
                break;
            }
            i44++;
        }
        if (i9 == i3) {
            return new androidx.media3.container.NalUnitUtil.H265VpsData(h265NalHeader, null, h265ProfileTierLevelsAndIndices, null, null);
        }
        java.lang.Class cls2 = java.lang.Boolean.TYPE;
        boolean[][] zArr3 = (boolean[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) cls2, i15, i15);
        boolean[][] zArr4 = (boolean[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) cls2, i15, i15);
        int i45 = 1;
        while (i45 < i15) {
            boolean[][] zArr5 = zArr4;
            for (int i46 = 0; i46 < i45; i46++) {
                boolean[] zArr6 = zArr3[i45];
                boolean[] zArr7 = zArr5[i45];
                boolean bit6 = parsableNalUnitBitArray.readBit();
                zArr7[i46] = bit6;
                zArr6[i46] = bit6;
            }
            i45++;
            zArr4 = zArr5;
        }
        boolean[][] zArr8 = zArr4;
        for (int i47 = 1; i47 < i15; i47++) {
            int i48 = 0;
            while (i48 < bits) {
                int[] iArr21 = iArr11;
                for (int i49 = 0; i49 < i47; i49++) {
                    boolean[] zArr9 = zArr8[i47];
                    if (zArr9[i49] && zArr8[i49][i48]) {
                        zArr9[i48] = true;
                        break;
                    }
                }
                i48++;
                iArr11 = iArr21;
            }
        }
        int[] iArr22 = iArr11;
        int[] iArr23 = new int[i17];
        for (int i50 = 0; i50 < i15; i50++) {
            int i51 = 0;
            for (int i52 = 0; i52 < i50; i52++) {
                i51 += zArr3[i50][i52] ? 1 : 0;
            }
            iArr23[iArr22[i50]] = i51;
        }
        int i53 = 0;
        for (int i54 = 0; i54 < i15; i54++) {
            if (iArr23[iArr22[i54]] == 0) {
                i53++;
            }
        }
        if (i53 > 1) {
            return new androidx.media3.container.NalUnitUtil.H265VpsData(h265NalHeader, null, h265ProfileTierLevelsAndIndices, null, null);
        }
        int[] iArr24 = new int[i15];
        int[] iArr25 = new int[unsignedExpGolombCodedInt];
        if (parsableNalUnitBitArray.readBit()) {
            int i55 = 0;
            while (i55 < i15) {
                int i56 = i55;
                iArr24[i56] = parsableNalUnitBitArray.readBits(3);
                i55 = i56 + 1;
            }
        } else {
            java.util.Arrays.fill(iArr24, 0, i15, bits2);
        }
        int i57 = 0;
        while (i57 < unsignedExpGolombCodedInt) {
            int i58 = i57;
            boolean[][] zArr10 = zArr3;
            int[] iArr26 = iArr24;
            int iMax = 0;
            for (int i59 = 0; i59 < iArr5[i58]; i59++) {
                iMax = java.lang.Math.max(iMax, iArr26[((androidx.media3.container.NalUnitUtil.H265LayerInfo) s0F.get(iArr4[i58][i59])).layerIdInVps]);
            }
            iArr25[i58] = iMax + 1;
            i57 = i58 + 1;
            iArr24 = iArr26;
            zArr3 = zArr10;
        }
        boolean[][] zArr11 = zArr3;
        if (parsableNalUnitBitArray.readBit()) {
            int i60 = 0;
            while (i60 < bits) {
                int i61 = i60 + 1;
                int i62 = i61;
                while (i62 < i15) {
                    if (zArr11[i62][i60]) {
                        parsableNalUnitBitArray.skipBits(3);
                    }
                    i62++;
                    i60 = i60;
                }
                i60 = i61;
            }
        }
        parsableNalUnitBitArray.skipBit();
        int unsignedExpGolombCodedInt3 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 1;
        p076i4.Y yS2 = p076i4.AbstractC2186b0.s();
        yS2.c(h265ProfileTierLevel);
        if (unsignedExpGolombCodedInt3 > 1) {
            yS2.c(h265ProfileTierLevel2);
            for (int i63 = 2; i63 < unsignedExpGolombCodedInt3; i63++) {
                h265ProfileTierLevel2 = parseH265ProfileTierLevel(parsableNalUnitBitArray, parsableNalUnitBitArray.readBit(), bits2, h265ProfileTierLevel2);
                yS2.c(h265ProfileTierLevel2);
            }
        }
        p076i4.S0 s0F2 = yS2.f();
        int unsignedExpGolombCodedInt4 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + unsignedExpGolombCodedInt;
        if (unsignedExpGolombCodedInt4 > unsignedExpGolombCodedInt) {
            return new androidx.media3.container.NalUnitUtil.H265VpsData(h265NalHeader, null, h265ProfileTierLevelsAndIndices, null, null);
        }
        int bits5 = parsableNalUnitBitArray.readBits(2);
        boolean[][] zArr12 = (boolean[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) cls2, unsignedExpGolombCodedInt4, i17);
        int[] iArr27 = new int[unsignedExpGolombCodedInt4];
        int i64 = 0;
        int[] iArr28 = new int[unsignedExpGolombCodedInt4];
        int i65 = 0;
        while (i65 < unsignedExpGolombCodedInt) {
            iArr27[i65] = i64;
            iArr28[i65] = iArr20[i65];
            if (bits5 == 0) {
                i13 = i65;
                zArr = zArr12;
                s9 = s0F2;
                iArr3 = iArr27;
                java.util.Arrays.fill(zArr12[i13], i64, iArr5[i13], true);
                iArr3[i13] = iArr5[i13];
            } else {
                s9 = s0F2;
                i13 = i65;
                zArr = zArr12;
                iArr3 = iArr27;
                if (bits5 == 1) {
                    int i66 = iArr20[i13];
                    for (int i67 = 0; i67 < iArr5[i13]; i67++) {
                        zArr[i13][i67] = iArr4[i13][i67] == i66;
                    }
                    iArr3[i13] = 1;
                } else {
                    i64 = 0;
                    zArr[0][0] = true;
                    iArr3[0] = 1;
                }
                i65 = i13 + 1;
                zArr12 = zArr;
                iArr27 = iArr3;
                s0F2 = s9;
            }
            i64 = 0;
            i65 = i13 + 1;
            zArr12 = zArr;
            iArr27 = iArr3;
            s0F2 = s9;
        }
        p076i4.S0 s10 = s0F2;
        boolean[][] zArr13 = zArr12;
        int[] iArr29 = iArr27;
        int[] iArr30 = new int[i17];
        int i68 = 2;
        int[] iArr31 = new int[2];
        iArr31[1] = i17;
        iArr31[i64] = unsignedExpGolombCodedInt4;
        boolean[][] zArr14 = (boolean[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) cls2, iArr31);
        int i69 = 1;
        int i70 = 0;
        while (i69 < unsignedExpGolombCodedInt4) {
            if (bits5 == i68) {
                for (int i71 = 0; i71 < iArr5[i69]; i71++) {
                    zArr13[i69][i71] = parsableNalUnitBitArray.readBit();
                    int i72 = iArr29[i69];
                    boolean z9 = zArr13[i69][i71];
                    iArr29[i69] = i72 + (z9 ? 1 : 0);
                    if (z9) {
                        iArr28[i69] = iArr4[i69][i71];
                    }
                }
            }
            if (i70 == 0) {
                i10 = 0;
                if (iArr4[i69][0] == 0 && zArr13[i69][0]) {
                    for (int i73 = 1; i73 < iArr5[i69]; i73++) {
                        if (iArr4[i69][i73] == i9 && zArr13[i69][i9]) {
                            i70 = i69;
                        }
                    }
                }
            } else {
                i10 = 0;
            }
            int i74 = i10;
            while (i74 < iArr5[i69]) {
                if (unsignedExpGolombCodedInt3 > 1) {
                    zArr14[i69][i74] = zArr13[i69][i74];
                    i12 = i9;
                    iArr2 = iArr30;
                    java.math.RoundingMode roundingMode = java.math.RoundingMode.CEILING;
                    int iC = p091k4.c.c(unsignedExpGolombCodedInt3);
                    if (zArr14[i69][i74]) {
                        i11 = unsignedExpGolombCodedInt3;
                    } else {
                        int i75 = ((androidx.media3.container.NalUnitUtil.H265LayerInfo) s0F.get(iArr4[i69][i74])).layerIdInVps;
                        i11 = unsignedExpGolombCodedInt3;
                        int i76 = i10;
                        while (i76 < i74) {
                            int i77 = i76;
                            if (zArr8[i75][((androidx.media3.container.NalUnitUtil.H265LayerInfo) s0F.get(iArr4[i69][i77])).layerIdInVps]) {
                                zArr14[i69][i74] = true;
                                break;
                            }
                            i76 = i77 + 1;
                        }
                    }
                    if (zArr14[i69][i74]) {
                        if (i70 <= 0 || i69 != i70) {
                            parsableNalUnitBitArray.skipBits(iC);
                        } else {
                            iArr2[i74] = parsableNalUnitBitArray.readBits(iC);
                        }
                    }
                } else {
                    i11 = unsignedExpGolombCodedInt3;
                    i12 = i9;
                    iArr2 = iArr30;
                }
                i74++;
                i9 = i12;
                iArr30 = iArr2;
                unsignedExpGolombCodedInt3 = i11;
            }
            int i78 = unsignedExpGolombCodedInt3;
            int i79 = i9;
            int[] iArr32 = iArr30;
            if (iArr29[i69] == 1 && iArr23[iArr28[i69]] > 0) {
                parsableNalUnitBitArray.skipBit();
            }
            i69++;
            i9 = i79;
            iArr30 = iArr32;
            unsignedExpGolombCodedInt3 = i78;
            i68 = 2;
        }
        int[] iArr33 = iArr30;
        if (i70 == 0) {
            return new androidx.media3.container.NalUnitUtil.H265VpsData(h265NalHeader, null, h265ProfileTierLevelsAndIndices, null, null);
        }
        androidx.media3.container.NalUnitUtil.H265RepFormatsAndIndices h265RepFormatsAndIndices = parseH265RepFormatsAndIndices(parsableNalUnitBitArray, i15);
        parsableNalUnitBitArray.skipBits(2);
        for (int i80 = 1; i80 < i15; i80++) {
            if (iArr23[iArr22[i80]] == 0) {
                parsableNalUnitBitArray.skipBit();
            }
        }
        skipH265DpbSize(parsableNalUnitBitArray, unsignedExpGolombCodedInt4, iArr25, iArr5, zArr14);
        skipToH265VuiPresentFlagAfterDpbSize(parsableNalUnitBitArray, i15, zArr11);
        if (parsableNalUnitBitArray.readBit()) {
            parsableNalUnitBitArray.byteAlign();
            h265VideoSignalInfosAndIndices = parseH265VideoSignalInfosAndIndices(parsableNalUnitBitArray, i15, unsignedExpGolombCodedInt, iArr25);
        } else {
            h265VideoSignalInfosAndIndices = null;
        }
        return new androidx.media3.container.NalUnitUtil.H265VpsData(h265NalHeader, s0F, new androidx.media3.container.NalUnitUtil.H265ProfileTierLevelsAndIndices(s10, iArr33), h265RepFormatsAndIndices, h265VideoSignalInfosAndIndices);
    }

    public static androidx.media3.container.NalUnitUtil.PpsData parsePpsNalUnit(byte[] bArr, int i3, int i9) {
        return parsePpsNalUnitPayload(bArr, i3 + 1, i9);
    }

    public static androidx.media3.container.NalUnitUtil.PpsData parsePpsNalUnitPayload(byte[] bArr, int i3, int i9) {
        androidx.media3.container.ParsableNalUnitBitArray parsableNalUnitBitArray = new androidx.media3.container.ParsableNalUnitBitArray(bArr, i3, i9);
        int unsignedExpGolombCodedInt = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        int unsignedExpGolombCodedInt2 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        parsableNalUnitBitArray.skipBit();
        return new androidx.media3.container.NalUnitUtil.PpsData(unsignedExpGolombCodedInt, unsignedExpGolombCodedInt2, parsableNalUnitBitArray.readBit());
    }

    public static androidx.media3.container.NalUnitUtil.SpsData parseSpsNalUnit(byte[] bArr, int i3, int i9) {
        return parseSpsNalUnitPayload(bArr, i3 + 1, i9);
    }

    /* JADX WARN: Code duplicated, block: B:113:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:116:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:119:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:122:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:125:0x0204  */
    /* JADX WARN: Code duplicated, block: B:128:0x0210  */
    public static androidx.media3.container.NalUnitUtil.SpsData parseSpsNalUnitPayload(byte[] bArr, int i3, int i9) {
        int unsignedExpGolombCodedInt;
        boolean bit;
        int unsignedExpGolombCodedInt2;
        int i10;
        int i11;
        boolean z6;
        int unsignedExpGolombCodedInt3;
        int i12;
        float f9;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean bit2;
        boolean bit3;
        int i19;
        int i20;
        androidx.media3.container.ParsableNalUnitBitArray parsableNalUnitBitArray = new androidx.media3.container.ParsableNalUnitBitArray(bArr, i3, i9);
        int bits = parsableNalUnitBitArray.readBits(8);
        int bits2 = parsableNalUnitBitArray.readBits(8);
        int bits3 = parsableNalUnitBitArray.readBits(8);
        int unsignedExpGolombCodedInt4 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        if (bits == 100 || bits == 110 || bits == 122 || bits == 244 || bits == 44 || bits == 83 || bits == 86 || bits == 118 || bits == 128 || bits == 138) {
            unsignedExpGolombCodedInt = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            bit = unsignedExpGolombCodedInt == 3 ? parsableNalUnitBitArray.readBit() : false;
            unsignedExpGolombCodedInt2 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            int unsignedExpGolombCodedInt5 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            parsableNalUnitBitArray.skipBit();
            if (parsableNalUnitBitArray.readBit()) {
                int i21 = unsignedExpGolombCodedInt != 3 ? 8 : 12;
                i10 = 16;
                int i22 = 0;
                while (i22 < i21) {
                    if (parsableNalUnitBitArray.readBit()) {
                        skipScalingList(parsableNalUnitBitArray, i22 < 6 ? 16 : 64);
                    }
                    i22++;
                }
            } else {
                i10 = 16;
            }
            i11 = unsignedExpGolombCodedInt5;
        } else {
            unsignedExpGolombCodedInt = 1;
            i10 = 16;
            i11 = 0;
            bit = false;
            unsignedExpGolombCodedInt2 = 0;
        }
        int unsignedExpGolombCodedInt6 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 4;
        int unsignedExpGolombCodedInt7 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        if (unsignedExpGolombCodedInt7 == 0) {
            unsignedExpGolombCodedInt3 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 4;
            bits = bits;
            unsignedExpGolombCodedInt7 = unsignedExpGolombCodedInt7;
            z6 = false;
        } else {
            if (unsignedExpGolombCodedInt7 == 1) {
                boolean bit4 = parsableNalUnitBitArray.readBit();
                parsableNalUnitBitArray.readSignedExpGolombCodedInt();
                parsableNalUnitBitArray.readSignedExpGolombCodedInt();
                long unsignedExpGolombCodedInt8 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                for (int i23 = 0; i23 < unsignedExpGolombCodedInt8; i23++) {
                    parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                }
                z6 = bit4;
            } else {
                z6 = false;
            }
            unsignedExpGolombCodedInt3 = 0;
        }
        int unsignedExpGolombCodedInt9 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        parsableNalUnitBitArray.skipBit();
        int unsignedExpGolombCodedInt10 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 1;
        int unsignedExpGolombCodedInt11 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 1;
        boolean bit5 = parsableNalUnitBitArray.readBit();
        int i24 = (2 - (bit5 ? 1 : 0)) * unsignedExpGolombCodedInt11;
        if (!bit5) {
            parsableNalUnitBitArray.skipBit();
        }
        parsableNalUnitBitArray.skipBit();
        int i25 = unsignedExpGolombCodedInt10 * 16;
        int i26 = i24 * 16;
        if (parsableNalUnitBitArray.readBit()) {
            int unsignedExpGolombCodedInt12 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            int unsignedExpGolombCodedInt13 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            int unsignedExpGolombCodedInt14 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            int unsignedExpGolombCodedInt15 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            if (unsignedExpGolombCodedInt == 0) {
                i20 = 2 - (bit5 ? 1 : 0);
                i19 = 1;
            } else {
                i19 = unsignedExpGolombCodedInt == 3 ? 1 : 2;
                i20 = (unsignedExpGolombCodedInt == 1 ? 2 : 1) * (2 - (bit5 ? 1 : 0));
            }
            i25 -= (unsignedExpGolombCodedInt12 + unsignedExpGolombCodedInt13) * i19;
            i26 -= (unsignedExpGolombCodedInt14 + unsignedExpGolombCodedInt15) * i20;
        }
        int i27 = i25;
        int i28 = bits;
        int unsignedExpGolombCodedInt16 = ((i28 == 44 || i28 == 86 || i28 == 100 || i28 == 110 || i28 == 122 || i28 == 244) && (bits2 & 16) != 0) ? 0 : i10;
        float f10 = 1.0f;
        if (parsableNalUnitBitArray.readBit()) {
            if (parsableNalUnitBitArray.readBit()) {
                int bits4 = parsableNalUnitBitArray.readBits(8);
                if (bits4 == 255) {
                    int i29 = i10;
                    int bits5 = parsableNalUnitBitArray.readBits(i29);
                    int bits6 = parsableNalUnitBitArray.readBits(i29);
                    if (bits5 != 0 && bits6 != 0) {
                        f10 = bits5 / bits6;
                    }
                } else {
                    float[] fArr = ASPECT_RATIO_IDC_VALUES;
                    if (bits4 < fArr.length) {
                        f10 = fArr[bits4];
                    } else {
                        Y6.f.p(bits4, "Unexpected aspect_ratio_idc value: ", TAG);
                    }
                }
            }
            if (parsableNalUnitBitArray.readBit()) {
                parsableNalUnitBitArray.skipBit();
            }
            if (parsableNalUnitBitArray.readBit()) {
                parsableNalUnitBitArray.skipBits(3);
                i17 = parsableNalUnitBitArray.readBit() ? 1 : 2;
                if (parsableNalUnitBitArray.readBit()) {
                    int bits7 = parsableNalUnitBitArray.readBits(8);
                    int bits8 = parsableNalUnitBitArray.readBits(8);
                    parsableNalUnitBitArray.skipBits(8);
                    int iIsoColorPrimariesToColorSpace = androidx.media3.common.ColorInfo.isoColorPrimariesToColorSpace(bits7);
                    int iIsoTransferCharacteristicsToColorTransfer = androidx.media3.common.ColorInfo.isoTransferCharacteristicsToColorTransfer(bits8);
                    i18 = iIsoColorPrimariesToColorSpace;
                    i16 = iIsoTransferCharacteristicsToColorTransfer;
                } else {
                    i16 = -1;
                }
                if (parsableNalUnitBitArray.readBit()) {
                    parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                    parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                }
                if (parsableNalUnitBitArray.readBit()) {
                    parsableNalUnitBitArray.skipBits(65);
                }
                bit2 = parsableNalUnitBitArray.readBit();
                if (bit2) {
                    skipHrdParameters(parsableNalUnitBitArray);
                }
                bit3 = parsableNalUnitBitArray.readBit();
                if (bit3) {
                    skipHrdParameters(parsableNalUnitBitArray);
                }
                if (bit2 || bit3) {
                    parsableNalUnitBitArray.skipBit();
                }
                parsableNalUnitBitArray.skipBit();
                if (parsableNalUnitBitArray.readBit()) {
                    parsableNalUnitBitArray.skipBit();
                    parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                    parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                    parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                    parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                    unsignedExpGolombCodedInt16 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                    parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                }
                i15 = i16;
                i14 = i17;
                i12 = unsignedExpGolombCodedInt16;
                f9 = f10;
                i13 = i18;
            } else {
                i16 = -1;
                i17 = -1;
            }
            i18 = -1;
            if (parsableNalUnitBitArray.readBit()) {
                parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            }
            if (parsableNalUnitBitArray.readBit()) {
                parsableNalUnitBitArray.skipBits(65);
            }
            bit2 = parsableNalUnitBitArray.readBit();
            if (bit2) {
                skipHrdParameters(parsableNalUnitBitArray);
            }
            bit3 = parsableNalUnitBitArray.readBit();
            if (bit3) {
                skipHrdParameters(parsableNalUnitBitArray);
            }
            if (bit2) {
                parsableNalUnitBitArray.skipBit();
            } else {
                parsableNalUnitBitArray.skipBit();
            }
            parsableNalUnitBitArray.skipBit();
            if (parsableNalUnitBitArray.readBit()) {
                parsableNalUnitBitArray.skipBit();
                parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                unsignedExpGolombCodedInt16 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            }
            i15 = i16;
            i14 = i17;
            i12 = unsignedExpGolombCodedInt16;
            f9 = f10;
            i13 = i18;
        } else {
            i12 = unsignedExpGolombCodedInt16;
            f9 = 1.0f;
            i13 = -1;
            i14 = -1;
            i15 = -1;
        }
        return new androidx.media3.container.NalUnitUtil.SpsData(i28, bits2, bits3, unsignedExpGolombCodedInt4, unsignedExpGolombCodedInt9, i27, i26, f9, unsignedExpGolombCodedInt2, i11, bit, bit5, unsignedExpGolombCodedInt6, unsignedExpGolombCodedInt7, unsignedExpGolombCodedInt3, z6, i13, i14, i15, i12);
    }

    private static void skipH265DpbSize(androidx.media3.container.ParsableNalUnitBitArray parsableNalUnitBitArray, int i3, int[] iArr, int[] iArr2, boolean[][] zArr) {
        for (int i9 = 1; i9 < i3; i9++) {
            boolean bit = parsableNalUnitBitArray.readBit();
            int i10 = 0;
            while (i10 < iArr[i9]) {
                if ((i10 <= 0 || !bit) ? i10 == 0 : parsableNalUnitBitArray.readBit()) {
                    for (int i11 = 0; i11 < iArr2[i9]; i11++) {
                        if (zArr[i9][i11]) {
                            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                        }
                    }
                    parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                    parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                }
                i10++;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [int] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    private static void skipH265HrdParameters(androidx.media3.container.ParsableNalUnitBitArray parsableNalUnitBitArray, boolean z6, int i3) {
        ?? r9;
        ?? r10;
        boolean bit;
        boolean bit2;
        if (z6) {
            boolean bit3 = parsableNalUnitBitArray.readBit();
            boolean bit4 = parsableNalUnitBitArray.readBit();
            if (bit3 || bit4) {
                bit = parsableNalUnitBitArray.readBit();
                if (bit) {
                    parsableNalUnitBitArray.skipBits(19);
                }
                parsableNalUnitBitArray.skipBits(8);
                if (bit) {
                    parsableNalUnitBitArray.skipBits(4);
                }
                parsableNalUnitBitArray.skipBits(15);
                r10 = bit4;
                r9 = bit3;
            } else {
                bit = false;
                r10 = bit4;
                r9 = bit3;
            }
        } else {
            r9 = 0;
            r10 = 0;
            bit = false;
        }
        for (int i9 = 0; i9 <= i3; i9++) {
            boolean bit5 = parsableNalUnitBitArray.readBit();
            if (!bit5) {
                bit5 = parsableNalUnitBitArray.readBit();
            }
            if (bit5) {
                parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                bit2 = false;
            } else {
                bit2 = parsableNalUnitBitArray.readBit();
            }
            int unsignedExpGolombCodedInt = !bit2 ? parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() : 0;
            int i10 = r9 + r10;
            for (int i11 = 0; i11 < i10; i11++) {
                for (int i12 = 0; i12 <= unsignedExpGolombCodedInt; i12++) {
                    parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                    parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                    if (bit) {
                        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                    }
                    parsableNalUnitBitArray.skipBit();
                }
            }
        }
    }

    private static void skipH265ScalingList(androidx.media3.container.ParsableNalUnitBitArray parsableNalUnitBitArray) {
        for (int i3 = 0; i3 < 4; i3++) {
            int i9 = 0;
            while (i9 < 6) {
                int i10 = 1;
                if (parsableNalUnitBitArray.readBit()) {
                    int iMin = java.lang.Math.min(64, 1 << ((i3 << 1) + 4));
                    if (i3 > 1) {
                        parsableNalUnitBitArray.readSignedExpGolombCodedInt();
                    }
                    for (int i11 = 0; i11 < iMin; i11++) {
                        parsableNalUnitBitArray.readSignedExpGolombCodedInt();
                    }
                } else {
                    parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                }
                if (i3 == 3) {
                    i10 = 3;
                }
                i9 += i10;
            }
        }
    }

    private static void skipH265ShortTermReferencePictureSets(androidx.media3.container.ParsableNalUnitBitArray parsableNalUnitBitArray) {
        int unsignedExpGolombCodedInt = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        int[] iArr = new int[0];
        int[] iArrCopyOf = new int[0];
        int i3 = -1;
        int i9 = -1;
        for (int i10 = 0; i10 < unsignedExpGolombCodedInt; i10++) {
            if (i10 == 0 || !parsableNalUnitBitArray.readBit()) {
                int unsignedExpGolombCodedInt2 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                int unsignedExpGolombCodedInt3 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                int[] iArr2 = new int[unsignedExpGolombCodedInt2];
                int i11 = 0;
                while (i11 < unsignedExpGolombCodedInt2) {
                    iArr2[i11] = (i11 > 0 ? iArr2[i11 - 1] : 0) - (parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 1);
                    parsableNalUnitBitArray.skipBit();
                    i11++;
                }
                int[] iArr3 = new int[unsignedExpGolombCodedInt3];
                int i12 = 0;
                while (i12 < unsignedExpGolombCodedInt3) {
                    iArr3[i12] = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 1 + (i12 > 0 ? iArr3[i12 - 1] : 0);
                    parsableNalUnitBitArray.skipBit();
                    i12++;
                }
                i3 = unsignedExpGolombCodedInt2;
                iArr = iArr2;
                i9 = unsignedExpGolombCodedInt3;
                iArrCopyOf = iArr3;
            } else {
                int i13 = i3 + i9;
                int unsignedExpGolombCodedInt4 = (1 - ((parsableNalUnitBitArray.readBit() ? 1 : 0) * 2)) * (parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 1);
                int i14 = i13 + 1;
                boolean[] zArr = new boolean[i14];
                for (int i15 = 0; i15 <= i13; i15++) {
                    if (parsableNalUnitBitArray.readBit()) {
                        zArr[i15] = true;
                    } else {
                        zArr[i15] = parsableNalUnitBitArray.readBit();
                    }
                }
                int[] iArr4 = new int[i14];
                int[] iArr5 = new int[i14];
                int i16 = 0;
                for (int i17 = i9 - 1; i17 >= 0; i17--) {
                    int i18 = iArrCopyOf[i17] + unsignedExpGolombCodedInt4;
                    if (i18 < 0 && zArr[i3 + i17]) {
                        iArr4[i16] = i18;
                        i16++;
                    }
                }
                if (unsignedExpGolombCodedInt4 < 0 && zArr[i13]) {
                    iArr4[i16] = unsignedExpGolombCodedInt4;
                    i16++;
                }
                for (int i19 = 0; i19 < i3; i19++) {
                    int i20 = iArr[i19] + unsignedExpGolombCodedInt4;
                    if (i20 < 0 && zArr[i19]) {
                        iArr4[i16] = i20;
                        i16++;
                    }
                }
                int[] iArrCopyOf2 = java.util.Arrays.copyOf(iArr4, i16);
                int i21 = 0;
                for (int i22 = i3 - 1; i22 >= 0; i22--) {
                    int i23 = iArr[i22] + unsignedExpGolombCodedInt4;
                    if (i23 > 0 && zArr[i22]) {
                        iArr5[i21] = i23;
                        i21++;
                    }
                }
                if (unsignedExpGolombCodedInt4 > 0 && zArr[i13]) {
                    iArr5[i21] = unsignedExpGolombCodedInt4;
                    i21++;
                }
                for (int i24 = 0; i24 < i9; i24++) {
                    int i25 = iArrCopyOf[i24] + unsignedExpGolombCodedInt4;
                    if (i25 > 0 && zArr[i3 + i24]) {
                        iArr5[i21] = i25;
                        i21++;
                    }
                }
                iArrCopyOf = java.util.Arrays.copyOf(iArr5, i21);
                iArr = iArrCopyOf2;
                i3 = i16;
                i9 = i21;
            }
        }
    }

    private static void skipHrdParameters(androidx.media3.container.ParsableNalUnitBitArray parsableNalUnitBitArray) {
        int unsignedExpGolombCodedInt = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 1;
        parsableNalUnitBitArray.skipBits(8);
        for (int i3 = 0; i3 < unsignedExpGolombCodedInt; i3++) {
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            parsableNalUnitBitArray.skipBit();
        }
        parsableNalUnitBitArray.skipBits(20);
    }

    private static void skipScalingList(androidx.media3.container.ParsableNalUnitBitArray parsableNalUnitBitArray, int i3) {
        int signedExpGolombCodedInt = 8;
        int i9 = 8;
        for (int i10 = 0; i10 < i3; i10++) {
            if (signedExpGolombCodedInt != 0) {
                signedExpGolombCodedInt = ((parsableNalUnitBitArray.readSignedExpGolombCodedInt() + i9) + 256) % 256;
            }
            if (signedExpGolombCodedInt != 0) {
                i9 = signedExpGolombCodedInt;
            }
        }
    }

    private static void skipToH265VuiPresentFlagAfterDpbSize(androidx.media3.container.ParsableNalUnitBitArray parsableNalUnitBitArray, int i3, boolean[][] zArr) {
        int unsignedExpGolombCodedInt = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 2;
        if (parsableNalUnitBitArray.readBit()) {
            parsableNalUnitBitArray.skipBits(unsignedExpGolombCodedInt);
        } else {
            for (int i9 = 1; i9 < i3; i9++) {
                for (int i10 = 0; i10 < i9; i10++) {
                    if (zArr[i9][i10]) {
                        parsableNalUnitBitArray.skipBits(unsignedExpGolombCodedInt);
                    }
                }
            }
        }
        int unsignedExpGolombCodedInt2 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        for (int i11 = 1; i11 <= unsignedExpGolombCodedInt2; i11++) {
            parsableNalUnitBitArray.skipBits(8);
        }
    }

    public static int unescapeStream(byte[] bArr, int i3) {
        int i9;
        synchronized (scratchEscapePositionsLock) {
            int iFindNextUnescapeIndex = 0;
            int i10 = 0;
            while (iFindNextUnescapeIndex < i3) {
                try {
                    iFindNextUnescapeIndex = findNextUnescapeIndex(bArr, iFindNextUnescapeIndex, i3);
                    if (iFindNextUnescapeIndex < i3) {
                        int[] iArr = scratchEscapePositions;
                        if (iArr.length <= i10) {
                            scratchEscapePositions = java.util.Arrays.copyOf(iArr, iArr.length * 2);
                        }
                        scratchEscapePositions[i10] = iFindNextUnescapeIndex;
                        iFindNextUnescapeIndex += 3;
                        i10++;
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
            i9 = i3 - i10;
            int i11 = 0;
            int i12 = 0;
            for (int i13 = 0; i13 < i10; i13++) {
                int i14 = scratchEscapePositions[i13] - i12;
                java.lang.System.arraycopy(bArr, i12, bArr, i11, i14);
                int i15 = i11 + i14;
                int i16 = i15 + 1;
                bArr[i15] = 0;
                i11 = i15 + 2;
                bArr[i16] = 0;
                i12 += i14 + 3;
            }
            java.lang.System.arraycopy(bArr, i12, bArr, i11, i9 - i11);
        }
        return i9;
    }

    @java.lang.Deprecated
    public static boolean isNalUnitSei(androidx.media3.common.Format format, byte b9) {
        return isNalUnitSei(format, new byte[]{b9}, 0);
    }

    public static boolean isNalUnitSei(androidx.media3.common.Format format, byte[] bArr, int i3) {
        java.lang.String nalStructureMimeType = getNalStructureMimeType(format);
        if (nalStructureMimeType == null) {
            return false;
        }
        switch (nalStructureMimeType) {
            case "video/hevc":
                return ((bArr[i3] & 126) >> 1) == 39;
            case "video/avc":
                return (bArr[i3] & 31) == 6;
            case "video/vvc":
                return ((bArr[i3 + 1] & 248) >> 3) == 23;
            default:
                return false;
        }
    }
}
