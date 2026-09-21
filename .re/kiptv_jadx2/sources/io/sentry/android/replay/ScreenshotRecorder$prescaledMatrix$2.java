package io.sentry.android.replay;

import android.graphics.Matrix;
import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.o;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/Matrix;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class ScreenshotRecorder$prescaledMatrix$2 extends o implements Function0 {
    final ScreenshotRecorder this$0;

    public ScreenshotRecorder$prescaledMatrix$2(ScreenshotRecorder screenshotRecorder) {
        super(0);
        this.this$0 = screenshotRecorder;
    }

    @Override
    public final Matrix invoke() {
        Matrix matrix = new Matrix();
        ScreenshotRecorder screenshotRecorder = this.this$0;
        matrix.preScale(screenshotRecorder.getConfig().getScaleFactorX(), screenshotRecorder.getConfig().getScaleFactorY());
        return matrix;
    }
}
