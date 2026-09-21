package W5;

/* JADX INFO: loaded from: classes4.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.HashSet f10606a = new java.util.HashSet();

    public final void a() {
        if (E8.d.g == null) {
            E8.d.g = android.os.Looper.getMainLooper().getThread();
        }
        if (java.lang.Thread.currentThread() != E8.d.g) {
            throw new java.lang.IllegalStateException("Must be called on the Main thread.");
        }
        java.util.Iterator it = this.f10606a.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new java.lang.ClassCastException();
        }
    }
}
