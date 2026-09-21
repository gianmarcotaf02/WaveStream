package io.ktor.client.plugins.sse;

import io.ktor.client.plugins.api.ClientPluginBuilder;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.request.forms.FormBuildersKt;
import io.ktor.client.utils.HeadersKt;
import io.ktor.events.EventDefinition;
import io.ktor.events.Events;
import io.ktor.http.CookieKt;
import io.ktor.http.CookieUtilsKt;
import io.ktor.http.FileContentTypeKt;
import io.ktor.http.HeadersBuilder;
import p070h6.k;
import p194x6.j;

public final class c implements j {

    public final int f23369h;

    public c(int i3) {
        this.f23369h = i3;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f23369h) {
            case 0:
                return BuildersKt.serverSentEvents_pTj2aPc$lambda$21((HttpRequestBuilder) obj);
            case 1:
                return BuildersKt.sseSession_Mswn__c$lambda$24((HttpRequestBuilder) obj);
            case 2:
                return BuildersKt.serverSentEventsSession_tL6_L_A$lambda$15((HttpRequestBuilder) obj);
            case 3:
                return BuildersKt.sse_Q9yt8Vw$lambda$26((HttpRequestBuilder) obj);
            case 4:
                return BuildersKt.sse_BAHpl2s$lambda$25((HttpRequestBuilder) obj);
            case 5:
                return BuildersKt.serverSentEventsSession_xEWcMm4$lambda$2((HttpRequestBuilder) obj);
            case 6:
                return BuildersKt.sseSession_xEWcMm4$lambda$10((HttpRequestBuilder) obj);
            case 7:
                return BuildersKt.sseSession_tL6_L_A$lambda$23((HttpRequestBuilder) obj);
            case 8:
                return BuildersKt.sse_Mswn__c$lambda$13((HttpRequestBuilder) obj);
            case 9:
                return BuildersKt.sseSession_mY9Nd3A$lambda$11((HttpRequestBuilder) obj);
            case 10:
                return SSEKt.SSE$lambda$0((ClientPluginBuilder) obj);
            case 11:
                return io.ktor.client.plugins.websocket.BuildersKt.webSocket$lambda$10((HttpRequestBuilder) obj);
            case 12:
                return io.ktor.client.plugins.websocket.BuildersKt.wss$lambda$17((HttpRequestBuilder) obj);
            case 13:
                return io.ktor.client.plugins.websocket.BuildersKt.wss$lambda$19((HttpRequestBuilder) obj);
            case 14:
                return io.ktor.client.plugins.websocket.BuildersKt.ws$lambda$14((HttpRequestBuilder) obj);
            case 15:
                return io.ktor.client.plugins.websocket.BuildersKt.webSocketSession$lambda$5((HttpRequestBuilder) obj);
            case 16:
                return io.ktor.client.plugins.websocket.BuildersKt.webSocket$lambda$12((HttpRequestBuilder) obj);
            case 17:
                return io.ktor.client.plugins.websocket.BuildersKt.ws$lambda$15((HttpRequestBuilder) obj);
            case 18:
                return io.ktor.client.plugins.websocket.BuildersKt.webSocketSession$lambda$3((HttpRequestBuilder) obj);
            case 19:
                return FormBuildersKt.prepareForm$lambda$6((HttpRequestBuilder) obj);
            case 20:
                return FormBuildersKt.submitForm$lambda$1((HttpRequestBuilder) obj);
            case 21:
                return HeadersKt.buildHeaders$lambda$0((HeadersBuilder) obj);
            case 22:
                return Events.subscribe$lambda$0((EventDefinition) obj);
            case 23:
                return Boolean.valueOf(CookieUtilsKt.isDelimiter(((Character) obj).charValue()));
            case 24:
                return Boolean.valueOf(CookieUtilsKt.isNonDelimiter(((Character) obj).charValue()));
            case 25:
                return Boolean.valueOf(CookieUtilsKt.isNonDelimiter(((Character) obj).charValue()));
            case 26:
                return Boolean.valueOf(CookieUtilsKt.isDelimiter(((Character) obj).charValue()));
            case 27:
                return CookieKt.parseClientCookiesHeader$lambda$4((O7.j) obj);
            case 28:
                return CookieKt.parseClientCookiesHeader$lambda$6((k) obj);
            default:
                return FileContentTypeKt.extensionsByContentType_delegate$lambda$3$lambda$2((k) obj);
        }
    }
}
