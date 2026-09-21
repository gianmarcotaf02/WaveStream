package io.ktor.util;

import androidx.media3.container.NalUnitUtil;
import io.ktor.utils.io.InternalAPI;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.m;
import p078i6.o;
import p078i6.u;
import p201y6.e;

@InternalAPI
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004B\u0017\b\u0016\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0003\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u001d\u0010\u000f\u001a\u00020\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0004J\u001d\u0010\u0013\u001a\u00020\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0010J\u001d\u0010\u0014\u001a\u00020\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0010J\u0018\u0010\u0015\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u000bJ\u001d\u0010\u0016\u001a\u00020\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0010J\u000f\u0010\u0017\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u0019H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\t0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lio/ktor/util/CaseInsensitiveSet;", "", "", "<init>", "()V", "", "initial", "(Ljava/lang/Iterable;)V", "element", "", "add", "(Ljava/lang/String;)Z", "remove", "", "elements", "addAll", "(Ljava/util/Collection;)Z", "Lh6/A;", "clear", "removeAll", "retainAll", "contains", "containsAll", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "Lio/ktor/util/CaseInsensitiveMap;", "backingMap", "Lio/ktor/util/CaseInsensitiveMap;", "", "getSize", "()I", "size", "ktor-utils"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class CaseInsensitiveSet implements Set<String>, e {
    private final CaseInsensitiveMap<Boolean> backingMap;

    public CaseInsensitiveSet() {
        this.backingMap = new CaseInsensitiveMap<>();
    }

    @Override
    public boolean addAll(Collection<? extends String> elements) {
        m.e(elements, "elements");
        Iterator<? extends String> it = elements.iterator();
        boolean z6 = false;
        while (it.hasNext()) {
            if (add(it.next())) {
                z6 = true;
            }
        }
        return z6;
    }

    @Override
    public void clear() {
        this.backingMap.clear();
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj instanceof String) {
            return contains((String) obj);
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection<? extends Object> elements) {
        m.e(elements, "elements");
        return this.backingMap.keySet().containsAll(elements);
    }

    public int getSize() {
        return this.backingMap.size();
    }

    @Override
    public boolean isEmpty() {
        return this.backingMap.isEmpty();
    }

    @Override
    public Iterator<String> iterator() {
        return this.backingMap.keySet().iterator();
    }

    @Override
    public final boolean remove(Object obj) {
        if (obj instanceof String) {
            return remove((String) obj);
        }
        return false;
    }

    @Override
    public boolean removeAll(Collection<? extends Object> elements) {
        m.e(elements, "elements");
        return this.backingMap.keySet().removeAll(o.R1(elements));
    }

    @Override
    public boolean retainAll(Collection<? extends Object> elements) {
        m.e(elements, "elements");
        return this.backingMap.keySet().retainAll(o.R1(elements));
    }

    @Override
    public final int size() {
        return getSize();
    }

    @Override
    public Object[] toArray() {
        return l.a(this);
    }

    @Override
    public boolean add(String element) {
        m.e(element, "element");
        if (this.backingMap.containsKey((Object) element)) {
            return false;
        }
        this.backingMap.put(element, Boolean.TRUE);
        return true;
    }

    public boolean contains(String element) {
        m.e(element, "element");
        return this.backingMap.containsKey((Object) element);
    }

    public boolean remove(String element) {
        m.e(element, "element");
        return m.a(this.backingMap.remove((Object) element), Boolean.TRUE);
    }

    @Override
    public <T> T[] toArray(T[] array) {
        m.e(array, "array");
        return (T[]) l.b(this, array);
    }

    public CaseInsensitiveSet(Iterable<String> initial) {
        this();
        m.e(initial, "initial");
        u.M0(this, initial);
    }
}
