package io.ktor.http.parsing;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\"\u0014\u0010\u0003\u001a\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0001\u0010\u0002\"\u0014\u0010\u0005\u001a\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0002\"\u0014\u0010\t\u001a\u00020\u00068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\"\u0014\u0010\u000b\u001a\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0002\"\u0014\u0010\r\u001a\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0002\"\u0014\u0010\u000f\u001a\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0002\"\u0014\u0010\u0011\u001a\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0002¨\u0006\u0012"}, d2 = {"Lio/ktor/http/parsing/Grammar;", "getLowAlpha", "()Lio/ktor/http/parsing/Grammar;", "lowAlpha", "getAlpha", io.sentry.protocol.ViewHierarchyNode.JsonKeys.ALPHA, "Lio/ktor/http/parsing/RawGrammar;", "getDigit", "()Lio/ktor/http/parsing/RawGrammar;", "digit", "getHex", "hex", "getAlphaDigit", "alphaDigit", "getAlphas", "alphas", "getDigits", "digits", "ktor-http"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class PrimitivesKt {
    public static final io.ktor.http.parsing.Grammar getAlpha() {
        return io.ktor.http.parsing.ParserDslKt.or(io.ktor.http.parsing.ParserDslKt.to('a', io.ktor.util.date.GMTDateParser.ZONE), io.ktor.http.parsing.ParserDslKt.to('A', 'Z'));
    }

    public static final io.ktor.http.parsing.Grammar getAlphaDigit() {
        return io.ktor.http.parsing.ParserDslKt.or(getAlpha(), getDigit());
    }

    public static final io.ktor.http.parsing.Grammar getAlphas() {
        return io.ktor.http.parsing.ParserDslKt.atLeastOne(getAlpha());
    }

    public static final io.ktor.http.parsing.RawGrammar getDigit() {
        return new io.ktor.http.parsing.RawGrammar("\\d");
    }

    public static final io.ktor.http.parsing.Grammar getDigits() {
        return io.ktor.http.parsing.ParserDslKt.atLeastOne(getDigit());
    }

    public static final io.ktor.http.parsing.Grammar getHex() {
        return io.ktor.http.parsing.ParserDslKt.or(io.ktor.http.parsing.ParserDslKt.or(getDigit(), io.ktor.http.parsing.ParserDslKt.to('A', 'F')), io.ktor.http.parsing.ParserDslKt.to('a', 'f'));
    }

    public static final io.ktor.http.parsing.Grammar getLowAlpha() {
        return io.ktor.http.parsing.ParserDslKt.to('a', io.ktor.util.date.GMTDateParser.ZONE);
    }
}
