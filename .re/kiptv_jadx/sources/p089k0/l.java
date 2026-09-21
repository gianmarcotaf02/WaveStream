package p089k0;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f24433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.Object[] f24434c;

    public l(int i3, long[] jArr, java.lang.Object[] objArr) {
        this.f24432a = i3;
        this.f24433b = jArr;
        this.f24434c = objArr;
    }

    public final int a(long j) {
        int i3 = this.f24432a - 1;
        if (i3 != -1) {
            long[] jArr = this.f24433b;
            int i9 = 0;
            if (i3 != 0) {
                while (i9 <= i3) {
                    int i10 = (i9 + i3) >>> 1;
                    long j9 = jArr[i10] - j;
                    if (j9 < 0) {
                        i9 = i10 + 1;
                    } else {
                        if (j9 <= 0) {
                            return i10;
                        }
                        i3 = i10 - 1;
                    }
                }
                return -(i9 + 1);
            }
            long j10 = jArr[0];
            if (j10 == j) {
                return 0;
            }
            if (j10 > j) {
                return -2;
            }
        }
        return -1;
    }

    public final p089k0.l b(long j, java.lang.Object obj) {
        long[] jArr;
        int i3;
        java.lang.Object[] objArr = this.f24434c;
        int i9 = 0;
        int i10 = 0;
        for (java.lang.Object obj2 : objArr) {
            if (obj2 != null) {
                i10++;
            }
        }
        int i11 = i10 + 1;
        long[] jArr2 = new long[i11];
        java.lang.Object[] objArr2 = new java.lang.Object[i11];
        if (i11 > 1) {
            int i12 = 0;
            while (true) {
                jArr = this.f24433b;
                i3 = this.f24432a;
                if (i9 >= i11 || i12 >= i3) {
                    break;
                }
                long j9 = jArr[i12];
                java.lang.Object obj3 = objArr[i12];
                if (j9 > j) {
                    jArr2[i9] = j;
                    objArr2[i9] = obj;
                    i9++;
                    break;
                }
                if (obj3 != null) {
                    jArr2[i9] = j9;
                    objArr2[i9] = obj3;
                    i9++;
                }
                i12++;
            }
            if (i12 == i3) {
                jArr2[i10] = j;
                objArr2[i10] = obj;
            } else {
                while (i9 < i11) {
                    long j10 = jArr[i12];
                    java.lang.Object obj4 = objArr[i12];
                    if (obj4 != null) {
                        jArr2[i9] = j10;
                        objArr2[i9] = obj4;
                        i9++;
                    }
                    i12++;
                }
            }
        } else {
            jArr2[0] = j;
            objArr2[0] = obj;
        }
        return new p089k0.l(i11, jArr2, objArr2);
    }
}
