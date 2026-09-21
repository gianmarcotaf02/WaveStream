package androidx.media3.session;

import android.os.Bundle;
import androidx.media3.session.legacy.MediaBrowserServiceCompat;

public final class RunnableC1602r0 implements Runnable {

    public final int f17099h = 2;

    public final MediaLibraryServiceLegacyStub f17100i;
    public final String j;

    public final MediaSession.ControllerInfo f17101k;

    public final MediaBrowserServiceCompat.Result f17102l;

    public final Bundle f17103m;

    public RunnableC1602r0(MediaLibraryServiceLegacyStub mediaLibraryServiceLegacyStub, MediaSession.ControllerInfo controllerInfo, MediaBrowserServiceCompat.Result result, Bundle bundle, String str) {
        this.f17100i = mediaLibraryServiceLegacyStub;
        this.f17101k = controllerInfo;
        this.f17102l = result;
        this.f17103m = bundle;
        this.j = str;
    }

    @Override
    public final void run() {
        switch (this.f17099h) {
            case 0:
                this.f17100i.lambda$onSearch$5(this.f17101k, this.f17102l, this.j, this.f17103m);
                break;
            case 1:
                MediaBrowserServiceCompat.Result result = this.f17102l;
                this.f17100i.lambda$onCustomAction$6(this.j, this.f17101k, result, this.f17103m);
                break;
            default:
                this.f17100i.lambda$onLoadChildren$3(this.f17101k, this.f17102l, this.f17103m, this.j);
                break;
        }
    }

    public RunnableC1602r0(MediaLibraryServiceLegacyStub mediaLibraryServiceLegacyStub, MediaSession.ControllerInfo controllerInfo, MediaBrowserServiceCompat.Result result, String str, Bundle bundle) {
        this.f17100i = mediaLibraryServiceLegacyStub;
        this.f17101k = controllerInfo;
        this.f17102l = result;
        this.j = str;
        this.f17103m = bundle;
    }

    public RunnableC1602r0(MediaLibraryServiceLegacyStub mediaLibraryServiceLegacyStub, String str, MediaSession.ControllerInfo controllerInfo, MediaBrowserServiceCompat.Result result, Bundle bundle) {
        this.f17100i = mediaLibraryServiceLegacyStub;
        this.j = str;
        this.f17101k = controllerInfo;
        this.f17102l = result;
        this.f17103m = bundle;
    }
}
