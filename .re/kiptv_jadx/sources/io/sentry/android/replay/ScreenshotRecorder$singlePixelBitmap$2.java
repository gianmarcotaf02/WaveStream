package io.sentry.android.replay;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/Bitmap;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class ScreenshotRecorder$singlePixelBitmap$2 extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {
    public static final io.sentry.android.replay.ScreenshotRecorder$singlePixelBitmap$2 INSTANCE = new io.sentry.android.replay.ScreenshotRecorder$singlePixelBitmap$2();

    public ScreenshotRecorder$singlePixelBitmap$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final android.graphics.Bitmap invoke() {
        android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(1, 1, android.graphics.Bitmap.Config.RGB_565);
        kotlin.jvm.internal.m.d(bitmapCreateBitmap, "createBitmap(\n          ….Config.RGB_565\n        )");
        return bitmapCreateBitmap;
    }
}
