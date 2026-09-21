package p121o0;

import D.y;
import Q0.C0781o;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.m;
import p020c0.AbstractC1693m0;
import p056g0.b;
import p056g0.f;
import p056g0.i;
import p201y6.c;

public final class n implements Parcelable, t, List, RandomAccess, c {
    public static final Parcelable.Creator<n> CREATOR = new m(0);

    public s f26001h;

    public n(p056g0.c cVar) {
        f fVarJ = k.j();
        s sVar = new s(fVarJ.g(), cVar);
        if (!(fVarJ instanceof a)) {
            sVar.f26027b = new s(1, cVar);
        }
        this.f26001h = sVar;
    }

    @Override
    public final boolean add(Object obj) {
        int i3;
        p056g0.c cVar;
        f fVarJ;
        boolean zB;
        do {
            synchronized (o.f26002a) {
                s sVar = this.f26001h;
                m.c(sVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                s sVar2 = (s) k.h(sVar);
                i3 = sVar2.f26023d;
                cVar = sVar2.f26022c;
            }
            m.b(cVar);
            p056g0.c cVarN = cVar.n(obj);
            if (cVarN.equals(cVar)) {
                return false;
            }
            s sVar3 = this.f26001h;
            m.c(sVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (k.f25993c) {
                fVarJ = k.j();
                zB = o.b((s) k.w(sVar3, this, fVarJ), i3, cVarN, true);
            }
            k.n(fVarJ, this);
        } while (!zB);
        return true;
    }

    @Override
    public final boolean addAll(int i3, Collection collection) {
        return o.i(this, new y(i3, collection, 5));
    }

    @Override
    public final void clear() {
        f fVarJ;
        s sVar = this.f26001h;
        m.c(sVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
        synchronized (k.f25993c) {
            fVarJ = k.j();
            s sVar2 = (s) k.w(sVar, this, fVarJ);
            synchronized (o.f26002a) {
                sVar2.f26022c = i.f21767i;
                sVar2.f26023d++;
                sVar2.f26024e++;
            }
        }
        k.n(fVarJ, this);
    }

    @Override
    public final boolean contains(Object obj) {
        return o.f(this).f26022c.contains(obj);
    }

    @Override
    public final boolean containsAll(Collection collection) {
        return o.f(this).f26022c.containsAll(collection);
    }

    @Override
    public final v d() {
        return this.f26001h;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final void e(v vVar) {
        vVar.f26027b = this.f26001h;
        this.f26001h = (s) vVar;
    }

    @Override
    public final Object get(int i3) {
        return o.f(this).f26022c.get(i3);
    }

    @Override
    public final int indexOf(Object obj) {
        return o.f(this).f26022c.indexOf(obj);
    }

    @Override
    public final boolean isEmpty() {
        return o.f(this).f26022c.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return listIterator();
    }

    @Override
    public final int lastIndexOf(Object obj) {
        return o.f(this).f26022c.lastIndexOf(obj);
    }

    @Override
    public final ListIterator listIterator() {
        return new C0781o(this, 0);
    }

    public final void o(int i3, int i9) {
        int i10;
        p056g0.c cVar;
        f fVarJ;
        boolean zB;
        do {
            synchronized (o.f26002a) {
                s sVar = this.f26001h;
                m.c(sVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                s sVar2 = (s) k.h(sVar);
                i10 = sVar2.f26023d;
                cVar = sVar2.f26022c;
            }
            m.b(cVar);
            f fVarP = cVar.p();
            fVarP.subList(i3, i9).clear();
            p056g0.c cVarN = fVarP.n();
            if (m.a(cVarN, cVar)) {
                return;
            }
            s sVar3 = this.f26001h;
            m.c(sVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (k.f25993c) {
                fVarJ = k.j();
                zB = o.b((s) k.w(sVar3, this, fVarJ), i10, cVarN, true);
            }
            k.n(fVarJ, this);
        } while (!zB);
    }

    @Override
    public final Object remove(int i3) {
        int i9;
        p056g0.c cVar;
        f fVarJ;
        boolean zB;
        Object obj = get(i3);
        do {
            synchronized (o.f26002a) {
                s sVar = this.f26001h;
                m.c(sVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                s sVar2 = (s) k.h(sVar);
                i9 = sVar2.f26023d;
                cVar = sVar2.f26022c;
            }
            m.b(cVar);
            p056g0.c cVarR = cVar.r(i3);
            if (cVarR.equals(cVar)) {
                break;
            }
            s sVar3 = this.f26001h;
            m.c(sVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (k.f25993c) {
                fVarJ = k.j();
                zB = o.b((s) k.w(sVar3, this, fVarJ), i9, cVarR, true);
            }
            k.n(fVarJ, this);
        } while (!zB);
        return obj;
    }

    @Override
    public final boolean removeAll(Collection collection) {
        int i3;
        p056g0.c cVar;
        f fVarJ;
        boolean zB;
        do {
            synchronized (o.f26002a) {
                s sVar = this.f26001h;
                m.c(sVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                s sVar2 = (s) k.h(sVar);
                i3 = sVar2.f26023d;
                cVar = sVar2.f26022c;
            }
            m.b(cVar);
            p056g0.c cVarQ = cVar.q(new b(0, collection));
            if (m.a(cVarQ, cVar)) {
                return false;
            }
            s sVar3 = this.f26001h;
            m.c(sVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (k.f25993c) {
                fVarJ = k.j();
                zB = o.b((s) k.w(sVar3, this, fVarJ), i3, cVarQ, true);
            }
            k.n(fVarJ, this);
        } while (!zB);
        return true;
    }

    @Override
    public final boolean retainAll(Collection collection) {
        return o.i(this, new b(2, collection));
    }

    @Override
    public final Object set(int i3, Object obj) {
        int i9;
        p056g0.c cVar;
        f fVarJ;
        boolean zB;
        Object obj2 = get(i3);
        do {
            synchronized (o.f26002a) {
                s sVar = this.f26001h;
                m.c(sVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                s sVar2 = (s) k.h(sVar);
                i9 = sVar2.f26023d;
                cVar = sVar2.f26022c;
            }
            m.b(cVar);
            p056g0.c cVarS = cVar.s(i3, obj);
            if (cVarS.equals(cVar)) {
                break;
            }
            s sVar3 = this.f26001h;
            m.c(sVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (k.f25993c) {
                fVarJ = k.j();
                zB = o.b((s) k.w(sVar3, this, fVarJ), i9, cVarS, false);
            }
            k.n(fVarJ, this);
        } while (!zB);
        return obj2;
    }

    @Override
    public final int size() {
        return o.f(this).f26022c.d();
    }

    @Override
    public final List subList(int i3, int i9) {
        if (!(i3 >= 0 && i3 <= i9 && i9 <= size())) {
            AbstractC1693m0.a("fromIndex or toIndex are out of bounds");
        }
        return new w(this, i3, i9);
    }

    @Override
    public final Object[] toArray() {
        return l.a(this);
    }

    public final String toString() {
        s sVar = this.f26001h;
        m.c(sVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return "SnapshotStateList(value=" + ((s) k.h(sVar)).f26022c + ")@" + hashCode();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        p056g0.c cVar = o.f(this).f26022c;
        int iD = cVar.d();
        parcel.writeInt(iD);
        for (int i9 = 0; i9 < iD; i9++) {
            parcel.writeValue(cVar.get(i9));
        }
    }

    @Override
    public final boolean addAll(Collection collection) {
        int i3;
        p056g0.c cVar;
        f fVarJ;
        boolean zB;
        do {
            synchronized (o.f26002a) {
                s sVar = this.f26001h;
                m.c(sVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                s sVar2 = (s) k.h(sVar);
                i3 = sVar2.f26023d;
                cVar = sVar2.f26022c;
            }
            m.b(cVar);
            p056g0.c cVarO = cVar.o(collection);
            if (m.a(cVarO, cVar)) {
                return false;
            }
            s sVar3 = this.f26001h;
            m.c(sVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (k.f25993c) {
                fVarJ = k.j();
                zB = o.b((s) k.w(sVar3, this, fVarJ), i3, cVarO, true);
            }
            k.n(fVarJ, this);
        } while (!zB);
        return true;
    }

    @Override
    public final ListIterator listIterator(int i3) {
        return new C0781o(this, i3);
    }

    @Override
    public final Object[] toArray(Object[] objArr) {
        return l.b(this, objArr);
    }

    public n() {
        this(i.f21767i);
    }

    @Override
    public final void add(int i3, Object obj) {
        int i9;
        p056g0.c cVar;
        f fVarJ;
        boolean zB;
        do {
            synchronized (o.f26002a) {
                s sVar = this.f26001h;
                m.c(sVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                s sVar2 = (s) k.h(sVar);
                i9 = sVar2.f26023d;
                cVar = sVar2.f26022c;
            }
            m.b(cVar);
            p056g0.c cVarE = cVar.e(i3, obj);
            if (cVarE.equals(cVar)) {
                return;
            }
            s sVar3 = this.f26001h;
            m.c(sVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (k.f25993c) {
                fVarJ = k.j();
                zB = o.b((s) k.w(sVar3, this, fVarJ), i9, cVarE, true);
            }
            k.n(fVarJ, this);
        } while (!zB);
    }

    @Override
    public final boolean remove(Object obj) {
        int i3;
        p056g0.c cVar;
        f fVarJ;
        boolean zB;
        do {
            synchronized (o.f26002a) {
                s sVar = this.f26001h;
                m.c(sVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                s sVar2 = (s) k.h(sVar);
                i3 = sVar2.f26023d;
                cVar = sVar2.f26022c;
            }
            m.b(cVar);
            int iIndexOf = cVar.indexOf(obj);
            p056g0.c cVarR = iIndexOf != -1 ? cVar.r(iIndexOf) : cVar;
            if (cVarR.equals(cVar)) {
                return false;
            }
            s sVar3 = this.f26001h;
            m.c(sVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (k.f25993c) {
                fVarJ = k.j();
                zB = o.b((s) k.w(sVar3, this, fVarJ), i3, cVarR, true);
            }
            k.n(fVarJ, this);
        } while (!zB);
        return true;
    }
}
