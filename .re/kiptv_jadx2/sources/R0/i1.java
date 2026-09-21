package R0;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

public final class i1 extends ContentObserver {

    public final U7.j f8926a;

    public i1(U7.j jVar, Handler handler) {
        super(handler);
        this.f8926a = jVar;
    }

    @Override
    public final void onChange(boolean z6, Uri uri) {
        this.f8926a.mo3trySendJP2dKIU(p070h6.A.f22523a);
    }
}
