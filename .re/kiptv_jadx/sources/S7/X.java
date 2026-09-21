package S7;

/* JADX INFO: loaded from: classes4.dex */
public abstract class X extends S7.AbstractC0906w {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f9562l = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f9563i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public p078i6.l f9564k;

    @Override // S7.AbstractC0906w
    public final S7.AbstractC0906w Y(int i3) {
        X7.a.a(i3);
        return this;
    }

    public final void Z(boolean z6) {
        long j = this.f9563i - (z6 ? 4294967296L : 1L);
        this.f9563i = j;
        if (j <= 0 && this.j) {
            shutdown();
        }
    }

    public final void a0(S7.L l2) {
        p078i6.l lVar = this.f9564k;
        if (lVar == null) {
            lVar = new p078i6.l();
            this.f9564k = lVar;
        }
        lVar.addLast(l2);
    }

    public abstract java.lang.Thread b0();

    public final void c0(boolean z6) {
        this.f9563i = (z6 ? 4294967296L : 1L) + this.f9563i;
        if (z6) {
            return;
        }
        this.j = true;
    }

    public abstract long d0();

    public final boolean e0() {
        p078i6.l lVar = this.f9564k;
        if (lVar == null) {
            return false;
        }
        S7.L l2 = (S7.L) (lVar.isEmpty() ? null : lVar.removeFirst());
        if (l2 == null) {
            return false;
        }
        l2.run();
        return true;
    }

    public void f0(long j, S7.U u6) {
        S7.D.f9535p.k0(j, u6);
    }

    public abstract void shutdown();
}
