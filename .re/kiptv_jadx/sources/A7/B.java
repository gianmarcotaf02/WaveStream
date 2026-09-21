package A7;

/* JADX INFO: loaded from: classes4.dex */
public final class B extends Q6.L implements A7.InterfaceC0059b {

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final p062g7.C2177y f277K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final p079i7.e f278L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final Q6.z f279M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final p079i7.g f280N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final p044e7.g f281O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(N6.InterfaceC0697k containingDeclaration, Q6.L l2, O6.h annotations, p101l7.e eVar, int i3, p062g7.C2177y proto, p079i7.e nameResolver, Q6.z typeTable, p079i7.g versionRequirementTable, p044e7.g gVar, N6.P p2) {
        super(containingDeclaration, l2, annotations, eVar, i3, p2 == null ? N6.P.f7377b : p2);
        kotlin.jvm.internal.m.e(containingDeclaration, "containingDeclaration");
        kotlin.jvm.internal.m.e(annotations, "annotations");
        com.google.android.gms.internal.play_billing.M0.s(i3, "kind");
        kotlin.jvm.internal.m.e(proto, "proto");
        kotlin.jvm.internal.m.e(nameResolver, "nameResolver");
        kotlin.jvm.internal.m.e(typeTable, "typeTable");
        kotlin.jvm.internal.m.e(versionRequirementTable, "versionRequirementTable");
        this.f277K = proto;
        this.f278L = nameResolver;
        this.f279M = typeTable;
        this.f280N = versionRequirementTable;
        this.f281O = gVar;
    }

    @Override // Q6.L, Q6.AbstractC0810t
    public final Q6.AbstractC0810t I0(int i3, N6.InterfaceC0697k newOwner, N6.InterfaceC0706u interfaceC0706u, N6.P p2, O6.h annotations, p101l7.e eVar) {
        p101l7.e eVar2;
        kotlin.jvm.internal.m.e(newOwner, "newOwner");
        com.google.android.gms.internal.play_billing.M0.s(i3, "kind");
        kotlin.jvm.internal.m.e(annotations, "annotations");
        Q6.L l2 = (Q6.L) interfaceC0706u;
        if (eVar == null) {
            p101l7.e name = getName();
            kotlin.jvm.internal.m.d(name, "getName(...)");
            eVar2 = name;
        } else {
            eVar2 = eVar;
        }
        A7.B b9 = new A7.B(newOwner, l2, annotations, eVar2, i3, this.f277K, this.f278L, this.f279M, this.f280N, this.f281O, p2);
        b9.f8677C = this.f8677C;
        return b9;
    }

    @Override // A7.s
    public final Q6.z L() {
        return this.f279M;
    }

    @Override // A7.s
    public final p079i7.e P() {
        return this.f278L;
    }

    @Override // A7.s
    public final A7.r Q() {
        return this.f281O;
    }

    @Override // A7.s
    public final p110m7.AbstractC2629b w() {
        return this.f277K;
    }
}
