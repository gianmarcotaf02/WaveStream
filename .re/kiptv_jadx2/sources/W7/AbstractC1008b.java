package W7;

import U7.EnumC0955c;
import androidx.media3.common.util.Log;
import java.util.Arrays;

public abstract class AbstractC1008b {

    public AbstractC1010d[] f10727h;

    public int f10728i;
    public int j;

    public D f10729k;

    public final AbstractC1010d b() {
        AbstractC1010d abstractC1010dC;
        D d4;
        synchronized (this) {
            try {
                AbstractC1010d[] abstractC1010dArrD = this.f10727h;
                if (abstractC1010dArrD == null) {
                    abstractC1010dArrD = d();
                    this.f10727h = abstractC1010dArrD;
                } else if (this.f10728i >= abstractC1010dArrD.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(abstractC1010dArrD, abstractC1010dArrD.length * 2);
                    kotlin.jvm.internal.m.d(objArrCopyOf, "copyOf(...)");
                    this.f10727h = (AbstractC1010d[]) objArrCopyOf;
                    abstractC1010dArrD = (AbstractC1010d[]) objArrCopyOf;
                }
                int i3 = this.j;
                do {
                    abstractC1010dC = abstractC1010dArrD[i3];
                    if (abstractC1010dC == null) {
                        abstractC1010dC = c();
                        abstractC1010dArrD[i3] = abstractC1010dC;
                    }
                    i3++;
                    if (i3 >= abstractC1010dArrD.length) {
                        i3 = 0;
                    }
                } while (!abstractC1010dC.a(this));
                this.j = i3;
                this.f10728i++;
                d4 = this.f10729k;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (d4 != null) {
            d4.u(1);
        }
        return abstractC1010dC;
    }

    public abstract AbstractC1010d c();

    public abstract AbstractC1010d[] d();

    public final void e(AbstractC1010d abstractC1010d) {
        D d4;
        int i3;
        p100l6.c[] cVarArrB;
        synchronized (this) {
            try {
                int i9 = this.f10728i - 1;
                this.f10728i = i9;
                d4 = this.f10729k;
                if (i9 == 0) {
                    this.j = 0;
                }
                kotlin.jvm.internal.m.c(abstractC1010d, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                cVarArrB = abstractC1010d.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (p100l6.c cVar : cVarArrB) {
            if (cVar != null) {
                cVar.resumeWith(p070h6.A.f22523a);
            }
        }
        if (d4 != null) {
            d4.u(-1);
        }
    }

    public final D f() {
        D d4;
        synchronized (this) {
            d4 = this.f10729k;
            if (d4 == null) {
                int i3 = this.f10728i;
                d4 = new D(1, Log.LOG_LEVEL_OFF, EnumC0955c.f10176i);
                d4.o(Integer.valueOf(i3));
                this.f10729k = d4;
            }
        }
        return d4;
    }
}
