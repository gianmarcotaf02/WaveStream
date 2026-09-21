package androidx.media3.exoplayer.mediacodec;

import android.content.Context;
import android.media.MediaCodecList;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.CodecSpecificDataUtil;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import androidx.media3.container.NalUnitUtil;
import com.google.crypto.tink.shaded.protobuf.AbstractC1909d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p076i4.AbstractC2186b0;
import p076i4.S0;
import p076i4.Y;
import p076i4.Z;

public final class MediaCodecUtil {
    private static final String TAG = "MediaCodecUtil";
    private static final HashMap<CodecKey, List<MediaCodecInfo>> decoderInfosCache = new HashMap<>();
    private static int maxH264DecodableFrameSize = -1;

    public static final class CodecKey {
        public final String mimeType;
        public final boolean secure;
        public final boolean tunneling;

        public CodecKey(String str, boolean z6, boolean z9) {
            this.mimeType = str;
            this.secure = z6;
            this.tunneling = z9;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && obj.getClass() == CodecKey.class) {
                CodecKey codecKey = (CodecKey) obj;
                if (TextUtils.equals(this.mimeType, codecKey.mimeType) && this.secure == codecKey.secure && this.tunneling == codecKey.tunneling) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return ((B2.a.a(31, 31, this.mimeType) + (this.secure ? 1231 : 1237)) * 31) + (this.tunneling ? 1231 : 1237);
        }
    }

    public static class DecoderQueryException extends Exception {
        private DecoderQueryException(Throwable th) {
            super("Failed to query underlying media codecs", th);
        }
    }

    public interface MediaCodecListCompat {
        int getCodecCount();

        android.media.MediaCodecInfo getCodecInfoAt(int i3);

        boolean isFeatureRequired(String str, String str2, android.media.MediaCodecInfo.CodecCapabilities codecCapabilities);

        boolean isFeatureSupported(String str, String str2, android.media.MediaCodecInfo.CodecCapabilities codecCapabilities);

        boolean secureDecodersExplicit();
    }

    public static final class MediaCodecListCompatV16 implements MediaCodecListCompat {
        private MediaCodecListCompatV16() {
        }

        @Override
        public int getCodecCount() {
            return MediaCodecList.getCodecCount();
        }

        @Override
        public android.media.MediaCodecInfo getCodecInfoAt(int i3) {
            return MediaCodecList.getCodecInfoAt(i3);
        }

        @Override
        public boolean isFeatureRequired(String str, String str2, android.media.MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return false;
        }

        @Override
        public boolean isFeatureSupported(String str, String str2, android.media.MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return "secure-playback".equals(str) && MimeTypes.VIDEO_H264.equals(str2);
        }

        @Override
        public boolean secureDecodersExplicit() {
            return false;
        }
    }

    public static final class MediaCodecListCompatV21 implements MediaCodecListCompat {
        private final int codecKind;
        private android.media.MediaCodecInfo[] mediaCodecInfos;

        public MediaCodecListCompatV21(boolean z6, boolean z9, boolean z10) {
            this.codecKind = (z6 || z9 || z10) ? 1 : 0;
        }

        @EnsuresNonNull({"mediaCodecInfos"})
        private void ensureMediaCodecInfosInitialized() {
            if (this.mediaCodecInfos == null) {
                this.mediaCodecInfos = new MediaCodecList(this.codecKind).getCodecInfos();
            }
        }

        @Override
        public int getCodecCount() {
            ensureMediaCodecInfosInitialized();
            return this.mediaCodecInfos.length;
        }

        @Override
        public android.media.MediaCodecInfo getCodecInfoAt(int i3) {
            ensureMediaCodecInfosInitialized();
            return this.mediaCodecInfos[i3];
        }

        @Override
        public boolean isFeatureRequired(String str, String str2, android.media.MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureRequired(str);
        }

        @Override
        public boolean isFeatureSupported(String str, String str2, android.media.MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported(str);
        }

        @Override
        public boolean secureDecodersExplicit() {
            return true;
        }
    }

    public interface ScoreProvider<T> {
        int getScore(T t9);
    }

    private MediaCodecUtil() {
    }

    private static void applyWorkarounds(String str, List<MediaCodecInfo> list) {
        if (MimeTypes.AUDIO_RAW.equals(str)) {
            if (Build.VERSION.SDK_INT < 26 && Build.DEVICE.equals("R9") && list.size() == 1 && list.get(0).name.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                list.add(MediaCodecInfo.newInstance("OMX.google.raw.decoder", MimeTypes.AUDIO_RAW, MimeTypes.AUDIO_RAW, null, false, true, false, false, false));
            }
            sortByScore(list, new e(1));
        }
        if (Build.VERSION.SDK_INT >= 32 || list.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(list.get(0).name)) {
            return;
        }
        list.add(list.remove(0));
    }

    private static int avcLevelToMaxFrameSize(int i3) {
        if (i3 == 1 || i3 == 2) {
            return 25344;
        }
        switch (i3) {
            case 8:
            case 16:
            case 32:
                return 101376;
            case 64:
                return 202752;
            case 128:
            case 256:
                return 414720;
            case 512:
                return 921600;
            case 1024:
                return 1310720;
            case 2048:
            case 4096:
                return 2097152;
            case 8192:
                return 2228224;
            case 16384:
                return 5652480;
            case 32768:
            case 65536:
                return 9437184;
            case 131072:
            case 262144:
            case 524288:
                return 35651584;
            default:
                return -1;
        }
    }

    public static synchronized void clearDecoderInfoCache() {
        decoderInfosCache.clear();
    }

    public static android.media.MediaCodecInfo.CodecProfileLevel createCodecProfileLevel(int i3, int i9) {
        android.media.MediaCodecInfo.CodecProfileLevel codecProfileLevel = new android.media.MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = i3;
        codecProfileLevel.level = i9;
        return codecProfileLevel;
    }

    public static String getAlternativeCodecMimeType(Format format) {
        Pair<Integer, Integer> codecProfileAndLevel;
        if (MimeTypes.AUDIO_E_AC3_JOC.equals(format.sampleMimeType)) {
            return MimeTypes.AUDIO_E_AC3;
        }
        if (MimeTypes.VIDEO_DOLBY_VISION.equals(format.sampleMimeType) && (codecProfileAndLevel = CodecSpecificDataUtil.getCodecProfileAndLevel(format)) != null) {
            int iIntValue = ((Integer) codecProfileAndLevel.first).intValue();
            if (iIntValue == 16 || iIntValue == 256) {
                return MimeTypes.VIDEO_H265;
            }
            if (iIntValue == 512) {
                return MimeTypes.VIDEO_H264;
            }
            if (iIntValue == 1024) {
                ColorInfo colorInfo = format.colorInfo;
                if (colorInfo != null && colorInfo.colorTransfer == 6 && colorInfo.colorRange == 1) {
                    return null;
                }
                return MimeTypes.VIDEO_AV1;
            }
        }
        if (MimeTypes.VIDEO_MV_HEVC.equals(format.sampleMimeType)) {
            return MimeTypes.VIDEO_H265;
        }
        return null;
    }

    public static List<MediaCodecInfo> getAlternativeDecoderInfos(MediaCodecSelector mediaCodecSelector, Format format, boolean z6, boolean z9) {
        String alternativeCodecMimeType = getAlternativeCodecMimeType(format);
        if (alternativeCodecMimeType != null) {
            return mediaCodecSelector.getDecoderInfos(alternativeCodecMimeType, z6, z9);
        }
        Z z10 = AbstractC2186b0.f22868i;
        return S0.f22832l;
    }

    private static String getCodecMimeType(android.media.MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals(MimeTypes.VIDEO_DOLBY_VISION)) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        }
        if (str2.equals(MimeTypes.VIDEO_MV_HEVC)) {
            if ("c2.qti.mvhevc.decoder".equals(str) || "c2.qti.mvhevc.decoder.secure".equals(str)) {
                return "video/x-mvhevc";
            }
            return null;
        }
        if (str2.equals(MimeTypes.AUDIO_ALAC) && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals(MimeTypes.AUDIO_FLAC) && "OMX.lge.flac.decoder".equals(str)) {
            return "audio/x-lg-flac";
        }
        if (str2.equals(MimeTypes.AUDIO_AC3) && "OMX.lge.ac3.decoder".equals(str)) {
            return "audio/lg-ac3";
        }
        return null;
    }

    @Deprecated
    public static Pair<Integer, Integer> getCodecProfileAndLevel(Format format) {
        return CodecSpecificDataUtil.getCodecProfileAndLevel(format);
    }

    public static MediaCodecInfo getDecoderInfo(String str, boolean z6, boolean z9) {
        List<MediaCodecInfo> decoderInfos = getDecoderInfos(str, z6, z9);
        if (decoderInfos.isEmpty()) {
            return null;
        }
        return decoderInfos.get(0);
    }

    public static synchronized List<MediaCodecInfo> getDecoderInfos(String str, boolean z6, boolean z9) {
        try {
            CodecKey codecKey = new CodecKey(str, z6, z9);
            HashMap<CodecKey, List<MediaCodecInfo>> map = decoderInfosCache;
            List<MediaCodecInfo> list = map.get(codecKey);
            if (list != null) {
                return list;
            }
            ArrayList<MediaCodecInfo> decoderInfosInternal = getDecoderInfosInternal(codecKey, new MediaCodecListCompatV21(z6, z9, str.equals(MimeTypes.VIDEO_MV_HEVC)));
            if (z6) {
                decoderInfosInternal.isEmpty();
            }
            applyWorkarounds(str, decoderInfosInternal);
            AbstractC2186b0 abstractC2186b0U = AbstractC2186b0.u(decoderInfosInternal);
            map.put(codecKey, abstractC2186b0U);
            return abstractC2186b0U;
        } catch (Throwable th) {
            throw th;
        }
    }

    private static ArrayList<MediaCodecInfo> getDecoderInfosInternal(CodecKey codecKey, MediaCodecListCompat mediaCodecListCompat) throws DecoderQueryException {
        String codecMimeType;
        String str;
        int i3;
        MediaCodecListCompat mediaCodecListCompat2 = mediaCodecListCompat;
        try {
            ArrayList<MediaCodecInfo> arrayList = new ArrayList<>();
            String str2 = codecKey.mimeType;
            int codecCount = mediaCodecListCompat2.getCodecCount();
            boolean zSecureDecodersExplicit = mediaCodecListCompat2.secureDecodersExplicit();
            int i9 = 0;
            while (i9 < codecCount) {
                android.media.MediaCodecInfo codecInfoAt = mediaCodecListCompat2.getCodecInfoAt(i9);
                if (isAlias(codecInfoAt)) {
                    i3 = i9;
                } else {
                    int i10 = i9;
                    String name = codecInfoAt.getName();
                    if (isCodecUsableDecoder(codecInfoAt, name, zSecureDecodersExplicit, str2) && (codecMimeType = getCodecMimeType(codecInfoAt, name, str2)) != null) {
                        try {
                            android.media.MediaCodecInfo.CodecCapabilities capabilitiesForType = codecInfoAt.getCapabilitiesForType(codecMimeType);
                            boolean zIsFeatureSupported = mediaCodecListCompat2.isFeatureSupported("tunneled-playback", codecMimeType, capabilitiesForType);
                            boolean zIsFeatureRequired = mediaCodecListCompat2.isFeatureRequired("tunneled-playback", codecMimeType, capabilitiesForType);
                            boolean z6 = codecKey.tunneling;
                            if ((z6 || !zIsFeatureRequired) && (!z6 || zIsFeatureSupported)) {
                                boolean zIsFeatureSupported2 = mediaCodecListCompat2.isFeatureSupported("secure-playback", codecMimeType, capabilitiesForType);
                                boolean zIsFeatureRequired2 = mediaCodecListCompat2.isFeatureRequired("secure-playback", codecMimeType, capabilitiesForType);
                                boolean z9 = codecKey.secure;
                                if ((z9 || !zIsFeatureRequired2) && (!z9 || zIsFeatureSupported2)) {
                                    try {
                                        boolean zIsHardwareAccelerated = isHardwareAccelerated(codecInfoAt, str2);
                                        boolean zIsSoftwareOnly = isSoftwareOnly(codecInfoAt, str2);
                                        boolean zIsVendor = isVendor(codecInfoAt);
                                        try {
                                            if (zSecureDecodersExplicit) {
                                                if (codecKey.secure != zIsFeatureSupported2) {
                                                }
                                                str = codecMimeType;
                                                i3 = i10;
                                                arrayList.add(MediaCodecInfo.newInstance(name, str2, str, capabilitiesForType, zIsHardwareAccelerated, zIsSoftwareOnly, zIsVendor, false, false));
                                            }
                                            arrayList.add(MediaCodecInfo.newInstance(name, str2, str, capabilitiesForType, zIsHardwareAccelerated, zIsSoftwareOnly, zIsVendor, false, false));
                                        } catch (Exception e6) {
                                            e = e6;
                                            Log.e(TAG, "Failed to query codec " + name + " (" + str + ")");
                                            throw e;
                                        }
                                        if (zSecureDecodersExplicit || codecKey.secure) {
                                            str = codecMimeType;
                                            i3 = i10;
                                            if (!zSecureDecodersExplicit && zIsFeatureSupported2) {
                                                try {
                                                    try {
                                                        arrayList.add(MediaCodecInfo.newInstance(name + ".secure", str2, str, capabilitiesForType, zIsHardwareAccelerated, zIsSoftwareOnly, zIsVendor, false, true));
                                                        return arrayList;
                                                    } catch (Exception e9) {
                                                        e = e9;
                                                        name = name;
                                                        Log.e(TAG, "Failed to query codec " + name + " (" + str + ")");
                                                        throw e;
                                                    }
                                                } catch (Exception e10) {
                                                    e = e10;
                                                }
                                            }
                                        }
                                        str = codecMimeType;
                                        i3 = i10;
                                    } catch (Exception e11) {
                                        e = e11;
                                        str = codecMimeType;
                                    }
                                } else {
                                    i3 = i10;
                                }
                            } else {
                                i3 = i10;
                            }
                        } catch (Exception e12) {
                            e = e12;
                            str = codecMimeType;
                        }
                    } else {
                        i3 = i10;
                    }
                }
                i9 = i3 + 1;
                mediaCodecListCompat2 = mediaCodecListCompat;
            }
            return arrayList;
        } catch (Exception e13) {
            throw new DecoderQueryException(e13);
        }
    }

    @RequiresNonNull({"#2.sampleMimeType"})
    public static List<MediaCodecInfo> getDecoderInfosSoftMatch(MediaCodecSelector mediaCodecSelector, Format format, boolean z6, boolean z9) {
        List<MediaCodecInfo> decoderInfos = mediaCodecSelector.getDecoderInfos(format.sampleMimeType, z6, z9);
        List<MediaCodecInfo> alternativeDecoderInfos = getAlternativeDecoderInfos(mediaCodecSelector, format, z6, z9);
        Y yS = AbstractC2186b0.s();
        yS.d(decoderInfos);
        yS.d(alternativeDecoderInfos);
        return yS.f();
    }

    public static List<MediaCodecInfo> getDecoderInfosSortedByFormatSupport(Context context, List<MediaCodecInfo> list, Format format) {
        ArrayList arrayList = new ArrayList(list);
        sortByScore(arrayList, new f(context, format, 1));
        return arrayList;
    }

    public static List<MediaCodecInfo> getDecoderInfosSortedByFullFormatSupport(Context context, List<MediaCodecInfo> list, Format format) {
        ArrayList arrayList = new ArrayList(list);
        sortByScore(arrayList, new f(context, format, 0));
        return arrayList;
    }

    public static List<MediaCodecInfo> getDecoderInfosSortedBySoftwareOnly(List<MediaCodecInfo> list) {
        ArrayList arrayList = new ArrayList(list);
        sortByScore(arrayList, new e(0));
        return AbstractC2186b0.u(arrayList);
    }

    public static MediaCodecInfo getDecryptOnlyDecoderInfo() {
        return getDecoderInfo(MimeTypes.AUDIO_RAW, false, false);
    }

    public static Pair<Integer, Integer> getHevcBaseLayerCodecProfileAndLevel(Format format) {
        String h265BaseLayerCodecsString = NalUnitUtil.getH265BaseLayerCodecsString(format.initializationData);
        if (h265BaseLayerCodecsString == null) {
            return null;
        }
        return CodecSpecificDataUtil.getHevcProfileAndLevel(h265BaseLayerCodecsString, Util.split(h265BaseLayerCodecsString.trim(), "\\."), format.colorInfo);
    }

    private static boolean isAlias(android.media.MediaCodecInfo mediaCodecInfo) {
        return Build.VERSION.SDK_INT >= 29 && isAliasV29(mediaCodecInfo);
    }

    private static boolean isAliasV29(android.media.MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isAlias();
    }

    private static boolean isCodecUsableDecoder(android.media.MediaCodecInfo mediaCodecInfo, String str, boolean z6, String str2) {
        if (mediaCodecInfo.isEncoder()) {
            return false;
        }
        return z6 || !str.endsWith(".secure");
    }

    private static boolean isHardwareAccelerated(android.media.MediaCodecInfo mediaCodecInfo, String str) {
        return Build.VERSION.SDK_INT >= 29 ? isHardwareAcceleratedV29(mediaCodecInfo) : !isSoftwareOnly(mediaCodecInfo, str);
    }

    private static boolean isHardwareAcceleratedV29(android.media.MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isHardwareAccelerated();
    }

    private static boolean isSoftwareOnly(android.media.MediaCodecInfo mediaCodecInfo, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            return isSoftwareOnlyV29(mediaCodecInfo);
        }
        if (MimeTypes.isAudio(str)) {
            return true;
        }
        String strI0 = AbstractC1909d.i0(mediaCodecInfo.getName());
        if (strI0.startsWith("arc.")) {
            return false;
        }
        return strI0.startsWith("omx.google.") || strI0.startsWith("omx.ffmpeg.") || (strI0.startsWith("omx.sec.") && strI0.contains(".sw.")) || strI0.equals("omx.qcom.video.decoder.hevcswvdec") || strI0.startsWith("c2.android.") || strI0.startsWith("c2.google.") || !(strI0.startsWith("omx.") || strI0.startsWith("c2."));
    }

    private static boolean isSoftwareOnlyV29(android.media.MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isSoftwareOnly();
    }

    private static boolean isVendor(android.media.MediaCodecInfo mediaCodecInfo) {
        if (Build.VERSION.SDK_INT >= 29) {
            return isVendorV29(mediaCodecInfo);
        }
        String strI0 = AbstractC1909d.i0(mediaCodecInfo.getName());
        return (strI0.startsWith("omx.google.") || strI0.startsWith("c2.android.") || strI0.startsWith("c2.google.")) ? false : true;
    }

    private static boolean isVendorV29(android.media.MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isVendor();
    }

    public static int lambda$applyWorkarounds$3(MediaCodecInfo mediaCodecInfo) {
        String str = mediaCodecInfo.name;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (Build.VERSION.SDK_INT >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }

    public static int lambda$getDecoderInfosSortedByFormatSupport$0(Context context, Format format, MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isFormatFunctionallySupported(context, format) ? 1 : 0;
    }

    public static int lambda$getDecoderInfosSortedByFullFormatSupport$1(Context context, Format format, MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isFormatSupported(context, format) ? 1 : 0;
    }

    public static int lambda$getDecoderInfosSortedBySoftwareOnly$2(MediaCodecInfo mediaCodecInfo) {
        return (mediaCodecInfo.softwareOnly ? 2 : 0) + (!mediaCodecInfo.vendor ? 1 : 0);
    }

    public static int lambda$sortByScore$4(ScoreProvider scoreProvider, Object obj, Object obj2) {
        return scoreProvider.getScore(obj2) - scoreProvider.getScore(obj);
    }

    public static int maxH264DecodableFrameSize() {
        if (maxH264DecodableFrameSize == -1) {
            int iMax = 0;
            MediaCodecInfo decoderInfo = getDecoderInfo(MimeTypes.VIDEO_H264, false, false);
            if (decoderInfo != null) {
                android.media.MediaCodecInfo.CodecProfileLevel[] profileLevels = decoderInfo.getProfileLevels();
                int length = profileLevels.length;
                int iMax2 = 0;
                while (iMax < length) {
                    iMax2 = Math.max(avcLevelToMaxFrameSize(profileLevels[iMax].level), iMax2);
                    iMax++;
                }
                iMax = Math.max(iMax2, 345600);
            }
            maxH264DecodableFrameSize = iMax;
        }
        return maxH264DecodableFrameSize;
    }

    private static <T> void sortByScore(List<T> list, final ScoreProvider<T> scoreProvider) {
        Collections.sort(list, new Comparator() {
            @Override
            public final int compare(Object obj, Object obj2) {
                return MediaCodecUtil.lambda$sortByScore$4(scoreProvider, obj, obj2);
            }
        });
    }

    public static void warmDecoderInfoCache(String str, boolean z6, boolean z9) {
        try {
            getDecoderInfos(str, z6, z9);
        } catch (DecoderQueryException e6) {
            Log.e(TAG, "Codec warming failed", e6);
        }
    }
}
