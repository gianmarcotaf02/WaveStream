package p020c0;

import B.K;
import C5.C0119j;
import C5.C0132n0;
import E2.d;
import R0.Z;
import S2.a;
import S7.C;
import S7.C0889g0;
import S7.C0895k;
import S7.InterfaceC0891h0;
import S7.InterfaceC0894j;
import S7.j0;
import V7.n0;
import V7.r;
import android.support.v4.media.session.q;
import android.util.Log;
import j1.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.m;
import p038e0.e;
import p070h6.A;
import p073i0.b;
import p078i6.o;
import p078i6.u;
import p078i6.w;
import p100l6.h;
import p121o0.f;
import p121o0.g;
import p121o0.k;
import p136q.H;
import p136q.I;
import p136q.Q;

public final class C1718z0 extends AbstractC1709v {

    public final Z f18429a;

    public final q f18430b;

    public final Object f18431c;

    public InterfaceC0891h0 f18432d;

    public Throwable f18433e;

    public final ArrayList f18434f;
    public Object g;

    public I f18435h;

    public final e f18436i;
    public final ArrayList j;

    public final ArrayList f18437k;

    public final H f18438l;

    public final a f18439m;

    public final H f18440n;

    public final H f18441o;

    public ArrayList f18442p;

    public LinkedHashSet f18443q;

    public C0895k f18444r;

    public C1704s0 f18445s;

    public boolean f18446t;

    public final n0 f18447u;

    public final l f18448v;

    public final j0 f18449w;

    public final h f18450x;
    public final C1676e y;

    public static final n0 f18428z = r.b(b.f22743k);

    public static final AtomicReference f18427A = new AtomicReference(Boolean.FALSE);

    public C1718z0(h hVar) {
        Z z6 = new Z(new C1702r0(this, 0));
        this.f18429a = z6;
        this.f18430b = new q(new C1702r0(this, 1));
        this.f18431c = new Object();
        this.f18434f = new ArrayList();
        this.f18435h = new I();
        this.f18436i = new e(new C1715y[16]);
        this.j = new ArrayList();
        this.f18437k = new ArrayList();
        this.f18438l = new H();
        this.f18439m = new a(17);
        this.f18440n = new H();
        this.f18441o = new H();
        this.f18447u = r.b(EnumC1706t0.j);
        this.f18448v = new l(2);
        j0 j0Var = new j0((InterfaceC0891h0) hVar.get(C0889g0.f9584h));
        j0Var.j(new C0132n0(26, this));
        this.f18449w = j0Var;
        this.f18450x = hVar.plus(z6).plus(j0Var);
        this.y = new C1676e(9);
    }

    public static final void G(ArrayList arrayList, C1718z0 c1718z0, C1715y c1715y) {
        arrayList.clear();
        synchronized (c1718z0.f18431c) {
            Iterator it = c1718z0.f18437k.iterator();
            while (it.hasNext()) {
                W w6 = (W) it.next();
                w6.getClass();
                if (m.a(null, c1715y)) {
                    arrayList.add(w6);
                    it.remove();
                }
            }
        }
    }

    public static void w(p121o0.b bVar) {
        try {
            if (bVar.w() instanceof g) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
            bVar.c();
        } catch (Throwable th) {
            bVar.c();
            throw th;
        }
    }

    public final boolean A() {
        return this.f18436i.j != 0 || z() || B() || this.f18438l.j();
    }

    public final boolean B() {
        return !this.f18446t && (((p089k0.a) ((d) this.f18430b.j).j).get() & 134217727) > 0;
    }

    public final boolean C() {
        boolean z6;
        synchronized (this.f18431c) {
            z6 = this.f18435h.h() || this.f18436i.j != 0 || z() || B();
        }
        return z6;
    }

    public final List D() {
        ?? r9 = this.g;
        if (r9 != 0) {
            return r9;
        }
        ArrayList arrayList = this.f18434f;
        List arrayList2 = arrayList.isEmpty() ? w.f23205h : new ArrayList(arrayList);
        this.g = arrayList2;
        return arrayList2;
    }

    public final void E() {
        InterfaceC0894j interfaceC0894jY;
        synchronized (this.f18431c) {
            interfaceC0894jY = y();
            if (((EnumC1706t0) this.f18447u.getValue()).compareTo(EnumC1706t0.f18369i) <= 0) {
                throw C.a("Recomposer shutdown; frame clock awaiter will never resume", this.f18433e);
            }
        }
        if (interfaceC0894jY != null) {
            ((C0895k) interfaceC0894jY).resumeWith(A.f22523a);
        }
    }

    public final void F(C1715y c1715y) {
        synchronized (this.f18431c) {
            ArrayList arrayList = this.f18437k;
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((W) arrayList.get(i3)).getClass();
                if (m.a(null, c1715y)) {
                    ArrayList arrayList2 = new ArrayList();
                    G(arrayList2, this, c1715y);
                    while (!arrayList2.isEmpty()) {
                        H(arrayList2, null);
                        G(arrayList2, this, c1715y);
                    }
                    return;
                }
            }
        }
    }

    public final List H(List list, I i3) {
        p121o0.b bVarC;
        ArrayList arrayList;
        HashMap map = new HashMap(list.size());
        int size = list.size();
        for (int i9 = 0; i9 < size; i9++) {
            Object obj = list.get(i9);
            ((W) obj).getClass();
            Object arrayList2 = map.get(null);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                map.put(null, arrayList2);
            }
            ((ArrayList) arrayList2).add(obj);
        }
        for (Map.Entry entry : map.entrySet()) {
            C1715y c1715y = (C1715y) entry.getKey();
            List list2 = (List) entry.getValue();
            if (c1715y.f18396C.f18310F) {
                AbstractC1705t.a("Check failed");
            }
            C0132n0 c0132n0 = new C0132n0(25, c1715y);
            K k9 = new K(c1715y, i3, 28);
            f fVarJ = k.j();
            p121o0.b bVar = fVarJ instanceof p121o0.b ? (p121o0.b) fVarJ : null;
            if (bVar == null || (bVarC = bVar.C(c0132n0, k9)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                f fVarJ2 = bVarC.j();
                try {
                    synchronized (this.f18431c) {
                        try {
                            arrayList = new ArrayList(list2.size());
                            int size2 = list2.size();
                            for (int i10 = 0; i10 < size2; i10++) {
                                W w6 = (W) list2.get(i10);
                                H h9 = this.f18438l;
                                w6.getClass();
                                Object objA = p038e0.a.a(h9);
                                arrayList.add(new p070h6.k(w6, objA));
                            }
                            int size3 = arrayList.size();
                            for (int i11 = 0; i11 < size3; i11++) {
                                p070h6.k kVar = (p070h6.k) arrayList.get(i11);
                                if (kVar.f22540i == null) {
                                    a aVar = this.f18439m;
                                    ((W) kVar.f22539h).getClass();
                                    if (((H) aVar.f9211i).b(null)) {
                                        ArrayList arrayList3 = new ArrayList(arrayList.size());
                                        int size4 = arrayList.size();
                                        for (int i12 = 0; i12 < size4; i12++) {
                                            p070h6.k kVar2 = (p070h6.k) arrayList.get(i12);
                                            if (kVar2.f22540i == null) {
                                                a aVar2 = this.f18439m;
                                                ((W) kVar2.f22539h).getClass();
                                                H h10 = (H) aVar2.f9211i;
                                                if (h10.i()) {
                                                    ((H) aVar2.j).a();
                                                }
                                            }
                                            arrayList3.add(kVar2);
                                        }
                                        arrayList = arrayList3;
                                        break;
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    int size5 = arrayList.size();
                    for (int i13 = 0; i13 < size5; i13++) {
                        if (((p070h6.k) arrayList.get(i13)).f22540i != null) {
                            int size6 = arrayList.size();
                            for (int i14 = 0; i14 < size6; i14++) {
                                if (((p070h6.k) arrayList.get(i14)).f22540i == null) {
                                    ArrayList arrayList4 = new ArrayList(arrayList.size());
                                    int size7 = arrayList.size();
                                    for (int i15 = 0; i15 < size7; i15++) {
                                        p070h6.k kVar3 = (p070h6.k) arrayList.get(i15);
                                        if (kVar3.f22540i == null) {
                                        }
                                    }
                                    synchronized (this.f18431c) {
                                        u.M0(this.f18437k, arrayList4);
                                    }
                                    ArrayList arrayList5 = new ArrayList(arrayList.size());
                                    int size8 = arrayList.size();
                                    for (int i16 = 0; i16 < size8; i16++) {
                                        Object obj2 = arrayList.get(i16);
                                        if (((p070h6.k) obj2).f22540i != null) {
                                            arrayList5.add(obj2);
                                        }
                                    }
                                    arrayList = arrayList5;
                                    break;
                                }
                            }
                            break;
                        }
                    }
                    c1715y.r(arrayList);
                    f.q(fVarJ2);
                    w(bVarC);
                } catch (Throwable th2) {
                    f.q(fVarJ2);
                    throw th2;
                }
            } catch (Throwable th3) {
                w(bVarC);
                throw th3;
            }
        }
        return o.N1(map.keySet());
    }

    public final C1715y I(C1715y c1715y, I i3) {
        p121o0.b bVarC;
        if (c1715y.f18396C.f18310F || c1715y.f18397D == 3) {
            return null;
        }
        LinkedHashSet linkedHashSet = this.f18443q;
        if (linkedHashSet == null || !linkedHashSet.contains(c1715y)) {
            C0132n0 c0132n0 = new C0132n0(25, c1715y);
            K k9 = new K(c1715y, i3, 28);
            f fVarJ = k.j();
            p121o0.b bVar = fVarJ instanceof p121o0.b ? (p121o0.b) fVarJ : null;
            if (bVar == null || (bVarC = bVar.C(c0132n0, k9)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                f fVarJ2 = bVarC.j();
                if (i3 != null) {
                    try {
                        if (i3.h()) {
                            C0119j c0119j = new C0119j(i3, c1715y, 28);
                            C1700q c1700q = c1715y.f18396C;
                            if (c1700q.f18310F) {
                                AbstractC1705t.a("Preparing a composition while composing is not supported");
                            }
                            c1700q.f18310F = true;
                            try {
                                c0119j.invoke();
                                c1700q.f18310F = false;
                            } catch (Throwable th) {
                                c1700q.f18310F = false;
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        f.q(fVarJ2);
                        throw th2;
                    }
                }
                boolean zX = c1715y.x();
                f.q(fVarJ2);
                w(bVarC);
                if (zX) {
                    return c1715y;
                }
            } catch (Throwable th3) {
                w(bVarC);
                throw th3;
            }
        }
        return null;
    }

    public final void J(Throwable th, C1715y c1715y) throws Throwable {
        if (!((Boolean) f18427A.get()).booleanValue() || (th instanceof C1688k)) {
            synchronized (this.f18431c) {
                Log.e("ComposeInternal", "Error was captured in composition.", th);
                C1704s0 c1704s0 = this.f18445s;
                if (c1704s0 != null) {
                    throw ((Throwable) c1704s0.f18362i);
                }
                this.f18445s = new C1704s0(0, th);
            }
            throw th;
        }
        synchronized (this.f18431c) {
            try {
                Log.e("ComposeInternal", "Error was captured in composition while live edit was enabled.", th);
                this.j.clear();
                this.f18436i.i();
                this.f18435h = new I();
                this.f18437k.clear();
                this.f18438l.a();
                this.f18440n.a();
                this.f18445s = new C1704s0(0, th);
                if (c1715y != null) {
                    L(c1715y);
                }
                y();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean K() {
        boolean zA;
        synchronized (this.f18431c) {
            if (this.f18435h.g()) {
                return A();
            }
            List listD = D();
            p038e0.h hVar = new p038e0.h(this.f18435h);
            this.f18435h = new I();
            try {
                int size = listD.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ((C1715y) listD.get(i3)).y(hVar);
                    if (((EnumC1706t0) this.f18447u.getValue()).compareTo(EnumC1706t0.f18369i) <= 0) {
                        break;
                    }
                }
                synchronized (this.f18431c) {
                    if (y() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                    zA = A();
                }
                return zA;
            } catch (Throwable th) {
                synchronized (this.f18431c) {
                    I i9 = this.f18435h;
                    i9.getClass();
                    Iterator<E> it = hVar.iterator();
                    while (it.hasNext()) {
                        i9.j(it.next());
                    }
                    throw th;
                }
            }
        }
    }

    public final void L(C1715y c1715y) {
        ArrayList arrayList = this.f18442p;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f18442p = arrayList;
        }
        if (!arrayList.contains(c1715y)) {
            arrayList.add(c1715y);
        }
        if (this.f18434f.remove(c1715y)) {
            this.g = null;
        }
    }

    @Override
    public final void a(C1715y c1715y, p194x6.m mVar) throws Throwable {
        EnumC1706t0 enumC1706t0;
        boolean zContains;
        p121o0.b bVarC;
        boolean z6 = c1715y.f18396C.f18310F;
        synchronized (this.f18431c) {
            EnumC1706t0 enumC1706t1 = (EnumC1706t0) this.f18447u.getValue();
            enumC1706t0 = EnumC1706t0.f18369i;
            zContains = enumC1706t1.compareTo(enumC1706t0) > 0 ? true ^ D().contains(c1715y) : true;
        }
        try {
            C0132n0 c0132n0 = new C0132n0(25, c1715y);
            K k9 = new K(c1715y, null, 28);
            f fVarJ = k.j();
            p121o0.b bVar = fVarJ instanceof p121o0.b ? (p121o0.b) fVarJ : null;
            if (bVar == null || (bVarC = bVar.C(c0132n0, k9)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                f fVarJ2 = bVarC.j();
                try {
                    c1715y.j(mVar);
                    f.q(fVarJ2);
                    w(bVarC);
                    synchronized (this.f18431c) {
                        if (((EnumC1706t0) this.f18447u.getValue()).compareTo(enumC1706t0) > 0 && !D().contains(c1715y)) {
                            this.f18434f.add(c1715y);
                            this.g = null;
                        }
                    }
                    if (!z6) {
                        k.j().m();
                    }
                    try {
                        F(c1715y);
                        try {
                            c1715y.d();
                            c1715y.f();
                            if (z6) {
                                return;
                            }
                            k.j().m();
                        } catch (Throwable th) {
                            J(th, null);
                        }
                    } catch (Throwable th2) {
                        J(th2, c1715y);
                    }
                } catch (Throwable th3) {
                    f.q(fVarJ2);
                    throw th3;
                }
            } catch (Throwable th4) {
                w(bVarC);
                throw th4;
            }
        } catch (Throwable th5) {
            if (zContains) {
                synchronized (this.f18431c) {
                }
            }
            J(th5, c1715y);
        }
    }

    @Override
    public final I b(C1715y c1715y, H0 h9, p194x6.m mVar) {
        l lVar = this.f18448v;
        try {
            H0 h10 = c1715y.f18412w;
            c1715y.f18412w = h9;
            try {
                a(c1715y, mVar);
                I i3 = (I) lVar.i();
                if (i3 == null) {
                    I i9 = Q.f26352a;
                    m.c(i9, "null cannot be cast to non-null type androidx.collection.ScatterSet<E of androidx.collection.ScatterSetKt.emptyScatterSet>");
                    i3 = i9;
                }
                lVar.v(null);
                return i3;
            } finally {
                c1715y.f18412w = h10;
            }
        } catch (Throwable th) {
            lVar.v(null);
            throw th;
        }
    }

    @Override
    public final boolean d() {
        return ((Boolean) f18427A.get()).booleanValue();
    }

    @Override
    public final boolean e() {
        return false;
    }

    @Override
    public final boolean f() {
        return false;
    }

    @Override
    public final long g() {
        return 1000;
    }

    @Override
    public final InterfaceC1707u h() {
        return null;
    }

    @Override
    public final h j() {
        return this.f18450x;
    }

    @Override
    public final boolean k() {
        return false;
    }

    @Override
    public final void l(C1715y c1715y) {
        InterfaceC0894j interfaceC0894jY;
        synchronized (this.f18431c) {
            if (this.f18436i.j(c1715y)) {
                interfaceC0894jY = null;
            } else {
                this.f18436i.c(c1715y);
                interfaceC0894jY = y();
            }
        }
        if (interfaceC0894jY != null) {
            ((C0895k) interfaceC0894jY).resumeWith(A.f22523a);
        }
    }

    @Override
    public final V m(W w6) {
        V v6;
        synchronized (this.f18431c) {
            v6 = (V) this.f18440n.k(w6);
        }
        return v6;
    }

    @Override
    public final I n(C1715y c1715y, H0 h9, I i3) {
        l lVar = this.f18448v;
        try {
            K();
            c1715y.y(new p038e0.h(i3));
            H0 h10 = c1715y.f18412w;
            c1715y.f18412w = h9;
            try {
                C1715y c1715yI = I(c1715y, null);
                if (c1715yI != null) {
                    F(c1715y);
                    c1715yI.d();
                    c1715yI.f();
                }
                I i9 = (I) lVar.i();
                if (i9 == null) {
                    I i10 = Q.f26352a;
                    m.c(i10, "null cannot be cast to non-null type androidx.collection.ScatterSet<E of androidx.collection.ScatterSetKt.emptyScatterSet>");
                    i9 = i10;
                }
                lVar.v(null);
                return i9;
            } finally {
                c1715y.f18412w = h10;
            }
        } catch (Throwable th) {
            lVar.v(null);
            throw th;
        }
    }

    @Override
    public final void q(C1701q0 c1701q0) {
        l lVar = this.f18448v;
        I i3 = (I) lVar.i();
        if (i3 == null) {
            I i9 = Q.f26352a;
            i3 = new I();
            lVar.v(i3);
        }
        i3.a(c1701q0);
    }

    @Override
    public final void r(C1715y c1715y) {
        synchronized (this.f18431c) {
            try {
                LinkedHashSet linkedHashSet = this.f18443q;
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                    this.f18443q = linkedHashSet;
                }
                linkedHashSet.add(c1715y);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override
    public final InterfaceC1678f s(A8.m mVar) {
        q qVar = this.f18430b;
        qVar.getClass();
        Z z6 = new Z();
        z6.f18212a = mVar;
        return ((d) qVar.j).h(z6, (C0119j) qVar.f15618k);
    }

    @Override
    public final void v(C1715y c1715y) {
        synchronized (this.f18431c) {
            if (this.f18434f.remove(c1715y)) {
                this.g = null;
            }
            this.f18436i.l(c1715y);
            this.j.remove(c1715y);
        }
    }

    public final void x() {
        synchronized (this.f18431c) {
            if (((EnumC1706t0) this.f18447u.getValue()).compareTo(EnumC1706t0.f18371l) >= 0) {
                n0 n0Var = this.f18447u;
                EnumC1706t0 enumC1706t0 = EnumC1706t0.f18369i;
                n0Var.getClass();
                n0Var.i(null, enumC1706t0);
            }
        }
        this.f18449w.e(null);
    }

    public final InterfaceC0894j y() {
        EnumC1706t0 enumC1706t0;
        n0 n0Var = this.f18447u;
        int iCompareTo = ((EnumC1706t0) n0Var.getValue()).compareTo(EnumC1706t0.f18369i);
        ArrayList arrayList = this.f18437k;
        ArrayList arrayList2 = this.j;
        e eVar = this.f18436i;
        if (iCompareTo > 0) {
            if (this.f18445s != null) {
                enumC1706t0 = EnumC1706t0.j;
            } else if (this.f18432d == null) {
                this.f18435h = new I();
                eVar.i();
                enumC1706t0 = (z() || B()) ? EnumC1706t0.f18370k : EnumC1706t0.j;
            } else {
                enumC1706t0 = (eVar.j != 0 || this.f18435h.h() || !arrayList2.isEmpty() || !arrayList.isEmpty() || z() || B() || this.f18438l.j()) ? EnumC1706t0.f18372m : EnumC1706t0.f18371l;
            }
            n0Var.getClass();
            n0Var.i(null, enumC1706t0);
            if (enumC1706t0 != EnumC1706t0.f18372m) {
                return null;
            }
            C0895k c0895k = this.f18444r;
            this.f18444r = null;
            return c0895k;
        }
        List listD = D();
        int size = listD.size();
        for (int i3 = 0; i3 < size; i3++) {
        }
        this.f18434f.clear();
        this.g = w.f23205h;
        this.f18435h = new I();
        eVar.i();
        arrayList2.clear();
        arrayList.clear();
        this.f18442p = null;
        C0895k c0895k2 = this.f18444r;
        if (c0895k2 != null) {
            c0895k2.cancel(null);
        }
        this.f18444r = null;
        this.f18445s = null;
        return null;
    }

    public final boolean z() {
        return !this.f18446t && (((p089k0.a) ((d) this.f18429a.j).j).get() & 134217727) > 0;
    }

    @Override
    public final void o(Set set) {
    }
}
