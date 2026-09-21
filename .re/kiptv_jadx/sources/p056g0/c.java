package p056g0;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends p078i6.AbstractC2254e implements java.util.List, java.util.Collection, p201y6.a {
    @Override // p078i6.AbstractC2250a, java.util.Collection, java.util.List
    public final boolean contains(java.lang.Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // p078i6.AbstractC2250a, java.util.Collection, java.util.List
    public final boolean containsAll(java.util.Collection collection) {
        java.util.Collection collection2 = collection;
        if ((collection2 instanceof java.util.Collection) && collection2.isEmpty()) {
            return true;
        }
        java.util.Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public abstract p056g0.c e(int i3, java.lang.Object obj);

    @Override // p078i6.AbstractC2254e, java.util.Collection, java.lang.Iterable, java.util.List
    public final java.util.Iterator iterator() {
        return listIterator(0);
    }

    @Override // p078i6.AbstractC2254e, java.util.List
    public final java.util.ListIterator listIterator() {
        return listIterator(0);
    }

    public abstract p056g0.c n(java.lang.Object obj);

    public p056g0.c o(java.util.Collection collection) {
        p056g0.f fVarP = p();
        fVarP.addAll(collection);
        return fVarP.n();
    }

    public abstract p056g0.f p();

    public abstract p056g0.c q(p056g0.b bVar);

    public abstract p056g0.c r(int i3);

    public abstract p056g0.c s(int i3, java.lang.Object obj);

    @Override // p078i6.AbstractC2254e, java.util.List
    public final java.util.List subList(int i3, int i9) {
        return new p047f0.a(this, i3, i9);
    }
}
