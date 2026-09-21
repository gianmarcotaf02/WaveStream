package t5;

import android.graphics.Bitmap;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;

public final class y1 extends WebChromeClient {
    @Override
    public final Bitmap getDefaultVideoPoster() {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        kotlin.jvm.internal.m.d(bitmapCreateBitmap, "createBitmap(...)");
        return bitmapCreateBitmap;
    }

    @Override
    public final boolean onConsoleMessage(ConsoleMessage message) {
        kotlin.jvm.internal.m.e(message, "message");
        if (message.messageLevel() != ConsoleMessage.MessageLevel.ERROR) {
            return true;
        }
        B2.a.v("console: ", message.message(), "TvYouTube");
        return true;
    }
}
