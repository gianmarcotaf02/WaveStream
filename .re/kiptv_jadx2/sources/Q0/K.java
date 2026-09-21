package Q0;

import O0.C0725n;
import java.util.Arrays;

public final class K implements p113n1.c {

    public boolean f8284h;

    public long f8285i = 9223372034707292159L;
    public long j = 0;

    public final N f8286k;

    public K(N n3) {
        this.f8286k = n3;
    }

    @Override
    public final float S() {
        return this.f8286k.S();
    }

    public final void a(C0725n c0725n, float f9) {
        N n3 = this.f8286k;
        w0 w0Var = n3.f8303t;
        if (w0Var == null) {
            w0Var = new w0();
            n3.f8303t = w0Var;
        }
        int iS0 = p078i6.m.s0((C0725n[]) w0Var.f8483b, c0725n);
        if (iS0 >= 0) {
            float[] fArr = (float[]) w0Var.f8484c;
            if (fArr[iS0] != f9) {
                fArr[iS0] = f9;
                ((byte[]) w0Var.f8485d)[iS0] = 1;
                return;
            } else {
                byte[] bArr = (byte[]) w0Var.f8485d;
                if (bArr[iS0] == 2) {
                    bArr[iS0] = 0;
                    return;
                }
                return;
            }
        }
        int i3 = w0Var.f8482a;
        C0725n[] c0725nArr = (C0725n[]) w0Var.f8483b;
        if (i3 == c0725nArr.length) {
            int i9 = i3 * 2;
            Object[] objArrCopyOf = Arrays.copyOf(c0725nArr, i9);
            kotlin.jvm.internal.m.d(objArrCopyOf, "copyOf(...)");
            w0Var.f8483b = (C0725n[]) objArrCopyOf;
            float[] fArrCopyOf = Arrays.copyOf((float[]) w0Var.f8484c, i9);
            kotlin.jvm.internal.m.d(fArrCopyOf, "copyOf(...)");
            w0Var.f8484c = fArrCopyOf;
            byte[] bArrCopyOf = Arrays.copyOf((byte[]) w0Var.f8485d, i9);
            kotlin.jvm.internal.m.d(bArrCopyOf, "copyOf(...)");
            w0Var.f8485d = bArrCopyOf;
        }
        ((C0725n[]) w0Var.f8483b)[i3] = c0725n;
        ((byte[]) w0Var.f8485d)[i3] = 3;
        ((float[]) w0Var.f8484c)[i3] = f9;
        w0Var.f8482a++;
    }

    @Override
    public final float getDensity() {
        return this.f8286k.getDensity();
    }
}
