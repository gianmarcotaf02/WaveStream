package androidx.media3.exoplayer.mediacodec;

/* JADX INFO: loaded from: classes.dex */
public final class MediaCodecInfo {
    public static final int MAX_SUPPORTED_INSTANCES_UNKNOWN = -1;
    public static final java.lang.String TAG = "MediaCodecInfo";
    public final boolean adaptive;
    public final android.media.MediaCodecInfo.CodecCapabilities capabilities;
    public final java.lang.String codecMimeType;
    public final boolean detachedSurfaceSupported;
    public final boolean hardwareAccelerated;
    private final boolean isVideo;
    private float maxFrameRate;
    private int maxFrameRateHeight;
    private int maxFrameRateWidth;
    public final java.lang.String mimeType;
    public final java.lang.String name;
    public final boolean secure;
    public final boolean softwareOnly;
    public final boolean tunneling;
    public final boolean vendor;

    public MediaCodecInfo(java.lang.String str, java.lang.String str2, java.lang.String str3, android.media.MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z6, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        str.getClass();
        this.name = str;
        this.mimeType = str2;
        this.codecMimeType = str3;
        this.capabilities = codecCapabilities;
        this.hardwareAccelerated = z6;
        this.softwareOnly = z9;
        this.vendor = z10;
        this.adaptive = z11;
        this.tunneling = z12;
        this.secure = z13;
        this.detachedSurfaceSupported = z14;
        this.isVideo = androidx.media3.common.MimeTypes.isVideo(str2);
        this.maxFrameRate = -3.4028235E38f;
        this.maxFrameRateWidth = -1;
        this.maxFrameRateHeight = -1;
    }

    private static int adjustMaxInputChannelCount(java.lang.String str, java.lang.String str2, int i3) {
        int i9;
        if (i3 > 1 || ((android.os.Build.VERSION.SDK_INT >= 26 && i3 > 0) || androidx.media3.common.MimeTypes.AUDIO_MPEG.equals(str2) || androidx.media3.common.MimeTypes.AUDIO_AMR_NB.equals(str2) || androidx.media3.common.MimeTypes.AUDIO_AMR_WB.equals(str2) || androidx.media3.common.MimeTypes.AUDIO_AAC.equals(str2) || androidx.media3.common.MimeTypes.AUDIO_VORBIS.equals(str2) || androidx.media3.common.MimeTypes.AUDIO_OPUS.equals(str2) || androidx.media3.common.MimeTypes.AUDIO_RAW.equals(str2) || androidx.media3.common.MimeTypes.AUDIO_FLAC.equals(str2) || androidx.media3.common.MimeTypes.AUDIO_ALAW.equals(str2) || androidx.media3.common.MimeTypes.AUDIO_MLAW.equals(str2) || androidx.media3.common.MimeTypes.AUDIO_MSGSM.equals(str2))) {
            return i3;
        }
        if (androidx.media3.common.MimeTypes.AUDIO_AC3.equals(str2)) {
            i9 = 6;
        } else {
            i9 = androidx.media3.common.MimeTypes.AUDIO_E_AC3.equals(str2) ? 16 : 30;
        }
        androidx.media3.common.util.Log.w(TAG, "AssumedMaxChannelAdjustment: " + str + ", [" + i3 + " to " + i9 + "]");
        return i9;
    }

    private static android.graphics.Point alignVideoSize(android.media.MediaCodecInfo.VideoCapabilities videoCapabilities, int i3, int i9) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new android.graphics.Point(androidx.media3.common.util.Util.ceilDivide(i3, widthAlignment) * widthAlignment, androidx.media3.common.util.Util.ceilDivide(i9, heightAlignment) * heightAlignment);
    }

    private static boolean areSizeAndRateSupported(android.media.MediaCodecInfo.VideoCapabilities videoCapabilities, int i3, int i9, double d4) {
        android.graphics.Point pointAlignVideoSize = alignVideoSize(videoCapabilities, i3, i9);
        int i10 = pointAlignVideoSize.x;
        int i11 = pointAlignVideoSize.y;
        if (d4 == -1.0d || d4 < 1.0d) {
            return videoCapabilities.isSizeSupported(i10, i11);
        }
        double dFloor = java.lang.Math.floor(d4);
        if (!videoCapabilities.areSizeAndRateSupported(i10, i11, dFloor)) {
            return false;
        }
        android.util.Range<java.lang.Double> achievableFrameRatesFor = videoCapabilities.getAchievableFrameRatesFor(i10, i11);
        return achievableFrameRatesFor == null || dFloor <= ((java.lang.Double) achievableFrameRatesFor.getUpper()).doubleValue();
    }

    private float computeMaxSupportedFrameRate(int i3, int i9) {
        float f9 = 1024.0f;
        if (isVideoSizeAndRateSupportedV21(i3, i9, 1024.0f)) {
            return 1024.0f;
        }
        float f10 = 0.0f;
        while (true) {
            float f11 = f9 - f10;
            if (java.lang.Math.abs(f11) <= 5.0f) {
                return f10;
            }
            float f12 = (f11 / 2.0f) + f10;
            if (isVideoSizeAndRateSupportedV21(i3, i9, f12)) {
                f10 = f12;
            } else {
                f9 = f12;
            }
        }
    }

    private static android.media.MediaCodecInfo.CodecProfileLevel[] estimateLegacyAc4ProfileLevels(android.content.Context context, android.media.MediaCodecInfo.CodecCapabilities codecCapabilities) {
        android.media.MediaCodecInfo.AudioCapabilities audioCapabilities;
        int i3 = ((codecCapabilities == null || (audioCapabilities = codecCapabilities.getAudioCapabilities()) == null) ? 2 : audioCapabilities.getMaxInputChannelCount()) > 18 ? 16 : 8;
        return androidx.media3.common.util.Util.isAutomotive(context) ? new android.media.MediaCodecInfo.CodecProfileLevel[]{androidx.media3.exoplayer.mediacodec.MediaCodecUtil.createCodecProfileLevel(androidx.media3.exoplayer.analytics.AnalyticsListener.EVENT_DRM_KEYS_REMOVED, i3)} : new android.media.MediaCodecInfo.CodecProfileLevel[]{androidx.media3.exoplayer.mediacodec.MediaCodecUtil.createCodecProfileLevel(androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_AIT, i3), androidx.media3.exoplayer.mediacodec.MediaCodecUtil.createCodecProfileLevel(513, i3), androidx.media3.exoplayer.mediacodec.MediaCodecUtil.createCodecProfileLevel(org.videolan.libvlc.interfaces.IMediaList.Event.ItemDeleted, i3), androidx.media3.exoplayer.mediacodec.MediaCodecUtil.createCodecProfileLevel(androidx.media3.exoplayer.analytics.AnalyticsListener.EVENT_DRM_KEYS_REMOVED, i3), androidx.media3.exoplayer.mediacodec.MediaCodecUtil.createCodecProfileLevel(androidx.media3.exoplayer.analytics.AnalyticsListener.EVENT_PLAYER_RELEASED, i3)};
    }

    private static android.media.MediaCodecInfo.CodecProfileLevel[] estimateLegacyVp9ProfileLevels(android.media.MediaCodecInfo.CodecCapabilities codecCapabilities) {
        int i3;
        android.media.MediaCodecInfo.VideoCapabilities videoCapabilities;
        int iIntValue = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : ((java.lang.Integer) videoCapabilities.getBitrateRange().getUpper()).intValue();
        if (iIntValue >= 180000000) {
            i3 = 1024;
        } else if (iIntValue >= 120000000) {
            i3 = 512;
        } else if (iIntValue >= 60000000) {
            i3 = 256;
        } else if (iIntValue >= 30000000) {
            i3 = 128;
        } else if (iIntValue >= 18000000) {
            i3 = 64;
        } else if (iIntValue >= 12000000) {
            i3 = 32;
        } else if (iIntValue >= 7200000) {
            i3 = 16;
        } else if (iIntValue >= 3600000) {
            i3 = 8;
        } else if (iIntValue >= 1800000) {
            i3 = 4;
        } else {
            i3 = iIntValue >= 800000 ? 2 : 1;
        }
        return new android.media.MediaCodecInfo.CodecProfileLevel[]{androidx.media3.exoplayer.mediacodec.MediaCodecUtil.createCodecProfileLevel(1, i3)};
    }

    private static boolean isAdaptive(android.media.MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    /* JADX WARN: Code duplicated, block: B:35:0x007d  */
    private boolean isCodecProfileAndLevelSupported(android.content.Context context, androidx.media3.common.Format format, boolean z6) {
        int i3 = 2;
        android.util.Pair<java.lang.Integer, java.lang.Integer> codecProfileAndLevel = androidx.media3.common.util.CodecSpecificDataUtil.getCodecProfileAndLevel(format);
        java.lang.String str = format.sampleMimeType;
        if (str != null && str.equals(androidx.media3.common.MimeTypes.VIDEO_MV_HEVC)) {
            java.lang.String strNormalizeMimeType = androidx.media3.common.MimeTypes.normalizeMimeType(this.codecMimeType);
            if (strNormalizeMimeType.equals(androidx.media3.common.MimeTypes.VIDEO_MV_HEVC)) {
                return true;
            }
            if (strNormalizeMimeType.equals(androidx.media3.common.MimeTypes.VIDEO_H265)) {
                codecProfileAndLevel = androidx.media3.exoplayer.mediacodec.MediaCodecUtil.getHevcBaseLayerCodecProfileAndLevel(format);
            }
        }
        if (codecProfileAndLevel == null) {
            return true;
        }
        int iIntValue = ((java.lang.Integer) codecProfileAndLevel.first).intValue();
        int iIntValue2 = ((java.lang.Integer) codecProfileAndLevel.second).intValue();
        if (androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION.equals(format.sampleMimeType)) {
            java.lang.String str2 = this.mimeType;
            str2.getClass();
            switch (str2) {
                case "video/avc":
                    i3 = 8;
                case "video/av01":
                case "video/hevc":
                    iIntValue2 = 0;
                    break;
                default:
                    i3 = iIntValue;
                    break;
            }
        } else {
            i3 = iIntValue;
        }
        if (!this.isVideo && !this.mimeType.equals(androidx.media3.common.MimeTypes.AUDIO_AC4) && i3 != 42) {
            return true;
        }
        android.media.MediaCodecInfo.CodecProfileLevel[] profileLevels = getProfileLevels();
        if (this.mimeType.equals(androidx.media3.common.MimeTypes.AUDIO_AC4) && profileLevels.length == 0) {
            profileLevels = estimateLegacyAc4ProfileLevels(context, this.capabilities);
        }
        for (android.media.MediaCodecInfo.CodecProfileLevel codecProfileLevel : profileLevels) {
            if (codecProfileLevel.profile == i3 && ((codecProfileLevel.level >= iIntValue2 || !z6) && !needsProfileExcludedWorkaround(this.mimeType, i3))) {
                return true;
            }
        }
        logNoSupport("codec.profileLevel, " + format.codecs + ", " + this.codecMimeType);
        return false;
    }

    private boolean isCompressedAudioBitDepthSupported(androidx.media3.common.Format format) {
        return (java.util.Objects.equals(format.sampleMimeType, androidx.media3.common.MimeTypes.AUDIO_FLAC) && format.pcmEncoding == 22 && android.os.Build.VERSION.SDK_INT < 34 && this.name.equals("c2.android.flac.decoder")) ? false : true;
    }

    private static boolean isDetachedSurfaceSupported(android.media.MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return android.os.Build.VERSION.SDK_INT >= 35 && codecCapabilities != null && codecCapabilities.isFeatureSupported("detached-surface") && !needsDetachedSurfaceUnsupportedWorkaround();
    }

    private boolean isSampleMimeTypeSupported(androidx.media3.common.Format format) {
        return this.mimeType.equals(format.sampleMimeType) || this.mimeType.equals(androidx.media3.exoplayer.mediacodec.MediaCodecUtil.getAlternativeCodecMimeType(format));
    }

    private static boolean isSecure(android.media.MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    private static boolean isTunneling(android.media.MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    private void logAssumedSupport(java.lang.String str) {
        java.lang.StringBuilder sbQ = com.google.android.gms.internal.play_billing.M0.q("AssumedSupport [", str, "] [");
        sbQ.append(this.name);
        sbQ.append(", ");
        sbQ.append(this.mimeType);
        sbQ.append("] [");
        sbQ.append(androidx.media3.common.util.Util.DEVICE_DEBUG_INFO);
        sbQ.append("]");
        androidx.media3.common.util.Log.d(TAG, sbQ.toString());
    }

    private void logNoSupport(java.lang.String str) {
        java.lang.StringBuilder sbQ = com.google.android.gms.internal.play_billing.M0.q("NoSupport [", str, "] [");
        sbQ.append(this.name);
        sbQ.append(", ");
        sbQ.append(this.mimeType);
        sbQ.append("] [");
        sbQ.append(androidx.media3.common.util.Util.DEVICE_DEBUG_INFO);
        sbQ.append("]");
        androidx.media3.common.util.Log.d(TAG, sbQ.toString());
    }

    private static boolean needsAdaptationFlushWorkaround(java.lang.String str) {
        return androidx.media3.common.MimeTypes.AUDIO_OPUS.equals(str);
    }

    private static boolean needsAdaptationReconfigureWorkaround(java.lang.String str) {
        return android.os.Build.MODEL.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str);
    }

    private static boolean needsDetachedSurfaceUnsupportedWorkaround() {
        java.lang.String str = android.os.Build.MANUFACTURER;
        return str.equals("Xiaomi") || str.equals("OPPO") || str.equals("realme") || str.equals("motorola") || str.equals("LENOVO");
    }

    private static boolean needsProfileExcludedWorkaround(java.lang.String str, int i3) {
        if (!androidx.media3.common.MimeTypes.VIDEO_H265.equals(str) || 2 != i3) {
            return false;
        }
        java.lang.String str2 = android.os.Build.DEVICE;
        return "sailfish".equals(str2) || "marlin".equals(str2);
    }

    private static boolean needsRotatedVerticalResolutionWorkaround(java.lang.String str) {
        return ("OMX.MTK.VIDEO.DECODER.HEVC".equals(str) && "mcv5a".equals(android.os.Build.DEVICE)) ? false : true;
    }

    public static androidx.media3.exoplayer.mediacodec.MediaCodecInfo newInstance(java.lang.String str, java.lang.String str2, java.lang.String str3, android.media.MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z6, boolean z9, boolean z10, boolean z11, boolean z12) {
        return new androidx.media3.exoplayer.mediacodec.MediaCodecInfo(str, str2, str3, codecCapabilities, z6, z9, z10, (z11 || codecCapabilities == null || !isAdaptive(codecCapabilities)) ? false : true, codecCapabilities != null && isTunneling(codecCapabilities), z12 || (codecCapabilities != null && isSecure(codecCapabilities)), isDetachedSurfaceSupported(codecCapabilities));
    }

    public android.graphics.Point alignVideoSizeV21(int i3, int i9) {
        android.media.MediaCodecInfo.VideoCapabilities videoCapabilities;
        android.media.MediaCodecInfo.CodecCapabilities codecCapabilities = this.capabilities;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return alignVideoSize(videoCapabilities, i3, i9);
    }

    public androidx.media3.exoplayer.DecoderReuseEvaluation canReuseCodec(androidx.media3.common.Format format, androidx.media3.common.Format format2) {
        androidx.media3.common.Format format3;
        androidx.media3.common.Format format4;
        int i3;
        int i9 = !java.util.Objects.equals(format.sampleMimeType, format2.sampleMimeType) ? 8 : 0;
        if (this.isVideo) {
            if (format.rotationDegrees != format2.rotationDegrees) {
                i9 |= 1024;
            }
            boolean z6 = (format.width == format2.width && format.height == format2.height) ? false : true;
            if (!this.adaptive && z6) {
                i9 |= 512;
            }
            if ((!androidx.media3.common.ColorInfo.isEquivalentToAssumedSdrDefault(format.colorInfo) || !androidx.media3.common.ColorInfo.isEquivalentToAssumedSdrDefault(format2.colorInfo)) && !java.util.Objects.equals(format.colorInfo, format2.colorInfo)) {
                i9 |= 2048;
            }
            if (needsAdaptationReconfigureWorkaround(this.name) && !format.initializationDataEquals(format2)) {
                i9 |= 2;
            }
            int i10 = format.decodedWidth;
            if (i10 != -1 && (i3 = format.decodedHeight) != -1 && i10 == format2.decodedWidth && i3 == format2.decodedHeight && z6) {
                i9 |= 2;
            }
            if (i9 == 0 && java.util.Objects.equals(format2.sampleMimeType, androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION)) {
                android.util.Pair<java.lang.Integer, java.lang.Integer> codecProfileAndLevel = androidx.media3.common.util.CodecSpecificDataUtil.getCodecProfileAndLevel(format);
                android.util.Pair<java.lang.Integer, java.lang.Integer> codecProfileAndLevel2 = androidx.media3.common.util.CodecSpecificDataUtil.getCodecProfileAndLevel(format2);
                if (codecProfileAndLevel == null || codecProfileAndLevel2 == null || !((java.lang.Integer) codecProfileAndLevel.first).equals(codecProfileAndLevel2.first)) {
                    i9 |= 2;
                }
            }
            if (i9 == 0) {
                return new androidx.media3.exoplayer.DecoderReuseEvaluation(this.name, format, format2, format.initializationDataEquals(format2) ? 3 : 2, 0);
            }
            format3 = format;
            format4 = format2;
        } else {
            format3 = format;
            format4 = format2;
            if (format3.channelCount != format4.channelCount) {
                i9 |= 4096;
            }
            if (format3.sampleRate != format4.sampleRate) {
                i9 |= 8192;
            }
            if (format3.pcmEncoding != format4.pcmEncoding) {
                i9 |= 16384;
            }
            if (i9 == 0 && (this.mimeType.equals(androidx.media3.common.MimeTypes.AUDIO_AAC) || this.mimeType.equals(androidx.media3.common.MimeTypes.AUDIO_AC4))) {
                android.util.Pair<java.lang.Integer, java.lang.Integer> codecProfileAndLevel3 = androidx.media3.common.util.CodecSpecificDataUtil.getCodecProfileAndLevel(format3);
                android.util.Pair<java.lang.Integer, java.lang.Integer> codecProfileAndLevel4 = androidx.media3.common.util.CodecSpecificDataUtil.getCodecProfileAndLevel(format4);
                if (codecProfileAndLevel3 != null && codecProfileAndLevel4 != null) {
                    int iIntValue = ((java.lang.Integer) codecProfileAndLevel3.first).intValue();
                    int iIntValue2 = ((java.lang.Integer) codecProfileAndLevel4.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new androidx.media3.exoplayer.DecoderReuseEvaluation(this.name, format3, format4, 3, 0);
                    }
                    if (this.mimeType.equals(androidx.media3.common.MimeTypes.AUDIO_AC4) && codecProfileAndLevel3.equals(codecProfileAndLevel4)) {
                        return new androidx.media3.exoplayer.DecoderReuseEvaluation(this.name, format3, format4, 3, 0);
                    }
                }
            }
            if (i9 == 0 && (this.mimeType.equals(androidx.media3.common.MimeTypes.AUDIO_E_AC3_JOC) || this.mimeType.equals(androidx.media3.common.MimeTypes.AUDIO_E_AC3))) {
                return new androidx.media3.exoplayer.DecoderReuseEvaluation(this.name, format3, format4, 3, 0);
            }
            if (!format3.initializationDataEquals(format4)) {
                i9 |= 32;
            }
            if (needsAdaptationFlushWorkaround(this.mimeType)) {
                i9 |= 2;
            }
            if (i9 == 0) {
                return new androidx.media3.exoplayer.DecoderReuseEvaluation(this.name, format3, format4, 1, 0);
            }
        }
        return new androidx.media3.exoplayer.DecoderReuseEvaluation(this.name, format3, format4, 0, i9);
    }

    public float getMaxSupportedFrameRate(int i3, int i9) {
        if (!this.isVideo) {
            return -3.4028235E38f;
        }
        float f9 = this.maxFrameRate;
        if (f9 != -3.4028235E38f && this.maxFrameRateWidth == i3 && this.maxFrameRateHeight == i9) {
            return f9;
        }
        float fComputeMaxSupportedFrameRate = computeMaxSupportedFrameRate(i3, i9);
        this.maxFrameRate = fComputeMaxSupportedFrameRate;
        this.maxFrameRateWidth = i3;
        this.maxFrameRateHeight = i9;
        return fComputeMaxSupportedFrameRate;
    }

    public int getMaxSupportedInstances() {
        android.media.MediaCodecInfo.CodecCapabilities codecCapabilities = this.capabilities;
        if (codecCapabilities == null) {
            return -1;
        }
        return codecCapabilities.getMaxSupportedInstances();
    }

    public android.media.MediaCodecInfo.CodecProfileLevel[] getProfileLevels() {
        android.media.MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        android.media.MediaCodecInfo.CodecCapabilities codecCapabilities = this.capabilities;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new android.media.MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    public boolean isAudioChannelCountSupportedV21(int i3) {
        android.media.MediaCodecInfo.CodecCapabilities codecCapabilities = this.capabilities;
        if (codecCapabilities == null) {
            logNoSupport("channelCount.caps");
            return false;
        }
        android.media.MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            logNoSupport("channelCount.aCaps");
            return false;
        }
        if (adjustMaxInputChannelCount(this.name, this.mimeType, audioCapabilities.getMaxInputChannelCount()) >= i3) {
            return true;
        }
        logNoSupport(com.google.android.gms.internal.play_billing.M0.l(i3, "channelCount.support, "));
        return false;
    }

    public boolean isAudioSampleRateSupportedV21(int i3) {
        android.media.MediaCodecInfo.CodecCapabilities codecCapabilities = this.capabilities;
        if (codecCapabilities == null) {
            logNoSupport("sampleRate.caps");
            return false;
        }
        android.media.MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            logNoSupport("sampleRate.aCaps");
            return false;
        }
        if (audioCapabilities.isSampleRateSupported(i3)) {
            return true;
        }
        logNoSupport(com.google.android.gms.internal.play_billing.M0.l(i3, "sampleRate.support, "));
        return false;
    }

    public boolean isFormatFunctionallySupported(android.content.Context context, androidx.media3.common.Format format) {
        return isSampleMimeTypeSupported(format) && isCodecProfileAndLevelSupported(context, format, false) && isCompressedAudioBitDepthSupported(format);
    }

    public boolean isFormatSupported(android.content.Context context, androidx.media3.common.Format format) {
        int i3;
        int i9;
        if (!isSampleMimeTypeSupported(format) || !isCodecProfileAndLevelSupported(context, format, true) || !isCompressedAudioBitDepthSupported(format)) {
            return false;
        }
        if (!this.isVideo) {
            int i10 = format.sampleRate;
            return (i10 == -1 || isAudioSampleRateSupportedV21(i10)) && ((i3 = format.channelCount) == -1 || isAudioChannelCountSupportedV21(i3));
        }
        int i11 = format.width;
        if (i11 <= 0 || (i9 = format.height) <= 0) {
            return true;
        }
        return isVideoSizeAndRateSupportedV21(i11, i9, format.frameRate);
    }

    public boolean isHdr10PlusOutOfBandMetadataSupported() {
        if (android.os.Build.VERSION.SDK_INT >= 29 && androidx.media3.common.MimeTypes.VIDEO_VP9.equals(this.mimeType)) {
            for (android.media.MediaCodecInfo.CodecProfileLevel codecProfileLevel : getProfileLevels()) {
                if (codecProfileLevel.profile == 16384) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isSeamlessAdaptationSupported(androidx.media3.common.Format format) {
        if (this.isVideo) {
            return this.adaptive;
        }
        android.util.Pair<java.lang.Integer, java.lang.Integer> codecProfileAndLevel = androidx.media3.common.util.CodecSpecificDataUtil.getCodecProfileAndLevel(format);
        return codecProfileAndLevel != null && ((java.lang.Integer) codecProfileAndLevel.first).intValue() == 42;
    }

    public boolean isVideoSizeAndRateSupportedV21(int i3, int i9, double d4) {
        android.media.MediaCodecInfo.CodecCapabilities codecCapabilities = this.capabilities;
        if (codecCapabilities == null) {
            logNoSupport("sizeAndRate.caps");
            return false;
        }
        android.media.MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            logNoSupport("sizeAndRate.vCaps");
            return false;
        }
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            int iAreResolutionAndFrameRateCovered = androidx.media3.exoplayer.mediacodec.MediaCodecPerformancePointCoverageProvider.areResolutionAndFrameRateCovered(videoCapabilities, i3, i9, d4);
            if (iAreResolutionAndFrameRateCovered == 2) {
                return true;
            }
            if (iAreResolutionAndFrameRateCovered == 1) {
                java.lang.StringBuilder sbS = p121o0.p.s(i3, i9, "sizeAndRate.cover, ", "x", "@");
                sbS.append(d4);
                logNoSupport(sbS.toString());
                return false;
            }
        }
        if (!areSizeAndRateSupported(videoCapabilities, i3, i9, d4)) {
            if (i3 >= i9 || !needsRotatedVerticalResolutionWorkaround(this.name) || !areSizeAndRateSupported(videoCapabilities, i9, i3, d4)) {
                java.lang.StringBuilder sbS2 = p121o0.p.s(i3, i9, "sizeAndRate.support, ", "x", "@");
                sbS2.append(d4);
                logNoSupport(sbS2.toString());
                return false;
            }
            java.lang.StringBuilder sbS3 = p121o0.p.s(i3, i9, "sizeAndRate.rotated, ", "x", "@");
            sbS3.append(d4);
            logAssumedSupport(sbS3.toString());
        }
        return true;
    }

    public java.lang.String toString() {
        return this.name;
    }
}
