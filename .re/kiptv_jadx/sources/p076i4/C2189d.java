package p076i4;

/* JADX INFO: renamed from: i4.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2189d extends p076i4.e1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f22880h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.AbstractMap f22881i;

    public /* synthetic */ C2189d(java.util.AbstractMap abstractMap, int i3) {
        this.f22880h = i3;
        this.f22881i = abstractMap;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        e().clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(java.lang.Object obj) {
        switch (this.f22880h) {
            case 0:
                java.util.Set setEntrySet = ((p076i4.C2193f) this.f22881i).j.entrySet();
                setEntrySet.getClass();
                try {
                    return setEntrySet.contains(obj);
                } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
                    return false;
                }
            default:
                return d(obj);
        }
    }

    public final boolean d(java.lang.Object obj) {
        java.lang.Object obj2;
        if (!(obj instanceof java.util.Map.Entry)) {
            return false;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        java.lang.Object key = entry.getKey();
        java.util.Map mapE = e();
        mapE.getClass();
        try {
            obj2 = mapE.get(key);
        } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
            obj2 = null;
        }
        if (com.google.android.gms.internal.play_billing.AbstractC1853k0.m(obj2, entry.getValue())) {
            return obj2 != null || e().containsKey(key);
        }
        return false;
    }

    public final java.util.Map e() {
        switch (this.f22880h) {
            case 0:
                return (p076i4.C2193f) this.f22881i;
            default:
                return (p076i4.F0) this.f22881i;
        }
    }

    public final boolean f(java.lang.Object obj) {
        if (contains(obj) && (obj instanceof java.util.Map.Entry)) {
            return e().keySet().remove(((java.util.Map.Entry) obj).getKey());
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return e().isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
        switch (this.f22880h) {
            case 0:
                return new p076i4.C2191e((p076i4.C2193f) this.f22881i);
            default:
                return ((p076i4.F0) this.f22881i).b();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(java.lang.Object obj) {
        java.lang.Object objRemove;
        switch (this.f22880h) {
            case 0:
                if (!contains(obj)) {
                    return false;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry) obj;
                java.util.Objects.requireNonNull(entry);
                p076i4.AbstractC2215q abstractC2215q = ((p076i4.C2193f) this.f22881i).f22893k;
                java.lang.Object key = entry.getKey();
                java.util.Map map = abstractC2215q.f22929l;
                map.getClass();
                try {
                    objRemove = map.remove(key);
                    break;
                } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
                    objRemove = null;
                }
                java.util.Collection collection = (java.util.Collection) objRemove;
                if (collection != null) {
                    int size = collection.size();
                    collection.clear();
                    abstractC2215q.f22930m -= size;
                }
                return true;
            default:
                return f(obj);
        }
    }

    @Override // p076i4.e1, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(java.util.Collection collection) {
        try {
            collection.getClass();
            return p076i4.AbstractC2230y.t(this, collection);
        } catch (java.lang.UnsupportedOperationException unused) {
            java.util.Iterator it = collection.iterator();
            boolean zRemove = false;
            while (it.hasNext()) {
                zRemove |= remove(it.next());
            }
            return zRemove;
        }
    }

    @Override // p076i4.e1, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(java.util.Collection collection) {
        try {
            collection.getClass();
            return super.retainAll(collection);
        } catch (java.lang.UnsupportedOperationException unused) {
            java.util.HashSet hashSet = new java.util.HashSet(p076i4.AbstractC2230y.a(collection.size()));
            for (java.lang.Object obj : collection) {
                if (contains(obj) && (obj instanceof java.util.Map.Entry)) {
                    hashSet.add(((java.util.Map.Entry) obj).getKey());
                }
            }
            return e().keySet().retainAll(hashSet);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return e().size();
    }
}
