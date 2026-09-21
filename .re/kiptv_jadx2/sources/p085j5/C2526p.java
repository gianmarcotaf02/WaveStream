package p085j5;

import dev.jdtech.mpv.MPVLib;
import kotlin.jvm.functions.Function0;
import p070h6.A;

public final class C2526p implements Function0 {

    public final int f24208h;

    public final long f24209i;

    public C2526p(long j, int i3) {
        this.f24208h = i3;
        this.f24209i = j;
    }

    @Override
    public final Object invoke() {
        switch (this.f24208h) {
            case 0:
                MPVLib.setPropertyDouble("audio-delay", Double.valueOf(this.f24209i / 1000.0d));
                break;
            case 1:
                MPVLib.command(new String[]{"seek", String.valueOf(this.f24209i / 1000.0d), "absolute+keyframes"});
                break;
            case 2:
                MPVLib.setPropertyDouble("sub-delay", Double.valueOf(this.f24209i / 1000.0d));
                break;
            default:
                MPVLib.command(new String[]{"seek", String.valueOf(this.f24209i / 1000.0d), "absolute"});
                break;
        }
        return A.f22523a;
    }
}
