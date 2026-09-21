package B7;

import androidx.lifecycle.H;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import com.google.android.gms.internal.play_billing.AbstractC1872t;
import com.google.android.gms.internal.play_billing.z1;
import com.google.common.util.concurrent.P;
import p113n1.r;
import t8.q;
import x.G0;
import x.W0;

public class l implements H, J0.a {

    public final int f839h;

    public boolean f840i;
    public Object j;

    public l() {
        this.f839h = 1;
    }

    public void a() {
        this.f840i = false;
    }

    public void b(byte b9) {
        ((q) this.j).f(b9);
    }

    public void c(char c9) {
        ((q) this.j).s(c9);
    }

    public void d(int i3) {
        ((q) this.j).f(i3);
    }

    public void e(long j) {
        ((q) this.j).f(j);
    }

    public void f(String v6) {
        kotlin.jvm.internal.m.e(v6, "v");
        ((q) this.j).I(v6);
    }

    public void g(short s9) {
        ((q) this.j).f(s9);
    }

    @Override
    public long g0(int i3, long j, long j9) {
        if (!this.f840i) {
            return 0L;
        }
        W0 w6 = (W0) this.j;
        if (w6.f30819a.a()) {
            return 0L;
        }
        return w6.h(w6.d(w6.f30819a.e(w6.d(w6.g(j9)))));
    }

    public void h(String value) {
        kotlin.jvm.internal.m.e(value, "value");
        ((q) this.j).D(value);
    }

    @Override
    public Object h0(long j, long j9, p100l6.c cVar) throws Throwable {
        G0 g9;
        long jD;
        if (cVar instanceof G0) {
            g9 = (G0) cVar;
            int i3 = g9.f30724k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                g9.f30724k = i3 - Integer.MIN_VALUE;
            } else {
                g9 = new G0(this, (p117n6.c) cVar);
            }
        } else {
            g9 = new G0(this, (p117n6.c) cVar);
        }
        Object objA = g9.f30723i;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = g9.f30724k;
        if (i9 == 0) {
            P.u0(objA);
            jD = 0;
            if (this.f840i) {
                W0 w6 = (W0) this.j;
                if (!w6.f30826i) {
                    g9.f30722h = j9;
                    g9.f30724k = 1;
                    objA = w6.a(j9, g9);
                    if (objA == aVar) {
                        return aVar;
                    }
                }
                jD = r.d(j9, jD);
            }
            return new r(jD);
        }
        if (i9 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        j9 = g9.f30722h;
        P.u0(objA);
        jD = ((r) objA).f25573a;
        jD = r.d(j9, jD);
        return new r(jD);
    }

    public void l(z1 z1Var) {
        if (this.f840i) {
            AbstractC1872t.h("BillingLogger", "Skipping logging since initialization failed.");
            return;
        }
        try {
            ((E2.d) this.j).w(new p013b3.a(null, z1Var, p013b3.c.f17869h));
        } catch (Throwable unused) {
            AbstractC1872t.h("BillingLogger", "logging failed.");
        }
    }

    @Override
    public void onChanged(Object obj) {
        p008a8.c cVar = (p008a8.c) this.j;
        cVar.getClass();
        SignInHubActivity signInHubActivity = (SignInHubActivity) cVar.f15522i;
        signInHubActivity.setResult(signInHubActivity.f18615J, signInHubActivity.f18616K);
        signInHubActivity.finish();
        this.f840i = true;
    }

    public String toString() {
        switch (this.f839h) {
            case 0:
                return this.f840i ? "FALL_THROUGH" : String.valueOf(this.j);
            case 1:
            default:
                return super.toString();
            case 2:
                return ((p008a8.c) this.j).toString();
        }
    }

    public l(int i3, Object obj, boolean z6) {
        this.f839h = i3;
        this.j = obj;
        this.f840i = z6;
    }

    public l(q qVar) {
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
