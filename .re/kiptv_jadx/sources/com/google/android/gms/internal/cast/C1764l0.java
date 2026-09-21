package com.google.android.gms.internal.cast;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1764l0 extends com.google.android.gms.internal.cast.AbstractC1728c0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final transient java.lang.Object f18974k;

    public C1764l0(java.lang.Object obj) {
        this.f18974k = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object obj) {
        return this.f18974k.equals(obj);
    }

    @Override // com.google.android.gms.internal.cast.X
    public final int d(java.lang.Object[] objArr) {
        objArr[0] = this.f18974k;
        return 1;
    }

    @Override // com.google.android.gms.internal.cast.AbstractC1728c0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f18974k.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ java.util.Iterator iterator() {
        return new com.google.android.gms.internal.cast.C1732d0(this.f18974k);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final java.lang.String toString() {
        return Y6.f.h("[", this.f18974k.toString(), "]");
    }
}
