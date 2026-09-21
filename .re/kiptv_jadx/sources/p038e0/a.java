package p038e0;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p136q.H f21316a;

    public static final java.lang.Object a(p136q.H h9) {
        java.lang.Object objG = h9.g(null);
        if (objG == null) {
            return null;
        }
        if (!(objG instanceof p136q.D)) {
            h9.k(null);
            return objG;
        }
        p136q.D d4 = (p136q.D) objG;
        if (d4.h()) {
            throw new java.util.NoSuchElementException("List is empty.");
        }
        int i3 = d4.f26304b - 1;
        java.lang.Object objF = d4.f(i3);
        d4.k(i3);
        kotlin.jvm.internal.m.c(objF, "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
        if (d4.h()) {
            h9.k(null);
        }
        if (d4.f26304b == 1) {
            h9.m(null, d4.e());
        }
        return objF;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0065 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0067 A[LOOP:0: B:9:0x001e->B:22:0x0067, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x006a A[EDGE_INSN: B:25:0x006a->B:23:0x006a BREAK  A[LOOP:0: B:9:0x001e->B:22:0x0067], SYNTHETIC] */
    public static final p136q.D b(p136q.H h9) {
        if (h9.i()) {
            p136q.D d4 = p136q.N.f26349b;
            kotlin.jvm.internal.m.c(d4, "null cannot be cast to non-null type androidx.collection.ObjectList<E of androidx.collection.ObjectListKt.emptyObjectList>");
            return d4;
        }
        p136q.D d6 = new p136q.D();
        java.lang.Object[] objArr = h9.f26324c;
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
                            java.lang.Object obj = objArr[(i3 << 3) + i10];
                            if (obj instanceof p136q.D) {
                                kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type androidx.collection.MutableObjectList<V of androidx.compose.runtime.collection.MultiValueMap>");
                                d6.c((p136q.D) obj);
                            } else {
                                kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
                                d6.a(obj);
                            }
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
        return d6;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof p038e0.a) {
            return kotlin.jvm.internal.m.a(this.f21316a, ((p038e0.a) obj).f21316a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f21316a.hashCode();
    }

    public final java.lang.String toString() {
        return "MultiValueMap(map=" + this.f21316a + ')';
    }
}
