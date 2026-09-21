package androidx.media3.common.util;

import java.util.concurrent.ThreadFactory;

public final class g implements ThreadFactory {

    public final int f16462a;

    public final String f16463b;

    public g(String str, int i3) {
        this.f16462a = i3;
        this.f16463b = str;
    }

    @Override
    public final Thread newThread(Runnable runnable) {
        switch (this.f16462a) {
            case 0:
                return Util.lambda$newSingleThreadExecutor$3(this.f16463b, runnable);
            default:
                return Util.lambda$newSingleThreadScheduledExecutor$4(this.f16463b, runnable);
        }
    }
}
