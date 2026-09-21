package androidx.media3.exoplayer.audio;

/* JADX INFO: loaded from: classes.dex */
public final class AudioCapabilities {
    static final p076i4.AbstractC2194f0 ALL_SURROUND_ENCODINGS_AND_MAX_CHANNELS;
    public static final androidx.media3.exoplayer.audio.AudioCapabilities DEFAULT_AUDIO_CAPABILITIES;
    private static final p076i4.AbstractC2186b0 DEFAULT_EMPTY_SPATIALIZER_CHANNEL_MASKS;
    static final int DEFAULT_MAX_CHANNEL_COUNT = 10;
    static final int DEFAULT_SAMPLE_RATE_HZ = 48000;
    private static final p076i4.AbstractC2186b0 DEFAULT_SPEAKER_LAYOUT_CHANNEL_MASKS;
    private static final p076i4.AbstractC2186b0 EXTERNAL_SURROUND_SOUND_ENCODINGS;
    private static final java.lang.String EXTERNAL_SURROUND_SOUND_KEY = "external_surround_sound_enabled";
    private static final java.lang.String FORCE_EXTERNAL_SURROUND_SOUND_KEY = "use_external_surround_sound_flag";
    private final android.util.SparseArray<androidx.media3.exoplayer.audio.AudioCapabilities.AudioProfile> encodingToAudioProfile;
    private final int maxChannelCount;
    private final p076i4.AbstractC2186b0 spatializerChannelMasks;
    private final p076i4.AbstractC2186b0 speakerLayoutChannelMasks;

    public static final class Api29 {
        private Api29() {
        }

        public static p076i4.AbstractC2186b0 getDirectPlaybackSupportedEncodings(androidx.media3.common.AudioAttributes audioAttributes) {
            p076i4.Y yS = p076i4.AbstractC2186b0.s();
            p076i4.j1 it = androidx.media3.exoplayer.audio.AudioCapabilities.ALL_SURROUND_ENCODINGS_AND_MAX_CHANNELS.keySet().iterator();
            while (it.hasNext()) {
                java.lang.Integer num = (java.lang.Integer) it.next();
                int iIntValue = num.intValue();
                if (android.os.Build.VERSION.SDK_INT >= androidx.media3.common.util.Util.getApiLevelThatAudioFormatIntroducedAudioEncoding(iIntValue) && android.media.AudioTrack.isDirectPlaybackSupported(new android.media.AudioFormat.Builder().setChannelMask(12).setEncoding(iIntValue).setSampleRate(48000).build(), audioAttributes.getPlatformAudioAttributes())) {
                    yS.c(num);
                }
            }
            yS.c(2);
            return yS.f();
        }

        public static int getMaxSupportedChannelCountForPassthrough(int i3, int i9, androidx.media3.common.AudioAttributes audioAttributes) {
            for (int i10 = 10; i10 > 0; i10--) {
                int audioTrackChannelConfig = androidx.media3.common.util.Util.getAudioTrackChannelConfig(i10);
                if (audioTrackChannelConfig != 0 && android.media.AudioTrack.isDirectPlaybackSupported(new android.media.AudioFormat.Builder().setEncoding(i3).setSampleRate(i9).setChannelMask(audioTrackChannelConfig).build(), audioAttributes.getPlatformAudioAttributes())) {
                    return i10;
                }
            }
            return 0;
        }
    }

    public static final class Api33 {
        private Api33() {
        }

        public static androidx.media3.exoplayer.audio.AudioCapabilities getCapabilitiesInternalForDirectPlayback(android.media.AudioManager audioManager, androidx.media3.common.AudioAttributes audioAttributes, java.util.List<java.lang.Integer> list, java.util.List<java.lang.Integer> list2) {
            return new androidx.media3.exoplayer.audio.AudioCapabilities(androidx.media3.exoplayer.audio.AudioCapabilities.getAudioProfiles(audioManager.getDirectProfilesForAttributes(audioAttributes.getPlatformAudioAttributes())), list, list2);
        }

        public static android.media.AudioDeviceInfo getDefaultRoutedDeviceForAttributes(android.media.AudioManager audioManager, androidx.media3.common.AudioAttributes audioAttributes) {
            audioManager.getClass();
            java.util.List audioDevicesForAttributes = audioManager.getAudioDevicesForAttributes(audioAttributes.getPlatformAudioAttributes());
            if (audioDevicesForAttributes.isEmpty()) {
                return null;
            }
            return (android.media.AudioDeviceInfo) audioDevicesForAttributes.get(0);
        }
    }

    static {
        p076i4.S0 s0Y = p076i4.AbstractC2186b0.y(12);
        DEFAULT_SPEAKER_LAYOUT_CHANNEL_MASKS = s0Y;
        p076i4.S0 s9 = p076i4.S0.f22832l;
        DEFAULT_EMPTY_SPATIALIZER_CHANNEL_MASKS = s9;
        DEFAULT_AUDIO_CAPABILITIES = new androidx.media3.exoplayer.audio.AudioCapabilities(p076i4.AbstractC2186b0.y(androidx.media3.exoplayer.audio.AudioCapabilities.AudioProfile.DEFAULT_AUDIO_PROFILE), s0Y, s9);
        java.lang.Object[] objArr = {2, 5, 6};
        p076i4.AbstractC2230y.b(objArr, 3);
        EXTERNAL_SURROUND_SOUND_ENCODINGS = p076i4.AbstractC2186b0.r(objArr, 3);
        p076i4.C2192e0 c2192e0 = new p076i4.C2192e0(4);
        c2192e0.c(5, 6);
        c2192e0.c(17, 6);
        c2192e0.c(7, 6);
        c2192e0.c(30, 10);
        c2192e0.c(18, 6);
        c2192e0.c(6, 8);
        c2192e0.c(8, 8);
        c2192e0.c(14, 8);
        ALL_SURROUND_ENCODINGS_AND_MAX_CHANNELS = c2192e0.a(true);
    }

    private static boolean deviceMaySetExternalSurroundSoundGlobalSetting() {
        java.lang.String str = android.os.Build.MANUFACTURER;
        return str.equals("Amazon") || str.equals("Xiaomi");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static p076i4.AbstractC2186b0 getAudioProfiles(java.util.List<android.media.AudioProfile> list) {
        java.util.HashMap map = new java.util.HashMap();
        map.put(2, new java.util.HashSet(com.google.crypto.tink.shaded.protobuf.q0.f(12)));
        for (int i3 = 0; i3 < list.size(); i3++) {
            android.media.AudioProfile audioProfileE = androidx.media3.exoplayer.analytics.z.e(list.get(i3));
            if (audioProfileE.getEncapsulationType() != 1) {
                int format = audioProfileE.getFormat();
                if (androidx.media3.common.util.Util.isEncodingLinearPcm(format) || ALL_SURROUND_ENCODINGS_AND_MAX_CHANNELS.containsKey(java.lang.Integer.valueOf(format))) {
                    if (map.containsKey(java.lang.Integer.valueOf(format))) {
                        java.util.Set set = (java.util.Set) map.get(java.lang.Integer.valueOf(format));
                        set.getClass();
                        set.addAll(com.google.crypto.tink.shaded.protobuf.q0.f(audioProfileE.getChannelMasks()));
                    } else {
                        map.put(java.lang.Integer.valueOf(format), new java.util.HashSet(com.google.crypto.tink.shaded.protobuf.q0.f(audioProfileE.getChannelMasks())));
                    }
                }
            }
        }
        p076i4.Y yS = p076i4.AbstractC2186b0.s();
        for (java.util.Map.Entry entry : map.entrySet()) {
            yS.c(new androidx.media3.exoplayer.audio.AudioCapabilities.AudioProfile(((java.lang.Integer) entry.getKey()).intValue(), (java.util.Set<java.lang.Integer>) entry.getValue()));
        }
        return yS.f();
    }

    @java.lang.Deprecated
    public static androidx.media3.exoplayer.audio.AudioCapabilities getCapabilities(android.content.Context context) {
        return getCapabilities(context, androidx.media3.common.AudioAttributes.DEFAULT, null);
    }

    public static androidx.media3.exoplayer.audio.AudioCapabilities getCapabilitiesInternal(android.content.Context context, androidx.media3.common.AudioAttributes audioAttributes, android.media.AudioDeviceInfo audioDeviceInfo, java.util.List<java.lang.Integer> list) {
        return getCapabilitiesInternal(context, context.registerReceiver(null, new android.content.IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), audioAttributes, audioDeviceInfo, list);
    }

    private static int getChannelConfigForPassthrough(int i3) {
        int i9 = android.os.Build.VERSION.SDK_INT;
        if (i9 <= 28) {
            if (i3 == 7) {
                i3 = 8;
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                i3 = 6;
            }
        }
        if (i9 <= 26 && "fugu".equals(android.os.Build.DEVICE) && i3 == 1) {
            i3 = 2;
        }
        return androidx.media3.common.util.Util.getAudioTrackChannelConfig(i3);
    }

    public static android.net.Uri getExternalSurroundSoundGlobalSettingUri() {
        if (deviceMaySetExternalSurroundSoundGlobalSetting()) {
            return android.provider.Settings.Global.getUriFor(EXTERNAL_SURROUND_SOUND_KEY);
        }
        return null;
    }

    private static boolean isBluetoothConnected(android.media.AudioManager audioManager, android.media.AudioDeviceInfo audioDeviceInfo) {
        android.media.AudioDeviceInfo[] devices;
        if (audioDeviceInfo == null) {
            audioManager.getClass();
            devices = audioManager.getDevices(2);
        } else {
            devices = new android.media.AudioDeviceInfo[]{audioDeviceInfo};
        }
        for (android.media.AudioDeviceInfo audioDeviceInfo2 : devices) {
            if (androidx.media3.exoplayer.audio.DeviceTypeUtil.isBluetoothDevice(audioDeviceInfo2.getType())) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.media3.exoplayer.audio.AudioCapabilities)) {
            return false;
        }
        androidx.media3.exoplayer.audio.AudioCapabilities audioCapabilities = (androidx.media3.exoplayer.audio.AudioCapabilities) obj;
        return androidx.media3.common.util.Util.contentEquals(this.encodingToAudioProfile, audioCapabilities.encodingToAudioProfile) && this.maxChannelCount == audioCapabilities.maxChannelCount && java.util.Objects.equals(this.speakerLayoutChannelMasks, audioCapabilities.speakerLayoutChannelMasks) && java.util.Objects.equals(this.spatializerChannelMasks, audioCapabilities.spatializerChannelMasks);
    }

    @java.lang.Deprecated
    public android.util.Pair<java.lang.Integer, java.lang.Integer> getEncodingAndChannelConfigForPassthrough(androidx.media3.common.Format format) {
        return getEncodingAndChannelConfigForPassthrough(format, androidx.media3.common.AudioAttributes.DEFAULT);
    }

    public int getMaxChannelCount() {
        return this.maxChannelCount;
    }

    public p076i4.AbstractC2186b0 getSpatializerChannelMasks() {
        return this.spatializerChannelMasks;
    }

    public p076i4.AbstractC2186b0 getSpeakerLayoutChannelMasks() {
        return this.speakerLayoutChannelMasks;
    }

    public int hashCode() {
        return java.util.Objects.hashCode(this.spatializerChannelMasks) + ((java.util.Objects.hashCode(this.speakerLayoutChannelMasks) + ((androidx.media3.common.util.Util.contentHashCode(this.encodingToAudioProfile) + (this.maxChannelCount * 31)) * 31)) * 31);
    }

    @java.lang.Deprecated
    public boolean isPassthroughPlaybackSupported(androidx.media3.common.Format format) {
        return isPassthroughPlaybackSupported(format, androidx.media3.common.AudioAttributes.DEFAULT);
    }

    public boolean supportsEncoding(int i3) {
        return androidx.media3.common.util.Util.contains(this.encodingToAudioProfile, i3);
    }

    public java.lang.String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.maxChannelCount + ", audioProfiles=" + this.encodingToAudioProfile + ", speakerLayoutChannelMasks=" + this.speakerLayoutChannelMasks + ", spatializerChannelMasks=" + this.spatializerChannelMasks + "]";
    }

    @java.lang.Deprecated
    public AudioCapabilities(int[] iArr, int i3) {
        this(getAudioProfiles(iArr, i3), DEFAULT_SPEAKER_LAYOUT_CHANNEL_MASKS, DEFAULT_EMPTY_SPATIALIZER_CHANNEL_MASKS);
    }

    @java.lang.Deprecated
    public static androidx.media3.exoplayer.audio.AudioCapabilities getCapabilities(android.content.Context context, androidx.media3.common.AudioAttributes audioAttributes, android.media.AudioDeviceInfo audioDeviceInfo) {
        return getCapabilities(context, audioAttributes, audioDeviceInfo, DEFAULT_EMPTY_SPATIALIZER_CHANNEL_MASKS);
    }

    public android.util.Pair<java.lang.Integer, java.lang.Integer> getEncodingAndChannelConfigForPassthrough(androidx.media3.common.Format format, androidx.media3.common.AudioAttributes audioAttributes) {
        java.lang.String str = format.sampleMimeType;
        str.getClass();
        int encoding = androidx.media3.common.MimeTypes.getEncoding(str, format.codecs);
        if (!ALL_SURROUND_ENCODINGS_AND_MAX_CHANNELS.containsKey(java.lang.Integer.valueOf(encoding))) {
            return null;
        }
        if (encoding == 18 && !supportsEncoding(18)) {
            encoding = 6;
        } else if ((encoding == 8 && !supportsEncoding(8)) || (encoding == 30 && !supportsEncoding(30))) {
            encoding = 7;
        }
        if (!supportsEncoding(encoding)) {
            return null;
        }
        androidx.media3.exoplayer.audio.AudioCapabilities.AudioProfile audioProfile = this.encodingToAudioProfile.get(encoding);
        audioProfile.getClass();
        int maxSupportedChannelCountForPassthrough = format.channelCount;
        if (maxSupportedChannelCountForPassthrough == -1 || encoding == 18) {
            int i3 = format.sampleRate;
            if (i3 == -1) {
                i3 = 48000;
            }
            maxSupportedChannelCountForPassthrough = audioProfile.getMaxSupportedChannelCountForPassthrough(i3, audioAttributes);
        } else if (!format.sampleMimeType.equals(androidx.media3.common.MimeTypes.AUDIO_DTS_X) || android.os.Build.VERSION.SDK_INT >= 33) {
            if (!audioProfile.supportsChannelCount(maxSupportedChannelCountForPassthrough)) {
                return null;
            }
        } else if (maxSupportedChannelCountForPassthrough > 10) {
            return null;
        }
        int channelConfigForPassthrough = getChannelConfigForPassthrough(maxSupportedChannelCountForPassthrough);
        if (channelConfigForPassthrough == 0) {
            return null;
        }
        return android.util.Pair.create(java.lang.Integer.valueOf(encoding), java.lang.Integer.valueOf(channelConfigForPassthrough));
    }

    public boolean isPassthroughPlaybackSupported(androidx.media3.common.Format format, androidx.media3.common.AudioAttributes audioAttributes) {
        return getEncodingAndChannelConfigForPassthrough(format, audioAttributes) != null;
    }

    public static androidx.media3.exoplayer.audio.AudioCapabilities getCapabilities(android.content.Context context, androidx.media3.common.AudioAttributes audioAttributes, android.media.AudioDeviceInfo audioDeviceInfo, java.util.List<java.lang.Integer> list) {
        return getCapabilitiesInternal(context, audioAttributes, audioDeviceInfo, list);
    }

    public AudioCapabilities(int[] iArr, int i3, java.util.List<java.lang.Integer> list, java.util.List<java.lang.Integer> list2) {
        this(getAudioProfiles(iArr, i3), list, list2);
    }

    public static androidx.media3.exoplayer.audio.AudioCapabilities getCapabilitiesInternal(android.content.Context context, android.content.Intent intent, androidx.media3.common.AudioAttributes audioAttributes, android.media.AudioDeviceInfo audioDeviceInfo, java.util.List<java.lang.Integer> list) {
        p076i4.AbstractC2186b0 loudspeakerLayoutChannelMasks;
        android.media.AudioManager audioManager = androidx.media3.common.audio.AudioManagerCompat.getAudioManager(context);
        if (audioDeviceInfo == null) {
            audioDeviceInfo = android.os.Build.VERSION.SDK_INT >= 33 ? androidx.media3.exoplayer.audio.AudioCapabilities.Api33.getDefaultRoutedDeviceForAttributes(audioManager, audioAttributes) : null;
        }
        if (audioDeviceInfo != null) {
            loudspeakerLayoutChannelMasks = androidx.media3.exoplayer.audio.SpeakerLayoutUtil.getLoudspeakerLayoutChannelMasks(audioDeviceInfo);
        } else {
            loudspeakerLayoutChannelMasks = DEFAULT_SPEAKER_LAYOUT_CHANNEL_MASKS;
        }
        int i3 = android.os.Build.VERSION.SDK_INT;
        if (i3 >= 33 && (androidx.media3.common.util.Util.isTv(context) || androidx.media3.common.util.Util.isAutomotive(context))) {
            return androidx.media3.exoplayer.audio.AudioCapabilities.Api33.getCapabilitiesInternalForDirectPlayback(audioManager, audioAttributes, loudspeakerLayoutChannelMasks, list);
        }
        if (isBluetoothConnected(audioManager, audioDeviceInfo)) {
            return new androidx.media3.exoplayer.audio.AudioCapabilities(p076i4.AbstractC2186b0.y(androidx.media3.exoplayer.audio.AudioCapabilities.AudioProfile.DEFAULT_AUDIO_PROFILE), loudspeakerLayoutChannelMasks, list);
        }
        p076i4.C2212o0 c2212o0 = new p076i4.C2212o0(4);
        c2212o0.c(2);
        if (i3 >= 29 && (androidx.media3.common.util.Util.isTv(context) || androidx.media3.common.util.Util.isAutomotive(context))) {
            p076i4.AbstractC2186b0 directPlaybackSupportedEncodings = androidx.media3.exoplayer.audio.AudioCapabilities.Api29.getDirectPlaybackSupportedEncodings(audioAttributes);
            directPlaybackSupportedEncodings.getClass();
            c2212o0.d(directPlaybackSupportedEncodings);
            return new androidx.media3.exoplayer.audio.AudioCapabilities(getAudioProfiles(com.google.crypto.tink.shaded.protobuf.q0.H(c2212o0.g()), 10), loudspeakerLayoutChannelMasks, list);
        }
        android.content.ContentResolver contentResolver = context.getContentResolver();
        boolean z6 = android.provider.Settings.Global.getInt(contentResolver, FORCE_EXTERNAL_SURROUND_SOUND_KEY, 0) == 1;
        if ((z6 || deviceMaySetExternalSurroundSoundGlobalSetting()) && android.provider.Settings.Global.getInt(contentResolver, EXTERNAL_SURROUND_SOUND_KEY, 0) == 1) {
            p076i4.AbstractC2186b0 abstractC2186b0 = EXTERNAL_SURROUND_SOUND_ENCODINGS;
            abstractC2186b0.getClass();
            c2212o0.d(abstractC2186b0);
        }
        if (intent != null && !z6 && intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 1) {
            int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
            if (intArrayExtra != null) {
                java.util.List listF = com.google.crypto.tink.shaded.protobuf.q0.f(intArrayExtra);
                listF.getClass();
                c2212o0.d(listF);
            }
            return new androidx.media3.exoplayer.audio.AudioCapabilities(getAudioProfiles(com.google.crypto.tink.shaded.protobuf.q0.H(c2212o0.g()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10)), loudspeakerLayoutChannelMasks, list);
        }
        return new androidx.media3.exoplayer.audio.AudioCapabilities(getAudioProfiles(com.google.crypto.tink.shaded.protobuf.q0.H(c2212o0.g()), 10), loudspeakerLayoutChannelMasks, list);
    }

    public static final class AudioProfile {
        public static final androidx.media3.exoplayer.audio.AudioCapabilities.AudioProfile DEFAULT_AUDIO_PROFILE;
        private final p076i4.AbstractC2214p0 channelMasks;
        public final int encoding;
        public final int maxChannelCount;

        static {
            DEFAULT_AUDIO_PROFILE = android.os.Build.VERSION.SDK_INT >= 33 ? new androidx.media3.exoplayer.audio.AudioCapabilities.AudioProfile(2, getAllChannelMasksForMaxChannelCount(10)) : new androidx.media3.exoplayer.audio.AudioCapabilities.AudioProfile(2, 10);
        }

        public AudioProfile(int i3, java.util.Set<java.lang.Integer> set) {
            this.encoding = i3;
            p076i4.AbstractC2214p0 abstractC2214p0T = p076i4.AbstractC2214p0.t(set);
            this.channelMasks = abstractC2214p0T;
            p076i4.j1 it = abstractC2214p0T.iterator();
            int iMax = 0;
            while (it.hasNext()) {
                iMax = java.lang.Math.max(iMax, java.lang.Integer.bitCount(((java.lang.Integer) it.next()).intValue()));
            }
            this.maxChannelCount = iMax;
        }

        private static p076i4.AbstractC2214p0 getAllChannelMasksForMaxChannelCount(int i3) {
            p076i4.C2212o0 c2212o0 = new p076i4.C2212o0(4);
            for (int i9 = 1; i9 <= i3; i9++) {
                c2212o0.c(java.lang.Integer.valueOf(androidx.media3.common.util.Util.getAudioTrackChannelConfig(i9)));
            }
            return c2212o0.g();
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof androidx.media3.exoplayer.audio.AudioCapabilities.AudioProfile)) {
                return false;
            }
            androidx.media3.exoplayer.audio.AudioCapabilities.AudioProfile audioProfile = (androidx.media3.exoplayer.audio.AudioCapabilities.AudioProfile) obj;
            return this.encoding == audioProfile.encoding && this.maxChannelCount == audioProfile.maxChannelCount && java.util.Objects.equals(this.channelMasks, audioProfile.channelMasks);
        }

        public int getMaxSupportedChannelCountForPassthrough(int i3, androidx.media3.common.AudioAttributes audioAttributes) {
            if (this.channelMasks != null) {
                return this.maxChannelCount;
            }
            if (android.os.Build.VERSION.SDK_INT >= 29) {
                return androidx.media3.exoplayer.audio.AudioCapabilities.Api29.getMaxSupportedChannelCountForPassthrough(this.encoding, i3, audioAttributes);
            }
            java.lang.Object obj = androidx.media3.exoplayer.audio.AudioCapabilities.ALL_SURROUND_ENCODINGS_AND_MAX_CHANNELS.get(java.lang.Integer.valueOf(this.encoding));
            return ((java.lang.Integer) (obj != null ? obj : 0)).intValue();
        }

        public int hashCode() {
            int i3 = ((this.encoding * 31) + this.maxChannelCount) * 31;
            p076i4.AbstractC2214p0 abstractC2214p0 = this.channelMasks;
            return i3 + (abstractC2214p0 == null ? 0 : abstractC2214p0.hashCode());
        }

        public boolean supportsChannelCount(int i3) {
            if (this.channelMasks == null) {
                return i3 <= this.maxChannelCount;
            }
            int audioTrackChannelConfig = androidx.media3.common.util.Util.getAudioTrackChannelConfig(i3);
            if (audioTrackChannelConfig == 0) {
                return false;
            }
            return this.channelMasks.contains(java.lang.Integer.valueOf(audioTrackChannelConfig));
        }

        public java.lang.String toString() {
            return "AudioProfile[format=" + this.encoding + ", maxChannelCount=" + this.maxChannelCount + ", channelMasks=" + this.channelMasks + "]";
        }

        public AudioProfile(int i3, int i9) {
            this.encoding = i3;
            this.maxChannelCount = i9;
            this.channelMasks = null;
        }
    }

    private AudioCapabilities(java.util.List<androidx.media3.exoplayer.audio.AudioCapabilities.AudioProfile> list, java.util.List<java.lang.Integer> list2, java.util.List<java.lang.Integer> list3) {
        this.encodingToAudioProfile = new android.util.SparseArray<>();
        for (int i3 = 0; i3 < list.size(); i3++) {
            androidx.media3.exoplayer.audio.AudioCapabilities.AudioProfile audioProfile = list.get(i3);
            this.encodingToAudioProfile.put(audioProfile.encoding, audioProfile);
        }
        int iMax = 0;
        for (int i9 = 0; i9 < this.encodingToAudioProfile.size(); i9++) {
            iMax = java.lang.Math.max(iMax, this.encodingToAudioProfile.valueAt(i9).maxChannelCount);
        }
        this.maxChannelCount = iMax;
        this.speakerLayoutChannelMasks = p076i4.AbstractC2186b0.u(list2);
        this.spatializerChannelMasks = p076i4.AbstractC2186b0.u(list3);
    }

    private static p076i4.AbstractC2186b0 getAudioProfiles(int[] iArr, int i3) {
        p076i4.Y yS = p076i4.AbstractC2186b0.s();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i9 : iArr) {
            yS.c(new androidx.media3.exoplayer.audio.AudioCapabilities.AudioProfile(i9, i3));
        }
        return yS.f();
    }
}
