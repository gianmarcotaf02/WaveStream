package p085j5;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class L implements java.util.concurrent.ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24022a;

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable runnable) {
        switch (this.f24022a) {
            case 0:
                return new java.lang.Thread(runnable, "kiptv-mpv-core");
            default:
                java.lang.Thread thread = new java.lang.Thread(runnable, "vlc-teardown");
                thread.setDaemon(true);
                return thread;
        }
    }
}
