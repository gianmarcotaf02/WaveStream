package androidx.media3.session;

import android.view.Surface;
import androidx.media3.common.util.Consumer;
import java.util.List;

public final class G implements MediaControllerImplBase.RemoteSessionTask, Consumer {

    public final int f16887h;

    public final Object f16888i;
    public final int j;

    public final int f16889k;

    public final Object f16890l;

    public G(int i3, int i9, int i10, Object obj, Object obj2) {
        this.f16887h = i10;
        this.f16888i = obj;
        this.f16890l = obj2;
        this.j = i3;
        this.f16889k = i9;
    }

    @Override
    public void accept(Object obj) {
        ((MediaSessionStub) this.f16888i).lambda$setVideoSurfaceWithSize$61((Surface) this.f16890l, this.j, this.f16889k, (PlayerWrapper) obj);
    }

    @Override
    public void run(IMediaSession iMediaSession, int i3) {
        switch (this.f16887h) {
            case 0:
                ((MediaControllerImplBase) this.f16888i).lambda$setVideoSurfaceWithSize$80((Surface) this.f16890l, this.j, this.f16889k, iMediaSession, i3);
                break;
            default:
                ((MediaControllerImplBase) this.f16888i).lambda$replaceMediaItems$47((List) this.f16890l, this.j, this.f16889k, iMediaSession, i3);
                break;
        }
    }
}
