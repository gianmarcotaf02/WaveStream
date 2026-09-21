package H6;

/* JADX INFO: loaded from: classes4.dex */
public final class K extends H6.C0411b0 implements E6.j {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final java.lang.Object f4381v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(H6.G container, Q6.I descriptor) {
        super(container, descriptor);
        kotlin.jvm.internal.m.e(container, "container");
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        this.f4381v = com.google.common.util.concurrent.D.A(p070h6.i.f22537i, new A7.k(8, this));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [h6.h, java.lang.Object] */
    @Override // E6.m
    public final E6.InterfaceC0335h getSetter() {
        return (H6.J) this.f4381v.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [h6.h, java.lang.Object] */
    @Override // E6.j, E6.m
    public final E6.i getSetter() {
        return (H6.J) this.f4381v.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(H6.G container, java.lang.String name, java.lang.String signature, java.lang.Object obj) {
        super(container, name, signature, obj);
        kotlin.jvm.internal.m.e(container, "container");
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(signature, "signature");
        this.f4381v = com.google.common.util.concurrent.D.A(p070h6.i.f22537i, new A7.k(8, this));
    }
}
