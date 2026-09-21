package io.ktor.client.plugins;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p117n6.e(c = "io.ktor.client.plugins.HttpCallValidatorKt", f = "HttpCallValidator.kt", l = {110}, m = "HttpCallValidator$lambda$2$validateResponse")
public final class HttpCallValidatorKt$HttpCallValidator$2$validateResponse$1 extends p117n6.c {
    java.lang.Object L$0;
    java.lang.Object L$1;
    int label;
    /* synthetic */ java.lang.Object result;

    public HttpCallValidatorKt$HttpCallValidator$2$validateResponse$1(p100l6.c cVar) {
        super(cVar);
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return io.ktor.client.plugins.HttpCallValidatorKt.HttpCallValidator$lambda$2$validateResponse(null, null, this);
    }
}
