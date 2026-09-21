package io.ktor.client.plugins.websocket;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f23370h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ io.ktor.http.HttpMethod f23371i;
    public final /* synthetic */ java.lang.String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f23372k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f23373l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p194x6.j f23374m;

    public /* synthetic */ a(io.ktor.http.HttpMethod httpMethod, java.lang.String str, java.lang.Integer num, java.lang.String str2, p194x6.j jVar, int i3) {
        this.f23370h = i3;
        this.f23371i = httpMethod;
        this.j = str;
        this.f23372k = num;
        this.f23373l = str2;
        this.f23374m = jVar;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        switch (this.f23370h) {
            case 0:
                java.lang.Integer num = this.f23372k;
                java.lang.String str = this.f23373l;
                return io.ktor.client.plugins.websocket.BuildersKt.webSocketSession$lambda$4(this.f23371i, this.j, num, str, this.f23374m, (io.ktor.client.request.HttpRequestBuilder) obj);
            default:
                java.lang.Integer num2 = this.f23372k;
                java.lang.String str2 = this.f23373l;
                return io.ktor.client.plugins.websocket.BuildersKt.webSocket$lambda$11(this.f23371i, this.j, num2, str2, this.f23374m, (io.ktor.client.request.HttpRequestBuilder) obj);
        }
    }
}
