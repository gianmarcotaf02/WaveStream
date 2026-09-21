package Q0;

public final class C0767c0 {

    public final int f8396a;

    public static final int a(int i3, long j) {
        int i9 = A0.f8201b;
        return ((int) (j >> (i3 * 15))) & 32767;
    }

    public static long c(int i3, int i9, int i10, int i11) {
        return (((long) (i9 & 32767)) << 15) | ((long) (i3 & 32767)) | (((long) (i10 & 32767)) << 30) | (((long) (i11 & 32767)) << 45) | Long.MIN_VALUE;
    }

    public int b() {
        switch (this.f8396a) {
            case 0:
                return 16;
            default:
                return 8;
        }
    }
}
