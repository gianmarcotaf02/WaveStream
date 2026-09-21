package p076i4;

/* JADX INFO: loaded from: classes.dex */
public final class d1 extends p076i4.c1 implements java.util.SortedSet {
    @Override // java.util.SortedSet
    public final java.util.Comparator comparator() {
        return ((java.util.SortedSet) this.f22878h).comparator();
    }

    @Override // java.util.SortedSet
    public final java.lang.Object first() {
        java.util.Iterator it = this.f22878h.iterator();
        it.getClass();
        p068h4.l lVar = this.f22879i;
        lVar.getClass();
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            if (lVar.apply(next)) {
                return next;
            }
        }
        throw new java.util.NoSuchElementException();
    }

    @Override // java.util.SortedSet
    public final java.util.SortedSet headSet(java.lang.Object obj) {
        return new p076i4.d1(((java.util.SortedSet) this.f22878h).headSet(obj), this.f22879i);
    }

    @Override // java.util.SortedSet
    public final java.lang.Object last() {
        java.util.SortedSet sortedSetHeadSet = (java.util.SortedSet) this.f22878h;
        while (true) {
            java.lang.Object objLast = sortedSetHeadSet.last();
            if (this.f22879i.apply(objLast)) {
                return objLast;
            }
            sortedSetHeadSet = sortedSetHeadSet.headSet(objLast);
        }
    }

    @Override // java.util.SortedSet
    public final java.util.SortedSet subSet(java.lang.Object obj, java.lang.Object obj2) {
        return new p076i4.d1(((java.util.SortedSet) this.f22878h).subSet(obj, obj2), this.f22879i);
    }

    @Override // java.util.SortedSet
    public final java.util.SortedSet tailSet(java.lang.Object obj) {
        return new p076i4.d1(((java.util.SortedSet) this.f22878h).tailSet(obj), this.f22879i);
    }
}
