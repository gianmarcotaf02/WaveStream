package C7;

/* JADX INFO: renamed from: C7.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0187t extends C7.T {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final N6.U[] f1602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C7.P[] f1603c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f1604d;

    public C0187t(N6.U[] parameters, C7.P[] arguments, boolean z6) {
        kotlin.jvm.internal.m.e(parameters, "parameters");
        kotlin.jvm.internal.m.e(arguments, "arguments");
        this.f1602b = parameters;
        this.f1603c = arguments;
        this.f1604d = z6;
    }

    @Override // C7.T
    public final boolean b() {
        return this.f1604d;
    }

    @Override // C7.T
    public final C7.P d(C7.AbstractC0191x abstractC0191x) {
        N6.InterfaceC0694h interfaceC0694hH = abstractC0191x.u0().h();
        N6.U u6 = interfaceC0694hH instanceof N6.U ? (N6.U) interfaceC0694hH : null;
        if (u6 != null) {
            int index = u6.getIndex();
            N6.U[] uArr = this.f1602b;
            if (index < uArr.length && kotlin.jvm.internal.m.a(uArr[index].o(), u6.o())) {
                return this.f1603c[index];
            }
        }
        return null;
    }

    @Override // C7.T
    public final boolean e() {
        return this.f1603c.length == 0;
    }
}
