package B6;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a extends B6.d {
    @Override // B6.d
    public final int a(int i3) {
        return ((-i3) >> 31) & (j().nextInt() >>> (32 - i3));
    }

    @Override // B6.d
    public final void b(byte[] array) {
        kotlin.jvm.internal.m.e(array, "array");
        j().nextBytes(array);
    }

    @Override // B6.d
    public final int d() {
        return j().nextInt();
    }

    @Override // B6.d
    public final int e(int i3) {
        return j().nextInt(i3);
    }

    @Override // B6.d
    public final long g() {
        return j().nextLong();
    }

    public abstract java.util.Random j();
}
