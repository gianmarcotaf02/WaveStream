package H3;

/* JADX INFO: loaded from: classes.dex */
public final class B implements android.os.Handler.Callback {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ H3.C f3931h;

    public /* synthetic */ B(H3.C c9) {
        java.util.Objects.requireNonNull(c9);
        this.f3931h = c9;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message message) {
        int i3 = message.what;
        if (i3 == 0) {
            H3.C c9 = this.f3931h;
            synchronized (c9.f3934a) {
                try {
                    H3.z zVar = (H3.z) message.obj;
                    H3.A a2 = (H3.A) c9.f3934a.get(zVar);
                    if (a2 != null && a2.f3925h.isEmpty()) {
                        if (a2.j) {
                            H3.z zVar2 = a2.f3928l;
                            H3.C c10 = a2.f3930n;
                            c10.f3936c.removeMessages(1, zVar2);
                            c10.f3937d.b(c10.f3935b, a2);
                            a2.j = false;
                            a2.f3926i = 2;
                        }
                        c9.f3934a.remove(zVar);
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
            return true;
        }
        if (i3 != 1) {
            return false;
        }
        H3.C c11 = this.f3931h;
        synchronized (c11.f3934a) {
            try {
                H3.z zVar3 = (H3.z) message.obj;
                H3.A a9 = (H3.A) c11.f3934a.get(zVar3);
                if (a9 != null && a9.f3926i == 3) {
                    java.lang.String strValueOf = java.lang.String.valueOf(zVar3);
                    java.lang.StringBuilder sb = new java.lang.StringBuilder(strValueOf.length() + 47);
                    sb.append("Timeout waiting for ServiceConnection callback ");
                    sb.append(strValueOf);
                    android.util.Log.e("GmsClientSupervisor", sb.toString(), new java.lang.Exception());
                    android.content.ComponentName componentName = a9.f3929m;
                    if (componentName == null) {
                        zVar3.getClass();
                        componentName = null;
                    }
                    if (componentName == null) {
                        java.lang.String str = zVar3.f4015b;
                        H3.q.g(str);
                        componentName = new android.content.ComponentName(str, "unknown");
                    }
                    a9.onServiceDisconnected(componentName);
                }
            } catch (java.lang.Throwable th2) {
                throw th2;
            }
        }
        return true;
    }
}
