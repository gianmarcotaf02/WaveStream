package p078i6;

/* JADX INFO: loaded from: classes4.dex */
public abstract class m extends com.google.common.util.concurrent.D {
    public static void A0(java.lang.Object[] objArr, java.util.Comparator comparator) {
        kotlin.jvm.internal.m.e(objArr, "<this>");
        kotlin.jvm.internal.m.e(comparator, "comparator");
        if (objArr.length > 1) {
            java.util.Arrays.sort(objArr, comparator);
        }
    }

    public static void B0(java.lang.Object[] objArr, java.util.Comparator comparator, int i3, int i9) {
        kotlin.jvm.internal.m.e(objArr, "<this>");
        kotlin.jvm.internal.m.e(comparator, "comparator");
        java.util.Arrays.sort(objArr, i3, i9, comparator);
    }

    public static java.util.List C0(java.lang.Object[] objArr, java.util.Comparator comparator) {
        if (objArr.length != 0) {
            objArr = java.util.Arrays.copyOf(objArr, objArr.length);
            kotlin.jvm.internal.m.d(objArr, "copyOf(...)");
            A0(objArr, comparator);
        }
        return S(objArr);
    }

    public static final void D0(java.lang.Object[] objArr, java.util.LinkedHashSet linkedHashSet) {
        kotlin.jvm.internal.m.e(objArr, "<this>");
        for (java.lang.Object obj : objArr) {
            linkedHashSet.add(obj);
        }
    }

    public static java.util.List E0(java.lang.Object[] objArr) {
        kotlin.jvm.internal.m.e(objArr, "<this>");
        int length = objArr.length;
        if (length != 0) {
            return length != 1 ? new java.util.ArrayList(new p078i6.k(objArr, false)) : com.google.common.util.concurrent.P.i0(objArr[0]);
        }
        return p078i6.w.f23205h;
    }

    public static java.util.Set F0(java.lang.Object[] objArr) {
        kotlin.jvm.internal.m.e(objArr, "<this>");
        int length = objArr.length;
        if (length == 0) {
            return p078i6.y.f23207h;
        }
        if (length == 1) {
            return com.google.crypto.tink.shaded.protobuf.AbstractC1909d.h0(objArr[0]);
        }
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet(p078i6.D.I0(objArr.length));
        D0(objArr, linkedHashSet);
        return linkedHashSet;
    }

    public static java.util.ArrayList G0(java.lang.Object[] objArr, java.lang.Object[] other) {
        kotlin.jvm.internal.m.e(objArr, "<this>");
        kotlin.jvm.internal.m.e(other, "other");
        int iMin = java.lang.Math.min(objArr.length, other.length);
        java.util.ArrayList arrayList = new java.util.ArrayList(iMin);
        for (int i3 = 0; i3 < iMin; i3++) {
            arrayList.add(new p070h6.k(objArr[i3], other[i3]));
        }
        return arrayList;
    }

    public static java.lang.Iterable R(java.lang.Object[] objArr) {
        kotlin.jvm.internal.m.e(objArr, "<this>");
        return objArr.length == 0 ? p078i6.w.f23205h : new N7.r(1, objArr);
    }

    public static java.util.List S(java.lang.Object[] objArr) {
        kotlin.jvm.internal.m.e(objArr, "<this>");
        java.util.List listAsList = java.util.Arrays.asList(objArr);
        kotlin.jvm.internal.m.d(listAsList, "asList(...)");
        return listAsList;
    }

    public static N7.m T(java.lang.Object[] objArr) {
        return objArr.length == 0 ? N7.g.f7442a : new N7.p(3, objArr);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0015 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x0017 A[RETURN] */
    public static boolean U(char[] cArr, char c9) {
        kotlin.jvm.internal.m.e(cArr, "<this>");
        int length = cArr.length;
        int i3 = 0;
        while (i3 < length) {
            if (c9 == cArr[i3]) {
                if (i3 >= 0) {
                    return true;
                }
                return false;
            }
            i3++;
        }
        i3 = -1;
        if (i3 >= 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0015 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x0017 A[RETURN] */
    public static boolean V(int[] iArr, int i3) {
        kotlin.jvm.internal.m.e(iArr, "<this>");
        int length = iArr.length;
        int i9 = 0;
        while (i9 < length) {
            if (i3 == iArr[i9]) {
                if (i9 >= 0) {
                    return true;
                }
                return false;
            }
            i9++;
        }
        i9 = -1;
        if (i9 >= 0) {
            return true;
        }
        return false;
    }

    public static boolean W(java.lang.Object[] objArr, java.lang.Object obj) {
        kotlin.jvm.internal.m.e(objArr, "<this>");
        return s0(objArr, obj) >= 0;
    }

    public static boolean X(java.lang.Object[] objArr, java.lang.Object[] objArr2) {
        if (objArr == objArr2) {
            return true;
        }
        if (objArr == null || objArr2 == null || objArr.length != objArr2.length) {
            return false;
        }
        int length = objArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            java.lang.Object obj = objArr[i3];
            java.lang.Object obj2 = objArr2[i3];
            if (obj != obj2) {
                if (obj == null || obj2 == null) {
                    return false;
                }
                if ((obj instanceof java.lang.Object[]) && (obj2 instanceof java.lang.Object[])) {
                    if (!X((java.lang.Object[]) obj, (java.lang.Object[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                    if (!java.util.Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof short[]) && (obj2 instanceof short[])) {
                    if (!java.util.Arrays.equals((short[]) obj, (short[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof int[]) && (obj2 instanceof int[])) {
                    if (!java.util.Arrays.equals((int[]) obj, (int[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof long[]) && (obj2 instanceof long[])) {
                    if (!java.util.Arrays.equals((long[]) obj, (long[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof float[]) && (obj2 instanceof float[])) {
                    if (!java.util.Arrays.equals((float[]) obj, (float[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof double[]) && (obj2 instanceof double[])) {
                    if (!java.util.Arrays.equals((double[]) obj, (double[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof char[]) && (obj2 instanceof char[])) {
                    if (!java.util.Arrays.equals((char[]) obj, (char[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof boolean[]) && (obj2 instanceof boolean[])) {
                    if (!java.util.Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof p070h6.s) && (obj2 instanceof p070h6.s)) {
                    p070h6.s sVar = (p070h6.s) obj2;
                    byte[] bArr = ((p070h6.s) obj).f22550h;
                    if (bArr == null) {
                        bArr = null;
                    }
                    byte[] bArr2 = sVar.f22550h;
                    if (!java.util.Arrays.equals(bArr, bArr2 != null ? bArr2 : null)) {
                        return false;
                    }
                } else if ((obj instanceof p070h6.z) && (obj2 instanceof p070h6.z)) {
                    p070h6.z zVar = (p070h6.z) obj2;
                    short[] sArr = ((p070h6.z) obj).f22557h;
                    if (sArr == null) {
                        sArr = null;
                    }
                    short[] sArr2 = zVar.f22557h;
                    if (!java.util.Arrays.equals(sArr, sArr2 != null ? sArr2 : null)) {
                        return false;
                    }
                } else if ((obj instanceof p070h6.u) && (obj2 instanceof p070h6.u)) {
                    p070h6.u uVar = (p070h6.u) obj2;
                    int[] iArr = ((p070h6.u) obj).f22552h;
                    if (iArr == null) {
                        iArr = null;
                    }
                    int[] iArr2 = uVar.f22552h;
                    if (!java.util.Arrays.equals(iArr, iArr2 != null ? iArr2 : null)) {
                        return false;
                    }
                } else if ((obj instanceof p070h6.w) && (obj2 instanceof p070h6.w)) {
                    p070h6.w wVar = (p070h6.w) obj2;
                    long[] jArr = ((p070h6.w) obj).f22554h;
                    if (jArr == null) {
                        jArr = null;
                    }
                    long[] jArr2 = wVar.f22554h;
                    if (!java.util.Arrays.equals(jArr, jArr2 != null ? jArr2 : null)) {
                        return false;
                    }
                } else if (!obj.equals(obj2)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void Y(int i3, int i9, int i10, int[] iArr, int[] destination) {
        kotlin.jvm.internal.m.e(iArr, "<this>");
        kotlin.jvm.internal.m.e(destination, "destination");
        java.lang.System.arraycopy(iArr, i9, destination, i3, i10 - i9);
    }

    public static void Z(int i3, int i9, int i10, java.lang.Object[] objArr, java.lang.Object[] destination) {
        kotlin.jvm.internal.m.e(objArr, "<this>");
        kotlin.jvm.internal.m.e(destination, "destination");
        java.lang.System.arraycopy(objArr, i9, destination, i3, i10 - i9);
    }

    public static void a0(byte[] bArr, int i3, int i9, byte[] destination, int i10) {
        kotlin.jvm.internal.m.e(bArr, "<this>");
        kotlin.jvm.internal.m.e(destination, "destination");
        java.lang.System.arraycopy(bArr, i9, destination, i3, i10 - i9);
    }

    public static void b0(char[] cArr, char[] cArr2, int i3, int i9, int i10) {
        kotlin.jvm.internal.m.e(cArr, "<this>");
        java.lang.System.arraycopy(cArr, i9, cArr2, i3, i10 - i9);
    }

    public static void c0(long[] jArr, long[] destination, int i3, int i9, int i10) {
        kotlin.jvm.internal.m.e(jArr, "<this>");
        kotlin.jvm.internal.m.e(destination, "destination");
        java.lang.System.arraycopy(jArr, i9, destination, i3, i10 - i9);
    }

    public static /* synthetic */ void d0(int i3, int i9, int i10, int[] iArr, int[] iArr2) {
        if ((i10 & 2) != 0) {
            i3 = 0;
        }
        if ((i10 & 8) != 0) {
            i9 = iArr.length;
        }
        Y(i3, 0, i9, iArr, iArr2);
    }

    public static /* synthetic */ void e0(int i3, int i9, int i10, java.lang.Object[] objArr, java.lang.Object[] objArr2) {
        if ((i10 & 4) != 0) {
            i3 = 0;
        }
        if ((i10 & 8) != 0) {
            i9 = objArr.length;
        }
        Z(0, i3, i9, objArr, objArr2);
    }

    public static byte[] f0(byte[] bArr, int i3, int i9) {
        kotlin.jvm.internal.m.e(bArr, "<this>");
        com.google.common.util.concurrent.D.i(i9, bArr.length);
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(bArr, i3, i9);
        kotlin.jvm.internal.m.d(bArrCopyOfRange, "copyOfRange(...)");
        return bArrCopyOfRange;
    }

    public static java.lang.Object[] g0(java.lang.Object[] objArr, int i3, int i9) {
        kotlin.jvm.internal.m.e(objArr, "<this>");
        com.google.common.util.concurrent.D.i(i9, objArr.length);
        java.lang.Object[] objArrCopyOfRange = java.util.Arrays.copyOfRange(objArr, i3, i9);
        kotlin.jvm.internal.m.d(objArrCopyOfRange, "copyOfRange(...)");
        return objArrCopyOfRange;
    }

    public static void h0(java.lang.Object[] objArr, N6.A a2, int i3, int i9) {
        kotlin.jvm.internal.m.e(objArr, "<this>");
        java.util.Arrays.fill(objArr, i3, i9, a2);
    }

    public static void i0(int[] iArr, int i3) {
        int length = iArr.length;
        kotlin.jvm.internal.m.e(iArr, "<this>");
        java.util.Arrays.fill(iArr, 0, length, i3);
    }

    public static void j0(long[] jArr, long j) {
        int length = jArr.length;
        kotlin.jvm.internal.m.e(jArr, "<this>");
        java.util.Arrays.fill(jArr, 0, length, j);
    }

    public static java.util.List l0(java.lang.Object[] objArr) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static java.lang.Object m0(java.lang.Object[] objArr) {
        kotlin.jvm.internal.m.e(objArr, "<this>");
        if (objArr.length != 0) {
            return objArr[0];
        }
        throw new java.util.NoSuchElementException("Array is empty.");
    }

    public static java.lang.Object n0(java.lang.Object[] objArr) {
        kotlin.jvm.internal.m.e(objArr, "<this>");
        if (objArr.length == 0) {
            return null;
        }
        return objArr[0];
    }

    public static D6.g o0(int[] iArr) {
        return new D6.g(0, iArr.length - 1, 1);
    }

    public static int p0(long[] jArr) {
        kotlin.jvm.internal.m.e(jArr, "<this>");
        return jArr.length - 1;
    }

    public static java.lang.Integer q0(int[] iArr, int i3) {
        kotlin.jvm.internal.m.e(iArr, "<this>");
        if (i3 < 0 || i3 >= iArr.length) {
            return null;
        }
        return java.lang.Integer.valueOf(iArr[i3]);
    }

    public static java.lang.Object r0(java.lang.Object[] objArr, int i3) {
        kotlin.jvm.internal.m.e(objArr, "<this>");
        if (i3 < 0 || i3 >= objArr.length) {
            return null;
        }
        return objArr[i3];
    }

    public static int s0(java.lang.Object[] objArr, java.lang.Object obj) {
        kotlin.jvm.internal.m.e(objArr, "<this>");
        int i3 = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i3 < length) {
                if (objArr[i3] == null) {
                    return i3;
                }
                i3++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i3 < length2) {
            if (obj.equals(objArr[i3])) {
                return i3;
            }
            i3++;
        }
        return -1;
    }

    public static final void t0(java.lang.Object[] objArr, java.lang.StringBuilder sb, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, java.lang.CharSequence charSequence4, p194x6.j jVar) throws java.io.IOException {
        kotlin.jvm.internal.m.e(objArr, "<this>");
        sb.append(charSequence2);
        int i3 = 0;
        for (java.lang.Object obj : objArr) {
            i3++;
            if (i3 > 1) {
                sb.append(charSequence);
            }
            O7.r.m(sb, obj, jVar);
        }
        sb.append(charSequence3);
    }

    public static java.lang.String u0(byte[] bArr, java.lang.String str, p194x6.j jVar, int i3) {
        java.lang.String str2 = (i3 & 2) != 0 ? "" : "[";
        java.lang.String str3 = (i3 & 4) == 0 ? "]" : "";
        if ((i3 & 32) != 0) {
            jVar = null;
        }
        kotlin.jvm.internal.m.e(bArr, "<this>");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append((java.lang.CharSequence) str2);
        int i9 = 0;
        for (byte b9 : bArr) {
            i9++;
            if (i9 > 1) {
                sb.append((java.lang.CharSequence) str);
            }
            if (jVar != null) {
                sb.append((java.lang.CharSequence) jVar.invoke(java.lang.Byte.valueOf(b9)));
            } else {
                sb.append((java.lang.CharSequence) java.lang.String.valueOf((int) b9));
            }
        }
        sb.append((java.lang.CharSequence) str3);
        return sb.toString();
    }

    public static java.lang.String v0(java.lang.Object[] objArr, java.lang.String str, java.lang.String str2, java.lang.String str3, p194x6.j jVar, int i3) throws java.io.IOException {
        if ((i3 & 1) != 0) {
            str = ", ";
        }
        java.lang.String str4 = str;
        java.lang.String str5 = (i3 & 2) != 0 ? "" : str2;
        java.lang.String str6 = (i3 & 4) != 0 ? "" : str3;
        if ((i3 & 32) != 0) {
            jVar = null;
        }
        kotlin.jvm.internal.m.e(objArr, "<this>");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        t0(objArr, sb, str4, str5, str6, "...", jVar);
        return sb.toString();
    }

    public static java.lang.Object w0(java.lang.Object[] objArr) {
        kotlin.jvm.internal.m.e(objArr, "<this>");
        if (objArr.length != 0) {
            return objArr[objArr.length - 1];
        }
        throw new java.util.NoSuchElementException("Array is empty.");
    }

    public static byte[] x0(byte[] bArr, byte[] elements) {
        kotlin.jvm.internal.m.e(bArr, "<this>");
        kotlin.jvm.internal.m.e(elements, "elements");
        int length = bArr.length;
        int length2 = elements.length;
        byte[] bArrCopyOf = java.util.Arrays.copyOf(bArr, length + length2);
        java.lang.System.arraycopy(elements, 0, bArrCopyOf, length, length2);
        kotlin.jvm.internal.m.b(bArrCopyOf);
        return bArrCopyOf;
    }

    public static char y0(char[] cArr) {
        kotlin.jvm.internal.m.e(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            throw new java.util.NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return cArr[0];
        }
        throw new java.lang.IllegalArgumentException("Array has more than one element.");
    }

    public static java.lang.Object z0(java.lang.Object[] objArr) {
        kotlin.jvm.internal.m.e(objArr, "<this>");
        int length = objArr.length;
        if (length == 0) {
            throw new java.util.NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return objArr[0];
        }
        throw new java.lang.IllegalArgumentException("Array has more than one element.");
    }
}
