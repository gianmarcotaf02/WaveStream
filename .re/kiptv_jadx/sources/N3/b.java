package N3;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final N3.b f7326b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public D3.j f7327a;

    static {
        N3.b bVar = new N3.b();
        bVar.f7327a = null;
        f7326b = bVar;
    }

    public static D3.j a(android.content.Context context) {
        D3.j jVar;
        N3.b bVar = f7326b;
        synchronized (bVar) {
            try {
                if (bVar.f7327a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    bVar.f7327a = new D3.j(context, (byte) 0);
                }
                jVar = bVar.f7327a;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return jVar;
    }
}
