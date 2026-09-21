package io.ktor.http;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
public final class CookieUtilsKt$tryParseDayOfMonth$day$1$1 implements p194x6.j {
    public static final io.ktor.http.CookieUtilsKt$tryParseDayOfMonth$day$1$1 INSTANCE = new io.ktor.http.CookieUtilsKt$tryParseDayOfMonth$day$1$1();

    public final java.lang.Boolean invoke(char c9) {
        return java.lang.Boolean.valueOf(io.ktor.http.CookieUtilsKt.isDigit(c9));
    }

    @Override // p194x6.j
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
        return invoke(((java.lang.Character) obj).charValue());
    }
}
