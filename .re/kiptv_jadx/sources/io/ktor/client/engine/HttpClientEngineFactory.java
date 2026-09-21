package io.ktor.client.engine;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\u00020\u0003J%\u0010\b\u001a\u00020\u00072\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004H&¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lio/ktor/client/engine/HttpClientEngineFactory;", "Lio/ktor/client/engine/HttpClientEngineConfig;", "T", "", "Lkotlin/Function1;", "Lh6/A;", "block", "Lio/ktor/client/engine/HttpClientEngine;", "create", "(Lx6/j;)Lio/ktor/client/engine/HttpClientEngine;", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public interface HttpClientEngineFactory<T extends io.ktor.client.engine.HttpClientEngineConfig> {

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class DefaultImpls {
        public static /* synthetic */ io.ktor.client.engine.HttpClientEngine create$default(io.ktor.client.engine.HttpClientEngineFactory httpClientEngineFactory, p194x6.j jVar, int i3, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: create");
            }
            if ((i3 & 1) != 0) {
                jVar = new io.ktor.client.a(1);
            }
            return httpClientEngineFactory.create(jVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static p070h6.A create$lambda$0(io.ktor.client.engine.HttpClientEngineConfig httpClientEngineConfig) {
            kotlin.jvm.internal.m.e(httpClientEngineConfig, "<this>");
            return p070h6.A.f22523a;
        }
    }

    io.ktor.client.engine.HttpClientEngine create(p194x6.j block);
}
