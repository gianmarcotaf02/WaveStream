package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1876v extends com.google.android.gms.internal.play_billing.r {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final com.google.android.gms.internal.play_billing.C1876v f19394l = new com.google.android.gms.internal.play_billing.C1876v(new java.lang.Object[0], 0);
    public final transient java.lang.Object[] j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final transient int f19395k;

    public C1876v(java.lang.Object[] objArr, int i3) {
        this.j = objArr;
        this.f19395k = i3;
    }

    @Override // com.google.android.gms.internal.play_billing.r, com.google.android.gms.internal.play_billing.AbstractC1863o
    public final int d(java.lang.Object[] objArr) {
        java.lang.Object[] objArr2 = this.j;
        int i3 = this.f19395k;
        java.lang.System.arraycopy(objArr2, 0, objArr, 0, i3);
        return i3;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1863o
    public final int e() {
        return this.f19395k;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1863o
    public final int f() {
        return 0;
    }

    @Override // java.util.List
    public final java.lang.Object get(int i3) {
        E8.d.b0(i3, this.f19395k);
        java.lang.Object obj = this.j[i3];
        java.util.Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1863o
    public final boolean o() {
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1863o
    public final java.lang.Object[] p() {
        return this.j;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f19395k;
    }
}
