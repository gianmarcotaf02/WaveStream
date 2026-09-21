package C7;

import java.util.List;

public final class C0192y implements p194x6.j {

    public final int f1613h = 1;

    public final M f1614i;

    public C0192y(I i3, M m8, List list, p180v7.o oVar, boolean z6) {
        this.f1614i = m8;
    }

    @Override
    public final Object invoke(Object obj) {
        D7.f refiner = (D7.f) obj;
        switch (this.f1613h) {
            case 0:
                kotlin.jvm.internal.m.e(refiner, "refiner");
                this.f1614i.h();
                break;
            default:
                kotlin.jvm.internal.m.e(refiner, "kotlinTypeRefiner");
                this.f1614i.h();
                break;
        }
        return null;
    }

    public C0192y(I i3, M m8, List list, boolean z6) {
        this.f1614i = m8;
    }
}
