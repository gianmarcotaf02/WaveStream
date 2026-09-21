package H3;

/* JADX INFO: loaded from: classes.dex */
public final class C {
    public static final java.lang.Object g = new java.lang.Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static H3.C f3932h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static android.os.HandlerThread f3933i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f3934a = new java.util.HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final android.content.Context f3935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile Z3.d f3936c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final L3.a f3937d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f3938e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f3939f;

    public C(android.content.Context context, android.os.Looper looper) {
        H3.B b9 = new H3.B(this);
        this.f3935b = context.getApplicationContext();
        Z3.d dVar = new Z3.d(looper, b9, 1);
        android.os.Looper.getMainLooper();
        this.f3936c = dVar;
        this.f3937d = L3.a.a();
        this.f3938e = 5000L;
        this.f3939f = 300000L;
    }

    public final D3.b a(H3.z zVar, H3.v vVar, java.lang.String str) {
        D3.b bVarA;
        java.util.HashMap map = this.f3934a;
        synchronized (map) {
            try {
                H3.A a2 = (H3.A) map.get(zVar);
                if (a2 == null) {
                    a2 = new H3.A(this, zVar);
                    a2.f3925h.put(vVar, vVar);
                    bVarA = a2.a(str, null);
                    map.put(zVar, a2);
                } else {
                    this.f3936c.removeMessages(0, zVar);
                    if (a2.f3925h.containsKey(vVar)) {
                        java.lang.String string = zVar.toString();
                        java.lang.StringBuilder sb = new java.lang.StringBuilder(string.length() + 81);
                        sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                        sb.append(string);
                        throw new java.lang.IllegalStateException(sb.toString());
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
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final void b(java.lang.String str, android.content.ServiceConnection serviceConnection, boolean z6) {
        H3.z zVar = new H3.z(str, z6);
        H3.q.h(serviceConnection, "ServiceConnection must not be null");
        java.util.HashMap map = this.f3934a;
        synchronized (map) {
            try {
                H3.A a2 = (H3.A) map.get(zVar);
                if (a2 == null) {
                    java.lang.String string = zVar.toString();
                    java.lang.StringBuilder sb = new java.lang.StringBuilder(string.length() + 50);
                    sb.append("Nonexistent connection status for service config: ");
                    sb.append(string);
                    throw new java.lang.IllegalStateException(sb.toString());
                }
                if (!a2.f3925h.containsKey(serviceConnection)) {
                    java.lang.String string2 = zVar.toString();
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder(string2.length() + 76);
                    sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                    sb2.append(string2);
                    throw new java.lang.IllegalStateException(sb2.toString());
                }
                a2.f3925h.remove(serviceConnection);
                if (a2.f3925h.isEmpty()) {
                    this.f3936c.sendMessageDelayed(this.f3936c.obtainMessage(0, zVar), this.f3938e);
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }
}
