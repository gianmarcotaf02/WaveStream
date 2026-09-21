package com.google.android.gms.internal.cast;

import B3.C0089b;
import android.util.Log;

public final class RunnableC1790s implements Runnable {

    public final int f19058h;

    public final C1794t f19059i;

    public RunnableC1790s(C1794t c1794t, int i3) {
        this.f19058h = i3;
        this.f19059i = c1794t;
    }

    @Override
    public final void run() {
        switch (this.f19058h) {
            case 0:
                C1794t c1794t = this.f19059i;
                Object[] objArr = {Integer.valueOf(c1794t.f19076e)};
                C0089b c0089b = C1794t.f19071i;
                Log.i(c0089b.f617a, c0089b.d("transfer with type = %d has timed out", objArr));
                c1794t.b(101);
                break;
            default:
                C1794t c1794t2 = this.f19059i;
                r rVar = new r(c1794t2);
                p191x3.g gVar = c1794t2.f19077f;
                H3.q.g(gVar);
                gVar.a(rVar);
                break;
        }
    }
}
