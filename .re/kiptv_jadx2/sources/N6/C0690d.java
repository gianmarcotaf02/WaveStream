package N6;

import java.util.List;

public final class C0690d implements U {

    public final U f7385h;

    public final InterfaceC0695i f7386i;
    public final int j;

    public C0690d(U u6, InterfaceC0695i declarationDescriptor, int i3) {
        kotlin.jvm.internal.m.e(declarationDescriptor, "declarationDescriptor");
        this.f7385h = u6;
        this.f7386i = declarationDescriptor;
        this.j = i3;
    }

    @Override
    public final Object B(InterfaceC0699m interfaceC0699m, Object obj) {
        return this.f7385h.B(interfaceC0699m, obj);
    }

    @Override
    public final C7.b0 E() {
        C7.b0 b0VarE = this.f7385h.E();
        kotlin.jvm.internal.m.d(b0VarE, "getVariance(...)");
        return b0VarE;
    }

    @Override
    public final B7.p T() {
        B7.p pVarT = this.f7385h.T();
        kotlin.jvm.internal.m.d(pVarT, "getStorageManager(...)");
        return pVarT;
    }

    @Override
    public final boolean X() {
        return true;
    }

    @Override
    public final InterfaceC0694h a() {
        return this.f7385h.a();
    }

    @Override
    public final P d() {
        P pD = this.f7385h.d();
        kotlin.jvm.internal.m.d(pD, "getSource(...)");
        return pD;
    }

    @Override
    public final O6.h getAnnotations() {
        return this.f7385h.getAnnotations();
    }

    @Override
    public final int getIndex() {
        return this.f7385h.getIndex() + this.j;
    }

    @Override
    public final p101l7.e getName() {
        p101l7.e name = this.f7385h.getName();
        kotlin.jvm.internal.m.d(name, "getName(...)");
        return name;
    }

    @Override
    public final List getUpperBounds() {
        List upperBounds = this.f7385h.getUpperBounds();
        kotlin.jvm.internal.m.d(upperBounds, "getUpperBounds(...)");
        return upperBounds;
    }

    @Override
    public final InterfaceC0697k h() {
        return this.f7386i;
    }

    @Override
    public final C7.B j() {
        C7.B bJ = this.f7385h.j();
        kotlin.jvm.internal.m.d(bJ, "getDefaultType(...)");
        return bJ;
    }

    @Override
    public final C7.M o() {
        C7.M mO = this.f7385h.o();
        kotlin.jvm.internal.m.d(mO, "getTypeConstructor(...)");
        return mO;
    }

    public final String toString() {
        return this.f7385h + "[inner-copy]";
    }

    @Override
    public final boolean x() {
        return this.f7385h.x();
    }

    @Override
    public final InterfaceC0697k a() {
        return this.f7385h.a();
    }

    @Override
    public final U a() {
        return this.f7385h.a();
    }
}
