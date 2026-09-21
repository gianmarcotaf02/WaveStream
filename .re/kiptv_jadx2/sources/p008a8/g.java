package p008a8;

import N6.A;
import S7.C0895k;
import S7.H0;
import S7.InterfaceC0892i;
import S7.InterfaceC0894j;
import S7.J;
import X7.q;
import com.google.common.util.concurrent.P;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.m;
import p070h6.e;
import p078i6.o;
import p100l6.h;
import p109m6.a;
import p117n6.c;
import p121o0.p;
import p194x6.j;

public final class g implements InterfaceC0892i, h, H0 {

    public static final AtomicReferenceFieldUpdater f15533m = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "state$volatile");

    public final h f15534h;
    public Object j;
    private volatile Object state$volatile = j.f15539a;

    public ArrayList f15535i = new ArrayList(2);

    public int f15536k = -1;

    public Object f15537l = j.f15542d;

    public g(h hVar) {
        this.f15534h = hVar;
    }

    @Override
    public final void a(q qVar, int i3) {
        this.j = qVar;
        this.f15536k = i3;
    }

    @Override
    public final void b(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15533m;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == j.f15540b) {
                return;
            }
            A a2 = j.f15541c;
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, a2)) {
                    ArrayList arrayList = this.f15535i;
                    if (arrayList == null) {
                        return;
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((e) it.next()).a();
                    }
                    this.f15537l = j.f15542d;
                    this.f15535i = null;
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj);
        }
    }

    public final Object c(c cVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15533m;
        Object obj = atomicReferenceFieldUpdater.get(this);
        m.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation.ClauseData<R of kotlinx.coroutines.selects.SelectImplementation>");
        e eVar = (e) obj;
        Object obj2 = this.f15537l;
        ArrayList<e> arrayList = this.f15535i;
        if (arrayList != null) {
            for (e eVar2 : arrayList) {
                if (eVar2 != eVar) {
                    eVar2.a();
                }
            }
            atomicReferenceFieldUpdater.set(this, j.f15540b);
            this.f15537l = j.f15542d;
            this.f15535i = null;
        }
        Object objInvoke = eVar.f15525c.invoke(eVar.f15523a, eVar.f15526d, obj2);
        A a2 = j.f15543e;
        e eVar3 = eVar.f15527e;
        return eVar.f15526d == a2 ? ((j) eVar3).invoke(cVar) : ((p194x6.m) eVar3).invoke(objInvoke, cVar);
    }

    public final Object d(c cVar) throws J {
        f fVar;
        Object obj;
        g gVar;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i3 = fVar.f15532k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                fVar.f15532k = i3 - Integer.MIN_VALUE;
            } else {
                fVar = new f(this, cVar);
            }
        } else {
            fVar = new f(this, cVar);
        }
        Object obj2 = fVar.f15531i;
        a aVar = a.f25430h;
        int i9 = fVar.f15532k;
        if (i9 == 0) {
            P.u0(obj2);
            fVar.f15530h = this;
            fVar.f15532k = 1;
            C0895k c0895k = new C0895k(1, P.h0(fVar));
            c0895k.r();
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15533m;
                Object obj3 = atomicReferenceFieldUpdater.get(this);
                A a2 = j.f15539a;
                obj = p070h6.A.f22523a;
                if (obj3 == a2) {
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, obj3, c0895k)) {
                            c0895k.u(this);
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == obj3);
                } else {
                    if (!(obj3 instanceof List)) {
                        if (!(obj3 instanceof e)) {
                            throw new IllegalStateException(p.n(obj3, "unexpected state: "));
                        }
                        ((e) obj3).getClass();
                        c0895k.g(obj, null);
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, obj3, a2)) {
                            Iterator it = ((Iterable) obj3).iterator();
                            while (it.hasNext()) {
                                e eVarE = e(it.next());
                                m.b(eVarE);
                                eVarE.f15528f = null;
                                eVarE.g = -1;
                                f(eVarE, true);
                            }
                            break;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == obj3);
                }
            }
            Object objQ = c0895k.q();
            if (objQ == a.f25430h) {
                obj = objQ;
            }
            if (obj != aVar) {
                gVar = this;
            }
        }
        if (i9 != 1) {
            if (i9 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            P.u0(obj2);
            return obj2;
        }
        gVar = fVar.f15530h;
        P.u0(obj2);
        fVar.f15530h = null;
        fVar.f15532k = 2;
        Object objC = gVar.c(fVar);
        return objC == aVar ? aVar : objC;
    }

    public final e e(Object obj) {
        ArrayList arrayList = this.f15535i;
        Object obj2 = null;
        if (arrayList == null) {
            return null;
        }
        for (Object obj3 : arrayList) {
            if (((e) obj3).f15523a == obj) {
                obj2 = obj3;
                break;
            }
        }
        e eVar = (e) obj2;
        if (eVar != null) {
            return eVar;
        }
        throw new IllegalStateException(("Clause with object " + obj + " is not found").toString());
    }

    public final void f(e eVar, boolean z6) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15533m;
        if (atomicReferenceFieldUpdater.get(this) instanceof e) {
            return;
        }
        Object obj = eVar.f15523a;
        if (!z6) {
            ArrayList arrayList = this.f15535i;
            m.b(arrayList);
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((e) it.next()).f15523a == obj) {
                        throw new IllegalStateException(("Cannot use select clauses on the same object: " + obj).toString());
                    }
                }
            }
        }
        eVar.f15524b.invoke(obj, this, eVar.f15526d);
        if (this.f15537l != j.f15542d) {
            atomicReferenceFieldUpdater.set(this, eVar);
            return;
        }
        if (!z6) {
            ArrayList arrayList2 = this.f15535i;
            m.b(arrayList2);
            arrayList2.add(eVar);
        }
        eVar.f15528f = this.j;
        eVar.g = this.f15536k;
        this.j = null;
        this.f15536k = -1;
    }

    public final int g(Object obj, Object obj2) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15533m;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (!(obj3 instanceof InterfaceC0894j)) {
                if (m.a(obj3, j.f15540b) || (obj3 instanceof e)) {
                    return 3;
                }
                if (m.a(obj3, j.f15541c)) {
                    return 2;
                }
                if (m.a(obj3, j.f15539a)) {
                    List listI0 = P.i0(obj);
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, listI0)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj3) {
                        }
                    }
                    return 1;
                }
                if (!(obj3 instanceof List)) {
                    throw new IllegalStateException(p.n(obj3, "Unexpected state: "));
                }
                ArrayList arrayListZ1 = o.z1(obj, (Collection) obj3);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, arrayListZ1)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj3) {
                    }
                }
                return 1;
            }
            e eVarE = e(obj);
            if (eVarE == null) {
                continue;
            } else {
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj3, eVarE)) {
                        InterfaceC0894j interfaceC0894j = (InterfaceC0894j) obj3;
                        this.f15537l = obj2;
                        A aN = interfaceC0894j.n(p070h6.A.f22523a, null);
                        if (aN == null) {
                            this.f15537l = j.f15542d;
                            return 2;
                        }
                        interfaceC0894j.o(aN);
                        return 0;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == obj3);
            }
        }
    }
}
