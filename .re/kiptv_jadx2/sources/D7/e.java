package D7;

import A7.C0062e;
import C7.AbstractC0171c;
import C7.AbstractC0185q;
import C7.AbstractC0191x;
import C7.B;
import C7.C0190w;
import C7.M;
import C7.P;
import C7.a0;
import C7.b0;
import E6.G;
import N6.U;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;

public final class e {

    public static final e f2473a = new e();

    public static B b(B b9) {
        AbstractC0191x abstractC0191xB;
        M mU0 = b9.u0();
        ?? r9 = 0;
        if (mU0 instanceof p134p7.c) {
            p134p7.c cVar = (p134p7.c) mU0;
            P p2 = cVar.f26252a;
            if (p2.a() != b0.f1576k) {
                p2 = null;
            }
            a0 a0VarX0 = (p2 == null || (abstractC0191xB = p2.b()) == null) ? null : abstractC0191xB.x0();
            if (cVar.f26253b == null) {
                Collection collectionI = cVar.i();
                ArrayList arrayList = new ArrayList(p078i6.q.I0(collectionI, 10));
                Iterator it = collectionI.iterator();
                while (it.hasNext()) {
                    arrayList.add(((AbstractC0191x) it.next()).x0());
                }
                P projection = cVar.f26252a;
                kotlin.jvm.internal.m.e(projection, "projection");
                cVar.f26253b = new i(projection, new C0062e(1, arrayList), (U) r9, 8);
            }
            F7.b bVar = F7.b.f3714h;
            i iVar = cVar.f26253b;
            kotlin.jvm.internal.m.b(iVar);
            return new h(bVar, iVar, a0VarX0, b9.t0(), b9.v0(), 32);
        }
        if (!(mU0 instanceof C0190w) || !b9.v0()) {
            return b9;
        }
        ?? r10 = (C0190w) mU0;
        LinkedHashSet linkedHashSet = r10.f1610b;
        ArrayList arrayList2 = new ArrayList(p078i6.q.I0(linkedHashSet, 10));
        Iterator it2 = linkedHashSet.iterator();
        boolean z6 = false;
        while (it2.hasNext()) {
            arrayList2.add(G.I((AbstractC0191x) it2.next()));
            z6 = true;
        }
        if (z6) {
            AbstractC0191x abstractC0191x = r10.f1609a;
            a0 a0VarI = abstractC0191x != null ? G.I(abstractC0191x) : null;
            arrayList2.isEmpty();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(arrayList2);
            linkedHashSet2.hashCode();
            C0190w c0190w = new C0190w(linkedHashSet2);
            c0190w.f1609a = a0VarI;
            r9 = c0190w;
        }
        if (r9 != 0) {
            r10 = r9;
        }
        return r10.b();
    }

    public final a0 a(F7.d type) {
        a0 a0VarE;
        kotlin.jvm.internal.m.e(type, "type");
        if (!(type instanceof AbstractC0191x)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        a0 a0VarX0 = ((AbstractC0191x) type).x0();
        if (a0VarX0 instanceof B) {
            a0VarE = b((B) a0VarX0);
        } else {
            if (!(a0VarX0 instanceof AbstractC0185q)) {
                throw new I3.b();
            }
            AbstractC0185q abstractC0185q = (AbstractC0185q) a0VarX0;
            B b9 = abstractC0185q.f1599i;
            B b10 = b(b9);
            B b11 = abstractC0185q.j;
            B b12 = b(b11);
            a0VarE = (b10 == b9 && b12 == b11) ? a0VarX0 : AbstractC0171c.e(b10, b12);
        }
        A7.o oVar = new A7.o(1, this, e.class, "prepareType", "prepareType(Lorg/jetbrains/kotlin/types/model/KotlinTypeMarker;)Lorg/jetbrains/kotlin/types/UnwrappedType;", 0, 2);
        AbstractC0191x abstractC0191xF = AbstractC0171c.f(a0VarX0);
        return AbstractC0171c.F(a0VarE, abstractC0191xF != null ? (AbstractC0191x) oVar.invoke(abstractC0191xF) : null);
    }
}
