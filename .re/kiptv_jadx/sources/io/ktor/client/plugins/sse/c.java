package io.ktor.client.plugins.sse;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f23369h;

    public /* synthetic */ c(int i3) {
        this.f23369h = i3;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        switch (this.f23369h) {
            case 0:
                return io.ktor.client.plugins.sse.BuildersKt.serverSentEvents_pTj2aPc$lambda$21((io.ktor.client.request.HttpRequestBuilder) obj);
            case 1:
                return io.ktor.client.plugins.sse.BuildersKt.sseSession_Mswn__c$lambda$24((io.ktor.client.request.HttpRequestBuilder) obj);
            case 2:
                return io.ktor.client.plugins.sse.BuildersKt.serverSentEventsSession_tL6_L_A$lambda$15((io.ktor.client.request.HttpRequestBuilder) obj);
            case 3:
                return io.ktor.client.plugins.sse.BuildersKt.sse_Q9yt8Vw$lambda$26((io.ktor.client.request.HttpRequestBuilder) obj);
            case 4:
                return io.ktor.client.plugins.sse.BuildersKt.sse_BAHpl2s$lambda$25((io.ktor.client.request.HttpRequestBuilder) obj);
            case 5:
                return io.ktor.client.plugins.sse.BuildersKt.serverSentEventsSession_xEWcMm4$lambda$2((io.ktor.client.request.HttpRequestBuilder) obj);
            case 6:
                return io.ktor.client.plugins.sse.BuildersKt.sseSession_xEWcMm4$lambda$10((io.ktor.client.request.HttpRequestBuilder) obj);
            case 7:
                return io.ktor.client.plugins.sse.BuildersKt.sseSession_tL6_L_A$lambda$23((io.ktor.client.request.HttpRequestBuilder) obj);
            case 8:
                return io.ktor.client.plugins.sse.BuildersKt.sse_Mswn__c$lambda$13((io.ktor.client.request.HttpRequestBuilder) obj);
            case 9:
                return io.ktor.client.plugins.sse.BuildersKt.sseSession_mY9Nd3A$lambda$11((io.ktor.client.request.HttpRequestBuilder) obj);
            case 10:
                return io.ktor.client.plugins.sse.SSEKt.SSE$lambda$0((io.ktor.client.plugins.api.ClientPluginBuilder) obj);
            case 11:
                return io.ktor.client.plugins.websocket.BuildersKt.webSocket$lambda$10((io.ktor.client.request.HttpRequestBuilder) obj);
            case 12:
                return io.ktor.client.plugins.websocket.BuildersKt.wss$lambda$17((io.ktor.client.request.HttpRequestBuilder) obj);
            case 13:
                return io.ktor.client.plugins.websocket.BuildersKt.wss$lambda$19((io.ktor.client.request.HttpRequestBuilder) obj);
            case 14:
                return io.ktor.client.plugins.websocket.BuildersKt.ws$lambda$14((io.ktor.client.request.HttpRequestBuilder) obj);
            case 15:
                return io.ktor.client.plugins.websocket.BuildersKt.webSocketSession$lambda$5((io.ktor.client.request.HttpRequestBuilder) obj);
            case 16:
                return io.ktor.client.plugins.websocket.BuildersKt.webSocket$lambda$12((io.ktor.client.request.HttpRequestBuilder) obj);
            case 17:
                return io.ktor.client.plugins.websocket.BuildersKt.ws$lambda$15((io.ktor.client.request.HttpRequestBuilder) obj);
            case 18:
                return io.ktor.client.plugins.websocket.BuildersKt.webSocketSession$lambda$3((io.ktor.client.request.HttpRequestBuilder) obj);
            case 19:
                return io.ktor.client.request.forms.FormBuildersKt.prepareForm$lambda$6((io.ktor.client.request.HttpRequestBuilder) obj);
            case 20:
                return io.ktor.client.request.forms.FormBuildersKt.submitForm$lambda$1((io.ktor.client.request.HttpRequestBuilder) obj);
            case 21:
                return io.ktor.client.utils.HeadersKt.buildHeaders$lambda$0((io.ktor.http.HeadersBuilder) obj);
            case 22:
                return io.ktor.events.Events.subscribe$lambda$0((io.ktor.events.EventDefinition) obj);
            case 23:
                return java.lang.Boolean.valueOf(io.ktor.http.CookieUtilsKt.isDelimiter(((java.lang.Character) obj).charValue()));
            case 24:
                return java.lang.Boolean.valueOf(io.ktor.http.CookieUtilsKt.isNonDelimiter(((java.lang.Character) obj).charValue()));
            case 25:
                return java.lang.Boolean.valueOf(io.ktor.http.CookieUtilsKt.isNonDelimiter(((java.lang.Character) obj).charValue()));
            case 26:
                return java.lang.Boolean.valueOf(io.ktor.http.CookieUtilsKt.isDelimiter(((java.lang.Character) obj).charValue()));
            case 27:
                return io.ktor.http.CookieKt.parseClientCookiesHeader$lambda$4((O7.j) obj);
            case 28:
                return io.ktor.http.CookieKt.parseClientCookiesHeader$lambda$6((p070h6.k) obj);
            default:
                return io.ktor.http.FileContentTypeKt.extensionsByContentType_delegate$lambda$3$lambda$2((p070h6.k) obj);
        }
    }
}
