package W7;

import V7.a0;
import V7.l0;

public final class D extends a0 implements l0 {
    @Override
    public final Object getValue() {
        Integer numValueOf;
        synchronized (this) {
            Object[] objArr = this.f10435o;
            kotlin.jvm.internal.m.b(objArr);
            numValueOf = Integer.valueOf(((Number) objArr[((int) ((this.f10436p + ((long) ((int) ((m() + ((long) this.f10438r)) - this.f10436p)))) - 1)) & (objArr.length - 1)]).intValue());
        }
        return numValueOf;
    }

    public final void u(int i3) {
        synchronized (this) {
            Object[] objArr = this.f10435o;
            kotlin.jvm.internal.m.b(objArr);
            o(Integer.valueOf(((Number) objArr[((int) ((this.f10436p + ((long) ((int) ((m() + ((long) this.f10438r)) - this.f10436p)))) - 1)) & (objArr.length - 1)]).intValue() + i3));
        }
    }
}
