package androidx.media3.exoplayer.source;

import android.os.Handler;
import android.os.Message;

public final class b implements Handler.Callback {

    public final int f16727h;

    public final CompositeMediaSource f16728i;

    public b(CompositeMediaSource compositeMediaSource, int i3) {
        this.f16727h = i3;
        this.f16728i = compositeMediaSource;
    }

    @Override
    public final boolean handleMessage(Message message) {
        switch (this.f16727h) {
            case 0:
                return ((ConcatenatingMediaSource) this.f16728i).handleMessage(message);
            default:
                return ((ConcatenatingMediaSource2) this.f16728i).handleMessage(message);
        }
    }
}
