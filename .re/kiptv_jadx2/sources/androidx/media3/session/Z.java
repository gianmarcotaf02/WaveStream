package androidx.media3.session;

import android.os.Handler;
import android.os.Message;

public final class Z implements Handler.Callback {

    public final int f16973h;

    public final Object f16974i;

    public Z(int i3, Object obj) {
        this.f16973h = i3;
        this.f16974i = obj;
    }

    @Override
    public final boolean handleMessage(Message message) {
        switch (this.f16973h) {
            case 0:
                return ((MediaControllerImplBase.FlushCommandQueueHandler) this.f16974i).handleMessage(message);
            default:
                return ((MediaControllerImplLegacy.ControllerCompatCallback) this.f16974i).lambda$new$0(message);
        }
    }
}
