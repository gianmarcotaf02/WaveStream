package io.ktor.http;

import E6.v;
import java.util.List;
import kotlin.jvm.functions.Function0;

public final class c implements Function0 {

    public final int f23381h;

    public final List f23382i;

    public c(int i3, List list) {
        this.f23381h = i3;
        this.f23382i = list;
    }

    @Override
    public final Object invoke() {
        switch (this.f23381h) {
            case 0:
                return Url.segments_delegate$lambda$1(this.f23382i);
            case 1:
                return ((v) this.f23382i.get(0)).d();
            default:
                return ((v) this.f23382i.get(0)).d();
        }
    }
}
