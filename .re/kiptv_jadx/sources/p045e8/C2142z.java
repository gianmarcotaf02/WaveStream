package p045e8;

/* JADX INFO: renamed from: e8.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2142z extends p063g8.m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p045e8.B f21605d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2142z(p045e8.B names) {
        super(p045e8.AbstractC2128k.f21553d, names.f21482a, "dayOfWeekName");
        kotlin.jvm.internal.m.e(names, "names");
        this.f21605d = names;
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof p045e8.C2142z) && kotlin.jvm.internal.m.a(this.f21605d.f21482a, ((p045e8.C2142z) obj).f21605d.f21482a);
    }

    public final int hashCode() {
        return this.f21605d.f21482a.hashCode();
    }
}
