package io.ktor.client.plugins.cookies;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p117n6.e(c = "io.ktor.client.plugins.cookies.HttpCookies", f = "HttpCookies.kt", l = {82}, m = "saveCookiesFrom$ktor_client_core")
public final class HttpCookies$saveCookiesFrom$1 extends p117n6.c {
    java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ io.ktor.client.plugins.cookies.HttpCookies this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpCookies$saveCookiesFrom$1(io.ktor.client.plugins.cookies.HttpCookies httpCookies, p100l6.c cVar) {
        super(cVar);
        this.this$0 = httpCookies;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.saveCookiesFrom$ktor_client_core(null, this);
    }
}
