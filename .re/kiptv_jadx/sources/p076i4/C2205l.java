package p076i4;

/* JADX INFO: renamed from: i4.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2205l extends p076i4.C2195g implements java.util.SortedSet {
    public final /* synthetic */ p076i4.I0 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2205l(p076i4.I0 i3, java.util.SortedMap sortedMap) {
        super(i3, sortedMap);
        this.j = i3;
    }

    @Override // java.util.SortedSet
    public final java.util.Comparator comparator() {
        return d().comparator();
    }

    public java.util.SortedMap d() {
        return (java.util.SortedMap) this.f22897h;
    }

    @Override // java.util.SortedSet
    public final java.lang.Object first() {
        return d().firstKey();
    }

    public java.util.SortedSet headSet(java.lang.Object obj) {
        return new p076i4.C2205l(this.j, d().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final java.lang.Object last() {
        return d().lastKey();
    }

    public java.util.SortedSet subSet(java.lang.Object obj, java.lang.Object obj2) {
        return new p076i4.C2205l(this.j, d().subMap(obj, obj2));
    }

    public java.util.SortedSet tailSet(java.lang.Object obj) {
        return new p076i4.C2205l(this.j, d().tailMap(obj));
    }
}
