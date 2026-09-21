package p019c;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q implements android.window.OnBackInvokedCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f18080b;

    public /* synthetic */ q(int i3, java.lang.Object obj) {
        this.f18079a = i3;
        this.f18080b = obj;
    }

    public final void onBackInvoked() {
        switch (this.f18079a) {
            case 0:
                ((p019c.p) this.f18080b).invoke();
                break;
            case 1:
                ((p072i.v) this.f18080b).s();
                break;
            case 2:
                ((java.lang.Runnable) this.f18080b).run();
                break;
            default:
                kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) this.f18080b;
                if (function0 != null) {
                    function0.invoke();
                }
                break;
        }
    }
}
