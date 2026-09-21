package V7;

/* JADX INFO: renamed from: V7.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0978d extends W7.g {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f10450m = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(V7.C0978d.class, "consumed$volatile");
    private volatile /* synthetic */ int consumed$volatile;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final U7.C f10451k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f10452l;

    public /* synthetic */ C0978d(U7.C c9, boolean z6) {
        this(c9, z6, p100l6.i.f24820h, -3, U7.EnumC0955c.f10175h);
    }

    @Override // W7.g
    public final java.lang.String b() {
        return "channel=" + this.f10451k;
    }

    @Override // W7.g
    public final java.lang.Object c(U7.A a2, p100l6.c cVar) throws java.lang.Throwable {
        java.lang.Object objN = V7.r.n(new W7.B(a2), this.f10451k, this.f10452l, cVar);
        return objN == p109m6.a.f25430h ? objN : p070h6.A.f22523a;
    }

    @Override // W7.g, V7.InterfaceC0981g
    public final java.lang.Object collect(V7.InterfaceC0982h interfaceC0982h, p100l6.c cVar) throws java.lang.Throwable {
        p070h6.A a2 = p070h6.A.f22523a;
        if (this.f10740i == -3) {
            boolean z6 = this.f10452l;
            if (z6 && f10450m.getAndSet(this, 1) == 1) {
                throw new java.lang.IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once");
            }
            java.lang.Object objN = V7.r.n(interfaceC0982h, this.f10451k, z6, cVar);
            if (objN == p109m6.a.f25430h) {
                return objN;
            }
        } else {
            java.lang.Object objCollect = super.collect(interfaceC0982h, cVar);
            if (objCollect == p109m6.a.f25430h) {
                return objCollect;
            }
        }
        return a2;
    }

    @Override // W7.g
    public final W7.g d(p100l6.h hVar, int i3, U7.EnumC0955c enumC0955c) {
        return new V7.C0978d(this.f10451k, this.f10452l, hVar, i3, enumC0955c);
    }

    @Override // W7.g
    public final V7.InterfaceC0981g e() {
        return new V7.C0978d(this.f10451k, this.f10452l);
    }

    @Override // W7.g
    public final U7.C f(S7.A a2) {
        if (this.f10452l && f10450m.getAndSet(this, 1) == 1) {
            throw new java.lang.IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once");
        }
        return this.f10740i == -3 ? this.f10451k : super.f(a2);
    }

    public C0978d(U7.C c9, boolean z6, p100l6.h hVar, int i3, U7.EnumC0955c enumC0955c) {
        super(hVar, i3, enumC0955c);
        this.f10451k = c9;
        this.f10452l = z6;
    }
}
