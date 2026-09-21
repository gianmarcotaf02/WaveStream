package androidx.recyclerview.widget;

/* JADX INFO: renamed from: androidx.recyclerview.widget.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class InterpolatorC1641x implements android.view.animation.Interpolator {
    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f9) {
        float f10 = f9 - 1.0f;
        return (f10 * f10 * f10 * f10 * f10) + 1.0f;
    }
}
