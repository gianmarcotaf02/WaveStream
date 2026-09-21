package p089k0;

/* JADX INFO: loaded from: classes.dex */
public final class h implements p020c0.C0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.util.Set f24415h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p038e0.e f24416i = new p038e0.e(new p020c0.D0[16]);

    public h(java.util.Set set) {
        this.f24415h = set;
    }

    @Override // p020c0.C0
    public final void d() {
        p038e0.e eVar = this.f24416i;
        java.lang.Object[] objArr = eVar.f21324h;
        int i3 = eVar.j;
        for (int i9 = 0; i9 < i3; i9++) {
            p020c0.C0 c9 = ((p020c0.D0) objArr[i9]).f18104a;
            this.f24415h.remove(c9);
            c9.d();
        }
    }

    @Override // p020c0.C0
    public final void a() {
    }

    @Override // p020c0.C0
    public final void c() {
    }
}
