package p076i4;

/* JADX INFO: renamed from: i4.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2197h extends p076i4.C2203k implements java.util.NavigableMap {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ p076i4.I0 f22902n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2197h(p076i4.I0 i3, java.util.NavigableMap navigableMap) {
        super(i3, navigableMap);
        this.f22902n = i3;
    }

    @Override // p076i4.C2203k
    public final java.util.SortedSet b() {
        return new p076i4.C2199i(this.f22902n, d());
    }

    @Override // p076i4.C2203k
    /* JADX INFO: renamed from: c */
    public final java.util.SortedSet keySet() {
        return (java.util.NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final java.util.Map.Entry ceilingEntry(java.lang.Object obj) {
        java.util.Map.Entry entryCeilingEntry = d().ceilingEntry(obj);
        if (entryCeilingEntry == null) {
            return null;
        }
        return a(entryCeilingEntry);
    }

    @Override // java.util.NavigableMap
    public final java.lang.Object ceilingKey(java.lang.Object obj) {
        return d().ceilingKey(obj);
    }

    @Override // java.util.NavigableMap
    public final java.util.NavigableSet descendingKeySet() {
        return (java.util.NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final java.util.NavigableMap descendingMap() {
        return new p076i4.C2197h(this.f22902n, d().descendingMap());
    }

    public final p076i4.X e(java.util.Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
        java.util.Collection collectionJ = this.f22902n.j();
        collectionJ.addAll((java.util.Collection) entry.getValue());
        it.remove();
        return new p076i4.X(entry.getKey(), java.util.Collections.unmodifiableList((java.util.List) collectionJ));
    }

    @Override // java.util.NavigableMap
    public final java.util.Map.Entry firstEntry() {
        java.util.Map.Entry entryFirstEntry = d().firstEntry();
        if (entryFirstEntry == null) {
            return null;
        }
        return a(entryFirstEntry);
    }

    @Override // java.util.NavigableMap
    public final java.util.Map.Entry floorEntry(java.lang.Object obj) {
        java.util.Map.Entry entryFloorEntry = d().floorEntry(obj);
        if (entryFloorEntry == null) {
            return null;
        }
        return a(entryFloorEntry);
    }

    @Override // java.util.NavigableMap
    public final java.lang.Object floorKey(java.lang.Object obj) {
        return d().floorKey(obj);
    }

    @Override // p076i4.C2203k
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final java.util.NavigableMap d() {
        return (java.util.NavigableMap) ((java.util.SortedMap) this.j);
    }

    @Override // p076i4.C2203k, java.util.SortedMap, java.util.NavigableMap
    public final java.util.SortedMap headMap(java.lang.Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    public final java.util.Map.Entry higherEntry(java.lang.Object obj) {
        java.util.Map.Entry entryHigherEntry = d().higherEntry(obj);
        if (entryHigherEntry == null) {
            return null;
        }
        return a(entryHigherEntry);
    }

    @Override // java.util.NavigableMap
    public final java.lang.Object higherKey(java.lang.Object obj) {
        return d().higherKey(obj);
    }

    @Override // p076i4.C2203k, p076i4.C2193f, java.util.AbstractMap, java.util.Map
    public final java.util.Set keySet() {
        return (java.util.NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final java.util.Map.Entry lastEntry() {
        java.util.Map.Entry entryLastEntry = d().lastEntry();
        if (entryLastEntry == null) {
            return null;
        }
        return a(entryLastEntry);
    }

    @Override // java.util.NavigableMap
    public final java.util.Map.Entry lowerEntry(java.lang.Object obj) {
        java.util.Map.Entry entryLowerEntry = d().lowerEntry(obj);
        if (entryLowerEntry == null) {
            return null;
        }
        return a(entryLowerEntry);
    }

    @Override // java.util.NavigableMap
    public final java.lang.Object lowerKey(java.lang.Object obj) {
        return d().lowerKey(obj);
    }

    @Override // java.util.NavigableMap
    public final java.util.NavigableSet navigableKeySet() {
        return (java.util.NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final java.util.Map.Entry pollFirstEntry() {
        return e(((p076i4.C2189d) entrySet()).iterator());
    }

    @Override // java.util.NavigableMap
    public final java.util.Map.Entry pollLastEntry() {
        return e(((p076i4.C2189d) ((p076i4.C2193f) descendingMap()).entrySet()).iterator());
    }

    @Override // p076i4.C2203k, java.util.SortedMap, java.util.NavigableMap
    public final java.util.SortedMap subMap(java.lang.Object obj, java.lang.Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // p076i4.C2203k, java.util.SortedMap, java.util.NavigableMap
    public final java.util.SortedMap tailMap(java.lang.Object obj) {
        return tailMap(obj, true);
    }

    @Override // java.util.NavigableMap
    public final java.util.NavigableMap headMap(java.lang.Object obj, boolean z6) {
        return new p076i4.C2197h(this.f22902n, d().headMap(obj, z6));
    }

    @Override // java.util.NavigableMap
    public final java.util.NavigableMap subMap(java.lang.Object obj, boolean z6, java.lang.Object obj2, boolean z9) {
        return new p076i4.C2197h(this.f22902n, d().subMap(obj, z6, obj2, z9));
    }

    @Override // java.util.NavigableMap
    public final java.util.NavigableMap tailMap(java.lang.Object obj, boolean z6) {
        return new p076i4.C2197h(this.f22902n, d().tailMap(obj, z6));
    }
}
