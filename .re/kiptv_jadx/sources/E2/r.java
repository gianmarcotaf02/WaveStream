package E2;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.content.Context f2795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final S2.f f2796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p070h6.p f2797c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p070h6.p f2798d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final E2.e f2799e;

    public r(android.content.Context context, S2.f fVar, p070h6.p pVar, p070h6.p pVar2, E2.e eVar) {
        this.f2795a = context;
        this.f2796b = fVar;
        this.f2797c = pVar;
        this.f2798d = pVar2;
        this.f2799e = eVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E2.r)) {
            return false;
        }
        E2.r rVar = (E2.r) obj;
        if (!kotlin.jvm.internal.m.a(this.f2795a, rVar.f2795a) || !this.f2796b.equals(rVar.f2796b) || !this.f2797c.equals(rVar.f2797c) || !this.f2798d.equals(rVar.f2798d)) {
            return false;
        }
        java.lang.Object obj2 = E2.h.f2783a;
        return obj2.equals(obj2) && this.f2799e.equals(rVar.f2799e);
    }

    public final int hashCode() {
        return (this.f2799e.hashCode() + ((E2.h.f2783a.hashCode() + ((this.f2798d.hashCode() + ((this.f2797c.hashCode() + ((this.f2796b.hashCode() + (this.f2795a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
    }

    public final java.lang.String toString() {
        return "Options(application=" + this.f2795a + ", defaults=" + this.f2796b + ", memoryCacheLazy=" + this.f2797c + ", diskCacheLazy=" + this.f2798d + ", eventListenerFactory=" + E2.h.f2783a + ", componentRegistry=" + this.f2799e + ", logger=null)";
    }
}
