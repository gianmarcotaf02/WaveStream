package Q6;

import C7.AbstractC0191x;
import C7.V;
import N6.AbstractC0702p;
import N6.C0701o;
import N6.InterfaceC0688b;
import N6.InterfaceC0689c;
import N6.InterfaceC0697k;
import N6.InterfaceC0698l;
import N6.InterfaceC0699m;
import N6.X;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class S extends T implements N6.L, X {

    public final int f8605m;

    public final boolean f8606n;

    public final boolean f8607o;

    public final boolean f8608p;

    public final AbstractC0191x f8609q;

    public final S f8610r;

    public S(InterfaceC0688b containingDeclaration, S s9, int i3, O6.h annotations, p101l7.e name, AbstractC0191x outType, boolean z6, boolean z9, boolean z10, AbstractC0191x abstractC0191x, N6.P source) {
        super(containingDeclaration, annotations, name, outType, source);
        kotlin.jvm.internal.m.e(containingDeclaration, "containingDeclaration");
        kotlin.jvm.internal.m.e(annotations, "annotations");
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(outType, "outType");
        kotlin.jvm.internal.m.e(source, "source");
        this.f8605m = i3;
        this.f8606n = z6;
        this.f8607o = z9;
        this.f8608p = z10;
        this.f8609q = abstractC0191x;
        this.f8610r = s9 == null ? this : s9;
    }

    @Override
    public final Object B(InterfaceC0699m interfaceC0699m, Object obj) {
        return interfaceC0699m.q(this, obj);
    }

    public S G0(L6.f fVar, p101l7.e eVar, int i3) {
        O6.h annotations = getAnnotations();
        kotlin.jvm.internal.m.d(annotations, "<get-annotations>(...)");
        AbstractC0191x type = getType();
        kotlin.jvm.internal.m.d(type, "getType(...)");
        boolean zH0 = H0();
        N6.Q q9 = N6.P.f7377b;
        return new S(fVar, null, i3, annotations, eVar, type, zH0, this.f8607o, this.f8608p, this.f8609q, q9);
    }

    public final boolean H0() {
        return this.f8606n && ((InterfaceC0689c) h()).c() != 2;
    }

    @Override
    public final InterfaceC0688b h() {
        InterfaceC0697k interfaceC0697kH = super.h();
        kotlin.jvm.internal.m.c(interfaceC0697kH, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
        return (InterfaceC0688b) interfaceC0697kH;
    }

    @Override
    public final S a() {
        S s9 = this.f8610r;
        return s9 == this ? this : s9.a();
    }

    @Override
    public final p142q7.g M() {
        return null;
    }

    @Override
    public final boolean U() {
        return false;
    }

    @Override
    public final InterfaceC0698l b(V substitutor) {
        kotlin.jvm.internal.m.e(substitutor, "substitutor");
        if (substitutor.f1567a.e()) {
            return this;
        }
        throw new UnsupportedOperationException();
    }

    @Override
    public final C0701o getVisibility() {
        C0701o LOCAL = AbstractC0702p.f7407f;
        kotlin.jvm.internal.m.d(LOCAL, "LOCAL");
        return LOCAL;
    }

    @Override
    public final Collection i() {
        Collection collectionI = h().i();
        kotlin.jvm.internal.m.d(collectionI, "getOverriddenDescriptors(...)");
        Collection collection = collectionI;
        ArrayList arrayList = new ArrayList(p078i6.q.I0(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add((S) ((InterfaceC0688b) it.next()).O().get(this.f8605m));
        }
        return arrayList;
    }
}
