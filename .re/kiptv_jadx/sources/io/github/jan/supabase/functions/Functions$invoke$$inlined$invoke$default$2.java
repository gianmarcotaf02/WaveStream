package io.github.jan.supabase.functions;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
public final class Functions$invoke$$inlined$invoke$default$2 implements p194x6.j {
    final /* synthetic */ io.ktor.http.Headers $headers$inlined;
    final /* synthetic */ io.github.jan.supabase.functions.FunctionRegion $region$inlined;
    final /* synthetic */ io.github.jan.supabase.functions.FunctionRegion $region$inlined$1;

    public Functions$invoke$$inlined$invoke$default$2(io.github.jan.supabase.functions.FunctionRegion functionRegion, io.ktor.http.Headers headers, io.github.jan.supabase.functions.FunctionRegion functionRegion2) {
        this.$region$inlined = functionRegion;
        this.$headers$inlined = headers;
        this.$region$inlined$1 = functionRegion2;
    }

    @Override // p194x6.j
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
        invoke((io.ktor.client.request.HttpRequestBuilder) obj);
        return p070h6.A.f22523a;
    }

    public final void invoke(io.ktor.client.request.HttpRequestBuilder request) {
        kotlin.jvm.internal.m.e(request, "$this$request");
        request.setMethod(io.ktor.http.HttpMethod.INSTANCE.getPost());
        request.getHeaders().appendAll(this.$headers$inlined);
        io.ktor.client.request.UtilsKt.header(request, "x-region", this.$region$inlined$1.getValue());
        io.ktor.client.request.UtilsKt.header(request, "x-region", this.$region$inlined.getValue());
    }
}
