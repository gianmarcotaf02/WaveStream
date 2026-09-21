package D5;

import kotlin.jvm.functions.Function0;

public final class C0241a {

    public final long f2252a;

    public final Function0 f2253b;

    public final Function0 f2254c;

    public final Function0 f2255d;

    public C0241a(long j, Function0 onDown, Function0 onUp, Function0 onReset) {
        kotlin.jvm.internal.m.e(onDown, "onDown");
        kotlin.jvm.internal.m.e(onUp, "onUp");
        kotlin.jvm.internal.m.e(onReset, "onReset");
        this.f2252a = j;
        this.f2253b = onDown;
        this.f2254c = onUp;
        this.f2255d = onReset;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0241a)) {
            return false;
        }
        C0241a c0241a = (C0241a) obj;
        return this.f2252a == c0241a.f2252a && kotlin.jvm.internal.m.a(this.f2253b, c0241a.f2253b) && kotlin.jvm.internal.m.a(this.f2254c, c0241a.f2254c) && kotlin.jvm.internal.m.a(this.f2255d, c0241a.f2255d);
    }

    public final int hashCode() {
        return this.f2255d.hashCode() + ((this.f2254c.hashCode() + ((this.f2253b.hashCode() + (Long.hashCode(this.f2252a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TvDelayControl(delayMs=" + this.f2252a + ", onDown=" + this.f2253b + ", onUp=" + this.f2254c + ", onReset=" + this.f2255d + ")";
    }
}
