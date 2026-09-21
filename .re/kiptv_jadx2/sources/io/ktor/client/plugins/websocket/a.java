package io.ktor.client.plugins.websocket;

import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.http.HttpMethod;
import p194x6.j;

public final class a implements j {

    public final int f23370h;

    public final HttpMethod f23371i;
    public final String j;

    public final Integer f23372k;

    public final String f23373l;

    public final j f23374m;

    public a(HttpMethod httpMethod, String str, Integer num, String str2, j jVar, int i3) {
        this.f23370h = i3;
        this.f23371i = httpMethod;
        this.j = str;
        this.f23372k = num;
        this.f23373l = str2;
        this.f23374m = jVar;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f23370h) {
            case 0:
                Integer num = this.f23372k;
                String str = this.f23373l;
                return BuildersKt.webSocketSession$lambda$4(this.f23371i, this.j, num, str, this.f23374m, (HttpRequestBuilder) obj);
            default:
                Integer num2 = this.f23372k;
                String str2 = this.f23373l;
                return BuildersKt.webSocket$lambda$11(this.f23371i, this.j, num2, str2, this.f23374m, (HttpRequestBuilder) obj);
        }
    }
}
