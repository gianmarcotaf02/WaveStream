package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1880x extends com.google.android.gms.internal.play_billing.AbstractC1874u {
    public final transient com.google.android.gms.internal.play_billing.A j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final transient java.lang.Object[] f19399k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final transient int f19400l;

    public C1880x(com.google.android.gms.internal.play_billing.A a2, java.lang.Object[] objArr, int i3) {
        this.j = a2;
        this.f19399k = objArr;
        this.f19400l = i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object obj) {
        if (obj instanceof java.util.Map.Entry) {
            java.util.Map.Entry entry = (java.util.Map.Entry) obj;
            java.lang.Object key = entry.getKey();
            java.lang.Object value = entry.getValue();
            if (value != null && value.equals(this.j.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1863o
    public final int d(java.lang.Object[] objArr) {
        return n().d(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ java.util.Iterator iterator() {
        return n().listIterator(0);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1874u
    public final com.google.android.gms.internal.play_billing.r q() {
        return new com.google.android.gms.internal.play_billing.C1878w(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f19400l;
    }
}
