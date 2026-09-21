package H6;

/* JADX INFO: loaded from: classes4.dex */
public final class B extends H6.G implements E6.InterfaceC0331d, H6.C, H6.s0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f4361k = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.Class f4362i;
    public final java.lang.Object j;

    public B(java.lang.Class jClass) {
        kotlin.jvm.internal.m.e(jClass, "jClass");
        this.f4362i = jClass;
        this.j = com.google.common.util.concurrent.D.A(p070h6.i.f22537i, new H6.C0429t(this, 0));
    }

    public static Q6.C0802k w(p101l7.b bVar, S6.e eVar) {
        y7.j jVar = eVar.f9515a;
        M6.n nVar = new M6.n(jVar.f32047b, bVar.f24825a, 1);
        p101l7.e eVarF = bVar.f();
        N6.EnumC0711z enumC0711z = N6.EnumC0711z.f7427i;
        N6.EnumC0692f enumC0692f = N6.EnumC0692f.f7389h;
        java.util.List listI0 = com.google.common.util.concurrent.P.i0(jVar.f32047b.g().k("Any").j());
        B7.m mVar = jVar.f32046a;
        Q6.C0802k c0802k = new Q6.C0802k(nVar, eVarF, enumC0711z, enumC0692f, listI0, mVar);
        c0802k.s0(new H6.C0435z(mVar, c0802k), p078i6.y.f23207h, null);
        return c0802k;
    }

    @Override // kotlin.jvm.internal.InterfaceC2539d
    public final java.lang.Class b() {
        return this.f4362i;
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof H6.B) && com.google.android.gms.internal.play_billing.AbstractC1833d1.y(this).equals(com.google.android.gms.internal.play_billing.AbstractC1833d1.y((E6.InterfaceC0331d) obj));
    }

    @Override // E6.InterfaceC0331d
    public final boolean f() {
        return getDescriptor().f();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [h6.h, java.lang.Object] */
    @Override // E6.InterfaceC0331d
    public final java.lang.String g() {
        H6.C0433x c0433x = (H6.C0433x) this.j.getValue();
        c0433x.getClass();
        E6.u uVar = H6.C0433x.f4506m[3];
        return (java.lang.String) c0433x.f4509e.invoke();
    }

    @Override // E6.InterfaceC0329b
    public final java.util.List getAnnotations() {
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [h6.h, java.lang.Object] */
    @Override // E6.InterfaceC0331d
    public final java.util.List getTypeParameters() {
        H6.C0433x c0433x = (H6.C0433x) this.j.getValue();
        c0433x.getClass();
        E6.u uVar = H6.C0433x.f4506m[6];
        java.lang.Object objInvoke = c0433x.f4510f.invoke();
        kotlin.jvm.internal.m.d(objInvoke, "getValue(...)");
        return (java.util.List) objInvoke;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [h6.h, java.lang.Object] */
    @Override // E6.InterfaceC0331d
    public final java.lang.String h() {
        H6.C0433x c0433x = (H6.C0433x) this.j.getValue();
        c0433x.getClass();
        E6.u uVar = H6.C0433x.f4506m[2];
        return (java.lang.String) c0433x.f4508d.invoke();
    }

    @Override // E6.InterfaceC0331d
    public final int hashCode() {
        return com.google.android.gms.internal.play_billing.AbstractC1833d1.y(this).hashCode();
    }

    @Override // E6.InterfaceC0331d
    public final boolean i(java.lang.Object obj) {
        java.util.List list = T6.AbstractC0926d.f9849a;
        java.lang.Class cls = this.f4362i;
        kotlin.jvm.internal.m.e(cls, "<this>");
        java.lang.Integer num = (java.lang.Integer) T6.AbstractC0926d.f9852d.get(cls);
        if (num != null) {
            return kotlin.jvm.internal.E.d(num.intValue(), obj);
        }
        java.lang.Class cls2 = (java.lang.Class) T6.AbstractC0926d.f9851c.get(cls);
        if (cls2 != null) {
            cls = cls2;
        }
        return cls.isInstance(obj);
    }

    @Override // H6.G
    public final java.util.Collection l() {
        N6.InterfaceC0691e descriptor = getDescriptor();
        if (descriptor.c() == N6.EnumC0692f.f7390i || descriptor.c() == N6.EnumC0692f.f7393m) {
            return p078i6.w.f23205h;
        }
        java.util.Collection collectionQ = descriptor.q();
        kotlin.jvm.internal.m.d(collectionQ, "getConstructors(...)");
        return collectionQ;
    }

    @Override // H6.G
    public final java.util.Collection m(p101l7.e eVar) {
        p180v7.o oVarN = getDescriptor().j().N();
        V6.c cVar = V6.c.f10358i;
        java.util.Collection collectionB = oVarN.b(eVar, cVar);
        p180v7.o oVarJ = getDescriptor().J();
        kotlin.jvm.internal.m.d(oVarJ, "getStaticScope(...)");
        return p078i6.o.A1(collectionB, oVarJ.b(eVar, cVar));
    }

    @Override // H6.G
    public final N6.N n(int i3) {
        java.lang.Class<?> declaringClass;
        java.lang.Class cls = this.f4362i;
        if (cls.getSimpleName().equals("DefaultImpls") && (declaringClass = cls.getDeclaringClass()) != null && declaringClass.isInterface()) {
            return ((H6.B) com.google.android.gms.internal.play_billing.AbstractC1833d1.A(declaringClass)).n(i3);
        }
        N6.InterfaceC0691e descriptor = getDescriptor();
        A7.p pVar = descriptor instanceof A7.p ? (A7.p) descriptor : null;
        if (pVar != null) {
            p110m7.C2641n classLocalVariable = j7.k.j;
            kotlin.jvm.internal.m.d(classLocalVariable, "classLocalVariable");
            p062g7.G g = (p062g7.G) com.google.android.gms.internal.play_billing.AbstractC1853k0.w(pVar.f330l, classLocalVariable, i3);
            if (g != null) {
                y7.l lVar = pVar.f337s;
                return (N6.N) H6.B0.f(this.f4362i, g, lVar.f32070b, lVar.f32072d, pVar.f331m, H6.A.f4359h);
            }
        }
        return null;
    }

    @Override // H6.G
    public final java.util.Collection q(p101l7.e eVar) {
        p180v7.o oVarN = getDescriptor().j().N();
        V6.c cVar = V6.c.f10358i;
        java.util.Collection collectionE = oVarN.e(eVar, cVar);
        p180v7.o oVarJ = getDescriptor().J();
        kotlin.jvm.internal.m.d(oVarJ, "getStaticScope(...)");
        return p078i6.o.A1(collectionE, oVarJ.e(eVar, cVar));
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("class ");
        p101l7.b bVarX = x();
        p101l7.c cVar = bVarX.f24825a;
        java.lang.String strL = cVar.f24829a.c() ? "" : Y6.f.l(new java.lang.StringBuilder(), cVar.f24829a.f24832a, '.');
        sb.append(strL + O7.x.v0(bVarX.f24826b.f24829a.f24832a, '.', '$'));
        return sb.toString();
    }

    public final p101l7.b x() {
        K6.k kVarD;
        p101l7.b bVar = H6.z0.f4517a;
        java.lang.Class klass = this.f4362i;
        kotlin.jvm.internal.m.e(klass, "klass");
        if (klass.isArray()) {
            java.lang.Class<?> componentType = klass.getComponentType();
            kotlin.jvm.internal.m.d(componentType, "getComponentType(...)");
            kVarD = componentType.isPrimitive() ? p169t7.c.b(componentType.getSimpleName()).d() : null;
            if (kVarD != null) {
                return new p101l7.b(K6.p.f6955k, kVarD.f6889i);
            }
            p101l7.c cVarG = K6.o.g.g();
            return new p101l7.b(cVarG.b(), cVarG.f24829a.f());
        }
        if (klass.equals(java.lang.Void.TYPE)) {
            return H6.z0.f4517a;
        }
        kVarD = klass.isPrimitive() ? p169t7.c.b(klass.getSimpleName()).d() : null;
        if (kVarD != null) {
            return new p101l7.b(K6.p.f6955k, kVarD.f6888h);
        }
        p101l7.b bVarA = T6.AbstractC0926d.a(klass);
        if (!bVarA.f24827c) {
            java.lang.String str = M6.d.f7152a;
            p101l7.c fqName = bVarA.a();
            kotlin.jvm.internal.m.e(fqName, "fqName");
            p101l7.b bVar2 = (p101l7.b) M6.d.f7158h.get(fqName.f24829a);
            if (bVar2 != null) {
                return bVar2;
            }
        }
        return bVarA;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [h6.h, java.lang.Object] */
    @Override // H6.C
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public final N6.InterfaceC0691e getDescriptor() {
        return ((H6.C0433x) this.j.getValue()).a();
    }
}
