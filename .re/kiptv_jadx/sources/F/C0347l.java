package F;

/* JADX INFO: renamed from: F.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0347l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p038e0.e f3472a;

    public C0347l(int i3) {
        switch (i3) {
            case 1:
                this.f3472a = new p038e0.e(new x.C3040f[16]);
                break;
            default:
                this.f3472a = new p038e0.e(new F.C0346k[16]);
                break;
        }
    }

    public void a(java.util.concurrent.CancellationException cancellationException) {
        p038e0.e eVar = this.f3472a;
        int i3 = eVar.j;
        S7.InterfaceC0894j[] interfaceC0894jArr = new S7.InterfaceC0894j[i3];
        for (int i9 = 0; i9 < i3; i9++) {
            interfaceC0894jArr[i9] = ((x.C3040f) eVar.f21324h[i9]).f30879b;
        }
        for (int i10 = 0; i10 < i3; i10++) {
            interfaceC0894jArr[i10].cancel(cancellationException);
        }
        if (eVar.j == 0) {
            return;
        }
        A.b.c("uncancelled requests present");
    }

    public void b() {
        p038e0.e eVar = this.f3472a;
        D6.g gVarW = O7.r.W(0, eVar.j);
        int i3 = gVarW.f2458h;
        int i9 = gVarW.f2459i;
        if (i3 <= i9) {
            while (true) {
                ((x.C3040f) eVar.f21324h[i3]).f30879b.resumeWith(p070h6.A.f22523a);
                if (i3 == i9) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        eVar.i();
    }
}
