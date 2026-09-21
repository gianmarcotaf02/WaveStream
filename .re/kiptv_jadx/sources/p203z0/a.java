package p203z0;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p113n1.c f32123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p113n1.n f32124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p188x0.InterfaceC3097q f32125c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f32126d;

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p203z0.a)) {
            return false;
        }
        p203z0.a aVar = (p203z0.a) obj;
        return kotlin.jvm.internal.m.a(this.f32123a, aVar.f32123a) && this.f32124b == aVar.f32124b && kotlin.jvm.internal.m.a(this.f32125c, aVar.f32125c) && p181w0.d.a(this.f32126d, aVar.f32126d);
    }

    public final int hashCode() {
        return java.lang.Long.hashCode(this.f32126d) + ((this.f32125c.hashCode() + ((this.f32124b.hashCode() + (this.f32123a.hashCode() * 31)) * 31)) * 31);
    }

    public final java.lang.String toString() {
        return "DrawParams(density=" + this.f32123a + ", layoutDirection=" + this.f32124b + ", canvas=" + this.f32125c + ", size=" + ((java.lang.Object) p181w0.d.f(this.f32126d)) + ')';
    }
}
