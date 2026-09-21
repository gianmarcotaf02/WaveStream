package E2;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;

public final class C0274a implements l {

    public final Bitmap f2766a;

    public C0274a(Bitmap bitmap) {
        this.f2766a = bitmap;
    }

    @Override
    public final int a() {
        return this.f2766a.getHeight();
    }

    @Override
    public final int b() {
        return this.f2766a.getWidth();
    }

    @Override
    public final long c() {
        int i3;
        int allocationByteCount;
        Bitmap bitmap = this.f2766a;
        if (bitmap.isRecycled()) {
            throw new IllegalStateException(("Cannot obtain size for recycled bitmap: " + bitmap + " [" + bitmap.getWidth() + " x " + bitmap.getHeight() + "] + " + bitmap.getConfig()).toString());
        }
        try {
            allocationByteCount = bitmap.getAllocationByteCount();
        } catch (Exception unused) {
            int height = bitmap.getHeight() * bitmap.getWidth();
            Bitmap.Config config = bitmap.getConfig();
            if (config == Bitmap.Config.ALPHA_8) {
                i3 = 1;
            } else if (config == Bitmap.Config.RGB_565 || config == Bitmap.Config.ARGB_4444) {
                i3 = 2;
            } else {
                i3 = (Build.VERSION.SDK_INT < 26 || config != Bitmap.Config.RGBA_F16) ? 4 : 8;
            }
            allocationByteCount = i3 * height;
        }
        return allocationByteCount;
    }

    @Override
    public final boolean d() {
        return true;
    }

    @Override
    public final void e(Canvas canvas) {
        canvas.drawBitmap(this.f2766a, 0.0f, 0.0f, (Paint) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0274a) {
            return kotlin.jvm.internal.m.a(this.f2766a, ((C0274a) obj).f2766a);
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.f2766a.hashCode() * 31);
    }

    public final String toString() {
        return "BitmapImage(bitmap=" + this.f2766a + ", shareable=true)";
    }
}
