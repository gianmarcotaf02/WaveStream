package C6;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends B6.a {
    @Override // B6.d
    public final int f(int i3, int i9) {
        return java.util.concurrent.ThreadLocalRandom.current().nextInt(i3, i9);
    }

    @Override // B6.d
    public final long h(long j) {
        return java.util.concurrent.ThreadLocalRandom.current().nextLong(j);
    }

    @Override // B6.d
    public final long i(long j, long j9) {
        return java.util.concurrent.ThreadLocalRandom.current().nextLong(j, j9);
    }

    @Override // B6.a
    public final java.util.Random j() {
        java.util.concurrent.ThreadLocalRandom threadLocalRandomCurrent = java.util.concurrent.ThreadLocalRandom.current();
        kotlin.jvm.internal.m.d(threadLocalRandomCurrent, "current(...)");
        return threadLocalRandomCurrent;
    }
}
