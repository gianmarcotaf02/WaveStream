package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1874u extends com.google.android.gms.internal.play_billing.AbstractC1863o implements java.util.Set {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public transient com.google.android.gms.internal.play_billing.r f19391i;

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(java.lang.Object obj) {
        if (obj == this || obj == this) {
            return true;
        }
        if (obj instanceof java.util.Set) {
            java.util.Set set = (java.util.Set) obj;
            try {
                return size() == set.size() && containsAll(set);
            } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        java.util.Iterator it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1863o
    public com.google.android.gms.internal.play_billing.r n() {
        com.google.android.gms.internal.play_billing.r rVar = this.f19391i;
        if (rVar != null) {
            return rVar;
        }
        com.google.android.gms.internal.play_billing.r rVarQ = q();
        this.f19391i = rVarQ;
        return rVarQ;
    }

    public com.google.android.gms.internal.play_billing.r q() {
        java.lang.Object[] array = toArray(com.google.android.gms.internal.play_billing.AbstractC1863o.f19361h);
        com.google.android.gms.internal.play_billing.C1865p c1865p = com.google.android.gms.internal.play_billing.r.f19379i;
        return com.google.android.gms.internal.play_billing.r.r(array, array.length);
    }
}
