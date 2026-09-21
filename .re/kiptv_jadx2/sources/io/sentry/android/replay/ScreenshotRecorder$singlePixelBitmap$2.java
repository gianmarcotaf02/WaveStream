package io.sentry.android.replay;

import android.graphics.Bitmap;
import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.o;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/Bitmap;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class ScreenshotRecorder$singlePixelBitmap$2 extends o implements Function0 {
    public static final ScreenshotRecorder$singlePixelBitmap$2 INSTANCE = new ScreenshotRecorder$singlePixelBitmap$2();

    public ScreenshotRecorder$singlePixelBitmap$2() {
        super(0);
    }

    @Override
    public final Bitmap invoke() {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.RGB_565);
        m.d(bitmapCreateBitmap, "createBitmap(\n          ….Config.RGB_565\n        )");
        return bitmapCreateBitmap;
    }
}
