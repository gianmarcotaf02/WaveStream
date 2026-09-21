package O0;

/* JADX INFO: loaded from: classes.dex */
public final class c0 extends p137q0.o implements Q0.InterfaceC0787v {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public p194x6.j f7628v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f7629w;

    @Override // p137q0.o
    public final boolean C0() {
        return true;
    }

    @Override // Q0.InterfaceC0787v
    public final void k(long j) {
        if (p113n1.m.a(this.f7629w, j)) {
            return;
        }
        this.f7628v.invoke(new p113n1.m(j));
        this.f7629w = j;
    }
}
