package F2;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final E2.o f3528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final S2.h f3529b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final F2.b f3530c;

    public d(E2.o oVar, S2.h hVar, F2.b bVar) {
        this.f3528a = oVar;
        this.f3529b = hVar;
        this.f3530c = bVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F2.d)) {
            return false;
        }
        F2.d dVar = (F2.d) obj;
        if (!kotlin.jvm.internal.m.a(this.f3528a, dVar.f3528a)) {
            return false;
        }
        F2.b bVar = dVar.f3530c;
        F2.b bVar2 = this.f3530c;
        return kotlin.jvm.internal.m.a(bVar2, bVar) && bVar2.a(this.f3529b, dVar.f3529b);
    }

    public final int hashCode() {
        int iHashCode = this.f3528a.hashCode() * 31;
        F2.b bVar = this.f3530c;
        return bVar.b(this.f3529b) + ((bVar.hashCode() + iHashCode) * 31);
    }

    public final java.lang.String toString() {
        return "Input(imageLoader=" + this.f3528a + ", request=" + this.f3529b + ", modelEqualityDelegate=" + this.f3530c + ')';
    }
}
