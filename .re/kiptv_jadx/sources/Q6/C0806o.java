package Q6;

/* JADX INFO: renamed from: Q6.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0806o implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f8643h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Q6.C0807p f8644i;

    public /* synthetic */ C0806o(Q6.C0807p c0807p, int i3) {
        this.f8643h = i3;
        this.f8644i = c0807p;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        switch (this.f8643h) {
            case 0:
                p101l7.e eVar = (p101l7.e) obj;
                Q6.C0807p c0807p = this.f8644i;
                if (eVar != null) {
                    return c0807p.j(eVar, c0807p.i().b(eVar, V6.c.f10361m));
                }
                c0807p.getClass();
                Q6.C0807p.h(8);
                throw null;
            default:
                p101l7.e eVar2 = (p101l7.e) obj;
                Q6.C0807p c0807p2 = this.f8644i;
                if (eVar2 != null) {
                    return c0807p2.j(eVar2, c0807p2.i().e(eVar2, V6.c.f10361m));
                }
                c0807p2.getClass();
                Q6.C0807p.h(4);
                throw null;
        }
    }
}
