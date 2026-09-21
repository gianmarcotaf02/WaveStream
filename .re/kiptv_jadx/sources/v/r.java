package v;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.content.Context f28997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p113n1.c f28998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f28999c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final B.S f29000d;

    public r(android.content.Context context, p113n1.c cVar, long j, B.S s9) {
        this.f28997a = context;
        this.f28998b = cVar;
        this.f28999c = j;
        this.f29000d = s9;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!v.r.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type androidx.compose.foundation.AndroidEdgeEffectOverscrollFactory");
        v.r rVar = (v.r) obj;
        return kotlin.jvm.internal.m.a(this.f28997a, rVar.f28997a) && kotlin.jvm.internal.m.a(this.f28998b, rVar.f28998b) && p188x0.C3098s.d(this.f28999c, rVar.f28999c) && kotlin.jvm.internal.m.a(this.f29000d, rVar.f29000d);
    }

    public final int hashCode() {
        int iHashCode = (this.f28998b.hashCode() + (this.f28997a.hashCode() * 31)) * 31;
        int i3 = p188x0.C3098s.f31128h;
        return this.f29000d.hashCode() + p121o0.p.e(iHashCode, 31, this.f28999c);
    }
}
