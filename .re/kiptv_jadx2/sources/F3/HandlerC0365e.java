package F3;

import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.internal.play_billing.M0;

public final class HandlerC0365e extends Z3.d {
    @Override
    public final void handleMessage(Message message) {
        int i3 = message.what;
        if (i3 != 1) {
            if (i3 != 2) {
                Log.wtf("BasePendingResult", M0.l(i3, "Don't know how to handle message: "), new Exception());
                return;
            } else {
                ((BasePendingResult) message.obj).l0(Status.f18688o);
                return;
            }
        }
        Pair pair = (Pair) message.obj;
        try {
            ((p199y3.n) pair.first).a((E3.k) pair.second);
        } catch (RuntimeException e6) {
            B4.a aVar = BasePendingResult.f18693x;
            throw e6;
        }
    }
}
