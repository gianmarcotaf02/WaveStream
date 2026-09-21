package p076i4;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class C2188c0 extends AbstractC2226w implements InterfaceC2227w0, Serializable {

    public final transient X0 f22876l;

    public final transient int f22877m;

    public C2188c0(X0 x9, int i3) {
        this.f22876l = x9;
        this.f22877m = i3;
    }

    @Override
    public final boolean c(Object obj) {
        return obj != null && super.c(obj);
    }

    @Override
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final Map d() {
        throw new AssertionError("should never be called");
    }

    @Override
    public final Collection e() {
        return new C2200i0(this);
    }

    @Override
    public final Collection entries() {
        return (W) super.entries();
    }

    @Override
    public final Set f() {
        throw new AssertionError("unreachable");
    }

    @Override
    public final Collection g() {
        return new C2202j0(this);
    }

    @Override
    public final Iterator h() {
        return new C2196g0(this);
    }

    @Override
    public AbstractC2194f0 a() {
        return this.f22876l;
    }

    @Override
    public final AbstractC2186b0 get(Object obj) {
        AbstractC2186b0 abstractC2186b0 = (AbstractC2186b0) this.f22876l.get(obj);
        if (abstractC2186b0 != null) {
            return abstractC2186b0;
        }
        Z z6 = AbstractC2186b0.f22868i;
        return S0.f22832l;
    }

    @Override
    public final Set keySet() {
        return this.f22876l.keySet();
    }

    @Override
    public final boolean put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final int size() {
        return this.f22877m;
    }

    @Override
    public final Collection values() {
        return (W) super.values();
    }
}
