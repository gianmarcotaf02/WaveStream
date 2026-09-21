package R0;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

public final class P implements ComponentCallbacks2 {

    public final W0.d f8839h;

    public P(W0.d dVar) {
        this.f8839h = dVar;
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        W0.d dVar = this.f8839h;
        synchronized (dVar) {
            dVar.f10540a.c();
        }
    }

    @Override
    public final void onLowMemory() {
        W0.d dVar = this.f8839h;
        synchronized (dVar) {
            dVar.f10540a.c();
        }
    }

    @Override
    public final void onTrimMemory(int i3) {
        W0.d dVar = this.f8839h;
        synchronized (dVar) {
            dVar.f10540a.c();
        }
    }
}
