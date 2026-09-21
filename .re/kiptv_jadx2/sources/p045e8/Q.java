package p045e8;

import p063g8.m;

public final class Q extends m {

    public final T f21518d;

    public Q(T names) {
        super(AbstractC2128k.f21551b, names.f21521a, "monthName");
        kotlin.jvm.internal.m.e(names, "names");
        this.f21518d = names;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof Q) && kotlin.jvm.internal.m.a(this.f21518d.f21521a, ((Q) obj).f21518d.f21521a);
    }

    public final int hashCode() {
        return this.f21518d.f21521a.hashCode();
    }
}
