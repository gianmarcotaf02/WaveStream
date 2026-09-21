package androidx.media3.common.util;

import android.util.Pair;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.extractor.AacUtil;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import androidx.media3.extractor.ts.TsExtractor;
import com.google.android.gms.internal.play_billing.AbstractC1864o0;
import com.google.android.gms.internal.play_billing.M0;
import dev.jdtech.mpv.MPVLib;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.videolan.libvlc.interfaces.IMediaList;
import p076i4.AbstractC2186b0;
import p121o0.p;

public final class CodecSpecificDataUtil {
    private static final String CODEC_ID_AC4 = "ac-4";
    private static final String CODEC_ID_APV1 = "apv1";
    private static final String CODEC_ID_AV01 = "av01";
    private static final String CODEC_ID_AVC1 = "avc1";
    private static final String CODEC_ID_AVC2 = "avc2";
    private static final String CODEC_ID_H263 = "s263";
    private static final String CODEC_ID_HEV1 = "hev1";
    private static final String CODEC_ID_HVC1 = "hvc1";
    private static final String CODEC_ID_IAMF = "iamf";
    private static final String CODEC_ID_MP4A = "mp4a";
    private static final String CODEC_ID_VP09 = "vp09";
    private static final String CODEC_ID_VVC1 = "vvc1";
    private static final String CODEC_ID_VVI1 = "vvi1";
    private static final int EXTENDED_PAR = 15;
    private static final int OBU_IA_CODEC_CONFIG = 0;
    private static final int OBU_IA_SEQUENCE_HEADER = 31;
    private static final int RECTANGULAR = 0;
    private static final String TAG = "CodecSpecificDataUtil";
    private static final int VISUAL_OBJECT_LAYER = 1;
    private static final int VISUAL_OBJECT_LAYER_START = 32;
    private static final int VVC_HIGH_TIER_LEVEL_4_0 = 64;
    private static final int VVC_HIGH_TIER_LEVEL_4_1 = 256;
    private static final int VVC_HIGH_TIER_LEVEL_5_0 = 1024;
    private static final int VVC_HIGH_TIER_LEVEL_5_1 = 4096;
    private static final int VVC_HIGH_TIER_LEVEL_5_2 = 16384;
    private static final int VVC_HIGH_TIER_LEVEL_6_0 = 65536;
    private static final int VVC_HIGH_TIER_LEVEL_6_1 = 262144;
    private static final int VVC_HIGH_TIER_LEVEL_6_2 = 1048576;
    private static final int VVC_HIGH_TIER_LEVEL_6_3 = 4194304;
    private static final int VVC_MAIN_TIER_LEVEL_1_0 = 1;
    private static final int VVC_MAIN_TIER_LEVEL_2_0 = 2;
    private static final int VVC_MAIN_TIER_LEVEL_2_1 = 4;
    private static final int VVC_MAIN_TIER_LEVEL_3_0 = 8;
    private static final int VVC_MAIN_TIER_LEVEL_3_1 = 16;
    private static final int VVC_MAIN_TIER_LEVEL_4_0 = 32;
    private static final int VVC_MAIN_TIER_LEVEL_4_1 = 128;
    private static final int VVC_MAIN_TIER_LEVEL_5_0 = 512;
    private static final int VVC_MAIN_TIER_LEVEL_5_1 = 2048;
    private static final int VVC_MAIN_TIER_LEVEL_5_2 = 8192;
    private static final int VVC_MAIN_TIER_LEVEL_6_0 = 32768;
    private static final int VVC_MAIN_TIER_LEVEL_6_1 = 131072;
    private static final int VVC_MAIN_TIER_LEVEL_6_2 = 524288;
    private static final int VVC_MAIN_TIER_LEVEL_6_3 = 2097152;
    private static final int VVC_PROFILE_MAIN_10 = 2;
    private static final int VVC_PROFILE_MAIN_10_HDR10 = 4096;
    private static final int VVC_PROFILE_MAIN_10_STILL = 4;
    private static final int VVC_PROFILE_MAIN_8 = 1;
    private static final byte[] NAL_START_CODE = {0, 0, 0, 1};
    private static final String[] HEVC_GENERAL_PROFILE_SPACE_STRINGS = {"", "A", "B", "C"};
    private static final Pattern PROFILE_PATTERN = Pattern.compile("^\\D?(\\d+)$");

    private CodecSpecificDataUtil() {
    }

    private static int ac4BitstreamAndPresentationVersionsToProfileConst(int i3, int i9) {
        if (i3 == 0) {
            if (i9 == 0) {
                return TsExtractor.TS_STREAM_TYPE_AIT;
            }
            return -1;
        }
        if (i3 == 1) {
            if (i9 == 0) {
                return 513;
            }
            if (i9 == 1) {
                return IMediaList.Event.ItemDeleted;
            }
            return -1;
        }
        if (i3 != 2) {
            return -1;
        }
        if (i9 == 1) {
            return AnalyticsListener.EVENT_DRM_KEYS_REMOVED;
        }
        if (i9 == 2) {
            return AnalyticsListener.EVENT_PLAYER_RELEASED;
        }
        return -1;
    }

    private static int ac4LevelNumberToConst(int i3) {
        if (i3 == 0) {
            return 1;
        }
        if (i3 == 1) {
            return 2;
        }
        if (i3 == 2) {
            return 4;
        }
        if (i3 != 3) {
            return i3 != 4 ? -1 : 16;
        }
        return 8;
    }

    private static int av1LevelNumberToConst(int i3) {
        switch (i3) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return 128;
            case 8:
                return 256;
            case 9:
                return 512;
            case 10:
                return 1024;
            case 11:
                return 2048;
            case 12:
                return 4096;
            case 13:
                return 8192;
            case 14:
                return 16384;
            case 15:
                return 32768;
            case 16:
                return 65536;
            case 17:
                return 131072;
            case 18:
                return 262144;
            case 19:
                return VVC_MAIN_TIER_LEVEL_6_2;
            case 20:
                return 1048576;
            case 21:
                return VVC_MAIN_TIER_LEVEL_6_3;
            case 22:
                return VVC_HIGH_TIER_LEVEL_6_3;
            case 23:
                return 8388608;
            default:
                return -1;
        }
    }

    private static int avcLevelNumberToConst(int i3) {
        switch (i3) {
            case 10:
                return 1;
            case 11:
                return 4;
            case 12:
                return 8;
            case 13:
                return 16;
            default:
                switch (i3) {
                    case 20:
                        return 32;
                    case 21:
                        return 64;
                    case 22:
                        return 128;
                    default:
                        switch (i3) {
                            case 30:
                                return 256;
                            case 31:
                                return 512;
                            case 32:
                                return 1024;
                            default:
                                switch (i3) {
                                    case 40:
                                        return 2048;
                                    case 41:
                                        return 4096;
                                    case AacUtil.AUDIO_OBJECT_TYPE_AAC_XHE:
                                        return 8192;
                                    default:
                                        switch (i3) {
                                            case 50:
                                                return 16384;
                                            case 51:
                                                return 32768;
                                            case 52:
                                                return 65536;
                                            default:
                                                return -1;
                                        }
                                }
                        }
                }
        }
    }

    private static int avcProfileNumberToConst(int i3) {
        if (i3 == 66) {
            return 1;
        }
        if (i3 == 77) {
            return 2;
        }
        if (i3 == 88) {
            return 4;
        }
        if (i3 == 100) {
            return 8;
        }
        if (i3 == 110) {
            return 16;
        }
        if (i3 != 122) {
            return i3 != 244 ? -1 : 64;
        }
        return 32;
    }

    public static String buildApvCodecString(byte[] bArr) {
        AbstractC1864o0.J(bArr.length, "Invalid APV CSD length: %s", bArr.length >= 17);
        byte b9 = bArr[0];
        AbstractC1864o0.J(b9, "Invalid APV CSD version: %s", b9 == 1);
        return Util.formatInvariant("apv1.apvf%d.apvl%d.apvb%d", Integer.valueOf(bArr[5] & 255), Integer.valueOf(bArr[6] & 255), Integer.valueOf(bArr[7] & 255));
    }

    public static String buildAvcCodecString(int i3, int i9, int i10) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i3), Integer.valueOf(i9), Integer.valueOf(i10));
    }

    public static List<byte[]> buildCea708InitializationData(boolean z6) {
        return Collections.singletonList(z6 ? new byte[]{1} : new byte[]{0});
    }

    public static String buildDolbyVisionCodecString(int i3, int i9) {
        if (i3 > 9) {
            return Util.formatInvariant("dvh1.%02d.%02d", Integer.valueOf(i3), Integer.valueOf(i9));
        }
        return i3 > 8 ? Util.formatInvariant("dvav.%02d.%02d", Integer.valueOf(i3), Integer.valueOf(i9)) : Util.formatInvariant("dvhe.%02d.%02d", Integer.valueOf(i3), Integer.valueOf(i9));
    }

    public static byte[] buildDolbyVisionInitializationData(int i3, int i9) {
        int i10;
        int i11;
        byte[] bArr = new byte[24];
        if (i3 == 8) {
            i10 = 4;
            i11 = 0;
        } else if (i3 == 9) {
            i10 = 2;
            i11 = 1;
        } else {
            i10 = 0;
            i11 = 0;
        }
        bArr[0] = 1;
        bArr[1] = 0;
        byte b9 = (byte) ((i3 & 127) << 1);
        bArr[2] = b9;
        bArr[2] = (byte) ((b9 | ((i9 >> 5) & 1)) & 255);
        byte b10 = (byte) ((i9 & 31) << 3);
        bArr[3] = b10;
        byte b11 = (byte) (b10 | 4);
        bArr[3] = b11;
        byte b12 = b11;
        bArr[3] = b12;
        bArr[3] = (byte) (b12 | 1);
        byte b13 = (byte) (i10 << 4);
        bArr[4] = b13;
        bArr[4] = (byte) (b13 | (i11 << 2));
        return bArr;
    }

    public static String buildH263CodecString(int i3, int i9) {
        return Util.formatInvariant("s263.%d.%d", Integer.valueOf(i3), Integer.valueOf(i9));
    }

    public static String buildHevcCodecString(int i3, boolean z6, int i9, int i10, int[] iArr, int i11) {
        StringBuilder sb = new StringBuilder(Util.formatInvariant("hvc1.%s%d.%X.%c%d", HEVC_GENERAL_PROFILE_SPACE_STRINGS[i3], Integer.valueOf(i9), Integer.valueOf(i10), Character.valueOf(z6 ? 'H' : 'L'), Integer.valueOf(i11)));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i12 = 0; i12 < length; i12++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i12])));
        }
        return sb.toString();
    }

    public static String buildIamfCodecString(byte[] bArr) {
        ParsableByteArray parsableByteArray = new ParsableByteArray(bArr);
        String invariant = null;
        String string = null;
        while (parsableByteArray.bytesLeft() > 0 && (invariant == null || string == null)) {
            int unsignedByte = parsableByteArray.readUnsignedByte();
            int i3 = unsignedByte >> 3;
            boolean z6 = (unsignedByte & 2) != 0;
            boolean z9 = (unsignedByte & 1) != 0;
            int unsignedLeb128ToInt = parsableByteArray.readUnsignedLeb128ToInt();
            if (i3 > 4 && i3 < 24 && z6) {
                parsableByteArray.skipLeb128();
                parsableByteArray.skipLeb128();
            }
            if (z9) {
                parsableByteArray.skipBytes(parsableByteArray.readUnsignedLeb128ToInt());
            }
            int position = parsableByteArray.getPosition() + unsignedLeb128ToInt;
            if (i3 == 31) {
                parsableByteArray.skipBytes(4);
                invariant = Util.formatInvariant("iamf.%03X.%03X", Integer.valueOf(parsableByteArray.readUnsignedByte()), Integer.valueOf(parsableByteArray.readUnsignedByte()));
            } else if (i3 == 0) {
                parsableByteArray.skipLeb128();
                string = parsableByteArray.readString(4);
                if (string.equals(CODEC_ID_MP4A)) {
                    parsableByteArray.skipLeb128();
                    parsableByteArray.skipBytes(2);
                    ParsableBitArray parsableBitArray = new ParsableBitArray();
                    parsableBitArray.reset(parsableByteArray);
                    int bits = parsableBitArray.readBits(5);
                    if (bits == 31) {
                        bits = parsableBitArray.readBits(6) + 32;
                    }
                    string = string + ".40." + bits;
                }
            }
            parsableByteArray.setPosition(position);
        }
        if (invariant == null || string == null) {
            return null;
        }
        return p.p(invariant, ".", string);
    }

    public static byte[] buildNalUnit(byte[] bArr, int i3, int i9) {
        byte[] bArr2 = NAL_START_CODE;
        byte[] bArr3 = new byte[bArr2.length + i9];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i3, bArr3, bArr2.length, i9);
        return bArr3;
    }

    public static AbstractC2186b0 buildVp9CodecPrivateInitializationData(byte b9, byte b10, byte b11, byte b12) {
        return AbstractC2186b0.y(new byte[]{1, 1, b9, 2, 1, b10, 3, 1, b11, 4, 1, b12});
    }

    public static int dolbyVisionConstantToLevelNumber(int i3) {
        int i9 = 1;
        if (i3 != 1) {
            i9 = 2;
            if (i3 != 2) {
                switch (i3) {
                    case 4:
                        return 3;
                    case 8:
                        return 4;
                    case 16:
                        return 5;
                    case 32:
                        return 6;
                    case 64:
                        return 7;
                    case 128:
                        return 8;
                    case 256:
                        return 9;
                    case 512:
                        return 10;
                    case 1024:
                        return 11;
                    case 2048:
                        return 12;
                    case 4096:
                        return 13;
                    default:
                        throw new IllegalArgumentException(M0.l(i3, "Unknown Dolby Vision level: "));
                }
            }
        }
        return i9;
    }

    public static int dolbyVisionConstantToProfileNumber(int i3) {
        if (i3 == 1) {
            return 0;
        }
        if (i3 == 2) {
            return 1;
        }
        if (i3 == 4) {
            return 2;
        }
        if (i3 == 8) {
            return 3;
        }
        if (i3 == 16) {
            return 4;
        }
        if (i3 == 32) {
            return 5;
        }
        if (i3 == 64) {
            return 6;
        }
        if (i3 == 128) {
            return 7;
        }
        if (i3 == 256) {
            return 8;
        }
        if (i3 == 512) {
            return 9;
        }
        if (i3 == 1024) {
            return 10;
        }
        throw new IllegalArgumentException(M0.l(i3, "Unknown Dolby Vision profile: "));
    }

    private static Integer dolbyVisionStringToLevel(String str) {
        if (str == null) {
            return null;
        }
        switch (str) {
            case "01":
                return 1;
            case "02":
                return 2;
            case "03":
                return 4;
            case "04":
                return 8;
            case "05":
                return 16;
            case "06":
                return 32;
            case "07":
                return 64;
            case "08":
                return 128;
            case "09":
                return 256;
            case "10":
                return 512;
            case "11":
                return 1024;
            case "12":
                return 2048;
            case "13":
                return 4096;
            default:
                return null;
        }
    }

    private static Integer dolbyVisionStringToProfile(String str) {
        if (str == null) {
            return null;
        }
        switch (str) {
            case "00":
                return 1;
            case "01":
                return 2;
            case "02":
                return 4;
            case "03":
                return 8;
            case "04":
                return 16;
            case "05":
                return 32;
            case "06":
                return 64;
            case "07":
                return 128;
            case "08":
                return 256;
            case "09":
                return 512;
            case "10":
                return 1024;
            default:
                return null;
        }
    }

    private static int findNalStartCode(byte[] bArr, int i3) {
        int length = bArr.length - NAL_START_CODE.length;
        while (i3 <= length) {
            if (isNalStartCode(bArr, i3)) {
                return i3;
            }
            i3++;
        }
        return -1;
    }

    private static Pair<Integer, Integer> getAacCodecProfileAndLevel(String str, String[] strArr) {
        int iMp4aAudioObjectTypeToProfile;
        if (strArr.length != 3) {
            Y6.f.v("Ignoring malformed MP4A codec string: ", str, TAG);
            return null;
        }
        try {
            if (MimeTypes.AUDIO_AAC.equals(MimeTypes.getMimeTypeFromMp4ObjectType(Integer.parseInt(strArr[1], 16))) && (iMp4aAudioObjectTypeToProfile = mp4aAudioObjectTypeToProfile(Integer.parseInt(strArr[2]))) != -1) {
                return new Pair<>(Integer.valueOf(iMp4aAudioObjectTypeToProfile), 0);
            }
        } catch (NumberFormatException unused) {
            Y6.f.v("Ignoring malformed MP4A codec string: ", str, TAG);
        }
        return null;
    }

    private static Pair<Integer, Integer> getAc4CodecProfileAndLevel(String str, String[] strArr) {
        if (strArr.length != 4) {
            Y6.f.v("Ignoring malformed AC-4 codec string: ", str, TAG);
            return null;
        }
        try {
            int i3 = Integer.parseInt(strArr[1]);
            int i9 = Integer.parseInt(strArr[2]);
            int i10 = Integer.parseInt(strArr[3]);
            int iAc4BitstreamAndPresentationVersionsToProfileConst = ac4BitstreamAndPresentationVersionsToProfileConst(i3, i9);
            if (iAc4BitstreamAndPresentationVersionsToProfileConst != -1) {
                int iAc4LevelNumberToConst = ac4LevelNumberToConst(i10);
                if (iAc4LevelNumberToConst != -1) {
                    return new Pair<>(Integer.valueOf(iAc4BitstreamAndPresentationVersionsToProfileConst), Integer.valueOf(iAc4LevelNumberToConst));
                }
                Y6.f.p(i10, "Unknown AC-4 level: ", TAG);
                return null;
            }
            Log.w(TAG, "Unknown AC-4 profile: " + i3 + "." + i9);
            return null;
        } catch (NumberFormatException unused) {
            Y6.f.v("Ignoring malformed AC-4 codec string: ", str, TAG);
            return null;
        }
    }

    private static Pair<Integer, Integer> getApvProfileAndLevel(String str, String[] strArr) {
        int i3;
        if (strArr.length < 4) {
            Y6.f.v("Ignoring malformed APV codec string: ", str, TAG);
            return null;
        }
        try {
            int i9 = Integer.parseInt(strArr[1].substring(4));
            int i10 = Integer.parseInt(strArr[2].substring(4));
            int i11 = Integer.parseInt(strArr[3].substring(4));
            if (i9 == 33) {
                i3 = 1;
            } else {
                if (i9 != 44) {
                    Y6.f.p(i9, "Ignoring invalid APV profile: ", TAG);
                    return null;
                }
                i3 = 8192;
            }
            int i12 = (i10 / 30) * 2;
            if (i10 % 30 == 0) {
                i12--;
            }
            return new Pair<>(Integer.valueOf(i3), Integer.valueOf((1 << i11) | (256 << (i12 - 1))));
        } catch (NumberFormatException e6) {
            Log.w(TAG, "Ignoring malformed APV codec string: " + str, e6);
            return null;
        }
    }

    private static Pair<Integer, Integer> getAv1ProfileAndLevel(String str, String[] strArr, ColorInfo colorInfo) {
        int i3;
        if (strArr.length < 4) {
            Y6.f.v("Ignoring malformed AV1 codec string: ", str, TAG);
            return null;
        }
        int i9 = 1;
        try {
            int i10 = Integer.parseInt(strArr[1]);
            int i11 = Integer.parseInt(strArr[2].substring(0, 2));
            int i12 = Integer.parseInt(strArr[3]);
            if (i10 != 0) {
                Y6.f.p(i10, "Unknown AV1 profile: ", TAG);
                return null;
            }
            if (i12 != 8 && i12 != 10) {
                Y6.f.p(i12, "Unknown AV1 bit depth: ", TAG);
                return null;
            }
            if (i12 != 8) {
                i9 = (colorInfo == null || !(colorInfo.hdrStaticInfo != null || (i3 = colorInfo.colorTransfer) == 7 || i3 == 6)) ? 2 : 4096;
            }
            int iAv1LevelNumberToConst = av1LevelNumberToConst(i11);
            if (iAv1LevelNumberToConst != -1) {
                return new Pair<>(Integer.valueOf(i9), Integer.valueOf(iAv1LevelNumberToConst));
            }
            Y6.f.p(i11, "Unknown AV1 level: ", TAG);
            return null;
        } catch (NumberFormatException unused) {
            Y6.f.v("Ignoring malformed AV1 codec string: ", str, TAG);
            return null;
        }
    }

    private static Pair<Integer, Integer> getAvcProfileAndLevel(String str, String[] strArr) {
        int i3;
        int i9;
        if (strArr.length < 2) {
            Y6.f.v("Ignoring malformed AVC codec string: ", str, TAG);
            return null;
        }
        try {
            if (strArr[1].length() == 6) {
                i9 = Integer.parseInt(strArr[1].substring(0, 2), 16);
                i3 = Integer.parseInt(strArr[1].substring(4), 16);
            } else {
                if (strArr.length < 3) {
                    Log.w(TAG, "Ignoring malformed AVC codec string: " + str);
                    return null;
                }
                int i10 = Integer.parseInt(strArr[1]);
                i3 = Integer.parseInt(strArr[2]);
                i9 = i10;
            }
            int iAvcProfileNumberToConst = avcProfileNumberToConst(i9);
            if (iAvcProfileNumberToConst == -1) {
                Y6.f.p(i9, "Unknown AVC profile: ", TAG);
                return null;
            }
            int iAvcLevelNumberToConst = avcLevelNumberToConst(i3);
            if (iAvcLevelNumberToConst != -1) {
                return new Pair<>(Integer.valueOf(iAvcProfileNumberToConst), Integer.valueOf(iAvcLevelNumberToConst));
            }
            Y6.f.p(i3, "Unknown AVC level: ", TAG);
            return null;
        } catch (NumberFormatException unused) {
            Y6.f.v("Ignoring malformed AVC codec string: ", str, TAG);
            return null;
        }
    }

    public static Pair<Integer, Integer> getCodecProfileAndLevel(Format format) {
        byte b9 = 0;
        String str = format.codecs;
        if (str == null) {
            return null;
        }
        String[] strArrSplit = str.split("\\.");
        if (MimeTypes.VIDEO_DOLBY_VISION.equals(format.sampleMimeType)) {
            return getDolbyVisionProfileAndLevel(format.codecs, strArrSplit);
        }
        String str2 = strArrSplit[0];
        str2.getClass();
        switch (str2.hashCode()) {
            case 2986313:
                if (!str2.equals(CODEC_ID_AC4)) {
                    b9 = -1;
                }
                break;
            case 3001066:
                b9 = !str2.equals(CODEC_ID_APV1) ? (byte) -1 : (byte) 1;
                break;
            case 3004662:
                b9 = !str2.equals(CODEC_ID_AV01) ? (byte) -1 : (byte) 2;
                break;
            case 3006243:
                b9 = !str2.equals(CODEC_ID_AVC1) ? (byte) -1 : (byte) 3;
                break;
            case 3006244:
                b9 = !str2.equals(CODEC_ID_AVC2) ? (byte) -1 : (byte) 4;
                break;
            case 3199032:
                b9 = !str2.equals(CODEC_ID_HEV1) ? (byte) -1 : (byte) 5;
                break;
            case 3214780:
                b9 = !str2.equals(CODEC_ID_HVC1) ? (byte) -1 : (byte) 6;
                break;
            case 3224753:
                b9 = !str2.equals(CODEC_ID_IAMF) ? (byte) -1 : (byte) 7;
                break;
            case 3356560:
                b9 = !str2.equals(CODEC_ID_MP4A) ? (byte) -1 : (byte) 8;
                break;
            case 3475740:
                b9 = !str2.equals(CODEC_ID_H263) ? (byte) -1 : (byte) 9;
                break;
            case 3624515:
                b9 = !str2.equals(CODEC_ID_VP09) ? (byte) -1 : (byte) 10;
                break;
            case 3631854:
                b9 = !str2.equals(CODEC_ID_VVC1) ? (byte) -1 : (byte) 11;
                break;
            case 3632040:
                b9 = !str2.equals(CODEC_ID_VVI1) ? (byte) -1 : (byte) 12;
                break;
            default:
                b9 = -1;
                break;
        }
        switch (b9) {
            case 0:
                return getAc4CodecProfileAndLevel(format.codecs, strArrSplit);
            case 1:
                return getApvProfileAndLevel(format.codecs, strArrSplit);
            case 2:
                return getAv1ProfileAndLevel(format.codecs, strArrSplit, format.colorInfo);
            case 3:
            case 4:
                return getAvcProfileAndLevel(format.codecs, strArrSplit);
            case 5:
            case 6:
                return getHevcProfileAndLevel(format.codecs, strArrSplit, format.colorInfo);
            case 7:
                return getIamfCodecProfileAndLevel(format.codecs, strArrSplit);
            case 8:
                return getAacCodecProfileAndLevel(format.codecs, strArrSplit);
            case 9:
                return getH263ProfileAndLevel(format.codecs, strArrSplit);
            case 10:
                return getVp9ProfileAndLevel(format.codecs, strArrSplit);
            case 11:
            case 12:
                return getVvcProfileAndLevel(format.codecs, strArrSplit, format.colorInfo);
            default:
                return null;
        }
    }

    public static String getDolbyVisionBaseLayerMimeType(Format format) {
        Pair<Integer, Integer> codecProfileAndLevel;
        if (!Objects.equals(format.sampleMimeType, MimeTypes.VIDEO_DOLBY_VISION) || (codecProfileAndLevel = getCodecProfileAndLevel(format)) == null) {
            return null;
        }
        int iIntValue = ((Integer) codecProfileAndLevel.first).intValue();
        if (iIntValue == 16 || iIntValue == 32 || iIntValue == 256) {
            return MimeTypes.VIDEO_H265;
        }
        if (iIntValue == 512) {
            return MimeTypes.VIDEO_H264;
        }
        if (iIntValue != 1024) {
            return null;
        }
        return MimeTypes.VIDEO_AV1;
    }

    private static Pair<Integer, Integer> getDolbyVisionProfileAndLevel(String str, String[] strArr) {
        if (strArr.length < 3) {
            Y6.f.v("Ignoring malformed Dolby Vision codec string: ", str, TAG);
            return null;
        }
        Matcher matcher = PROFILE_PATTERN.matcher(strArr[1]);
        if (!matcher.matches()) {
            Y6.f.v("Ignoring malformed Dolby Vision codec string: ", str, TAG);
            return null;
        }
        String strGroup = matcher.group(1);
        Integer numDolbyVisionStringToProfile = dolbyVisionStringToProfile(strGroup);
        if (numDolbyVisionStringToProfile == null) {
            Y6.f.v("Unknown Dolby Vision profile string: ", strGroup, TAG);
            return null;
        }
        String str2 = strArr[2];
        Integer numDolbyVisionStringToLevel = dolbyVisionStringToLevel(str2);
        if (numDolbyVisionStringToLevel != null) {
            return new Pair<>(numDolbyVisionStringToProfile, numDolbyVisionStringToLevel);
        }
        Y6.f.v("Unknown Dolby Vision level string: ", str2, TAG);
        return null;
    }

    private static Pair<Integer, Integer> getH263ProfileAndLevel(String str, String[] strArr) {
        Pair<Integer, Integer> pair = new Pair<>(1, 1);
        if (strArr.length < 3) {
            Y6.f.v("Ignoring malformed H263 codec string: ", str, TAG);
            return pair;
        }
        try {
            return new Pair<>(Integer.valueOf(Integer.parseInt(strArr[1])), Integer.valueOf(Integer.parseInt(strArr[2])));
        } catch (NumberFormatException unused) {
            Y6.f.v("Ignoring malformed H263 codec string: ", str, TAG);
            return pair;
        }
    }

    public static Pair<Integer, Integer> getHevcProfileAndLevel(String str, String[] strArr, ColorInfo colorInfo) {
        if (strArr.length < 4) {
            Y6.f.v("Ignoring malformed HEVC codec string: ", str, TAG);
            return null;
        }
        int i3 = 1;
        Matcher matcher = PROFILE_PATTERN.matcher(strArr[1]);
        if (!matcher.matches()) {
            Y6.f.v("Ignoring malformed HEVC codec string: ", str, TAG);
            return null;
        }
        String strGroup = matcher.group(1);
        if (!IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(strGroup)) {
            i3 = 6;
            if ("2".equals(strGroup)) {
                i3 = (colorInfo == null || colorInfo.colorTransfer != 6) ? 2 : 4096;
            } else if (!"6".equals(strGroup)) {
                Y6.f.v("Unknown HEVC profile string: ", strGroup, TAG);
                return null;
            }
        }
        String str2 = strArr[3];
        Integer numHevcCodecStringToProfileLevel = hevcCodecStringToProfileLevel(str2);
        if (numHevcCodecStringToProfileLevel != null) {
            return new Pair<>(Integer.valueOf(i3), numHevcCodecStringToProfileLevel);
        }
        Y6.f.v("Unknown HEVC level string: ", str2, TAG);
        return null;
    }

    private static Pair<Integer, Integer> getIamfCodecProfileAndLevel(String str, String[] strArr) {
        int i3 = 2;
        if (strArr.length < 4) {
            Y6.f.v("Ignoring malformed IAMF codec string: ", str, TAG);
            return null;
        }
        try {
            int i9 = 1 << (Integer.parseInt(strArr[1]) + 16);
            String str2 = strArr[3];
            str2.getClass();
            switch (str2) {
                case "Opus":
                    i3 = 1;
                    break;
                case "fLaC":
                    i3 = 4;
                    break;
                case "ipcm":
                    i3 = 8;
                    break;
                case "mp4a":
                    break;
                default:
                    Log.w(TAG, "Ignoring unknown codec identifier for IAMF auxiliary profile: " + strArr[3]);
                    return null;
            }
            return new Pair<>(Integer.valueOf(i9 | 16777216 | i3), 0);
        } catch (NumberFormatException e6) {
            Log.w(TAG, "Ignoring malformed primary profile in IAMF codec string: " + strArr[1], e6);
            return null;
        }
    }

    public static byte[] getOpusInitializationData(Format format) {
        AbstractC1864o0.M(!format.initializationData.isEmpty(), "csd-0 must be present for Opus.");
        int i3 = 0;
        byte[] bArr = format.initializationData.get(0);
        AbstractC1864o0.L(bArr.length >= 8);
        ParsableByteArray parsableByteArray = new ParsableByteArray(bArr);
        int length = bArr.length;
        String string = parsableByteArray.readString(8);
        if (string.equals("AOPUSHDR")) {
            AbstractC1864o0.L(bArr.length >= 24);
            long littleEndianLong = parsableByteArray.readLittleEndianLong();
            AbstractC1864o0.L(((long) 16) + littleEndianLong <= ((long) bArr.length));
            length = (int) littleEndianLong;
            i3 = 16;
        } else {
            AbstractC1864o0.L(string.equals("OpusHead"));
        }
        return Arrays.copyOfRange(bArr, i3, length + i3);
    }

    public static Pair<Integer, Integer> getVideoResolutionFromMpeg4VideoConfig(byte[] bArr) {
        boolean z6;
        ParsableByteArray parsableByteArray = new ParsableByteArray(bArr);
        int i3 = 0;
        int i9 = 0;
        while (true) {
            int i10 = i9 + 3;
            if (i10 >= bArr.length) {
                z6 = false;
                break;
            }
            if (parsableByteArray.readUnsignedInt24() == 1 && (bArr[i10] & 240) == 32) {
                z6 = true;
                break;
            }
            parsableByteArray.setPosition(parsableByteArray.getPosition() - 2);
            i9++;
        }
        AbstractC1864o0.M(z6, "Invalid input: VOL not found.");
        ParsableBitArray parsableBitArray = new ParsableBitArray(bArr);
        parsableBitArray.skipBits((i9 + 4) * 8);
        parsableBitArray.skipBits(1);
        parsableBitArray.skipBits(8);
        if (parsableBitArray.readBit()) {
            parsableBitArray.skipBits(4);
            parsableBitArray.skipBits(3);
        }
        if (parsableBitArray.readBits(4) == 15) {
            parsableBitArray.skipBits(8);
            parsableBitArray.skipBits(8);
        }
        if (parsableBitArray.readBit()) {
            parsableBitArray.skipBits(2);
            parsableBitArray.skipBits(1);
            if (parsableBitArray.readBit()) {
                parsableBitArray.skipBits(79);
            }
        }
        AbstractC1864o0.M(parsableBitArray.readBits(2) == 0, "Only supports rectangular video object layer shape.");
        AbstractC1864o0.L(parsableBitArray.readBit());
        int bits = parsableBitArray.readBits(16);
        AbstractC1864o0.L(parsableBitArray.readBit());
        if (parsableBitArray.readBit()) {
            AbstractC1864o0.L(bits > 0);
            for (int i11 = bits - 1; i11 > 0; i11 >>= 1) {
                i3++;
            }
            parsableBitArray.skipBits(i3);
        }
        AbstractC1864o0.L(parsableBitArray.readBit());
        int bits2 = parsableBitArray.readBits(13);
        AbstractC1864o0.L(parsableBitArray.readBit());
        int bits3 = parsableBitArray.readBits(13);
        AbstractC1864o0.L(parsableBitArray.readBit());
        parsableBitArray.skipBits(1);
        return Pair.create(Integer.valueOf(bits2), Integer.valueOf(bits3));
    }

    public static ByteBuffer getVorbisInitializationData(Format format) {
        AbstractC1864o0.M(format.initializationData.size() > 1, "csd-0 and csd-1 must be present for Vorbis.");
        byte[] bArr = format.initializationData.get(0);
        byte[] bArr2 = format.initializationData.get(1);
        int length = bArr.length;
        int length2 = bArr2.length;
        byte[] bArrXiphLaceEnc = xiphLaceEnc(length);
        byte[] bArrXiphLaceEnc2 = xiphLaceEnc(23);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArrXiphLaceEnc.length + 1 + bArrXiphLaceEnc2.length + length + 23 + length2);
        byteBufferAllocate.put((byte) 2);
        byteBufferAllocate.put(bArrXiphLaceEnc);
        byteBufferAllocate.put(bArrXiphLaceEnc2);
        byteBufferAllocate.put(bArr);
        byteBufferAllocate.put(new byte[]{3, 118, 111, 114, 98, 105, 115, 7, 0, 0, 0, 97, 110, 100, 114, 111, 105, 100, 0, 0, 0, 0, 1});
        byteBufferAllocate.put(bArr2);
        byteBufferAllocate.flip();
        return byteBufferAllocate;
    }

    private static Pair<Integer, Integer> getVp9ProfileAndLevel(String str, String[] strArr) {
        if (strArr.length < 3) {
            Y6.f.v("Ignoring malformed VP9 codec string: ", str, TAG);
            return null;
        }
        try {
            int i3 = Integer.parseInt(strArr[1]);
            int i9 = Integer.parseInt(strArr[2]);
            int iVp9ProfileNumberToConst = vp9ProfileNumberToConst(i3);
            if (iVp9ProfileNumberToConst == -1) {
                Y6.f.p(i3, "Unknown VP9 profile: ", TAG);
                return null;
            }
            int iVp9LevelNumberToConst = vp9LevelNumberToConst(i9);
            if (iVp9LevelNumberToConst != -1) {
                return new Pair<>(Integer.valueOf(iVp9ProfileNumberToConst), Integer.valueOf(iVp9LevelNumberToConst));
            }
            Y6.f.p(i9, "Unknown VP9 level: ", TAG);
            return null;
        } catch (NumberFormatException unused) {
            Y6.f.v("Ignoring malformed VP9 codec string: ", str, TAG);
            return null;
        }
    }

    private static Pair<Integer, Integer> getVvcProfileAndLevel(String str, String[] strArr, ColorInfo colorInfo) {
        if (strArr.length < 3) {
            Y6.f.v("Ignoring malformed VVC codec string: ", str, TAG);
            return null;
        }
        int i3 = 1;
        try {
            int i9 = Integer.parseInt(strArr[1]);
            if (i9 == 1) {
                if (colorInfo != null && colorInfo.colorTransfer == 6) {
                    i3 = 4096;
                } else if (colorInfo == null || colorInfo.lumaBitdepth != 8) {
                    i3 = 2;
                }
            } else {
                if (i9 != 65) {
                    Log.w(TAG, "Unknown VVC profile IDC: " + strArr[1]);
                    return null;
                }
                i3 = 4;
            }
            String str2 = strArr[2];
            Integer numVvcCodecStringToProfileLevel = vvcCodecStringToProfileLevel(str2);
            if (numVvcCodecStringToProfileLevel != null) {
                return new Pair<>(Integer.valueOf(i3), numVvcCodecStringToProfileLevel);
            }
            Y6.f.v("Unknown VVC level string: ", str2, TAG);
            return null;
        } catch (NumberFormatException unused) {
            Y6.f.v("Ignoring malformed VVC codec string: ", str, TAG);
            return null;
        }
    }

    private static Integer hevcCodecStringToProfileLevel(String str) {
        if (str == null) {
            return null;
        }
        switch (str) {
            case "H30":
                return 2;
            case "H60":
                return 8;
            case "H63":
                return 32;
            case "H90":
                return 128;
            case "H93":
                return 512;
            case "L30":
                return 1;
            case "L60":
                return 4;
            case "L63":
                return 16;
            case "L90":
                return 64;
            case "L93":
                return 256;
            case "H120":
                return 2048;
            case "H123":
                return 8192;
            case "H150":
                return 32768;
            case "H153":
                return 131072;
            case "H156":
                return Integer.valueOf(VVC_MAIN_TIER_LEVEL_6_2);
            case "H180":
                return Integer.valueOf(VVC_MAIN_TIER_LEVEL_6_3);
            case "H183":
                return 8388608;
            case "H186":
                return 33554432;
            case "L120":
                return 1024;
            case "L123":
                return 4096;
            case "L150":
                return 16384;
            case "L153":
                return 65536;
            case "L156":
                return 262144;
            case "L180":
                return 1048576;
            case "L183":
                return Integer.valueOf(VVC_HIGH_TIER_LEVEL_6_3);
            case "L186":
                return 16777216;
            default:
                return null;
        }
    }

    private static boolean isNalStartCode(byte[] bArr, int i3) {
        if (bArr.length - i3 <= NAL_START_CODE.length) {
            return false;
        }
        int i9 = 0;
        while (true) {
            byte[] bArr2 = NAL_START_CODE;
            if (i9 >= bArr2.length) {
                return true;
            }
            if (bArr[i3 + i9] != bArr2[i9]) {
                return false;
            }
            i9++;
        }
    }

    private static int mp4aAudioObjectTypeToProfile(int i3) {
        int i9 = 17;
        if (i3 != 17) {
            i9 = 20;
            if (i3 != 20) {
                i9 = 23;
                if (i3 != 23) {
                    i9 = 29;
                    if (i3 != 29) {
                        i9 = 39;
                        if (i3 != 39) {
                            i9 = 42;
                            if (i3 != 42) {
                                switch (i3) {
                                    case 1:
                                        return 1;
                                    case 2:
                                        return 2;
                                    case 3:
                                        return 3;
                                    case 4:
                                        return 4;
                                    case 5:
                                        return 5;
                                    case 6:
                                        return 6;
                                    default:
                                        return -1;
                                }
                            }
                        }
                    }
                }
            }
        }
        return i9;
    }

    public static int[] parseAlacAudioSpecificConfig(byte[] bArr) {
        ParsableByteArray parsableByteArray = new ParsableByteArray(bArr);
        parsableByteArray.setPosition(5);
        int unsignedByte = parsableByteArray.readUnsignedByte();
        parsableByteArray.setPosition(9);
        int unsignedByte2 = parsableByteArray.readUnsignedByte();
        parsableByteArray.setPosition(20);
        return new int[]{parsableByteArray.readUnsignedIntToInt(), unsignedByte2, unsignedByte};
    }

    public static boolean parseCea708InitializationData(List<byte[]> list) {
        return list.size() == 1 && list.get(0).length == 1 && list.get(0)[0] == 1;
    }

    public static byte[][] splitNalUnits(byte[] bArr) {
        if (!isNalStartCode(bArr, 0)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int iFindNalStartCode = 0;
        do {
            arrayList.add(Integer.valueOf(iFindNalStartCode));
            iFindNalStartCode = findNalStartCode(bArr, iFindNalStartCode + NAL_START_CODE.length);
        } while (iFindNalStartCode != -1);
        byte[][] bArr2 = new byte[arrayList.size()][];
        int i3 = 0;
        while (i3 < arrayList.size()) {
            int iIntValue = ((Integer) arrayList.get(i3)).intValue();
            int iIntValue2 = (i3 < arrayList.size() + (-1) ? ((Integer) arrayList.get(i3 + 1)).intValue() : bArr.length) - iIntValue;
            byte[] bArr3 = new byte[iIntValue2];
            System.arraycopy(bArr, iIntValue, bArr3, 0, iIntValue2);
            bArr2[i3] = bArr3;
            i3++;
        }
        return bArr2;
    }

    private static int vp9LevelNumberToConst(int i3) {
        if (i3 == 10) {
            return 1;
        }
        if (i3 == 11) {
            return 2;
        }
        if (i3 == 20) {
            return 4;
        }
        if (i3 == 21) {
            return 8;
        }
        if (i3 == 30) {
            return 16;
        }
        if (i3 == 31) {
            return 32;
        }
        if (i3 == 40) {
            return 64;
        }
        if (i3 == 41) {
            return 128;
        }
        if (i3 == 50) {
            return 256;
        }
        if (i3 == 51) {
            return 512;
        }
        switch (i3) {
            case MPVLib.MPV_LOG_LEVEL_DEBUG:
                return 2048;
            case 61:
                return 4096;
            case 62:
                return 8192;
            default:
                return -1;
        }
    }

    private static int vp9ProfileNumberToConst(int i3) {
        if (i3 == 0) {
            return 1;
        }
        if (i3 == 1) {
            return 2;
        }
        if (i3 != 2) {
            return i3 != 3 ? -1 : 8;
        }
        return 4;
    }

    private static Integer vvcCodecStringToProfileLevel(String str) {
        if (str == null) {
            return null;
        }
        switch (str) {
            case "H64":
                return 64;
            case "H67":
                return 256;
            case "H80":
                return 1024;
            case "H83":
                return 4096;
            case "H86":
                return 16384;
            case "H96":
                return 65536;
            case "L16":
                return 1;
            case "L32":
                return 2;
            case "L35":
                return 4;
            case "L48":
                return 8;
            case "L51":
                return 16;
            case "L64":
                return 32;
            case "L67":
                return 128;
            case "L80":
                return 512;
            case "L83":
                return 2048;
            case "L86":
                return 8192;
            case "L96":
                return 32768;
            case "H112":
                return 262144;
            case "H128":
                return 1048576;
            case "H144":
                return Integer.valueOf(VVC_HIGH_TIER_LEVEL_6_3);
            case "L112":
                return 131072;
            case "L128":
                return Integer.valueOf(VVC_MAIN_TIER_LEVEL_6_2);
            case "L144":
                return Integer.valueOf(VVC_MAIN_TIER_LEVEL_6_3);
            default:
                return null;
        }
    }

    private static byte[] xiphLaceEnc(int i3) {
        int i9 = i3 / 255;
        byte[] bArr = new byte[i9 + 1];
        Arrays.fill(bArr, (byte) -1);
        bArr[i9] = (byte) (i3 % 255);
        return bArr;
    }
}
