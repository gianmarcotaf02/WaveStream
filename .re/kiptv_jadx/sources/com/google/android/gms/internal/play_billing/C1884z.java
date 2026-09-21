package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1884z extends com.google.android.gms.internal.play_billing.r {
    public final transient java.lang.Object[] j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final transient int f19402k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final transient int f19403l;

    public C1884z(java.lang.Object[] objArr, int i3, int i9) {
        this.j = objArr;
        this.f19402k = i3;
        this.f19403l = i9;
    }

    @Override // java.util.List
    public final java.lang.Object get(int i3) {
        E8.d.b0(i3, this.f19403l);
        java.lang.Object obj = this.j[i3 + i3 + this.f19402k];
        java.util.Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1863o
    public final boolean o() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f19403l;
    }
}
