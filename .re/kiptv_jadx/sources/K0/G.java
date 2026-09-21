package K0;

/* JADX INFO: loaded from: classes.dex */
public final class G extends kotlin.jvm.internal.o implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f6654h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p138q1.y f6655i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ G(p138q1.y yVar, int i3) {
        super(1);
        this.f6654h = i3;
        this.f6655i = yVar;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        boolean zDispatchTouchEvent;
        switch (this.f6654h) {
            case 0:
                android.view.MotionEvent motionEvent = (android.view.MotionEvent) obj;
                int actionMasked = motionEvent.getActionMasked();
                p138q1.y yVar = this.f6655i;
                switch (actionMasked) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        zDispatchTouchEvent = yVar.dispatchTouchEvent(motionEvent);
                        break;
                    default:
                        zDispatchTouchEvent = yVar.dispatchGenericMotionEvent(motionEvent);
                        break;
                }
                return java.lang.Boolean.valueOf(zDispatchTouchEvent);
            case 1:
                Q0.o0 o0Var = (Q0.o0) obj;
                androidx.compose.ui.platform.AndroidComposeView androidComposeView = o0Var instanceof androidx.compose.ui.platform.AndroidComposeView ? (androidx.compose.ui.platform.AndroidComposeView) o0Var : null;
                p138q1.y yVar2 = this.f6655i;
                if (androidComposeView != null) {
                    androidComposeView.getAndroidViewsHandler$ui().removeViewInLayout(yVar2);
                    kotlin.jvm.internal.E.a(androidComposeView.getAndroidViewsHandler$ui().getLayoutNodeToHolder()).remove(androidComposeView.getAndroidViewsHandler$ui().getHolderToLayoutNode().remove(yVar2));
                    yVar2.setImportantForAccessibility(0);
                }
                yVar2.removeAllViewsInLayout();
                return p070h6.A.f22523a;
            default:
                this.f6655i.f26539x = (p194x6.j) obj;
                return p070h6.A.f22523a;
        }
    }
}
