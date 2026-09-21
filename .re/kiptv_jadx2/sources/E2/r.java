package E2;

import android.content.Context;

public final class r {

    public final Context f2795a;

    public final S2.f f2796b;

    public final p070h6.p f2797c;

    public final p070h6.p f2798d;

    public final e f2799e;

    public r(Context context, S2.f fVar, p070h6.p pVar, p070h6.p pVar2, e eVar) {
        this.f2795a = context;
        this.f2796b = fVar;
        this.f2797c = pVar;
        this.f2798d = pVar2;
        this.f2799e = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (!kotlin.jvm.internal.m.a(this.f2795a, rVar.f2795a) || !this.f2796b.equals(rVar.f2796b) || !this.f2797c.equals(rVar.f2797c) || !this.f2798d.equals(rVar.f2798d)) {
            return false;
        }
        Object obj2 = h.f2783a;
        return obj2.equals(obj2) && this.f2799e.equals(rVar.f2799e);
    }

    public final int hashCode() {
        return (this.f2799e.hashCode() + ((h.f2783a.hashCode() + ((this.f2798d.hashCode() + ((this.f2797c.hashCode() + ((this.f2796b.hashCode() + (this.f2795a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
    }

    public final String toString() {
        return "Options(application=" + this.f2795a + ", defaults=" + this.f2796b + ", memoryCacheLazy=" + this.f2797c + ", diskCacheLazy=" + this.f2798d + ", eventListenerFactory=" + h.f2783a + ", componentRegistry=" + this.f2799e + ", logger=null)";
    }
}
