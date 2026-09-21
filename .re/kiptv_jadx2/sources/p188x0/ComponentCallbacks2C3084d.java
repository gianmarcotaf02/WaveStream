package p188x0;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

public final class ComponentCallbacks2C3084d implements ComponentCallbacks2 {

    public final C3085e f31101h;

    public ComponentCallbacks2C3084d(C3085e c3085e) {
        this.f31101h = c3085e;
    }

    @Override
    public final void onTrimMemory(int i3) {
        if (i3 >= 40) {
            this.f31101h.getClass();
        }
    }

    @Override
    public final void onLowMemory() {
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
    }
}
