package R0;

/* JADX INFO: renamed from: R0.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0852v extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f8998h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.platform.AndroidComposeView f8999i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0852v(androidx.compose.ui.platform.AndroidComposeView androidComposeView, int i3) {
        super(0);
        this.f8998h = i3;
        this.f8999i = androidComposeView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final java.lang.Object invoke() {
        int actionMasked;
        switch (this.f8998h) {
            case 0:
                androidx.compose.ui.platform.AndroidComposeView androidComposeView = this.f8999i;
                android.view.MotionEvent motionEvent = androidComposeView.f15878B0;
                if (motionEvent != null && ((actionMasked = motionEvent.getActionMasked()) == 7 || actionMasked == 9)) {
                    androidComposeView.f15880C0 = android.os.SystemClock.uptimeMillis();
                    androidComposeView.post(androidComposeView.f15889H0);
                }
                return p070h6.A.f22523a;
            default:
                return this.f8999i.get_viewTreeOwners();
        }
    }
}
