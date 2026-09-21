package p136q;

/* JADX INFO: loaded from: classes.dex */
public class S {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int[] f26353h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.lang.Object[] f26354i;
    public int j;

    public S(int i3) {
        this.f26353h = i3 == 0 ? p144r.a.f26669a : new int[i3];
        this.f26354i = i3 == 0 ? p144r.a.f26671c : new java.lang.Object[i3 << 1];
    }

    public final int a(java.lang.Object obj) {
        int i3 = this.j * 2;
        java.lang.Object[] objArr = this.f26354i;
        if (obj == null) {
            for (int i9 = 1; i9 < i3; i9 += 2) {
                if (objArr[i9] == null) {
                    return i9 >> 1;
                }
            }
            return -1;
        }
        for (int i10 = 1; i10 < i3; i10 += 2) {
            if (obj.equals(objArr[i10])) {
                return i10 >> 1;
            }
        }
        return -1;
    }

    public final int b(int i3, java.lang.Object obj) {
        int i9 = this.j;
        if (i9 == 0) {
            return -1;
        }
        int iA = p144r.a.a(i9, i3, this.f26353h);
        if (iA < 0 || kotlin.jvm.internal.m.a(obj, this.f26354i[iA << 1])) {
            return iA;
        }
        int i10 = iA + 1;
        while (i10 < i9 && this.f26353h[i10] == i3) {
            if (kotlin.jvm.internal.m.a(obj, this.f26354i[i10 << 1])) {
                return i10;
            }
            i10++;
        }
        for (int i11 = iA - 1; i11 >= 0 && this.f26353h[i11] == i3; i11--) {
            if (kotlin.jvm.internal.m.a(obj, this.f26354i[i11 << 1])) {
                return i11;
            }
        }
        return ~i10;
    }

    public final int c(java.lang.Object obj) {
        return obj == null ? d() : b(obj.hashCode(), obj);
    }

    public final void clear() {
        if (this.j > 0) {
            this.f26353h = p144r.a.f26669a;
            this.f26354i = p144r.a.f26671c;
            this.j = 0;
        }
        if (this.j > 0) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    public boolean containsKey(java.lang.Object obj) {
        return c(obj) >= 0;
    }

    public boolean containsValue(java.lang.Object obj) {
        return a(obj) >= 0;
    }

    public final int d() {
        int i3 = this.j;
        if (i3 == 0) {
            return -1;
        }
        int iA = p144r.a.a(i3, 0, this.f26353h);
        if (iA < 0 || this.f26354i[iA << 1] == null) {
            return iA;
        }
        int i9 = iA + 1;
        while (i9 < i3 && this.f26353h[i9] == 0) {
            if (this.f26354i[i9 << 1] == null) {
                return i9;
            }
            i9++;
        }
        for (int i10 = iA - 1; i10 >= 0 && this.f26353h[i10] == 0; i10--) {
            if (this.f26354i[i10 << 1] == null) {
                return i10;
            }
        }
        return ~i9;
    }

    public final java.lang.Object e(int i3) {
        boolean z6 = false;
        if (i3 >= 0 && i3 < this.j) {
            z6 = true;
        }
        if (z6) {
            return this.f26354i[i3 << 1];
        }
        p144r.a.c("Expected index to be within 0..size()-1, but was " + i3);
        throw null;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof p136q.S) {
                int i3 = this.j;
                if (i3 != ((p136q.S) obj).j) {
                    return false;
                }
                p136q.S s9 = (p136q.S) obj;
                for (int i9 = 0; i9 < i3; i9++) {
                    java.lang.Object objE = e(i9);
                    java.lang.Object objI = i(i9);
                    java.lang.Object obj2 = s9.get(objE);
                    if (objI == null) {
                        if (obj2 != null || !s9.containsKey(objE)) {
                            return false;
                        }
                    } else if (!objI.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof java.util.Map) || this.j != ((java.util.Map) obj).size()) {
                return false;
            }
            int i10 = this.j;
            for (int i11 = 0; i11 < i10; i11++) {
                java.lang.Object objE2 = e(i11);
                java.lang.Object objI2 = i(i11);
                java.lang.Object obj3 = ((java.util.Map) obj).get(objE2);
                if (objI2 == null) {
                    if (obj3 != null || !((java.util.Map) obj).containsKey(objE2)) {
                        return false;
                    }
                } else if (!objI2.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
        }
        return false;
    }

    public final java.lang.Object g(int i3) {
        if (!(i3 >= 0 && i3 < this.j)) {
            p144r.a.c("Expected index to be within 0..size()-1, but was " + i3);
            throw null;
        }
        java.lang.Object[] objArr = this.f26354i;
        int i9 = i3 << 1;
        java.lang.Object obj = objArr[i9 + 1];
        int i10 = this.j;
        if (i10 <= 1) {
            clear();
            return obj;
        }
        int i11 = i10 - 1;
        int[] iArr = this.f26353h;
        if (iArr.length <= 8 || i10 >= iArr.length / 3) {
            if (i3 < i11) {
                int i12 = i3 + 1;
                p078i6.m.Y(i3, i12, i10, iArr, iArr);
                java.lang.Object[] objArr2 = this.f26354i;
                p078i6.m.Z(i9, i12 << 1, i10 << 1, objArr2, objArr2);
            }
            java.lang.Object[] objArr3 = this.f26354i;
            int i13 = i11 << 1;
            objArr3[i13] = null;
            objArr3[i13 + 1] = null;
        } else {
            int i14 = i10 > 8 ? i10 + (i10 >> 1) : 8;
            int[] iArrCopyOf = java.util.Arrays.copyOf(iArr, i14);
            kotlin.jvm.internal.m.d(iArrCopyOf, "copyOf(...)");
            this.f26353h = iArrCopyOf;
            java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(this.f26354i, i14 << 1);
            kotlin.jvm.internal.m.d(objArrCopyOf, "copyOf(...)");
            this.f26354i = objArrCopyOf;
            if (i10 != this.j) {
                throw new java.util.ConcurrentModificationException();
            }
            if (i3 > 0) {
                p078i6.m.Y(0, 0, i3, iArr, this.f26353h);
                p078i6.m.Z(0, 0, i9, objArr, this.f26354i);
            }
            if (i3 < i11) {
                int i15 = i3 + 1;
                p078i6.m.Y(i3, i15, i10, iArr, this.f26353h);
                p078i6.m.Z(i9, i15 << 1, i10 << 1, objArr, this.f26354i);
            }
        }
        if (i10 != this.j) {
            throw new java.util.ConcurrentModificationException();
        }
        this.j = i11;
        return obj;
    }

    public java.lang.Object get(java.lang.Object obj) {
        int iC = c(obj);
        if (iC >= 0) {
            return this.f26354i[(iC << 1) + 1];
        }
        return null;
    }

    public final java.lang.Object getOrDefault(java.lang.Object obj, java.lang.Object obj2) {
        int iC = c(obj);
        return iC >= 0 ? this.f26354i[(iC << 1) + 1] : obj2;
    }

    public final java.lang.Object h(int i3, java.lang.Object obj) {
        boolean z6 = false;
        if (i3 >= 0 && i3 < this.j) {
            z6 = true;
        }
        if (!z6) {
            p144r.a.c("Expected index to be within 0..size()-1, but was " + i3);
            throw null;
        }
        int i9 = (i3 << 1) + 1;
        java.lang.Object[] objArr = this.f26354i;
        java.lang.Object obj2 = objArr[i9];
        objArr[i9] = obj;
        return obj2;
    }

    public final int hashCode() {
        int[] iArr = this.f26353h;
        java.lang.Object[] objArr = this.f26354i;
        int i3 = this.j;
        int i9 = 1;
        int i10 = 0;
        int iHashCode = 0;
        while (i10 < i3) {
            java.lang.Object obj = objArr[i9];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i10];
            i10++;
            i9 += 2;
        }
        return iHashCode;
    }

    public final java.lang.Object i(int i3) {
        boolean z6 = false;
        if (i3 >= 0 && i3 < this.j) {
            z6 = true;
        }
        if (z6) {
            return this.f26354i[(i3 << 1) + 1];
        }
        p144r.a.c("Expected index to be within 0..size()-1, but was " + i3);
        throw null;
    }

    public final boolean isEmpty() {
        return this.j <= 0;
    }

    public final java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        int i3 = this.j;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int iB = obj != null ? b(iHashCode, obj) : d();
        if (iB >= 0) {
            int i9 = (iB << 1) + 1;
            java.lang.Object[] objArr = this.f26354i;
            java.lang.Object obj3 = objArr[i9];
            objArr[i9] = obj2;
            return obj3;
        }
        int i10 = ~iB;
        int[] iArr = this.f26353h;
        if (i3 >= iArr.length) {
            int i11 = 8;
            if (i3 >= 8) {
                i11 = (i3 >> 1) + i3;
            } else if (i3 < 4) {
                i11 = 4;
            }
            int[] iArrCopyOf = java.util.Arrays.copyOf(iArr, i11);
            kotlin.jvm.internal.m.d(iArrCopyOf, "copyOf(...)");
            this.f26353h = iArrCopyOf;
            java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(this.f26354i, i11 << 1);
            kotlin.jvm.internal.m.d(objArrCopyOf, "copyOf(...)");
            this.f26354i = objArrCopyOf;
            if (i3 != this.j) {
                throw new java.util.ConcurrentModificationException();
            }
        }
        if (i10 < i3) {
            int[] iArr2 = this.f26353h;
            int i12 = i10 + 1;
            p078i6.m.Y(i12, i10, i3, iArr2, iArr2);
            java.lang.Object[] objArr2 = this.f26354i;
            p078i6.m.Z(i12 << 1, i10 << 1, this.j << 1, objArr2, objArr2);
        }
        int i13 = this.j;
        if (i3 == i13) {
            int[] iArr3 = this.f26353h;
            if (i10 < iArr3.length) {
                iArr3[i10] = iHashCode;
                java.lang.Object[] objArr3 = this.f26354i;
                int i14 = i10 << 1;
                objArr3[i14] = obj;
                objArr3[i14 + 1] = obj2;
                this.j = i13 + 1;
                return null;
            }
        }
        throw new java.util.ConcurrentModificationException();
    }

    public final java.lang.Object putIfAbsent(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public java.lang.Object remove(java.lang.Object obj) {
        int iC = c(obj);
        if (iC >= 0) {
            return g(iC);
        }
        return null;
    }

    public final java.lang.Object replace(java.lang.Object obj, java.lang.Object obj2) {
        int iC = c(obj);
        if (iC >= 0) {
            return h(iC, obj2);
        }
        return null;
    }

    public final int size() {
        return this.j;
    }

    public final java.lang.String toString() {
        if (isEmpty()) {
            return "{}";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(this.j * 28);
        sb.append('{');
        int i3 = this.j;
        for (int i9 = 0; i9 < i3; i9++) {
            if (i9 > 0) {
                sb.append(", ");
            }
            java.lang.Object objE = e(i9);
            if (objE != sb) {
                sb.append(objE);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            java.lang.Object objI = i(i9);
            if (objI != sb) {
                sb.append(objI);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        java.lang.String string = sb.toString();
        kotlin.jvm.internal.m.d(string, "toString(...)");
        return string;
    }

    public final boolean remove(java.lang.Object obj, java.lang.Object obj2) {
        int iC = c(obj);
        if (iC < 0 || !kotlin.jvm.internal.m.a(obj2, i(iC))) {
            return false;
        }
        g(iC);
        return true;
    }

    public final boolean replace(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int iC = c(obj);
        if (iC < 0 || !kotlin.jvm.internal.m.a(obj2, i(iC))) {
            return false;
        }
        h(iC, obj3);
        return true;
    }
}
