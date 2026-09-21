package io.ktor.client.engine.okhttp;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\rR.\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\tR$\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u001b\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010\"\u001a\u0004\u0018\u00010!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006("}, d2 = {"Lio/ktor/client/engine/okhttp/OkHttpConfig;", "Lio/ktor/client/engine/HttpClientEngineConfig;", "<init>", "()V", "Lkotlin/Function1;", "Lw8/r;", "Lh6/A;", "block", "config", "(Lx6/j;)V", "Lw8/p;", "interceptor", "addInterceptor", "(Lw8/p;)V", "addNetworkInterceptor", "Lx6/j;", "getConfig$ktor_client_okhttp", "()Lx6/j;", "setConfig$ktor_client_okhttp", "Lw8/s;", "preconfigured", "Lw8/s;", "getPreconfigured", "()Lw8/s;", "setPreconfigured", "(Lw8/s;)V", "", "clientCacheSize", "I", "getClientCacheSize", "()I", "setClientCacheSize", "(I)V", "Lw8/G;", "webSocketFactory", "Lw8/G;", "getWebSocketFactory", "()Lw8/G;", "setWebSocketFactory", "(Lw8/G;)V", "ktor-client-okhttp"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class OkHttpConfig extends io.ktor.client.engine.HttpClientEngineConfig {
    private w8.s preconfigured;
    private w8.G webSocketFactory;
    private p194x6.j config = new io.ktor.client.a(2);
    private int clientCacheSize = 10;

    /* JADX INFO: Access modifiers changed from: private */
    public static final p070h6.A addInterceptor$lambda$2(w8.p interceptor, w8.r config) {
        kotlin.jvm.internal.m.e(config, "$this$config");
        kotlin.jvm.internal.m.e(interceptor, "interceptor");
        config.f30600c.add(interceptor);
        return p070h6.A.f22523a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p070h6.A addNetworkInterceptor$lambda$3(w8.p interceptor, w8.r config) {
        kotlin.jvm.internal.m.e(config, "$this$config");
        kotlin.jvm.internal.m.e(interceptor, "interceptor");
        config.f30601d.add(interceptor);
        return p070h6.A.f22523a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p070h6.A config$lambda$0(w8.r rVar) {
        kotlin.jvm.internal.m.e(rVar, "<this>");
        rVar.f30604h = false;
        rVar.f30605i = false;
        rVar.f30603f = true;
        return p070h6.A.f22523a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p070h6.A config$lambda$1(p194x6.j jVar, p194x6.j jVar2, w8.r rVar) {
        kotlin.jvm.internal.m.e(rVar, "<this>");
        jVar.invoke(rVar);
        jVar2.invoke(rVar);
        return p070h6.A.f22523a;
    }

    public final void addInterceptor(w8.p interceptor) {
        kotlin.jvm.internal.m.e(interceptor, "interceptor");
        config(new io.ktor.client.engine.okhttp.a(interceptor, 1));
    }

    public final void addNetworkInterceptor(w8.p interceptor) {
        kotlin.jvm.internal.m.e(interceptor, "interceptor");
        config(new io.ktor.client.engine.okhttp.a(interceptor, 0));
    }

    public final void config(p194x6.j block) {
        kotlin.jvm.internal.m.e(block, "block");
        this.config = new H5.Z(this.config, block, 3);
    }

    public final int getClientCacheSize() {
        return this.clientCacheSize;
    }

    /* JADX INFO: renamed from: getConfig$ktor_client_okhttp, reason: from getter */
    public final p194x6.j getConfig() {
        return this.config;
    }

    public final w8.s getPreconfigured() {
        return this.preconfigured;
    }

    public final w8.G getWebSocketFactory() {
        return this.webSocketFactory;
    }

    public final void setClientCacheSize(int i3) {
        this.clientCacheSize = i3;
    }

    public final void setConfig$ktor_client_okhttp(p194x6.j jVar) {
        kotlin.jvm.internal.m.e(jVar, "<set-?>");
        this.config = jVar;
    }

    public final void setPreconfigured(w8.s sVar) {
        this.preconfigured = sVar;
    }

    public final void setWebSocketFactory(w8.G g) {
        this.webSocketFactory = g;
    }
}
