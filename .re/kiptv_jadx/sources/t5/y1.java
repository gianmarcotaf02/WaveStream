package t5;

/* JADX INFO: loaded from: classes4.dex */
public final class y1 extends android.webkit.WebChromeClient {
    @Override // android.webkit.WebChromeClient
    public final android.graphics.Bitmap getDefaultVideoPoster() {
        android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(1, 1, android.graphics.Bitmap.Config.ARGB_8888);
        kotlin.jvm.internal.m.d(bitmapCreateBitmap, "createBitmap(...)");
        return bitmapCreateBitmap;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(android.webkit.ConsoleMessage message) {
        kotlin.jvm.internal.m.e(message, "message");
        if (message.messageLevel() != android.webkit.ConsoleMessage.MessageLevel.ERROR) {
            return true;
        }
        B2.a.v("console: ", message.message(), "TvYouTube");
        return true;
    }
}
