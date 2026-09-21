package android.support.v4.os;

/* JADX INFO: loaded from: classes.dex */
public final class d implements java.lang.Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f15629h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f15630i;
    public final java.lang.Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f15631k;

    public /* synthetic */ d(java.lang.Object obj, java.lang.Object obj2, int i3, int i9) {
        this.f15629h = i9;
        this.j = obj;
        this.f15631k = obj2;
        this.f15630i = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        A0.a aVar;
        switch (this.f15629h) {
            case 0:
                ((android.support.v4.os.e) this.f15631k).onReceiveResult(this.f15630i, (android.os.Bundle) this.j);
                return;
            case 1:
                com.google.android.gms.internal.cast.BinderC1783q binderC1783q = (com.google.android.gms.internal.cast.BinderC1783q) this.j;
                p105m2.C2623v c2623v = (p105m2.C2623v) this.f15631k;
                int i3 = this.f15630i;
                synchronized (binderC1783q.g) {
                    binderC1783q.e0(c2623v, i3);
                    break;
                }
                return;
            case 2:
                com.google.android.gms.internal.cast.W w6 = (com.google.android.gms.internal.cast.W) this.j;
                com.google.android.gms.internal.cast.L0 l2 = (com.google.android.gms.internal.cast.L0) this.f15631k;
                int i9 = this.f15630i;
                com.google.android.gms.internal.cast.C1806w c1806w = w6.f18838h;
                if (c1806w == null) {
                    return;
                }
                synchronized (c1806w) {
                    p059g4.d dVar = new p059g4.d();
                    F3.n nVarB = F3.n.b();
                    com.google.android.gms.internal.cast.J j = c1806w.f19164c;
                    nVarB.f3608d = new com.google.android.gms.internal.cast.C1799u0(j);
                    nVarB.f3607c = 4501;
                    A0.a aVarC = j.c(0, nVarB.a());
                    aVarC.c(new com.google.android.gms.internal.cast.C1798u(dVar));
                    aVarC.b(new com.google.android.gms.internal.cast.C1798u(dVar));
                    c1806w.f19163b.postDelayed(new com.google.android.gms.internal.cast.RunnableC1802v(0, dVar), c1806w.f19162a * 1000);
                    aVar = dVar.f21865a;
                }
                aVar.c(new B8.h(w6, l2, i9));
                return;
            default:
                ((android.widget.TextView) this.j).setTypeface((android.graphics.Typeface) this.f15631k, this.f15630i);
                return;
        }
    }

    public d(android.support.v4.os.e eVar, int i3, android.os.Bundle bundle) {
        this.f15629h = 0;
        this.f15631k = eVar;
        this.f15630i = i3;
        this.j = bundle;
    }
}
