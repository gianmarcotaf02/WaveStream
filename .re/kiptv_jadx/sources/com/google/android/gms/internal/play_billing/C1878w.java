package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1878w extends com.google.android.gms.internal.play_billing.r {
    public final /* synthetic */ com.google.android.gms.internal.play_billing.C1880x j;

    public C1878w(com.google.android.gms.internal.play_billing.C1880x c1880x) {
        java.util.Objects.requireNonNull(c1880x);
        this.j = c1880x;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object get(int i3) {
        com.google.android.gms.internal.play_billing.C1880x c1880x = this.j;
        E8.d.b0(i3, c1880x.f19400l);
        int i9 = i3 + i3;
        java.lang.Object[] objArr = c1880x.f19399k;
        java.lang.Object obj = objArr[i9];
        java.util.Objects.requireNonNull(obj);
        java.lang.Object obj2 = objArr[i9 + 1];
        java.util.Objects.requireNonNull(obj2);
        return new java.util.AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1863o
    public final boolean o() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.j.f19400l;
    }
}
