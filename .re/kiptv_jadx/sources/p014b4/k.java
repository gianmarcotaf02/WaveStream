package p014b4;

/* JADX INFO: loaded from: classes.dex */
public abstract class k extends p014b4.f implements java.util.Set {
    public static final /* synthetic */ int j = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public transient p014b4.j f17890i;

    public static p014b4.k o(java.lang.Object[] objArr, int i3) {
        if (i3 == 0) {
            return p014b4.n.f17896q;
        }
        if (i3 == 1) {
            java.lang.Object obj = objArr[0];
            java.util.Objects.requireNonNull(obj);
            return new p014b4.o(obj);
        }
        int iP = p(i3);
        java.lang.Object[] objArr2 = new java.lang.Object[iP];
        int i9 = iP - 1;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < i3; i12++) {
            java.lang.Object obj2 = objArr[i12];
            if (obj2 == null) {
                throw new java.lang.NullPointerException(com.google.android.gms.internal.play_billing.M0.l(i12, "at index "));
            }
            int iHashCode = obj2.hashCode();
            int iRotateLeft = (int) (((long) java.lang.Integer.rotateLeft((int) (((long) iHashCode) * (-862048943)), 15)) * 461845907);
            while (true) {
                int i13 = iRotateLeft & i9;
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
                iRotateLeft++;
            }
        }
        java.util.Arrays.fill(objArr, i11, i3, (java.lang.Object) null);
        if (i11 == 1) {
            java.lang.Object obj4 = objArr[0];
            java.util.Objects.requireNonNull(obj4);
            return new p014b4.o(obj4);
        }
        if (p(i11) < iP / 2) {
            return o(objArr, i11);
        }
        if (i11 <= 0) {
            objArr = java.util.Arrays.copyOf(objArr, i11);
        }
        return new p014b4.n(i10, i9, i11, objArr, objArr2);
    }

    public static int p(int i3) {
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

    @Override // java.util.Collection, java.util.Set
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof p014b4.k) && (this instanceof p014b4.n)) {
            p014b4.k kVar = (p014b4.k) obj;
            kVar.getClass();
            if (kVar instanceof p014b4.n) {
                if (((p014b4.n) this).f17898l != obj.hashCode()) {
                    return false;
                }
            }
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof java.util.Set)) {
            return false;
        }
        java.util.Set set = (java.util.Set) obj;
        try {
            return size() == set.size() && containsAll(set);
        } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
            return false;
        }
    }

    public p014b4.j q() {
        p014b4.j jVar = this.f17890i;
        if (jVar != null) {
            return jVar;
        }
        p014b4.j jVarR = r();
        this.f17890i = jVarR;
        return jVarR;
    }

    public p014b4.j r() {
        java.lang.Object[] array = toArray(p014b4.f.f17883h);
        p014b4.g gVar = p014b4.j.f17889i;
        return p014b4.j.p(array, array.length);
    }
}
