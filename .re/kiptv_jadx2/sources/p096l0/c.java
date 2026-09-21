package p096l0;

import kotlin.jvm.internal.m;
import p136q.D;
import p136q.H;

public final class c implements d {

    public boolean f24710i;
    public boolean j;

    public boolean f24709h = true;

    public final H f24711k = new H();

    public final void a() {
        H h9 = this.f24711k;
        Object[] objArr = h9.f26324c;
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
                            Object obj = objArr[(i3 << 3) + i10];
                            if (obj instanceof D) {
                                m.c(obj, "null cannot be cast to non-null type androidx.collection.MutableObjectList<V of androidx.compose.runtime.retain.impl.SafeMultiValueMap>");
                                D d4 = (D) obj;
                                Object[] objArr2 = d4.f26303a;
                                int i11 = d4.f26304b;
                                for (int i12 = 0; i12 < i11; i12++) {
                                    Object obj2 = objArr2[i12];
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
