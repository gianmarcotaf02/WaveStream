package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1882y extends com.google.android.gms.internal.play_billing.AbstractC1874u {
    public final transient com.google.android.gms.internal.play_billing.A j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final transient com.google.android.gms.internal.play_billing.C1884z f19401k;

    public C1882y(com.google.android.gms.internal.play_billing.A a2, com.google.android.gms.internal.play_billing.C1884z c1884z) {
        this.j = a2;
        this.f19401k = c1884z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object obj) {
        return this.j.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1863o
    public final int d(java.lang.Object[] objArr) {
        return this.f19401k.d(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ java.util.Iterator iterator() {
        return this.f19401k.listIterator(0);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1874u, com.google.android.gms.internal.play_billing.AbstractC1863o
    public final com.google.android.gms.internal.play_billing.r n() {
        return this.f19401k;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.j.f19187m;
    }
}
