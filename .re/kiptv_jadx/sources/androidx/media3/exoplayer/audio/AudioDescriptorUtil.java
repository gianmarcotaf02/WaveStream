package androidx.media3.exoplayer.audio;

/* JADX INFO: loaded from: classes.dex */
final class AudioDescriptorUtil {
    static final java.lang.String TAG = "AudioDescriptorUtil";

    private AudioDescriptorUtil() {
    }

    public static p076i4.AbstractC2186b0 getAllChannelMasksFromSadbs(java.util.List<android.media.AudioDescriptor> list) {
        if (android.os.Build.VERSION.SDK_INT < 34 || list == null) {
            p076i4.Z z6 = p076i4.AbstractC2186b0.f22868i;
            return p076i4.S0.f22832l;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<android.media.AudioDescriptor> it = list.iterator();
        while (it.hasNext()) {
            android.media.AudioDescriptor audioDescriptorD = androidx.media3.exoplayer.analytics.z.d(it.next());
            if (audioDescriptorD.getStandard() == 2) {
                byte[] descriptor = audioDescriptorD.getDescriptor();
                if (descriptor.length != 3) {
                    androidx.media3.common.util.Log.w(TAG, "Invalid SADB length: " + descriptor.length);
                } else {
                    arrayList.add(java.lang.Integer.valueOf(getChannelMaskFromSadb(descriptor)));
                }
            }
        }
        arrayList.sort(new androidx.media3.exoplayer.audio.b());
        return p076i4.AbstractC2186b0.u(arrayList);
    }

    public static p076i4.AbstractC2186b0 getAllLpcmChannelMasksFromPcmSads(java.util.List<android.media.AudioDescriptor> list) {
        if (android.os.Build.VERSION.SDK_INT < 31 || list == null) {
            p076i4.Z z6 = p076i4.AbstractC2186b0.f22868i;
            return p076i4.S0.f22832l;
        }
        java.util.TreeSet treeSet = new java.util.TreeSet(java.util.Comparator.comparing(new androidx.media3.exoplayer.audio.c()).reversed());
        java.util.Iterator<android.media.AudioDescriptor> it = list.iterator();
        while (it.hasNext()) {
            android.media.AudioDescriptor audioDescriptorD = androidx.media3.exoplayer.analytics.z.d(it.next());
            if (audioDescriptorD.getStandard() == 1) {
                byte[] descriptor = audioDescriptorD.getDescriptor();
                if (descriptor.length != 3) {
                    androidx.media3.common.util.Log.w(TAG, "Invalid SAD length: " + descriptor.length);
                } else {
                    byte b9 = descriptor[0];
                    int i3 = (b9 & 7) + 1;
                    if (((b9 >> 3) & 15) == 1) {
                        treeSet.add(java.lang.Integer.valueOf(androidx.media3.common.util.Util.getAudioTrackChannelConfig(i3)));
                    }
                }
            }
        }
        return p076i4.AbstractC2186b0.u(treeSet);
    }

    public static int getChannelMaskFromSadb(byte[] bArr) {
        int i3 = 0;
        if (android.os.Build.VERSION.SDK_INT >= 34 && bArr.length == 3) {
            byte b9 = bArr[0];
            i3 = (b9 & 1) != 0 ? 12 : 0;
            if ((b9 & 2) != 0) {
                i3 |= 32;
            }
            if ((b9 & 4) != 0) {
                i3 |= 16;
            }
            if ((b9 & 8) != 0) {
                i3 |= androidx.media3.extractor.ts.PsExtractor.AUDIO_STREAM;
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

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$getAllChannelMasksFromSadbs$0(java.lang.Integer num, java.lang.Integer num2) {
        return java.lang.Integer.bitCount(num2.intValue()) - java.lang.Integer.bitCount(num.intValue());
    }
}
