package p136q;

/* JADX INFO: renamed from: q.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2659c implements java.util.Iterator, java.util.Map.Entry {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f26374h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f26375i = -1;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p136q.C2661e f26376k;

    public C2659c(p136q.C2661e c2661e) {
        this.f26376k = c2661e;
        this.f26374h = c2661e.j - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(java.lang.Object obj) {
        if (!this.j) {
            throw new java.lang.IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof java.util.Map.Entry)) {
            return false;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        java.lang.Object key = entry.getKey();
        int i3 = this.f26375i;
        p136q.C2661e c2661e = this.f26376k;
        return kotlin.jvm.internal.m.a(key, c2661e.e(i3)) && kotlin.jvm.internal.m.a(entry.getValue(), c2661e.i(this.f26375i));
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getKey() {
        if (this.j) {
            return this.f26376k.e(this.f26375i);
        }
        throw new java.lang.IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getValue() {
        if (this.j) {
            return this.f26376k.i(this.f26375i);
        }
        throw new java.lang.IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f26375i < this.f26374h;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.j) {
            throw new java.lang.IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i3 = this.f26375i;
        p136q.C2661e c2661e = this.f26376k;
        java.lang.Object objE = c2661e.e(i3);
        java.lang.Object objI = c2661e.i(this.f26375i);
        return (objE == null ? 0 : objE.hashCode()) ^ (objI != null ? objI.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        this.f26375i++;
        this.j = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.j) {
            throw new java.lang.IllegalStateException();
        }
        this.f26376k.g(this.f26375i);
        this.f26375i--;
        this.f26374h--;
        this.j = false;
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object obj) {
        if (this.j) {
            return this.f26376k.h(this.f26375i, obj);
        }
        throw new java.lang.IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final java.lang.String toString() {
        return getKey() + "=" + getValue();
    }
}
