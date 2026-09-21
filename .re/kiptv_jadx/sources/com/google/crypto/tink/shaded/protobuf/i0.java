package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class i0 implements java.util.ListIterator {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public java.util.ListIterator f19540h;

    @Override // java.util.ListIterator
    public final void add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f19540h.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f19540h.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final java.lang.Object next() {
        return (java.lang.String) this.f19540h.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f19540h.nextIndex();
    }

    @Override // java.util.ListIterator
    public final java.lang.Object previous() {
        return (java.lang.String) this.f19540h.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f19540h.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void set(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }
}
