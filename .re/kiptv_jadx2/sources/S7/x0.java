package S7;

public final class x0 extends X7.p {

    public final int f9626l;

    public x0(p100l6.h hVar, p100l6.c cVar, int i3) {
        super(cVar, hVar);
        this.f9626l = i3;
    }

    @Override
    public final boolean r(Throwable th) {
        switch (this.f9626l) {
            case 0:
                return false;
            default:
                if (th instanceof W7.o) {
                    return true;
                }
                return l(th);
        }
    }
}
