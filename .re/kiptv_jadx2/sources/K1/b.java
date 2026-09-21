package K1;

import android.os.CancellationSignal;
import android.util.Log;
import kotlin.jvm.functions.Function0;

public final class b {
    public static void a(CancellationSignal cancellationSignal, Function0 function0) {
        boolean z6;
        if (cancellationSignal != null) {
            if (cancellationSignal.isCanceled()) {
                Log.i("PlayServicesImpl", "the flow has been canceled");
                z6 = true;
            }
            if (z6) {
            }
            function0.invoke();
        }
        Log.i("PlayServicesImpl", "No cancellationSignal found");
        z6 = false;
        if (z6) {
            function0.invoke();
        }
    }
}
