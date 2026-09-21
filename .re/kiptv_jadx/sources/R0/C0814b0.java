package R0;

/* JADX INFO: renamed from: R0.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0814b0 implements R0.V0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.view.ViewConfiguration f8880a;

    public C0814b0(android.view.ViewConfiguration viewConfiguration) {
        this.f8880a = viewConfiguration;
    }

    @Override // R0.V0
    public final long a() {
        return android.view.ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // R0.V0
    public final long b() {
        return android.view.ViewConfiguration.getLongPressTimeout();
    }

    @Override // R0.V0
    public final float c() {
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            return this.f8880a.getScaledHandwritingSlop();
        }
        return 2.0f;
    }

    @Override // R0.V0
    public final float e() {
        return this.f8880a.getScaledMaximumFlingVelocity();
    }

    @Override // R0.V0
    public final float f() {
        return this.f8880a.getScaledTouchSlop();
    }

    @Override // R0.V0
    public final float g() {
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            return this.f8880a.getScaledHandwritingGestureLineMargin();
        }
        return 16.0f;
    }
}
