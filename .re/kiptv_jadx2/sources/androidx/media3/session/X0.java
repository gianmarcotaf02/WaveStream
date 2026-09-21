package androidx.media3.session;

import android.os.Bundle;

public final class X0 implements p068h4.j {

    public final int f16967a;

    public final MediaSession.ControllerInfo f16968b;

    public X0(MediaSession.ControllerInfo controllerInfo, int i3) {
        this.f16967a = i3;
        this.f16968b = controllerInfo;
    }

    @Override
    public final Object apply(Object obj) {
        switch (this.f16967a) {
            case 0:
                return MediaSessionStub.lambda$replaceMediaItems$55(this.f16968b, (Bundle) obj);
            case 1:
                return MediaSessionStub.lambda$addMediaItemsWithIndex$46(this.f16968b, (Bundle) obj);
            case 2:
                return MediaSessionStub.lambda$setMediaItemsWithStartIndex$36(this.f16968b, (Bundle) obj);
            case 3:
                return MediaSessionStub.lambda$addMediaItems$43(this.f16968b, (Bundle) obj);
            default:
                return MediaSessionStub.lambda$setMediaItemsWithResetPosition$34(this.f16968b, (Bundle) obj);
        }
    }
}
