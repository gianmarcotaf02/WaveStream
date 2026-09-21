package A1;

/* JADX INFO: loaded from: classes.dex */
public final class k extends java.lang.Thread {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f154h;

    public k(java.lang.Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.f154h = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        android.os.Process.setThreadPriority(this.f154h);
        super.run();
    }
}
