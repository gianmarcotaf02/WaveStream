package p076i4;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;

public final class C2199i extends C2205l implements NavigableSet {

    public final I0 f22907k;

    public C2199i(I0 i3, NavigableMap navigableMap) {
        super(i3, navigableMap);
        this.f22907k = i3;
    }

    @Override
    public final Object ceiling(Object obj) {
        return d().ceilingKey(obj);
    }

    @Override
    public final Iterator descendingIterator() {
        return ((C2195g) descendingSet()).iterator();
    }

    @Override
    public final NavigableSet descendingSet() {
        return new C2199i(this.f22907k, d().descendingMap());
    }

    @Override
    public final NavigableMap d() {
        return (NavigableMap) ((SortedMap) this.f22897h);
    }

    @Override
    public final Object floor(Object obj) {
        return d().floorKey(obj);
    }

    @Override
    public final SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override
    public final Object higher(Object obj) {
        return d().higherKey(obj);
    }

    @Override
    public final Object lower(Object obj) {
        return d().lowerKey(obj);
    }

    @Override
    public final Object pollFirst() {
        C2191e c2191e = (C2191e) iterator();
        if (!c2191e.hasNext()) {
            return null;
        }
        Object next = c2191e.next();
        c2191e.remove();
        return next;
    }

    @Override
    public final Object pollLast() {
        Iterator itDescendingIterator = descendingIterator();
        if (!itDescendingIterator.hasNext()) {
            return null;
        }
        Object next = itDescendingIterator.next();
        itDescendingIterator.remove();
        return next;
    }

    @Override
    public final SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override
    public final SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }

    @Override
    public final NavigableSet headSet(Object obj, boolean z6) {
        return new C2199i(this.f22907k, d().headMap(obj, z6));
    }

    @Override
    public final NavigableSet subSet(Object obj, boolean z6, Object obj2, boolean z9) {
        return new C2199i(this.f22907k, d().subMap(obj, z6, obj2, z9));
    }

    @Override
    public final NavigableSet tailSet(Object obj, boolean z6) {
        return new C2199i(this.f22907k, d().tailMap(obj, z6));
    }
}
