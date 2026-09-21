package D0;

/* JADX INFO: loaded from: classes.dex */
public abstract class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public A0.b f1796a;

    public abstract void a(p203z0.d dVar);

    public p194x6.j b() {
        return this.f1796a;
    }

    public final void c() {
        p194x6.j jVarB = b();
        if (jVarB != null) {
            jVarB.invoke(this);
        }
    }

    public void d(A0.b bVar) {
        this.f1796a = bVar;
    }
}
