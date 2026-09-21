package O;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements java.lang.Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f7518h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.functions.Function0 f7519i;

    public /* synthetic */ c(int i3, kotlin.jvm.functions.Function0 function0) {
        this.f7518h = i3;
        this.f7519i = function0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object objT;
        switch (this.f7518h) {
            case 0:
                this.f7519i.invoke();
                break;
            case 1:
                this.f7519i.invoke();
                break;
            case 2:
                this.f7519i.invoke();
                break;
            case 3:
                this.f7519i.invoke();
                break;
            case 4:
                this.f7519i.invoke();
                break;
            case 5:
                this.f7519i.invoke();
                break;
            case 6:
                this.f7519i.invoke();
                break;
            case 7:
                this.f7519i.invoke();
                break;
            case 8:
                try {
                    objT = this.f7519i.invoke();
                } catch (java.lang.Throwable th) {
                    objT = com.google.common.util.concurrent.P.T(th);
                }
                java.lang.Throwable thA = p070h6.n.a(objT);
                if (thA != null) {
                    android.util.Log.w("MpvCore", "mpv call failed", thA);
                }
                break;
            default:
                this.f7519i.invoke();
                break;
        }
    }
}
