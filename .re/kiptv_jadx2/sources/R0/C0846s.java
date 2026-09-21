package R0;

import android.os.Handler;
import android.os.Looper;
import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.jvm.functions.Function0;
import p175v0.C2911f;

public final class C0846s extends kotlin.jvm.internal.o implements p194x6.j {

    public final int f8986h;

    public final AndroidComposeView f8987i;

    public C0846s(AndroidComposeView androidComposeView, int i3) {
        super(1);
        this.f8986h = i3;
        this.f8987i = androidComposeView;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f8986h) {
            case 0:
                ((p175v0.p) this.f8987i.getFocusOwner()).g(((C2911f) obj).f29068a, false);
                return p070h6.A.f22523a;
            case 1:
                Function0 function0 = (Function0) obj;
                AndroidComposeView androidComposeView = this.f8987i;
                androidComposeView.getUncaughtExceptionHandler$ui();
                Handler handler = androidComposeView.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    function0.invoke();
                } else {
                    Handler handler2 = androidComposeView.getHandler();
                    if (handler2 != null) {
                        handler2.post(new O.c(1, function0));
                    }
                }
                return p070h6.A.f22523a;
            default:
                AndroidComposeView androidComposeView2 = this.f8987i;
                return new T(androidComposeView2, androidComposeView2.getTextInputService(), (S7.A) obj);
        }
    }
}
