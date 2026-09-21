package p045e8;

import p063g8.m;

public final class C2142z extends m {

    public final B f21605d;

    public C2142z(B names) {
        super(AbstractC2128k.f21553d, names.f21482a, "dayOfWeekName");
        kotlin.jvm.internal.m.e(names, "names");
        this.f21605d = names;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C2142z) && kotlin.jvm.internal.m.a(this.f21605d.f21482a, ((C2142z) obj).f21605d.f21482a);
    }

    public final int hashCode() {
        return this.f21605d.f21482a.hashCode();
    }
}
