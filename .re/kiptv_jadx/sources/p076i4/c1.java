package p076i4;

/* JADX INFO: loaded from: classes.dex */
public class c1 extends java.util.AbstractCollection implements java.util.Set {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.util.Set f22878h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p068h4.l f22879i;

    public c1(java.util.Set set, p068h4.l lVar) {
        this.f22878h = set;
        this.f22879i = lVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(java.lang.Object obj) {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.L(this.f22879i.apply(obj));
        return this.f22878h.add(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(java.util.Collection collection) {
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.L(this.f22879i.apply(it.next()));
        }
        return this.f22878h.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        java.util.Set set = this.f22878h;
        boolean z6 = set instanceof java.util.RandomAccess;
        p068h4.l lVar = this.f22879i;
        if (!z6 || !(set instanceof java.util.List)) {
            java.util.Iterator it = set.iterator();
            lVar.getClass();
            while (it.hasNext()) {
                if (lVar.apply(it.next())) {
                    it.remove();
                }
            }
            return;
        }
        java.util.List list = (java.util.List) set;
        lVar.getClass();
        int i3 = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            java.lang.Object obj = list.get(i9);
            if (!lVar.apply(obj)) {
                if (i9 > i3) {
                    try {
                        list.set(i3, obj);
                    } catch (java.lang.IllegalArgumentException unused) {
                        p076i4.AbstractC2230y.u(list, lVar, i3, i9);
                        return;
                    } catch (java.lang.UnsupportedOperationException unused2) {
                        p076i4.AbstractC2230y.u(list, lVar, i3, i9);
                        return;
                    }
                }
                i3++;
            }
        }
        list.subList(i3, list.size()).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object obj) {
        boolean zContains;
        java.util.Set set = this.f22878h;
        set.getClass();
        try {
            zContains = set.contains(obj);
        } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
            zContains = false;
        }
        if (zContains) {
            return this.f22879i.apply(obj);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(java.util.Collection collection) {
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(java.lang.Object obj) {
        return p076i4.AbstractC2230y.i(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return p076i4.AbstractC2230y.n(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        java.util.Iterator it = this.f22878h.iterator();
        p068h4.l lVar = this.f22879i;
        com.google.android.gms.internal.play_billing.AbstractC1864o0.U(lVar, "predicate");
        int i3 = 0;
        while (true) {
            if (!it.hasNext()) {
                i3 = -1;
                break;
            }
            if (lVar.apply(it.next())) {
                break;
            }
            i3++;
        }
        return true ^ (i3 != -1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
        java.util.Iterator it = this.f22878h.iterator();
        it.getClass();
        p068h4.l lVar = this.f22879i;
        lVar.getClass();
        return new p076i4.C2217r0(it, lVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(java.lang.Object obj) {
        return contains(obj) && this.f22878h.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(java.util.Collection collection) {
        java.util.Iterator it = this.f22878h.iterator();
        boolean z6 = false;
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            if (this.f22879i.apply(next) && collection.contains(next)) {
                it.remove();
                z6 = true;
            }
        }
        return z6;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(java.util.Collection collection) {
        java.util.Iterator it = this.f22878h.iterator();
        boolean z6 = false;
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            if (this.f22879i.apply(next) && !collection.contains(next)) {
                it.remove();
                z6 = true;
            }
        }
        return z6;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        java.util.Iterator it = this.f22878h.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            if (this.f22879i.apply(it.next())) {
                i3++;
            }
        }
        return i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final java.lang.Object[] toArray() {
        java.util.Iterator it = iterator();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (true) {
            p076i4.C2217r0 c2217r0 = (p076i4.C2217r0) it;
            if (!c2217r0.hasNext()) {
                return arrayList.toArray();
            }
            arrayList.add(c2217r0.next());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final java.lang.Object[] toArray(java.lang.Object[] objArr) {
        java.util.Iterator it = iterator();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (true) {
            p076i4.C2217r0 c2217r0 = (p076i4.C2217r0) it;
            if (c2217r0.hasNext()) {
                arrayList.add(c2217r0.next());
            } else {
                return arrayList.toArray(objArr);
            }
        }
    }
}
