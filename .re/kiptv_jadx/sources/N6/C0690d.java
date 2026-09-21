package N6;

/* JADX INFO: renamed from: N6.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0690d implements N6.U {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final N6.U f7385h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final N6.InterfaceC0695i f7386i;
    public final int j;

    public C0690d(N6.U u6, N6.InterfaceC0695i declarationDescriptor, int i3) {
        kotlin.jvm.internal.m.e(declarationDescriptor, "declarationDescriptor");
        this.f7385h = u6;
        this.f7386i = declarationDescriptor;
        this.j = i3;
    }

    @Override // N6.InterfaceC0697k
    public final java.lang.Object B(N6.InterfaceC0699m interfaceC0699m, java.lang.Object obj) {
        return this.f7385h.B(interfaceC0699m, obj);
    }

    @Override // N6.U
    public final C7.b0 E() {
        C7.b0 b0VarE = this.f7385h.E();
        kotlin.jvm.internal.m.d(b0VarE, "getVariance(...)");
        return b0VarE;
    }

    @Override // N6.U
    public final B7.p T() {
        B7.p pVarT = this.f7385h.T();
        kotlin.jvm.internal.m.d(pVarT, "getStorageManager(...)");
        return pVarT;
    }

    @Override // N6.U
    public final boolean X() {
        return true;
    }

    @Override // N6.InterfaceC0694h, N6.InterfaceC0697k
    public final N6.InterfaceC0694h a() {
        return this.f7385h.a();
    }

    @Override // N6.InterfaceC0698l
    public final N6.P d() {
        N6.P pD = this.f7385h.d();
        kotlin.jvm.internal.m.d(pD, "getSource(...)");
        return pD;
    }

    @Override // O6.a
    public final O6.h getAnnotations() {
        return this.f7385h.getAnnotations();
    }

    @Override // N6.U
    public final int getIndex() {
        return this.f7385h.getIndex() + this.j;
    }

    @Override // N6.InterfaceC0697k
    public final p101l7.e getName() {
        p101l7.e name = this.f7385h.getName();
        kotlin.jvm.internal.m.d(name, "getName(...)");
        return name;
    }

    @Override // N6.U
    public final java.util.List getUpperBounds() {
        java.util.List upperBounds = this.f7385h.getUpperBounds();
        kotlin.jvm.internal.m.d(upperBounds, "getUpperBounds(...)");
        return upperBounds;
    }

    @Override // N6.InterfaceC0697k
    public final N6.InterfaceC0697k h() {
        return this.f7386i;
    }

    @Override // N6.InterfaceC0694h
    public final C7.B j() {
        C7.B bJ = this.f7385h.j();
        kotlin.jvm.internal.m.d(bJ, "getDefaultType(...)");
        return bJ;
    }

    @Override // N6.InterfaceC0694h
    public final C7.M o() {
        C7.M mO = this.f7385h.o();
        kotlin.jvm.internal.m.d(mO, "getTypeConstructor(...)");
        return mO;
    }

    public final java.lang.String toString() {
        return this.f7385h + "[inner-copy]";
    }

    @Override // N6.U
    public final boolean x() {
        return this.f7385h.x();
    }

    @Override // N6.InterfaceC0697k
    public final N6.InterfaceC0697k a() {
        return this.f7385h.a();
    }

    @Override // N6.U, N6.InterfaceC0694h, N6.InterfaceC0697k
    public final N6.U a() {
        return this.f7385h.a();
    }
}
