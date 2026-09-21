package io.ktor.util;

import androidx.media3.container.NalUnitUtil;
import io.ktor.http.LinkHeader;
import io.sentry.protocol.Request;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.m;
import p078i6.o;
import p078i6.q;
import p194x6.j;
import p201y6.e;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B=\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\n*\b\u0012\u0004\u0012\u00028\u00010\nH\u0016¢\u0006\u0004\b\u0007\u0010\u000bJ\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\n*\b\u0012\u0004\u0012\u00028\u00000\nH\u0016¢\u0006\u0004\b\u0006\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0011\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\r2\u0006\u0010\f\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0016\u0010\u000fJ\u001d\u0010\u0017\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\nH\u0016¢\u0006\u0004\b\u0017\u0010\u0012J\u001d\u0010\u0018\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\nH\u0016¢\u0006\u0004\b\u0018\u0010\u0012J\u0018\u0010\u0019\u001a\u00020\r2\u0006\u0010\f\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u000fJ\u001d\u0010\u001a\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\nH\u0016¢\u0006\u0004\b\u001a\u0010\u0012J\u000f\u0010\u001b\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00010\u001dH\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020\r2\b\u0010$\u001a\u0004\u0018\u00010#H\u0096\u0002¢\u0006\u0004\b%\u0010\u000fJ\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010)R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010*R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010*R\u001a\u0010+\u001a\u00020 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010\"¨\u0006."}, d2 = {"Lio/ktor/util/DelegatingMutableSet;", "From", "To", "", "delegate", "Lkotlin/Function1;", "convertTo", "convert", "<init>", "(Ljava/util/Set;Lx6/j;Lx6/j;)V", "", "(Ljava/util/Collection;)Ljava/util/Collection;", "element", "", "add", "(Ljava/lang/Object;)Z", "elements", "addAll", "(Ljava/util/Collection;)Z", "Lh6/A;", "clear", "()V", "remove", "removeAll", "retainAll", "contains", "containsAll", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "", "hashCode", "()I", "", Request.JsonKeys.OTHER, "equals", "", "toString", "()Ljava/lang/String;", "Ljava/util/Set;", "Lx6/j;", "size", "I", "getSize", "ktor-utils"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public class DelegatingMutableSet<From, To> implements Set<To>, e {
    private final j convert;
    private final j convertTo;
    private final Set<From> delegate;
    private final int size;

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0010)\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u00018\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"io/ktor/util/DelegatingMutableSet$iterator$1", "", "", "hasNext", "()Z", LinkHeader.Rel.Next, "()Ljava/lang/Object;", "Lh6/A;", "remove", "()V", "delegateIterator", "Ljava/util/Iterator;", "getDelegateIterator", "()Ljava/util/Iterator;", "ktor-utils"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class AnonymousClass1 implements Iterator<To>, p201y6.a {
        private final Iterator<From> delegateIterator;
        final DelegatingMutableSet<From, To> this$0;

        public AnonymousClass1(DelegatingMutableSet<From, To> delegatingMutableSet) {
            this.this$0 = delegatingMutableSet;
            this.delegateIterator = ((DelegatingMutableSet) delegatingMutableSet).delegate.iterator();
        }

        public final Iterator<From> getDelegateIterator() {
            return this.delegateIterator;
        }

        @Override
        public boolean hasNext() {
            return this.delegateIterator.hasNext();
        }

        @Override
        public To next() {
            return (To) ((DelegatingMutableSet) this.this$0).convertTo.invoke(this.delegateIterator.next());
        }

        @Override
        public void remove() {
            this.delegateIterator.remove();
        }
    }

    public DelegatingMutableSet(Set<From> delegate, j convertTo, j convert) {
        m.e(delegate, "delegate");
        m.e(convertTo, "convertTo");
        m.e(convert, "convert");
        this.delegate = delegate;
        this.convertTo = convertTo;
        this.convert = convert;
        this.size = delegate.size();
    }

    @Override
    public boolean add(To element) {
        return this.delegate.add((From) this.convert.invoke(element));
    }

    @Override
    public boolean addAll(Collection<? extends To> elements) {
        m.e(elements, "elements");
        return this.delegate.addAll(convert(elements));
    }

    @Override
    public void clear() {
        this.delegate.clear();
    }

    @Override
    public boolean contains(Object element) {
        return this.delegate.contains(this.convert.invoke(element));
    }

    @Override
    public boolean containsAll(Collection<? extends Object> elements) {
        m.e(elements, "elements");
        return this.delegate.containsAll(convert(elements));
    }

    public Collection<From> convert(Collection<? extends To> collection) {
        m.e(collection, "<this>");
        Collection<? extends To> collection2 = collection;
        ArrayList arrayList = new ArrayList(q.I0(collection2, 10));
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.convert.invoke(it.next()));
        }
        return arrayList;
    }

    public Collection<To> convertTo(Collection<? extends From> collection) {
        m.e(collection, "<this>");
        Collection<? extends From> collection2 = collection;
        ArrayList arrayList = new ArrayList(q.I0(collection2, 10));
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.convertTo.invoke(it.next()));
        }
        return arrayList;
    }

    @Override
    public boolean equals(Object other) {
        if (other != null && (other instanceof Set)) {
            Collection<To> collectionConvertTo = convertTo(this.delegate);
            if (((Set) other).containsAll(collectionConvertTo) && collectionConvertTo.containsAll((Collection) other)) {
                return true;
            }
        }
        return false;
    }

    public int getSize() {
        return this.size;
    }

    @Override
    public int hashCode() {
        return this.delegate.hashCode();
    }

    @Override
    public boolean isEmpty() {
        return this.delegate.isEmpty();
    }

    @Override
    public Iterator<To> iterator() {
        return new AnonymousClass1(this);
    }

    @Override
    public boolean remove(Object element) {
        return this.delegate.remove(this.convert.invoke(element));
    }

    @Override
    public boolean removeAll(Collection<? extends Object> elements) {
        m.e(elements, "elements");
        return this.delegate.removeAll(o.R1(convert(elements)));
    }

    @Override
    public boolean retainAll(Collection<? extends Object> elements) {
        m.e(elements, "elements");
        return this.delegate.retainAll(o.R1(convert(elements)));
    }

    @Override
    public final int size() {
        return getSize();
    }

    @Override
    public Object[] toArray() {
        return l.a(this);
    }

    public String toString() {
        return convertTo(this.delegate).toString();
    }

    @Override
    public <T> T[] toArray(T[] array) {
        m.e(array, "array");
        return (T[]) l.b(this, array);
    }
}
