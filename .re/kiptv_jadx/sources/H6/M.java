package H6;

/* JADX INFO: loaded from: classes4.dex */
public final class M extends H6.e0 implements E6.l {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final java.lang.Object f4383w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(H6.G container, java.lang.String name, java.lang.String signature, java.lang.Object obj) {
        super(container, name, signature, obj);
        kotlin.jvm.internal.m.e(container, "container");
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(signature, "signature");
        this.f4383w = com.google.common.util.concurrent.D.A(p070h6.i.f22537i, new A7.k(9, this));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [h6.h, java.lang.Object] */
    @Override // E6.m
    public final E6.InterfaceC0335h getSetter() {
        return (H6.L) this.f4383w.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [h6.h, java.lang.Object] */
    @Override // E6.l
    public final void set(java.lang.Object obj, java.lang.Object obj2) {
        ((H6.L) this.f4383w.getValue()).call(obj, obj2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [h6.h, java.lang.Object] */
    @Override // E6.l, E6.m
    public final E6.k getSetter() {
        return (H6.L) this.f4383w.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(H6.G container, Q6.I descriptor) {
        super(container, descriptor);
        kotlin.jvm.internal.m.e(container, "container");
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        this.f4383w = com.google.common.util.concurrent.D.A(p070h6.i.f22537i, new A7.k(9, this));
    }
}
