package R0;

import android.os.SystemClock;
import android.view.MotionEvent;
import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.jvm.functions.Function0;

public final class C0852v extends kotlin.jvm.internal.o implements Function0 {

    public final int f8998h;

    public final AndroidComposeView f8999i;

    public C0852v(AndroidComposeView androidComposeView, int i3) {
        super(0);
        this.f8998h = i3;
        this.f8999i = androidComposeView;
    }

    @Override
    public final Object invoke() {
        int actionMasked;
        switch (this.f8998h) {
            case 0:
                AndroidComposeView androidComposeView = this.f8999i;
                MotionEvent motionEvent = androidComposeView.f15878B0;
                if (motionEvent != null && ((actionMasked = motionEvent.getActionMasked()) == 7 || actionMasked == 9)) {
                    androidComposeView.f15880C0 = SystemClock.uptimeMillis();
                    androidComposeView.post(androidComposeView.f15889H0);
                }
                return p070h6.A.f22523a;
            default:
                return this.f8999i.get_viewTreeOwners();
        }
    }
}
