package N6;

public final class H implements p194x6.j {

    public final int f7369h;

    public final p101l7.c f7370i;

    public H(p101l7.c cVar, int i3) {
        this.f7369h = i3;
        this.f7370i = cVar;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f7369h) {
            case 0:
                p101l7.c it = (p101l7.c) obj;
                kotlin.jvm.internal.m.e(it, "it");
                return Boolean.valueOf(!it.f24829a.c() && it.b().equals(this.f7370i));
            default:
                O6.h it2 = (O6.h) obj;
                kotlin.jvm.internal.m.e(it2, "it");
                return it2.k(this.f7370i);
        }
    }
}
