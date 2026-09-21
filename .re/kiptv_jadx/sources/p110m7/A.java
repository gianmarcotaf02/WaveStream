package p110m7;

/* JADX INFO: loaded from: classes4.dex */
public final class A extends java.util.AbstractMap {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f25441m = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f25442h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.util.List f25443i = java.util.Collections.EMPTY_LIST;
    public java.util.Map j = java.util.Collections.EMPTY_MAP;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f25444k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile androidx.datastore.preferences.protobuf.c0 f25445l;

    public A(int i3) {
        this.f25442h = i3;
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
        int size = this.f25443i.size();
        int i11 = size - 1;
        if (i11 < 0) {
            i3 = 0;
            while (i3 <= i11) {
                i10 = (i3 + i11) / 2;
                iCompareTo = comparable.compareTo(((p110m7.E) this.f25443i.get(i10)).f25448h);
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
            int iCompareTo2 = comparable.compareTo(((p110m7.E) this.f25443i.get(i11)).f25448h);
            if (iCompareTo2 > 0) {
                i9 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i11;
                }
                i3 = 0;
                while (i3 <= i11) {
                    i10 = (i3 + i11) / 2;
                    iCompareTo = comparable.compareTo(((p110m7.E) this.f25443i.get(i10)).f25448h);
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
        if (this.f25444k) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    public final java.lang.Iterable c() {
        return this.j.isEmpty() ? p110m7.D.f25447b : this.j.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (!this.f25443i.isEmpty()) {
            this.f25443i.clear();
        }
        if (this.j.isEmpty()) {
            return;
        }
        this.j.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(java.lang.Object obj) {
        java.lang.Comparable comparable = (java.lang.Comparable) obj;
        return a(comparable) >= 0 || this.j.containsKey(comparable);
    }

    public final java.util.SortedMap d() {
        b();
        if (this.j.isEmpty() && !(this.j instanceof java.util.TreeMap)) {
            this.j = new java.util.TreeMap();
        }
        return (java.util.SortedMap) this.j;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final java.lang.Object put(java.lang.Comparable comparable, java.lang.Object obj) {
        b();
        int iA = a(comparable);
        if (iA >= 0) {
            return ((p110m7.E) this.f25443i.get(iA)).setValue(obj);
        }
        b();
        boolean zIsEmpty = this.f25443i.isEmpty();
        int i3 = this.f25442h;
        if (zIsEmpty && !(this.f25443i instanceof java.util.ArrayList)) {
            this.f25443i = new java.util.ArrayList(i3);
        }
        int i9 = -(iA + 1);
        if (i9 >= i3) {
            return d().put(comparable, obj);
        }
        if (this.f25443i.size() == i3) {
            p110m7.E e6 = (p110m7.E) this.f25443i.remove(i3 - 1);
            d().put(e6.f25448h, e6.f25449i);
        }
        this.f25443i.add(i9, new p110m7.E(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set entrySet() {
        if (this.f25445l == null) {
            this.f25445l = new androidx.datastore.preferences.protobuf.c0(this, 1);
        }
        return this.f25445l;
    }

    public final java.lang.Object g(int i3) {
        b();
        java.lang.Object obj = ((p110m7.E) this.f25443i.remove(i3)).f25449i;
        if (!this.j.isEmpty()) {
            java.util.Iterator it = d().entrySet().iterator();
            java.util.List list = this.f25443i;
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            list.add(new p110m7.E(this, (java.lang.Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.lang.Object get(java.lang.Object obj) {
        java.lang.Comparable comparable = (java.lang.Comparable) obj;
        int iA = a(comparable);
        return iA >= 0 ? ((p110m7.E) this.f25443i.get(iA)).f25449i : this.j.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.lang.Object remove(java.lang.Object obj) {
        b();
        java.lang.Comparable comparable = (java.lang.Comparable) obj;
        int iA = a(comparable);
        if (iA >= 0) {
            return g(iA);
        }
        if (this.j.isEmpty()) {
            return null;
        }
        return this.j.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.j.size() + this.f25443i.size();
    }
}
