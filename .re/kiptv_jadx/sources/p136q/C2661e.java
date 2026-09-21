package p136q;

/* JADX INFO: renamed from: q.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2661e extends p136q.S implements java.util.Map {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public androidx.datastore.preferences.protobuf.c0 f26378k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public p136q.C2658b f26379l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public p136q.C2660d f26380m;

    @Override // java.util.Map
    public final java.util.Set entrySet() {
        androidx.datastore.preferences.protobuf.c0 c0Var = this.f26378k;
        if (c0Var != null) {
            return c0Var;
        }
        androidx.datastore.preferences.protobuf.c0 c0Var2 = new androidx.datastore.preferences.protobuf.c0(this, 2);
        this.f26378k = c0Var2;
        return c0Var2;
    }

    public final boolean j(java.util.Collection collection) {
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean k(java.util.Collection collection) {
        int i3 = this.j;
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i3 != this.j;
    }

    @Override // java.util.Map
    public final java.util.Set keySet() {
        p136q.C2658b c2658b = this.f26379l;
        if (c2658b != null) {
            return c2658b;
        }
        p136q.C2658b c2658b2 = new p136q.C2658b(this);
        this.f26379l = c2658b2;
        return c2658b2;
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map map) {
        int size = map.size() + this.j;
        int i3 = this.j;
        int[] iArr = this.f26353h;
        if (iArr.length < size) {
            int[] iArrCopyOf = java.util.Arrays.copyOf(iArr, size);
            kotlin.jvm.internal.m.d(iArrCopyOf, "copyOf(...)");
            this.f26353h = iArrCopyOf;
            java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(this.f26354i, size * 2);
            kotlin.jvm.internal.m.d(objArrCopyOf, "copyOf(...)");
            this.f26354i = objArrCopyOf;
        }
        if (this.j != i3) {
            throw new java.util.ConcurrentModificationException();
        }
        for (java.util.Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final java.util.Collection values() {
        p136q.C2660d c2660d = this.f26380m;
        if (c2660d != null) {
            return c2660d;
        }
        p136q.C2660d c2660d2 = new p136q.C2660d(this);
        this.f26380m = c2660d2;
        return c2660d2;
    }
}
