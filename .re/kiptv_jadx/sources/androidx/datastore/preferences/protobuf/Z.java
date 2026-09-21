package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class Z extends java.util.AbstractMap {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f16174m = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public java.util.List f16175h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.util.Map f16176i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public volatile androidx.datastore.preferences.protobuf.c0 f16177k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public java.util.Map f16178l;

    public static androidx.datastore.preferences.protobuf.Z g() {
        androidx.datastore.preferences.protobuf.Z z6 = new androidx.datastore.preferences.protobuf.Z();
        z6.f16175h = java.util.Collections.EMPTY_LIST;
        java.util.Map map = java.util.Collections.EMPTY_MAP;
        z6.f16176i = map;
        z6.f16178l = map;
        return z6;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0024  */
    /* JADX WARN: Code duplicated, block: B:17:0x003e  */
    /* JADX WARN: Code duplicated, block: B:21:0x003c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0042 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0038 A[SYNTHETIC] */
    public final int a(java.lang.Comparable comparable) {
        int i3;
        int i9;
        int i10;
        int iCompareTo;
        int size = this.f16175h.size();
        int i11 = size - 1;
        if (i11 < 0) {
            i3 = 0;
            while (i3 <= i11) {
                i10 = (i3 + i11) / 2;
                iCompareTo = comparable.compareTo(((androidx.datastore.preferences.protobuf.a0) this.f16175h.get(i10)).f16179h);
                if (iCompareTo < 0) {
                    i11 = i10 - 1;
                } else {
                    if (iCompareTo > 0) {
                        return i10;
                    }
                    i3 = i10 + 1;
                }
            }
            i9 = i3 + 1;
        } else {
            int iCompareTo2 = comparable.compareTo(((androidx.datastore.preferences.protobuf.a0) this.f16175h.get(i11)).f16179h);
            if (iCompareTo2 > 0) {
                i9 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i11;
                }
                i3 = 0;
                while (i3 <= i11) {
                    i10 = (i3 + i11) / 2;
                    iCompareTo = comparable.compareTo(((androidx.datastore.preferences.protobuf.a0) this.f16175h.get(i10)).f16179h);
                    if (iCompareTo < 0) {
                        i11 = i10 - 1;
                    } else {
                        if (iCompareTo > 0) {
                            return i10;
                        }
                        i3 = i10 + 1;
                    }
                }
                i9 = i3 + 1;
            }
        }
        return -i9;
    }

    public final void b() {
        if (this.j) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    public final java.util.Map.Entry c(int i3) {
        return (java.util.Map.Entry) this.f16175h.get(i3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (!this.f16175h.isEmpty()) {
            this.f16175h.clear();
        }
        if (this.f16176i.isEmpty()) {
            return;
        }
        this.f16176i.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(java.lang.Object obj) {
        java.lang.Comparable comparable = (java.lang.Comparable) obj;
        return a(comparable) >= 0 || this.f16176i.containsKey(comparable);
    }

    public final java.util.Set d() {
        return this.f16176i.isEmpty() ? java.util.Collections.EMPTY_SET : this.f16176i.entrySet();
    }

    public final java.util.SortedMap e() {
        b();
        if (this.f16176i.isEmpty() && !(this.f16176i instanceof java.util.TreeMap)) {
            java.util.TreeMap treeMap = new java.util.TreeMap();
            this.f16176i = treeMap;
            this.f16178l = treeMap.descendingMap();
        }
        return (java.util.SortedMap) this.f16176i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set entrySet() {
        if (this.f16177k == null) {
            this.f16177k = new androidx.datastore.preferences.protobuf.c0(this, 0);
        }
        return this.f16177k;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.datastore.preferences.protobuf.Z)) {
            return super.equals(obj);
        }
        androidx.datastore.preferences.protobuf.Z z6 = (androidx.datastore.preferences.protobuf.Z) obj;
        int size = size();
        if (size == z6.size()) {
            int size2 = this.f16175h.size();
            if (size2 != z6.f16175h.size()) {
                return ((java.util.AbstractSet) entrySet()).equals(z6.entrySet());
            }
            for (int i3 = 0; i3 < size2; i3++) {
                if (c(i3).equals(z6.c(i3))) {
                }
            }
            if (size2 != size) {
                return this.f16176i.equals(z6.f16176i);
            }
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.lang.Object get(java.lang.Object obj) {
        java.lang.Comparable comparable = (java.lang.Comparable) obj;
        int iA = a(comparable);
        return iA >= 0 ? ((androidx.datastore.preferences.protobuf.a0) this.f16175h.get(iA)).f16180i : this.f16176i.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final java.lang.Object put(java.lang.Comparable comparable, java.lang.Object obj) {
        b();
        int iA = a(comparable);
        if (iA >= 0) {
            return ((androidx.datastore.preferences.protobuf.a0) this.f16175h.get(iA)).setValue(obj);
        }
        b();
        if (this.f16175h.isEmpty() && !(this.f16175h instanceof java.util.ArrayList)) {
            this.f16175h = new java.util.ArrayList(16);
        }
        int i3 = -(iA + 1);
        if (i3 >= 16) {
            return e().put(comparable, obj);
        }
        if (this.f16175h.size() == 16) {
            androidx.datastore.preferences.protobuf.a0 a0Var = (androidx.datastore.preferences.protobuf.a0) this.f16175h.remove(15);
            e().put(a0Var.f16179h, a0Var.f16180i);
        }
        this.f16175h.add(i3, new androidx.datastore.preferences.protobuf.a0(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.f16175h.size();
        int iHashCode = 0;
        for (int i3 = 0; i3 < size; i3++) {
            iHashCode += ((androidx.datastore.preferences.protobuf.a0) this.f16175h.get(i3)).hashCode();
        }
        return this.f16176i.size() > 0 ? this.f16176i.hashCode() + iHashCode : iHashCode;
    }

    public final java.lang.Object i(int i3) {
        b();
        java.lang.Object obj = ((androidx.datastore.preferences.protobuf.a0) this.f16175h.remove(i3)).f16180i;
        if (!this.f16176i.isEmpty()) {
            java.util.Iterator it = e().entrySet().iterator();
            java.util.List list = this.f16175h;
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            list.add(new androidx.datastore.preferences.protobuf.a0(this, (java.lang.Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.lang.Object remove(java.lang.Object obj) {
        b();
        java.lang.Comparable comparable = (java.lang.Comparable) obj;
        int iA = a(comparable);
        if (iA >= 0) {
            return i(iA);
        }
        if (this.f16176i.isEmpty()) {
            return null;
        }
        return this.f16176i.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f16176i.size() + this.f16175h.size();
    }
}
