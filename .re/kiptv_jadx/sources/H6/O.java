package H6;

/* JADX INFO: loaded from: classes4.dex */
public final class O extends H6.h0 implements E6.m {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final java.lang.Object f4385v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(H6.G container, Q6.I descriptor) {
        super(container, descriptor);
        kotlin.jvm.internal.m.e(container, "container");
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        this.f4385v = com.google.common.util.concurrent.D.A(p070h6.i.f22537i, new A7.k(10, this));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [h6.h, java.lang.Object] */
    @Override // E6.m
    public final E6.InterfaceC0335h getSetter() {
        return (H6.N) this.f4385v.getValue();
    }
}
