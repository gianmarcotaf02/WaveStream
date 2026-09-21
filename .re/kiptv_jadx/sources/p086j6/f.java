package p086j6;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends p078i6.AbstractC2258i {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f24253h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p086j6.e f24254i;

    public /* synthetic */ f(p086j6.e eVar, int i3) {
        this.f24253h = i3;
        this.f24254i = eVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(java.lang.Object obj) {
        switch (this.f24253h) {
            case 0:
                java.util.Map.Entry element = (java.util.Map.Entry) obj;
                kotlin.jvm.internal.m.e(element, "element");
                throw new java.lang.UnsupportedOperationException();
            default:
                throw new java.lang.UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(java.util.Collection elements) {
        switch (this.f24253h) {
            case 0:
                kotlin.jvm.internal.m.e(elements, "elements");
                throw new java.lang.UnsupportedOperationException();
            default:
                kotlin.jvm.internal.m.e(elements, "elements");
                throw new java.lang.UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f24253h) {
            case 0:
                this.f24254i.clear();
                break;
            default:
                this.f24254i.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object obj) {
        switch (this.f24253h) {
            case 0:
                if (!(obj instanceof java.util.Map.Entry)) {
                    return false;
                }
                java.util.Map.Entry element = (java.util.Map.Entry) obj;
                kotlin.jvm.internal.m.e(element, "element");
                return this.f24254i.g(element);
            default:
                return this.f24254i.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(java.util.Collection elements) {
        switch (this.f24253h) {
            case 0:
                kotlin.jvm.internal.m.e(elements, "elements");
                return this.f24254i.e(elements);
            default:
                return super.containsAll(elements);
        }
    }

    @Override // p078i6.AbstractC2258i
    public final int d() {
        switch (this.f24253h) {
            case 0:
                break;
        }
        return this.f24254i.f24248p;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        switch (this.f24253h) {
            case 0:
                break;
        }
        return this.f24254i.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
        switch (this.f24253h) {
            case 0:
                p086j6.e eVar = this.f24254i;
                eVar.getClass();
                return new p086j6.c(eVar, 0);
            default:
                p086j6.e eVar2 = this.f24254i;
                eVar2.getClass();
                return new p086j6.c(eVar2, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(java.lang.Object obj) {
        switch (this.f24253h) {
            case 0:
                if (!(obj instanceof java.util.Map.Entry)) {
                    return false;
                }
                java.util.Map.Entry element = (java.util.Map.Entry) obj;
                kotlin.jvm.internal.m.e(element, "element");
                p086j6.e eVar = this.f24254i;
                eVar.getClass();
                eVar.c();
                int iJ = eVar.j(element.getKey());
                if (iJ < 0) {
                    return false;
                }
                java.lang.Object[] objArr = eVar.f24242i;
                kotlin.jvm.internal.m.b(objArr);
                if (!kotlin.jvm.internal.m.a(objArr[iJ], element.getValue())) {
                    return false;
                }
                eVar.o(iJ);
                return true;
            default:
                p086j6.e eVar2 = this.f24254i;
                eVar2.c();
                int iJ2 = eVar2.j(obj);
                if (iJ2 < 0) {
                    return false;
                }
                eVar2.o(iJ2);
                return true;
        }
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(java.util.Collection elements) {
        switch (this.f24253h) {
            case 0:
                kotlin.jvm.internal.m.e(elements, "elements");
                this.f24254i.c();
                break;
            default:
                kotlin.jvm.internal.m.e(elements, "elements");
                this.f24254i.c();
                break;
        }
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(java.util.Collection elements) {
        switch (this.f24253h) {
            case 0:
                kotlin.jvm.internal.m.e(elements, "elements");
                this.f24254i.c();
                break;
            default:
                kotlin.jvm.internal.m.e(elements, "elements");
                this.f24254i.c();
                break;
        }
        return super.retainAll(elements);
    }
}
