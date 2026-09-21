package W5;

import E6.G;
import E6.InterfaceC0331d;
import androidx.lifecycle.X;
import androidx.lifecycle.e0;
import androidx.lifecycle.g0;
import com.google.android.gms.internal.play_billing.AbstractC1833d1;
import java.util.Arrays;
import kotlin.jvm.internal.m;
import p019c.k;
import p076i4.AbstractC2230y;
import p076i4.C2192e0;
import p076i4.X0;
import p194x6.j;

public final class c implements g0 {

    public final int f10600a;

    public final Object f10601b;

    public c(int i3, Object obj) {
        this.f10600a = i3;
        this.f10601b = obj;
    }

    @Override
    public final e0 b(Class cls, p040e2.d dVar) {
        e0 e0Var;
        e0 e0Var2;
        p040e2.e eVar;
        j jVar;
        int i3 = 0;
        Object[] objArr = 0;
        switch (this.f10600a) {
            case 0:
                h hVar = new h();
                p079i7.f fVar = (p079i7.f) this.f10601b;
                p116n5.g gVar = new p116n5.g((p116n5.e) fVar.f23253i, (p116n5.c) fVar.j, X.b(dVar));
                p116n5.g gVar2 = (p116n5.g) ((e) E8.d.O(gVar, e.class));
                gVar2.getClass();
                AbstractC2230y.d(43, "expectedSize");
                C2192e0 c2192e0 = new C2192e0(43);
                c2192e0.c("J5.K", gVar2.f25781c);
                c2192e0.c("J5.X", gVar2.f25782d);
                c2192e0.c("H5.n", gVar2.f25783e);
                c2192e0.c("u5.E", gVar2.f25784f);
                c2192e0.c("J5.u0", gVar2.g);
                c2192e0.c("v5.o", gVar2.f25785h);
                c2192e0.c("v5.d1", gVar2.f25786i);
                c2192e0.c("E5.O", gVar2.j);
                c2192e0.c("s5.w", gVar2.f25787k);
                c2192e0.c("J5.J0", gVar2.f25788l);
                c2192e0.c("J5.O0", gVar2.f25789m);
                c2192e0.c("H5.K", gVar2.f25790n);
                c2192e0.c("w5.W", gVar2.f25791o);
                c2192e0.c("w5.k1", gVar2.f25792p);
                c2192e0.c("x5.s1", gVar2.f25793q);
                c2192e0.c("y5.t", gVar2.f25794r);
                c2192e0.c("J5.g1", gVar2.f25795s);
                c2192e0.c("z5.X", gVar2.f25796t);
                c2192e0.c("z5.J1", gVar2.f25797u);
                c2192e0.c("A5.l", gVar2.f25798v);
                c2192e0.c("J5.n1", gVar2.f25799w);
                c2192e0.c("r5.i", gVar2.f25800x);
                c2192e0.c("J5.w1", gVar2.y);
                c2192e0.c("B5.y", gVar2.f25801z);
                c2192e0.c("M5.d", gVar2.f25761A);
                c2192e0.c("t5.T0", gVar2.f25762B);
                c2192e0.c("J5.U1", gVar2.f25763C);
                c2192e0.c("C5.c2", gVar2.f25764D);
                c2192e0.c("E5.b0", gVar2.f25765E);
                c2192e0.c("E5.p0", gVar2.f25766F);
                c2192e0.c("E5.X0", gVar2.f25767G);
                c2192e0.c("F5.q", gVar2.H);
                c2192e0.c("J5.V1", gVar2.f25768I);
                c2192e0.c("G5.g", gVar2.f25769J);
                c2192e0.c("H5.E0", gVar2.f25770K);
                c2192e0.c("I5.D0", gVar2.f25771L);
                c2192e0.c("I5.P2", gVar2.f25772M);
                c2192e0.c("J5.W1", gVar2.f25773N);
                c2192e0.c("M5.f", gVar2.f25774O);
                c2192e0.c("J5.p2", gVar2.f25775P);
                c2192e0.c("L5.e", gVar2.f25776Q);
                c2192e0.c("J5.N2", gVar2.f25777R);
                c2192e0.c("N5.f", gVar2.f25778S);
                p061g6.a aVar = (p061g6.a) c2192e0.a(true).get(cls.getName());
                j jVar2 = (j) dVar.f21365a.get(f.f10602d);
                ((e) E8.d.O(gVar, e.class)).getClass();
                Object obj = X0.f22848n.get(cls);
                if (obj == null) {
                    if (jVar2 != null) {
                        throw new IllegalStateException("Found creation callback but class " + cls.getName() + " does not have an assisted factory specified in @HiltViewModel.");
                    }
                    if (aVar == null) {
                        throw new IllegalStateException("Expected the @HiltViewModel-annotated class " + cls.getName() + " to be available in the multi-binding of @HiltViewModelMap but none was found.");
                    }
                    e0Var = (e0) aVar.get();
                } else {
                    if (aVar != null) {
                        throw new AssertionError("Found the @HiltViewModel-annotated class " + cls.getName() + " in both the multi-bindings of @HiltViewModelMap and @HiltViewModelAssistedMap.");
                    }
                    if (jVar2 == null) {
                        throw new IllegalStateException("Found @HiltViewModel-annotated class " + cls.getName() + " using @AssistedInject but no creation callback was provided in CreationExtras.");
                    }
                    e0Var = (e0) jVar2.invoke(obj);
                }
                b bVar = new b(hVar);
                e0Var.getClass();
                p057g2.d dVar2 = e0Var.f16352a;
                if (dVar2 != null) {
                    if (dVar2.f21861d) {
                        p057g2.d.a(bVar);
                    } else {
                        synchronized (dVar2.f21858a) {
                            dVar2.f21860c.add(bVar);
                        }
                    }
                }
                return e0Var;
            case 1:
                A.a aVar2 = new A.a(23, (boolean) (objArr == true ? 1 : 0));
                aVar2.f9i = dVar;
                return new X5.d(new p116n5.c(((p116n5.e) ((X5.c) E8.d.O(G.w(((k) this.f10601b).getApplicationContext()), X5.c.class))).f25722b), aVar2);
            default:
                InterfaceC0331d interfaceC0331dA = AbstractC1833d1.A(cls);
                p040e2.e[] eVarArr = (p040e2.e[]) this.f10601b;
                p040e2.e[] initializers = (p040e2.e[]) Arrays.copyOf(eVarArr, eVarArr.length);
                m.e(initializers, "initializers");
                int length = initializers.length;
                while (true) {
                    e0Var2 = null;
                    if (i3 < length) {
                        eVar = initializers[i3];
                        if (!m.a(eVar.f21367a, interfaceC0331dA)) {
                            i3++;
                        }
                    } else {
                        eVar = null;
                    }
                }
                if (eVar != null && (jVar = eVar.f21368b) != null) {
                    e0Var2 = (e0) jVar.invoke(dVar);
                }
                if (e0Var2 != null) {
                    return e0Var2;
                }
                throw new IllegalArgumentException(("No initializer set for given class " + interfaceC0331dA.g()).toString());
        }
    }

    public c(p040e2.e[] initializers) {
        this.f10600a = 2;
        m.e(initializers, "initializers");
        this.f10601b = initializers;
    }
}
