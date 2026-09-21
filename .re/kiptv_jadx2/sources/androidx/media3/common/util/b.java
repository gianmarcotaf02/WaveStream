package androidx.media3.common.util;

import android.os.Handler;
import android.os.Message;

public final class b implements Handler.Callback {

    public final int f16453h;

    public final Object f16454i;

    public b(int i3, Object obj) {
        this.f16453h = i3;
        this.f16454i = obj;
    }

    @Override
    public final boolean handleMessage(Message message) {
        switch (this.f16453h) {
            case 0:
                return ((ListenerSet) this.f16454i).handleMessage(message);
            default:
                return ((StuckPlayerDetector) this.f16454i).handleMessage(message);
        }
    }
}
