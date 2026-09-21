package S7;

/* JADX INFO: loaded from: classes4.dex */
public final class T extends S7.U {
    public final java.lang.Runnable j;

    public T(long j, java.lang.Runnable runnable) {
        super(j);
        this.j = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.j.run();
    }

    @Override // S7.U
    public final java.lang.String toString() {
        return super.toString() + this.j;
    }
}
