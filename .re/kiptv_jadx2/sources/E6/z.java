package E6;

import androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist;
import com.google.crypto.tink.shaded.protobuf.q0;

public final class z {

    public static final z f3225h;

    public static final z f3226i;
    public static final z j;

    public static final z[] f3227k;

    static {
        z zVar = new z("INVARIANT", 0);
        f3225h = zVar;
        z zVar2 = new z(HlsMediaPlaylist.Interstitial.SNAP_TYPE_IN, 1);
        f3226i = zVar2;
        z zVar3 = new z(HlsMediaPlaylist.Interstitial.SNAP_TYPE_OUT, 2);
        j = zVar3;
        z[] zVarArr = {zVar, zVar2, zVar3};
        f3227k = zVarArr;
        q0.t(zVarArr);
    }

    public static z valueOf(String str) {
        return (z) Enum.valueOf(z.class, str);
    }

    public static z[] values() {
        return (z[]) f3227k.clone();
    }
}
