package io.sentry.android.replay;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/Matrix;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class ScreenshotRecorder$prescaledMatrix$2 extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {
    final /* synthetic */ io.sentry.android.replay.ScreenshotRecorder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScreenshotRecorder$prescaledMatrix$2(io.sentry.android.replay.ScreenshotRecorder screenshotRecorder) {
        super(0);
        this.this$0 = screenshotRecorder;
    }

    @Override // kotlin.jvm.functions.Function0
    public final android.graphics.Matrix invoke() {
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        io.sentry.android.replay.ScreenshotRecorder screenshotRecorder = this.this$0;
        matrix.preScale(screenshotRecorder.getConfig().getScaleFactorX(), screenshotRecorder.getConfig().getScaleFactorY());
        return matrix;
    }
}
