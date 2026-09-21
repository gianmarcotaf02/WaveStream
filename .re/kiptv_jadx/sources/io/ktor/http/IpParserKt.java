package io.ktor.http;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\"\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007\"\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0007\"\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"", com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker.HOST_KEY, "", "hostIsIp", "(Ljava/lang/String;)Z", "Lio/ktor/http/parsing/Grammar;", "IPv4address", "Lio/ktor/http/parsing/Grammar;", "IPv6address", "Lio/ktor/http/parsing/Parser;", "IP_PARSER", "Lio/ktor/http/parsing/Parser;", "ktor-http"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class IpParserKt {
    private static final io.ktor.http.parsing.Parser IP_PARSER;
    private static final io.ktor.http.parsing.Grammar IPv4address;
    private static final io.ktor.http.parsing.Grammar IPv6address;

    static {
        io.ktor.http.parsing.Grammar grammarThen = io.ktor.http.parsing.ParserDslKt.then(io.ktor.http.parsing.ParserDslKt.then(io.ktor.http.parsing.ParserDslKt.then(io.ktor.http.parsing.ParserDslKt.then(io.ktor.http.parsing.ParserDslKt.then(io.ktor.http.parsing.ParserDslKt.then(io.ktor.http.parsing.PrimitivesKt.getDigits(), "."), io.ktor.http.parsing.PrimitivesKt.getDigits()), "."), io.ktor.http.parsing.PrimitivesKt.getDigits()), "."), io.ktor.http.parsing.PrimitivesKt.getDigits());
        IPv4address = grammarThen;
        io.ktor.http.parsing.Grammar grammarThen2 = io.ktor.http.parsing.ParserDslKt.then(io.ktor.http.parsing.ParserDslKt.then("[", io.ktor.http.parsing.ParserDslKt.atLeastOne(io.ktor.http.parsing.ParserDslKt.or(io.ktor.http.parsing.PrimitivesKt.getHex(), ":"))), "]");
        IPv6address = grammarThen2;
        IP_PARSER = io.ktor.http.parsing.regex.RegexParserGeneratorKt.buildRegexParser(io.ktor.http.parsing.ParserDslKt.or(grammarThen, grammarThen2));
    }

    public static final boolean hostIsIp(java.lang.String host) {
        kotlin.jvm.internal.m.e(host, "host");
        return IP_PARSER.match(host);
    }
}
