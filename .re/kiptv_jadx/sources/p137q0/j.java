package p137q0;

/* JADX INFO: loaded from: classes.dex */
public final class j implements p137q0.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p137q0.p f26470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p137q0.p f26471c;

    public j(p137q0.p pVar, p137q0.p pVar2) {
        this.f26470b = pVar;
        this.f26471c = pVar2;
    }

    @Override // p137q0.p
    public final boolean a(p194x6.j jVar) {
        return this.f26470b.a(jVar) && this.f26471c.a(jVar);
    }

    @Override // p137q0.p
    public final java.lang.Object c(java.lang.Object obj, p194x6.m mVar) {
        return this.f26471c.c(this.f26470b.c(obj, mVar), mVar);
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof p137q0.j)) {
            return false;
        }
        p137q0.j jVar = (p137q0.j) obj;
        return kotlin.jvm.internal.m.a(this.f26470b, jVar.f26470b) && kotlin.jvm.internal.m.a(this.f26471c, jVar.f26471c);
    }

    public final int hashCode() {
        return (this.f26471c.hashCode() * 31) + this.f26470b.hashCode();
    }

    public final java.lang.String toString() {
        return Y6.f.l(new java.lang.StringBuilder("["), (java.lang.String) c("", p137q0.i.f26469h), ']');
    }
}
