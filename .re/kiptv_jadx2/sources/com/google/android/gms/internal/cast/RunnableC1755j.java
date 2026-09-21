package com.google.android.gms.internal.cast;

import android.content.Context;

public final class RunnableC1755j implements Runnable {

    public final int f18929h;

    public final C1767m f18930i;

    public RunnableC1755j(C1767m c1767m, int i3) {
        this.f18929h = i3;
        this.f18930i = c1767m;
    }

    @Override
    public final void run() {
        switch (this.f18929h) {
            case 0:
                C1767m c1767m = this.f18930i;
                C1775o c1775o = c1767m.f18981e;
                if (((p105m2.C) c1775o.f19016i) == null) {
                    c1775o.f19016i = p105m2.C.d((Context) c1775o.f19015h);
                }
                p105m2.C c9 = (p105m2.C) c1775o.f19016i;
                if (c9 != null) {
                    c9.e(c1767m);
                }
                break;
            default:
                this.f18930i.g();
                break;
        }
    }
}
