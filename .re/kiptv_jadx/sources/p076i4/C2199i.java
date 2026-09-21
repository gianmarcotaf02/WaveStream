package p076i4;

/* JADX INFO: renamed from: i4.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2199i extends p076i4.C2205l implements java.util.NavigableSet {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p076i4.I0 f22907k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2199i(p076i4.I0 i3, java.util.NavigableMap navigableMap) {
        super(i3, navigableMap);
        this.f22907k = i3;
    }

    @Override // java.util.NavigableSet
    public final java.lang.Object ceiling(java.lang.Object obj) {
        return d().ceilingKey(obj);
    }

    @Override // java.util.NavigableSet
    public final java.util.Iterator descendingIterator() {
        return ((p076i4.C2195g) descendingSet()).iterator();
    }

    @Override // java.util.NavigableSet
    public final java.util.NavigableSet descendingSet() {
        return new p076i4.C2199i(this.f22907k, d().descendingMap());
    }

    @Override // p076i4.C2205l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final java.util.NavigableMap d() {
        return (java.util.NavigableMap) ((java.util.SortedMap) this.f22897h);
    }

    @Override // java.util.NavigableSet
    public final java.lang.Object floor(java.lang.Object obj) {
        return d().floorKey(obj);
    }

    @Override // p076i4.C2205l, java.util.SortedSet, java.util.NavigableSet
    public final java.util.SortedSet headSet(java.lang.Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.NavigableSet
    public final java.lang.Object higher(java.lang.Object obj) {
        return d().higherKey(obj);
    }

    @Override // java.util.NavigableSet
    public final java.lang.Object lower(java.lang.Object obj) {
        return d().lowerKey(obj);
    }

    @Override // java.util.NavigableSet
    public final java.lang.Object pollFirst() {
        p076i4.C2191e c2191e = (p076i4.C2191e) iterator();
        if (!c2191e.hasNext()) {
            return null;
        }
        java.lang.Object next = c2191e.next();
        c2191e.remove();
        return next;
    }

    @Override // java.util.NavigableSet
    public final java.lang.Object pollLast() {
        java.util.Iterator itDescendingIterator = descendingIterator();
        if (!itDescendingIterator.hasNext()) {
            return null;
        }
        java.lang.Object next = itDescendingIterator.next();
        itDescendingIterator.remove();
        return next;
    }

    @Override // p076i4.C2205l, java.util.SortedSet, java.util.NavigableSet
    public final java.util.SortedSet subSet(java.lang.Object obj, java.lang.Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // p076i4.C2205l, java.util.SortedSet, java.util.NavigableSet
    public final java.util.SortedSet tailSet(java.lang.Object obj) {
        return tailSet(obj, true);
    }

    @Override // java.util.NavigableSet
    public final java.util.NavigableSet headSet(java.lang.Object obj, boolean z6) {
        return new p076i4.C2199i(this.f22907k, d().headMap(obj, z6));
    }

    @Override // java.util.NavigableSet
    public final java.util.NavigableSet subSet(java.lang.Object obj, boolean z6, java.lang.Object obj2, boolean z9) {
        return new p076i4.C2199i(this.f22907k, d().subMap(obj, z6, obj2, z9));
    }

    @Override // java.util.NavigableSet
    public final java.util.NavigableSet tailSet(java.lang.Object obj, boolean z6) {
        return new p076i4.C2199i(this.f22907k, d().tailMap(obj, z6));
    }
}
