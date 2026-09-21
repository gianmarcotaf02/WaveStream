package p076i4;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

public class C2203k extends C2193f implements SortedMap {

    public SortedSet f22911l;

    public final I0 f22912m;

    public C2203k(I0 i3, SortedMap sortedMap) {
        super(i3, sortedMap);
        this.f22912m = i3;
    }

    public SortedSet b() {
        return new C2205l(this.f22912m, d());
    }

    @Override
    public SortedSet keySet() {
        SortedSet sortedSet = this.f22911l;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet sortedSetB = b();
        this.f22911l = sortedSetB;
        return sortedSetB;
    }

    @Override
    public final Comparator comparator() {
        return d().comparator();
    }

    public SortedMap d() {
        return (SortedMap) this.j;
    }

    @Override
    public final Object firstKey() {
        return d().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new C2203k(this.f22912m, d().headMap(obj));
    }

    @Override
    public final Object lastKey() {
        return d().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new C2203k(this.f22912m, d().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new C2203k(this.f22912m, d().tailMap(obj));
    }
}
