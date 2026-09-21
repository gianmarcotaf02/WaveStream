package K0;

/* JADX INFO: renamed from: K0.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0666n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p038e0.e f6722a = new p038e0.e(new K0.C0665m[16]);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p136q.D f6723b = new p136q.D(10);

    public boolean a(p136q.r rVar, O0.InterfaceC0732v interfaceC0732v, K0.C0661i c0661i, boolean z6) {
        p038e0.e eVar = this.f6722a;
        java.lang.Object[] objArr = eVar.f21324h;
        int i3 = eVar.j;
        boolean z9 = false;
        for (int i9 = 0; i9 < i3; i9++) {
            z9 = ((K0.C0665m) objArr[i9]).a(rVar, interfaceC0732v, c0661i, z6) || z9;
        }
        return z9;
    }

    public void b(K0.C0661i c0661i) {
        p038e0.e eVar = this.f6722a;
        int i3 = eVar.j;
        while (true) {
            i3--;
            if (-1 >= i3) {
                return;
            }
            if (((K0.C0665m) eVar.f21324h[i3]).f6717d.f11389i == 0) {
                eVar.m(i3);
            }
        }
    }
}
