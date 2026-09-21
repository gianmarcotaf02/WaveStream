package D7;

/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final D7.e f2473a = new D7.e();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [C7.w] */
    /* JADX WARN: Type inference failed for: r0v2, types: [C7.w] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r3v0, types: [N6.U] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v3 */
    public static C7.B b(C7.B b9) {
        C7.AbstractC0191x abstractC0191xB;
        C7.M mU0 = b9.u0();
        ?? r9 = 0;
        if (mU0 instanceof p134p7.c) {
            p134p7.c cVar = (p134p7.c) mU0;
            C7.P p2 = cVar.f26252a;
            if (p2.a() != C7.b0.f1576k) {
                p2 = null;
            }
            C7.a0 a0VarX0 = (p2 == null || (abstractC0191xB = p2.b()) == null) ? null : abstractC0191xB.x0();
            if (cVar.f26253b == null) {
                java.util.Collection collectionI = cVar.i();
                java.util.ArrayList arrayList = new java.util.ArrayList(p078i6.q.I0(collectionI, 10));
                java.util.Iterator it = collectionI.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C7.AbstractC0191x) it.next()).x0());
                }
                C7.P projection = cVar.f26252a;
                kotlin.jvm.internal.m.e(projection, "projection");
                cVar.f26253b = new D7.i(projection, new A7.C0062e(1, arrayList), (N6.U) r9, 8);
            }
            F7.b bVar = F7.b.f3714h;
            D7.i iVar = cVar.f26253b;
            kotlin.jvm.internal.m.b(iVar);
            return new D7.h(bVar, iVar, a0VarX0, b9.t0(), b9.v0(), 32);
        }
        if (!(mU0 instanceof C7.C0190w) || !b9.v0()) {
            return b9;
        }
        ?? r10 = (C7.C0190w) mU0;
        java.util.LinkedHashSet linkedHashSet = r10.f1610b;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(p078i6.q.I0(linkedHashSet, 10));
        java.util.Iterator it2 = linkedHashSet.iterator();
        boolean z6 = false;
        while (it2.hasNext()) {
            arrayList2.add(E6.G.I((C7.AbstractC0191x) it2.next()));
            z6 = true;
        }
        if (z6) {
            C7.AbstractC0191x abstractC0191x = r10.f1609a;
            C7.a0 a0VarI = abstractC0191x != null ? E6.G.I(abstractC0191x) : null;
            arrayList2.isEmpty();
            java.util.LinkedHashSet linkedHashSet2 = new java.util.LinkedHashSet(arrayList2);
            linkedHashSet2.hashCode();
            C7.C0190w c0190w = new C7.C0190w(linkedHashSet2);
            c0190w.f1609a = a0VarI;
            r9 = c0190w;
        }
        if (r9 != 0) {
            r10 = r9;
        }
        return r10.b();
    }

    public final C7.a0 a(F7.d type) {
        C7.a0 a0VarE;
        kotlin.jvm.internal.m.e(type, "type");
        if (!(type instanceof C7.AbstractC0191x)) {
            throw new java.lang.IllegalArgumentException("Failed requirement.");
        }
        C7.a0 a0VarX0 = ((C7.AbstractC0191x) type).x0();
        if (a0VarX0 instanceof C7.B) {
            a0VarE = b((C7.B) a0VarX0);
        } else {
            if (!(a0VarX0 instanceof C7.AbstractC0185q)) {
                throw new I3.b();
            }
            C7.AbstractC0185q abstractC0185q = (C7.AbstractC0185q) a0VarX0;
            C7.B b9 = abstractC0185q.f1599i;
            C7.B b10 = b(b9);
            C7.B b11 = abstractC0185q.j;
            C7.B b12 = b(b11);
            a0VarE = (b10 == b9 && b12 == b11) ? a0VarX0 : C7.AbstractC0171c.e(b10, b12);
        }
        A7.o oVar = new A7.o(1, this, D7.e.class, "prepareType", "prepareType(Lorg/jetbrains/kotlin/types/model/KotlinTypeMarker;)Lorg/jetbrains/kotlin/types/UnwrappedType;", 0, 2);
        C7.AbstractC0191x abstractC0191xF = C7.AbstractC0171c.f(a0VarX0);
        return C7.AbstractC0171c.F(a0VarE, abstractC0191xF != null ? (C7.AbstractC0191x) oVar.invoke(abstractC0191xF) : null);
    }
}
