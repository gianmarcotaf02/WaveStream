package p076i4;

/* JADX INFO: renamed from: i4.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2207m extends java.util.AbstractCollection {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.Object f22917h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.util.Collection f22918i;
    public final p076i4.C2211o j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final java.util.Collection f22919k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p076i4.AbstractC2215q f22920l;

    public AbstractC2207m(p076i4.AbstractC2215q abstractC2215q, java.lang.Object obj, java.util.Collection collection, p076i4.C2211o c2211o) {
        this.f22920l = abstractC2215q;
        this.f22917h = obj;
        this.f22918i = collection;
        this.j = c2211o;
        this.f22919k = c2211o == null ? null : c2211o.f22918i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(java.lang.Object obj) {
        e();
        boolean zIsEmpty = this.f22918i.isEmpty();
        boolean zAdd = this.f22918i.add(obj);
        if (zAdd) {
            this.f22920l.f22930m++;
            if (zIsEmpty) {
                d();
            }
        }
        return zAdd;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(java.util.Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = this.f22918i.addAll(collection);
        if (zAddAll) {
            this.f22920l.f22930m += this.f22918i.size() - size;
            if (size == 0) {
                d();
            }
        }
        return zAddAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.f22918i.clear();
        this.f22920l.f22930m -= size;
        f();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        e();
        return this.f22918i.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(java.util.Collection collection) {
        e();
        return this.f22918i.containsAll(collection);
    }

    public final void d() {
        p076i4.C2211o c2211o = this.j;
        if (c2211o != null) {
            c2211o.d();
        } else {
            this.f22920l.f22929l.put(this.f22917h, this.f22918i);
        }
    }

    public final void e() {
        java.util.Collection collection;
        p076i4.C2211o c2211o = this.j;
        if (c2211o != null) {
            c2211o.e();
            if (c2211o.f22918i != this.f22919k) {
                throw new java.util.ConcurrentModificationException();
            }
        } else {
            if (!this.f22918i.isEmpty() || (collection = (java.util.Collection) this.f22920l.f22929l.get(this.f22917h)) == null) {
                return;
            }
            this.f22918i = collection;
        }
    }

    @Override // java.util.Collection
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        e();
        return this.f22918i.equals(obj);
    }

    public final void f() {
        p076i4.C2211o c2211o = this.j;
        if (c2211o != null) {
            c2211o.f();
        } else if (this.f22918i.isEmpty()) {
            this.f22920l.f22929l.remove(this.f22917h);
        }
    }

    @Override // java.util.Collection
    public final int hashCode() {
        e();
        return this.f22918i.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        e();
        return new p076i4.C2191e(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(java.lang.Object obj) {
        e();
        boolean zRemove = this.f22918i.remove(obj);
        if (zRemove) {
            this.f22920l.f22930m--;
            f();
        }
        return zRemove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(java.util.Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zRemoveAll = this.f22918i.removeAll(collection);
        if (zRemoveAll) {
            this.f22920l.f22930m += this.f22918i.size() - size;
            f();
        }
        return zRemoveAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        collection.getClass();
        int size = size();
        boolean zRetainAll = this.f22918i.retainAll(collection);
        if (zRetainAll) {
            this.f22920l.f22930m += this.f22918i.size() - size;
            f();
        }
        return zRetainAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        e();
        return this.f22918i.size();
    }

    @Override // java.util.AbstractCollection
    public final java.lang.String toString() {
        e();
        return this.f22918i.toString();
    }
}
