package K8;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends z8.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ K8.g f6985e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f6986f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(java.lang.String str, K8.g gVar, long j) {
        super(str, true);
        this.f6985e = gVar;
        this.f6986f = j;
    }

    @Override // z8.a
    public final long a() {
        K8.j jVar;
        K8.g gVar = this.f6985e;
        synchronized (gVar) {
            try {
                if (!gVar.f7005t && (jVar = gVar.j) != null) {
                    int i3 = gVar.f7007v ? gVar.f7006u : -1;
                    gVar.f7006u++;
                    gVar.f7007v = true;
                    if (i3 != -1) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("sent ping but didn't receive pong within ");
                        sb.append(gVar.f6990c);
                        sb.append("ms (after ");
                        gVar.c(new java.net.SocketTimeoutException(Y6.f.k(sb, i3 - 1, " successful ping/pongs)")), null);
                    } else {
                        try {
                            M8.C0685m payload = M8.C0685m.f7261k;
                            kotlin.jvm.internal.m.e(payload, "payload");
                            jVar.b(9, payload);
                        } catch (java.io.IOException e6) {
                            gVar.c(e6, null);
                        }
                    }
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return this.f6986f;
    }
}
