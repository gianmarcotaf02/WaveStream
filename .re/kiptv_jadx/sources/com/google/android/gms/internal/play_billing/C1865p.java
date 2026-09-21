package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1865p extends p004a4.g implements java.util.ListIterator {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f19369i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final com.google.android.gms.internal.play_billing.r f19370k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1865p(com.google.android.gms.internal.play_billing.r rVar, int i3) {
        super(1);
        int size = rVar.size();
        E8.d.d0(i3, size);
        this.f19369i = size;
        this.j = i3;
        this.f19370k = rVar;
    }

    public final java.lang.Object a(int i3) {
        return this.f19370k.get(i3);
    }

    @Override // java.util.ListIterator
    public final void add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.j < this.f19369i;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.j > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final java.lang.Object next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        int i3 = this.j;
        this.j = i3 + 1;
        return a(i3);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.j;
    }

    @Override // java.util.ListIterator
    public final java.lang.Object previous() {
        if (!hasPrevious()) {
            throw new java.util.NoSuchElementException();
        }
        int i3 = this.j - 1;
        this.j = i3;
        return a(i3);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.j - 1;
    }

    @Override // java.util.ListIterator
    public final void set(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }
}
