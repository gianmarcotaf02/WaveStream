package H2;

/* JADX INFO: loaded from: classes.dex */
public final class c implements H2.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p028c8.j f3874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final H2.n f3875b;

    public c(p028c8.j jVar, H2.n nVar) {
        this.f3874a = jVar;
        this.f3875b = nVar;
    }

    @Override // H2.j
    public final H2.k a(J2.i iVar, S2.o oVar) {
        return new H2.e(iVar.f6009a, oVar, this.f3874a, this.f3875b);
    }
}
