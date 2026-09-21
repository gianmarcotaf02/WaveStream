package com.google.android.gms.internal.cast;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1732d0 extends com.google.android.gms.internal.cast.AbstractC1768m0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.Object f18887h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f18888i;

    public C1732d0(java.lang.Object obj) {
        this.f18887h = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f18888i;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        if (this.f18888i) {
            throw new java.util.NoSuchElementException();
        }
        this.f18888i = true;
        return this.f18887h;
    }
}
