package p007a7;

/* JADX INFO: loaded from: classes4.dex */
public final class w implements kotlin.jvm.functions.Function0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f15508h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p007a7.A f15509i;

    public /* synthetic */ w(p007a7.A a2, int i3) {
        this.f15508h = i3;
        this.f15509i = a2;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.jvm.functions.Function0
    public final java.lang.Object invoke() {
        switch (this.f15508h) {
            case 0:
                p180v7.f kindFilter = p180v7.f.f29670m;
                p180v7.o.f29695a.getClass();
                p180v7.l lVar = p180v7.l.f29689i;
                p007a7.A a2 = this.f15509i;
                a2.getClass();
                kotlin.jvm.internal.m.e(kindFilter, "kindFilter");
                V6.c cVar = V6.c.f10359k;
                java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
                if (kindFilter.a(p180v7.f.f29669l)) {
                    for (p101l7.e eVar : a2.h(kindFilter, lVar)) {
                        lVar.invoke(eVar);
                        L7.k.a(linkedHashSet, a2.f(eVar, cVar));
                    }
                }
                boolean zA = kindFilter.a(p180v7.f.f29667i);
                java.util.List list = kindFilter.f29677a;
                if (zA && !list.contains(p180v7.b.f29657a)) {
                    for (p101l7.e eVar2 : a2.i(kindFilter, lVar)) {
                        lVar.invoke(eVar2);
                        linkedHashSet.addAll(a2.b(eVar2, cVar));
                    }
                }
                if (kindFilter.a(p180v7.f.j) && !list.contains(p180v7.b.f29657a)) {
                    for (p101l7.e eVar3 : a2.o(kindFilter)) {
                        lVar.invoke(eVar3);
                        linkedHashSet.addAll(a2.e(eVar3, cVar));
                    }
                }
                return p078i6.o.N1(linkedHashSet);
            case 1:
                return this.f15509i.k();
            case 2:
                return this.f15509i.i(p180v7.f.f29673p, null);
            case 3:
                return this.f15509i.o(p180v7.f.f29674q);
            default:
                return this.f15509i.h(p180v7.f.f29672o, null);
        }
    }
}
