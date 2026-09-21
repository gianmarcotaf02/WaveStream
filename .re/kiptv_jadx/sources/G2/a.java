package G2;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Object f3762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final F2.b f3763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final E2.o f3764c;

    public a(java.lang.Object obj, F2.b bVar, E2.o oVar) {
        this.f3762a = obj;
        this.f3763b = bVar;
        this.f3764c = oVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G2.a)) {
            return false;
        }
        G2.a aVar = (G2.a) obj;
        F2.b bVar = aVar.f3763b;
        F2.b bVar2 = this.f3763b;
        return kotlin.jvm.internal.m.a(bVar2, bVar) && bVar2.a(this.f3762a, aVar.f3762a) && kotlin.jvm.internal.m.a(this.f3764c, aVar.f3764c);
    }

    public final int hashCode() {
        F2.b bVar = this.f3763b;
        return this.f3764c.hashCode() + ((bVar.b(this.f3762a) + (bVar.hashCode() * 31)) * 31);
    }
}
