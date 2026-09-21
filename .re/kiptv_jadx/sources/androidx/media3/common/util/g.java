package androidx.media3.common.util;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements java.util.concurrent.ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f16463b;

    public /* synthetic */ g(java.lang.String str, int i3) {
        this.f16462a = i3;
        this.f16463b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable runnable) {
        switch (this.f16462a) {
            case 0:
                return androidx.media3.common.util.Util.lambda$newSingleThreadExecutor$3(this.f16463b, runnable);
            default:
                return androidx.media3.common.util.Util.lambda$newSingleThreadScheduledExecutor$4(this.f16463b, runnable);
        }
    }
}
