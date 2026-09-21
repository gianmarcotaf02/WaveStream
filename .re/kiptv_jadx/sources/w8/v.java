package w8;

/* JADX INFO: loaded from: classes4.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w8.o f30659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f30660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w8.m f30661c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w8.z f30662d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.util.Map f30663e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public w8.C3023c f30664f;

    public v(w8.o url, java.lang.String method, w8.m mVar, w8.z zVar, java.util.Map map) {
        kotlin.jvm.internal.m.e(url, "url");
        kotlin.jvm.internal.m.e(method, "method");
        this.f30659a = url;
        this.f30660b = method;
        this.f30661c = mVar;
        this.f30662d = zVar;
        this.f30663e = map;
    }

    public final w8.u a() {
        w8.u uVar = new w8.u();
        uVar.f30658e = new java.util.LinkedHashMap();
        uVar.f30654a = this.f30659a;
        uVar.f30655b = this.f30660b;
        uVar.f30657d = this.f30662d;
        java.util.Map map = this.f30663e;
        uVar.f30658e = map.isEmpty() ? new java.util.LinkedHashMap() : p078i6.C.Z0(map);
        uVar.f30656c = this.f30661c.n();
        return uVar;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Request{method=");
        sb.append(this.f30660b);
        sb.append(", url=");
        sb.append(this.f30659a);
        w8.m mVar = this.f30661c;
        if (mVar.size() != 0) {
            sb.append(", headers=[");
            int i3 = 0;
            for (java.lang.Object obj : mVar) {
                int i9 = i3 + 1;
                if (i3 < 0) {
                    p078i6.p.H0();
                    throw null;
                }
                p070h6.k kVar = (p070h6.k) obj;
                java.lang.String str = (java.lang.String) kVar.f22539h;
                java.lang.String str2 = (java.lang.String) kVar.f22540i;
                if (i3 > 0) {
                    sb.append(", ");
                }
                sb.append(str);
                sb.append(':');
                sb.append(str2);
                i3 = i9;
            }
            sb.append(']');
        }
        java.util.Map map = this.f30663e;
        if (!map.isEmpty()) {
            sb.append(", tags=");
            sb.append(map);
        }
        sb.append('}');
        java.lang.String string = sb.toString();
        kotlin.jvm.internal.m.d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
