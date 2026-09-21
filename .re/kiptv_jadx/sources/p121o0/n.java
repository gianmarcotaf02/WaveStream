package p121o0;

/* JADX INFO: loaded from: classes.dex */
public final class n implements android.os.Parcelable, p121o0.t, java.util.List, java.util.RandomAccess, p201y6.c {
    public static final android.os.Parcelable.Creator<p121o0.n> CREATOR = new p121o0.m(0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p121o0.s f26001h;

    public n(p056g0.c cVar) {
        p121o0.f fVarJ = p121o0.k.j();
        p121o0.s sVar = new p121o0.s(fVarJ.g(), cVar);
        if (!(fVarJ instanceof p121o0.a)) {
            sVar.f26027b = new p121o0.s(1, cVar);
        }
        this.f26001h = sVar;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(java.lang.Object obj) {
        int i3;
        p056g0.c cVar;
        p121o0.f fVarJ;
        boolean zB;
        do {
            synchronized (p121o0.o.f26002a) {
                p121o0.s sVar = this.f26001h;
                kotlin.jvm.internal.m.c(sVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                p121o0.s sVar2 = (p121o0.s) p121o0.k.h(sVar);
                i3 = sVar2.f26023d;
                cVar = sVar2.f26022c;
            }
            kotlin.jvm.internal.m.b(cVar);
            p056g0.c cVarN = cVar.n(obj);
            if (cVarN.equals(cVar)) {
                return false;
            }
            p121o0.s sVar3 = this.f26001h;
            kotlin.jvm.internal.m.c(sVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (p121o0.k.f25993c) {
                fVarJ = p121o0.k.j();
                zB = p121o0.o.b((p121o0.s) p121o0.k.w(sVar3, this, fVarJ), i3, cVarN, true);
            }
            p121o0.k.n(fVarJ, this);
        } while (!zB);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i3, java.util.Collection collection) {
        return p121o0.o.i(this, new D.y(i3, collection, 5));
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        p121o0.f fVarJ;
        p121o0.s sVar = this.f26001h;
        kotlin.jvm.internal.m.c(sVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
        synchronized (p121o0.k.f25993c) {
            fVarJ = p121o0.k.j();
            p121o0.s sVar2 = (p121o0.s) p121o0.k.w(sVar, this, fVarJ);
            synchronized (p121o0.o.f26002a) {
                sVar2.f26022c = p056g0.i.f21767i;
                sVar2.f26023d++;
                sVar2.f26024e++;
            }
        }
        p121o0.k.n(fVarJ, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        return p121o0.o.f(this).f26022c.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(java.util.Collection collection) {
        return p121o0.o.f(this).f26022c.containsAll(collection);
    }

    @Override // p121o0.t
    public final p121o0.v d() {
        return this.f26001h;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p121o0.t
    public final void e(p121o0.v vVar) {
        vVar.f26027b = this.f26001h;
        this.f26001h = (p121o0.s) vVar;
    }

    @Override // java.util.List
    public final java.lang.Object get(int i3) {
        return p121o0.o.f(this).f26022c.get(i3);
    }

    @Override // java.util.List
    public final int indexOf(java.lang.Object obj) {
        return p121o0.o.f(this).f26022c.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return p121o0.o.f(this).f26022c.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(java.lang.Object obj) {
        return p121o0.o.f(this).f26022c.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator() {
        return new Q0.C0781o(this, 0);
    }

    public final void o(int i3, int i9) {
        int i10;
        p056g0.c cVar;
        p121o0.f fVarJ;
        boolean zB;
        do {
            synchronized (p121o0.o.f26002a) {
                p121o0.s sVar = this.f26001h;
                kotlin.jvm.internal.m.c(sVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                p121o0.s sVar2 = (p121o0.s) p121o0.k.h(sVar);
                i10 = sVar2.f26023d;
                cVar = sVar2.f26022c;
            }
            kotlin.jvm.internal.m.b(cVar);
            p056g0.f fVarP = cVar.p();
            fVarP.subList(i3, i9).clear();
            p056g0.c cVarN = fVarP.n();
            if (kotlin.jvm.internal.m.a(cVarN, cVar)) {
                return;
            }
            p121o0.s sVar3 = this.f26001h;
            kotlin.jvm.internal.m.c(sVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (p121o0.k.f25993c) {
                fVarJ = p121o0.k.j();
                zB = p121o0.o.b((p121o0.s) p121o0.k.w(sVar3, this, fVarJ), i10, cVarN, true);
            }
            p121o0.k.n(fVarJ, this);
        } while (!zB);
    }

    @Override // java.util.List
    public final java.lang.Object remove(int i3) {
        int i9;
        p056g0.c cVar;
        p121o0.f fVarJ;
        boolean zB;
        java.lang.Object obj = get(i3);
        do {
            synchronized (p121o0.o.f26002a) {
                p121o0.s sVar = this.f26001h;
                kotlin.jvm.internal.m.c(sVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                p121o0.s sVar2 = (p121o0.s) p121o0.k.h(sVar);
                i9 = sVar2.f26023d;
                cVar = sVar2.f26022c;
            }
            kotlin.jvm.internal.m.b(cVar);
            p056g0.c cVarR = cVar.r(i3);
            if (cVarR.equals(cVar)) {
                break;
            }
            p121o0.s sVar3 = this.f26001h;
            kotlin.jvm.internal.m.c(sVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (p121o0.k.f25993c) {
                fVarJ = p121o0.k.j();
                zB = p121o0.o.b((p121o0.s) p121o0.k.w(sVar3, this, fVarJ), i9, cVarR, true);
            }
            p121o0.k.n(fVarJ, this);
        } while (!zB);
        return obj;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        int i3;
        p056g0.c cVar;
        p121o0.f fVarJ;
        boolean zB;
        do {
            synchronized (p121o0.o.f26002a) {
                p121o0.s sVar = this.f26001h;
                kotlin.jvm.internal.m.c(sVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                p121o0.s sVar2 = (p121o0.s) p121o0.k.h(sVar);
                i3 = sVar2.f26023d;
                cVar = sVar2.f26022c;
            }
            kotlin.jvm.internal.m.b(cVar);
            p056g0.c cVarQ = cVar.q(new p056g0.b(0, collection));
            if (kotlin.jvm.internal.m.a(cVarQ, cVar)) {
                return false;
            }
            p121o0.s sVar3 = this.f26001h;
            kotlin.jvm.internal.m.c(sVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (p121o0.k.f25993c) {
                fVarJ = p121o0.k.j();
                zB = p121o0.o.b((p121o0.s) p121o0.k.w(sVar3, this, fVarJ), i3, cVarQ, true);
            }
            p121o0.k.n(fVarJ, this);
        } while (!zB);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        return p121o0.o.i(this, new p056g0.b(2, collection));
    }

    @Override // java.util.List
    public final java.lang.Object set(int i3, java.lang.Object obj) {
        int i9;
        p056g0.c cVar;
        p121o0.f fVarJ;
        boolean zB;
        java.lang.Object obj2 = get(i3);
        do {
            synchronized (p121o0.o.f26002a) {
                p121o0.s sVar = this.f26001h;
                kotlin.jvm.internal.m.c(sVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                p121o0.s sVar2 = (p121o0.s) p121o0.k.h(sVar);
                i9 = sVar2.f26023d;
                cVar = sVar2.f26022c;
            }
            kotlin.jvm.internal.m.b(cVar);
            p056g0.c cVarS = cVar.s(i3, obj);
            if (cVarS.equals(cVar)) {
                break;
            }
            p121o0.s sVar3 = this.f26001h;
            kotlin.jvm.internal.m.c(sVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (p121o0.k.f25993c) {
                fVarJ = p121o0.k.j();
                zB = p121o0.o.b((p121o0.s) p121o0.k.w(sVar3, this, fVarJ), i9, cVarS, false);
            }
            p121o0.k.n(fVarJ, this);
        } while (!zB);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return p121o0.o.f(this).f26022c.d();
    }

    @Override // java.util.List
    public final java.util.List subList(int i3, int i9) {
        if (!(i3 >= 0 && i3 <= i9 && i9 <= size())) {
            p020c0.AbstractC1693m0.a("fromIndex or toIndex are out of bounds");
        }
        return new p121o0.w(this, i3, i9);
    }

    @Override // java.util.List, java.util.Collection
    public final java.lang.Object[] toArray() {
        return kotlin.jvm.internal.l.a(this);
    }

    public final java.lang.String toString() {
        p121o0.s sVar = this.f26001h;
        kotlin.jvm.internal.m.c(sVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return "SnapshotStateList(value=" + ((p121o0.s) p121o0.k.h(sVar)).f26022c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i3) {
        p056g0.c cVar = p121o0.o.f(this).f26022c;
        int iD = cVar.d();
        parcel.writeInt(iD);
        for (int i9 = 0; i9 < iD; i9++) {
            parcel.writeValue(cVar.get(i9));
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(java.util.Collection collection) {
        int i3;
        p056g0.c cVar;
        p121o0.f fVarJ;
        boolean zB;
        do {
            synchronized (p121o0.o.f26002a) {
                p121o0.s sVar = this.f26001h;
                kotlin.jvm.internal.m.c(sVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                p121o0.s sVar2 = (p121o0.s) p121o0.k.h(sVar);
                i3 = sVar2.f26023d;
                cVar = sVar2.f26022c;
            }
            kotlin.jvm.internal.m.b(cVar);
            p056g0.c cVarO = cVar.o(collection);
            if (kotlin.jvm.internal.m.a(cVarO, cVar)) {
                return false;
            }
            p121o0.s sVar3 = this.f26001h;
            kotlin.jvm.internal.m.c(sVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (p121o0.k.f25993c) {
                fVarJ = p121o0.k.j();
                zB = p121o0.o.b((p121o0.s) p121o0.k.w(sVar3, this, fVarJ), i3, cVarO, true);
            }
            p121o0.k.n(fVarJ, this);
        } while (!zB);
        return true;
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator(int i3) {
        return new Q0.C0781o(this, i3);
    }

    @Override // java.util.List, java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] objArr) {
        return kotlin.jvm.internal.l.b(this, objArr);
    }

    public n() {
        this(p056g0.i.f21767i);
    }

    @Override // java.util.List
    public final void add(int i3, java.lang.Object obj) {
        int i9;
        p056g0.c cVar;
        p121o0.f fVarJ;
        boolean zB;
        do {
            synchronized (p121o0.o.f26002a) {
                p121o0.s sVar = this.f26001h;
                kotlin.jvm.internal.m.c(sVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                p121o0.s sVar2 = (p121o0.s) p121o0.k.h(sVar);
                i9 = sVar2.f26023d;
                cVar = sVar2.f26022c;
            }
            kotlin.jvm.internal.m.b(cVar);
            p056g0.c cVarE = cVar.e(i3, obj);
            if (cVarE.equals(cVar)) {
                return;
            }
            p121o0.s sVar3 = this.f26001h;
            kotlin.jvm.internal.m.c(sVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (p121o0.k.f25993c) {
                fVarJ = p121o0.k.j();
                zB = p121o0.o.b((p121o0.s) p121o0.k.w(sVar3, this, fVarJ), i9, cVarE, true);
            }
            p121o0.k.n(fVarJ, this);
        } while (!zB);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(java.lang.Object obj) {
        int i3;
        p056g0.c cVar;
        p121o0.f fVarJ;
        boolean zB;
        do {
            synchronized (p121o0.o.f26002a) {
                p121o0.s sVar = this.f26001h;
                kotlin.jvm.internal.m.c(sVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                p121o0.s sVar2 = (p121o0.s) p121o0.k.h(sVar);
                i3 = sVar2.f26023d;
                cVar = sVar2.f26022c;
            }
            kotlin.jvm.internal.m.b(cVar);
            int iIndexOf = cVar.indexOf(obj);
            p056g0.c cVarR = iIndexOf != -1 ? cVar.r(iIndexOf) : cVar;
            if (cVarR.equals(cVar)) {
                return false;
            }
            p121o0.s sVar3 = this.f26001h;
            kotlin.jvm.internal.m.c(sVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (p121o0.k.f25993c) {
                fVarJ = p121o0.k.j();
                zB = p121o0.o.b((p121o0.s) p121o0.k.w(sVar3, this, fVarJ), i3, cVarR, true);
            }
            p121o0.k.n(fVarJ, this);
        } while (!zB);
        return true;
    }
}
