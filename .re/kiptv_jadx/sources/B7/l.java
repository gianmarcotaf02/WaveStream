package B7;

/* JADX INFO: loaded from: classes4.dex */
public class l implements androidx.lifecycle.H, J0.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f839h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f840i;
    public java.lang.Object j;

    public /* synthetic */ l() {
        this.f839h = 1;
    }

    public void a() {
        this.f840i = false;
    }

    public void b(byte b9) {
        ((t8.q) this.j).f(b9);
    }

    public void c(char c9) {
        ((t8.q) this.j).s(c9);
    }

    public void d(int i3) {
        ((t8.q) this.j).f(i3);
    }

    public void e(long j) {
        ((t8.q) this.j).f(j);
    }

    public void f(java.lang.String v6) {
        kotlin.jvm.internal.m.e(v6, "v");
        ((t8.q) this.j).I(v6);
    }

    public void g(short s9) {
        ((t8.q) this.j).f(s9);
    }

    @Override // J0.a
    public long g0(int i3, long j, long j9) {
        if (!this.f840i) {
            return 0L;
        }
        x.W0 w6 = (x.W0) this.j;
        if (w6.f30819a.a()) {
            return 0L;
        }
        return w6.h(w6.d(w6.f30819a.e(w6.d(w6.g(j9)))));
    }

    public void h(java.lang.String value) {
        kotlin.jvm.internal.m.e(value, "value");
        ((t8.q) this.j).D(value);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // J0.a
    public java.lang.Object h0(long j, long j9, p100l6.c cVar) throws java.lang.Throwable {
        x.G0 g9;
        long jD;
        if (cVar instanceof x.G0) {
            g9 = (x.G0) cVar;
            int i3 = g9.f30724k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                g9.f30724k = i3 - Integer.MIN_VALUE;
            } else {
                g9 = new x.G0(this, (p117n6.c) cVar);
            }
        } else {
            g9 = new x.G0(this, (p117n6.c) cVar);
        }
        java.lang.Object objA = g9.f30723i;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = g9.f30724k;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(objA);
            jD = 0;
            if (this.f840i) {
                x.W0 w6 = (x.W0) this.j;
                if (!w6.f30826i) {
                    g9.f30722h = j9;
                    g9.f30724k = 1;
                    objA = w6.a(j9, g9);
                    if (objA == aVar) {
                        return aVar;
                    }
                }
                jD = p113n1.r.d(j9, jD);
            }
            return new p113n1.r(jD);
        }
        if (i9 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        j9 = g9.f30722h;
        com.google.common.util.concurrent.P.u0(objA);
        jD = ((p113n1.r) objA).f25573a;
        jD = p113n1.r.d(j9, jD);
        return new p113n1.r(jD);
    }

    public void l(com.google.android.gms.internal.play_billing.z1 z1Var) {
        if (this.f840i) {
            com.google.android.gms.internal.play_billing.AbstractC1872t.h("BillingLogger", "Skipping logging since initialization failed.");
            return;
        }
        try {
            ((E2.d) this.j).w(new p013b3.a(null, z1Var, p013b3.c.f17869h));
        } catch (java.lang.Throwable unused) {
            com.google.android.gms.internal.play_billing.AbstractC1872t.h("BillingLogger", "logging failed.");
        }
    }

    @Override // androidx.lifecycle.H
    public void onChanged(java.lang.Object obj) {
        p008a8.c cVar = (p008a8.c) this.j;
        cVar.getClass();
        com.google.android.gms.auth.api.signin.internal.SignInHubActivity signInHubActivity = (com.google.android.gms.auth.api.signin.internal.SignInHubActivity) cVar.f15522i;
        signInHubActivity.setResult(signInHubActivity.f18615J, signInHubActivity.f18616K);
        signInHubActivity.finish();
        this.f840i = true;
    }

    public java.lang.String toString() {
        switch (this.f839h) {
            case 0:
                return this.f840i ? "FALL_THROUGH" : java.lang.String.valueOf(this.j);
            case 1:
            default:
                return super.toString();
            case 2:
                return ((p008a8.c) this.j).toString();
        }
    }

    public /* synthetic */ l(int i3, java.lang.Object obj, boolean z6) {
        this.f839h = i3;
        this.j = obj;
        this.f840i = z6;
    }

    public l(t8.q qVar) {
        this.f839h = 3;
        this.j = qVar;
        this.f840i = true;
    }

    public l(p166t3.d dVar, p008a8.c cVar) {
        this.f839h = 2;
        this.f840i = false;
        this.j = cVar;
    }

    public void j() {
    }

    public void k() {
    }
}
