package E2;

/* JADX INFO: renamed from: E2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0274a implements E2.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.graphics.Bitmap f2766a;

    public C0274a(android.graphics.Bitmap bitmap) {
        this.f2766a = bitmap;
    }

    @Override // E2.l
    public final int a() {
        return this.f2766a.getHeight();
    }

    @Override // E2.l
    public final int b() {
        return this.f2766a.getWidth();
    }

    @Override // E2.l
    public final long c() {
        int i3;
        int allocationByteCount;
        android.graphics.Bitmap bitmap = this.f2766a;
        if (bitmap.isRecycled()) {
            throw new java.lang.IllegalStateException(("Cannot obtain size for recycled bitmap: " + bitmap + " [" + bitmap.getWidth() + " x " + bitmap.getHeight() + "] + " + bitmap.getConfig()).toString());
        }
        try {
            allocationByteCount = bitmap.getAllocationByteCount();
        } catch (java.lang.Exception unused) {
            int height = bitmap.getHeight() * bitmap.getWidth();
            android.graphics.Bitmap.Config config = bitmap.getConfig();
            if (config == android.graphics.Bitmap.Config.ALPHA_8) {
                i3 = 1;
            } else if (config == android.graphics.Bitmap.Config.RGB_565 || config == android.graphics.Bitmap.Config.ARGB_4444) {
                i3 = 2;
            } else {
                i3 = (android.os.Build.VERSION.SDK_INT < 26 || config != android.graphics.Bitmap.Config.RGBA_F16) ? 4 : 8;
            }
            allocationByteCount = i3 * height;
        }
        return allocationByteCount;
    }

    @Override // E2.l
    public final boolean d() {
        return true;
    }

    @Override // E2.l
    public final void e(android.graphics.Canvas canvas) {
        canvas.drawBitmap(this.f2766a, 0.0f, 0.0f, (android.graphics.Paint) null);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof E2.C0274a) {
            return kotlin.jvm.internal.m.a(this.f2766a, ((E2.C0274a) obj).f2766a);
        }
        return false;
    }

    public final int hashCode() {
        return java.lang.Boolean.hashCode(true) + (this.f2766a.hashCode() * 31);
    }

    public final java.lang.String toString() {
        return "BitmapImage(bitmap=" + this.f2766a + ", shareable=true)";
    }
}
