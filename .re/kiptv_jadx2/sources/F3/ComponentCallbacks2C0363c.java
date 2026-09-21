package F3;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

public final class ComponentCallbacks2C0363c implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    public static final ComponentCallbacks2C0363c f3577l = new ComponentCallbacks2C0363c();

    public final AtomicBoolean f3578h = new AtomicBoolean();

    public final AtomicBoolean f3579i = new AtomicBoolean();
    public final ArrayList j = new ArrayList();

    public boolean f3580k = false;

    public final void a(boolean z6) {
        synchronized (f3577l) {
            try {
                Iterator it = this.j.iterator();
                while (it.hasNext()) {
                    Z3.d dVar = ((r) it.next()).f3620a.f3596u;
                    dVar.sendMessage(dVar.obtainMessage(1, Boolean.valueOf(z6)));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        AtomicBoolean atomicBoolean = this.f3579i;
        boolean zCompareAndSet = this.f3578h.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (zCompareAndSet) {
            a(false);
        }
    }

    @Override
    public final void onActivityResumed(Activity activity) {
        AtomicBoolean atomicBoolean = this.f3579i;
        boolean zCompareAndSet = this.f3578h.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (zCompareAndSet) {
            a(false);
        }
    }

    @Override
    public final void onTrimMemory(int i3) {
        if (i3 == 20 && this.f3578h.compareAndSet(false, true)) {
            this.f3579i.set(true);
            a(true);
        }
    }

    @Override
    public final void onLowMemory() {
    }

    @Override
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override
    public final void onActivityPaused(Activity activity) {
    }

    @Override
    public final void onActivityStarted(Activity activity) {
    }

    @Override
    public final void onActivityStopped(Activity activity) {
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
