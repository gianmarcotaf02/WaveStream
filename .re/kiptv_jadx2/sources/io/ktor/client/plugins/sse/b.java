package io.ktor.client.plugins.sse;

import io.ktor.client.request.HttpRequestBuilder;
import p194x6.j;

public final class b implements j {

    public final int f23367h;

    public final String f23368i;
    public final j j;

    public b(String str, int i3, j jVar) {
        this.f23367h = i3;
        this.f23368i = str;
        this.j = jVar;
    }

    @Override
    public final Object invoke(Object obj) {
        HttpRequestBuilder httpRequestBuilder = (HttpRequestBuilder) obj;
        switch (this.f23367h) {
            case 0:
                return BuildersKt.serverSentEventsSession_Mswn__c$lambda$18(this.f23368i, this.j, httpRequestBuilder);
            case 1:
                return BuildersKt.serverSentEvents_3bFjkrY$lambda$9(this.f23368i, this.j, httpRequestBuilder);
            case 2:
                return BuildersKt.serverSentEventsSession_mY9Nd3A$lambda$5(this.f23368i, this.j, httpRequestBuilder);
            case 3:
                return BuildersKt.serverSentEvents_pTj2aPc$lambda$22(this.f23368i, this.j, httpRequestBuilder);
            case 4:
                return io.ktor.client.plugins.websocket.BuildersKt.webSocket$lambda$13(this.f23368i, this.j, httpRequestBuilder);
            case 5:
                return io.ktor.client.plugins.websocket.BuildersKt.wss$lambda$18(this.f23368i, this.j, httpRequestBuilder);
            default:
                return io.ktor.client.plugins.websocket.BuildersKt.webSocketSession$lambda$6(this.f23368i, this.j, httpRequestBuilder);
        }
    }
}
