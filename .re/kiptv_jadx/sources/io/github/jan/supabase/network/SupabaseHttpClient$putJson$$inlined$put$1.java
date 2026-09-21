package io.github.jan.supabase.network;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
public final class SupabaseHttpClient$putJson$$inlined$put$1 implements p194x6.j {
    final /* synthetic */ java.lang.Object $body;
    final /* synthetic */ p194x6.j $builder;
    final /* synthetic */ io.ktor.http.ContentType $contentType;

    public SupabaseHttpClient$putJson$$inlined$put$1(p194x6.j jVar, io.ktor.http.ContentType contentType, java.lang.Object obj) {
        this.$builder = jVar;
        this.$contentType = contentType;
        this.$body = obj;
    }

    @Override // p194x6.j
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
        invoke((io.ktor.client.request.HttpRequestBuilder) obj);
        return p070h6.A.f22523a;
    }

    public final void invoke(io.ktor.client.request.HttpRequestBuilder request) {
        kotlin.jvm.internal.m.e(request, "$this$request");
        request.setMethod(io.ktor.http.HttpMethod.INSTANCE.getPut());
        this.$builder.invoke(request);
        io.ktor.http.HttpMessagePropertiesKt.contentType(request, this.$contentType);
        java.lang.Object obj = this.$body;
        if (obj == null) {
            request.setBody(io.ktor.http.content.NullBody.INSTANCE);
            kotlin.jvm.internal.m.j();
            throw null;
        }
        if (obj instanceof io.ktor.http.content.OutgoingContent) {
            request.setBody(obj);
            request.setBodyType(null);
        } else {
            request.setBody(obj);
            kotlin.jvm.internal.m.j();
            throw null;
        }
    }
}
