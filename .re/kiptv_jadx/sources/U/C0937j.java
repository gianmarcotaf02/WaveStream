package U;

/* JADX INFO: renamed from: U.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0937j implements p146r1.E {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p137q0.d f10032h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final U.InterfaceC0938k f10033i;
    public long j = 0;

    public C0937j(p137q0.d dVar, U.InterfaceC0938k interfaceC0938k) {
        this.f10032h = dVar;
        this.f10033i = interfaceC0938k;
    }

    @Override // p146r1.E
    public final long b(p113n1.l lVar, long j, p113n1.n nVar, long j9) {
        long jA = this.f10033i.a();
        if ((9223372034707292159L & jA) == 9205357640488583168L) {
            jA = this.j;
        }
        this.j = jA;
        return p113n1.k.c(p113n1.k.c(lVar.a(), com.google.android.gms.internal.play_billing.V0.D(jA)), this.f10032h.a(j9, 0L, nVar));
    }
}
