package p076i4;

/* JADX INFO: loaded from: classes.dex */
public final class i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.TreeMap f22909a = new java.util.TreeMap();

    public final java.util.Map a() {
        return new p076i4.F0(this, this.f22909a.values());
    }

    public final java.util.Map.Entry b(java.lang.Long l2) {
        java.util.Map.Entry entryFloorEntry = this.f22909a.floorEntry(new p076i4.L(l2, 2));
        if (entryFloorEntry == null) {
            return null;
        }
        p076i4.P0 p2 = ((p076i4.h1) entryFloorEntry.getValue()).f22905h;
        p2.getClass();
        if (!p2.f22823h.e(l2) || p2.f22824i.e(l2)) {
            return null;
        }
        return (java.util.Map.Entry) entryFloorEntry.getValue();
    }

    public final void c(p076i4.P0 p2, java.lang.Object obj) {
        p076i4.M m8 = p2.f22823h;
        p076i4.M m9 = p2.f22824i;
        if (m8.equals(m9)) {
            return;
        }
        obj.getClass();
        p076i4.M m10 = p2.f22823h;
        boolean zEquals = m10.equals(m9);
        java.util.TreeMap treeMap = this.f22909a;
        if (!zEquals) {
            java.util.Map.Entry entryLowerEntry = treeMap.lowerEntry(m10);
            if (entryLowerEntry != null) {
                p076i4.h1 h1Var = (p076i4.h1) entryLowerEntry.getValue();
                if (h1Var.f22905h.f22824i.compareTo(m10) > 0) {
                    p076i4.P0 p9 = h1Var.f22905h;
                    if (p9.f22824i.compareTo(m9) > 0) {
                        d(m9, p9.f22824i, ((p076i4.h1) entryLowerEntry.getValue()).f22906i);
                    }
                    d(p9.f22823h, m10, ((p076i4.h1) entryLowerEntry.getValue()).f22906i);
                }
            }
            java.util.Map.Entry entryLowerEntry2 = treeMap.lowerEntry(m9);
            if (entryLowerEntry2 != null) {
                p076i4.h1 h1Var2 = (p076i4.h1) entryLowerEntry2.getValue();
                if (h1Var2.f22905h.f22824i.compareTo(m9) > 0) {
                    d(m9, h1Var2.f22905h.f22824i, ((p076i4.h1) entryLowerEntry2.getValue()).f22906i);
                }
            }
            treeMap.subMap(m10, m9).clear();
        }
        treeMap.put(m10, new p076i4.h1(p2, obj));
    }

    public final void d(p076i4.M m8, p076i4.M m9, java.lang.Object obj) {
        this.f22909a.put(m8, new p076i4.h1(new p076i4.P0(m8, m9), obj));
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof p076i4.i1)) {
            return false;
        }
        return ((java.util.AbstractMap) a()).equals(((p076i4.i1) obj).a());
    }

    public final int hashCode() {
        return ((java.util.AbstractMap) a()).hashCode();
    }

    public final java.lang.String toString() {
        return this.f22909a.values().toString();
    }
}
