package O;

import android.util.Log;
import com.google.common.util.concurrent.P;
import kotlin.jvm.functions.Function0;

public final class c implements Runnable {

    public final int f7518h;

    public final Function0 f7519i;

    public c(int i3, Function0 function0) {
        this.f7518h = i3;
        this.f7519i = function0;
    }

    @Override
    public final void run() {
        Object objT;
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
                } catch (Throwable th) {
                    objT = P.T(th);
                }
                Throwable thA = p070h6.n.a(objT);
                if (thA != null) {
                    Log.w("MpvCore", "mpv call failed", thA);
                }
                break;
            default:
                this.f7519i.invoke();
                break;
        }
    }
}
