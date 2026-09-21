package x8;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements java.util.concurrent.ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f31714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f31715b;

    public /* synthetic */ a(java.lang.String str, boolean z6) {
        this.f31714a = str;
        this.f31715b = z6;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable runnable) {
        java.lang.String name = this.f31714a;
        kotlin.jvm.internal.m.e(name, "$name");
        java.lang.Thread thread = new java.lang.Thread(runnable, name);
        thread.setDaemon(this.f31715b);
        return thread;
    }
}
