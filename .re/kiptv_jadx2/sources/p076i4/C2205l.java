package p076i4;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

public class C2205l extends C2195g implements SortedSet {
    public final I0 j;

    public C2205l(I0 i3, SortedMap sortedMap) {
        super(i3, sortedMap);
        this.j = i3;
    }

    @Override
    public final Comparator comparator() {
        return d().comparator();
    }

    public SortedMap d() {
        return (SortedMap) this.f22897h;
    }

    @Override
    public final Object first() {
        return d().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new C2205l(this.j, d().headMap(obj));
    }

    @Override
    public final Object last() {
        return d().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new C2205l(this.j, d().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new C2205l(this.j, d().tailMap(obj));
    }
}
