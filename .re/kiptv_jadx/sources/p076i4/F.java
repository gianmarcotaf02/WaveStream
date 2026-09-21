package p076i4;

/* JADX INFO: loaded from: classes.dex */
public final class F extends java.util.AbstractSet implements java.io.Serializable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public transient java.lang.Object f22792h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public transient int[] f22793i;
    public transient java.lang.Object[] j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public transient int f22794k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public transient int f22795l;

    public static p076i4.F d(int i3) {
        p076i4.F f9 = new p076i4.F();
        com.google.android.gms.internal.play_billing.AbstractC1864o0.M(i3 >= 0, "Expected size must be >= 0");
        f9.f22794k = com.google.crypto.tink.shaded.protobuf.q0.p(i3, 1);
        return f9;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(java.lang.Object obj) {
        int iMin;
        char c9 = 31;
        if (f()) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.Z(f(), "Arrays already allocated");
            int i3 = this.f22794k;
            int iMax = java.lang.Math.max(i3 + 1, 2);
            int iHighestOneBit = java.lang.Integer.highestOneBit(iMax);
            if (iMax > ((int) (1.0d * ((double) iHighestOneBit))) && (iHighestOneBit = iHighestOneBit << 1) <= 0) {
                iHighestOneBit = 1073741824;
            }
            int iMax2 = java.lang.Math.max(4, iHighestOneBit);
            this.f22792h = p076i4.AbstractC2230y.g(iMax2);
            this.f22794k = p076i4.AbstractC2230y.p(this.f22794k, 32 - java.lang.Integer.numberOfLeadingZeros(iMax2 - 1), 31);
            this.f22793i = new int[i3];
            this.j = new java.lang.Object[i3];
        }
        java.util.Set setE = e();
        if (setE != null) {
            return setE.add(obj);
        }
        int[] iArrO = o();
        java.lang.Object[] objArrN = n();
        int i9 = this.f22795l;
        int i10 = i9 + 1;
        int iW = p076i4.AbstractC2230y.w(obj);
        int iP = (1 << (this.f22794k & 31)) - 1;
        int i11 = iW & iP;
        java.lang.Object obj2 = this.f22792h;
        java.util.Objects.requireNonNull(obj2);
        int iX = p076i4.AbstractC2230y.x(i11, obj2);
        if (iX != 0) {
            int i12 = ~iP;
            int i13 = iW & i12;
            int i14 = 0;
            while (true) {
                int i15 = iX - 1;
                int i16 = iArrO[i15];
                char c10 = c9;
                if ((i16 & i12) == i13 && com.google.android.gms.internal.play_billing.AbstractC1853k0.m(obj, objArrN[i15])) {
                    return false;
                }
                int i17 = i16 & iP;
                i14++;
                if (i17 == 0) {
                    if (i14 < 9) {
                        if (i10 <= iP) {
                            iArrO[i15] = p076i4.AbstractC2230y.p(i16, i10, iP);
                            break;
                        }
                        iP = p(iP, p076i4.AbstractC2230y.r(iP), iW, i9);
                        break;
                    }
                    java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet(1 << (this.f22794k & 31), 1.0f);
                    int i18 = isEmpty() ? -1 : 0;
                    while (i18 >= 0) {
                        linkedHashSet.add(n()[i18]);
                        i18++;
                        if (i18 >= this.f22795l) {
                            i18 = -1;
                        }
                    }
                    this.f22792h = linkedHashSet;
                    this.f22793i = null;
                    this.j = null;
                    this.f22794k += 32;
                    return linkedHashSet.add(obj);
                }
                iX = i17;
                c9 = c10;
            }
        } else if (i10 > iP) {
            iP = p(iP, p076i4.AbstractC2230y.r(iP), iW, i9);
        } else {
            java.lang.Object obj3 = this.f22792h;
            java.util.Objects.requireNonNull(obj3);
            p076i4.AbstractC2230y.y(i11, i10, obj3);
        }
        int length = o().length;
        if (i10 > length && (iMin = java.lang.Math.min(1073741823, (java.lang.Math.max(1, length >>> 1) + length) | 1)) != length) {
            this.f22793i = java.util.Arrays.copyOf(o(), iMin);
            this.j = java.util.Arrays.copyOf(n(), iMin);
        }
        o()[i9] = p076i4.AbstractC2230y.p(iW, 0, iP);
        n()[i9] = obj;
        this.f22795l = i10;
        this.f22794k += 32;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        if (f()) {
            return;
        }
        this.f22794k += 32;
        java.util.Set setE = e();
        if (setE != null) {
            this.f22794k = com.google.crypto.tink.shaded.protobuf.q0.p(size(), 3);
            setE.clear();
            this.f22792h = null;
            this.f22795l = 0;
            return;
        }
        java.util.Arrays.fill(n(), 0, this.f22795l, (java.lang.Object) null);
        java.lang.Object obj = this.f22792h;
        java.util.Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            java.util.Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            java.util.Arrays.fill((short[]) obj, (short) 0);
        } else {
            java.util.Arrays.fill((int[]) obj, 0);
        }
        java.util.Arrays.fill(o(), 0, this.f22795l, 0);
        this.f22795l = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object obj) {
        if (f()) {
            return false;
        }
        java.util.Set setE = e();
        if (setE != null) {
            return setE.contains(obj);
        }
        int iW = p076i4.AbstractC2230y.w(obj);
        int i3 = (1 << (this.f22794k & 31)) - 1;
        java.lang.Object obj2 = this.f22792h;
        java.util.Objects.requireNonNull(obj2);
        int iX = p076i4.AbstractC2230y.x(iW & i3, obj2);
        if (iX == 0) {
            return false;
        }
        int i9 = ~i3;
        int i10 = iW & i9;
        do {
            int i11 = iX - 1;
            int i12 = o()[i11];
            if ((i12 & i9) == i10 && com.google.android.gms.internal.play_billing.AbstractC1853k0.m(obj, n()[i11])) {
                return true;
            }
            iX = i12 & i3;
        } while (iX != 0);
        return false;
    }

    public final java.util.Set e() {
        java.lang.Object obj = this.f22792h;
        if (obj instanceof java.util.Set) {
            return (java.util.Set) obj;
        }
        return null;
    }

    public final boolean f() {
        return this.f22792h == null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
        java.util.Set setE = e();
        return setE != null ? setE.iterator() : new p076i4.E(this);
    }

    public final java.lang.Object[] n() {
        java.lang.Object[] objArr = this.j;
        java.util.Objects.requireNonNull(objArr);
        return objArr;
    }

    public final int[] o() {
        int[] iArr = this.f22793i;
        java.util.Objects.requireNonNull(iArr);
        return iArr;
    }

    public final int p(int i3, int i9, int i10, int i11) {
        java.lang.Object objG = p076i4.AbstractC2230y.g(i9);
        int i12 = i9 - 1;
        if (i11 != 0) {
            p076i4.AbstractC2230y.y(i10 & i12, i11 + 1, objG);
        }
        java.lang.Object obj = this.f22792h;
        java.util.Objects.requireNonNull(obj);
        int[] iArrO = o();
        for (int i13 = 0; i13 <= i3; i13++) {
            int iX = p076i4.AbstractC2230y.x(i13, obj);
            while (iX != 0) {
                int i14 = iX - 1;
                int i15 = iArrO[i14];
                int i16 = ((~i3) & i15) | i13;
                int i17 = i16 & i12;
                int iX2 = p076i4.AbstractC2230y.x(i17, objG);
                p076i4.AbstractC2230y.y(i17, iX, objG);
                iArrO[i14] = p076i4.AbstractC2230y.p(i16, iX2, i12);
                iX = i15 & i3;
            }
        }
        this.f22792h = objG;
        this.f22794k = p076i4.AbstractC2230y.p(this.f22794k, 32 - java.lang.Integer.numberOfLeadingZeros(i12), 31);
        return i12;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(java.lang.Object obj) {
        int i3;
        int i9;
        if (!f()) {
            java.util.Set setE = e();
            if (setE != null) {
                return setE.remove(obj);
            }
            int i10 = (1 << (this.f22794k & 31)) - 1;
            java.lang.Object obj2 = this.f22792h;
            java.util.Objects.requireNonNull(obj2);
            int iS = p076i4.AbstractC2230y.s(obj, null, i10, obj2, o(), n(), null);
            if (iS != -1) {
                java.lang.Object obj3 = this.f22792h;
                java.util.Objects.requireNonNull(obj3);
                int[] iArrO = o();
                java.lang.Object[] objArrN = n();
                int size = size();
                int i11 = size - 1;
                if (iS < i11) {
                    java.lang.Object obj4 = objArrN[i11];
                    objArrN[iS] = obj4;
                    objArrN[i11] = null;
                    iArrO[iS] = iArrO[i11];
                    iArrO[i11] = 0;
                    int iW = p076i4.AbstractC2230y.w(obj4) & i10;
                    int iX = p076i4.AbstractC2230y.x(iW, obj3);
                    if (iX == size) {
                        p076i4.AbstractC2230y.y(iW, iS + 1, obj3);
                    } else {
                        while (true) {
                            i3 = iX - 1;
                            i9 = iArrO[i3];
                            int i12 = i9 & i10;
                            if (i12 == size) {
                                break;
                            }
                            iX = i12;
                        }
                        iArrO[i3] = p076i4.AbstractC2230y.p(i9, iS + 1, i10);
                    }
                } else {
                    objArrN[iS] = null;
                    iArrO[iS] = 0;
                }
                this.f22795l--;
                this.f22794k += 32;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        java.util.Set setE = e();
        return setE != null ? setE.size() : this.f22795l;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final java.lang.Object[] toArray() {
        if (f()) {
            return new java.lang.Object[0];
        }
        java.util.Set setE = e();
        return setE != null ? setE.toArray() : java.util.Arrays.copyOf(n(), this.f22795l);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final java.lang.Object[] toArray(java.lang.Object[] objArr) {
        if (f()) {
            if (objArr.length > 0) {
                objArr[0] = null;
            }
            return objArr;
        }
        java.util.Set setE = e();
        if (setE != null) {
            return setE.toArray(objArr);
        }
        java.lang.Object[] objArrN = n();
        int i3 = this.f22795l;
        com.google.android.gms.internal.play_billing.AbstractC1864o0.W(0, i3, objArrN.length);
        if (objArr.length < i3) {
            if (objArr.length != 0) {
                objArr = java.util.Arrays.copyOf(objArr, 0);
            }
            objArr = java.util.Arrays.copyOf(objArr, i3);
        } else if (objArr.length > i3) {
            objArr[i3] = null;
        }
        java.lang.System.arraycopy(objArrN, 0, objArr, 0, i3);
        return objArr;
    }
}
