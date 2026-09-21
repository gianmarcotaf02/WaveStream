package androidx.media3.exoplayer.audio;

/* JADX INFO: loaded from: classes.dex */
final class SpeakerLayoutUtil {
    private static final p076i4.AbstractC2186b0 DEFAULT_CHANNEL_MASK = p076i4.AbstractC2186b0.y(12);
    private static final java.lang.String TAG = "SpeakerLayoutUtil";

    private SpeakerLayoutUtil() {
    }

    private static p076i4.AbstractC2186b0 getChannelMasksForBluetooth() {
        return DEFAULT_CHANNEL_MASK;
    }

    private static p076i4.AbstractC2186b0 getChannelMasksForBuiltInSpeakers(android.media.AudioDeviceInfo audioDeviceInfo) {
        int speakerLayoutChannelMask;
        if (android.os.Build.VERSION.SDK_INT >= 36 && (speakerLayoutChannelMask = audioDeviceInfo.getSpeakerLayoutChannelMask()) != 0 && speakerLayoutChannelMask != 1) {
            return p076i4.AbstractC2186b0.y(java.lang.Integer.valueOf(speakerLayoutChannelMask));
        }
        androidx.media3.common.util.Log.w(TAG, "Built-in speaker's getSpeakerLayoutChannelMask not usable, defaulting to stereo.");
        return DEFAULT_CHANNEL_MASK;
    }

    private static p076i4.AbstractC2186b0 getChannelMasksForHdmiArc(android.media.AudioDeviceInfo audioDeviceInfo) {
        p076i4.AbstractC2186b0 channelMasksFromPcmAudioProfiles = getChannelMasksFromPcmAudioProfiles(audioDeviceInfo);
        if (!channelMasksFromPcmAudioProfiles.isEmpty()) {
            return channelMasksFromPcmAudioProfiles;
        }
        p076i4.AbstractC2186b0 allLpcmChannelMasksFromPcmSads = androidx.media3.exoplayer.audio.AudioDescriptorUtil.getAllLpcmChannelMasksFromPcmSads(audioDeviceInfo.getAudioDescriptors());
        return !allLpcmChannelMasksFromPcmSads.isEmpty() ? allLpcmChannelMasksFromPcmSads : DEFAULT_CHANNEL_MASK;
    }

    private static p076i4.AbstractC2186b0 getChannelMasksForHdmiEarc(android.media.AudioDeviceInfo audioDeviceInfo) {
        p076i4.AbstractC2186b0 channelMasksFromPcmAudioProfiles = getChannelMasksFromPcmAudioProfiles(audioDeviceInfo);
        if (!channelMasksFromPcmAudioProfiles.isEmpty()) {
            return channelMasksFromPcmAudioProfiles;
        }
        java.util.List audioDescriptors = audioDeviceInfo.getAudioDescriptors();
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            p076i4.AbstractC2186b0 allChannelMasksFromSadbs = androidx.media3.exoplayer.audio.AudioDescriptorUtil.getAllChannelMasksFromSadbs(audioDescriptors);
            if (!allChannelMasksFromSadbs.isEmpty()) {
                return allChannelMasksFromSadbs;
            }
        }
        p076i4.AbstractC2186b0 allLpcmChannelMasksFromPcmSads = androidx.media3.exoplayer.audio.AudioDescriptorUtil.getAllLpcmChannelMasksFromPcmSads(audioDescriptors);
        return !allLpcmChannelMasksFromPcmSads.isEmpty() ? allLpcmChannelMasksFromPcmSads : DEFAULT_CHANNEL_MASK;
    }

    private static p076i4.AbstractC2186b0 getChannelMasksForUsb(android.media.AudioDeviceInfo audioDeviceInfo) {
        p076i4.AbstractC2186b0 channelMasksFromPcmAudioProfiles = getChannelMasksFromPcmAudioProfiles(audioDeviceInfo);
        return !channelMasksFromPcmAudioProfiles.isEmpty() ? channelMasksFromPcmAudioProfiles : DEFAULT_CHANNEL_MASK;
    }

    private static p076i4.AbstractC2186b0 getChannelMasksFromPcmAudioProfiles(android.media.AudioDeviceInfo audioDeviceInfo) {
        java.util.List audioProfiles = audioDeviceInfo.getAudioProfiles();
        java.util.TreeSet treeSet = new java.util.TreeSet(java.util.Comparator.comparing(new androidx.media3.exoplayer.audio.c()).reversed());
        java.util.Iterator it = audioProfiles.iterator();
        while (it.hasNext()) {
            android.media.AudioProfile audioProfileE = androidx.media3.exoplayer.analytics.z.e(it.next());
            if (audioProfileE.getEncapsulationType() != 1 && androidx.media3.common.util.Util.isEncodingLinearPcm(audioProfileE.getFormat())) {
                for (int i3 : audioProfileE.getChannelMasks()) {
                    treeSet.add(java.lang.Integer.valueOf(i3));
                }
            }
        }
        return p076i4.AbstractC2186b0.u(treeSet);
    }

    public static p076i4.AbstractC2186b0 getLoudspeakerLayoutChannelMasks(android.media.AudioDeviceInfo audioDeviceInfo) {
        if (androidx.media3.exoplayer.audio.DeviceTypeUtil.isBluetoothDevice(audioDeviceInfo.getType())) {
            return getChannelMasksForBluetooth();
        }
        if (androidx.media3.exoplayer.audio.DeviceTypeUtil.isBuiltInEarpiece(audioDeviceInfo.getType())) {
            return p076i4.AbstractC2186b0.y(4);
        }
        if (androidx.media3.exoplayer.audio.DeviceTypeUtil.isBuiltInSpeaker(audioDeviceInfo.getType())) {
            return getChannelMasksForBuiltInSpeakers(audioDeviceInfo);
        }
        int i3 = android.os.Build.VERSION.SDK_INT;
        if (i3 >= 31 && androidx.media3.exoplayer.audio.DeviceTypeUtil.isHdmiArc(audioDeviceInfo.getType())) {
            return getChannelMasksForHdmiArc(audioDeviceInfo);
        }
        if (i3 < 31 || !androidx.media3.exoplayer.audio.DeviceTypeUtil.isHdmiEarc(audioDeviceInfo.getType())) {
            return (i3 < 31 || !androidx.media3.exoplayer.audio.DeviceTypeUtil.isUsbDevice(audioDeviceInfo.getType())) ? DEFAULT_CHANNEL_MASK : getChannelMasksForUsb(audioDeviceInfo);
        }
        return getChannelMasksForHdmiEarc(audioDeviceInfo);
    }
}
