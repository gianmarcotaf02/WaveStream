package E7;

import N6.A;
import N6.B;
import N6.InterfaceC0697k;
import N6.InterfaceC0699m;
import N6.K;
import com.google.common.util.concurrent.D;
import java.util.Collection;
import java.util.List;
import p070h6.p;
import p078i6.w;

public final class e implements B {

    public static final e f3230h = new e();

    public static final p101l7.e f3231i;
    public static final w j;

    public static final p f3232k;

    static {
        b[] bVarArr = b.f3228h;
        f3231i = p101l7.e.g("<Error module>");
        j = w.f23205h;
        f3232k = D.B(d.f3229h);
    }

    @Override
    public final Object B(InterfaceC0699m interfaceC0699m, Object obj) {
        return null;
    }

    @Override
    public final K a0(p101l7.c fqName) {
        kotlin.jvm.internal.m.e(fqName, "fqName");
        throw new IllegalStateException("Should not be called!");
    }

    @Override
    public final List c0() {
        return j;
    }

    @Override
    public final Object d0(A capability) {
        kotlin.jvm.internal.m.e(capability, "capability");
        return null;
    }

    @Override
    public final K6.i g() {
        return (K6.i) f3232k.getValue();
    }

    @Override
    public final O6.h getAnnotations() {
        return O6.g.f7987a;
    }

    @Override
    public final p101l7.e getName() {
        return f3231i;
    }

    @Override
    public final InterfaceC0697k h() {
        return null;
    }

    @Override
    public final Collection k(p101l7.c fqName, p194x6.j jVar) {
        kotlin.jvm.internal.m.e(fqName, "fqName");
        return w.f23205h;
    }

    @Override
    public final boolean n(B targetModule) {
        kotlin.jvm.internal.m.e(targetModule, "targetModule");
        return false;
    }

    @Override
    public final InterfaceC0697k a() {
        return this;
    }
}
