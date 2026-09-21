package io.sentry.android.replay;

import io.sentry.IScope;
import io.sentry.ScopeCallback;
import io.sentry.android.replay.capture.CaptureStrategy;
import kotlin.jvm.internal.A;

public final class b implements ScopeCallback {

    public final int f23461h;

    public final A f23462i;

    public b(A a2, int i3) {
        this.f23461h = i3;
        this.f23462i = a2;
    }

    @Override
    public final void run(IScope iScope) {
        switch (this.f23461h) {
            case 0:
                ReplayIntegration.onScreenshotRecorded$lambda$4(this.f23462i, iScope);
                break;
            default:
                CaptureStrategy.Companion.createSegment$lambda$0(this.f23462i, iScope);
                break;
        }
    }
}
