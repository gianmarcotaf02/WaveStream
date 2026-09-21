package androidx.media3.container;

import androidx.media3.common.util.ParsableByteArray;
import p121o0.p;

public final class DolbyVisionConfig {
    public final String codecs;
    public final int level;
    public final int profile;

    private DolbyVisionConfig(int i3, int i9, String str) {
        this.profile = i3;
        this.level = i9;
        this.codecs = str;
    }

    public static DolbyVisionConfig parse(ParsableByteArray parsableByteArray) {
        String str;
        parsableByteArray.skipBytes(2);
        int unsignedByte = parsableByteArray.readUnsignedByte();
        int i3 = unsignedByte >> 1;
        int unsignedByte2 = ((parsableByteArray.readUnsignedByte() >> 3) & 31) | ((unsignedByte & 1) << 5);
        if (i3 == 4 || i3 == 5 || i3 == 7 || i3 == 8) {
            str = "dvhe";
        } else if (i3 == 9) {
            str = "dvav";
        } else {
            if (i3 != 10) {
                return null;
            }
            str = "dav1";
        }
        StringBuilder sbV = p.v(str);
        sbV.append(i3 < 10 ? ".0" : ".");
        sbV.append(i3);
        sbV.append(unsignedByte2 < 10 ? ".0" : ".");
        sbV.append(unsignedByte2);
        return new DolbyVisionConfig(i3, unsignedByte2, sbV.toString());
    }
}
