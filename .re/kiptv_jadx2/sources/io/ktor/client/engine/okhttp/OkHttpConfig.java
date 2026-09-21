package io.ktor.client.engine.okhttp;

import H5.Z;
import androidx.media3.container.NalUnitUtil;
import io.ktor.client.engine.HttpClientEngineConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import p070h6.A;
import p194x6.j;
import w8.G;
import w8.p;
import w8.r;
import w8.s;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\rR.\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\tR$\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u001b\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010\"\u001a\u0004\u0018\u00010!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006("}, d2 = {"Lio/ktor/client/engine/okhttp/OkHttpConfig;", "Lio/ktor/client/engine/HttpClientEngineConfig;", "<init>", "()V", "Lkotlin/Function1;", "Lw8/r;", "Lh6/A;", "block", "config", "(Lx6/j;)V", "Lw8/p;", "interceptor", "addInterceptor", "(Lw8/p;)V", "addNetworkInterceptor", "Lx6/j;", "getConfig$ktor_client_okhttp", "()Lx6/j;", "setConfig$ktor_client_okhttp", "Lw8/s;", "preconfigured", "Lw8/s;", "getPreconfigured", "()Lw8/s;", "setPreconfigured", "(Lw8/s;)V", "", "clientCacheSize", "I", "getClientCacheSize", "()I", "setClientCacheSize", "(I)V", "Lw8/G;", "webSocketFactory", "Lw8/G;", "getWebSocketFactory", "()Lw8/G;", "setWebSocketFactory", "(Lw8/G;)V", "ktor-client-okhttp"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class OkHttpConfig extends HttpClientEngineConfig {
    private s preconfigured;
    private G webSocketFactory;
    private j config = new io.ktor.client.a(2);
    private int clientCacheSize = 10;

    public static final A addInterceptor$lambda$2(p interceptor, r config) {
        m.e(config, "$this$config");
        m.e(interceptor, "interceptor");
        config.f30600c.add(interceptor);
        return A.f22523a;
    }

    public static final A addNetworkInterceptor$lambda$3(p interceptor, r config) {
        m.e(config, "$this$config");
        m.e(interceptor, "interceptor");
        config.f30601d.add(interceptor);
        return A.f22523a;
    }

    public static final A config$lambda$0(r rVar) {
        m.e(rVar, "<this>");
        rVar.f30604h = false;
        rVar.f30605i = false;
        rVar.f30603f = true;
        return A.f22523a;
    }

    public static final A config$lambda$1(j jVar, j jVar2, r rVar) {
        m.e(rVar, "<this>");
        jVar.invoke(rVar);
        jVar2.invoke(rVar);
        return A.f22523a;
    }

    public final void addInterceptor(p interceptor) {
        m.e(interceptor, "interceptor");
        config(new a(interceptor, 1));
    }

    public final void addNetworkInterceptor(p interceptor) {
        m.e(interceptor, "interceptor");
        config(new a(interceptor, 0));
    }

    public final void config(j block) {
        m.e(block, "block");
        this.config = new Z(this.config, block, 3);
    }

    public final int getClientCacheSize() {
        return this.clientCacheSize;
    }

    public final j getConfig() {
        return this.config;
    }

    public final s getPreconfigured() {
        return this.preconfigured;
    }

    public final G getWebSocketFactory() {
        return this.webSocketFactory;
    }

    public final void setClientCacheSize(int i3) {
        this.clientCacheSize = i3;
    }

    public final void setConfig$ktor_client_okhttp(j jVar) {
        m.e(jVar, "<set-?>");
        this.config = jVar;
    }

    public final void setPreconfigured(s sVar) {
        this.preconfigured = sVar;
    }

    public final void setWebSocketFactory(G g) {
        this.webSocketFactory = g;
    }
}
