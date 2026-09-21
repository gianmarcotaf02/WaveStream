package kotlinx.serialization.json;

/* JADX INFO: loaded from: classes4.dex */
@p119n8.i(with = p162s8.g.class)
public final class a extends kotlinx.serialization.json.b implements java.util.List<kotlinx.serialization.json.b>, p201y6.a {
    public static final kotlinx.serialization.json.JsonArray$Companion Companion = new kotlinx.serialization.json.JsonArray$Companion();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.util.List f24557h;

    public a(java.util.List content) {
        kotlin.jvm.internal.m.e(content, "content");
        this.f24557h = content;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i3, kotlinx.serialization.json.b bVar) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i3, java.util.Collection<? extends kotlinx.serialization.json.b> collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        if (!(obj instanceof kotlinx.serialization.json.b)) {
            return false;
        }
        kotlinx.serialization.json.b element = (kotlinx.serialization.json.b) obj;
        kotlin.jvm.internal.m.e(element, "element");
        return this.f24557h.contains(element);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(java.util.Collection elements) {
        kotlin.jvm.internal.m.e(elements, "elements");
        return this.f24557h.containsAll(elements);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(java.lang.Object obj) {
        return kotlin.jvm.internal.m.a(this.f24557h, obj);
    }

    @Override // java.util.List
    public final kotlinx.serialization.json.b get(int i3) {
        return (kotlinx.serialization.json.b) this.f24557h.get(i3);
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        return this.f24557h.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(java.lang.Object obj) {
        if (!(obj instanceof kotlinx.serialization.json.b)) {
            return -1;
        }
        kotlinx.serialization.json.b element = (kotlinx.serialization.json.b) obj;
        kotlin.jvm.internal.m.e(element, "element");
        return this.f24557h.indexOf(element);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f24557h.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        return this.f24557h.iterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(java.lang.Object obj) {
        if (!(obj instanceof kotlinx.serialization.json.b)) {
            return -1;
        }
        kotlinx.serialization.json.b element = (kotlinx.serialization.json.b) obj;
        kotlin.jvm.internal.m.e(element, "element");
        return this.f24557h.lastIndexOf(element);
    }

    @Override // java.util.List
    public final java.util.ListIterator<kotlinx.serialization.json.b> listIterator() {
        return this.f24557h.listIterator();
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ kotlinx.serialization.json.b remove(int i3) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(java.util.function.UnaryOperator<kotlinx.serialization.json.b> unaryOperator) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ kotlinx.serialization.json.b set(int i3, kotlinx.serialization.json.b bVar) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f24557h.size();
    }

    @Override // java.util.List
    public final void sort(java.util.Comparator<? super kotlinx.serialization.json.b> comparator) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final java.util.List<kotlinx.serialization.json.b> subList(int i3, int i9) {
        return this.f24557h.subList(i3, i9);
    }

    @Override // java.util.List, java.util.Collection
    public final java.lang.Object[] toArray() {
        return kotlin.jvm.internal.l.a(this);
    }

    public final java.lang.String toString() {
        return p078i6.o.o1(this.f24557h, ",", "[", "]", null, 56);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final java.util.ListIterator<kotlinx.serialization.json.b> listIterator(int i3) {
        return this.f24557h.listIterator(i3);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] array) {
        kotlin.jvm.internal.m.e(array, "array");
        return kotlin.jvm.internal.l.b(this, array);
    }
}
