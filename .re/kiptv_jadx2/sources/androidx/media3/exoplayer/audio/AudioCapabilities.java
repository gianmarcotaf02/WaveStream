package androidx.media3.exoplayer.audio;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.util.Pair;
import android.util.SparseArray;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.audio.AudioManagerCompat;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.analytics.z;
import com.google.crypto.tink.shaded.protobuf.q0;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p076i4.AbstractC2186b0;
import p076i4.AbstractC2194f0;
import p076i4.AbstractC2214p0;
import p076i4.AbstractC2230y;
import p076i4.C2192e0;
import p076i4.C2212o0;
import p076i4.S0;
import p076i4.Y;
import p076i4.j1;

public final class AudioCapabilities {
    static final AbstractC2194f0 ALL_SURROUND_ENCODINGS_AND_MAX_CHANNELS;
    public static final AudioCapabilities DEFAULT_AUDIO_CAPABILITIES;
    private static final AbstractC2186b0 DEFAULT_EMPTY_SPATIALIZER_CHANNEL_MASKS;
    static final int DEFAULT_MAX_CHANNEL_COUNT = 10;
    static final int DEFAULT_SAMPLE_RATE_HZ = 48000;
    private static final AbstractC2186b0 DEFAULT_SPEAKER_LAYOUT_CHANNEL_MASKS;
    private static final AbstractC2186b0 EXTERNAL_SURROUND_SOUND_ENCODINGS;
    private static final String EXTERNAL_SURROUND_SOUND_KEY = "external_surround_sound_enabled";
    private static final String FORCE_EXTERNAL_SURROUND_SOUND_KEY = "use_external_surround_sound_flag";
    private final SparseArray<AudioProfile> encodingToAudioProfile;
    private final int maxChannelCount;
    private final AbstractC2186b0 spatializerChannelMasks;
    private final AbstractC2186b0 speakerLayoutChannelMasks;

    public static final class Api29 {
        private Api29() {
        }

        public static AbstractC2186b0 getDirectPlaybackSupportedEncodings(AudioAttributes audioAttributes) {
            Y yS = AbstractC2186b0.s();
            j1 it = AudioCapabilities.ALL_SURROUND_ENCODINGS_AND_MAX_CHANNELS.keySet().iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                int iIntValue = num.intValue();
                if (Build.VERSION.SDK_INT >= Util.getApiLevelThatAudioFormatIntroducedAudioEncoding(iIntValue) && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(iIntValue).setSampleRate(48000).build(), audioAttributes.getPlatformAudioAttributes())) {
                    yS.c(num);
                }
            }
            yS.c(2);
            return yS.f();
        }

        public static int getMaxSupportedChannelCountForPassthrough(int i3, int i9, AudioAttributes audioAttributes) {
            for (int i10 = 10; i10 > 0; i10--) {
                int audioTrackChannelConfig = Util.getAudioTrackChannelConfig(i10);
                if (audioTrackChannelConfig != 0 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i3).setSampleRate(i9).setChannelMask(audioTrackChannelConfig).build(), audioAttributes.getPlatformAudioAttributes())) {
                    return i10;
                }
            }
            return 0;
        }
    }

    public static final class Api33 {
        private Api33() {
        }

        public static AudioCapabilities getCapabilitiesInternalForDirectPlayback(AudioManager audioManager, AudioAttributes audioAttributes, List<Integer> list, List<Integer> list2) {
            return new AudioCapabilities(AudioCapabilities.getAudioProfiles(audioManager.getDirectProfilesForAttributes(audioAttributes.getPlatformAudioAttributes())), list, list2);
        }

        public static AudioDeviceInfo getDefaultRoutedDeviceForAttributes(AudioManager audioManager, AudioAttributes audioAttributes) {
            audioManager.getClass();
            List audioDevicesForAttributes = audioManager.getAudioDevicesForAttributes(audioAttributes.getPlatformAudioAttributes());
            if (audioDevicesForAttributes.isEmpty()) {
                return null;
            }
            return (AudioDeviceInfo) audioDevicesForAttributes.get(0);
        }
    }

    static {
        S0 s0Y = AbstractC2186b0.y(12);
        DEFAULT_SPEAKER_LAYOUT_CHANNEL_MASKS = s0Y;
        S0 s9 = S0.f22832l;
        DEFAULT_EMPTY_SPATIALIZER_CHANNEL_MASKS = s9;
        DEFAULT_AUDIO_CAPABILITIES = new AudioCapabilities(AbstractC2186b0.y(AudioProfile.DEFAULT_AUDIO_PROFILE), s0Y, s9);
        Object[] objArr = {2, 5, 6};
        AbstractC2230y.b(objArr, 3);
        EXTERNAL_SURROUND_SOUND_ENCODINGS = AbstractC2186b0.r(objArr, 3);
        C2192e0 c2192e0 = new C2192e0(4);
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
        String str = Build.MANUFACTURER;
        return str.equals("Amazon") || str.equals("Xiaomi");
    }

    public static AbstractC2186b0 getAudioProfiles(List<android.media.AudioProfile> list) {
        HashMap map = new HashMap();
        map.put(2, new HashSet(q0.f(12)));
        for (int i3 = 0; i3 < list.size(); i3++) {
            android.media.AudioProfile audioProfileE = z.e(list.get(i3));
            if (audioProfileE.getEncapsulationType() != 1) {
                int format = audioProfileE.getFormat();
                if (Util.isEncodingLinearPcm(format) || ALL_SURROUND_ENCODINGS_AND_MAX_CHANNELS.containsKey(Integer.valueOf(format))) {
                    if (map.containsKey(Integer.valueOf(format))) {
                        Set set = (Set) map.get(Integer.valueOf(format));
                        set.getClass();
                        set.addAll(q0.f(audioProfileE.getChannelMasks()));
                    } else {
                        map.put(Integer.valueOf(format), new HashSet(q0.f(audioProfileE.getChannelMasks())));
                    }
                }
            }
        }
        Y yS = AbstractC2186b0.s();
        for (Map.Entry entry : map.entrySet()) {
            yS.c(new AudioProfile(((Integer) entry.getKey()).intValue(), (Set<Integer>) entry.getValue()));
        }
        return yS.f();
    }

    @Deprecated
    public static AudioCapabilities getCapabilities(Context context) {
        return getCapabilities(context, AudioAttributes.DEFAULT, null);
    }

    public static AudioCapabilities getCapabilitiesInternal(Context context, AudioAttributes audioAttributes, AudioDeviceInfo audioDeviceInfo, List<Integer> list) {
        return getCapabilitiesInternal(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), audioAttributes, audioDeviceInfo, list);
    }

    private static int getChannelConfigForPassthrough(int i3) {
        int i9 = Build.VERSION.SDK_INT;
        if (i9 <= 28) {
            if (i3 == 7) {
                i3 = 8;
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                i3 = 6;
            }
        }
        if (i9 <= 26 && "fugu".equals(Build.DEVICE) && i3 == 1) {
            i3 = 2;
        }
        return Util.getAudioTrackChannelConfig(i3);
    }

    public static Uri getExternalSurroundSoundGlobalSettingUri() {
        if (deviceMaySetExternalSurroundSoundGlobalSetting()) {
            return Settings.Global.getUriFor(EXTERNAL_SURROUND_SOUND_KEY);
        }
        return null;
    }

    private static boolean isBluetoothConnected(AudioManager audioManager, AudioDeviceInfo audioDeviceInfo) {
        AudioDeviceInfo[] devices;
        if (audioDeviceInfo == null) {
            audioManager.getClass();
            devices = audioManager.getDevices(2);
        } else {
            devices = new AudioDeviceInfo[]{audioDeviceInfo};
        }
        for (AudioDeviceInfo audioDeviceInfo2 : devices) {
            if (DeviceTypeUtil.isBluetoothDevice(audioDeviceInfo2.getType())) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioCapabilities)) {
            return false;
        }
        AudioCapabilities audioCapabilities = (AudioCapabilities) obj;
        return Util.contentEquals(this.encodingToAudioProfile, audioCapabilities.encodingToAudioProfile) && this.maxChannelCount == audioCapabilities.maxChannelCount && Objects.equals(this.speakerLayoutChannelMasks, audioCapabilities.speakerLayoutChannelMasks) && Objects.equals(this.spatializerChannelMasks, audioCapabilities.spatializerChannelMasks);
    }

    @Deprecated
    public Pair<Integer, Integer> getEncodingAndChannelConfigForPassthrough(Format format) {
        return getEncodingAndChannelConfigForPassthrough(format, AudioAttributes.DEFAULT);
    }

    public int getMaxChannelCount() {
        return this.maxChannelCount;
    }

    public AbstractC2186b0 getSpatializerChannelMasks() {
        return this.spatializerChannelMasks;
    }

    public AbstractC2186b0 getSpeakerLayoutChannelMasks() {
        return this.speakerLayoutChannelMasks;
    }

    public int hashCode() {
        return Objects.hashCode(this.spatializerChannelMasks) + ((Objects.hashCode(this.speakerLayoutChannelMasks) + ((Util.contentHashCode(this.encodingToAudioProfile) + (this.maxChannelCount * 31)) * 31)) * 31);
    }

    @Deprecated
    public boolean isPassthroughPlaybackSupported(Format format) {
        return isPassthroughPlaybackSupported(format, AudioAttributes.DEFAULT);
    }

    public boolean supportsEncoding(int i3) {
        return Util.contains(this.encodingToAudioProfile, i3);
    }

    public String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.maxChannelCount + ", audioProfiles=" + this.encodingToAudioProfile + ", speakerLayoutChannelMasks=" + this.speakerLayoutChannelMasks + ", spatializerChannelMasks=" + this.spatializerChannelMasks + "]";
    }

    @Deprecated
    public AudioCapabilities(int[] iArr, int i3) {
        this(getAudioProfiles(iArr, i3), DEFAULT_SPEAKER_LAYOUT_CHANNEL_MASKS, DEFAULT_EMPTY_SPATIALIZER_CHANNEL_MASKS);
    }

    @Deprecated
    public static AudioCapabilities getCapabilities(Context context, AudioAttributes audioAttributes, AudioDeviceInfo audioDeviceInfo) {
        return getCapabilities(context, audioAttributes, audioDeviceInfo, DEFAULT_EMPTY_SPATIALIZER_CHANNEL_MASKS);
    }

    public Pair<Integer, Integer> getEncodingAndChannelConfigForPassthrough(Format format, AudioAttributes audioAttributes) {
        String str = format.sampleMimeType;
        str.getClass();
        int encoding = MimeTypes.getEncoding(str, format.codecs);
        if (!ALL_SURROUND_ENCODINGS_AND_MAX_CHANNELS.containsKey(Integer.valueOf(encoding))) {
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
        AudioProfile audioProfile = this.encodingToAudioProfile.get(encoding);
        audioProfile.getClass();
        int maxSupportedChannelCountForPassthrough = format.channelCount;
        if (maxSupportedChannelCountForPassthrough == -1 || encoding == 18) {
            int i3 = format.sampleRate;
            if (i3 == -1) {
                i3 = 48000;
            }
            maxSupportedChannelCountForPassthrough = audioProfile.getMaxSupportedChannelCountForPassthrough(i3, audioAttributes);
        } else if (!format.sampleMimeType.equals(MimeTypes.AUDIO_DTS_X) || Build.VERSION.SDK_INT >= 33) {
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
        return Pair.create(Integer.valueOf(encoding), Integer.valueOf(channelConfigForPassthrough));
    }

    public boolean isPassthroughPlaybackSupported(Format format, AudioAttributes audioAttributes) {
        return getEncodingAndChannelConfigForPassthrough(format, audioAttributes) != null;
    }

    public static AudioCapabilities getCapabilities(Context context, AudioAttributes audioAttributes, AudioDeviceInfo audioDeviceInfo, List<Integer> list) {
        return getCapabilitiesInternal(context, audioAttributes, audioDeviceInfo, list);
    }

    public AudioCapabilities(int[] iArr, int i3, List<Integer> list, List<Integer> list2) {
        this(getAudioProfiles(iArr, i3), list, list2);
    }

    public static AudioCapabilities getCapabilitiesInternal(Context context, Intent intent, AudioAttributes audioAttributes, AudioDeviceInfo audioDeviceInfo, List<Integer> list) {
        AbstractC2186b0 loudspeakerLayoutChannelMasks;
        AudioManager audioManager = AudioManagerCompat.getAudioManager(context);
        if (audioDeviceInfo == null) {
            audioDeviceInfo = Build.VERSION.SDK_INT >= 33 ? Api33.getDefaultRoutedDeviceForAttributes(audioManager, audioAttributes) : null;
        }
        if (audioDeviceInfo != null) {
            loudspeakerLayoutChannelMasks = SpeakerLayoutUtil.getLoudspeakerLayoutChannelMasks(audioDeviceInfo);
        } else {
            loudspeakerLayoutChannelMasks = DEFAULT_SPEAKER_LAYOUT_CHANNEL_MASKS;
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 33 && (Util.isTv(context) || Util.isAutomotive(context))) {
            return Api33.getCapabilitiesInternalForDirectPlayback(audioManager, audioAttributes, loudspeakerLayoutChannelMasks, list);
        }
        if (isBluetoothConnected(audioManager, audioDeviceInfo)) {
            return new AudioCapabilities(AbstractC2186b0.y(AudioProfile.DEFAULT_AUDIO_PROFILE), loudspeakerLayoutChannelMasks, list);
        }
        C2212o0 c2212o0 = new C2212o0(4);
        c2212o0.c(2);
        if (i3 >= 29 && (Util.isTv(context) || Util.isAutomotive(context))) {
            AbstractC2186b0 directPlaybackSupportedEncodings = Api29.getDirectPlaybackSupportedEncodings(audioAttributes);
            directPlaybackSupportedEncodings.getClass();
            c2212o0.d(directPlaybackSupportedEncodings);
            return new AudioCapabilities(getAudioProfiles(q0.H(c2212o0.g()), 10), loudspeakerLayoutChannelMasks, list);
        }
        ContentResolver contentResolver = context.getContentResolver();
        boolean z6 = Settings.Global.getInt(contentResolver, FORCE_EXTERNAL_SURROUND_SOUND_KEY, 0) == 1;
        if ((z6 || deviceMaySetExternalSurroundSoundGlobalSetting()) && Settings.Global.getInt(contentResolver, EXTERNAL_SURROUND_SOUND_KEY, 0) == 1) {
            AbstractC2186b0 abstractC2186b0 = EXTERNAL_SURROUND_SOUND_ENCODINGS;
            abstractC2186b0.getClass();
            c2212o0.d(abstractC2186b0);
        }
        if (intent != null && !z6 && intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 1) {
            int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
            if (intArrayExtra != null) {
                List listF = q0.f(intArrayExtra);
                listF.getClass();
                c2212o0.d(listF);
            }
            return new AudioCapabilities(getAudioProfiles(q0.H(c2212o0.g()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10)), loudspeakerLayoutChannelMasks, list);
        }
        return new AudioCapabilities(getAudioProfiles(q0.H(c2212o0.g()), 10), loudspeakerLayoutChannelMasks, list);
    }

    public static final class AudioProfile {
        public static final AudioProfile DEFAULT_AUDIO_PROFILE;
        private final AbstractC2214p0 channelMasks;
        public final int encoding;
        public final int maxChannelCount;

        static {
            DEFAULT_AUDIO_PROFILE = Build.VERSION.SDK_INT >= 33 ? new AudioProfile(2, getAllChannelMasksForMaxChannelCount(10)) : new AudioProfile(2, 10);
        }

        public AudioProfile(int i3, Set<Integer> set) {
            this.encoding = i3;
            AbstractC2214p0 abstractC2214p0T = AbstractC2214p0.t(set);
            this.channelMasks = abstractC2214p0T;
            j1 it = abstractC2214p0T.iterator();
            int iMax = 0;
            while (it.hasNext()) {
                iMax = Math.max(iMax, Integer.bitCount(((Integer) it.next()).intValue()));
            }
            this.maxChannelCount = iMax;
        }

        private static AbstractC2214p0 getAllChannelMasksForMaxChannelCount(int i3) {
            C2212o0 c2212o0 = new C2212o0(4);
            for (int i9 = 1; i9 <= i3; i9++) {
                c2212o0.c(Integer.valueOf(Util.getAudioTrackChannelConfig(i9)));
            }
            return c2212o0.g();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AudioProfile)) {
                return false;
            }
            AudioProfile audioProfile = (AudioProfile) obj;
            return this.encoding == audioProfile.encoding && this.maxChannelCount == audioProfile.maxChannelCount && Objects.equals(this.channelMasks, audioProfile.channelMasks);
        }

        public int getMaxSupportedChannelCountForPassthrough(int i3, AudioAttributes audioAttributes) {
            if (this.channelMasks != null) {
                return this.maxChannelCount;
            }
            if (Build.VERSION.SDK_INT >= 29) {
                return Api29.getMaxSupportedChannelCountForPassthrough(this.encoding, i3, audioAttributes);
            }
            Object obj = AudioCapabilities.ALL_SURROUND_ENCODINGS_AND_MAX_CHANNELS.get(Integer.valueOf(this.encoding));
            return ((Integer) (obj != null ? obj : 0)).intValue();
        }

        public int hashCode() {
            int i3 = ((this.encoding * 31) + this.maxChannelCount) * 31;
            AbstractC2214p0 abstractC2214p0 = this.channelMasks;
            return i3 + (abstractC2214p0 == null ? 0 : abstractC2214p0.hashCode());
        }

        public boolean supportsChannelCount(int i3) {
            if (this.channelMasks == null) {
                return i3 <= this.maxChannelCount;
            }
            int audioTrackChannelConfig = Util.getAudioTrackChannelConfig(i3);
            if (audioTrackChannelConfig == 0) {
                return false;
            }
            return this.channelMasks.contains(Integer.valueOf(audioTrackChannelConfig));
        }

        public String toString() {
            return "AudioProfile[format=" + this.encoding + ", maxChannelCount=" + this.maxChannelCount + ", channelMasks=" + this.channelMasks + "]";
        }

        public AudioProfile(int i3, int i9) {
            this.encoding = i3;
            this.maxChannelCount = i9;
            this.channelMasks = null;
        }
    }

    private AudioCapabilities(List<AudioProfile> list, List<Integer> list2, List<Integer> list3) {
        this.encodingToAudioProfile = new SparseArray<>();
        for (int i3 = 0; i3 < list.size(); i3++) {
            AudioProfile audioProfile = list.get(i3);
            this.encodingToAudioProfile.put(audioProfile.encoding, audioProfile);
        }
        int iMax = 0;
        for (int i9 = 0; i9 < this.encodingToAudioProfile.size(); i9++) {
            iMax = Math.max(iMax, this.encodingToAudioProfile.valueAt(i9).maxChannelCount);
        }
        this.maxChannelCount = iMax;
        this.speakerLayoutChannelMasks = AbstractC2186b0.u(list2);
        this.spatializerChannelMasks = AbstractC2186b0.u(list3);
    }

    private static AbstractC2186b0 getAudioProfiles(int[] iArr, int i3) {
        Y yS = AbstractC2186b0.s();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i9 : iArr) {
            yS.c(new AudioProfile(i9, i3));
        }
        return yS.f();
    }
}
