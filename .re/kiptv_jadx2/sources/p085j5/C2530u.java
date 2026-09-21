package p085j5;

import dev.jdtech.mpv.MPVLib;
import kotlin.jvm.functions.Function0;
import p070h6.A;

public final class C2530u implements Function0 {

    public final int f24218h;

    public final int f24219i;

    public C2530u(int i3, int i9) {
        this.f24218h = i9;
        this.f24219i = i3;
    }

    @Override
    public final Object invoke() {
        switch (this.f24218h) {
            case 0:
                MPVLib.setPropertyInt("sid", Integer.valueOf(this.f24219i));
                break;
            default:
                MPVLib.setPropertyInt("aid", Integer.valueOf(this.f24219i));
                break;
        }
        return A.f22523a;
    }
}
