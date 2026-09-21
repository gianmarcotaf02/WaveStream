package p076i4;

/* JADX INFO: renamed from: i4.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2203k extends p076i4.C2193f implements java.util.SortedMap {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public java.util.SortedSet f22911l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p076i4.I0 f22912m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2203k(p076i4.I0 i3, java.util.SortedMap sortedMap) {
        super(i3, sortedMap);
        this.f22912m = i3;
    }

    public java.util.SortedSet b() {
        return new p076i4.C2205l(this.f22912m, d());
    }

    @Override // p076i4.C2193f, java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public java.util.SortedSet keySet() {
        java.util.SortedSet sortedSet = this.f22911l;
        if (sortedSet != null) {
            return sortedSet;
        }
        java.util.SortedSet sortedSetB = b();
        this.f22911l = sortedSetB;
        return sortedSetB;
    }

    @Override // java.util.SortedMap
    public final java.util.Comparator comparator() {
        return d().comparator();
    }

    public java.util.SortedMap d() {
        return (java.util.SortedMap) this.j;
    }

    @Override // java.util.SortedMap
    public final java.lang.Object firstKey() {
        return d().firstKey();
    }

    public java.util.SortedMap headMap(java.lang.Object obj) {
        return new p076i4.C2203k(this.f22912m, d().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final java.lang.Object lastKey() {
        return d().lastKey();
    }

    public java.util.SortedMap subMap(java.lang.Object obj, java.lang.Object obj2) {
        return new p076i4.C2203k(this.f22912m, d().subMap(obj, obj2));
    }

    public java.util.SortedMap tailMap(java.lang.Object obj) {
        return new p076i4.C2203k(this.f22912m, d().tailMap(obj));
    }
}
