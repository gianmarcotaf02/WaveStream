package Q6;

/* JADX INFO: loaded from: classes4.dex */
public class S extends Q6.T implements N6.L, N6.X {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f8605m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f8606n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f8607o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f8608p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C7.AbstractC0191x f8609q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Q6.S f8610r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(N6.InterfaceC0688b containingDeclaration, Q6.S s9, int i3, O6.h annotations, p101l7.e name, C7.AbstractC0191x outType, boolean z6, boolean z9, boolean z10, C7.AbstractC0191x abstractC0191x, N6.P source) {
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

    @Override // N6.InterfaceC0697k
    public final java.lang.Object B(N6.InterfaceC0699m interfaceC0699m, java.lang.Object obj) {
        return interfaceC0699m.q(this, obj);
    }

    public Q6.S G0(L6.f fVar, p101l7.e eVar, int i3) {
        O6.h annotations = getAnnotations();
        kotlin.jvm.internal.m.d(annotations, "<get-annotations>(...)");
        C7.AbstractC0191x type = getType();
        kotlin.jvm.internal.m.d(type, "getType(...)");
        boolean zH0 = H0();
        N6.Q q9 = N6.P.f7377b;
        return new Q6.S(fVar, null, i3, annotations, eVar, type, zH0, this.f8607o, this.f8608p, this.f8609q, q9);
    }

    public final boolean H0() {
        return this.f8606n && ((N6.InterfaceC0689c) h()).c() != 2;
    }

    @Override // Q6.AbstractC0805n, N6.InterfaceC0697k
    /* JADX INFO: renamed from: I0, reason: merged with bridge method [inline-methods] */
    public final N6.InterfaceC0688b h() {
        N6.InterfaceC0697k interfaceC0697kH = super.h();
        kotlin.jvm.internal.m.c(interfaceC0697kH, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
        return (N6.InterfaceC0688b) interfaceC0697kH;
    }

    @Override // Q6.AbstractC0805n, Q6.AbstractC0804m, N6.InterfaceC0697k
    /* JADX INFO: renamed from: J0, reason: merged with bridge method [inline-methods] */
    public final Q6.S a() {
        Q6.S s9 = this.f8610r;
        return s9 == this ? this : s9.a();
    }

    @Override // N6.X
    public final /* bridge */ /* synthetic */ p142q7.g M() {
        return null;
    }

    @Override // N6.X
    public final boolean U() {
        return false;
    }

    @Override // N6.S
    public final N6.InterfaceC0698l b(C7.V substitutor) {
        kotlin.jvm.internal.m.e(substitutor, "substitutor");
        if (substitutor.f1567a.e()) {
            return this;
        }
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // N6.InterfaceC0700n
    public final N6.C0701o getVisibility() {
        N6.C0701o LOCAL = N6.AbstractC0702p.f7407f;
        kotlin.jvm.internal.m.d(LOCAL, "LOCAL");
        return LOCAL;
    }

    @Override // N6.InterfaceC0688b
    public final java.util.Collection i() {
        java.util.Collection collectionI = h().i();
        kotlin.jvm.internal.m.d(collectionI, "getOverriddenDescriptors(...)");
        java.util.Collection collection = collectionI;
        java.util.ArrayList arrayList = new java.util.ArrayList(p078i6.q.I0(collection, 10));
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add((Q6.S) ((N6.InterfaceC0688b) it.next()).O().get(this.f8605m));
        }
        return arrayList;
    }
}
