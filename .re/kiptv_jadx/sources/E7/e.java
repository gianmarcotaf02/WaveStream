package E7;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements N6.B {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final E7.e f3230h = new E7.e();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final p101l7.e f3231i;
    public static final p078i6.w j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final p070h6.p f3232k;

    static {
        E7.b[] bVarArr = E7.b.f3228h;
        f3231i = p101l7.e.g("<Error module>");
        j = p078i6.w.f23205h;
        f3232k = com.google.common.util.concurrent.D.B(E7.d.f3229h);
    }

    @Override // N6.InterfaceC0697k
    public final java.lang.Object B(N6.InterfaceC0699m interfaceC0699m, java.lang.Object obj) {
        return null;
    }

    @Override // N6.B
    public final N6.K a0(p101l7.c fqName) {
        kotlin.jvm.internal.m.e(fqName, "fqName");
        throw new java.lang.IllegalStateException("Should not be called!");
    }

    @Override // N6.B
    public final java.util.List c0() {
        return j;
    }

    @Override // N6.B
    public final java.lang.Object d0(N6.A capability) {
        kotlin.jvm.internal.m.e(capability, "capability");
        return null;
    }

    @Override // N6.B
    public final K6.i g() {
        return (K6.i) f3232k.getValue();
    }

    @Override // O6.a
    public final O6.h getAnnotations() {
        return O6.g.f7987a;
    }

    @Override // N6.InterfaceC0697k
    public final p101l7.e getName() {
        return f3231i;
    }

    @Override // N6.InterfaceC0697k
    public final N6.InterfaceC0697k h() {
        return null;
    }

    @Override // N6.B
    public final java.util.Collection k(p101l7.c fqName, p194x6.j jVar) {
        kotlin.jvm.internal.m.e(fqName, "fqName");
        return p078i6.w.f23205h;
    }

    @Override // N6.B
    public final boolean n(N6.B targetModule) {
        kotlin.jvm.internal.m.e(targetModule, "targetModule");
        return false;
    }

    @Override // N6.InterfaceC0697k
    public final N6.InterfaceC0697k a() {
        return this;
    }
}
