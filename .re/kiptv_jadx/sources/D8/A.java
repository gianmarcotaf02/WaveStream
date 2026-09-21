package D8;

/* JADX INFO: loaded from: classes4.dex */
public final class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f2501b = new int[10];

    public final int a() {
        return (this.f2500a & 128) != 0 ? this.f2501b[7] : io.ktor.network.sockets.DatagramKt.MAX_DATAGRAM_SIZE;
    }

    public final void b(D8.A other) {
        kotlin.jvm.internal.m.e(other, "other");
        for (int i3 = 0; i3 < 10; i3++) {
            if (((1 << i3) & other.f2500a) != 0) {
                c(i3, other.f2501b[i3]);
            }
        }
    }

    public final void c(int i3, int i9) {
        if (i3 >= 0) {
            int[] iArr = this.f2501b;
            if (i3 >= iArr.length) {
                return;
            }
            this.f2500a = (1 << i3) | this.f2500a;
            iArr[i3] = i9;
        }
    }
}
