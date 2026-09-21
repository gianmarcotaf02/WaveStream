package p121o0;

/* JADX INFO: loaded from: classes.dex */
public final class j implements java.lang.Iterable, p201y6.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final p121o0.j f25987l = new p121o0.j(null, 0, 0, 0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f25988h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f25989i;
    public final long j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long[] f25990k;

    public j(long[] jArr, long j, long j9, long j10) {
        this.f25988h = j;
        this.f25989i = j9;
        this.j = j10;
        this.f25990k = jArr;
    }

    public final p121o0.j d(p121o0.j jVar) {
        p121o0.j jVarE;
        long[] jArr;
        p121o0.j jVar2 = f25987l;
        if (jVar == jVar2) {
            return this;
        }
        if (this == jVar2) {
            return jVar2;
        }
        long j = jVar.j;
        long j9 = this.j;
        long[] jArr2 = jVar.f25990k;
        long j10 = jVar.f25989i;
        long j11 = jVar.f25988h;
        if (j == j9 && jArr2 == (jArr = this.f25990k)) {
            return new p121o0.j(jArr, (~j11) & this.f25988h, this.f25989i & (~j10), j9);
        }
        if (jArr2 != null) {
            jVarE = this;
            for (long j12 : jArr2) {
                jVarE = jVarE.e(j12);
            }
        } else {
            jVarE = this;
        }
        long j13 = 0;
        long j14 = jVar.j;
        if (j10 != 0) {
            for (int i3 = 0; i3 < 64; i3++) {
                if ((j10 & (1 << i3)) != 0) {
                    jVarE = jVarE.e(((long) i3) + j14);
                }
            }
        }
        if (j11 != 0) {
            int i9 = 0;
            while (i9 < 64) {
                if (((1 << i9) & j11) != j13) {
                    jVarE = jVarE.e(((long) i9) + j14 + ((long) 64));
                }
                i9++;
                j13 = 0;
            }
        }
        return jVarE;
    }

    public final p121o0.j e(long j) {
        long[] jArr;
        int iC;
        long[] jArr2;
        long j9 = j - this.j;
        long j10 = 0;
        if (kotlin.jvm.internal.m.g(j9, j10) >= 0 && kotlin.jvm.internal.m.g(j9, 64) < 0) {
            long j11 = 1 << ((int) j9);
            long j12 = this.f25989i;
            if ((j12 & j11) != 0) {
                return new p121o0.j(this.f25990k, this.f25988h, j12 & (~j11), this.j);
            }
        } else if (kotlin.jvm.internal.m.g(j9, 64) >= 0 && kotlin.jvm.internal.m.g(j9, 128) < 0) {
            long j13 = 1 << (((int) j9) - 64);
            long j14 = this.f25988h;
            if ((j14 & j13) != 0) {
                return new p121o0.j(this.f25990k, j14 & (~j13), this.f25989i, this.j);
            }
        } else if (kotlin.jvm.internal.m.g(j9, j10) < 0 && (jArr = this.f25990k) != null && (iC = p121o0.o.c(jArr, j)) >= 0) {
            int length = jArr.length;
            int i3 = length - 1;
            if (i3 == 0) {
                jArr2 = null;
            } else {
                jArr2 = new long[i3];
                if (iC > 0) {
                    p078i6.m.c0(jArr, jArr2, 0, 0, iC);
                }
                if (iC < i3) {
                    p078i6.m.c0(jArr, jArr2, iC, iC + 1, length);
                }
            }
            return new p121o0.j(jArr2, this.f25988h, this.f25989i, this.j);
        }
        return this;
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
        return E8.d.T(new p121o0.i(this, null));
    }

    public final boolean n(long j) {
        long[] jArr;
        long j9 = j - this.j;
        long j10 = 0;
        if (kotlin.jvm.internal.m.g(j9, j10) >= 0 && kotlin.jvm.internal.m.g(j9, 64) < 0) {
            return ((1 << ((int) j9)) & this.f25989i) != 0;
        }
        if (kotlin.jvm.internal.m.g(j9, 64) < 0 || kotlin.jvm.internal.m.g(j9, 128) >= 0) {
            return kotlin.jvm.internal.m.g(j9, j10) <= 0 && (jArr = this.f25990k) != null && p121o0.o.c(jArr, j) >= 0;
        }
        return ((1 << (((int) j9) - 64)) & this.f25988h) != 0;
    }

    public final p121o0.j o(p121o0.j jVar) {
        long j;
        p121o0.j jVarP;
        p121o0.j jVarP2 = jVar;
        p121o0.j jVar2 = f25987l;
        if (jVarP2 == jVar2) {
            return this;
        }
        if (this == jVar2) {
            return jVarP2;
        }
        long j9 = jVarP2.j;
        long j10 = this.j;
        long j11 = this.f25989i;
        long j12 = this.f25988h;
        long[] jArr = jVarP2.f25990k;
        long j13 = jVarP2.f25989i;
        long j14 = jVarP2.f25988h;
        if (j9 == j10) {
            long[] jArr2 = this.f25990k;
            j = j11;
            if (jArr == jArr2) {
                return new p121o0.j(jArr2, j12 | j14, j13 | j, j10);
            }
        } else {
            j = j11;
        }
        int i3 = 0;
        long[] jArr3 = this.f25990k;
        if (jArr3 == null) {
            if (jArr3 != null) {
                for (long j15 : jArr3) {
                    jVarP2 = jVarP2.p(j15);
                }
            }
            long j16 = this.j;
            if (j != 0) {
                for (int i9 = 0; i9 < 64; i9++) {
                    if (((1 << i9) & j) != 0) {
                        jVarP2 = jVarP2.p(((long) i9) + j16);
                    }
                }
            }
            if (j12 != 0) {
                while (i3 < 64) {
                    if (((1 << i3) & j12) != 0) {
                        jVarP2 = jVarP2.p(((long) i3) + j16 + ((long) 64));
                    }
                    i3++;
                }
            }
            return jVarP2;
        }
        if (jArr != null) {
            jVarP = this;
            for (long j17 : jArr) {
                jVarP = jVarP.p(j17);
            }
        } else {
            jVarP = this;
        }
        long j18 = jVarP2.j;
        if (j13 != 0) {
            for (int i10 = 0; i10 < 64; i10++) {
                if (((1 << i10) & j13) != 0) {
                    jVarP = jVarP.p(((long) i10) + j18);
                }
            }
        }
        if (j14 != 0) {
            while (i3 < 64) {
                if (((1 << i3) & j14) != 0) {
                    jVarP = jVarP.p(((long) i3) + j18 + ((long) 64));
                }
                i3++;
            }
        }
        return jVarP;
    }

    /* JADX WARN: Code duplicated, block: B:58:0x010d  */
    public final p121o0.j p(long j) {
        int i3;
        long j9;
        long j10;
        long[] jArr;
        long[] jArr2;
        long j11 = this.j;
        long j12 = j - j11;
        long j13 = 0;
        int iG = kotlin.jvm.internal.m.g(j12, j13);
        long j14 = this.f25989i;
        if (iG < 0 || kotlin.jvm.internal.m.g(j12, 64) >= 0) {
            long j15 = 64;
            int iG2 = kotlin.jvm.internal.m.g(j12, j15);
            long j16 = j14;
            long j17 = this.f25988h;
            if (iG2 < 0 || kotlin.jvm.internal.m.g(j12, 128) >= 0) {
                long j18 = 128;
                int iG3 = kotlin.jvm.internal.m.g(j12, j18);
                long[] jArr3 = this.f25990k;
                if (iG3 < 0) {
                    if (jArr3 == null) {
                        return new p121o0.j(new long[]{j}, this.f25988h, this.f25989i, this.j);
                    }
                    int iC = p121o0.o.c(jArr3, j);
                    if (iC < 0) {
                        int i9 = -(iC + 1);
                        int length = jArr3.length;
                        long[] jArr4 = new long[length + 1];
                        p078i6.m.c0(jArr3, jArr4, r15, r15, i9);
                        p078i6.m.c0(jArr3, jArr4, i9 + 1, i9, length);
                        jArr4[i9] = j;
                        return new p121o0.j(jArr4, this.f25988h, this.f25989i, this.j);
                    }
                } else if (!n(j)) {
                    long j19 = 1;
                    long j20 = ((j + j19) / j15) * j15;
                    int i10 = 1;
                    if (kotlin.jvm.internal.m.g(j20, j13) < 0) {
                        j20 = (Long.MAX_VALUE - j18) + j19;
                    }
                    long j21 = j17;
                    long j22 = j11;
                    p020c0.C1704s0 c1704s0 = null;
                    while (true) {
                        if (kotlin.jvm.internal.m.g(j22, j20) >= 0) {
                            i3 = i10;
                            j9 = j22;
                            j10 = j16;
                            break;
                        }
                        if (j16 != 0) {
                            if (c1704s0 == null) {
                                c1704s0 = new p020c0.C1704s0(jArr3);
                            }
                            int i11 = 0;
                            while (i11 < 64) {
                                if ((j16 & (1 << i11)) != 0) {
                                    ((p136q.y) c1704s0.f18362i).a(((long) i11) + j22);
                                }
                                i11 += i10;
                                i10 = i10;
                            }
                        }
                        i3 = i10;
                        if (j21 == 0) {
                            j9 = j20;
                            j10 = 0;
                            break;
                        }
                        j22 += j15;
                        i10 = i3;
                        j16 = j21;
                        j21 = 0;
                    }
                    if (c1704s0 == null) {
                        jArr = jArr3;
                    } else {
                        p136q.y yVar = (p136q.y) c1704s0.f18362i;
                        int i12 = yVar.f26439b;
                        if (i12 == 0) {
                            jArr2 = null;
                        } else {
                            jArr2 = new long[i12];
                            long[] jArr5 = yVar.f26438a;
                            for (int i13 = r15; i13 < i12; i13 += i3) {
                                jArr2[i13] = jArr5[i13];
                            }
                        }
                        if (jArr2 == null) {
                            jArr = jArr3;
                        } else {
                            jArr = jArr2;
                        }
                    }
                    return new p121o0.j(jArr, j21, j10, j9).p(j);
                }
            } else {
                long j23 = 1 << (((int) j12) - 64);
                if ((j17 & j23) == 0) {
                    return new p121o0.j(this.f25990k, j17 | j23, this.f25989i, this.j);
                }
            }
        } else {
            long j24 = 1 << ((int) j12);
            if ((j14 & j24) == 0) {
                return new p121o0.j(this.f25990k, this.f25988h, j14 | j24, this.j);
            }
        }
        return this;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(super.toString());
        sb.append(" [");
        java.util.ArrayList arrayList = new java.util.ArrayList(p078i6.q.I0(this, 10));
        java.util.Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.String.valueOf(((java.lang.Number) it.next()).longValue()));
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append((java.lang.CharSequence) "");
        int size = arrayList.size();
        int i3 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            java.lang.Object obj = arrayList.get(i9);
            i3++;
            if (i3 > 1) {
                sb2.append((java.lang.CharSequence) ", ");
            }
            if (obj != null ? obj instanceof java.lang.CharSequence : true) {
                sb2.append((java.lang.CharSequence) obj);
            } else if (obj instanceof java.lang.Character) {
                sb2.append(((java.lang.Character) obj).charValue());
            } else {
                sb2.append((java.lang.CharSequence) obj.toString());
            }
        }
        sb2.append((java.lang.CharSequence) "");
        sb.append(sb2.toString());
        sb.append(']');
        return sb.toString();
    }
}
