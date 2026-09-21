package io.ktor.util;

/* JADX INFO: loaded from: classes4.dex */
@io.ktor.utils.io.InternalAPI
@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004B\u0017\b\u0016\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0003\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u001d\u0010\u000f\u001a\u00020\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0004J\u001d\u0010\u0013\u001a\u00020\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0010J\u001d\u0010\u0014\u001a\u00020\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0010J\u0018\u0010\u0015\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u000bJ\u001d\u0010\u0016\u001a\u00020\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0010J\u000f\u0010\u0017\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u0019H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\t0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lio/ktor/util/CaseInsensitiveSet;", "", "", "<init>", "()V", "", "initial", "(Ljava/lang/Iterable;)V", "element", "", "add", "(Ljava/lang/String;)Z", "remove", "", "elements", "addAll", "(Ljava/util/Collection;)Z", "Lh6/A;", "clear", "removeAll", "retainAll", "contains", "containsAll", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "Lio/ktor/util/CaseInsensitiveMap;", "backingMap", "Lio/ktor/util/CaseInsensitiveMap;", "", "getSize", "()I", "size", "ktor-utils"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class CaseInsensitiveSet implements java.util.Set<java.lang.String>, p201y6.e {
    private final io.ktor.util.CaseInsensitiveMap<java.lang.Boolean> backingMap;

    public CaseInsensitiveSet() {
        this.backingMap = new io.ktor.util.CaseInsensitiveMap<>();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(java.util.Collection<? extends java.lang.String> elements) {
        kotlin.jvm.internal.m.e(elements, "elements");
        java.util.Iterator<? extends java.lang.String> it = elements.iterator();
        boolean z6 = false;
        while (it.hasNext()) {
            if (add(it.next())) {
                z6 = true;
            }
        }
        return z6;
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.backingMap.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean contains(java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            return contains((java.lang.String) obj);
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(java.util.Collection<? extends java.lang.Object> elements) {
        kotlin.jvm.internal.m.e(elements, "elements");
        return this.backingMap.keySet().containsAll(elements);
    }

    public int getSize() {
        return this.backingMap.size();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.backingMap.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public java.util.Iterator<java.lang.String> iterator() {
        return this.backingMap.keySet().iterator();
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean remove(java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            return remove((java.lang.String) obj);
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(java.util.Collection<? extends java.lang.Object> elements) {
        kotlin.jvm.internal.m.e(elements, "elements");
        return this.backingMap.keySet().removeAll(p078i6.o.R1(elements));
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(java.util.Collection<? extends java.lang.Object> elements) {
        kotlin.jvm.internal.m.e(elements, "elements");
        return this.backingMap.keySet().retainAll(p078i6.o.R1(elements));
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Set, java.util.Collection
    public java.lang.Object[] toArray() {
        return kotlin.jvm.internal.l.a(this);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(java.lang.String element) {
        kotlin.jvm.internal.m.e(element, "element");
        if (this.backingMap.containsKey((java.lang.Object) element)) {
            return false;
        }
        this.backingMap.put(element, java.lang.Boolean.TRUE);
        return true;
    }

    public boolean contains(java.lang.String element) {
        kotlin.jvm.internal.m.e(element, "element");
        return this.backingMap.containsKey((java.lang.Object) element);
    }

    public boolean remove(java.lang.String element) {
        kotlin.jvm.internal.m.e(element, "element");
        return kotlin.jvm.internal.m.a(this.backingMap.remove((java.lang.Object) element), java.lang.Boolean.TRUE);
    }

    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] array) {
        kotlin.jvm.internal.m.e(array, "array");
        return (T[]) kotlin.jvm.internal.l.b(this, array);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CaseInsensitiveSet(java.lang.Iterable<java.lang.String> initial) {
        this();
        kotlin.jvm.internal.m.e(initial, "initial");
        p078i6.u.M0(this, initial);
    }
}
