package p076i4;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

public final class C2197h extends C2203k implements NavigableMap {

    public final I0 f22902n;

    public C2197h(I0 i3, NavigableMap navigableMap) {
        super(i3, navigableMap);
        this.f22902n = i3;
    }

    @Override
    public final SortedSet b() {
        return new C2199i(this.f22902n, d());
    }

    @Override
    public final SortedSet keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override
    public final Map.Entry ceilingEntry(Object obj) {
        Map.Entry entryCeilingEntry = d().ceilingEntry(obj);
        if (entryCeilingEntry == null) {
            return null;
        }
        return a(entryCeilingEntry);
    }

    @Override
    public final Object ceilingKey(Object obj) {
        return d().ceilingKey(obj);
    }

    @Override
    public final NavigableSet descendingKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override
    public final NavigableMap descendingMap() {
        return new C2197h(this.f22902n, d().descendingMap());
    }

    public final X e(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Map.Entry entry = (Map.Entry) it.next();
        Collection collectionJ = this.f22902n.j();
        collectionJ.addAll((Collection) entry.getValue());
        it.remove();
        return new X(entry.getKey(), Collections.unmodifiableList((List) collectionJ));
    }

    @Override
    public final Map.Entry firstEntry() {
        Map.Entry entryFirstEntry = d().firstEntry();
        if (entryFirstEntry == null) {
            return null;
        }
        return a(entryFirstEntry);
    }

    @Override
    public final Map.Entry floorEntry(Object obj) {
        Map.Entry entryFloorEntry = d().floorEntry(obj);
        if (entryFloorEntry == null) {
            return null;
        }
        return a(entryFloorEntry);
    }

    @Override
    public final Object floorKey(Object obj) {
        return d().floorKey(obj);
    }

    @Override
    public final NavigableMap d() {
        return (NavigableMap) ((SortedMap) this.j);
    }

    @Override
    public final SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override
    public final Map.Entry higherEntry(Object obj) {
        Map.Entry entryHigherEntry = d().higherEntry(obj);
        if (entryHigherEntry == null) {
            return null;
        }
        return a(entryHigherEntry);
    }

    @Override
    public final Object higherKey(Object obj) {
        return d().higherKey(obj);
    }

    @Override
    public final Set keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override
    public final Map.Entry lastEntry() {
        Map.Entry entryLastEntry = d().lastEntry();
        if (entryLastEntry == null) {
            return null;
        }
        return a(entryLastEntry);
    }

    @Override
    public final Map.Entry lowerEntry(Object obj) {
        Map.Entry entryLowerEntry = d().lowerEntry(obj);
        if (entryLowerEntry == null) {
            return null;
        }
        return a(entryLowerEntry);
    }

    @Override
    public final Object lowerKey(Object obj) {
        return d().lowerKey(obj);
    }

    @Override
    public final NavigableSet navigableKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override
    public final Map.Entry pollFirstEntry() {
        return e(((C2189d) entrySet()).iterator());
    }

    @Override
    public final Map.Entry pollLastEntry() {
        return e(((C2189d) ((C2193f) descendingMap()).entrySet()).iterator());
    }

    @Override
    public final SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override
    public final SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    @Override
    public final NavigableMap headMap(Object obj, boolean z6) {
        return new C2197h(this.f22902n, d().headMap(obj, z6));
    }

    @Override
    public final NavigableMap subMap(Object obj, boolean z6, Object obj2, boolean z9) {
        return new C2197h(this.f22902n, d().subMap(obj, z6, obj2, z9));
    }

    @Override
    public final NavigableMap tailMap(Object obj, boolean z6) {
        return new C2197h(this.f22902n, d().tailMap(obj, z6));
    }
}
