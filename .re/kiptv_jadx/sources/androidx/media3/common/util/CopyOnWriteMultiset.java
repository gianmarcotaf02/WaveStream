package androidx.media3.common.util;

/* JADX INFO: loaded from: classes.dex */
public final class CopyOnWriteMultiset<E> implements java.lang.Iterable<E> {
    private final java.lang.Object lock = new java.lang.Object();
    private final java.util.Map<E, java.lang.Integer> elementCounts = new java.util.HashMap();
    private java.util.Set<E> elementSet = java.util.Collections.EMPTY_SET;
    private java.util.List<E> elements = java.util.Collections.EMPTY_LIST;

    public void add(E e6) {
        synchronized (this.lock) {
            try {
                java.util.ArrayList arrayList = new java.util.ArrayList(this.elements);
                arrayList.add(e6);
                this.elements = java.util.Collections.unmodifiableList(arrayList);
                java.lang.Integer num = this.elementCounts.get(e6);
                if (num == null) {
                    java.util.HashSet hashSet = new java.util.HashSet(this.elementSet);
                    hashSet.add(e6);
                    this.elementSet = java.util.Collections.unmodifiableSet(hashSet);
                }
                this.elementCounts.put(e6, java.lang.Integer.valueOf(num != null ? 1 + num.intValue() : 1));
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public int count(E e6) {
        int iIntValue;
        synchronized (this.lock) {
            try {
                iIntValue = this.elementCounts.containsKey(e6) ? this.elementCounts.get(e6).intValue() : 0;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return iIntValue;
    }

    public java.util.Set<E> elementSet() {
        java.util.Set<E> set;
        synchronized (this.lock) {
            set = this.elementSet;
        }
        return set;
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<E> iterator() {
        java.util.Iterator<E> it;
        synchronized (this.lock) {
            it = this.elements.iterator();
        }
        return it;
    }

    public void remove(E e6) {
        synchronized (this.lock) {
            try {
                java.lang.Integer num = this.elementCounts.get(e6);
                if (num == null) {
                    return;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList(this.elements);
                arrayList.remove(e6);
                this.elements = java.util.Collections.unmodifiableList(arrayList);
                if (num.intValue() == 1) {
                    this.elementCounts.remove(e6);
                    java.util.HashSet hashSet = new java.util.HashSet(this.elementSet);
                    hashSet.remove(e6);
                    this.elementSet = java.util.Collections.unmodifiableSet(hashSet);
                } else {
                    this.elementCounts.put(e6, java.lang.Integer.valueOf(num.intValue() - 1));
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }
}
