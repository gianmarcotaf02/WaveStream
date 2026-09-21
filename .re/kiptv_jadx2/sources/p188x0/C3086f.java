package p188x0;

import android.graphics.Bitmap;
import android.os.Build;
import kotlin.jvm.internal.m;

public final class C3086f {

    public final Bitmap f31108a;

    public C3086f(Bitmap bitmap) {
        this.f31108a = bitmap;
    }

    public final int a() {
        Bitmap.Config config = this.f31108a.getConfig();
        m.b(config);
        if (config == Bitmap.Config.ALPHA_8) {
            return 1;
        }
        if (config == Bitmap.Config.RGB_565) {
            return 2;
        }
        if (config == Bitmap.Config.ARGB_4444) {
            return 0;
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 26 || config != Bitmap.Config.RGBA_F16) {
            return (i3 < 26 || config != Bitmap.Config.HARDWARE) ? 0 : 4;
        }
        return 3;
    }
}
