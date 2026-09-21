package io.ktor.util.collections;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010#\n\u0002\b\u0003\u001a\u001d\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"", "Key", "", "ConcurrentSet", "()Ljava/util/Set;", "ktor-utils"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class ConcurrentSetKt {

    /* JADX INFO: Add missing generic type declarations: [Key] */
    /* JADX INFO: renamed from: io.ktor.util.collections.ConcurrentSetKt$ConcurrentSet$1, reason: invalid class name */
    @kotlin.Metadata(d1 = {"\u0000;\n\u0000\n\u0002\u0010#\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0017\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\b\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u0005J\u001d\u0010\u0011\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\tJ\u001d\u0010\u0012\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\tJ\u0018\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0005J\u001d\u0010\u0014\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\tJ\u000f\u0010\u0015\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R \u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"io/ktor/util/collections/ConcurrentSetKt$ConcurrentSet$1", "", "element", "", "add", "(Ljava/lang/Object;)Z", "", "elements", "addAll", "(Ljava/util/Collection;)Z", "Lh6/A;", "clear", "()V", "", "iterator", "()Ljava/util/Iterator;", "remove", "removeAll", "retainAll", "contains", "containsAll", "isEmpty", "()Z", "Lio/ktor/util/collections/ConcurrentMap;", "delegate", "Lio/ktor/util/collections/ConcurrentMap;", "", "getSize", "()I", "size", "ktor-utils"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class AnonymousClass1<Key> implements java.util.Set<Key>, p201y6.e {
        private final io.ktor.util.collections.ConcurrentMap<Key, p070h6.A> delegate = new io.ktor.util.collections.ConcurrentMap<>(0, 1, null);

        @Override // java.util.Set, java.util.Collection
        public boolean add(Key element) {
            kotlin.jvm.internal.m.e(element, "element");
            if (this.delegate.containsKey(element)) {
                return false;
            }
            this.delegate.put(element, p070h6.A.f22523a);
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Set, java.util.Collection
        public boolean addAll(java.util.Collection<? extends Key> elements) {
            kotlin.jvm.internal.m.e(elements, "elements");
            java.util.Collection<? extends Key> collection = elements;
            if (collection.isEmpty()) {
                return true;
            }
            java.util.Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (!add(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            this.delegate.clear();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(java.lang.Object element) {
            if (element == null) {
                return false;
            }
            return this.delegate.containsKey(element);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(java.util.Collection<? extends java.lang.Object> elements) {
            kotlin.jvm.internal.m.e(elements, "elements");
            return elements.containsAll(this.delegate.keySet());
        }

        public int getSize() {
            return this.delegate.size();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return this.delegate.isEmpty();
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public java.util.Iterator<Key> iterator() {
            return this.delegate.keySet().iterator();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(java.lang.Object element) {
            return (element == null || this.delegate.remove(element) == null) ? false : true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(java.util.Collection<? extends java.lang.Object> elements) {
            kotlin.jvm.internal.m.e(elements, "elements");
            java.util.Collection<? extends java.lang.Object> collection = elements;
            if (collection.isEmpty()) {
                return true;
            }
            java.util.Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (!remove(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(java.util.Collection<? extends java.lang.Object> elements) {
            kotlin.jvm.internal.m.e(elements, "elements");
            java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
            for (Key key : this.delegate.keySet()) {
                if (!elements.contains(key)) {
                    linkedHashSet.add(key);
                }
            }
            return removeAll(linkedHashSet);
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
        public <T> T[] toArray(T[] array) {
            kotlin.jvm.internal.m.e(array, "array");
            return (T[]) kotlin.jvm.internal.l.b(this, array);
        }
    }

    public static final <Key> java.util.Set<Key> ConcurrentSet() {
        return new io.ktor.util.collections.ConcurrentSetKt.AnonymousClass1();
    }
}
