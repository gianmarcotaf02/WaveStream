package io.sentry.android.core.internal.util;

import android.view.PixelCopy;
import android.view.View;
import io.sentry.android.replay.ScreenshotRecorder;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

public final class b implements PixelCopy.OnPixelCopyFinishedListener {

    public final int f23436a;

    public final Object f23437b;

    public final Object f23438c;

    public b(Object obj, Object obj2, int i3) {
        this.f23436a = i3;
        this.f23437b = obj;
        this.f23438c = obj2;
    }

    @Override
    public final void onPixelCopyFinished(int i3) {
        switch (this.f23436a) {
            case 0:
                ScreenshotUtils.lambda$takeScreenshot$0((AtomicBoolean) this.f23437b, (CountDownLatch) this.f23438c, i3);
                break;
            default:
                ScreenshotRecorder.capture$lambda$2$lambda$1((ScreenshotRecorder) this.f23437b, (View) this.f23438c, i3);
                break;
        }
    }
}
