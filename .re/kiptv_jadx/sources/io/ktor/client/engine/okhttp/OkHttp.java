package io.ktor.client.engine.okhttp;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J#\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lio/ktor/client/engine/okhttp/OkHttp;", "Lio/ktor/client/engine/HttpClientEngineFactory;", "Lio/ktor/client/engine/okhttp/OkHttpConfig;", "<init>", "()V", "Lkotlin/Function1;", "Lh6/A;", "block", "Lio/ktor/client/engine/HttpClientEngine;", "create", "(Lx6/j;)Lio/ktor/client/engine/HttpClientEngine;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", io.sentry.protocol.Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "ktor-client-okhttp"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final /* data */ class OkHttp implements io.ktor.client.engine.HttpClientEngineFactory<io.ktor.client.engine.okhttp.OkHttpConfig> {
    public static final io.ktor.client.engine.okhttp.OkHttp INSTANCE = new io.ktor.client.engine.okhttp.OkHttp();

    private OkHttp() {
    }

    @Override // io.ktor.client.engine.HttpClientEngineFactory
    public io.ktor.client.engine.HttpClientEngine create(p194x6.j block) {
        kotlin.jvm.internal.m.e(block, "block");
        io.ktor.client.engine.okhttp.OkHttpConfig okHttpConfig = new io.ktor.client.engine.okhttp.OkHttpConfig();
        block.invoke(okHttpConfig);
        return new io.ktor.client.engine.okhttp.OkHttpEngine(okHttpConfig);
    }

    public boolean equals(java.lang.Object other) {
        return this == other || (other instanceof io.ktor.client.engine.okhttp.OkHttp);
    }

    public int hashCode() {
        return -1133440277;
    }

    public java.lang.String toString() {
        return "OkHttp";
    }
}
