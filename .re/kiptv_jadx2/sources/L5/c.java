package L5;

import p020c0.C1675d0;
import p070h6.A;
import p194x6.j;

public final class c implements j {

    public final int f7063h;

    public final int f7064i;
    public final C1675d0 j;

    public c(int i3, C1675d0 c1675d0, int i9) {
        this.f7063h = i9;
        this.f7064i = i3;
        this.j = c1675d0;
    }

    @Override
    public final Object invoke(Object obj) {
        int i3 = this.f7063h;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        switch (i3) {
            case 0:
                int i9 = this.f7064i;
                C1675d0 c1675d0 = this.j;
                if (zBooleanValue) {
                    c1675d0.h(i9);
                } else if (c1675d0.g() == i9) {
                    c1675d0.h(0);
                }
                break;
            default:
                if (zBooleanValue) {
                    this.j.h(this.f7064i);
                }
                break;
        }
        return A.f22523a;
    }
}
