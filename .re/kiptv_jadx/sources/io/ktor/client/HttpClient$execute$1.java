package io.ktor.client;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p117n6.e(c = "io.ktor.client.HttpClient", f = "HttpClient.kt", l = {1415}, m = "execute$ktor_client_core")
public final class HttpClient$execute$1 extends p117n6.c {
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ io.ktor.client.HttpClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpClient$execute$1(io.ktor.client.HttpClient httpClient, p100l6.c cVar) {
        super(cVar);
        this.this$0 = httpClient;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.execute$ktor_client_core(null, this);
    }
}
