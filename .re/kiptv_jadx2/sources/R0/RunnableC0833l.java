package R0;

import android.os.Trace;
import android.view.MotionEvent;
import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.jvm.functions.Function0;

public final class RunnableC0833l implements Runnable {

    public final int f8935h;

    public final AndroidComposeView f8936i;

    public RunnableC0833l(AndroidComposeView androidComposeView, int i3) {
        this.f8935h = i3;
        this.f8936i = androidComposeView;
    }

    @Override
    public final void run() {
        AndroidComposeView androidComposeView = this.f8936i;
        switch (this.f8935h) {
            case 0:
                Class cls = AndroidComposeView.f15871R0;
                Trace.beginSection("AndroidOwner:outOfFrameExecutor");
                while (!androidComposeView.f15931o.isEmpty()) {
                    try {
                        ((Function0) androidComposeView.f15931o.removeLast()).invoke();
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                }
                Trace.endSection();
                return;
            default:
                androidComposeView.f15893J0 = false;
                MotionEvent motionEvent = androidComposeView.f15878B0;
                kotlin.jvm.internal.m.b(motionEvent);
                if (motionEvent.getActionMasked() != 10) {
                    throw new IllegalStateException("The ACTION_HOVER_EXIT event was not cleared.");
                }
                androidComposeView.H(motionEvent);
                return;
        }
    }
}
