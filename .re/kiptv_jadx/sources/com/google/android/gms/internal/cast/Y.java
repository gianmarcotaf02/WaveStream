package com.google.android.gms.internal.cast;

/* JADX INFO: loaded from: classes.dex */
public final class Y extends com.google.android.gms.internal.cast.AbstractC1768m0 implements java.util.ListIterator {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f18845h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f18846i;
    public final com.google.android.gms.internal.cast.AbstractC1720a0 j;

    public Y(com.google.android.gms.internal.cast.AbstractC1720a0 abstractC1720a0, int i3) {
        int size = abstractC1720a0.size();
        com.google.android.gms.internal.cast.H.l(i3, size);
        this.f18845h = size;
        this.f18846i = i3;
        this.j = abstractC1720a0;
    }

    public final java.lang.Object a(int i3) {
        return this.j.get(i3);
    }

    @Override // java.util.ListIterator
    public final void add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f18846i < this.f18845h;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f18846i > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final java.lang.Object next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        int i3 = this.f18846i;
        this.f18846i = i3 + 1;
        return a(i3);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f18846i;
    }

    @Override // java.util.ListIterator
    public final java.lang.Object previous() {
        if (!hasPrevious()) {
            throw new java.util.NoSuchElementException();
        }
        int i3 = this.f18846i - 1;
        this.f18846i = i3;
        return a(i3);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f18846i - 1;
    }

    @Override // java.util.ListIterator
    public final void set(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }
}
