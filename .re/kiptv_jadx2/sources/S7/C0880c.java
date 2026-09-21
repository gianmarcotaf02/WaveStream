package S7;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public final class C0880c extends k0 {

    public static final AtomicReferenceFieldUpdater f9569o = AtomicReferenceFieldUpdater.newUpdater(C0880c.class, Object.class, "_disposer$volatile");
    private volatile Object _disposer$volatile;

    public final C0895k f9570l;

    public O f9571m;

    public final C0884e f9572n;

    public C0880c(C0884e c0884e, C0895k c0895k) {
        this.f9572n = c0884e;
        this.f9570l = c0895k;
    }

    @Override
    public final boolean i() {
        return false;
    }

    @Override
    public final void j(Throwable th) throws J {
        C0895k c0895k = this.f9570l;
        if (th != null) {
            c0895k.getClass();
            N6.A aC = c0895k.C(new C0903t(th, false), null);
            if (aC != null) {
                c0895k.o(aC);
                C0882d c0882d = (C0882d) f9569o.get(this);
                if (c0882d != null) {
                    c0882d.a();
                    return;
                }
                return;
            }
            return;
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C0884e.f9575b;
        C0884e c0884e = this.f9572n;
        if (atomicIntegerFieldUpdater.decrementAndGet(c0884e) == 0) {
            F[] fArr = c0884e.f9576a;
            ArrayList arrayList = new ArrayList(fArr.length);
            for (F f9 : fArr) {
                arrayList.add(f9.i());
            }
            c0895k.resumeWith(arrayList);
        }
    }
}
