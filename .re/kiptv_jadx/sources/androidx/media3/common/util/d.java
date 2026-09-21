package androidx.media3.common.util;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements java.util.concurrent.Executor {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.os.Handler f16458h;

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        this.f16458h.post(runnable);
    }
}
