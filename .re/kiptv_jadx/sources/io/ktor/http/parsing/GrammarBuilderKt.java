package io.ktor.http.parsing;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/Function1;", "Lio/ktor/http/parsing/GrammarBuilder;", "Lh6/A;", "block", "Lio/ktor/http/parsing/Grammar;", "grammar", "(Lx6/j;)Lio/ktor/http/parsing/Grammar;", "ktor-http"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class GrammarBuilderKt {
    public static final io.ktor.http.parsing.Grammar grammar(p194x6.j block) {
        kotlin.jvm.internal.m.e(block, "block");
        io.ktor.http.parsing.GrammarBuilder grammarBuilder = new io.ktor.http.parsing.GrammarBuilder();
        block.invoke(grammarBuilder);
        return grammarBuilder.build();
    }
}
