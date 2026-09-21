package p064h0;

/* JADX INFO: loaded from: classes.dex */
public final class h extends java.util.AbstractCollection implements java.util.Collection, p201y6.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f22442h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.Object f22443i;

    public /* synthetic */ h(int i3, java.lang.Object obj) {
        this.f22442h = i3;
        this.f22443i = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(java.lang.Object obj) {
        switch (this.f22442h) {
            case 0:
                throw new java.lang.UnsupportedOperationException();
            default:
                throw new java.lang.UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(java.util.Collection elements) {
        switch (this.f22442h) {
            case 1:
                kotlin.jvm.internal.m.e(elements, "elements");
                throw new java.lang.UnsupportedOperationException();
            default:
                return super.addAll(elements);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.f22442h) {
            case 0:
                ((p089k0.i) this.f22443i).clear();
                break;
            default:
                ((p086j6.e) this.f22443i).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        switch (this.f22442h) {
            case 0:
                return ((p089k0.i) this.f22443i).containsValue(obj);
            default:
                return ((p086j6.e) this.f22443i).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.f22442h) {
            case 1:
                return ((p086j6.e) this.f22443i).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        switch (this.f22442h) {
            case 0:
                p064h0.l[] lVarArr = new p064h0.l[8];
                for (int i3 = 0; i3 < 8; i3++) {
                    lVarArr[i3] = new p064h0.m(2);
                }
                return new p064h0.g((p089k0.i) this.f22443i, lVarArr);
            default:
                p086j6.e eVar = (p086j6.e) this.f22443i;
                eVar.getClass();
                return new p086j6.c(eVar, 2);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(java.lang.Object obj) {
        switch (this.f22442h) {
            case 1:
                p086j6.e eVar = (p086j6.e) this.f22443i;
                eVar.c();
                int iL = eVar.l(obj);
                if (iL < 0) {
                    return false;
                }
                eVar.o(iL);
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(java.util.Collection elements) {
        switch (this.f22442h) {
            case 1:
                kotlin.jvm.internal.m.e(elements, "elements");
                ((p086j6.e) this.f22443i).c();
                break;
        }
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(java.util.Collection elements) {
        switch (this.f22442h) {
            case 1:
                kotlin.jvm.internal.m.e(elements, "elements");
                ((p086j6.e) this.f22443i).c();
                break;
        }
        return super.retainAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        switch (this.f22442h) {
            case 0:
                p089k0.i iVar = (p089k0.i) this.f22443i;
                iVar.getClass();
                return iVar.f24420l;
            default:
                return ((p086j6.e) this.f22443i).f24248p;
        }
    }
}
