package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class F extends com.google.crypto.tink.shaded.protobuf.AbstractC1907b implements com.google.crypto.tink.shaded.protobuf.G, java.util.RandomAccess {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f19480i;

    static {
        new com.google.crypto.tink.shaded.protobuf.F(10).f19514h = false;
    }

    public F(int i3) {
        this(new java.util.ArrayList(i3));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i3, java.lang.Object obj) {
        d();
        this.f19480i.add(i3, (java.lang.String) obj);
        ((java.util.AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1907b, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection collection) {
        return addAll(this.f19480i.size(), collection);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.G
    public final java.util.List b() {
        return java.util.Collections.unmodifiableList(this.f19480i);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.G
    public final com.google.crypto.tink.shaded.protobuf.G c() {
        return this.f19514h ? new com.google.crypto.tink.shaded.protobuf.k0(this) : this;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1907b, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        d();
        this.f19480i.clear();
        ((java.util.AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.A
    public final com.google.crypto.tink.shaded.protobuf.A g(int i3) {
        java.util.ArrayList arrayList = this.f19480i;
        if (i3 < arrayList.size()) {
            throw new java.lang.IllegalArgumentException();
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(i3);
        arrayList2.addAll(arrayList);
        return new com.google.crypto.tink.shaded.protobuf.F(arrayList2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object get(int i3) {
        java.lang.String str;
        java.util.ArrayList arrayList = this.f19480i;
        java.lang.Object obj = arrayList.get(i3);
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        if (!(obj instanceof com.google.crypto.tink.shaded.protobuf.AbstractC1915j)) {
            byte[] bArr = (byte[]) obj;
            java.lang.String str2 = new java.lang.String(bArr, com.google.crypto.tink.shaded.protobuf.B.f19466a);
            com.google.crypto.tink.shaded.protobuf.q0 q0Var = com.google.crypto.tink.shaded.protobuf.s0.f19590a;
            if (com.google.crypto.tink.shaded.protobuf.s0.f19590a.C(bArr, 0, bArr.length)) {
                arrayList.set(i3, str2);
            }
            return str2;
        }
        com.google.crypto.tink.shaded.protobuf.AbstractC1915j abstractC1915j = (com.google.crypto.tink.shaded.protobuf.AbstractC1915j) obj;
        abstractC1915j.getClass();
        java.nio.charset.Charset charset = com.google.crypto.tink.shaded.protobuf.B.f19466a;
        if (abstractC1915j.size() == 0) {
            str = "";
        } else {
            com.google.crypto.tink.shaded.protobuf.C1914i c1914i = (com.google.crypto.tink.shaded.protobuf.C1914i) abstractC1915j;
            str = new java.lang.String(c1914i.f19539k, c1914i.p(), c1914i.size(), charset);
        }
        com.google.crypto.tink.shaded.protobuf.C1914i c1914i2 = (com.google.crypto.tink.shaded.protobuf.C1914i) abstractC1915j;
        int iP = c1914i2.p();
        if (com.google.crypto.tink.shaded.protobuf.s0.f19590a.C(c1914i2.f19539k, iP, c1914i2.size() + iP)) {
            arrayList.set(i3, str);
        }
        return str;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.G
    public final void j(com.google.crypto.tink.shaded.protobuf.AbstractC1915j abstractC1915j) {
        d();
        this.f19480i.add(abstractC1915j);
        ((java.util.AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.G
    public final java.lang.Object m(int i3) {
        return this.f19480i.get(i3);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1907b, java.util.AbstractList, java.util.List
    public final java.lang.Object remove(int i3) {
        d();
        java.lang.Object objRemove = this.f19480i.remove(i3);
        ((java.util.AbstractList) this).modCount++;
        if (objRemove instanceof java.lang.String) {
            return (java.lang.String) objRemove;
        }
        if (!(objRemove instanceof com.google.crypto.tink.shaded.protobuf.AbstractC1915j)) {
            return new java.lang.String((byte[]) objRemove, com.google.crypto.tink.shaded.protobuf.B.f19466a);
        }
        com.google.crypto.tink.shaded.protobuf.AbstractC1915j abstractC1915j = (com.google.crypto.tink.shaded.protobuf.AbstractC1915j) objRemove;
        abstractC1915j.getClass();
        java.nio.charset.Charset charset = com.google.crypto.tink.shaded.protobuf.B.f19466a;
        if (abstractC1915j.size() == 0) {
            return "";
        }
        com.google.crypto.tink.shaded.protobuf.C1914i c1914i = (com.google.crypto.tink.shaded.protobuf.C1914i) abstractC1915j;
        return new java.lang.String(c1914i.f19539k, c1914i.p(), c1914i.size(), charset);
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object set(int i3, java.lang.Object obj) {
        d();
        java.lang.Object obj2 = this.f19480i.set(i3, (java.lang.String) obj);
        if (obj2 instanceof java.lang.String) {
            return (java.lang.String) obj2;
        }
        if (!(obj2 instanceof com.google.crypto.tink.shaded.protobuf.AbstractC1915j)) {
            return new java.lang.String((byte[]) obj2, com.google.crypto.tink.shaded.protobuf.B.f19466a);
        }
        com.google.crypto.tink.shaded.protobuf.AbstractC1915j abstractC1915j = (com.google.crypto.tink.shaded.protobuf.AbstractC1915j) obj2;
        abstractC1915j.getClass();
        java.nio.charset.Charset charset = com.google.crypto.tink.shaded.protobuf.B.f19466a;
        if (abstractC1915j.size() == 0) {
            return "";
        }
        com.google.crypto.tink.shaded.protobuf.C1914i c1914i = (com.google.crypto.tink.shaded.protobuf.C1914i) abstractC1915j;
        return new java.lang.String(c1914i.f19539k, c1914i.p(), c1914i.size(), charset);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f19480i.size();
    }

    public F(java.util.ArrayList arrayList) {
        this.f19480i = arrayList;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1907b, java.util.AbstractList, java.util.List
    public final boolean addAll(int i3, java.util.Collection collection) {
        d();
        if (collection instanceof com.google.crypto.tink.shaded.protobuf.G) {
            collection = ((com.google.crypto.tink.shaded.protobuf.G) collection).b();
        }
        boolean zAddAll = this.f19480i.addAll(i3, collection);
        ((java.util.AbstractList) this).modCount++;
        return zAddAll;
    }
}
