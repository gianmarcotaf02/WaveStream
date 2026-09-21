package io.ktor.client.plugins.sse;

import io.ktor.client.request.HttpRequestBuilder;
import p194x6.j;

public final class a implements j {

    public final int f23362h;

    public final String f23363i;
    public final String j;

    public final Integer f23364k;

    public final String f23365l;

    public final j f23366m;

    public a(String str, String str2, Integer num, String str3, j jVar, int i3) {
        this.f23362h = i3;
        this.f23363i = str;
        this.j = str2;
        this.f23364k = num;
        this.f23365l = str3;
        this.f23366m = jVar;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f23362h) {
            case 0:
                Integer num = this.f23364k;
                String str = this.f23365l;
                return BuildersKt.serverSentEventsSession_xEWcMm4$lambda$3(this.f23363i, this.j, num, str, this.f23366m, (HttpRequestBuilder) obj);
            case 1:
                Integer num2 = this.f23364k;
                String str2 = this.f23365l;
                return BuildersKt.serverSentEventsSession_tL6_L_A$lambda$16(this.f23363i, this.j, num2, str2, this.f23366m, (HttpRequestBuilder) obj);
            case 2:
                Integer num3 = this.f23364k;
                String str3 = this.f23365l;
                return BuildersKt.serverSentEvents_1wIb_0I$lambda$7(this.f23363i, this.j, num3, str3, this.f23366m, (HttpRequestBuilder) obj);
            default:
                Integer num4 = this.f23364k;
                String str4 = this.f23365l;
                return BuildersKt.serverSentEvents_BqdlHlk$lambda$20(this.f23363i, this.j, num4, str4, this.f23366m, (HttpRequestBuilder) obj);
        }
    }
}
