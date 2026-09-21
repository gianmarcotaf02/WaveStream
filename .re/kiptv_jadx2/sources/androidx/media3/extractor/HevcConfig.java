package androidx.media3.extractor;

import androidx.media3.common.ParserException;
import androidx.media3.common.util.CodecSpecificDataUtil;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.container.NalUnitUtil;
import java.util.Collections;
import java.util.List;

public final class HevcConfig {
    public final int bitdepthChroma;
    public final int bitdepthLuma;
    public final String codecs;
    public final int colorRange;
    public final int colorSpace;
    public final int colorTransfer;
    public final int decodedHeight;
    public final int decodedWidth;
    public final int height;
    public final List<byte[]> initializationData;
    public final int maxNumReorderPics;
    public final int maxSubLayers;
    public final int nalUnitLengthFieldLength;
    public final float pixelWidthHeightRatio;
    public final int stereoMode;
    public final NalUnitUtil.H265VpsData vpsData;
    public final int width;

    private HevcConfig(List<byte[]> list, int i3, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, float f9, int i20, String str, NalUnitUtil.H265VpsData h265VpsData) {
        this.initializationData = list;
        this.nalUnitLengthFieldLength = i3;
        this.maxSubLayers = i9;
        this.width = i10;
        this.height = i11;
        this.decodedWidth = i12;
        this.decodedHeight = i13;
        this.bitdepthLuma = i14;
        this.bitdepthChroma = i15;
        this.colorSpace = i16;
        this.colorRange = i17;
        this.colorTransfer = i18;
        this.stereoMode = i19;
        this.pixelWidthHeightRatio = f9;
        this.maxNumReorderPics = i20;
        this.codecs = str;
        this.vpsData = h265VpsData;
    }

    public static HevcConfig parse(ParsableByteArray parsableByteArray) {
        return parseImpl(parsableByteArray, false, null);
    }

    private static HevcConfig parseImpl(ParsableByteArray parsableByteArray, boolean z6, NalUnitUtil.H265VpsData h265VpsData) throws ParserException {
        boolean z9;
        int i3;
        NalUnitUtil.H265Sei3dRefDisplayInfoData h265Sei3dRefDisplayInfo;
        try {
            if (z6) {
                parsableByteArray.skipBytes(4);
            } else {
                parsableByteArray.skipBytes(21);
            }
            int unsignedByte = parsableByteArray.readUnsignedByte() & 3;
            int unsignedByte2 = parsableByteArray.readUnsignedByte();
            int position = parsableByteArray.getPosition();
            int i9 = 0;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                z9 = true;
                if (i10 >= unsignedByte2) {
                    break;
                }
                parsableByteArray.skipBytes(1);
                int unsignedShort = parsableByteArray.readUnsignedShort();
                for (int i12 = 0; i12 < unsignedShort; i12++) {
                    int unsignedShort2 = parsableByteArray.readUnsignedShort();
                    i11 += unsignedShort2 + 4;
                    parsableByteArray.skipBytes(unsignedShort2);
                }
                i10++;
            }
            parsableByteArray.setPosition(position);
            byte[] bArr = new byte[i11];
            NalUnitUtil.H265VpsData h265VpsData2 = h265VpsData;
            int i13 = -1;
            int i14 = -1;
            int i15 = -1;
            int i16 = -1;
            int i17 = -1;
            int i18 = -1;
            int i19 = -1;
            int i20 = -1;
            int i21 = -1;
            int i22 = -1;
            int i23 = -1;
            int i24 = -1;
            float f9 = 1.0f;
            String strBuildHevcCodecString = null;
            int i25 = 0;
            int i26 = 0;
            while (i25 < unsignedByte2) {
                int unsignedByte3 = parsableByteArray.readUnsignedByte() & 63;
                int unsignedShort3 = parsableByteArray.readUnsignedShort();
                int i27 = i9;
                NalUnitUtil.H265VpsData h265VpsNalUnit = h265VpsData2;
                while (i27 < unsignedShort3) {
                    int unsignedShort4 = parsableByteArray.readUnsignedShort();
                    boolean z10 = z9;
                    byte[] bArr2 = NalUnitUtil.NAL_START_CODE;
                    int i28 = unsignedByte;
                    System.arraycopy(bArr2, i9, bArr, i26, bArr2.length);
                    int length = i26 + bArr2.length;
                    System.arraycopy(parsableByteArray.getData(), parsableByteArray.getPosition(), bArr, length, unsignedShort4);
                    if (unsignedByte3 == 32 && i27 == 0) {
                        h265VpsNalUnit = NalUnitUtil.parseH265VpsNalUnit(bArr, length, length + unsignedShort4);
                        i3 = unsignedByte2;
                    } else {
                        if (unsignedByte3 == 33 && i27 == 0) {
                            NalUnitUtil.H265SpsData h265SpsNalUnit = NalUnitUtil.parseH265SpsNalUnit(bArr, length, length + unsignedShort4, h265VpsNalUnit);
                            i13 = h265SpsNalUnit.maxSubLayersMinus1 + 1;
                            i14 = h265SpsNalUnit.width;
                            int i29 = h265SpsNalUnit.height;
                            int i30 = h265SpsNalUnit.decodedWidth;
                            i3 = unsignedByte2;
                            int i31 = h265SpsNalUnit.decodedHeight;
                            i18 = h265SpsNalUnit.bitDepthLumaMinus8 + 8;
                            i19 = h265SpsNalUnit.bitDepthChromaMinus8 + 8;
                            int i32 = h265SpsNalUnit.colorSpace;
                            int i33 = h265SpsNalUnit.colorRange;
                            int i34 = h265SpsNalUnit.colorTransfer;
                            float f10 = h265SpsNalUnit.pixelWidthHeightRatio;
                            int i35 = h265SpsNalUnit.maxNumReorderPics;
                            NalUnitUtil.H265ProfileTierLevel h265ProfileTierLevel = h265SpsNalUnit.profileTierLevel;
                            if (h265ProfileTierLevel != null) {
                                strBuildHevcCodecString = CodecSpecificDataUtil.buildHevcCodecString(h265ProfileTierLevel.generalProfileSpace, h265ProfileTierLevel.generalTierFlag, h265ProfileTierLevel.generalProfileIdc, h265ProfileTierLevel.generalProfileCompatibilityFlags, h265ProfileTierLevel.constraintBytes, h265ProfileTierLevel.generalLevelIdc);
                            }
                            f9 = f10;
                            i24 = i35;
                            i21 = i33;
                            i22 = i34;
                            i17 = i31;
                            i20 = i32;
                            i16 = i30;
                            i15 = i29;
                        } else {
                            i3 = unsignedByte2;
                            if (unsignedByte3 == 39 && i27 == 0 && (h265Sei3dRefDisplayInfo = NalUnitUtil.parseH265Sei3dRefDisplayInfo(bArr, length, length + unsignedShort4)) != null && h265VpsNalUnit != null) {
                                i9 = 0;
                                i23 = h265Sei3dRefDisplayInfo.leftViewId == ((NalUnitUtil.H265LayerInfo) h265VpsNalUnit.layerInfos.get(0)).viewId ? 4 : 5;
                            }
                        }
                        i9 = 0;
                    }
                    i26 = length + unsignedShort4;
                    parsableByteArray.skipBytes(unsignedShort4);
                    i27++;
                    z9 = z10;
                    unsignedByte = i28;
                    unsignedByte2 = i3;
                }
                i25++;
                h265VpsData2 = h265VpsNalUnit;
            }
            return new HevcConfig(i11 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr), unsignedByte + 1, i13, i14, i15, i16, i17, i18, i19, i20, i21, i22, i23, f9, i24, strBuildHevcCodecString, h265VpsData2);
        } catch (ArrayIndexOutOfBoundsException e6) {
            throw ParserException.createForMalformedContainer("Error parsing".concat(z6 ? "L-HEVC config" : "HEVC config"), e6);
        }
    }

    public static HevcConfig parseLayered(ParsableByteArray parsableByteArray, NalUnitUtil.H265VpsData h265VpsData) {
        return parseImpl(parsableByteArray, true, h265VpsData);
    }
}
