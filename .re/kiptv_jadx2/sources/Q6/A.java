package Q6;

import C7.C0173e;
import N6.AbstractC0709x;
import N6.C0708w;
import N6.InterfaceC0697k;
import N6.InterfaceC0699m;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public final class A extends AbstractC0804m implements N6.B {
    public final B7.m j;

    public final K6.i f8534k;

    public final Map f8535l;

    public final F f8536m;

    public z f8537n;

    public N6.J f8538o;

    public final boolean f8539p;

    public final B7.e f8540q;

    public final p070h6.p f8541r;

    public A(p101l7.e moduleName, B7.m mVar, K6.i iVar, int i3) {
        super(O6.g.f7987a, moduleName);
        p078i6.x xVar = p078i6.x.f23206h;
        kotlin.jvm.internal.m.e(moduleName, "moduleName");
        this.j = mVar;
        this.f8534k = iVar;
        if (!moduleName.f24837i) {
            throw new IllegalArgumentException("Module name must be special: " + moduleName);
        }
        this.f8535l = xVar;
        F.f8554a.getClass();
        F f9 = (F) d0(D.f8552b);
        this.f8536m = f9 == null ? E.f8553b : f9;
        this.f8539p = true;
        this.f8540q = mVar.b(new C0173e(8, this));
        this.f8541r = com.google.common.util.concurrent.D.B(new K6.l(this, 2));
    }

    @Override
    public final Object B(InterfaceC0699m interfaceC0699m, Object obj) {
        return interfaceC0699m.F(this, obj);
    }

    public final void F0() {
        if (this.f8539p) {
            return;
        }
        if (d0(AbstractC0709x.f7425a) != null) {
            throw new ClassCastException();
        }
        String message = "Accessing invalid module descriptor " + this;
        kotlin.jvm.internal.m.e(message, "message");
        throw new C0708w(message);
    }

    @Override
    public final N6.K a0(p101l7.c fqName) {
        kotlin.jvm.internal.m.e(fqName, "fqName");
        F0();
        return (N6.K) this.f8540q.invoke(fqName);
    }

    @Override
    public final List c0() {
        if (this.f8537n != null) {
            return p078i6.w.f23205h;
        }
        StringBuilder sb = new StringBuilder("Dependencies of module ");
        String str = getName().f24836h;
        kotlin.jvm.internal.m.d(str, "toString(...)");
        sb.append(str);
        sb.append(" were not set");
        throw new AssertionError(sb.toString());
    }

    @Override
    public final Object d0(N6.A capability) {
        kotlin.jvm.internal.m.e(capability, "capability");
        Object obj = this.f8535l.get(capability);
        if (obj == null) {
            return null;
        }
        return obj;
    }

    @Override
    public final K6.i g() {
        return this.f8534k;
    }

    @Override
    public final InterfaceC0697k h() {
        return null;
    }

    @Override
    public final Collection k(p101l7.c fqName, p194x6.j jVar) {
        kotlin.jvm.internal.m.e(fqName, "fqName");
        F0();
        F0();
        return ((C0803l) this.f8541r.getValue()).k(fqName, jVar);
    }

    @Override
    public final boolean n(N6.B targetModule) {
        kotlin.jvm.internal.m.e(targetModule, "targetModule");
        if (equals(targetModule)) {
            return true;
        }
        kotlin.jvm.internal.m.b(this.f8537n);
        if (p078i6.o.b1(p078i6.y.f23207h, targetModule)) {
            return true;
        }
        c0();
        if (targetModule instanceof Void) {
        }
        return targetModule.c0().contains(this);
    }

    @Override
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC0804m.E0(this));
        if (!this.f8539p) {
            sb.append(" !isValid");
        }
        sb.append(" packageFragmentProvider: ");
        N6.J j = this.f8538o;
        sb.append(j != null ? j.getClass().getSimpleName() : null);
        return sb.toString();
    }
}
