package io.ktor.client.plugins.observer;

/* JADX INFO: loaded from: classes4.dex */
@io.ktor.utils.io.KtorDsl
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\n\u001a\u00020\u00072&\u0010\t\u001a\"\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004j\u0002`\b¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000f\u001a\u00020\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0004\b\u000f\u0010\u0010RB\u0010\u0011\u001a\"\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004j\u0002`\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u000bR0\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u0010¨\u0006\u001a"}, d2 = {"Lio/ktor/client/plugins/observer/ResponseObserverConfig;", "", "<init>", "()V", "Lkotlin/Function2;", "Lio/ktor/client/statement/HttpResponse;", "Ll6/c;", "Lh6/A;", "Lio/ktor/client/plugins/observer/ResponseHandler;", "block", "onResponse", "(Lx6/m;)V", "Lkotlin/Function1;", "Lio/ktor/client/call/HttpClientCall;", "", "filter", "(Lx6/j;)V", "responseHandler", "Lx6/m;", "getResponseHandler$ktor_client_core", "()Lx6/m;", "setResponseHandler$ktor_client_core", "Lx6/j;", "getFilter$ktor_client_core", "()Lx6/j;", "setFilter$ktor_client_core", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class ResponseObserverConfig {
    private p194x6.j filter;
    private p194x6.m responseHandler = new io.ktor.client.plugins.observer.ResponseObserverConfig$responseHandler$1(null);

    public final void filter(p194x6.j block) {
        kotlin.jvm.internal.m.e(block, "block");
        this.filter = block;
    }

    /* JADX INFO: renamed from: getFilter$ktor_client_core, reason: from getter */
    public final p194x6.j getFilter() {
        return this.filter;
    }

    /* JADX INFO: renamed from: getResponseHandler$ktor_client_core, reason: from getter */
    public final p194x6.m getResponseHandler() {
        return this.responseHandler;
    }

    public final void onResponse(p194x6.m block) {
        kotlin.jvm.internal.m.e(block, "block");
        this.responseHandler = block;
    }

    public final void setFilter$ktor_client_core(p194x6.j jVar) {
        this.filter = jVar;
    }

    public final void setResponseHandler$ktor_client_core(p194x6.m mVar) {
        kotlin.jvm.internal.m.e(mVar, "<set-?>");
        this.responseHandler = mVar;
    }
}
