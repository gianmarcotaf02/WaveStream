package S7;

public final class S extends U {
    public final C0895k j;

    public final W f9555k;

    public S(W w6, long j, C0895k c0895k) {
        super(j);
        this.f9555k = w6;
        this.j = c0895k;
    }

    @Override
    public final void run() {
        this.j.A(this.f9555k);
    }

    @Override
    public final String toString() {
        return super.toString() + this.j;
    }
}
