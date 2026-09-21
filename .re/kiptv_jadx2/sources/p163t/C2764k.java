package p163t;

import kotlin.jvm.functions.Function0;
import p020c0.AbstractC1703s;
import p020c0.C1681g0;

public final class C2764k {

    public final E0 f27623a;

    public final Object f27624b;

    public final long f27625c;

    public final Function0 f27626d;

    public final C1681g0 f27627e;

    public r f27628f;
    public long g;

    public long f27629h = Long.MIN_VALUE;

    public final C1681g0 f27630i = AbstractC1703s.y(Boolean.TRUE);

    public C2764k(Object obj, E0 e6, r rVar, long j, Object obj2, long j9, Function0 function0) {
        this.f27623a = e6;
        this.f27624b = obj2;
        this.f27625c = j9;
        this.f27626d = function0;
        this.f27627e = AbstractC1703s.y(obj);
        this.f27628f = AbstractC2750d.i(rVar);
        this.g = j;
    }

    public final void a() {
        this.f27630i.setValue(Boolean.FALSE);
        this.f27626d.invoke();
    }
}
