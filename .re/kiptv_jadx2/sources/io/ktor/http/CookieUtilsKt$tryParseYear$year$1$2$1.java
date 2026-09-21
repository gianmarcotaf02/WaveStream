package io.ktor.http;

import kotlin.Metadata;
import p194x6.j;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
public final class CookieUtilsKt$tryParseYear$year$1$2$1 implements j {
    public static final CookieUtilsKt$tryParseYear$year$1$2$1 INSTANCE = new CookieUtilsKt$tryParseYear$year$1$2$1();

    public final Boolean invoke(char c9) {
        return Boolean.valueOf(CookieUtilsKt.isDigit(c9));
    }

    @Override
    public Object invoke(Object obj) {
        return invoke(((Character) obj).charValue());
    }
}
