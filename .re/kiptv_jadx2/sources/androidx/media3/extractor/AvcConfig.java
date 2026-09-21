package androidx.media3.extractor;

import androidx.media3.common.ParserException;
import androidx.media3.common.util.CodecSpecificDataUtil;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.container.NalUnitUtil;
import java.util.ArrayList;
import java.util.List;

public final class AvcConfig {
    public final int bitdepthChroma;
    public final int bitdepthLuma;
    public final String codecs;
    public final int colorRange;
    public final int colorSpace;
    public final int colorTransfer;
    public final int height;
    public final List<byte[]> initializationData;
    public final int maxNumReorderFrames;
    public final int nalUnitLengthFieldLength;
    public final float pixelWidthHeightRatio;
    public final int width;

    private AvcConfig(List<byte[]> list, int i3, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, float f9, String str) {
        this.initializationData = list;
        this.nalUnitLengthFieldLength = i3;
        this.width = i9;
        this.height = i10;
        this.bitdepthLuma = i11;
        this.bitdepthChroma = i12;
        this.colorSpace = i13;
        this.colorRange = i14;
        this.colorTransfer = i15;
        this.maxNumReorderFrames = i16;
        this.pixelWidthHeightRatio = f9;
        this.codecs = str;
    }

    private static byte[] buildNalUnitForChild(ParsableByteArray parsableByteArray) {
        int unsignedShort = parsableByteArray.readUnsignedShort();
        int position = parsableByteArray.getPosition();
        parsableByteArray.skipBytes(unsignedShort);
        return CodecSpecificDataUtil.buildNalUnit(parsableByteArray.getData(), position, unsignedShort);
    }

    public static AvcConfig parse(ParsableByteArray parsableByteArray) {
        String strBuildAvcCodecString;
        int i3;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        float f9;
        int i14;
        int i15;
        try {
            parsableByteArray.skipBytes(4);
            int unsignedByte = (parsableByteArray.readUnsignedByte() & 3) + 1;
            if (unsignedByte == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int unsignedByte2 = parsableByteArray.readUnsignedByte() & 31;
            for (int i16 = 0; i16 < unsignedByte2; i16++) {
                arrayList.add(buildNalUnitForChild(parsableByteArray));
            }
            int unsignedByte3 = parsableByteArray.readUnsignedByte();
            for (int i17 = 0; i17 < unsignedByte3; i17++) {
                arrayList.add(buildNalUnitForChild(parsableByteArray));
            }
            if (unsignedByte2 > 0) {
                NalUnitUtil.SpsData spsNalUnit = NalUnitUtil.parseSpsNalUnit((byte[]) arrayList.get(0), NalUnitUtil.NAL_START_CODE.length, ((byte[]) arrayList.get(0)).length);
                int i18 = spsNalUnit.width;
                int i19 = spsNalUnit.height;
                int i20 = spsNalUnit.bitDepthLumaMinus8 + 8;
                int i21 = spsNalUnit.bitDepthChromaMinus8 + 8;
                int i22 = spsNalUnit.colorSpace;
                int i23 = spsNalUnit.colorRange;
                int i24 = spsNalUnit.colorTransfer;
                int i25 = spsNalUnit.maxNumReorderFrames;
                float f10 = spsNalUnit.pixelWidthHeightRatio;
                strBuildAvcCodecString = CodecSpecificDataUtil.buildAvcCodecString(spsNalUnit.profileIdc, spsNalUnit.constraintsFlagsAndReservedZero2Bits, spsNalUnit.levelIdc);
                i12 = i24;
                i13 = i25;
                f9 = f10;
                i11 = i21;
                i14 = i22;
                i15 = i23;
                i3 = i18;
                i9 = i19;
                i10 = i20;
            } else {
                strBuildAvcCodecString = null;
                i3 = -1;
                i9 = -1;
                i10 = -1;
                i11 = -1;
                i12 = -1;
                i13 = 16;
                f9 = 1.0f;
                i14 = -1;
                i15 = -1;
            }
            return new AvcConfig(arrayList, unsignedByte, i3, i9, i10, i11, i14, i15, i12, i13, f9, strBuildAvcCodecString);
        } catch (ArrayIndexOutOfBoundsException e6) {
            throw ParserException.createForMalformedContainer("Error parsing AVC config", e6);
        }
    }
}
