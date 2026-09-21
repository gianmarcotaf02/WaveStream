package p163t;

import p020c0.AbstractC1703s;
import p020c0.C1681g0;
import p020c0.e1;

public final class C2768m implements e1 {

    public final E0 f27639h;

    public final C1681g0 f27640i;
    public r j;

    public long f27641k;

    public long f27642l;

    public boolean f27643m;

    public C2768m(E0 e6, Object obj, r rVar, int i3) {
        this(e6, obj, (i3 & 4) != 0 ? null : rVar, Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    @Override
    public final Object getValue() {
        return this.f27640i.getValue();
    }

    public final String toString() {
        return "AnimationState(value=" + this.f27640i.getValue() + ", velocity=" + this.f27639h.f27454b.invoke(this.j) + ", isRunning=" + this.f27643m + ", lastFrameTimeNanos=" + this.f27641k + ", finishedTimeNanos=" + this.f27642l + ')';
    }

    public C2768m(E0 e6, Object obj, r rVar, long j, long j9, boolean z6) {
        r rVarI;
        this.f27639h = e6;
        this.f27640i = AbstractC1703s.y(obj);
        if (rVar != null) {
            rVarI = AbstractC2750d.i(rVar);
        } else {
            rVarI = (r) e6.f27453a.invoke(obj);
            rVarI.d();
        }
        this.j = rVarI;
        this.f27641k = j;
        this.f27642l = j9;
        this.f27643m = z6;
    }
}
