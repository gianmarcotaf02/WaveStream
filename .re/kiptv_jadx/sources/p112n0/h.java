package p112n0;

/* JADX INFO: loaded from: classes.dex */
public final class h implements p112n0.g {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p194x6.j f25541h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p136q.H f25542i;
    public p136q.H j;

    public h(java.util.Map map, p194x6.j jVar) {
        p136q.H h9;
        this.f25541h = jVar;
        if (map == null || map.isEmpty()) {
            h9 = null;
        } else {
            h9 = new p136q.H(map.size());
            for (java.util.Map.Entry entry : map.entrySet()) {
                h9.m(entry.getKey(), entry.getValue());
            }
        }
        this.f25542i = h9;
    }

    @Override // p112n0.g
    public final boolean b(java.lang.Object obj) {
        return ((java.lang.Boolean) this.f25541h.invoke(obj)).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:36:0x008e  */
    @Override // p112n0.g
    public final java.util.Map c() {
        char c9;
        long j;
        long j9;
        long j10;
        long[] jArr;
        int i3;
        long[] jArr2;
        int i9;
        p136q.H h9 = this.f25542i;
        if (h9 == null && this.j == null) {
            return p078i6.x.f23206h;
        }
        int i10 = 0;
        int i11 = h9 != null ? h9.f26326e : 0;
        p136q.H h10 = this.j;
        java.util.HashMap map = new java.util.HashMap(i11 + (h10 != null ? h10.f26326e : 0));
        char c10 = 7;
        long j11 = -9187201950435737472L;
        int i12 = 8;
        if (h9 != null) {
            java.lang.Object[] objArr = h9.f26323b;
            java.lang.Object[] objArr2 = h9.f26324c;
            long[] jArr3 = h9.f26322a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i13 = 0;
                j9 = 128;
                while (true) {
                    long j12 = jArr3[i13];
                    j10 = 255;
                    if ((((~j12) << c10) & j12 & j11) != j11) {
                        int i14 = 8 - ((~(i13 - length)) >>> 31);
                        int i15 = 0;
                        while (i15 < i14) {
                            if ((j12 & 255) < 128) {
                                int i16 = (i13 << 3) + i15;
                                map.put((java.lang.String) objArr[i16], (java.util.List) objArr2[i16]);
                            }
                            j12 >>= 8;
                            i15++;
                            c10 = c10;
                            j11 = j11;
                        }
                        c9 = c10;
                        j = j11;
                        if (i14 != 8) {
                            break;
                        }
                    } else {
                        c9 = c10;
                        j = j11;
                    }
                    if (i13 == length) {
                        break;
                    }
                    i13++;
                    c10 = c9;
                    j11 = j;
                }
            } else {
                c9 = 7;
                j = -9187201950435737472L;
                j9 = 128;
                j10 = 255;
            }
        } else {
            c9 = 7;
            j = -9187201950435737472L;
            j9 = 128;
            j10 = 255;
        }
        p136q.H h11 = this.j;
        if (h11 != null) {
            java.lang.Object[] objArr3 = h11.f26323b;
            java.lang.Object[] objArr4 = h11.f26324c;
            long[] jArr4 = h11.f26322a;
            int length2 = jArr4.length - 2;
            if (length2 >= 0) {
                int i17 = 0;
                while (true) {
                    long j13 = jArr4[i17];
                    if ((((~j13) << c9) & j13 & j) != j) {
                        int i18 = 8 - ((~(i17 - length2)) >>> 31);
                        int i19 = i10;
                        while (i19 < i18) {
                            if ((j13 & j10) < j9) {
                                int i20 = (i17 << 3) + i19;
                                java.lang.Object obj = objArr3[i20];
                                java.util.List list = (java.util.List) objArr4[i20];
                                java.lang.String str = (java.lang.String) obj;
                                i9 = i12;
                                if (list.size() == 1) {
                                    java.lang.Object objInvoke = ((kotlin.jvm.functions.Function0) list.get(i10)).invoke();
                                    if (objInvoke != null) {
                                        if (!b(objInvoke)) {
                                            throw new java.lang.IllegalStateException(p112n0.l.a(objInvoke).toString());
                                        }
                                        map.put(str, p078i6.p.x0(objInvoke));
                                    }
                                    jArr2 = jArr4;
                                } else {
                                    int size = list.size();
                                    java.util.ArrayList arrayList = new java.util.ArrayList(size);
                                    while (i10 < size) {
                                        long[] jArr5 = jArr4;
                                        java.lang.Object objInvoke2 = ((kotlin.jvm.functions.Function0) list.get(i10)).invoke();
                                        if (objInvoke2 != null && !b(objInvoke2)) {
                                            throw new java.lang.IllegalStateException(p112n0.l.a(objInvoke2).toString());
                                        }
                                        arrayList.add(objInvoke2);
                                        i10++;
                                        jArr4 = jArr5;
                                    }
                                    jArr2 = jArr4;
                                    map.put(str, arrayList);
                                }
                            } else {
                                jArr2 = jArr4;
                                i9 = i12;
                            }
                            j13 >>= i9;
                            i19++;
                            i12 = i9;
                            jArr4 = jArr2;
                            i10 = 0;
                        }
                        jArr = jArr4;
                        i3 = i12;
                        if (i18 != i3) {
                            break;
                        }
                    } else {
                        jArr = jArr4;
                        i3 = i12;
                    }
                    if (i17 == length2) {
                        break;
                    }
                    i17++;
                    i12 = i3;
                    jArr4 = jArr;
                    i10 = 0;
                }
            }
        }
        return map;
    }

    @Override // p112n0.g
    public final java.lang.Object d(java.lang.String str) {
        p136q.H h9 = this.f25542i;
        java.util.List list = h9 != null ? (java.util.List) h9.k(str) : null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (list.size() > 1 && h9 != null) {
            java.util.List listSubList = list.subList(1, list.size());
            int iF = h9.f(str);
            if (iF < 0) {
                iF = ~iF;
            }
            java.lang.Object[] objArr = h9.f26324c;
            java.lang.Object obj = objArr[iF];
            h9.f26323b[iF] = str;
            objArr[iF] = listSubList;
        }
        return list.get(0);
    }

    @Override // p112n0.g
    public final p112n0.f e(java.lang.String str, kotlin.jvm.functions.Function0 function0) {
        int length = str.length();
        for (int i3 = 0; i3 < length; i3++) {
            if (!R8.i.w(str.charAt(i3))) {
                p136q.H h9 = this.j;
                if (h9 == null) {
                    long[] jArr = p136q.P.f26351a;
                    h9 = new p136q.H();
                    this.j = h9;
                }
                java.lang.Object objG = h9.g(str);
                if (objG == null) {
                    objG = new java.util.ArrayList();
                    h9.m(str, objG);
                }
                ((java.util.List) objG).add(function0);
                return new j1.l(h9, str, function0, 5);
            }
        }
        throw new java.lang.IllegalArgumentException("Registered key is empty or blank");
    }
}
