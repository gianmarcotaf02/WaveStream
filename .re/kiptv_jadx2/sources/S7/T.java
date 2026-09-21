package S7;

public final class T extends U {
    public final Runnable j;

    public T(long j, Runnable runnable) {
        super(j);
        this.j = runnable;
    }

    @Override
    public final void run() {
        this.j.run();
    }

    @Override
    public final String toString() {
        return super.toString() + this.j;
    }
}
