package p136q;

/* JADX INFO: loaded from: classes.dex */
public final class r implements java.lang.Cloneable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ boolean f26415h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ long[] f26416i;
    public /* synthetic */ java.lang.Object[] j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ int f26417k;

    public r(int i3) {
        if (i3 == 0) {
            this.f26416i = p144r.a.f26670b;
            this.j = p144r.a.f26671c;
            return;
        }
        int i9 = i3 * 8;
        for (int i10 = 4; i10 < 32; i10++) {
            int i11 = (1 << i10) - 12;
            if (i9 <= i11) {
                i9 = i11;
                break;
            }
        }
        int i12 = i9 / 8;
        this.f26416i = new long[i12];
        this.j = new java.lang.Object[i12];
    }

    public final void a() {
        int i3 = this.f26417k;
        java.lang.Object[] objArr = this.j;
        for (int i9 = 0; i9 < i3; i9++) {
            objArr[i9] = null;
        }
        this.f26417k = 0;
        this.f26415h = false;
    }

    public final java.lang.Object b(long j) {
        java.lang.Object obj;
        int iB = p144r.a.b(this.f26416i, this.f26417k, j);
        if (iB < 0 || (obj = this.j[iB]) == p136q.AbstractC2674s.f26418a) {
            return null;
        }
        return obj;
    }

    public final long c(int i3) {
        if (!(i3 >= 0 && i3 < this.f26417k)) {
            p144r.a.c("Expected index to be within 0..size()-1, but was " + i3);
            throw null;
        }
        if (this.f26415h) {
            int i9 = this.f26417k;
            long[] jArr = this.f26416i;
            java.lang.Object[] objArr = this.j;
            int i10 = 0;
            for (int i11 = 0; i11 < i9; i11++) {
                java.lang.Object obj = objArr[i11];
                if (obj != p136q.AbstractC2674s.f26418a) {
                    if (i11 != i10) {
                        jArr[i10] = jArr[i11];
                        objArr[i10] = obj;
                        objArr[i11] = null;
                    }
                    i10++;
                }
            }
            this.f26415h = false;
            this.f26417k = i10;
        }
        return this.f26416i[i3];
    }

    public final java.lang.Object clone() throws java.lang.CloneNotSupportedException {
        java.lang.Object objClone = super.clone();
        kotlin.jvm.internal.m.c(objClone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        p136q.r rVar = (p136q.r) objClone;
        rVar.f26416i = (long[]) this.f26416i.clone();
        rVar.j = (java.lang.Object[]) this.j.clone();
        return rVar;
    }

    public final void d(long j, java.lang.Object obj) {
        int iB = p144r.a.b(this.f26416i, this.f26417k, j);
        if (iB >= 0) {
            this.j[iB] = obj;
            return;
        }
        int i3 = ~iB;
        int i9 = this.f26417k;
        java.lang.Object obj2 = p136q.AbstractC2674s.f26418a;
        if (i3 < i9) {
            java.lang.Object[] objArr = this.j;
            if (objArr[i3] == obj2) {
                this.f26416i[i3] = j;
                objArr[i3] = obj;
                return;
            }
        }
        if (this.f26415h) {
            long[] jArr = this.f26416i;
            if (i9 >= jArr.length) {
                java.lang.Object[] objArr2 = this.j;
                int i10 = 0;
                for (int i11 = 0; i11 < i9; i11++) {
                    java.lang.Object obj3 = objArr2[i11];
                    if (obj3 != obj2) {
                        if (i11 != i10) {
                            jArr[i10] = jArr[i11];
                            objArr2[i10] = obj3;
                            objArr2[i11] = null;
                        }
                        i10++;
                    }
                }
                this.f26415h = false;
                this.f26417k = i10;
                i3 = ~p144r.a.b(this.f26416i, i10, j);
            }
        }
        int i12 = this.f26417k;
        if (i12 >= this.f26416i.length) {
            int i13 = (i12 + 1) * 8;
            for (int i14 = 4; i14 < 32; i14++) {
                int i15 = (1 << i14) - 12;
                if (i13 <= i15) {
                    i13 = i15;
                    break;
                }
            }
            int i16 = i13 / 8;
            long[] jArrCopyOf = java.util.Arrays.copyOf(this.f26416i, i16);
            kotlin.jvm.internal.m.d(jArrCopyOf, "copyOf(...)");
            this.f26416i = jArrCopyOf;
            java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(this.j, i16);
            kotlin.jvm.internal.m.d(objArrCopyOf, "copyOf(...)");
            this.j = objArrCopyOf;
        }
        int i17 = this.f26417k;
        if (i17 - i3 != 0) {
            long[] jArr2 = this.f26416i;
            int i18 = i3 + 1;
            p078i6.m.c0(jArr2, jArr2, i18, i3, i17);
            java.lang.Object[] objArr3 = this.j;
            p078i6.m.Z(i18, i3, this.f26417k, objArr3, objArr3);
        }
        this.f26416i[i3] = j;
        this.j[i3] = obj;
        this.f26417k++;
    }

    public final void e(long j) {
        int iB = p144r.a.b(this.f26416i, this.f26417k, j);
        if (iB >= 0) {
            java.lang.Object[] objArr = this.j;
            java.lang.Object obj = objArr[iB];
            java.lang.Object obj2 = p136q.AbstractC2674s.f26418a;
            if (obj != obj2) {
                objArr[iB] = obj2;
                this.f26415h = true;
            }
        }
    }

    public final int f() {
        if (this.f26415h) {
            int i3 = this.f26417k;
            long[] jArr = this.f26416i;
            java.lang.Object[] objArr = this.j;
            int i9 = 0;
            for (int i10 = 0; i10 < i3; i10++) {
                java.lang.Object obj = objArr[i10];
                if (obj != p136q.AbstractC2674s.f26418a) {
                    if (i10 != i9) {
                        jArr[i9] = jArr[i10];
                        objArr[i9] = obj;
                        objArr[i10] = null;
                    }
                    i9++;
                }
            }
            this.f26415h = false;
            this.f26417k = i9;
        }
        return this.f26417k;
    }

    public final java.lang.Object g(int i3) {
        if (!(i3 >= 0 && i3 < this.f26417k)) {
            p144r.a.c("Expected index to be within 0..size()-1, but was " + i3);
            throw null;
        }
        if (this.f26415h) {
            int i9 = this.f26417k;
            long[] jArr = this.f26416i;
            java.lang.Object[] objArr = this.j;
            int i10 = 0;
            for (int i11 = 0; i11 < i9; i11++) {
                java.lang.Object obj = objArr[i11];
                if (obj != p136q.AbstractC2674s.f26418a) {
                    if (i11 != i10) {
                        jArr[i10] = jArr[i11];
                        objArr[i10] = obj;
                        objArr[i11] = null;
                    }
                    i10++;
                }
            }
            this.f26415h = false;
            this.f26417k = i10;
        }
        return this.j[i3];
    }

    public final java.lang.String toString() {
        if (f() <= 0) {
            return "{}";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(this.f26417k * 28);
        sb.append('{');
        int i3 = this.f26417k;
        for (int i9 = 0; i9 < i3; i9++) {
            if (i9 > 0) {
                sb.append(", ");
            }
            sb.append(c(i9));
            sb.append('=');
            java.lang.Object objG = g(i9);
            if (objG != sb) {
                sb.append(objG);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        java.lang.String string = sb.toString();
        kotlin.jvm.internal.m.d(string, "toString(...)");
        return string;
    }

    public /* synthetic */ r(java.lang.Object obj) {
        this(10);
    }
}
