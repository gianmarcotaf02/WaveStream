package A1;

/* JADX INFO: loaded from: classes.dex */
public final class l implements java.util.concurrent.ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable runnable) {
        return new A1.k(runnable);
    }
}
