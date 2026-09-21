package androidx.media;

import com.google.android.gms.internal.play_billing.M0;
import java.util.Arrays;
import org.videolan.libvlc.MediaPlayer;

public class AudioAttributesImplBase implements AudioAttributesImpl {

    public int f16388a = 0;

    public int f16389b = 0;

    public int f16390c = 0;

    public int f16391d = -1;

    public final boolean equals(Object obj) {
        int i3;
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        if (this.f16389b == audioAttributesImplBase.f16389b) {
            int i9 = this.f16390c;
            int i10 = audioAttributesImplBase.f16390c;
            int i11 = audioAttributesImplBase.f16391d;
            if (i11 == -1) {
                int i12 = audioAttributesImplBase.f16388a;
                int i13 = AudioAttributesCompat.f16384b;
                if ((i10 & 1) != 1) {
                    if ((i10 & 4) != 4) {
                        switch (i12) {
                            case 2:
                                i3 = 0;
                                break;
                            case 3:
                                i3 = 8;
                                break;
                            case 4:
                                i3 = 4;
                                break;
                            case 5:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                i3 = 5;
                                break;
                            case 6:
                                i3 = 2;
                                break;
                            case 11:
                                i3 = 10;
                                break;
                            case 12:
                            default:
                                i3 = 3;
                                break;
                            case 13:
                                i3 = 1;
                                break;
                        }
                    } else {
                        i3 = 6;
                    }
                } else {
                    i3 = 7;
                }
            } else {
                i3 = i11;
            }
            if (i3 == 6) {
                i10 |= 4;
            } else if (i3 == 7) {
                i10 |= 1;
            }
            if (i9 == (i10 & MediaPlayer.Event.LengthChanged) && this.f16388a == audioAttributesImplBase.f16388a && this.f16391d == i11) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f16389b), Integer.valueOf(this.f16390c), Integer.valueOf(this.f16388a), Integer.valueOf(this.f16391d)});
    }

    public final String toString() {
        String strL;
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.f16391d != -1) {
            sb.append(" stream=");
            sb.append(this.f16391d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        int i3 = this.f16388a;
        int i9 = AudioAttributesCompat.f16384b;
        switch (i3) {
            case 0:
                strL = "USAGE_UNKNOWN";
                break;
            case 1:
                strL = "USAGE_MEDIA";
                break;
            case 2:
                strL = "USAGE_VOICE_COMMUNICATION";
                break;
            case 3:
                strL = "USAGE_VOICE_COMMUNICATION_SIGNALLING";
                break;
            case 4:
                strL = "USAGE_ALARM";
                break;
            case 5:
                strL = "USAGE_NOTIFICATION";
                break;
            case 6:
                strL = "USAGE_NOTIFICATION_RINGTONE";
                break;
            case 7:
                strL = "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
                break;
            case 8:
                strL = "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
                break;
            case 9:
                strL = "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
                break;
            case 10:
                strL = "USAGE_NOTIFICATION_EVENT";
                break;
            case 11:
                strL = "USAGE_ASSISTANCE_ACCESSIBILITY";
                break;
            case 12:
                strL = "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
                break;
            case 13:
                strL = "USAGE_ASSISTANCE_SONIFICATION";
                break;
            case 14:
                strL = "USAGE_GAME";
                break;
            case 15:
            default:
                strL = M0.l(i3, "unknown usage ");
                break;
            case 16:
                strL = "USAGE_ASSISTANT";
                break;
        }
        sb.append(strL);
        sb.append(" content=");
        sb.append(this.f16389b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f16390c).toUpperCase());
        return sb.toString();
    }
}
