package io.github.jan.supabase.functions;

import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.request.UtilsKt;
import io.ktor.http.HttpMethod;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import p070h6.A;
import p194x6.j;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
public final class Functions$invoke$$inlined$post$1 implements j {
    final j $builder$inlined;
    final FunctionRegion $region$inlined;

    public Functions$invoke$$inlined$post$1(j jVar, FunctionRegion functionRegion) {
        this.$builder$inlined = jVar;
        this.$region$inlined = functionRegion;
    }

    @Override
    public Object invoke(Object obj) {
        invoke((HttpRequestBuilder) obj);
        return A.f22523a;
    }

    public final void invoke(HttpRequestBuilder request) {
        m.e(request, "$this$request");
        request.setMethod(HttpMethod.INSTANCE.getPost());
        this.$builder$inlined.invoke(request);
        UtilsKt.header(request, "x-region", this.$region$inlined.getValue());
    }
}
