package t8;

public final class C2864n extends B7.l {

    public final boolean f28633k;

    public C2864n(q qVar, boolean z6) {
        super(qVar);
        this.f28633k = z6;
    }

    @Override
    public final void b(byte b9) {
        if (this.f28633k) {
            h(String.valueOf(b9 & 255));
        } else {
            f(String.valueOf(b9 & 255));
        }
    }

    @Override
    public final void d(int i3) {
        if (this.f28633k) {
            h(Long.toString(4294967295L & ((long) i3), 10));
        } else {
            f(Long.toString(4294967295L & ((long) i3), 10));
        }
    }

    @Override
    public final void e(long j) {
        int i3 = 63;
        String str = "0";
        if (this.f28633k) {
            if (j != 0) {
                if (j > 0) {
                    str = Long.toString(j, 10);
                } else {
                    char[] cArr = new char[64];
                    long j9 = (j >>> 1) / ((long) 5);
                    long j10 = 10;
                    cArr[63] = Character.forDigit((int) (j - (j9 * j10)), 10);
                    while (j9 > 0) {
                        i3--;
                        cArr[i3] = Character.forDigit((int) (j9 % j10), 10);
                        j9 /= j10;
                    }
                    str = new String(cArr, i3, 64 - i3);
                }
            }
            h(str);
            return;
        }
        if (j != 0) {
            if (j > 0) {
                str = Long.toString(j, 10);
            } else {
                char[] cArr2 = new char[64];
                long j11 = (j >>> 1) / ((long) 5);
                long j12 = 10;
                cArr2[63] = Character.forDigit((int) (j - (j11 * j12)), 10);
                while (j11 > 0) {
                    i3--;
                    cArr2[i3] = Character.forDigit((int) (j11 % j12), 10);
                    j11 /= j12;
                }
                str = new String(cArr2, i3, 64 - i3);
            }
        }
        f(str);
    }

    @Override
    public final void g(short s9) {
        if (this.f28633k) {
            h(String.valueOf(s9 & 65535));
        } else {
            f(String.valueOf(s9 & 65535));
        }
    }
}
