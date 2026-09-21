package p076i4;

/* JADX INFO: renamed from: i4.p0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2214p0 extends p076i4.W implements java.util.Set {
    public static final /* synthetic */ int j = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public transient p076i4.AbstractC2186b0 f22928i;

    public static int r(int i3) {
        int iMax = java.lang.Math.max(i3, 2);
        if (iMax >= 751619276) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.M(iMax < 1073741824, "collection too large");
            return 1073741824;
        }
        int iHighestOneBit = java.lang.Integer.highestOneBit(iMax - 1) << 1;
        while (((double) iHighestOneBit) * 0.7d < iMax) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    public static p076i4.AbstractC2214p0 s(java.lang.Object[] objArr, int i3) {
        if (i3 == 0) {
            return p076i4.Z0.f22857q;
        }
        if (i3 == 1) {
            java.lang.Object obj = objArr[0];
            java.util.Objects.requireNonNull(obj);
            return new p076i4.f1(obj);
        }
        int iR = r(i3);
        java.lang.Object[] objArr2 = new java.lang.Object[iR];
        int i9 = iR - 1;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < i3; i12++) {
            java.lang.Object obj2 = objArr[i12];
            if (obj2 == null) {
                throw new java.lang.NullPointerException(com.google.android.gms.internal.play_billing.M0.l(i12, "at index "));
            }
            int iHashCode = obj2.hashCode();
            int iV = p076i4.AbstractC2230y.v(iHashCode);
            while (true) {
                int i13 = iV & i9;
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
                iV++;
            }
        }
        java.util.Arrays.fill(objArr, i11, i3, (java.lang.Object) null);
        if (i11 == 1) {
            java.lang.Object obj4 = objArr[0];
            java.util.Objects.requireNonNull(obj4);
            return new p076i4.f1(obj4);
        }
        if (r(i11) < iR / 2) {
            return s(objArr, i11);
        }
        int length = objArr.length;
        if (i11 < (length >> 1) + (length >> 2)) {
            objArr = java.util.Arrays.copyOf(objArr, i11);
        }
        return new p076i4.Z0(i10, i9, i11, objArr, objArr2);
    }

    public static p076i4.AbstractC2214p0 t(java.util.Collection collection) {
        if ((collection instanceof p076i4.AbstractC2214p0) && !(collection instanceof java.util.SortedSet)) {
            p076i4.AbstractC2214p0 abstractC2214p0 = (p076i4.AbstractC2214p0) collection;
            if (!abstractC2214p0.p()) {
                return abstractC2214p0;
            }
        }
        java.lang.Object[] array = collection.toArray();
        return s(array, array.length);
    }

    public static p076i4.AbstractC2214p0 v(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object... objArr) {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.M(objArr.length <= 2147483641, "the total number of elements must fit in an int");
        int length = objArr.length + 6;
        java.lang.Object[] objArr2 = new java.lang.Object[length];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        java.lang.System.arraycopy(objArr, 0, objArr2, 6, objArr.length);
        return s(objArr2, length);
    }

    @Override // p076i4.W
    public p076i4.AbstractC2186b0 d() {
        p076i4.AbstractC2186b0 abstractC2186b0 = this.f22928i;
        if (abstractC2186b0 != null) {
            return abstractC2186b0;
        }
        p076i4.AbstractC2186b0 abstractC2186b0U = u();
        this.f22928i = abstractC2186b0U;
        return abstractC2186b0U;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof p076i4.AbstractC2214p0) && (this instanceof p076i4.Z0)) {
            p076i4.AbstractC2214p0 abstractC2214p0 = (p076i4.AbstractC2214p0) obj;
            abstractC2214p0.getClass();
            if ((abstractC2214p0 instanceof p076i4.Z0) && hashCode() != obj.hashCode()) {
                return false;
            }
        }
        return p076i4.AbstractC2230y.i(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return p076i4.AbstractC2230y.n(this);
    }

    public p076i4.AbstractC2186b0 u() {
        java.lang.Object[] array = toArray(p076i4.W.f22843h);
        p076i4.Z z6 = p076i4.AbstractC2186b0.f22868i;
        return p076i4.AbstractC2186b0.r(array, array.length);
    }
}
