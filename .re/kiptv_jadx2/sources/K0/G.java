package K0;

import Q0.o0;
import android.view.MotionEvent;
import androidx.compose.ui.platform.AndroidComposeView;

public final class G extends kotlin.jvm.internal.o implements p194x6.j {

    public final int f6654h;

    public final p138q1.y f6655i;

    public G(p138q1.y yVar, int i3) {
        super(1);
        this.f6654h = i3;
        this.f6655i = yVar;
    }

    @Override
    public final Object invoke(Object obj) {
        boolean zDispatchTouchEvent;
        switch (this.f6654h) {
            case 0:
                MotionEvent motionEvent = (MotionEvent) obj;
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
                return Boolean.valueOf(zDispatchTouchEvent);
            case 1:
                o0 o0Var = (o0) obj;
                AndroidComposeView androidComposeView = o0Var instanceof AndroidComposeView ? (AndroidComposeView) o0Var : null;
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
