package p020c0;

/* JADX INFO: loaded from: classes.dex */
public final class G implements p020c0.C0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p194x6.j f18118h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public p020c0.H f18119i;

    public G(p194x6.j jVar) {
        this.f18118h = jVar;
    }

    @Override // p020c0.C0
    public final void c() {
        p020c0.H h9 = this.f18119i;
        if (h9 != null) {
            h9.dispose();
        }
        this.f18119i = null;
    }

    @Override // p020c0.C0
    public final void d() {
        this.f18119i = (p020c0.H) this.f18118h.invoke(p020c0.AbstractC1703s.f18360c);
    }

    @Override // p020c0.C0
    public final void a() {
    }
}
