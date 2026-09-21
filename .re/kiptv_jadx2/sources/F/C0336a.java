package F;

public final class C0336a {

    public boolean f3402a;

    public long f3403b;

    public long a() {
        if (this.f3402a) {
            return Long.MAX_VALUE;
        }
        return Math.max(0L, this.f3403b - System.nanoTime());
    }
}
