package Q6;

/* JADX INFO: loaded from: classes4.dex */
public final class A extends Q6.AbstractC0804m implements N6.B {
    public final B7.m j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final K6.i f8534k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final java.util.Map f8535l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Q6.F f8536m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Q6.z f8537n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public N6.J f8538o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f8539p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final B7.e f8540q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final p070h6.p f8541r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(p101l7.e moduleName, B7.m mVar, K6.i iVar, int i3) {
        super(O6.g.f7987a, moduleName);
        p078i6.x xVar = p078i6.x.f23206h;
        kotlin.jvm.internal.m.e(moduleName, "moduleName");
        this.j = mVar;
        this.f8534k = iVar;
        if (!moduleName.f24837i) {
            throw new java.lang.IllegalArgumentException("Module name must be special: " + moduleName);
        }
        this.f8535l = xVar;
        Q6.F.f8554a.getClass();
        Q6.F f9 = (Q6.F) d0(Q6.D.f8552b);
        this.f8536m = f9 == null ? Q6.E.f8553b : f9;
        this.f8539p = true;
        this.f8540q = mVar.b(new C7.C0173e(8, this));
        this.f8541r = com.google.common.util.concurrent.D.B(new K6.l(this, 2));
    }

    @Override // N6.InterfaceC0697k
    public final java.lang.Object B(N6.InterfaceC0699m interfaceC0699m, java.lang.Object obj) {
        return interfaceC0699m.F(this, obj);
    }

    public final void F0() {
        if (this.f8539p) {
            return;
        }
        if (d0(N6.AbstractC0709x.f7425a) != null) {
            throw new java.lang.ClassCastException();
        }
        java.lang.String message = "Accessing invalid module descriptor " + this;
        kotlin.jvm.internal.m.e(message, "message");
        throw new N6.C0708w(message);
    }

    @Override // N6.B
    public final N6.K a0(p101l7.c fqName) {
        kotlin.jvm.internal.m.e(fqName, "fqName");
        F0();
        return (N6.K) this.f8540q.invoke(fqName);
    }

    @Override // N6.B
    public final java.util.List c0() {
        if (this.f8537n != null) {
            return p078i6.w.f23205h;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Dependencies of module ");
        java.lang.String str = getName().f24836h;
        kotlin.jvm.internal.m.d(str, "toString(...)");
        sb.append(str);
        sb.append(" were not set");
        throw new java.lang.AssertionError(sb.toString());
    }

    @Override // N6.B
    public final java.lang.Object d0(N6.A capability) {
        kotlin.jvm.internal.m.e(capability, "capability");
        java.lang.Object obj = this.f8535l.get(capability);
        if (obj == null) {
            return null;
        }
        return obj;
    }

    @Override // N6.B
    public final K6.i g() {
        return this.f8534k;
    }

    @Override // N6.InterfaceC0697k
    public final N6.InterfaceC0697k h() {
        return null;
    }

    @Override // N6.B
    public final java.util.Collection k(p101l7.c fqName, p194x6.j jVar) {
        kotlin.jvm.internal.m.e(fqName, "fqName");
        F0();
        F0();
        return ((Q6.C0803l) this.f8541r.getValue()).k(fqName, jVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // N6.B
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
        if (targetModule instanceof java.lang.Void) {
        }
        return targetModule.c0().contains(this);
    }

    @Override // Q6.AbstractC0804m
    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(Q6.AbstractC0804m.E0(this));
        if (!this.f8539p) {
            sb.append(" !isValid");
        }
        sb.append(" packageFragmentProvider: ");
        N6.J j = this.f8538o;
        sb.append(j != null ? j.getClass().getSimpleName() : null);
        return sb.toString();
    }
}
