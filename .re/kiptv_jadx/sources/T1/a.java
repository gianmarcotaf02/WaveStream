package T1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements java.util.concurrent.ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f9675a;

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable runnable) {
        java.lang.Thread thread = new java.lang.Thread(runnable, this.f9675a);
        thread.setPriority(10);
        return thread;
    }
}
