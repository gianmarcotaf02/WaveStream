package p019c;

import android.window.OnBackInvokedCallback;
import kotlin.jvm.functions.Function0;
import p072i.v;

public final class q implements OnBackInvokedCallback {

    public final int f18079a;

    public final Object f18080b;

    public q(int i3, Object obj) {
        this.f18079a = i3;
        this.f18080b = obj;
    }

    public final void onBackInvoked() {
        switch (this.f18079a) {
            case 0:
                ((p) this.f18080b).invoke();
                break;
            case 1:
                ((v) this.f18080b).s();
                break;
            case 2:
                ((Runnable) this.f18080b).run();
                break;
            default:
                Function0 function0 = (Function0) this.f18080b;
                if (function0 != null) {
                    function0.invoke();
                }
                break;
        }
    }
}
