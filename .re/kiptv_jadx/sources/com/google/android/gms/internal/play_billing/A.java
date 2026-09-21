package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
public final class A implements java.util.Map, java.io.Serializable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final com.google.android.gms.internal.play_billing.A f19182n = new com.google.android.gms.internal.play_billing.A(0, null, new java.lang.Object[0]);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public transient com.google.android.gms.internal.play_billing.C1880x f19183h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public transient com.google.android.gms.internal.play_billing.C1882y f19184i;
    public transient com.google.android.gms.internal.play_billing.C1884z j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final transient java.lang.Object f19185k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final transient java.lang.Object[] f19186l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final transient int f19187m;

    public A(int i3, java.lang.Object obj, java.lang.Object[] objArr) {
        this.f19185k = obj;
        this.f19186l = objArr;
        this.f19187m = i3;
    }

    /* JADX WARN: Code duplicated, block: B:81:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:83:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:84:0x01da  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v10 */
    /* JADX WARN: Type inference failed for: r17v11 */
    /* JADX WARN: Type inference failed for: r17v12 */
    /* JADX WARN: Type inference failed for: r17v13 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v8 */
    public static com.google.android.gms.internal.play_billing.A a(int i3, java.lang.Object[] objArr, B8.h hVar) {
        int iHighestOneBit;
        int i9;
        boolean z6;
        char c9;
        ?? r9;
        char c10;
        short[] sArr;
        int i10;
        boolean z9;
        ?? r17;
        boolean z10;
        ?? r10;
        java.lang.Object[] objArr2;
        com.google.android.gms.internal.play_billing.C1870s c1870s;
        boolean z11;
        int i11 = i3;
        java.lang.Object[] objArrCopyOf = objArr;
        if (i11 == 0) {
            return f19182n;
        }
        int i12 = 1;
        com.google.android.gms.internal.play_billing.C1870s c1870s2 = null;
        ?? r11 = 0;
        com.google.android.gms.internal.play_billing.C1870s c1870s3 = null;
        com.google.android.gms.internal.play_billing.C1870s c1870s4 = null;
        boolean z12 = false;
        if (i11 == 1) {
            java.util.Objects.requireNonNull(objArrCopyOf[0]);
            java.util.Objects.requireNonNull(objArrCopyOf[1]);
            return new com.google.android.gms.internal.play_billing.A(1, null, objArrCopyOf);
        }
        E8.d.d0(i11, objArrCopyOf.length >> 1);
        char c11 = 2;
        int iMax = java.lang.Math.max(i11, 2);
        if (iMax < 751619276) {
            iHighestOneBit = java.lang.Integer.highestOneBit(iMax - 1);
            do {
                iHighestOneBit += iHighestOneBit;
            } while (((double) iHighestOneBit) * 0.7d < iMax);
        } else {
            iHighestOneBit = 1073741824;
            if (iMax >= 1073741824) {
                throw new java.lang.IllegalArgumentException("collection too large");
            }
        }
        if (i11 != 1) {
            int i13 = iHighestOneBit - 1;
            if (iHighestOneBit <= 128) {
                byte[] bArr = new byte[iHighestOneBit];
                java.util.Arrays.fill(bArr, (byte) -1);
                int i14 = 0;
                int i15 = 0;
                while (i14 < i11) {
                    int i16 = i15 + i15;
                    int i17 = i14 + i14;
                    java.lang.Object obj = objArrCopyOf[i17];
                    java.util.Objects.requireNonNull(obj);
                    java.lang.Object obj2 = objArrCopyOf[i17 ^ i12];
                    java.util.Objects.requireNonNull(obj2);
                    int iH0 = O2.g.h0(obj.hashCode());
                    while (true) {
                        int i18 = iH0 & i13;
                        i10 = i12;
                        z9 = z12;
                        int i19 = bArr[i18] & 255;
                        if (i19 == 255) {
                            bArr[i18] = (byte) i16;
                            if (i15 < i14) {
                                objArrCopyOf[i16] = obj;
                                objArrCopyOf[i16 ^ 1] = obj2;
                            }
                            i15++;
                            break;
                        }
                        if (obj.equals(objArrCopyOf[i19 == true ? 1 : 0])) {
                            int i20 = ~i19;
                            java.lang.Object obj3 = objArrCopyOf[i20 == true ? 1 : 0];
                            java.util.Objects.requireNonNull(obj3);
                            c1870s3 = new com.google.android.gms.internal.play_billing.C1870s(obj, obj2, obj3);
                            objArrCopyOf[i20 == true ? 1 : 0] = obj2;
                            break;
                        }
                        iH0 = i18 + 1;
                        i12 = i10;
                        z12 = z9;
                    }
                    i14++;
                    i12 = i10;
                    z12 = z9;
                }
                i9 = i12;
                z6 = z12;
                if (i15 == i11) {
                    c9 = 2;
                    r9 = bArr;
                    r17 = z6;
                } else {
                    sArr = new java.lang.Object[3];
                    sArr[z6 ? 1 : 0] = bArr;
                    sArr[i9] = java.lang.Integer.valueOf(i15);
                    sArr[2] = c1870s3;
                    r11 = sArr;
                    z11 = z6;
                }
            } else {
                i9 = 1;
                z6 = false;
                if (iHighestOneBit <= 32768) {
                    sArr = new short[iHighestOneBit];
                    java.util.Arrays.fill(sArr, (short) -1);
                    int i21 = 0;
                    for (int i22 = 0; i22 < i11; i22++) {
                        int i23 = i21 + i21;
                        int i24 = i22 + i22;
                        java.lang.Object obj4 = objArrCopyOf[i24];
                        java.util.Objects.requireNonNull(obj4);
                        java.lang.Object obj5 = objArrCopyOf[i24 ^ 1];
                        java.util.Objects.requireNonNull(obj5);
                        int iH1 = O2.g.h0(obj4.hashCode());
                        while (true) {
                            int i25 = iH1 & i13;
                            char c12 = (char) sArr[i25];
                            if (c12 == 65535) {
                                sArr[i25] = (short) i23;
                                if (i21 < i22) {
                                    objArrCopyOf[i23] = obj4;
                                    objArrCopyOf[i23 ^ 1] = obj5;
                                }
                                i21++;
                                break;
                            }
                            if (obj4.equals(objArrCopyOf[c12])) {
                                int i26 = c12 ^ 1;
                                java.lang.Object obj6 = objArrCopyOf[i26 == true ? 1 : 0];
                                java.util.Objects.requireNonNull(obj6);
                                com.google.android.gms.internal.play_billing.C1870s c1870s5 = new com.google.android.gms.internal.play_billing.C1870s(obj4, obj5, obj6);
                                objArrCopyOf[i26 == true ? 1 : 0] = obj5;
                                c1870s4 = c1870s5;
                                break;
                            }
                            iH1 = i25 + 1;
                        }
                    }
                    if (i21 == i11) {
                        r11 = sArr;
                        z11 = z6;
                    } else {
                        r11 = new java.lang.Object[]{sArr, java.lang.Integer.valueOf(i21), c1870s4};
                        z11 = z6;
                    }
                } else {
                    int[] iArr = new int[iHighestOneBit];
                    java.util.Arrays.fill(iArr, -1);
                    int i27 = 0;
                    int i28 = 0;
                    while (i27 < i11) {
                        int i29 = i28 + i28;
                        int i30 = i27 + i27;
                        java.lang.Object obj7 = objArrCopyOf[i30];
                        java.util.Objects.requireNonNull(obj7);
                        java.lang.Object obj8 = objArrCopyOf[i30 ^ 1];
                        java.util.Objects.requireNonNull(obj8);
                        int iH2 = O2.g.h0(obj7.hashCode());
                        while (true) {
                            int i31 = iH2 & i13;
                            int i32 = iArr[i31];
                            if (i32 == -1) {
                                iArr[i31] = i29;
                                if (i28 < i27) {
                                    objArrCopyOf[i29] = obj7;
                                    objArrCopyOf[i29 ^ 1] = obj8;
                                }
                                i28++;
                                c10 = c11;
                                break;
                            }
                            c10 = c11;
                            if (obj7.equals(objArrCopyOf[i32])) {
                                int i33 = i32 ^ 1;
                                java.lang.Object obj9 = objArrCopyOf[i33];
                                java.util.Objects.requireNonNull(obj9);
                                com.google.android.gms.internal.play_billing.C1870s c1870s6 = new com.google.android.gms.internal.play_billing.C1870s(obj7, obj8, obj9);
                                objArrCopyOf[i33] = obj8;
                                c1870s2 = c1870s6;
                                break;
                            }
                            iH2 = i31 + 1;
                            c11 = c10;
                        }
                        i27++;
                        c11 = c10;
                    }
                    c9 = c11;
                    if (i28 == i11) {
                        r9 = iArr;
                        r17 = z6;
                    } else {
                        java.lang.Object[] objArr3 = new java.lang.Object[3];
                        objArr3[0] = iArr;
                        objArr3[1] = java.lang.Integer.valueOf(i28);
                        objArr3[c9] = c1870s2;
                        r9 = objArr3;
                        r17 = z6;
                    }
                }
            }
            z10 = r9 instanceof java.lang.Object[];
            r10 = r9;
            if (z10) {
                objArr2 = (java.lang.Object[]) r9;
                c1870s = (com.google.android.gms.internal.play_billing.C1870s) objArr2[c9];
                if (hVar != null) {
                    throw c1870s.a();
                }
                hVar.f862k = c1870s;
                java.lang.Object obj10 = objArr2[r17];
                int iIntValue = ((java.lang.Integer) objArr2[i9]).intValue();
                objArrCopyOf = java.util.Arrays.copyOf(objArrCopyOf, iIntValue + iIntValue);
                r10 = obj10;
                i11 = iIntValue;
            }
            return new com.google.android.gms.internal.play_billing.A(i11, r10, objArrCopyOf);
        }
        java.util.Objects.requireNonNull(objArrCopyOf[0]);
        java.util.Objects.requireNonNull(objArrCopyOf[1]);
        i11 = 1;
        i9 = 1;
        z11 = false;
        c9 = 2;
        r9 = r11;
        r17 = z11;
        z10 = r9 instanceof java.lang.Object[];
        r10 = r9;
        if (z10) {
            objArr2 = (java.lang.Object[]) r9;
            c1870s = (com.google.android.gms.internal.play_billing.C1870s) objArr2[c9];
            if (hVar != null) {
                throw c1870s.a();
            }
            hVar.f862k = c1870s;
            java.lang.Object obj11 = objArr2[r17];
            int iIntValue2 = ((java.lang.Integer) objArr2[i9]).intValue();
            objArrCopyOf = java.util.Arrays.copyOf(objArrCopyOf, iIntValue2 + iIntValue2);
            r10 = obj11;
            i11 = iIntValue2;
        }
        return new com.google.android.gms.internal.play_billing.A(i11, r10, objArrCopyOf);
    }

    @Override // java.util.Map
    public final void clear() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(java.lang.Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(java.lang.Object obj) {
        com.google.android.gms.internal.play_billing.C1884z c1884z = this.j;
        if (c1884z == null) {
            c1884z = new com.google.android.gms.internal.play_billing.C1884z(this.f19186l, 1, this.f19187m);
            this.j = c1884z;
        }
        return c1884z.contains(obj);
    }

    @Override // java.util.Map
    public final java.util.Set entrySet() {
        com.google.android.gms.internal.play_billing.C1880x c1880x = this.f19183h;
        if (c1880x != null) {
            return c1880x;
        }
        com.google.android.gms.internal.play_billing.C1880x c1880x2 = new com.google.android.gms.internal.play_billing.C1880x(this, this.f19186l, this.f19187m);
        this.f19183h = c1880x2;
        return c1880x2;
    }

    @Override // java.util.Map
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof java.util.Map) {
            return entrySet().equals(((java.util.Map) obj).entrySet());
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0003  */
    @Override // java.util.Map
    public final java.lang.Object get(java.lang.Object obj) {
        java.lang.Object obj2;
        if (obj == null) {
            obj2 = null;
        } else {
            int i3 = this.f19187m;
            java.lang.Object[] objArr = this.f19186l;
            if (i3 == 1) {
                java.lang.Object obj3 = objArr[0];
                java.util.Objects.requireNonNull(obj3);
                if (obj3.equals(obj)) {
                    obj2 = objArr[1];
                    java.util.Objects.requireNonNull(obj2);
                } else {
                    obj2 = null;
                }
            } else {
                java.lang.Object obj4 = this.f19185k;
                if (obj4 == null) {
                    obj2 = null;
                } else if (obj4 instanceof byte[]) {
                    byte[] bArr = (byte[]) obj4;
                    int length = bArr.length - 1;
                    int iH0 = O2.g.h0(obj.hashCode());
                    while (true) {
                        int i9 = iH0 & length;
                        int i10 = bArr[i9] & 255;
                        if (i10 == 255) {
                            break;
                        }
                        if (obj.equals(objArr[i10])) {
                            obj2 = objArr[i10 ^ 1];
                        } else {
                            iH0 = i9 + 1;
                        }
                    }
                    obj2 = null;
                } else if (obj4 instanceof short[]) {
                    short[] sArr = (short[]) obj4;
                    int length2 = sArr.length - 1;
                    int iH1 = O2.g.h0(obj.hashCode());
                    while (true) {
                        int i11 = iH1 & length2;
                        char c9 = (char) sArr[i11];
                        if (c9 == 65535) {
                            break;
                        }
                        if (obj.equals(objArr[c9])) {
                            obj2 = objArr[c9 ^ 1];
                        } else {
                            iH1 = i11 + 1;
                        }
                    }
                    obj2 = null;
                } else {
                    int[] iArr = (int[]) obj4;
                    int length3 = iArr.length - 1;
                    int iH2 = O2.g.h0(obj.hashCode());
                    while (true) {
                        int i12 = iH2 & length3;
                        int i13 = iArr[i12];
                        if (i13 == -1) {
                            break;
                        }
                        if (obj.equals(objArr[i13])) {
                            obj2 = objArr[i13 ^ 1];
                        } else {
                            iH2 = i12 + 1;
                        }
                    }
                    obj2 = null;
                }
            }
        }
        if (obj2 == null) {
            return null;
        }
        return obj2;
    }

    @Override // java.util.Map
    public final java.lang.Object getOrDefault(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        com.google.android.gms.internal.play_billing.C1880x c1880x = this.f19183h;
        if (c1880x == null) {
            c1880x = new com.google.android.gms.internal.play_billing.C1880x(this, this.f19186l, this.f19187m);
            this.f19183h = c1880x;
        }
        java.util.Iterator it = c1880x.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final java.util.Set keySet() {
        com.google.android.gms.internal.play_billing.C1882y c1882y = this.f19184i;
        if (c1882y != null) {
            return c1882y;
        }
        com.google.android.gms.internal.play_billing.C1882y c1882y2 = new com.google.android.gms.internal.play_billing.C1882y(this, new com.google.android.gms.internal.play_billing.C1884z(this.f19186l, 0, this.f19187m));
        this.f19184i = c1882y2;
        return c1882y2;
    }

    @Override // java.util.Map
    public final java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map map) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final java.lang.Object remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final int size() {
        return this.f19187m;
    }

    public final java.lang.String toString() {
        int i3 = this.f19187m;
        if (i3 < 0) {
            throw new java.lang.IllegalArgumentException(com.google.android.gms.internal.play_billing.M0.l(i3, "size cannot be negative but was: "));
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder((int) java.lang.Math.min(((long) i3) * 8, 1073741824L));
        sb.append('{');
        boolean z6 = true;
        for (java.util.Map.Entry entry : (com.google.android.gms.internal.play_billing.C1880x) entrySet()) {
            if (!z6) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z6 = false;
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Map
    public final java.util.Collection values() {
        com.google.android.gms.internal.play_billing.C1884z c1884z = this.j;
        if (c1884z != null) {
            return c1884z;
        }
        com.google.android.gms.internal.play_billing.C1884z c1884z2 = new com.google.android.gms.internal.play_billing.C1884z(this.f19186l, 1, this.f19187m);
        this.j = c1884z2;
        return c1884z2;
    }
}
