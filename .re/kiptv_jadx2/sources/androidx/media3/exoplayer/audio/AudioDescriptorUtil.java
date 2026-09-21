package androidx.media3.exoplayer.audio;

import android.media.AudioDescriptor;
import android.os.Build;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.analytics.z;
import androidx.media3.extractor.ts.PsExtractor;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import p076i4.AbstractC2186b0;
import p076i4.S0;
import p076i4.Z;

final class AudioDescriptorUtil {
    static final String TAG = "AudioDescriptorUtil";

    private AudioDescriptorUtil() {
    }

    public static AbstractC2186b0 getAllChannelMasksFromSadbs(List<AudioDescriptor> list) {
        if (Build.VERSION.SDK_INT < 34 || list == null) {
            Z z6 = AbstractC2186b0.f22868i;
            return S0.f22832l;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<AudioDescriptor> it = list.iterator();
        while (it.hasNext()) {
            AudioDescriptor audioDescriptorD = z.d(it.next());
            if (audioDescriptorD.getStandard() == 2) {
                byte[] descriptor = audioDescriptorD.getDescriptor();
                if (descriptor.length != 3) {
                    Log.w(TAG, "Invalid SADB length: " + descriptor.length);
                } else {
                    arrayList.add(Integer.valueOf(getChannelMaskFromSadb(descriptor)));
                }
            }
        }
        arrayList.sort(new b());
        return AbstractC2186b0.u(arrayList);
    }

    public static AbstractC2186b0 getAllLpcmChannelMasksFromPcmSads(List<AudioDescriptor> list) {
        if (Build.VERSION.SDK_INT < 31 || list == null) {
            Z z6 = AbstractC2186b0.f22868i;
            return S0.f22832l;
        }
        TreeSet treeSet = new TreeSet(Comparator.comparing(new c()).reversed());
        Iterator<AudioDescriptor> it = list.iterator();
        while (it.hasNext()) {
            AudioDescriptor audioDescriptorD = z.d(it.next());
            if (audioDescriptorD.getStandard() == 1) {
                byte[] descriptor = audioDescriptorD.getDescriptor();
                if (descriptor.length != 3) {
                    Log.w(TAG, "Invalid SAD length: " + descriptor.length);
                } else {
                    byte b9 = descriptor[0];
                    int i3 = (b9 & 7) + 1;
                    if (((b9 >> 3) & 15) == 1) {
                        treeSet.add(Integer.valueOf(Util.getAudioTrackChannelConfig(i3)));
                    }
                }
            }
        }
        return AbstractC2186b0.u(treeSet);
    }

    public static int getChannelMaskFromSadb(byte[] bArr) {
        int i3 = 0;
        if (Build.VERSION.SDK_INT >= 34 && bArr.length == 3) {
            byte b9 = bArr[0];
            i3 = (b9 & 1) != 0 ? 12 : 0;
            if ((b9 & 2) != 0) {
                i3 |= 32;
            }
            if ((b9 & 4) != 0) {
                i3 |= 16;
            }
            if ((b9 & 8) != 0) {
                i3 |= PsExtractor.AUDIO_STREAM;
            }
            if ((b9 & 16) != 0) {
                i3 |= 1024;
            }
            if ((b9 & 32) != 0) {
                i3 |= 768;
            }
            if ((b9 & 128) != 0) {
                i3 |= 201326592;
            }
            byte b10 = bArr[1];
            if ((b10 & 1) != 0) {
                i3 |= 81920;
            }
            if ((b10 & 2) != 0) {
                i3 |= 8192;
            }
            if ((b10 & 4) != 0) {
                i3 |= 32768;
            }
            if ((b10 & 8) != 0) {
                i3 |= 6144;
            }
            if ((b10 & 16) != 0) {
                i3 |= 33554432;
            }
            if ((b10 & 32) != 0) {
                i3 |= 262144;
            }
            if ((b10 & 64) != 0) {
                i3 |= 6144;
            }
            if ((b10 & 128) != 0) {
                i3 |= 3145728;
            }
            byte b11 = bArr[2];
            if ((b11 & 1) != 0) {
                i3 |= 655360;
            }
            if ((b11 & 2) != 0) {
                i3 |= 8388608;
            }
            if ((b11 & 4) != 0) {
                return 20971520 | i3;
            }
        }
        return i3;
    }

    public static int lambda$getAllChannelMasksFromSadbs$0(Integer num, Integer num2) {
        return Integer.bitCount(num2.intValue()) - Integer.bitCount(num.intValue());
    }
}
