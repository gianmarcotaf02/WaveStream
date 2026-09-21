package R0;

/* JADX INFO: loaded from: classes.dex */
public final class F0 extends androidx.lifecycle.e0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p136q.w f8784b;

    public F0() {
        p136q.w wVar = p136q.AbstractC2669m.f26402a;
        this.f8784b = new p136q.w();
    }

    @Override // androidx.lifecycle.e0
    public final void d() {
        p136q.w wVar = this.f8784b;
        int[] iArr = wVar.f26398b;
        java.lang.Object[] objArr = wVar.f26399c;
        long[] jArr = wVar.f26397a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i3 = 0;
        while (true) {
            long j = jArr[i3];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i9 = 8;
                int i10 = 8 - ((~(i3 - length)) >>> 31);
                int i11 = 0;
                while (i11 < i10) {
                    if ((255 & j) < 128) {
                        int i12 = (i3 << 3) + i11;
                        int i13 = iArr[i12];
                        p136q.D d4 = (p136q.D) objArr[i12];
                        java.lang.Object[] objArr2 = d4.f26303a;
                        int i14 = d4.f26304b;
                        int i15 = 0;
                        while (i15 < i14) {
                            R0.E0 e6 = (R0.E0) objArr2[i15];
                            int i16 = i9;
                            p020c0.InterfaceC1678f interfaceC1678f = e6.f8782d;
                            if (interfaceC1678f != null) {
                                interfaceC1678f.cancel();
                            }
                            e6.f8782d = null;
                            p096l0.c cVar = (p096l0.c) e6.f8779a.f9i;
                            cVar.f24710i = true;
                            cVar.f24709h = false;
                            cVar.a();
                            i15++;
                            i9 = i16;
                        }
                    }
                    int i17 = i9;
                    j >>= i17;
                    i11++;
                    i9 = i17;
                }
                if (i10 != i9) {
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
}
