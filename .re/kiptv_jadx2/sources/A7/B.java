package A7;

import N6.InterfaceC0697k;
import N6.InterfaceC0706u;
import N6.P;
import Q6.AbstractC0810t;
import Q6.L;
import com.google.android.gms.internal.play_billing.M0;
import p062g7.C2177y;
import p110m7.AbstractC2629b;

public final class B extends L implements InterfaceC0059b {

    public final C2177y f277K;

    public final p079i7.e f278L;

    public final Q6.z f279M;

    public final p079i7.g f280N;

    public final p044e7.g f281O;

    public B(InterfaceC0697k containingDeclaration, L l2, O6.h annotations, p101l7.e eVar, int i3, C2177y proto, p079i7.e nameResolver, Q6.z typeTable, p079i7.g versionRequirementTable, p044e7.g gVar, P p2) {
        super(containingDeclaration, l2, annotations, eVar, i3, p2 == null ? P.f7377b : p2);
        kotlin.jvm.internal.m.e(containingDeclaration, "containingDeclaration");
        kotlin.jvm.internal.m.e(annotations, "annotations");
        M0.s(i3, "kind");
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

    @Override
    public final AbstractC0810t I0(int i3, InterfaceC0697k newOwner, InterfaceC0706u interfaceC0706u, P p2, O6.h annotations, p101l7.e eVar) {
        p101l7.e eVar2;
        kotlin.jvm.internal.m.e(newOwner, "newOwner");
        M0.s(i3, "kind");
        kotlin.jvm.internal.m.e(annotations, "annotations");
        L l2 = (L) interfaceC0706u;
        if (eVar == null) {
            p101l7.e name = getName();
            kotlin.jvm.internal.m.d(name, "getName(...)");
            eVar2 = name;
        } else {
            eVar2 = eVar;
        }
        B b9 = new B(newOwner, l2, annotations, eVar2, i3, this.f277K, this.f278L, this.f279M, this.f280N, this.f281O, p2);
        b9.f8677C = this.f8677C;
        return b9;
    }

    @Override
    public final Q6.z L() {
        return this.f279M;
    }

    @Override
    public final p079i7.e P() {
        return this.f278L;
    }

    @Override
    public final r Q() {
        return this.f281O;
    }

    @Override
    public final AbstractC2629b w() {
        return this.f277K;
    }
}
