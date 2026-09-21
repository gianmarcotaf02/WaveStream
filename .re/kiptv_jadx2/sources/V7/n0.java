package V7;

import S7.C0895k;
import U7.EnumC0955c;
import W7.AbstractC1008b;
import W7.AbstractC1009c;
import W7.AbstractC1010d;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public final class n0 extends AbstractC1008b implements U, InterfaceC0981g, W7.v {

    public static final AtomicReferenceFieldUpdater f10493m = AtomicReferenceFieldUpdater.newUpdater(n0.class, Object.class, "_state$volatile");
    private volatile Object _state$volatile;

    public int f10494l;

    public n0(Object obj) {
        this._state$volatile = obj;
    }

    @Override
    public final InterfaceC0981g a(p100l6.h hVar, int i3, EnumC0955c enumC0955c) {
        return (((i3 < 0 || i3 >= 2) && i3 != -2) || enumC0955c != EnumC0955c.f10176i) ? r.r(this, hVar, i3, enumC0955c) : this;
    }

    @Override
    public final AbstractC1010d c() {
        return new o0();
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override
    public final java.lang.Object collect(V7.InterfaceC0982h r17, p100l6.c r18) {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: V7.n0.collect(V7.h, l6.c):java.lang.Object");
    }

    @Override
    public final AbstractC1010d[] d() {
        return new o0[2];
    }

    @Override
    public final Object emit(Object obj, p100l6.c cVar) {
        h(obj);
        return p070h6.A.f22523a;
    }

    public final boolean g(Object obj, Object obj2) {
        N6.A a2 = AbstractC1009c.f10731b;
        if (obj == null) {
            obj = a2;
        }
        if (obj2 == null) {
            obj2 = a2;
        }
        return i(obj, obj2);
    }

    @Override
    public final Object getValue() {
        N6.A a2 = AbstractC1009c.f10731b;
        Object obj = f10493m.get(this);
        if (obj == a2) {
            return null;
        }
        return obj;
    }

    public final void h(Object obj) {
        if (obj == null) {
            obj = AbstractC1009c.f10731b;
        }
        i(null, obj);
    }

    public final boolean i(Object obj, Object obj2) {
        int i3;
        AbstractC1010d[] abstractC1010dArr;
        N6.A a2;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10493m;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !kotlin.jvm.internal.m.a(obj3, obj)) {
                return false;
            }
            if (kotlin.jvm.internal.m.a(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i9 = this.f10494l;
            if ((i9 & 1) != 0) {
                this.f10494l = i9 + 2;
                return true;
            }
            int i10 = i9 + 1;
            this.f10494l = i10;
            AbstractC1010d[] abstractC1010dArr2 = this.f10727h;
            while (true) {
                o0[] o0VarArr = (o0[]) abstractC1010dArr2;
                if (o0VarArr != null) {
                    for (o0 o0Var : o0VarArr) {
                        if (o0Var != null) {
                            AtomicReference atomicReference = o0Var.f10497a;
                            while (true) {
                                Object obj4 = atomicReference.get();
                                if (obj4 == null || obj4 == (a2 = r.f10510d)) {
                                    break;
                                }
                                N6.A a9 = r.f10509c;
                                if (obj4 != a9) {
                                    do {
                                        if (atomicReference.compareAndSet(obj4, a9)) {
                                            ((C0895k) obj4).resumeWith(p070h6.A.f22523a);
                                            break;
                                        }
                                    } while (atomicReference.get() == obj4);
                                } else {
                                    do {
                                        if (atomicReference.compareAndSet(obj4, a2)) {
                                            break;
                                        }
                                    } while (atomicReference.get() == obj4);
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i3 = this.f10494l;
                    if (i3 == i10) {
                        this.f10494l = i10 + 1;
                        return true;
                    }
                    abstractC1010dArr = this.f10727h;
                }
                abstractC1010dArr2 = abstractC1010dArr;
                i10 = i3;
            }
        }
    }
}
