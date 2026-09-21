package io.ktor.client.plugins;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f23338h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f23339i;

    public /* synthetic */ a(int i3, java.lang.Object obj) {
        this.f23338h = i3;
        this.f23339i = obj;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        switch (this.f23338h) {
            case 0:
                return io.ktor.client.plugins.DefaultRequestKt.defaultRequest$lambda$0((p194x6.j) this.f23339i, (io.ktor.client.plugins.DefaultRequest.DefaultRequestBuilder) obj);
            case 1:
                return io.ktor.client.plugins.DefaultResponseValidationKt.addDefaultResponseValidation$lambda$0((io.ktor.client.HttpClientConfig) this.f23339i, (io.ktor.client.plugins.HttpCallValidatorConfig) obj);
            case 2:
                return io.ktor.client.plugins.HttpRequestLifecycleKt.attachToClientEngineJob$lambda$1((S7.r) this.f23339i, (java.lang.Throwable) obj);
            case 3:
                return io.ktor.client.plugins.HttpRequestLifecycleKt.attachToClientEngineJob$lambda$2((S7.O) this.f23339i, (java.lang.Throwable) obj);
            case 4:
                return io.ktor.client.plugins.HttpRequestRetryKt.HttpRequestRetry$lambda$1$prepareRequest$lambda$0((io.ktor.client.request.HttpRequestBuilder) this.f23339i, (java.lang.Throwable) obj);
            default:
                return io.ktor.client.plugins.HttpTimeoutKt.applyRequestTimeout$lambda$2((S7.w0) this.f23339i, (java.lang.Throwable) obj);
        }
    }
}
