package p045e8;

/* JADX INFO: loaded from: classes4.dex */
public final class Q extends p063g8.m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p045e8.T f21518d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(p045e8.T names) {
        super(p045e8.AbstractC2128k.f21551b, names.f21521a, "monthName");
        kotlin.jvm.internal.m.e(names, "names");
        this.f21518d = names;
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof p045e8.Q) && kotlin.jvm.internal.m.a(this.f21518d.f21521a, ((p045e8.Q) obj).f21518d.f21521a);
    }

    public final int hashCode() {
        return this.f21518d.f21521a.hashCode();
    }
}
