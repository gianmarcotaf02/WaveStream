package p020c0;

/* JADX INFO: renamed from: c0.z0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1718z0 extends p020c0.AbstractC1709v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final R0.Z f18429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final android.support.v4.media.session.q f18430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.Object f18431c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public S7.InterfaceC0891h0 f18432d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public java.lang.Throwable f18433e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f18434f;
    public java.lang.Object g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p136q.I f18435h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p038e0.e f18436i;
    public final java.util.ArrayList j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final java.util.ArrayList f18437k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p136q.H f18438l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final S2.a f18439m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p136q.H f18440n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final p136q.H f18441o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public java.util.ArrayList f18442p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public java.util.LinkedHashSet f18443q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public S7.C0895k f18444r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public p020c0.C1704s0 f18445s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f18446t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final V7.n0 f18447u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final j1.l f18448v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final S7.j0 f18449w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final p100l6.h f18450x;
    public final p020c0.C1676e y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final V7.n0 f18428z = V7.r.b(p073i0.b.f22743k);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicReference f18427A = new java.util.concurrent.atomic.AtomicReference(java.lang.Boolean.FALSE);

    public C1718z0(p100l6.h hVar) {
        R0.Z z6 = new R0.Z(new p020c0.C1702r0(this, 0));
        this.f18429a = z6;
        this.f18430b = new android.support.v4.media.session.q(new p020c0.C1702r0(this, 1));
        this.f18431c = new java.lang.Object();
        this.f18434f = new java.util.ArrayList();
        this.f18435h = new p136q.I();
        this.f18436i = new p038e0.e(new p020c0.C1715y[16]);
        this.j = new java.util.ArrayList();
        this.f18437k = new java.util.ArrayList();
        this.f18438l = new p136q.H();
        this.f18439m = new S2.a(17);
        this.f18440n = new p136q.H();
        this.f18441o = new p136q.H();
        this.f18447u = V7.r.b(p020c0.EnumC1706t0.j);
        this.f18448v = new j1.l(2);
        S7.j0 j0Var = new S7.j0((S7.InterfaceC0891h0) hVar.get(S7.C0889g0.f9584h));
        j0Var.j(new C5.C0132n0(26, this));
        this.f18449w = j0Var;
        this.f18450x = hVar.plus(z6).plus(j0Var);
        this.y = new p020c0.C1676e(9);
    }

    public static final void G(java.util.ArrayList arrayList, p020c0.C1718z0 c1718z0, p020c0.C1715y c1715y) {
        arrayList.clear();
        synchronized (c1718z0.f18431c) {
            java.util.Iterator it = c1718z0.f18437k.iterator();
            while (it.hasNext()) {
                p020c0.W w6 = (p020c0.W) it.next();
                w6.getClass();
                if (kotlin.jvm.internal.m.a(null, c1715y)) {
                    arrayList.add(w6);
                    it.remove();
                }
            }
        }
    }

    public static void w(p121o0.b bVar) {
        try {
            if (bVar.w() instanceof p121o0.g) {
                throw new java.lang.IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
            bVar.c();
        } catch (java.lang.Throwable th) {
            bVar.c();
            throw th;
        }
    }

    public final boolean A() {
        return this.f18436i.j != 0 || z() || B() || this.f18438l.j();
    }

    public final boolean B() {
        return !this.f18446t && (((p089k0.a) ((E2.d) this.f18430b.j).j).get() & 134217727) > 0;
    }

    public final boolean C() {
        boolean z6;
        synchronized (this.f18431c) {
            z6 = this.f18435h.h() || this.f18436i.j != 0 || z() || B();
        }
        return z6;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final java.util.List D() {
        ?? r9 = this.g;
        if (r9 != 0) {
            return r9;
        }
        java.util.ArrayList arrayList = this.f18434f;
        java.util.List arrayList2 = arrayList.isEmpty() ? p078i6.w.f23205h : new java.util.ArrayList(arrayList);
        this.g = arrayList2;
        return arrayList2;
    }

    public final void E() {
        S7.InterfaceC0894j interfaceC0894jY;
        synchronized (this.f18431c) {
            interfaceC0894jY = y();
            if (((p020c0.EnumC1706t0) this.f18447u.getValue()).compareTo(p020c0.EnumC1706t0.f18369i) <= 0) {
                throw S7.C.a("Recomposer shutdown; frame clock awaiter will never resume", this.f18433e);
            }
        }
        if (interfaceC0894jY != null) {
            ((S7.C0895k) interfaceC0894jY).resumeWith(p070h6.A.f22523a);
        }
    }

    public final void F(p020c0.C1715y c1715y) {
        synchronized (this.f18431c) {
            java.util.ArrayList arrayList = this.f18437k;
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((p020c0.W) arrayList.get(i3)).getClass();
                if (kotlin.jvm.internal.m.a(null, c1715y)) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
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

    public final java.util.List H(java.util.List list, p136q.I i3) {
        p121o0.b bVarC;
        java.util.ArrayList arrayList;
        java.util.HashMap map = new java.util.HashMap(list.size());
        int size = list.size();
        for (int i9 = 0; i9 < size; i9++) {
            java.lang.Object obj = list.get(i9);
            ((p020c0.W) obj).getClass();
            java.lang.Object arrayList2 = map.get(null);
            if (arrayList2 == null) {
                arrayList2 = new java.util.ArrayList();
                map.put(null, arrayList2);
            }
            ((java.util.ArrayList) arrayList2).add(obj);
        }
        for (java.util.Map.Entry entry : map.entrySet()) {
            p020c0.C1715y c1715y = (p020c0.C1715y) entry.getKey();
            java.util.List list2 = (java.util.List) entry.getValue();
            if (c1715y.f18396C.f18310F) {
                p020c0.AbstractC1705t.a("Check failed");
            }
            C5.C0132n0 c0132n0 = new C5.C0132n0(25, c1715y);
            B.K k9 = new B.K(c1715y, i3, 28);
            p121o0.f fVarJ = p121o0.k.j();
            p121o0.b bVar = fVarJ instanceof p121o0.b ? (p121o0.b) fVarJ : null;
            if (bVar == null || (bVarC = bVar.C(c0132n0, k9)) == null) {
                throw new java.lang.IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                p121o0.f fVarJ2 = bVarC.j();
                try {
                    synchronized (this.f18431c) {
                        try {
                            arrayList = new java.util.ArrayList(list2.size());
                            int size2 = list2.size();
                            for (int i10 = 0; i10 < size2; i10++) {
                                p020c0.W w6 = (p020c0.W) list2.get(i10);
                                p136q.H h9 = this.f18438l;
                                w6.getClass();
                                java.lang.Object objA = p038e0.a.a(h9);
                                arrayList.add(new p070h6.k(w6, objA));
                            }
                            int size3 = arrayList.size();
                            for (int i11 = 0; i11 < size3; i11++) {
                                p070h6.k kVar = (p070h6.k) arrayList.get(i11);
                                if (kVar.f22540i == null) {
                                    S2.a aVar = this.f18439m;
                                    ((p020c0.W) kVar.f22539h).getClass();
                                    if (((p136q.H) aVar.f9211i).b(null)) {
                                        java.util.ArrayList arrayList3 = new java.util.ArrayList(arrayList.size());
                                        int size4 = arrayList.size();
                                        for (int i12 = 0; i12 < size4; i12++) {
                                            p070h6.k kVar2 = (p070h6.k) arrayList.get(i12);
                                            if (kVar2.f22540i == null) {
                                                S2.a aVar2 = this.f18439m;
                                                ((p020c0.W) kVar2.f22539h).getClass();
                                                p136q.H h10 = (p136q.H) aVar2.f9211i;
                                                if (h10.i()) {
                                                    ((p136q.H) aVar2.j).a();
                                                }
                                            }
                                            arrayList3.add(kVar2);
                                        }
                                        arrayList = arrayList3;
                                        break;
                                    }
                                }
                            }
                        } catch (java.lang.Throwable th) {
                            throw th;
                        }
                    }
                    int size5 = arrayList.size();
                    for (int i13 = 0; i13 < size5; i13++) {
                        if (((p070h6.k) arrayList.get(i13)).f22540i != null) {
                            int size6 = arrayList.size();
                            for (int i14 = 0; i14 < size6; i14++) {
                                if (((p070h6.k) arrayList.get(i14)).f22540i == null) {
                                    java.util.ArrayList arrayList4 = new java.util.ArrayList(arrayList.size());
                                    int size7 = arrayList.size();
                                    for (int i15 = 0; i15 < size7; i15++) {
                                        p070h6.k kVar3 = (p070h6.k) arrayList.get(i15);
                                        if (kVar3.f22540i == null) {
                                        }
                                    }
                                    synchronized (this.f18431c) {
                                        p078i6.u.M0(this.f18437k, arrayList4);
                                    }
                                    java.util.ArrayList arrayList5 = new java.util.ArrayList(arrayList.size());
                                    int size8 = arrayList.size();
                                    for (int i16 = 0; i16 < size8; i16++) {
                                        java.lang.Object obj2 = arrayList.get(i16);
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
                    p121o0.f.q(fVarJ2);
                    w(bVarC);
                } catch (java.lang.Throwable th2) {
                    p121o0.f.q(fVarJ2);
                    throw th2;
                }
            } catch (java.lang.Throwable th3) {
                w(bVarC);
                throw th3;
            }
        }
        return p078i6.o.N1(map.keySet());
    }

    public final p020c0.C1715y I(p020c0.C1715y c1715y, p136q.I i3) {
        p121o0.b bVarC;
        if (c1715y.f18396C.f18310F || c1715y.f18397D == 3) {
            return null;
        }
        java.util.LinkedHashSet linkedHashSet = this.f18443q;
        if (linkedHashSet == null || !linkedHashSet.contains(c1715y)) {
            C5.C0132n0 c0132n0 = new C5.C0132n0(25, c1715y);
            B.K k9 = new B.K(c1715y, i3, 28);
            p121o0.f fVarJ = p121o0.k.j();
            p121o0.b bVar = fVarJ instanceof p121o0.b ? (p121o0.b) fVarJ : null;
            if (bVar == null || (bVarC = bVar.C(c0132n0, k9)) == null) {
                throw new java.lang.IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                p121o0.f fVarJ2 = bVarC.j();
                if (i3 != null) {
                    try {
                        if (i3.h()) {
                            C5.C0119j c0119j = new C5.C0119j(i3, c1715y, 28);
                            p020c0.C1700q c1700q = c1715y.f18396C;
                            if (c1700q.f18310F) {
                                p020c0.AbstractC1705t.a("Preparing a composition while composing is not supported");
                            }
                            c1700q.f18310F = true;
                            try {
                                c0119j.invoke();
                                c1700q.f18310F = false;
                            } catch (java.lang.Throwable th) {
                                c1700q.f18310F = false;
                                throw th;
                            }
                        }
                    } catch (java.lang.Throwable th2) {
                        p121o0.f.q(fVarJ2);
                        throw th2;
                    }
                }
                boolean zX = c1715y.x();
                p121o0.f.q(fVarJ2);
                w(bVarC);
                if (zX) {
                    return c1715y;
                }
            } catch (java.lang.Throwable th3) {
                w(bVarC);
                throw th3;
            }
        }
        return null;
    }

    public final void J(java.lang.Throwable th, p020c0.C1715y c1715y) throws java.lang.Throwable {
        if (!((java.lang.Boolean) f18427A.get()).booleanValue() || (th instanceof p020c0.C1688k)) {
            synchronized (this.f18431c) {
                android.util.Log.e("ComposeInternal", "Error was captured in composition.", th);
                p020c0.C1704s0 c1704s0 = this.f18445s;
                if (c1704s0 != null) {
                    throw ((java.lang.Throwable) c1704s0.f18362i);
                }
                this.f18445s = new p020c0.C1704s0(0, th);
            }
            throw th;
        }
        synchronized (this.f18431c) {
            try {
                android.util.Log.e("ComposeInternal", "Error was captured in composition while live edit was enabled.", th);
                this.j.clear();
                this.f18436i.i();
                this.f18435h = new p136q.I();
                this.f18437k.clear();
                this.f18438l.a();
                this.f18440n.a();
                this.f18445s = new p020c0.C1704s0(0, th);
                if (c1715y != null) {
                    L(c1715y);
                }
                y();
            } catch (java.lang.Throwable th2) {
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
            java.util.List listD = D();
            p038e0.h hVar = new p038e0.h(this.f18435h);
            this.f18435h = new p136q.I();
            try {
                int size = listD.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ((p020c0.C1715y) listD.get(i3)).y(hVar);
                    if (((p020c0.EnumC1706t0) this.f18447u.getValue()).compareTo(p020c0.EnumC1706t0.f18369i) <= 0) {
                        break;
                    }
                }
                synchronized (this.f18431c) {
                    if (y() != null) {
                        throw new java.lang.IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                    zA = A();
                }
                return zA;
            } catch (java.lang.Throwable th) {
                synchronized (this.f18431c) {
                    p136q.I i9 = this.f18435h;
                    i9.getClass();
                    java.util.Iterator<E> it = hVar.iterator();
                    while (it.hasNext()) {
                        i9.j(it.next());
                    }
                    throw th;
                }
            }
        }
    }

    public final void L(p020c0.C1715y c1715y) {
        java.util.ArrayList arrayList = this.f18442p;
        if (arrayList == null) {
            arrayList = new java.util.ArrayList();
            this.f18442p = arrayList;
        }
        if (!arrayList.contains(c1715y)) {
            arrayList.add(c1715y);
        }
        if (this.f18434f.remove(c1715y)) {
            this.g = null;
        }
    }

    @Override // p020c0.AbstractC1709v
    public final void a(p020c0.C1715y c1715y, p194x6.m mVar) throws java.lang.Throwable {
        p020c0.EnumC1706t0 enumC1706t0;
        boolean zContains;
        p121o0.b bVarC;
        boolean z6 = c1715y.f18396C.f18310F;
        synchronized (this.f18431c) {
            p020c0.EnumC1706t0 enumC1706t1 = (p020c0.EnumC1706t0) this.f18447u.getValue();
            enumC1706t0 = p020c0.EnumC1706t0.f18369i;
            zContains = enumC1706t1.compareTo(enumC1706t0) > 0 ? true ^ D().contains(c1715y) : true;
        }
        try {
            C5.C0132n0 c0132n0 = new C5.C0132n0(25, c1715y);
            B.K k9 = new B.K(c1715y, null, 28);
            p121o0.f fVarJ = p121o0.k.j();
            p121o0.b bVar = fVarJ instanceof p121o0.b ? (p121o0.b) fVarJ : null;
            if (bVar == null || (bVarC = bVar.C(c0132n0, k9)) == null) {
                throw new java.lang.IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                p121o0.f fVarJ2 = bVarC.j();
                try {
                    c1715y.j(mVar);
                    p121o0.f.q(fVarJ2);
                    w(bVarC);
                    synchronized (this.f18431c) {
                        if (((p020c0.EnumC1706t0) this.f18447u.getValue()).compareTo(enumC1706t0) > 0 && !D().contains(c1715y)) {
                            this.f18434f.add(c1715y);
                            this.g = null;
                        }
                    }
                    if (!z6) {
                        p121o0.k.j().m();
                    }
                    try {
                        F(c1715y);
                        try {
                            c1715y.d();
                            c1715y.f();
                            if (z6) {
                                return;
                            }
                            p121o0.k.j().m();
                        } catch (java.lang.Throwable th) {
                            J(th, null);
                        }
                    } catch (java.lang.Throwable th2) {
                        J(th2, c1715y);
                    }
                } catch (java.lang.Throwable th3) {
                    p121o0.f.q(fVarJ2);
                    throw th3;
                }
            } catch (java.lang.Throwable th4) {
                w(bVarC);
                throw th4;
            }
        } catch (java.lang.Throwable th5) {
            if (zContains) {
                synchronized (this.f18431c) {
                }
            }
            J(th5, c1715y);
        }
    }

    @Override // p020c0.AbstractC1709v
    public final p136q.I b(p020c0.C1715y c1715y, p020c0.H0 h9, p194x6.m mVar) {
        j1.l lVar = this.f18448v;
        try {
            p020c0.H0 h10 = c1715y.f18412w;
            c1715y.f18412w = h9;
            try {
                a(c1715y, mVar);
                p136q.I i3 = (p136q.I) lVar.i();
                if (i3 == null) {
                    p136q.I i9 = p136q.Q.f26352a;
                    kotlin.jvm.internal.m.c(i9, "null cannot be cast to non-null type androidx.collection.ScatterSet<E of androidx.collection.ScatterSetKt.emptyScatterSet>");
                    i3 = i9;
                }
                lVar.v(null);
                return i3;
            } finally {
                c1715y.f18412w = h10;
            }
        } catch (java.lang.Throwable th) {
            lVar.v(null);
            throw th;
        }
    }

    @Override // p020c0.AbstractC1709v
    public final boolean d() {
        return ((java.lang.Boolean) f18427A.get()).booleanValue();
    }

    @Override // p020c0.AbstractC1709v
    public final boolean e() {
        return false;
    }

    @Override // p020c0.AbstractC1709v
    public final boolean f() {
        return false;
    }

    @Override // p020c0.AbstractC1709v
    public final long g() {
        return 1000;
    }

    @Override // p020c0.AbstractC1709v
    public final p020c0.InterfaceC1707u h() {
        return null;
    }

    @Override // p020c0.AbstractC1709v
    public final p100l6.h j() {
        return this.f18450x;
    }

    @Override // p020c0.AbstractC1709v
    public final boolean k() {
        return false;
    }

    @Override // p020c0.AbstractC1709v
    public final void l(p020c0.C1715y c1715y) {
        S7.InterfaceC0894j interfaceC0894jY;
        synchronized (this.f18431c) {
            if (this.f18436i.j(c1715y)) {
                interfaceC0894jY = null;
            } else {
                this.f18436i.c(c1715y);
                interfaceC0894jY = y();
            }
        }
        if (interfaceC0894jY != null) {
            ((S7.C0895k) interfaceC0894jY).resumeWith(p070h6.A.f22523a);
        }
    }

    @Override // p020c0.AbstractC1709v
    public final p020c0.V m(p020c0.W w6) {
        p020c0.V v6;
        synchronized (this.f18431c) {
            v6 = (p020c0.V) this.f18440n.k(w6);
        }
        return v6;
    }

    @Override // p020c0.AbstractC1709v
    public final p136q.I n(p020c0.C1715y c1715y, p020c0.H0 h9, p136q.I i3) {
        j1.l lVar = this.f18448v;
        try {
            K();
            c1715y.y(new p038e0.h(i3));
            p020c0.H0 h10 = c1715y.f18412w;
            c1715y.f18412w = h9;
            try {
                p020c0.C1715y c1715yI = I(c1715y, null);
                if (c1715yI != null) {
                    F(c1715y);
                    c1715yI.d();
                    c1715yI.f();
                }
                p136q.I i9 = (p136q.I) lVar.i();
                if (i9 == null) {
                    p136q.I i10 = p136q.Q.f26352a;
                    kotlin.jvm.internal.m.c(i10, "null cannot be cast to non-null type androidx.collection.ScatterSet<E of androidx.collection.ScatterSetKt.emptyScatterSet>");
                    i9 = i10;
                }
                lVar.v(null);
                return i9;
            } finally {
                c1715y.f18412w = h10;
            }
        } catch (java.lang.Throwable th) {
            lVar.v(null);
            throw th;
        }
    }

    @Override // p020c0.AbstractC1709v
    public final void q(p020c0.C1701q0 c1701q0) {
        j1.l lVar = this.f18448v;
        p136q.I i3 = (p136q.I) lVar.i();
        if (i3 == null) {
            p136q.I i9 = p136q.Q.f26352a;
            i3 = new p136q.I();
            lVar.v(i3);
        }
        i3.a(c1701q0);
    }

    @Override // p020c0.AbstractC1709v
    public final void r(p020c0.C1715y c1715y) {
        synchronized (this.f18431c) {
            try {
                java.util.LinkedHashSet linkedHashSet = this.f18443q;
                if (linkedHashSet == null) {
                    linkedHashSet = new java.util.LinkedHashSet();
                    this.f18443q = linkedHashSet;
                }
                linkedHashSet.add(c1715y);
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // p020c0.AbstractC1709v
    public final p020c0.InterfaceC1678f s(A8.m mVar) {
        android.support.v4.media.session.q qVar = this.f18430b;
        qVar.getClass();
        p020c0.Z z6 = new p020c0.Z();
        z6.f18212a = mVar;
        return ((E2.d) qVar.j).h(z6, (C5.C0119j) qVar.f15618k);
    }

    @Override // p020c0.AbstractC1709v
    public final void v(p020c0.C1715y c1715y) {
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
            if (((p020c0.EnumC1706t0) this.f18447u.getValue()).compareTo(p020c0.EnumC1706t0.f18371l) >= 0) {
                V7.n0 n0Var = this.f18447u;
                p020c0.EnumC1706t0 enumC1706t0 = p020c0.EnumC1706t0.f18369i;
                n0Var.getClass();
                n0Var.i(null, enumC1706t0);
            }
        }
        this.f18449w.e(null);
    }

    public final S7.InterfaceC0894j y() {
        p020c0.EnumC1706t0 enumC1706t0;
        V7.n0 n0Var = this.f18447u;
        int iCompareTo = ((p020c0.EnumC1706t0) n0Var.getValue()).compareTo(p020c0.EnumC1706t0.f18369i);
        java.util.ArrayList arrayList = this.f18437k;
        java.util.ArrayList arrayList2 = this.j;
        p038e0.e eVar = this.f18436i;
        if (iCompareTo > 0) {
            if (this.f18445s != null) {
                enumC1706t0 = p020c0.EnumC1706t0.j;
            } else if (this.f18432d == null) {
                this.f18435h = new p136q.I();
                eVar.i();
                enumC1706t0 = (z() || B()) ? p020c0.EnumC1706t0.f18370k : p020c0.EnumC1706t0.j;
            } else {
                enumC1706t0 = (eVar.j != 0 || this.f18435h.h() || !arrayList2.isEmpty() || !arrayList.isEmpty() || z() || B() || this.f18438l.j()) ? p020c0.EnumC1706t0.f18372m : p020c0.EnumC1706t0.f18371l;
            }
            n0Var.getClass();
            n0Var.i(null, enumC1706t0);
            if (enumC1706t0 != p020c0.EnumC1706t0.f18372m) {
                return null;
            }
            S7.C0895k c0895k = this.f18444r;
            this.f18444r = null;
            return c0895k;
        }
        java.util.List listD = D();
        int size = listD.size();
        for (int i3 = 0; i3 < size; i3++) {
        }
        this.f18434f.clear();
        this.g = p078i6.w.f23205h;
        this.f18435h = new p136q.I();
        eVar.i();
        arrayList2.clear();
        arrayList.clear();
        this.f18442p = null;
        S7.C0895k c0895k2 = this.f18444r;
        if (c0895k2 != null) {
            c0895k2.cancel(null);
        }
        this.f18444r = null;
        this.f18445s = null;
        return null;
    }

    public final boolean z() {
        return !this.f18446t && (((p089k0.a) ((E2.d) this.f18429a.j).j).get() & 134217727) > 0;
    }

    @Override // p020c0.AbstractC1709v
    public final void o(java.util.Set set) {
    }
}
