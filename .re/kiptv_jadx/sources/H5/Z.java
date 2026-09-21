package H5;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class Z implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f4160h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p194x6.j f4161i;
    public final /* synthetic */ p194x6.j j;

    public /* synthetic */ Z(p194x6.j jVar, p194x6.j jVar2, int i3) {
        this.f4160h = i3;
        this.f4161i = jVar;
        this.j = jVar2;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        switch (this.f4160h) {
            case 0:
                p005a5.W2 entry = (p005a5.W2) obj;
                kotlin.jvm.internal.m.e(entry, "entry");
                if (entry instanceof p005a5.V2) {
                    this.f4161i.invoke(java.lang.Integer.valueOf(((com.kiptv.core.model.XtreamVODStream) ((p005a5.V2) entry).f14020a.f14349a).f20725d));
                } else {
                    if (!(entry instanceof p005a5.U2)) {
                        throw new I3.b();
                    }
                    this.j.invoke(java.lang.Integer.valueOf(((p005a5.U2) entry).f13961a.f13919a));
                }
                return p070h6.A.f22523a;
            case 1:
                return io.ktor.client.HttpClientConfig.install$lambda$3(this.f4161i, this.j, obj);
            case 2:
                return io.ktor.client.HttpClientConfig.engine$lambda$1(this.f4161i, this.j, (io.ktor.client.engine.HttpClientEngineConfig) obj);
            case 3:
                return io.ktor.client.engine.okhttp.OkHttpConfig.config$lambda$1(this.f4161i, this.j, (w8.r) obj);
            case 4:
                return java.lang.Boolean.valueOf(io.ktor.websocket.WebSocketDeflateExtension.Config.compressIf$lambda$3(this.f4161i, this.j, (io.ktor.websocket.Frame) obj));
            case 5:
                return io.ktor.websocket.WebSocketDeflateExtension.Config.configureProtocols$lambda$2(this.f4161i, this.j, (java.util.List) obj);
            case 6:
                this.f4161i.invoke(obj);
                this.j.invoke(obj);
                return p070h6.A.f22523a;
            default:
                this.f4161i.invoke(obj);
                this.j.invoke(obj);
                return p070h6.A.f22523a;
        }
    }
}
