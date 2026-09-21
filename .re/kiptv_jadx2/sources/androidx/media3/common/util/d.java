package androidx.media3.common.util;

import android.os.Handler;
import java.util.concurrent.Executor;

public final class d implements Executor {

    public final Handler f16458h;

    @Override
    public final void execute(Runnable runnable) {
        this.f16458h.post(runnable);
    }
}
