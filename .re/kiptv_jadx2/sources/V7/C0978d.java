package V7;

import U7.EnumC0955c;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public final class C0978d extends W7.g {

    public static final AtomicIntegerFieldUpdater f10450m = AtomicIntegerFieldUpdater.newUpdater(C0978d.class, "consumed$volatile");
    private volatile int consumed$volatile;

    public final U7.C f10451k;

    public final boolean f10452l;

    public C0978d(U7.C c9, boolean z6) {
        this(c9, z6, p100l6.i.f24820h, -3, EnumC0955c.f10175h);
    }

    @Override
    public final String b() {
        return "channel=" + this.f10451k;
    }

    @Override
    public final Object c(U7.A a2, p100l6.c cVar) throws Throwable {
        Object objN = r.n(new W7.B(a2), this.f10451k, this.f10452l, cVar);
        return objN == p109m6.a.f25430h ? objN : p070h6.A.f22523a;
    }

    @Override
    public final Object collect(InterfaceC0982h interfaceC0982h, p100l6.c cVar) throws Throwable {
        p070h6.A a2 = p070h6.A.f22523a;
        if (this.f10740i == -3) {
            boolean z6 = this.f10452l;
            if (z6 && f10450m.getAndSet(this, 1) == 1) {
                throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once");
            }
            Object objN = r.n(interfaceC0982h, this.f10451k, z6, cVar);
            if (objN == p109m6.a.f25430h) {
                return objN;
            }
        } else {
            Object objCollect = super.collect(interfaceC0982h, cVar);
            if (objCollect == p109m6.a.f25430h) {
                return objCollect;
            }
        }
        return a2;
    }

    @Override
    public final W7.g d(p100l6.h hVar, int i3, EnumC0955c enumC0955c) {
        return new C0978d(this.f10451k, this.f10452l, hVar, i3, enumC0955c);
    }

    @Override
    public final InterfaceC0981g e() {
        return new C0978d(this.f10451k, this.f10452l);
    }

    @Override
    public final U7.C f(S7.A a2) {
        if (this.f10452l && f10450m.getAndSet(this, 1) == 1) {
            throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once");
        }
        return this.f10740i == -3 ? this.f10451k : super.f(a2);
    }

    public C0978d(U7.C c9, boolean z6, p100l6.h hVar, int i3, EnumC0955c enumC0955c) {
        super(hVar, i3, enumC0955c);
        this.f10451k = c9;
        this.f10452l = z6;
    }
}
