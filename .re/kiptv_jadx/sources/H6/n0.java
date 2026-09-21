package H6;

/* JADX INFO: loaded from: classes4.dex */
public abstract class n0 extends H6.j0 implements E6.InterfaceC0335h {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ E6.u[] f4460p = {kotlin.jvm.internal.B.f24540a.h(new kotlin.jvm.internal.u(H6.n0.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertySetterDescriptor;", 0))};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final H6.v0 f4461n = p000a.a.A(null, new H6.m0(this, 0));

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final java.lang.Object f4462o = com.google.common.util.concurrent.D.A(p070h6.i.f22537i, new H6.m0(this, 1));

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof H6.n0) && kotlin.jvm.internal.m.a(s(), ((H6.n0) obj).s());
    }

    @Override // E6.InterfaceC0330c
    public final java.lang.String getName() {
        return Y6.f.l(new java.lang.StringBuilder("<set-"), s().f4471o, '>');
    }

    public final int hashCode() {
        return s().hashCode();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [h6.h, java.lang.Object] */
    @Override // H6.AbstractC0428s
    public final I6.g k() {
        return (I6.g) this.f4462o.getValue();
    }

    @Override // H6.AbstractC0428s
    public final N6.InterfaceC0689c n() {
        E6.u uVar = f4460p[0];
        java.lang.Object objInvoke = this.f4461n.invoke();
        kotlin.jvm.internal.m.d(objInvoke, "getValue(...)");
        return (Q6.K) objInvoke;
    }

    @Override // H6.j0
    public final N6.M r() {
        E6.u uVar = f4460p[0];
        java.lang.Object objInvoke = this.f4461n.invoke();
        kotlin.jvm.internal.m.d(objInvoke, "getValue(...)");
        return (Q6.K) objInvoke;
    }

    public final java.lang.String toString() {
        return "setter of " + s();
    }
}
