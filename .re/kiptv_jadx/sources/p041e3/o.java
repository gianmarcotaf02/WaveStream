package p041e3;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile p041e3.j f21408e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final V1.b f21409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final V1.b f21410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p083j3.c f21411c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k3.i f21412d;

    public o(V1.b bVar, V1.b bVar2, p083j3.c cVar, k3.i iVar, k3.k kVar) {
        this.f21409a = bVar;
        this.f21410b = bVar2;
        this.f21411c = cVar;
        this.f21412d = iVar;
        kVar.getClass();
        kVar.f24473a.execute(new D1.RunnableC0239y(25, kVar));
    }

    public static p041e3.o a() {
        p041e3.j jVar = f21408e;
        if (jVar != null) {
            return (p041e3.o) jVar.f21402m.get();
        }
        throw new java.lang.IllegalStateException("Not initialized!");
    }

    public static void b(android.content.Context context) {
        if (f21408e == null) {
            synchronized (p041e3.o.class) {
                try {
                    if (f21408e == null) {
                        D3.j jVar = new D3.j();
                        context.getClass();
                        jVar.f2115a = context;
                        f21408e = jVar.b();
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final android.support.v4.media.session.q c(p023c3.a aVar) {
        byte[] bytes;
        java.util.Set setUnmodifiableSet = aVar != null ? java.util.Collections.unmodifiableSet(p023c3.a.f18494d) : java.util.Collections.singleton(new p013b3.b("proto"));
        android.support.v4.media.session.q qVarA = p041e3.i.a();
        aVar.getClass();
        qVarA.f15617i = "cct";
        java.lang.String str = aVar.f18496a;
        java.lang.String str2 = aVar.f18497b;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            if (str2 == null) {
                str2 = "";
            }
            bytes = B2.a.m("1$", str, "\\", str2).getBytes(java.nio.charset.Charset.forName("UTF-8"));
        }
        qVarA.j = bytes;
        return new android.support.v4.media.session.q(setUnmodifiableSet, qVarA.j(), this, 24);
    }
}
