package p076i4;

/* JADX INFO: loaded from: classes.dex */
public final class F0 extends java.util.AbstractMap {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f22796h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.Object f22797i;
    public final java.lang.Object j;

    public F0(p076i4.i1 i1Var, java.util.Collection collection) {
        this.j = i1Var;
        this.f22797i = collection;
    }

    public final void a() {
        p076i4.AbstractC2230y.e(b());
    }

    public final java.util.Iterator b() {
        switch (this.f22796h) {
            case 0:
                java.util.Iterator it = ((java.util.Map) this.f22797i).entrySet().iterator();
                p076i4.E0 e6 = (p076i4.E0) this.j;
                e6.getClass();
                return new p076i4.C2219s0(it, new p076i4.B0(e6, 1));
            default:
                return ((java.util.Collection) this.f22797i).iterator();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        switch (this.f22796h) {
            case 0:
                ((java.util.Map) this.f22797i).clear();
                break;
            default:
                a();
                break;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(java.lang.Object obj) {
        switch (this.f22796h) {
            case 0:
                return ((java.util.Map) this.f22797i).containsKey(obj);
            default:
                return get(obj) != null;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set entrySet() {
        return new p076i4.C2189d(this, 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.lang.Object get(java.lang.Object obj) {
        switch (this.f22796h) {
            case 0:
                java.util.Map map = (java.util.Map) this.f22797i;
                java.lang.Object obj2 = map.get(obj);
                if (obj2 != null || map.containsKey(obj)) {
                    return ((p076i4.E0) this.j).a(obj, obj2);
                }
                return null;
            default:
                if (obj instanceof p076i4.P0) {
                    p076i4.P0 p2 = (p076i4.P0) obj;
                    p076i4.h1 h1Var = (p076i4.h1) ((p076i4.i1) this.j).f22909a.get(p2.f22823h);
                    if (h1Var != null && h1Var.f22905h.equals(p2)) {
                        return h1Var.f22906i;
                    }
                }
                return null;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.util.Set keySet() {
        switch (this.f22796h) {
            case 0:
                return ((java.util.Map) this.f22797i).keySet();
            default:
                return super.keySet();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.lang.Object remove(java.lang.Object obj) {
        switch (this.f22796h) {
            case 0:
                java.util.Map map = (java.util.Map) this.f22797i;
                if (!map.containsKey(obj)) {
                    return null;
                }
                return ((p076i4.E0) this.j).a(obj, map.remove(obj));
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        switch (this.f22796h) {
            case 0:
                return ((java.util.Map) this.f22797i).size();
            default:
                return ((p076i4.i1) this.j).f22909a.size();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.util.Collection values() {
        switch (this.f22796h) {
            case 0:
                return new p076i4.C2218s(this);
            default:
                return super.values();
        }
    }

    public F0(java.util.Map map, p076i4.E0 e6) {
        map.getClass();
        this.f22797i = map;
        this.j = e6;
    }
}
