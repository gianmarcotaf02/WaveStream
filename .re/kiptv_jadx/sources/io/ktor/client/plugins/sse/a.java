package io.ktor.client.plugins.sse;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f23362h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f23363i;
    public final /* synthetic */ java.lang.String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f23364k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f23365l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p194x6.j f23366m;

    public /* synthetic */ a(java.lang.String str, java.lang.String str2, java.lang.Integer num, java.lang.String str3, p194x6.j jVar, int i3) {
        this.f23362h = i3;
        this.f23363i = str;
        this.j = str2;
        this.f23364k = num;
        this.f23365l = str3;
        this.f23366m = jVar;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        switch (this.f23362h) {
            case 0:
                java.lang.Integer num = this.f23364k;
                java.lang.String str = this.f23365l;
                return io.ktor.client.plugins.sse.BuildersKt.serverSentEventsSession_xEWcMm4$lambda$3(this.f23363i, this.j, num, str, this.f23366m, (io.ktor.client.request.HttpRequestBuilder) obj);
            case 1:
                java.lang.Integer num2 = this.f23364k;
                java.lang.String str2 = this.f23365l;
                return io.ktor.client.plugins.sse.BuildersKt.serverSentEventsSession_tL6_L_A$lambda$16(this.f23363i, this.j, num2, str2, this.f23366m, (io.ktor.client.request.HttpRequestBuilder) obj);
            case 2:
                java.lang.Integer num3 = this.f23364k;
                java.lang.String str3 = this.f23365l;
                return io.ktor.client.plugins.sse.BuildersKt.serverSentEvents_1wIb_0I$lambda$7(this.f23363i, this.j, num3, str3, this.f23366m, (io.ktor.client.request.HttpRequestBuilder) obj);
            default:
                java.lang.Integer num4 = this.f23364k;
                java.lang.String str4 = this.f23365l;
                return io.ktor.client.plugins.sse.BuildersKt.serverSentEvents_BqdlHlk$lambda$20(this.f23363i, this.j, num4, str4, this.f23366m, (io.ktor.client.request.HttpRequestBuilder) obj);
        }
    }
}
