package y7;

/* JADX INFO: loaded from: classes4.dex */
public final class m implements y7.InterfaceC3163e, p206z3.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.Object f32077h;

    public /* synthetic */ m(java.lang.Object obj) {
        this.f32077h = obj;
    }

    @Override // p206z3.a
    public void Q(android.graphics.Bitmap bitmap) {
        B3.C0089b c0089b = p206z3.i.f32368v;
        android.graphics.Bitmap bitmap2 = null;
        if (bitmap != null) {
            int width = bitmap.getWidth();
            float f9 = width;
            int height = bitmap.getHeight();
            int i3 = (int) (((9.0f * f9) / 16.0f) + 0.5f);
            float f10 = (i3 - height) / 2.0f;
            android.graphics.RectF rectF = new android.graphics.RectF(0.0f, f10, f9, height + f10);
            android.graphics.Bitmap.Config config = bitmap.getConfig();
            if (config == null) {
                config = android.graphics.Bitmap.Config.ARGB_8888;
            }
            android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(width, i3, config);
            new android.graphics.Canvas(bitmapCreateBitmap).drawBitmap(bitmap, (android.graphics.Rect) null, rectF, (android.graphics.Paint) null);
            bitmap2 = bitmapCreateBitmap;
        }
        ((p206z3.i) this.f32077h).b(bitmap2, 0);
    }

    @Override // y7.InterfaceC3163e
    public y7.C3162d d(p101l7.b classId) {
        y7.C3162d c3162dD;
        kotlin.jvm.internal.m.e(classId, "classId");
        for (N6.G g : N6.AbstractC0709x.i((N6.J) this.f32077h, classId.f24825a)) {
            if ((g instanceof p209z7.c) && (c3162dD = ((p209z7.c) g).f32953p.d(classId)) != null) {
                return c3162dD;
            }
        }
        return null;
    }

    public m(x8.a aVar) {
        this.f32077h = new java.util.concurrent.ThreadPoolExecutor(0, androidx.media3.common.util.Log.LOG_LEVEL_OFF, 60L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.SynchronousQueue(), aVar);
    }
}
