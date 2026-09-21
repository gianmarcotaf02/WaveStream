package com.google.android.gms.internal.cast;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1728c0 extends com.google.android.gms.internal.cast.X implements java.util.Set {
    public static final /* synthetic */ int j = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public transient com.google.android.gms.internal.cast.AbstractC1720a0 f18880i;

    public static int o(int i3) {
        int iMax = java.lang.Math.max(i3, 2);
        if (iMax >= 751619276) {
            if (iMax < 1073741824) {
                return 1073741824;
            }
            throw new java.lang.IllegalArgumentException("collection too large");
        }
        int iHighestOneBit = java.lang.Integer.highestOneBit(iMax - 1);
        do {
            iHighestOneBit += iHighestOneBit;
        } while (((double) iHighestOneBit) * 0.7d < iMax);
        return iHighestOneBit;
    }

    public static com.google.android.gms.internal.cast.AbstractC1728c0 p(java.lang.Object[] objArr, int i3) {
        if (i3 == 0) {
            return com.google.android.gms.internal.cast.C1760k0.f18940q;
        }
        if (i3 == 1) {
            java.lang.Object obj = objArr[0];
            java.util.Objects.requireNonNull(obj);
            return new com.google.android.gms.internal.cast.C1764l0(obj);
        }
        int iO = o(i3);
        java.lang.Object[] objArr2 = new java.lang.Object[iO];
        int i9 = iO - 1;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < i3; i12++) {
            java.lang.Object obj2 = objArr[i12];
            if (obj2 == null) {
                throw new java.lang.NullPointerException(com.google.android.gms.internal.play_billing.M0.l(i12, "at index "));
            }
            int iHashCode = obj2.hashCode();
            int iB = com.google.android.gms.internal.cast.H.b(iHashCode);
            while (true) {
                int i13 = iB & i9;
                java.lang.Object obj3 = objArr2[i13];
                if (obj3 == null) {
                    objArr[i11] = obj2;
                    objArr2[i13] = obj2;
                    i10 += iHashCode;
                    i11++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                iB++;
            }
        }
        java.util.Arrays.fill(objArr, i11, i3, (java.lang.Object) null);
        if (i11 == 1) {
            java.lang.Object obj4 = objArr[0];
            java.util.Objects.requireNonNull(obj4);
            return new com.google.android.gms.internal.cast.C1764l0(obj4);
        }
        if (o(i11) < iO / 2) {
            return p(objArr, i11);
        }
        int length = objArr.length;
        if (i11 < (length >> 1) + (length >> 2)) {
            objArr = java.util.Arrays.copyOf(objArr, i11);
        }
        return new com.google.android.gms.internal.cast.C1760k0(i10, i9, i11, objArr, objArr2);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof com.google.android.gms.internal.cast.AbstractC1728c0) && (this instanceof com.google.android.gms.internal.cast.C1760k0)) {
            com.google.android.gms.internal.cast.AbstractC1728c0 abstractC1728c0 = (com.google.android.gms.internal.cast.AbstractC1728c0) obj;
            abstractC1728c0.getClass();
            if ((abstractC1728c0 instanceof com.google.android.gms.internal.cast.C1760k0) && hashCode() != obj.hashCode()) {
                return false;
            }
        }
        if (obj == this) {
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
    public int hashCode() {
        java.util.Iterator it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }
}
