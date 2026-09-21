package V7;

import S7.C0895k;
import W7.AbstractC1008b;
import W7.AbstractC1010d;

public final class b0 extends AbstractC1010d {

    public long f10443a;

    public C0895k f10444b;

    @Override
    public final boolean a(AbstractC1008b abstractC1008b) {
        a0 a0Var = (a0) abstractC1008b;
        if (this.f10443a >= 0) {
            return false;
        }
        long j = a0Var.f10436p;
        if (j < a0Var.f10437q) {
            a0Var.f10437q = j;
        }
        this.f10443a = j;
        return true;
    }

    @Override
    public final p100l6.c[] b(AbstractC1008b abstractC1008b) {
        long j = this.f10443a;
        this.f10443a = -1L;
        this.f10444b = null;
        return ((a0) abstractC1008b).t(j);
    }
}
