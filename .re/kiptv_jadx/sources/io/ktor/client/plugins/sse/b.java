package io.ktor.client.plugins.sse;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f23367h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f23368i;
    public final /* synthetic */ p194x6.j j;

    public /* synthetic */ b(java.lang.String str, int i3, p194x6.j jVar) {
        this.f23367h = i3;
        this.f23368i = str;
        this.j = jVar;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = (io.ktor.client.request.HttpRequestBuilder) obj;
        switch (this.f23367h) {
            case 0:
                return io.ktor.client.plugins.sse.BuildersKt.serverSentEventsSession_Mswn__c$lambda$18(this.f23368i, this.j, httpRequestBuilder);
            case 1:
                return io.ktor.client.plugins.sse.BuildersKt.serverSentEvents_3bFjkrY$lambda$9(this.f23368i, this.j, httpRequestBuilder);
            case 2:
                return io.ktor.client.plugins.sse.BuildersKt.serverSentEventsSession_mY9Nd3A$lambda$5(this.f23368i, this.j, httpRequestBuilder);
            case 3:
                return io.ktor.client.plugins.sse.BuildersKt.serverSentEvents_pTj2aPc$lambda$22(this.f23368i, this.j, httpRequestBuilder);
            case 4:
                return io.ktor.client.plugins.websocket.BuildersKt.webSocket$lambda$13(this.f23368i, this.j, httpRequestBuilder);
            case 5:
                return io.ktor.client.plugins.websocket.BuildersKt.wss$lambda$18(this.f23368i, this.j, httpRequestBuilder);
            default:
                return io.ktor.client.plugins.websocket.BuildersKt.webSocketSession$lambda$6(this.f23368i, this.j, httpRequestBuilder);
        }
    }
}
