package androidx.media3.exoplayer.offline;

import android.os.Handler;
import android.os.Message;

public final class c implements Handler.Callback {

    public final int f16702h;

    public final Object f16703i;

    public c(int i3, Object obj) {
        this.f16702h = i3;
        this.f16703i = obj;
    }

    @Override
    public final boolean handleMessage(Message message) {
        switch (this.f16702h) {
            case 0:
                return ((DownloadHelper.MediaPreparer) this.f16703i).handleDownloadHelperCallbackMessage(message);
            default:
                return ((DownloadManager) this.f16703i).handleMainMessage(message);
        }
    }
}
