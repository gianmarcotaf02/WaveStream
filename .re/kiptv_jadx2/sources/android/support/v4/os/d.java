package android.support.v4.os;

import B8.h;
import F3.n;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;
import com.google.android.gms.internal.cast.BinderC1783q;
import com.google.android.gms.internal.cast.C1798u;
import com.google.android.gms.internal.cast.C1799u0;
import com.google.android.gms.internal.cast.C1806w;
import com.google.android.gms.internal.cast.J;
import com.google.android.gms.internal.cast.L0;
import com.google.android.gms.internal.cast.RunnableC1802v;
import com.google.android.gms.internal.cast.W;
import p105m2.C2623v;

public final class d implements Runnable {

    public final int f15629h;

    public final int f15630i;
    public final Object j;

    public final Object f15631k;

    public d(Object obj, Object obj2, int i3, int i9) {
        this.f15629h = i9;
        this.j = obj;
        this.f15631k = obj2;
        this.f15630i = i3;
    }

    @Override
    public final void run() {
        A0.a aVar;
        switch (this.f15629h) {
            case 0:
                ((e) this.f15631k).onReceiveResult(this.f15630i, (Bundle) this.j);
                return;
            case 1:
                BinderC1783q binderC1783q = (BinderC1783q) this.j;
                C2623v c2623v = (C2623v) this.f15631k;
                int i3 = this.f15630i;
                synchronized (binderC1783q.g) {
                    binderC1783q.e0(c2623v, i3);
                    break;
                }
                return;
            case 2:
                W w6 = (W) this.j;
                L0 l2 = (L0) this.f15631k;
                int i9 = this.f15630i;
                C1806w c1806w = w6.f18838h;
                if (c1806w == null) {
                    return;
                }
                synchronized (c1806w) {
                    p059g4.d dVar = new p059g4.d();
                    n nVarB = n.b();
                    J j = c1806w.f19164c;
                    nVarB.f3608d = new C1799u0(j);
                    nVarB.f3607c = 4501;
                    A0.a aVarC = j.c(0, nVarB.a());
                    aVarC.c(new C1798u(dVar));
                    aVarC.b(new C1798u(dVar));
                    c1806w.f19163b.postDelayed(new RunnableC1802v(0, dVar), c1806w.f19162a * 1000);
                    aVar = dVar.f21865a;
                }
                aVar.c(new h(w6, l2, i9));
                return;
            default:
                ((TextView) this.j).setTypeface((Typeface) this.f15631k, this.f15630i);
                return;
        }
    }

    public d(e eVar, int i3, Bundle bundle) {
        this.f15629h = 0;
        this.f15631k = eVar;
        this.f15630i = i3;
        this.j = bundle;
    }
}
