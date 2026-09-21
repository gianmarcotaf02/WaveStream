package Z7;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends Z7.i {
    public final java.lang.Runnable j;

    public j(java.lang.Runnable runnable, long j, boolean z6) {
        super(j, z6);
        this.j = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.j.run();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Task[");
        java.lang.Runnable runnable = this.j;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(S7.C.s(runnable));
        sb.append(", ");
        sb.append(this.f13047h);
        sb.append(", ");
        return Y6.f.l(sb, this.f13048i ? "Blocking" : "Non-blocking", ']');
    }
}
