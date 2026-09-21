package p105m2;

import Z3.d;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import k3.h;
import p007a7.z;
import p008a8.c;

public final class Y extends AbstractC2622u implements ServiceConnection {

    public static final int f25255x = 0;

    public final ComponentName f25256p;

    public final d f25257q;

    public final ArrayList f25258r;

    public boolean f25259s;

    public boolean f25260t;

    public T f25261u;

    public boolean f25262v;

    public h f25263w;

    static {
        Log.isLoggable("MediaRouteProviderProxy", 3);
    }

    public Y(Context context, ComponentName componentName) {
        super(context, new c(14, componentName));
        this.f25258r = new ArrayList();
        this.f25256p = componentName;
        this.f25257q = new d();
    }

    @Override
    public final AbstractC2620s c(String str) {
        if (str == null) {
            throw new IllegalArgumentException("initialMemberRouteId cannot be null.");
        }
        z zVar = this.f25368n;
        if (zVar == null) {
            return null;
        }
        List list = zVar.f15517b;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (((C2617o) list.get(i3)).d().equals(str)) {
                W w6 = new W(this, str);
                this.f25258r.add(w6);
                if (this.f25262v) {
                    w6.a(this.f25261u);
                }
                m();
                return w6;
            }
        }
        return null;
    }

    @Override
    public final AbstractC2621t d(String str) {
        if (str != null) {
            return j(str, null);
        }
        throw new IllegalArgumentException("routeId cannot be null");
    }

    @Override
    public final AbstractC2621t e(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("routeId cannot be null");
        }
        if (str2 != null) {
            return j(str, str2);
        }
        throw new IllegalArgumentException("routeGroupId cannot be null");
    }

    @Override
    public final void f(C2618p c2618p) {
        if (this.f25262v) {
            T t9 = this.f25261u;
            int i3 = t9.f25237d;
            t9.f25237d = i3 + 1;
            t9.b(10, i3, 0, c2618p != null ? c2618p.f25350a : null, null);
        }
        m();
    }

    public final void i() {
        if (this.f25260t) {
            return;
        }
        Intent intent = new Intent("android.media.MediaRouteProviderService");
        intent.setComponent(this.f25256p);
        try {
            this.f25260t = this.f25363h.bindService(intent, this, Build.VERSION.SDK_INT >= 29 ? 4097 : 1);
        } catch (SecurityException unused) {
        }
    }

    public final X j(String str, String str2) {
        z zVar = this.f25368n;
        if (zVar == null) {
            return null;
        }
        List list = zVar.f15517b;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (((C2617o) list.get(i3)).d().equals(str)) {
                X x9 = new X(this, str, str2);
                this.f25258r.add(x9);
                if (this.f25262v) {
                    x9.a(this.f25261u);
                }
                m();
                return x9;
            }
        }
        return null;
    }

    public final void k() {
        if (this.f25261u != null) {
            g(null);
            this.f25262v = false;
            ArrayList arrayList = this.f25258r;
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((U) arrayList.get(i3)).c();
            }
            T t9 = this.f25261u;
            t9.b(2, 0, 0, null, null);
            t9.f25235b.f22615b.clear();
            t9.f25234a.getBinder().unlinkToDeath(t9, 0);
            t9.f25241i.f25257q.post(new S(t9, 0));
            this.f25261u = null;
        }
    }

    public final void l() {
        if (this.f25260t) {
            this.f25260t = false;
            k();
            try {
                this.f25363h.unbindService(this);
            } catch (IllegalArgumentException e6) {
                Log.e("MediaRouteProviderProxy", this + ": unbindService failed", e6);
            }
        }
    }

    public final void m() {
        if (!this.f25259s || (this.f25366l == null && this.f25258r.isEmpty())) {
            l();
        } else {
            i();
        }
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (this.f25260t) {
            k();
            Messenger messenger = iBinder != null ? new Messenger(iBinder) : null;
            if (messenger != null) {
                try {
                    if (messenger.getBinder() != null) {
                        T t9 = new T(this, messenger);
                        int i3 = t9.f25237d;
                        t9.f25237d = i3 + 1;
                        t9.g = i3;
                        if (t9.b(1, i3, 4, null, null)) {
                            try {
                                t9.f25234a.getBinder().linkToDeath(t9, 0);
                                this.f25261u = t9;
                                return;
                            } catch (RemoteException unused) {
                                t9.binderDied();
                                return;
                            }
                        }
                        return;
                    }
                } catch (NullPointerException unused2) {
                }
            }
            Log.e("MediaRouteProviderProxy", this + ": Service returned invalid messenger binder");
        }
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        k();
    }

    public final String toString() {
        return "Service connection " + this.f25256p.flattenToShortString();
    }
}
