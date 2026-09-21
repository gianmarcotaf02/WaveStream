package p188x0;

/* JADX INFO: renamed from: x0.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3086f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.graphics.Bitmap f31108a;

    public C3086f(android.graphics.Bitmap bitmap) {
        this.f31108a = bitmap;
    }

    public final int a() {
        android.graphics.Bitmap.Config config = this.f31108a.getConfig();
        kotlin.jvm.internal.m.b(config);
        if (config == android.graphics.Bitmap.Config.ALPHA_8) {
            return 1;
        }
        if (config == android.graphics.Bitmap.Config.RGB_565) {
            return 2;
        }
        if (config == android.graphics.Bitmap.Config.ARGB_4444) {
            return 0;
        }
        int i3 = android.os.Build.VERSION.SDK_INT;
        if (i3 < 26 || config != android.graphics.Bitmap.Config.RGBA_F16) {
            return (i3 < 26 || config != android.graphics.Bitmap.Config.HARDWARE) ? 0 : 4;
        }
        return 3;
    }
}
