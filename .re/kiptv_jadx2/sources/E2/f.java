package E2;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

public final class f implements l {

    public final Drawable f2781a;

    public f(Drawable drawable) {
        this.f2781a = drawable;
    }

    @Override
    public final int a() {
        return X2.l.a(this.f2781a);
    }

    @Override
    public final int b() {
        return X2.l.b(this.f2781a);
    }

    @Override
    public final long c() {
        Drawable drawable = this.f2781a;
        long jB = ((long) X2.l.b(drawable)) * 4 * ((long) X2.l.a(drawable));
        if (jB < 0) {
            return 0L;
        }
        return jB;
    }

    @Override
    public final boolean d() {
        return false;
    }

    @Override
    public final void e(Canvas canvas) {
        this.f2781a.draw(canvas);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            return kotlin.jvm.internal.m.a(this.f2781a, ((f) obj).f2781a);
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.f2781a.hashCode() * 31);
    }

    public final String toString() {
        return "DrawableImage(drawable=" + this.f2781a + ", shareable=false)";
    }
}
