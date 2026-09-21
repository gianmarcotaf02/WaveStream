package Q0;

/* JADX INFO: loaded from: classes.dex */
public final class K implements p113n1.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f8284h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f8285i = 9223372034707292159L;
    public long j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Q0.N f8286k;

    public K(Q0.N n3) {
        this.f8286k = n3;
    }

    @Override // p113n1.c
    public final float S() {
        return this.f8286k.S();
    }

    public final void a(O0.C0725n c0725n, float f9) {
        Q0.N n3 = this.f8286k;
        Q0.w0 w0Var = n3.f8303t;
        if (w0Var == null) {
            w0Var = new Q0.w0();
            n3.f8303t = w0Var;
        }
        int iS0 = p078i6.m.s0((O0.C0725n[]) w0Var.f8483b, c0725n);
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
        O0.C0725n[] c0725nArr = (O0.C0725n[]) w0Var.f8483b;
        if (i3 == c0725nArr.length) {
            int i9 = i3 * 2;
            java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(c0725nArr, i9);
            kotlin.jvm.internal.m.d(objArrCopyOf, "copyOf(...)");
            w0Var.f8483b = (O0.C0725n[]) objArrCopyOf;
            float[] fArrCopyOf = java.util.Arrays.copyOf((float[]) w0Var.f8484c, i9);
            kotlin.jvm.internal.m.d(fArrCopyOf, "copyOf(...)");
            w0Var.f8484c = fArrCopyOf;
            byte[] bArrCopyOf = java.util.Arrays.copyOf((byte[]) w0Var.f8485d, i9);
            kotlin.jvm.internal.m.d(bArrCopyOf, "copyOf(...)");
            w0Var.f8485d = bArrCopyOf;
        }
        ((O0.C0725n[]) w0Var.f8483b)[i3] = c0725n;
        ((byte[]) w0Var.f8485d)[i3] = 3;
        ((float[]) w0Var.f8484c)[i3] = f9;
        w0Var.f8482a++;
    }

    @Override // p113n1.c
    public final float getDensity() {
        return this.f8286k.getDensity();
    }
}
