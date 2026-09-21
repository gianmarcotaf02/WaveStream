package p186w5;

import p070h6.A;
import p194x6.j;

public final class P implements j {

    public final int f30125h;

    public final W f30126i;
    public final String j;

    public final j f30127k;

    public P(W w6, String str, j jVar, int i3) {
        this.f30125h = i3;
        this.f30126i = w6;
        this.j = str;
        this.f30127k = jVar;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f30125h) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                this.f30126i.f30168e = this.j;
                this.f30127k.invoke(Integer.valueOf(iIntValue));
                break;
            default:
                int iIntValue2 = ((Number) obj).intValue();
                this.f30126i.f30168e = this.j;
                this.f30127k.invoke(Integer.valueOf(iIntValue2));
                break;
        }
        return A.f22523a;
    }
}
