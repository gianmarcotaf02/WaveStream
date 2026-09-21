package v;

/* JADX INFO: renamed from: v.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2903x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p188x0.C3086f f29030a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p188x0.C3082b f29031b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p203z0.b f29032c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public p188x0.C3088h f29033d = null;

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v.C2903x)) {
            return false;
        }
        v.C2903x c2903x = (v.C2903x) obj;
        return kotlin.jvm.internal.m.a(this.f29030a, c2903x.f29030a) && kotlin.jvm.internal.m.a(this.f29031b, c2903x.f29031b) && kotlin.jvm.internal.m.a(this.f29032c, c2903x.f29032c) && kotlin.jvm.internal.m.a(this.f29033d, c2903x.f29033d);
    }

    public final int hashCode() {
        p188x0.C3086f c3086f = this.f29030a;
        int iHashCode = (c3086f == null ? 0 : c3086f.hashCode()) * 31;
        p188x0.C3082b c3082b = this.f29031b;
        int iHashCode2 = (iHashCode + (c3082b == null ? 0 : c3082b.hashCode())) * 31;
        p203z0.b bVar = this.f29032c;
        int iHashCode3 = (iHashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        p188x0.C3088h c3088h = this.f29033d;
        return iHashCode3 + (c3088h != null ? c3088h.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "BorderCache(imageBitmap=" + this.f29030a + ", canvas=" + this.f29031b + ", canvasDrawScope=" + this.f29032c + ", borderPath=" + this.f29033d + ')';
    }
}
