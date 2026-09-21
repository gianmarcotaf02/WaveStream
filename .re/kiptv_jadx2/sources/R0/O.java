package R0;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;

public final class O implements ComponentCallbacks2 {

    public final Configuration f8835h;

    public final W0.c f8836i;

    public O(Configuration configuration, W0.c cVar) {
        this.f8835h = configuration;
        this.f8836i = cVar;
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        Configuration configuration2 = this.f8835h;
        int iUpdateFrom = configuration2.updateFrom(configuration);
        Iterator it = this.f8836i.f10539a.entrySet().iterator();
        while (it.hasNext()) {
            W0.a aVar = (W0.a) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
            if (aVar == null || Configuration.needNewResources(iUpdateFrom, aVar.f10536b)) {
                it.remove();
            }
        }
        configuration2.setTo(configuration);
    }

    @Override
    public final void onLowMemory() {
        this.f8836i.f10539a.clear();
    }

    @Override
    public final void onTrimMemory(int i3) {
        this.f8836i.f10539a.clear();
    }
}
