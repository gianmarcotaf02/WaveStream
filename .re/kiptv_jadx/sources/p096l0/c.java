package p096l0;

/* JADX INFO: loaded from: classes.dex */
public final class c implements p096l0.d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f24710i;
    public boolean j;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f24709h = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p136q.H f24711k = new p136q.H();

    /* JADX WARN: Code duplicated, block: B:18:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0056 A[LOOP:0: B:5:0x000d->B:19:0x0056, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:23:0x0059 A[EDGE_INSN: B:23:0x0059->B:20:0x0059 BREAK  A[LOOP:0: B:5:0x000d->B:19:0x0056], SYNTHETIC] */
    public final void a() {
        p136q.H h9 = this.f24711k;
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
                                kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type androidx.collection.MutableObjectList<V of androidx.compose.runtime.retain.impl.SafeMultiValueMap>");
                                p136q.D d4 = (p136q.D) obj;
                                java.lang.Object[] objArr2 = d4.f26303a;
                                int i11 = d4.f26304b;
                                for (int i12 = 0; i12 < i11; i12++) {
                                    java.lang.Object obj2 = objArr2[i12];
                                }
                            }
                        }
                        j >>= 8;
                    }
                    if (i9 != 8) {
                        break;
                    } else if (i3 != length) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
        }
        h9.a();
    }
}
