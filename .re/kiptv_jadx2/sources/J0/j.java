package J0;

import K0.AbstractC0660h;
import Q0.C0;
import kotlin.jvm.internal.A;
import kotlin.jvm.internal.o;
import p175v0.F;

public final class j extends o implements p194x6.j {

    public final int f5995h;

    public final A f5996i;

    public j(A a2, int i3) {
        super(1);
        this.f5995h = i3;
        this.f5996i = a2;
    }

    @Override
    public final Object invoke(Object obj) {
        boolean z6;
        switch (this.f5995h) {
            case 0:
                Object obj2 = (C0) obj;
                if (((p137q0.o) obj2).f26475h.f26487u) {
                    this.f5996i.f24539h = obj2;
                    z6 = false;
                } else {
                    z6 = true;
                }
                return Boolean.valueOf(z6);
            case 1:
                AbstractC0660h abstractC0660h = (AbstractC0660h) obj;
                A a2 = this.f5996i;
                Object obj3 = a2.f24539h;
                if (obj3 == null && abstractC0660h.f6704x) {
                    a2.f24539h = abstractC0660h;
                } else if (obj3 != null) {
                    abstractC0660h.getClass();
                }
                return Boolean.TRUE;
            default:
                this.f5996i.f24539h = (F) obj;
                return Boolean.TRUE;
        }
    }
}
