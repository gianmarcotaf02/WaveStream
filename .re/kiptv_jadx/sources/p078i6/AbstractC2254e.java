package p078i6;

/* JADX INFO: renamed from: i6.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2254e extends p078i6.AbstractC2250a implements java.util.List {
    @Override // java.util.List
    public final void add(int i3, java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i3, java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof java.util.List)) {
            return false;
        }
        java.util.Collection other = (java.util.Collection) obj;
        kotlin.jvm.internal.m.e(other, "other");
        if (size() == other.size()) {
            java.util.Iterator it = other.iterator();
            java.util.Iterator<E> it2 = iterator();
            while (it2.hasNext()) {
                if (!kotlin.jvm.internal.m.a(it2.next(), it.next())) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        java.util.Iterator<E> it = iterator();
        int iHashCode = 1;
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            iHashCode = (iHashCode * 31) + (next != null ? next.hashCode() : 0);
        }
        return iHashCode;
    }

    public int indexOf(java.lang.Object obj) {
        java.util.Iterator it = iterator();
        int i3 = 0;
        while (it.hasNext()) {
            if (kotlin.jvm.internal.m.a(it.next(), obj)) {
                return i3;
            }
            i3++;
        }
        return -1;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public java.util.Iterator iterator() {
        return new D1.X(5, this);
    }

    public int lastIndexOf(java.lang.Object obj) {
        java.util.ListIterator listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (kotlin.jvm.internal.m.a(listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public java.util.ListIterator listIterator() {
        return new p078i6.C2252c(this, 0);
    }

    @Override // java.util.List
    public final java.lang.Object remove(int i3) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final java.lang.Object set(int i3, java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public java.util.List subList(int i3, int i9) {
        return new p078i6.C2253d(this, i3, i9);
    }

    public java.util.ListIterator listIterator(int i3) {
        return new p078i6.C2252c(this, i3);
    }
}
