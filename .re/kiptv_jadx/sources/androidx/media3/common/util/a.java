package androidx.media3.common.util;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements java.lang.Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16451h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.common.util.BackgroundThreadStateHandler f16452i;
    public final /* synthetic */ java.lang.Object j;

    public /* synthetic */ a(androidx.media3.common.util.BackgroundThreadStateHandler backgroundThreadStateHandler, java.lang.Object obj, int i3) {
        this.f16451h = i3;
        this.f16452i = backgroundThreadStateHandler;
        this.j = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16451h) {
            case 0:
                this.f16452i.lambda$setStateInBackground$2(this.j);
                break;
            default:
                this.f16452i.lambda$updateStateAsync$0(this.j);
                break;
        }
    }
}
