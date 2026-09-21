package H3;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;

public final class A implements ServiceConnection {

    public final HashMap f3925h;

    public int f3926i;
    public boolean j;

    public IBinder f3927k;

    public final z f3928l;

    public ComponentName f3929m;

    public final C f3930n;

    public A(C c9, z zVar) {
        Objects.requireNonNull(c9);
        this.f3930n = c9;
        this.f3928l = zVar;
        this.f3925h = new HashMap();
        this.f3926i = 2;
    }

    public final D3.b a(String str, Executor executor) throws Throwable {
        try {
            Intent intentA = s.a(this.f3930n.f3935b, this.f3928l);
            this.f3926i = 3;
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            if (Build.VERSION.SDK_INT >= 31) {
                StrictMode.setVmPolicy(M3.b.a(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
            }
            try {
                C c9 = this.f3930n;
                L3.a aVar = c9.f3937d;
                Context context = c9.f3935b;
                z zVar = this.f3928l;
                try {
                    boolean zC = aVar.c(context, str, intentA, this, 4225, executor);
                    this.j = zC;
                    if (zC) {
                        c9.f3936c.sendMessageDelayed(c9.f3936c.obtainMessage(1, zVar), c9.f3939f);
                        D3.b bVar = D3.b.f2095m;
                        StrictMode.setVmPolicy(vmPolicy);
                        return bVar;
                    }
                    this.f3926i = 2;
                    try {
                        c9.f3937d.b(c9.f3935b, this);
                    } catch (IllegalArgumentException unused) {
                    }
                    D3.b bVar2 = new D3.b(16, null, null);
                    StrictMode.setVmPolicy(vmPolicy);
                    return bVar2;
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    StrictMode.setVmPolicy(vmPolicy);
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (r e6) {
            return e6.f4003h;
        }
    }

    @Override
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C c9 = this.f3930n;
        synchronized (c9.f3934a) {
            try {
                c9.f3936c.removeMessages(1, this.f3928l);
                this.f3927k = iBinder;
                this.f3929m = componentName;
                Iterator it = this.f3925h.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.f3926i = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        C c9 = this.f3930n;
        synchronized (c9.f3934a) {
            try {
                c9.f3936c.removeMessages(1, this.f3928l);
                this.f3927k = null;
                this.f3929m = componentName;
                Iterator it = this.f3925h.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.f3926i = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
