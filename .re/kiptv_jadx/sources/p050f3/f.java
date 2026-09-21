package p050f3;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final S2.a f21693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p050f3.d f21694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.util.HashMap f21695c;

    public f(android.content.Context context, p050f3.d dVar) {
        S2.a aVar = new S2.a(context);
        this.f21695c = new java.util.HashMap();
        this.f21693a = aVar;
        this.f21694b = dVar;
    }

    public final synchronized p050f3.h a(java.lang.String str) {
        if (this.f21695c.containsKey(str)) {
            return (p050f3.h) this.f21695c.get(str);
        }
        com.google.android.datatransport.cct.CctBackendFactory cctBackendFactoryC = this.f21693a.C(str);
        if (cctBackendFactoryC == null) {
            return null;
        }
        p050f3.d dVar = this.f21694b;
        p050f3.h hVarCreate = cctBackendFactoryC.create(new p050f3.b(dVar.f21688a, dVar.f21689b, dVar.f21690c, str));
        this.f21695c.put(str, hVarCreate);
        return hVarCreate;
    }
}
