package S7;

public final class C0 extends X7.p implements Runnable {

    public final long f9534l;

    public C0(long j, D0 d4) {
        super(d4, d4.getContext());
        this.f9534l = j;
    }

    @Override
    public final String L() {
        return super.L() + "(timeMillis=" + this.f9534l + ')';
    }

    @Override
    public final void run() {
        C.r(this.j);
        l(new B0(Y6.f.g(this.f9534l, " ms", new StringBuilder("Timed out waiting for ")), this));
    }
}
