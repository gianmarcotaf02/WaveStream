package p063g8;

import kotlin.jvm.internal.m;
import p007a7.n;

public final class e implements q {

    public final Object f22374a;

    public final n f22375b;

    public e(Object obj, n nVar) {
        this.f22374a = obj;
        this.f22375b = nVar;
    }

    @Override
    public final boolean test(Object obj) {
        return m.a(this.f22375b.invoke(obj), this.f22374a);
    }
}
