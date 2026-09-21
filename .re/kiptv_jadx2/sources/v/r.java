package v;

import android.content.Context;
import p188x0.C3098s;

public final class r {

    public final Context f28997a;

    public final p113n1.c f28998b;

    public final long f28999c;

    public final B.S f29000d;

    public r(Context context, p113n1.c cVar, long j, B.S s9) {
        this.f28997a = context;
        this.f28998b = cVar;
        this.f28999c = j;
        this.f29000d = s9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!r.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type androidx.compose.foundation.AndroidEdgeEffectOverscrollFactory");
        r rVar = (r) obj;
        return kotlin.jvm.internal.m.a(this.f28997a, rVar.f28997a) && kotlin.jvm.internal.m.a(this.f28998b, rVar.f28998b) && C3098s.d(this.f28999c, rVar.f28999c) && kotlin.jvm.internal.m.a(this.f29000d, rVar.f29000d);
    }

    public final int hashCode() {
        int iHashCode = (this.f28998b.hashCode() + (this.f28997a.hashCode() * 31)) * 31;
        int i3 = C3098s.f31128h;
        return this.f29000d.hashCode() + p121o0.p.e(iHashCode, 31, this.f28999c);
    }
}
