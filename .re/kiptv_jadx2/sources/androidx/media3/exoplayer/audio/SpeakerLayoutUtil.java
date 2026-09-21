package androidx.media3.exoplayer.audio;

import android.media.AudioDeviceInfo;
import android.media.AudioProfile;
import android.os.Build;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.analytics.z;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import p076i4.AbstractC2186b0;

final class SpeakerLayoutUtil {
    private static final AbstractC2186b0 DEFAULT_CHANNEL_MASK = AbstractC2186b0.y(12);
    private static final String TAG = "SpeakerLayoutUtil";

    private SpeakerLayoutUtil() {
    }

    private static AbstractC2186b0 getChannelMasksForBluetooth() {
        return DEFAULT_CHANNEL_MASK;
    }

    private static AbstractC2186b0 getChannelMasksForBuiltInSpeakers(AudioDeviceInfo audioDeviceInfo) {
        int speakerLayoutChannelMask;
        if (Build.VERSION.SDK_INT >= 36 && (speakerLayoutChannelMask = audioDeviceInfo.getSpeakerLayoutChannelMask()) != 0 && speakerLayoutChannelMask != 1) {
            return AbstractC2186b0.y(Integer.valueOf(speakerLayoutChannelMask));
        }
        Log.w(TAG, "Built-in speaker's getSpeakerLayoutChannelMask not usable, defaulting to stereo.");
        return DEFAULT_CHANNEL_MASK;
    }

    private static AbstractC2186b0 getChannelMasksForHdmiArc(AudioDeviceInfo audioDeviceInfo) {
        AbstractC2186b0 channelMasksFromPcmAudioProfiles = getChannelMasksFromPcmAudioProfiles(audioDeviceInfo);
        if (!channelMasksFromPcmAudioProfiles.isEmpty()) {
            return channelMasksFromPcmAudioProfiles;
        }
        AbstractC2186b0 allLpcmChannelMasksFromPcmSads = AudioDescriptorUtil.getAllLpcmChannelMasksFromPcmSads(audioDeviceInfo.getAudioDescriptors());
        return !allLpcmChannelMasksFromPcmSads.isEmpty() ? allLpcmChannelMasksFromPcmSads : DEFAULT_CHANNEL_MASK;
    }

    private static AbstractC2186b0 getChannelMasksForHdmiEarc(AudioDeviceInfo audioDeviceInfo) {
        AbstractC2186b0 channelMasksFromPcmAudioProfiles = getChannelMasksFromPcmAudioProfiles(audioDeviceInfo);
        if (!channelMasksFromPcmAudioProfiles.isEmpty()) {
            return channelMasksFromPcmAudioProfiles;
        }
        List audioDescriptors = audioDeviceInfo.getAudioDescriptors();
        if (Build.VERSION.SDK_INT >= 34) {
            AbstractC2186b0 allChannelMasksFromSadbs = AudioDescriptorUtil.getAllChannelMasksFromSadbs(audioDescriptors);
            if (!allChannelMasksFromSadbs.isEmpty()) {
                return allChannelMasksFromSadbs;
            }
        }
        AbstractC2186b0 allLpcmChannelMasksFromPcmSads = AudioDescriptorUtil.getAllLpcmChannelMasksFromPcmSads(audioDescriptors);
        return !allLpcmChannelMasksFromPcmSads.isEmpty() ? allLpcmChannelMasksFromPcmSads : DEFAULT_CHANNEL_MASK;
    }

    private static AbstractC2186b0 getChannelMasksForUsb(AudioDeviceInfo audioDeviceInfo) {
        AbstractC2186b0 channelMasksFromPcmAudioProfiles = getChannelMasksFromPcmAudioProfiles(audioDeviceInfo);
        return !channelMasksFromPcmAudioProfiles.isEmpty() ? channelMasksFromPcmAudioProfiles : DEFAULT_CHANNEL_MASK;
    }

    private static AbstractC2186b0 getChannelMasksFromPcmAudioProfiles(AudioDeviceInfo audioDeviceInfo) {
        List audioProfiles = audioDeviceInfo.getAudioProfiles();
        TreeSet treeSet = new TreeSet(Comparator.comparing(new c()).reversed());
        Iterator it = audioProfiles.iterator();
        while (it.hasNext()) {
            AudioProfile audioProfileE = z.e(it.next());
            if (audioProfileE.getEncapsulationType() != 1 && Util.isEncodingLinearPcm(audioProfileE.getFormat())) {
                for (int i3 : audioProfileE.getChannelMasks()) {
                    treeSet.add(Integer.valueOf(i3));
                }
            }
        }
        return AbstractC2186b0.u(treeSet);
    }

    public static AbstractC2186b0 getLoudspeakerLayoutChannelMasks(AudioDeviceInfo audioDeviceInfo) {
        if (DeviceTypeUtil.isBluetoothDevice(audioDeviceInfo.getType())) {
            return getChannelMasksForBluetooth();
        }
        if (DeviceTypeUtil.isBuiltInEarpiece(audioDeviceInfo.getType())) {
            return AbstractC2186b0.y(4);
        }
        if (DeviceTypeUtil.isBuiltInSpeaker(audioDeviceInfo.getType())) {
            return getChannelMasksForBuiltInSpeakers(audioDeviceInfo);
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 31 && DeviceTypeUtil.isHdmiArc(audioDeviceInfo.getType())) {
            return getChannelMasksForHdmiArc(audioDeviceInfo);
        }
        if (i3 < 31 || !DeviceTypeUtil.isHdmiEarc(audioDeviceInfo.getType())) {
            return (i3 < 31 || !DeviceTypeUtil.isUsbDevice(audioDeviceInfo.getType())) ? DEFAULT_CHANNEL_MASK : getChannelMasksForUsb(audioDeviceInfo);
        }
        return getChannelMasksForHdmiEarc(audioDeviceInfo);
    }
}
