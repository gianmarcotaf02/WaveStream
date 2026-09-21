package R0;

import android.os.Build;
import android.view.ViewConfiguration;

public final class C0814b0 implements V0 {

    public final ViewConfiguration f8880a;

    public C0814b0(ViewConfiguration viewConfiguration) {
        this.f8880a = viewConfiguration;
    }

    @Override
    public final long a() {
        return ViewConfiguration.getDoubleTapTimeout();
    }

    @Override
    public final long b() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override
    public final float c() {
        if (Build.VERSION.SDK_INT >= 34) {
            return this.f8880a.getScaledHandwritingSlop();
        }
        return 2.0f;
    }

    @Override
    public final float e() {
        return this.f8880a.getScaledMaximumFlingVelocity();
    }

    @Override
    public final float f() {
        return this.f8880a.getScaledTouchSlop();
    }

    @Override
    public final float g() {
        if (Build.VERSION.SDK_INT >= 34) {
            return this.f8880a.getScaledHandwritingGestureLineMargin();
        }
        return 16.0f;
    }
}
