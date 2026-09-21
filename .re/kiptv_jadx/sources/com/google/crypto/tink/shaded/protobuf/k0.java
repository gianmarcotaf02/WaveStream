package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class k0 extends java.util.AbstractList implements com.google.crypto.tink.shaded.protobuf.G, java.util.RandomAccess {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final com.google.crypto.tink.shaded.protobuf.F f19550h;

    public k0(com.google.crypto.tink.shaded.protobuf.F f9) {
        this.f19550h = f9;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.G
    public final java.util.List b() {
        return java.util.Collections.unmodifiableList(this.f19550h.f19480i);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.G
    public final com.google.crypto.tink.shaded.protobuf.G c() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object get(int i3) {
        return (java.lang.String) this.f19550h.get(i3);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final java.util.Iterator iterator() {
        com.google.crypto.tink.shaded.protobuf.j0 j0Var = new com.google.crypto.tink.shaded.protobuf.j0();
        j0Var.f19543h = this.f19550h.iterator();
        return j0Var;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.G
    public final void j(com.google.crypto.tink.shaded.protobuf.AbstractC1915j abstractC1915j) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.util.ListIterator listIterator(int i3) {
        com.google.crypto.tink.shaded.protobuf.i0 i0Var = new com.google.crypto.tink.shaded.protobuf.i0();
        i0Var.f19540h = this.f19550h.listIterator(i3);
        return i0Var;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.G
    public final java.lang.Object m(int i3) {
        return this.f19550h.f19480i.get(i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f19550h.size();
    }
}
