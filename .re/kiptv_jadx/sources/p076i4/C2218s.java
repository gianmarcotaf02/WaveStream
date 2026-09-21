package p076i4;

/* JADX INFO: renamed from: i4.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2218s extends java.util.AbstractCollection {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f22935h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.Object f22936i;

    public /* synthetic */ C2218s(int i3, java.lang.Object obj) {
        this.f22935h = i3;
        this.f22936i = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.f22935h) {
            case 0:
                ((p076i4.AbstractC2222u) this.f22936i).clear();
                break;
            case 1:
                ((p076i4.AbstractC2215q) this.f22936i).clear();
                break;
            case 2:
                ((p076i4.D) this.f22936i).clear();
                break;
            default:
                ((java.util.AbstractMap) this.f22936i).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(java.lang.Object obj) {
        switch (this.f22935h) {
            case 0:
                if (!(obj instanceof java.util.Map.Entry)) {
                    return false;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry) obj;
                return ((p076i4.AbstractC2222u) this.f22936i).b(entry.getKey(), entry.getValue());
            case 1:
                return ((p076i4.AbstractC2215q) this.f22936i).c(obj);
            case 2:
            default:
                return super.contains(obj);
            case 3:
                return ((java.util.AbstractMap) this.f22936i).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.f22935h) {
            case 3:
                return ((java.util.AbstractMap) this.f22936i).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        switch (this.f22935h) {
            case 0:
                return ((p076i4.AbstractC2222u) this.f22936i).h();
            case 1:
                return new p076i4.C2187c((p076i4.AbstractC2215q) this.f22936i, 0);
            case 2:
                p076i4.D d4 = (p076i4.D) this.f22936i;
                java.util.Map mapC = d4.c();
                return mapC != null ? mapC.values().iterator() : new p076i4.A(d4, 2);
            default:
                return new p076i4.D0(((java.util.AbstractMap) this.f22936i).entrySet().iterator(), 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(java.lang.Object obj) {
        switch (this.f22935h) {
            case 0:
                if (!(obj instanceof java.util.Map.Entry)) {
                    return false;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry) obj;
                return ((p076i4.AbstractC2222u) this.f22936i).remove(entry.getKey(), entry.getValue());
            case 3:
                try {
                    return super.remove(obj);
                } catch (java.lang.UnsupportedOperationException unused) {
                    java.util.AbstractMap abstractMap = (java.util.AbstractMap) this.f22936i;
                    for (java.util.Map.Entry entry2 : abstractMap.entrySet()) {
                        if (com.google.android.gms.internal.play_billing.AbstractC1853k0.m(obj, entry2.getValue())) {
                            abstractMap.remove(entry2.getKey());
                            return true;
                        }
                    }
                    return false;
                }
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(java.util.Collection collection) {
        switch (this.f22935h) {
            case 3:
                try {
                    collection.getClass();
                    return super.removeAll(collection);
                } catch (java.lang.UnsupportedOperationException unused) {
                    java.util.HashSet hashSet = new java.util.HashSet();
                    java.util.AbstractMap abstractMap = (java.util.AbstractMap) this.f22936i;
                    for (java.util.Map.Entry entry : abstractMap.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return abstractMap.keySet().removeAll(hashSet);
                }
            default:
                return super.removeAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(java.util.Collection collection) {
        switch (this.f22935h) {
            case 3:
                try {
                    collection.getClass();
                    return super.retainAll(collection);
                } catch (java.lang.UnsupportedOperationException unused) {
                    java.util.HashSet hashSet = new java.util.HashSet();
                    java.util.AbstractMap abstractMap = (java.util.AbstractMap) this.f22936i;
                    for (java.util.Map.Entry entry : abstractMap.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return abstractMap.keySet().retainAll(hashSet);
                }
            default:
                return super.retainAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        switch (this.f22935h) {
            case 0:
                return ((p076i4.AbstractC2222u) this.f22936i).size();
            case 1:
                return ((p076i4.AbstractC2215q) this.f22936i).f22930m;
            case 2:
                return ((p076i4.D) this.f22936i).size();
            default:
                return ((java.util.AbstractMap) this.f22936i).size();
        }
    }

    public C2218s(java.util.AbstractMap abstractMap) {
        this.f22935h = 3;
        this.f22936i = abstractMap;
    }
}
