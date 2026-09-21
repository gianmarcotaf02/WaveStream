package io.github.jan.supabase.functions;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
public final class Functions$invoke$$inlined$post$1 implements p194x6.j {
    final /* synthetic */ p194x6.j $builder$inlined;
    final /* synthetic */ io.github.jan.supabase.functions.FunctionRegion $region$inlined;

    public Functions$invoke$$inlined$post$1(p194x6.j jVar, io.github.jan.supabase.functions.FunctionRegion functionRegion) {
        this.$builder$inlined = jVar;
        this.$region$inlined = functionRegion;
    }

    @Override // p194x6.j
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
        invoke((io.ktor.client.request.HttpRequestBuilder) obj);
        return p070h6.A.f22523a;
    }

    public final void invoke(io.ktor.client.request.HttpRequestBuilder request) {
        kotlin.jvm.internal.m.e(request, "$this$request");
        request.setMethod(io.ktor.http.HttpMethod.INSTANCE.getPost());
        this.$builder$inlined.invoke(request);
        io.ktor.client.request.UtilsKt.header(request, "x-region", this.$region$inlined.getValue());
    }
}
