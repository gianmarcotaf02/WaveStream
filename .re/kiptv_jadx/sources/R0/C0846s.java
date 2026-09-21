package R0;

/* JADX INFO: renamed from: R0.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0846s extends kotlin.jvm.internal.o implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f8986h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.platform.AndroidComposeView f8987i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0846s(androidx.compose.ui.platform.AndroidComposeView androidComposeView, int i3) {
        super(1);
        this.f8986h = i3;
        this.f8987i = androidComposeView;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        switch (this.f8986h) {
            case 0:
                ((p175v0.p) this.f8987i.getFocusOwner()).g(((p175v0.C2911f) obj).f29068a, false);
                return p070h6.A.f22523a;
            case 1:
                kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) obj;
                androidx.compose.ui.platform.AndroidComposeView androidComposeView = this.f8987i;
                androidComposeView.getUncaughtExceptionHandler$ui();
                android.os.Handler handler = androidComposeView.getHandler();
                if ((handler != null ? handler.getLooper() : null) == android.os.Looper.myLooper()) {
                    function0.invoke();
                } else {
                    android.os.Handler handler2 = androidComposeView.getHandler();
                    if (handler2 != null) {
                        handler2.post(new O.c(1, function0));
                    }
                }
                return p070h6.A.f22523a;
            default:
                androidx.compose.ui.platform.AndroidComposeView androidComposeView2 = this.f8987i;
                return new R0.T(androidComposeView2, androidComposeView2.getTextInputService(), (S7.A) obj);
        }
    }
}
