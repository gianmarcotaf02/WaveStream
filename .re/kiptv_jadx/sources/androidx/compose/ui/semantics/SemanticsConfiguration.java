package androidx.compose.ui.semantics;

/* JADX INFO: loaded from: classes.dex */
public final class SemanticsConfiguration implements Y0.x, java.lang.Iterable, p201y6.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p136q.H f15960h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public p136q.C2675t f15961i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f15962k;

    public SemanticsConfiguration() {
        long[] jArr = p136q.P.f26351a;
        this.f15960h = new p136q.H();
    }

    @Override // Y0.x
    public final void d(Y0.w wVar, java.lang.Object obj) {
        boolean z6 = obj instanceof Y0.a;
        p136q.H h9 = this.f15960h;
        if (z6 && h9.c(wVar)) {
            java.lang.Object objG = h9.g(wVar);
            kotlin.jvm.internal.m.c(objG, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
            Y0.a aVar = (Y0.a) objG;
            Y0.a aVar2 = (Y0.a) obj;
            java.lang.String str = aVar2.f11024a;
            if (str == null) {
                str = aVar.f11024a;
            }
            p070h6.e eVar = aVar2.f11025b;
            if (eVar == null) {
                eVar = aVar.f11025b;
            }
            h9.m(wVar, new Y0.a(str, eVar));
        } else {
            h9.m(wVar, obj);
        }
        wVar.getClass();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x005d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x005f A[LOOP:0: B:5:0x0028->B:15:0x005f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:18:0x0062 A[EDGE_INSN: B:18:0x0062->B:16:0x0062 BREAK  A[LOOP:0: B:5:0x0028->B:15:0x005f], SYNTHETIC] */
    public final androidx.compose.ui.semantics.SemanticsConfiguration e() {
        androidx.compose.ui.semantics.SemanticsConfiguration semanticsConfiguration = new androidx.compose.ui.semantics.SemanticsConfiguration();
        semanticsConfiguration.j = this.j;
        semanticsConfiguration.f15962k = this.f15962k;
        p136q.H h9 = semanticsConfiguration.f15960h;
        h9.getClass();
        p136q.H from = this.f15960h;
        kotlin.jvm.internal.m.e(from, "from");
        java.lang.Object[] objArr = from.f26323b;
        java.lang.Object[] objArr2 = from.f26324c;
        long[] jArr = from.f26322a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i3 != length) {
                        break;
                        break;
                    }
                    i3++;
                } else {
                    int i9 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i10 = 0; i10 < i9; i10++) {
                        if ((255 & j) < 128) {
                            int i11 = (i3 << 3) + i10;
                            h9.m(objArr[i11], objArr2[i11]);
                        }
                        j >>= 8;
                    }
                    if (i9 != 8) {
                        break;
                    }
                    if (i3 != length) {
                        break;
                    }
                    i3++;
                }
            }
        }
        return semanticsConfiguration;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.compose.ui.semantics.SemanticsConfiguration)) {
            return false;
        }
        androidx.compose.ui.semantics.SemanticsConfiguration semanticsConfiguration = (androidx.compose.ui.semantics.SemanticsConfiguration) obj;
        return kotlin.jvm.internal.m.a(this.f15960h, semanticsConfiguration.f15960h) && this.j == semanticsConfiguration.j && this.f15962k == semanticsConfiguration.f15962k;
    }

    public final int hashCode() {
        return java.lang.Boolean.hashCode(this.f15962k) + p121o0.p.f(this.f15960h.hashCode() * 31, 31, this.j);
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
        p136q.C2675t c2675t = this.f15961i;
        if (c2675t == null) {
            p136q.H h9 = this.f15960h;
            h9.getClass();
            p136q.C2675t c2675t2 = new p136q.C2675t(h9);
            this.f15961i = c2675t2;
            c2675t = c2675t2;
        }
        return ((p136q.C2664h) c2675t.entrySet()).iterator();
    }

    public final java.lang.Object n(Y0.w wVar) {
        java.lang.Object objG = this.f15960h.g(wVar);
        if (objG != null) {
            return objG;
        }
        throw new java.lang.IllegalStateException("Key not present: " + wVar + " - consider getOrElse or getOrNull");
    }

    public final void o(androidx.compose.ui.semantics.SemanticsConfiguration semanticsConfiguration) {
        p136q.H h9 = semanticsConfiguration.f15960h;
        java.lang.Object[] objArr = h9.f26323b;
        java.lang.Object[] objArr2 = h9.f26324c;
        long[] jArr = h9.f26322a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i3 = 0;
        while (true) {
            long j = jArr[i3];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i9 = 8 - ((~(i3 - length)) >>> 31);
                for (int i10 = 0; i10 < i9; i10++) {
                    if ((255 & j) < 128) {
                        int i11 = (i3 << 3) + i10;
                        java.lang.Object obj = objArr[i11];
                        java.lang.Object obj2 = objArr2[i11];
                        Y0.w wVar = (Y0.w) obj;
                        p136q.H h10 = this.f15960h;
                        java.lang.Object objG = h10.g(wVar);
                        kotlin.jvm.internal.m.c(wVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.Any?>");
                        java.lang.Object objInvoke = wVar.f11146b.invoke(objG, obj2);
                        if (objInvoke != null) {
                            h10.m(wVar, objInvoke);
                        }
                    }
                    j >>= 8;
                }
                if (i9 != 8) {
                    return;
                }
            }
            if (i3 == length) {
                return;
            } else {
                i3++;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0078 A[DONT_INVERT, PHI: r2
  0x0078: PHI (r2v6 java.lang.String) = (r2v5 java.lang.String), (r2v7 java.lang.String) binds: [B:13:0x003f, B:20:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x007a A[LOOP:0: B:12:0x0031->B:22:0x007a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x007d A[EDGE_INSN: B:26:0x007d->B:23:0x007d BREAK  A[LOOP:0: B:12:0x0031->B:22:0x007a], SYNTHETIC] */
    public final java.lang.String toString() {
        java.lang.String str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.j) {
            sb.append("mergeDescendants=true");
            str = ", ";
        } else {
            str = "";
        }
        if (this.f15962k) {
            sb.append(str);
            sb.append("isClearingSemantics=true");
            str = ", ";
        }
        p136q.H h9 = this.f15960h;
        java.lang.Object[] objArr = h9.f26323b;
        java.lang.Object[] objArr2 = h9.f26324c;
        long[] jArr = h9.f26322a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i3 != length) {
                        break;
                        break;
                    }
                    i3++;
                } else {
                    int i9 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i10 = 0; i10 < i9; i10++) {
                        if ((255 & j) < 128) {
                            int i11 = (i3 << 3) + i10;
                            java.lang.Object obj = objArr[i11];
                            java.lang.Object obj2 = objArr2[i11];
                            sb.append(str);
                            sb.append(((Y0.w) obj).f11145a);
                            sb.append(" : ");
                            sb.append(obj2);
                            str = ", ";
                        }
                        j >>= 8;
                    }
                    if (i9 != 8) {
                        break;
                    }
                    if (i3 != length) {
                        break;
                    }
                    i3++;
                }
            }
        }
        return R0.L.r(this) + "{ " + ((java.lang.Object) sb) + " }";
    }
}
