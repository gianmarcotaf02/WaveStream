package I5;

import S4.C0871j;

public final class C0460g implements p194x6.j {

    public final int f5114h;

    public final C0871j f5115i;
    public final p194x6.j j;

    public C0460g(C0871j c0871j, p194x6.j jVar, int i3) {
        this.f5114h = i3;
        this.f5115i = c0871j;
        this.j = jVar;
    }

    @Override
    public final Object invoke(Object obj) {
        Integer num = (Integer) obj;
        switch (this.f5114h) {
            case 0:
                int iIntValue = num.intValue();
                C0871j c0871j = this.f5115i;
                if (c0871j == null || iIntValue != c0871j.f9401a) {
                    this.j.invoke(num);
                }
                break;
            default:
                int iIntValue2 = num.intValue();
                C0871j c0871j2 = this.f5115i;
                if (c0871j2 == null || iIntValue2 != c0871j2.f9401a) {
                    this.j.invoke(num);
                }
                break;
        }
        return p070h6.A.f22523a;
    }
}
