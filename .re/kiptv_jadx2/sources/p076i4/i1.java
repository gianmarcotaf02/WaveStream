package p076i4;

import java.util.AbstractMap;
import java.util.Map;
import java.util.TreeMap;

public final class i1 {

    public final TreeMap f22909a = new TreeMap();

    public final Map a() {
        return new F0(this, this.f22909a.values());
    }

    public final Map.Entry b(Long l2) {
        Map.Entry entryFloorEntry = this.f22909a.floorEntry(new L(l2, 2));
        if (entryFloorEntry == null) {
            return null;
        }
        P0 p2 = ((h1) entryFloorEntry.getValue()).f22905h;
        p2.getClass();
        if (!p2.f22823h.e(l2) || p2.f22824i.e(l2)) {
            return null;
        }
        return (Map.Entry) entryFloorEntry.getValue();
    }

    public final void c(P0 p2, Object obj) {
        M m8 = p2.f22823h;
        M m9 = p2.f22824i;
        if (m8.equals(m9)) {
            return;
        }
        obj.getClass();
        M m10 = p2.f22823h;
        boolean zEquals = m10.equals(m9);
        TreeMap treeMap = this.f22909a;
        if (!zEquals) {
            Map.Entry entryLowerEntry = treeMap.lowerEntry(m10);
            if (entryLowerEntry != null) {
                h1 h1Var = (h1) entryLowerEntry.getValue();
                if (h1Var.f22905h.f22824i.compareTo(m10) > 0) {
                    P0 p9 = h1Var.f22905h;
                    if (p9.f22824i.compareTo(m9) > 0) {
                        d(m9, p9.f22824i, ((h1) entryLowerEntry.getValue()).f22906i);
                    }
                    d(p9.f22823h, m10, ((h1) entryLowerEntry.getValue()).f22906i);
                }
            }
            Map.Entry entryLowerEntry2 = treeMap.lowerEntry(m9);
            if (entryLowerEntry2 != null) {
                h1 h1Var2 = (h1) entryLowerEntry2.getValue();
                if (h1Var2.f22905h.f22824i.compareTo(m9) > 0) {
                    d(m9, h1Var2.f22905h.f22824i, ((h1) entryLowerEntry2.getValue()).f22906i);
                }
            }
            treeMap.subMap(m10, m9).clear();
        }
        treeMap.put(m10, new h1(p2, obj));
    }

    public final void d(M m8, M m9, Object obj) {
        this.f22909a.put(m8, new h1(new P0(m8, m9), obj));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i1)) {
            return false;
        }
        return ((AbstractMap) a()).equals(((i1) obj).a());
    }

    public final int hashCode() {
        return ((AbstractMap) a()).hashCode();
    }

    public final String toString() {
        return this.f22909a.values().toString();
    }
}
