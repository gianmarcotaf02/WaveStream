package H3;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;

public final class C {
    public static final Object g = new Object();

    public static C f3932h;

    public static HandlerThread f3933i;

    public final HashMap f3934a = new HashMap();

    public final Context f3935b;

    public volatile Z3.d f3936c;

    public final L3.a f3937d;

    public final long f3938e;

    public final long f3939f;

    public C(Context context, Looper looper) {
        B b9 = new B(this);
        this.f3935b = context.getApplicationContext();
        Z3.d dVar = new Z3.d(looper, b9, 1);
        Looper.getMainLooper();
        this.f3936c = dVar;
        this.f3937d = L3.a.a();
        this.f3938e = 5000L;
        this.f3939f = 300000L;
    }

    public final D3.b a(z zVar, v vVar, String str) {
        D3.b bVarA;
        HashMap map = this.f3934a;
        synchronized (map) {
            try {
                A a2 = (A) map.get(zVar);
                if (a2 == null) {
                    a2 = new A(this, zVar);
                    a2.f3925h.put(vVar, vVar);
                    bVarA = a2.a(str, null);
                    map.put(zVar, a2);
                } else {
                    this.f3936c.removeMessages(0, zVar);
                    if (a2.f3925h.containsKey(vVar)) {
                        String string = zVar.toString();
                        StringBuilder sb = new StringBuilder(string.length() + 81);
                        sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                        sb.append(string);
                        throw new IllegalStateException(sb.toString());
                    }
                    a2.f3925h.put(vVar, vVar);
                    int i3 = a2.f3926i;
                    if (i3 == 1) {
                        vVar.onServiceConnected(a2.f3929m, a2.f3927k);
                    } else if (i3 == 2) {
                        bVarA = a2.a(str, null);
                    }
                    bVarA = null;
                }
                if (a2.j) {
                    return D3.b.f2095m;
                }
                if (bVarA == null) {
                    bVarA = new D3.b(-1, null, null);
                }
                return bVarA;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(String str, ServiceConnection serviceConnection, boolean z6) {
        z zVar = new z(str, z6);
        q.h(serviceConnection, "ServiceConnection must not be null");
        HashMap map = this.f3934a;
        synchronized (map) {
            try {
                A a2 = (A) map.get(zVar);
                if (a2 == null) {
                    String string = zVar.toString();
                    StringBuilder sb = new StringBuilder(string.length() + 50);
                    sb.append("Nonexistent connection status for service config: ");
                    sb.append(string);
                    throw new IllegalStateException(sb.toString());
                }
                if (!a2.f3925h.containsKey(serviceConnection)) {
                    String string2 = zVar.toString();
                    StringBuilder sb2 = new StringBuilder(string2.length() + 76);
                    sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                    sb2.append(string2);
                    throw new IllegalStateException(sb2.toString());
                }
                a2.f3925h.remove(serviceConnection);
                if (a2.f3925h.isEmpty()) {
                    this.f3936c.sendMessageDelayed(this.f3936c.obtainMessage(0, zVar), this.f3938e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
