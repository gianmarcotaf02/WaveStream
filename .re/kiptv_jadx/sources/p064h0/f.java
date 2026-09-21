package p064h0;

/* JADX INFO: loaded from: classes.dex */
public final class f extends p078i6.AbstractC2258i {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f22440h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p089k0.i f22441i;

    public /* synthetic */ f(int i3, p089k0.i iVar) {
        this.f22440h = i3;
        this.f22441i = iVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(java.lang.Object obj) {
        switch (this.f22440h) {
            case 0:
                throw new java.lang.UnsupportedOperationException();
            default:
                throw new java.lang.UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f22440h) {
            case 0:
                this.f22441i.clear();
                break;
            default:
                this.f22441i.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object obj) {
        switch (this.f22440h) {
            case 0:
                if (!(obj instanceof java.util.Map.Entry)) {
                    return false;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry) obj;
                if ((entry != null ? entry : null) == null) {
                    return false;
                }
                java.lang.Object key = entry.getKey();
                p089k0.i iVar = this.f22441i;
                java.lang.Object obj2 = iVar.get(key);
                if (obj2 != null) {
                    return obj2.equals(entry.getValue());
                }
                return entry.getValue() == null && iVar.containsKey(entry.getKey());
            default:
                return this.f22441i.containsKey(obj);
        }
    }

    @Override // p078i6.AbstractC2258i
    public final int d() {
        switch (this.f22440h) {
            case 0:
                p089k0.i iVar = this.f22441i;
                iVar.getClass();
                return iVar.f24420l;
            default:
                p089k0.i iVar2 = this.f22441i;
                iVar2.getClass();
                return iVar2.f24420l;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
        switch (this.f22440h) {
            case 0:
                return new D0.G(this.f22441i);
            default:
                p064h0.l[] lVarArr = new p064h0.l[8];
                for (int i3 = 0; i3 < 8; i3++) {
                    lVarArr[i3] = new p064h0.m(1);
                }
                return new p064h0.g(this.f22441i, lVarArr);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(java.lang.Object obj) {
        switch (this.f22440h) {
            case 0:
                if (!(obj instanceof java.util.Map.Entry)) {
                    return false;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry) obj;
                if ((entry != null ? entry : null) == null) {
                    return false;
                }
                return this.f22441i.remove(entry.getKey(), entry.getValue());
            default:
                p089k0.i iVar = this.f22441i;
                if (!iVar.containsKey(obj)) {
                    return false;
                }
                iVar.remove(obj);
                return true;
        }
    }
}
