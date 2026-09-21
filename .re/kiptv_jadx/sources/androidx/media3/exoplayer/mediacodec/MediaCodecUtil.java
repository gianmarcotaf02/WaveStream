package androidx.media3.exoplayer.mediacodec;

/* JADX INFO: loaded from: classes.dex */
public final class MediaCodecUtil {
    private static final java.lang.String TAG = "MediaCodecUtil";
    private static final java.util.HashMap<androidx.media3.exoplayer.mediacodec.MediaCodecUtil.CodecKey, java.util.List<androidx.media3.exoplayer.mediacodec.MediaCodecInfo>> decoderInfosCache = new java.util.HashMap<>();
    private static int maxH264DecodableFrameSize = -1;

    public static final class CodecKey {
        public final java.lang.String mimeType;
        public final boolean secure;
        public final boolean tunneling;

        public CodecKey(java.lang.String str, boolean z6, boolean z9) {
            this.mimeType = str;
            this.secure = z6;
            this.tunneling = z9;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && obj.getClass() == androidx.media3.exoplayer.mediacodec.MediaCodecUtil.CodecKey.class) {
                androidx.media3.exoplayer.mediacodec.MediaCodecUtil.CodecKey codecKey = (androidx.media3.exoplayer.mediacodec.MediaCodecUtil.CodecKey) obj;
                if (android.text.TextUtils.equals(this.mimeType, codecKey.mimeType) && this.secure == codecKey.secure && this.tunneling == codecKey.tunneling) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return ((B2.a.a(31, 31, this.mimeType) + (this.secure ? 1231 : 1237)) * 31) + (this.tunneling ? 1231 : 1237);
        }
    }

    public static class DecoderQueryException extends java.lang.Exception {
        private DecoderQueryException(java.lang.Throwable th) {
            super("Failed to query underlying media codecs", th);
        }
    }

    public interface MediaCodecListCompat {
        int getCodecCount();

        android.media.MediaCodecInfo getCodecInfoAt(int i3);

        boolean isFeatureRequired(java.lang.String str, java.lang.String str2, android.media.MediaCodecInfo.CodecCapabilities codecCapabilities);

        boolean isFeatureSupported(java.lang.String str, java.lang.String str2, android.media.MediaCodecInfo.CodecCapabilities codecCapabilities);

        boolean secureDecodersExplicit();
    }

    public static final class MediaCodecListCompatV16 implements androidx.media3.exoplayer.mediacodec.MediaCodecUtil.MediaCodecListCompat {
        private MediaCodecListCompatV16() {
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public int getCodecCount() {
            return android.media.MediaCodecList.getCodecCount();
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public android.media.MediaCodecInfo getCodecInfoAt(int i3) {
            return android.media.MediaCodecList.getCodecInfoAt(i3);
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public boolean isFeatureRequired(java.lang.String str, java.lang.String str2, android.media.MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return false;
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public boolean isFeatureSupported(java.lang.String str, java.lang.String str2, android.media.MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return "secure-playback".equals(str) && androidx.media3.common.MimeTypes.VIDEO_H264.equals(str2);
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public boolean secureDecodersExplicit() {
            return false;
        }
    }

    public static final class MediaCodecListCompatV21 implements androidx.media3.exoplayer.mediacodec.MediaCodecUtil.MediaCodecListCompat {
        private final int codecKind;
        private android.media.MediaCodecInfo[] mediaCodecInfos;

        public MediaCodecListCompatV21(boolean z6, boolean z9, boolean z10) {
            this.codecKind = (z6 || z9 || z10) ? 1 : 0;
        }

        @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"mediaCodecInfos"})
        private void ensureMediaCodecInfosInitialized() {
            if (this.mediaCodecInfos == null) {
                this.mediaCodecInfos = new android.media.MediaCodecList(this.codecKind).getCodecInfos();
            }
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public int getCodecCount() {
            ensureMediaCodecInfosInitialized();
            return this.mediaCodecInfos.length;
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public android.media.MediaCodecInfo getCodecInfoAt(int i3) {
            ensureMediaCodecInfosInitialized();
            return this.mediaCodecInfos[i3];
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public boolean isFeatureRequired(java.lang.String str, java.lang.String str2, android.media.MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureRequired(str);
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public boolean isFeatureSupported(java.lang.String str, java.lang.String str2, android.media.MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported(str);
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public boolean secureDecodersExplicit() {
            return true;
        }
    }

    public interface ScoreProvider<T> {
        int getScore(T t9);
    }

    private MediaCodecUtil() {
    }

    private static void applyWorkarounds(java.lang.String str, java.util.List<androidx.media3.exoplayer.mediacodec.MediaCodecInfo> list) {
        if (androidx.media3.common.MimeTypes.AUDIO_RAW.equals(str)) {
            if (android.os.Build.VERSION.SDK_INT < 26 && android.os.Build.DEVICE.equals("R9") && list.size() == 1 && list.get(0).name.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                list.add(androidx.media3.exoplayer.mediacodec.MediaCodecInfo.newInstance("OMX.google.raw.decoder", androidx.media3.common.MimeTypes.AUDIO_RAW, androidx.media3.common.MimeTypes.AUDIO_RAW, null, false, true, false, false, false));
            }
            sortByScore(list, new androidx.media3.exoplayer.mediacodec.e(1));
        }
        if (android.os.Build.VERSION.SDK_INT >= 32 || list.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(list.get(0).name)) {
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

    public static java.lang.String getAlternativeCodecMimeType(androidx.media3.common.Format format) {
        android.util.Pair<java.lang.Integer, java.lang.Integer> codecProfileAndLevel;
        if (androidx.media3.common.MimeTypes.AUDIO_E_AC3_JOC.equals(format.sampleMimeType)) {
            return androidx.media3.common.MimeTypes.AUDIO_E_AC3;
        }
        if (androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION.equals(format.sampleMimeType) && (codecProfileAndLevel = androidx.media3.common.util.CodecSpecificDataUtil.getCodecProfileAndLevel(format)) != null) {
            int iIntValue = ((java.lang.Integer) codecProfileAndLevel.first).intValue();
            if (iIntValue == 16 || iIntValue == 256) {
                return androidx.media3.common.MimeTypes.VIDEO_H265;
            }
            if (iIntValue == 512) {
                return androidx.media3.common.MimeTypes.VIDEO_H264;
            }
            if (iIntValue == 1024) {
                androidx.media3.common.ColorInfo colorInfo = format.colorInfo;
                if (colorInfo != null && colorInfo.colorTransfer == 6 && colorInfo.colorRange == 1) {
                    return null;
                }
                return androidx.media3.common.MimeTypes.VIDEO_AV1;
            }
        }
        if (androidx.media3.common.MimeTypes.VIDEO_MV_HEVC.equals(format.sampleMimeType)) {
            return androidx.media3.common.MimeTypes.VIDEO_H265;
        }
        return null;
    }

    public static java.util.List<androidx.media3.exoplayer.mediacodec.MediaCodecInfo> getAlternativeDecoderInfos(androidx.media3.exoplayer.mediacodec.MediaCodecSelector mediaCodecSelector, androidx.media3.common.Format format, boolean z6, boolean z9) {
        java.lang.String alternativeCodecMimeType = getAlternativeCodecMimeType(format);
        if (alternativeCodecMimeType != null) {
            return mediaCodecSelector.getDecoderInfos(alternativeCodecMimeType, z6, z9);
        }
        p076i4.Z z10 = p076i4.AbstractC2186b0.f22868i;
        return p076i4.S0.f22832l;
    }

    private static java.lang.String getCodecMimeType(android.media.MediaCodecInfo mediaCodecInfo, java.lang.String str, java.lang.String str2) {
        for (java.lang.String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals(androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION)) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        }
        if (str2.equals(androidx.media3.common.MimeTypes.VIDEO_MV_HEVC)) {
            if ("c2.qti.mvhevc.decoder".equals(str) || "c2.qti.mvhevc.decoder.secure".equals(str)) {
                return "video/x-mvhevc";
            }
            return null;
        }
        if (str2.equals(androidx.media3.common.MimeTypes.AUDIO_ALAC) && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals(androidx.media3.common.MimeTypes.AUDIO_FLAC) && "OMX.lge.flac.decoder".equals(str)) {
            return "audio/x-lg-flac";
        }
        if (str2.equals(androidx.media3.common.MimeTypes.AUDIO_AC3) && "OMX.lge.ac3.decoder".equals(str)) {
            return "audio/lg-ac3";
        }
        return null;
    }

    @java.lang.Deprecated
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> getCodecProfileAndLevel(androidx.media3.common.Format format) {
        return androidx.media3.common.util.CodecSpecificDataUtil.getCodecProfileAndLevel(format);
    }

    public static androidx.media3.exoplayer.mediacodec.MediaCodecInfo getDecoderInfo(java.lang.String str, boolean z6, boolean z9) {
        java.util.List<androidx.media3.exoplayer.mediacodec.MediaCodecInfo> decoderInfos = getDecoderInfos(str, z6, z9);
        if (decoderInfos.isEmpty()) {
            return null;
        }
        return decoderInfos.get(0);
    }

    public static synchronized java.util.List<androidx.media3.exoplayer.mediacodec.MediaCodecInfo> getDecoderInfos(java.lang.String str, boolean z6, boolean z9) {
        try {
            androidx.media3.exoplayer.mediacodec.MediaCodecUtil.CodecKey codecKey = new androidx.media3.exoplayer.mediacodec.MediaCodecUtil.CodecKey(str, z6, z9);
            java.util.HashMap<androidx.media3.exoplayer.mediacodec.MediaCodecUtil.CodecKey, java.util.List<androidx.media3.exoplayer.mediacodec.MediaCodecInfo>> map = decoderInfosCache;
            java.util.List<androidx.media3.exoplayer.mediacodec.MediaCodecInfo> list = map.get(codecKey);
            if (list != null) {
                return list;
            }
            java.util.ArrayList<androidx.media3.exoplayer.mediacodec.MediaCodecInfo> decoderInfosInternal = getDecoderInfosInternal(codecKey, new androidx.media3.exoplayer.mediacodec.MediaCodecUtil.MediaCodecListCompatV21(z6, z9, str.equals(androidx.media3.common.MimeTypes.VIDEO_MV_HEVC)));
            if (z6) {
                decoderInfosInternal.isEmpty();
            }
            applyWorkarounds(str, decoderInfosInternal);
            p076i4.AbstractC2186b0 abstractC2186b0U = p076i4.AbstractC2186b0.u(decoderInfosInternal);
            map.put(codecKey, abstractC2186b0U);
            return abstractC2186b0U;
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0053  */
    private static java.util.ArrayList<androidx.media3.exoplayer.mediacodec.MediaCodecInfo> getDecoderInfosInternal(androidx.media3.exoplayer.mediacodec.MediaCodecUtil.CodecKey codecKey, androidx.media3.exoplayer.mediacodec.MediaCodecUtil.MediaCodecListCompat mediaCodecListCompat) throws androidx.media3.exoplayer.mediacodec.MediaCodecUtil.DecoderQueryException {
        java.lang.String codecMimeType;
        java.lang.String str;
        int i3;
        androidx.media3.exoplayer.mediacodec.MediaCodecUtil.MediaCodecListCompat mediaCodecListCompat2 = mediaCodecListCompat;
        try {
            java.util.ArrayList<androidx.media3.exoplayer.mediacodec.MediaCodecInfo> arrayList = new java.util.ArrayList<>();
            java.lang.String str2 = codecKey.mimeType;
            int codecCount = mediaCodecListCompat2.getCodecCount();
            boolean zSecureDecodersExplicit = mediaCodecListCompat2.secureDecodersExplicit();
            int i9 = 0;
            while (i9 < codecCount) {
                android.media.MediaCodecInfo codecInfoAt = mediaCodecListCompat2.getCodecInfoAt(i9);
                if (isAlias(codecInfoAt)) {
                    i3 = i9;
                } else {
                    int i10 = i9;
                    java.lang.String name = codecInfoAt.getName();
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
                                                arrayList.add(androidx.media3.exoplayer.mediacodec.MediaCodecInfo.newInstance(name, str2, str, capabilitiesForType, zIsHardwareAccelerated, zIsSoftwareOnly, zIsVendor, false, false));
                                            }
                                            arrayList.add(androidx.media3.exoplayer.mediacodec.MediaCodecInfo.newInstance(name, str2, str, capabilitiesForType, zIsHardwareAccelerated, zIsSoftwareOnly, zIsVendor, false, false));
                                        } catch (java.lang.Exception e6) {
                                            e = e6;
                                            androidx.media3.common.util.Log.e(TAG, "Failed to query codec " + name + " (" + str + ")");
                                            throw e;
                                        }
                                        if (zSecureDecodersExplicit || codecKey.secure) {
                                            str = codecMimeType;
                                            i3 = i10;
                                            if (!zSecureDecodersExplicit && zIsFeatureSupported2) {
                                                try {
                                                    try {
                                                        arrayList.add(androidx.media3.exoplayer.mediacodec.MediaCodecInfo.newInstance(name + ".secure", str2, str, capabilitiesForType, zIsHardwareAccelerated, zIsSoftwareOnly, zIsVendor, false, true));
                                                        return arrayList;
                                                    } catch (java.lang.Exception e9) {
                                                        e = e9;
                                                        name = name;
                                                        androidx.media3.common.util.Log.e(TAG, "Failed to query codec " + name + " (" + str + ")");
                                                        throw e;
                                                    }
                                                } catch (java.lang.Exception e10) {
                                                    e = e10;
                                                }
                                            }
                                        }
                                        str = codecMimeType;
                                        i3 = i10;
                                    } catch (java.lang.Exception e11) {
                                        e = e11;
                                        str = codecMimeType;
                                    }
                                } else {
                                    i3 = i10;
                                }
                            } else {
                                i3 = i10;
                            }
                        } catch (java.lang.Exception e12) {
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
        } catch (java.lang.Exception e13) {
            throw new androidx.media3.exoplayer.mediacodec.MediaCodecUtil.DecoderQueryException(e13);
        }
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"#2.sampleMimeType"})
    public static java.util.List<androidx.media3.exoplayer.mediacodec.MediaCodecInfo> getDecoderInfosSoftMatch(androidx.media3.exoplayer.mediacodec.MediaCodecSelector mediaCodecSelector, androidx.media3.common.Format format, boolean z6, boolean z9) {
        java.util.List<androidx.media3.exoplayer.mediacodec.MediaCodecInfo> decoderInfos = mediaCodecSelector.getDecoderInfos(format.sampleMimeType, z6, z9);
        java.util.List<androidx.media3.exoplayer.mediacodec.MediaCodecInfo> alternativeDecoderInfos = getAlternativeDecoderInfos(mediaCodecSelector, format, z6, z9);
        p076i4.Y yS = p076i4.AbstractC2186b0.s();
        yS.d(decoderInfos);
        yS.d(alternativeDecoderInfos);
        return yS.f();
    }

    public static java.util.List<androidx.media3.exoplayer.mediacodec.MediaCodecInfo> getDecoderInfosSortedByFormatSupport(android.content.Context context, java.util.List<androidx.media3.exoplayer.mediacodec.MediaCodecInfo> list, androidx.media3.common.Format format) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list);
        sortByScore(arrayList, new androidx.media3.exoplayer.mediacodec.f(context, format, 1));
        return arrayList;
    }

    public static java.util.List<androidx.media3.exoplayer.mediacodec.MediaCodecInfo> getDecoderInfosSortedByFullFormatSupport(android.content.Context context, java.util.List<androidx.media3.exoplayer.mediacodec.MediaCodecInfo> list, androidx.media3.common.Format format) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list);
        sortByScore(arrayList, new androidx.media3.exoplayer.mediacodec.f(context, format, 0));
        return arrayList;
    }

    public static java.util.List<androidx.media3.exoplayer.mediacodec.MediaCodecInfo> getDecoderInfosSortedBySoftwareOnly(java.util.List<androidx.media3.exoplayer.mediacodec.MediaCodecInfo> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list);
        sortByScore(arrayList, new androidx.media3.exoplayer.mediacodec.e(0));
        return p076i4.AbstractC2186b0.u(arrayList);
    }

    public static androidx.media3.exoplayer.mediacodec.MediaCodecInfo getDecryptOnlyDecoderInfo() {
        return getDecoderInfo(androidx.media3.common.MimeTypes.AUDIO_RAW, false, false);
    }

    public static android.util.Pair<java.lang.Integer, java.lang.Integer> getHevcBaseLayerCodecProfileAndLevel(androidx.media3.common.Format format) {
        java.lang.String h265BaseLayerCodecsString = androidx.media3.container.NalUnitUtil.getH265BaseLayerCodecsString(format.initializationData);
        if (h265BaseLayerCodecsString == null) {
            return null;
        }
        return androidx.media3.common.util.CodecSpecificDataUtil.getHevcProfileAndLevel(h265BaseLayerCodecsString, androidx.media3.common.util.Util.split(h265BaseLayerCodecsString.trim(), "\\."), format.colorInfo);
    }

    private static boolean isAlias(android.media.MediaCodecInfo mediaCodecInfo) {
        return android.os.Build.VERSION.SDK_INT >= 29 && isAliasV29(mediaCodecInfo);
    }

    private static boolean isAliasV29(android.media.MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isAlias();
    }

    private static boolean isCodecUsableDecoder(android.media.MediaCodecInfo mediaCodecInfo, java.lang.String str, boolean z6, java.lang.String str2) {
        if (mediaCodecInfo.isEncoder()) {
            return false;
        }
        return z6 || !str.endsWith(".secure");
    }

    private static boolean isHardwareAccelerated(android.media.MediaCodecInfo mediaCodecInfo, java.lang.String str) {
        return android.os.Build.VERSION.SDK_INT >= 29 ? isHardwareAcceleratedV29(mediaCodecInfo) : !isSoftwareOnly(mediaCodecInfo, str);
    }

    private static boolean isHardwareAcceleratedV29(android.media.MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isHardwareAccelerated();
    }

    private static boolean isSoftwareOnly(android.media.MediaCodecInfo mediaCodecInfo, java.lang.String str) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            return isSoftwareOnlyV29(mediaCodecInfo);
        }
        if (androidx.media3.common.MimeTypes.isAudio(str)) {
            return true;
        }
        java.lang.String strI0 = com.google.crypto.tink.shaded.protobuf.AbstractC1909d.i0(mediaCodecInfo.getName());
        if (strI0.startsWith("arc.")) {
            return false;
        }
        return strI0.startsWith("omx.google.") || strI0.startsWith("omx.ffmpeg.") || (strI0.startsWith("omx.sec.") && strI0.contains(".sw.")) || strI0.equals("omx.qcom.video.decoder.hevcswvdec") || strI0.startsWith("c2.android.") || strI0.startsWith("c2.google.") || !(strI0.startsWith("omx.") || strI0.startsWith("c2."));
    }

    private static boolean isSoftwareOnlyV29(android.media.MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isSoftwareOnly();
    }

    private static boolean isVendor(android.media.MediaCodecInfo mediaCodecInfo) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            return isVendorV29(mediaCodecInfo);
        }
        java.lang.String strI0 = com.google.crypto.tink.shaded.protobuf.AbstractC1909d.i0(mediaCodecInfo.getName());
        return (strI0.startsWith("omx.google.") || strI0.startsWith("c2.android.") || strI0.startsWith("c2.google.")) ? false : true;
    }

    private static boolean isVendorV29(android.media.MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isVendor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$applyWorkarounds$3(androidx.media3.exoplayer.mediacodec.MediaCodecInfo mediaCodecInfo) {
        java.lang.String str = mediaCodecInfo.name;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (android.os.Build.VERSION.SDK_INT >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$getDecoderInfosSortedByFormatSupport$0(android.content.Context context, androidx.media3.common.Format format, androidx.media3.exoplayer.mediacodec.MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isFormatFunctionallySupported(context, format) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$getDecoderInfosSortedByFullFormatSupport$1(android.content.Context context, androidx.media3.common.Format format, androidx.media3.exoplayer.mediacodec.MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isFormatSupported(context, format) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$getDecoderInfosSortedBySoftwareOnly$2(androidx.media3.exoplayer.mediacodec.MediaCodecInfo mediaCodecInfo) {
        return (mediaCodecInfo.softwareOnly ? 2 : 0) + (!mediaCodecInfo.vendor ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$sortByScore$4(androidx.media3.exoplayer.mediacodec.MediaCodecUtil.ScoreProvider scoreProvider, java.lang.Object obj, java.lang.Object obj2) {
        return scoreProvider.getScore(obj2) - scoreProvider.getScore(obj);
    }

    public static int maxH264DecodableFrameSize() {
        if (maxH264DecodableFrameSize == -1) {
            int iMax = 0;
            androidx.media3.exoplayer.mediacodec.MediaCodecInfo decoderInfo = getDecoderInfo(androidx.media3.common.MimeTypes.VIDEO_H264, false, false);
            if (decoderInfo != null) {
                android.media.MediaCodecInfo.CodecProfileLevel[] profileLevels = decoderInfo.getProfileLevels();
                int length = profileLevels.length;
                int iMax2 = 0;
                while (iMax < length) {
                    iMax2 = java.lang.Math.max(avcLevelToMaxFrameSize(profileLevels[iMax].level), iMax2);
                    iMax++;
                }
                iMax = java.lang.Math.max(iMax2, 345600);
            }
            maxH264DecodableFrameSize = iMax;
        }
        return maxH264DecodableFrameSize;
    }

    private static <T> void sortByScore(java.util.List<T> list, final androidx.media3.exoplayer.mediacodec.MediaCodecUtil.ScoreProvider<T> scoreProvider) {
        java.util.Collections.sort(list, new java.util.Comparator() { // from class: androidx.media3.exoplayer.mediacodec.g
            @Override // java.util.Comparator
            public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                return androidx.media3.exoplayer.mediacodec.MediaCodecUtil.lambda$sortByScore$4(scoreProvider, obj, obj2);
            }
        });
    }

    public static void warmDecoderInfoCache(java.lang.String str, boolean z6, boolean z9) {
        try {
            getDecoderInfos(str, z6, z9);
        } catch (androidx.media3.exoplayer.mediacodec.MediaCodecUtil.DecoderQueryException e6) {
            androidx.media3.common.util.Log.e(TAG, "Codec warming failed", e6);
        }
    }
}
