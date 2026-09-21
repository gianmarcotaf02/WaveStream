package H3;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.util.Objects;

public final class B implements Handler.Callback {

    public final C f3931h;

    public B(C c9) {
        Objects.requireNonNull(c9);
        this.f3931h = c9;
    }

    @Override
    public final boolean handleMessage(Message message) {
        int i3 = message.what;
        if (i3 == 0) {
            C c9 = this.f3931h;
            synchronized (c9.f3934a) {
                try {
                    z zVar = (z) message.obj;
                    A a2 = (A) c9.f3934a.get(zVar);
                    if (a2 != null && a2.f3925h.isEmpty()) {
                        if (a2.j) {
                            z zVar2 = a2.f3928l;
                            C c10 = a2.f3930n;
                            c10.f3936c.removeMessages(1, zVar2);
                            c10.f3937d.b(c10.f3935b, a2);
                            a2.j = false;
                            a2.f3926i = 2;
                        }
                        c9.f3934a.remove(zVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return true;
        }
        if (i3 != 1) {
            return false;
        }
        C c11 = this.f3931h;
        synchronized (c11.f3934a) {
            try {
                z zVar3 = (z) message.obj;
                A a9 = (A) c11.f3934a.get(zVar3);
                if (a9 != null && a9.f3926i == 3) {
                    String strValueOf = String.valueOf(zVar3);
                    StringBuilder sb = new StringBuilder(strValueOf.length() + 47);
                    sb.append("Timeout waiting for ServiceConnection callback ");
                    sb.append(strValueOf);
                    Log.e("GmsClientSupervisor", sb.toString(), new Exception());
                    ComponentName componentName = a9.f3929m;
                    if (componentName == null) {
                        zVar3.getClass();
                        componentName = null;
                    }
                    if (componentName == null) {
                        String str = zVar3.f4015b;
                        q.g(str);
                        componentName = new ComponentName(str, "unknown");
                    }
                    a9.onServiceDisconnected(componentName);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return true;
    }
}
