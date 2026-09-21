package p110m7;

/* JADX INFO: loaded from: classes4.dex */
public final class z extends p110m7.AbstractC2632e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int[] f25511o;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f25512i;
    public final p110m7.AbstractC2632e j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p110m7.AbstractC2632e f25513k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f25514l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f25515m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f25516n = 0;

    static {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i3 = 1;
        int i9 = 1;
        while (i3 > 0) {
            arrayList.add(java.lang.Integer.valueOf(i3));
            int i10 = i9 + i3;
            i9 = i3;
            i3 = i10;
        }
        arrayList.add(java.lang.Integer.valueOf(androidx.media3.common.util.Log.LOG_LEVEL_OFF));
        f25511o = new int[arrayList.size()];
        int i11 = 0;
        while (true) {
            int[] iArr = f25511o;
            if (i11 >= iArr.length) {
                return;
            }
            iArr[i11] = ((java.lang.Integer) arrayList.get(i11)).intValue();
            i11++;
        }
    }

    public z(p110m7.AbstractC2632e abstractC2632e, p110m7.AbstractC2632e abstractC2632e2) {
        this.j = abstractC2632e;
        this.f25513k = abstractC2632e2;
        int size = abstractC2632e.size();
        this.f25514l = size;
        this.f25512i = abstractC2632e2.size() + size;
        this.f25515m = java.lang.Math.max(abstractC2632e.o(), abstractC2632e2.o()) + 1;
    }

    public final boolean equals(java.lang.Object obj) {
        int iU;
        if (obj == this) {
            return true;
        }
        if (obj instanceof p110m7.AbstractC2632e) {
            p110m7.AbstractC2632e abstractC2632e = (p110m7.AbstractC2632e) obj;
            int size = abstractC2632e.size();
            int i3 = this.f25512i;
            if (i3 == size) {
                if (i3 == 0) {
                    return true;
                }
                if (this.f25516n == 0 || (iU = abstractC2632e.u()) == 0 || this.f25516n == iU) {
                    p110m7.x xVar = new p110m7.x(this);
                    p110m7.u uVarA = xVar.next();
                    p110m7.x xVar2 = new p110m7.x(abstractC2632e);
                    p110m7.u uVarA2 = xVar2.next();
                    int i9 = 0;
                    int i10 = 0;
                    int i11 = 0;
                    while (true) {
                        int length = uVarA.f25506i.length - i9;
                        int length2 = uVarA2.f25506i.length - i10;
                        int iMin = java.lang.Math.min(length, length2);
                        if (!(i9 == 0 ? uVarA.y(uVarA2, i10, iMin) : uVarA2.y(uVarA, i9, iMin))) {
                            break;
                        }
                        i11 += iMin;
                        if (i11 >= i3) {
                            if (i11 == i3) {
                                return true;
                            }
                            throw new java.lang.IllegalStateException();
                        }
                        if (iMin == length) {
                            uVarA = xVar.next();
                            i9 = 0;
                        } else {
                            i9 += iMin;
                        }
                        if (iMin == length2) {
                            uVarA2 = xVar2.next();
                            i10 = 0;
                        } else {
                            i10 += iMin;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iS = this.f25516n;
        if (iS == 0) {
            int i3 = this.f25512i;
            iS = s(i3, 0, i3);
            if (iS == 0) {
                iS = 1;
            }
            this.f25516n = iS;
        }
        return iS;
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
        return new p110m7.y(this);
    }

    @Override // p110m7.AbstractC2632e
    public final void n(int i3, int i9, int i10, byte[] bArr) {
        int i11 = i3 + i10;
        p110m7.AbstractC2632e abstractC2632e = this.j;
        int i12 = this.f25514l;
        if (i11 <= i12) {
            abstractC2632e.n(i3, i9, i10, bArr);
            return;
        }
        p110m7.AbstractC2632e abstractC2632e2 = this.f25513k;
        if (i3 >= i12) {
            abstractC2632e2.n(i3 - i12, i9, i10, bArr);
            return;
        }
        int i13 = i12 - i3;
        abstractC2632e.n(i3, i9, i13, bArr);
        abstractC2632e2.n(0, i9 + i13, i10 - i13, bArr);
    }

    @Override // p110m7.AbstractC2632e
    public final int o() {
        return this.f25515m;
    }

    @Override // p110m7.AbstractC2632e
    public final boolean p() {
        return this.f25512i >= f25511o[this.f25515m];
    }

    @Override // p110m7.AbstractC2632e
    public final boolean q() {
        int iT = this.j.t(0, 0, this.f25514l);
        p110m7.AbstractC2632e abstractC2632e = this.f25513k;
        return abstractC2632e.t(iT, 0, abstractC2632e.size()) == 0;
    }

    @Override // p110m7.AbstractC2632e
    public final int s(int i3, int i9, int i10) {
        int i11 = i9 + i10;
        p110m7.AbstractC2632e abstractC2632e = this.j;
        int i12 = this.f25514l;
        if (i11 <= i12) {
            return abstractC2632e.s(i3, i9, i10);
        }
        p110m7.AbstractC2632e abstractC2632e2 = this.f25513k;
        if (i9 >= i12) {
            return abstractC2632e2.s(i3, i9 - i12, i10);
        }
        int i13 = i12 - i9;
        return abstractC2632e2.s(abstractC2632e.s(i3, i9, i13), 0, i10 - i13);
    }

    @Override // p110m7.AbstractC2632e
    public final int size() {
        return this.f25512i;
    }

    @Override // p110m7.AbstractC2632e
    public final int t(int i3, int i9, int i10) {
        int i11 = i9 + i10;
        p110m7.AbstractC2632e abstractC2632e = this.j;
        int i12 = this.f25514l;
        if (i11 <= i12) {
            return abstractC2632e.t(i3, i9, i10);
        }
        p110m7.AbstractC2632e abstractC2632e2 = this.f25513k;
        if (i9 >= i12) {
            return abstractC2632e2.t(i3, i9 - i12, i10);
        }
        int i13 = i12 - i9;
        return abstractC2632e2.t(abstractC2632e.t(i3, i9, i13), 0, i10 - i13);
    }

    @Override // p110m7.AbstractC2632e
    public final int u() {
        return this.f25516n;
    }

    @Override // p110m7.AbstractC2632e
    public final java.lang.String v() {
        byte[] bArr;
        int i3 = this.f25512i;
        if (i3 == 0) {
            bArr = p110m7.q.f25502a;
        } else {
            byte[] bArr2 = new byte[i3];
            n(0, 0, i3, bArr2);
            bArr = bArr2;
        }
        return new java.lang.String(bArr, "UTF-8");
    }

    @Override // p110m7.AbstractC2632e
    public final void x(java.io.OutputStream outputStream, int i3, int i9) {
        int i10 = i3 + i9;
        p110m7.AbstractC2632e abstractC2632e = this.j;
        int i11 = this.f25514l;
        if (i10 <= i11) {
            abstractC2632e.x(outputStream, i3, i9);
            return;
        }
        p110m7.AbstractC2632e abstractC2632e2 = this.f25513k;
        if (i3 >= i11) {
            abstractC2632e2.x(outputStream, i3 - i11, i9);
            return;
        }
        int i12 = i11 - i3;
        abstractC2632e.x(outputStream, i3, i12);
        abstractC2632e2.x(outputStream, 0, i9 - i12);
    }
}
