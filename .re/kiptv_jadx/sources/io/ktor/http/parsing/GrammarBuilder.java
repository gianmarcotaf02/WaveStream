package io.ktor.http.parsing;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u0006\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\bH\u0086\u0004¢\u0006\u0004\b\u0006\u0010\nJ\u001a\u0010\r\u001a\u00020\f*\b\u0012\u0004\u0012\u00020\u00040\u000bH\u0086\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0014\u0010\r\u001a\u00020\f*\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\r\u0010\u000fJ\u0014\u0010\r\u001a\u00020\f*\u00020\bH\u0086\u0002¢\u0006\u0004\b\r\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lio/ktor/http/parsing/GrammarBuilder;", "", "<init>", "()V", "Lio/ktor/http/parsing/Grammar;", "grammar", "then", "(Lio/ktor/http/parsing/Grammar;)Lio/ktor/http/parsing/GrammarBuilder;", "", "value", "(Ljava/lang/String;)Lio/ktor/http/parsing/GrammarBuilder;", "Lkotlin/Function0;", "Lh6/A;", "unaryPlus", "(Lkotlin/jvm/functions/Function0;)V", "(Lio/ktor/http/parsing/Grammar;)V", "(Ljava/lang/String;)V", io.sentry.protocol.OperatingSystem.JsonKeys.BUILD, "()Lio/ktor/http/parsing/Grammar;", "", "grammars", "Ljava/util/List;", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class GrammarBuilder {
    private final java.util.List<io.ktor.http.parsing.Grammar> grammars = new java.util.ArrayList();

    public final io.ktor.http.parsing.Grammar build() {
        return this.grammars.size() == 1 ? (io.ktor.http.parsing.Grammar) p078i6.o.h1(this.grammars) : new io.ktor.http.parsing.SequenceGrammar(this.grammars);
    }

    public final io.ktor.http.parsing.GrammarBuilder then(io.ktor.http.parsing.Grammar grammar) {
        kotlin.jvm.internal.m.e(grammar, "grammar");
        this.grammars.add(grammar);
        return this;
    }

    public final void unaryPlus(kotlin.jvm.functions.Function0 function0) {
        kotlin.jvm.internal.m.e(function0, "<this>");
        this.grammars.add((io.ktor.http.parsing.Grammar) function0.invoke());
    }

    public final io.ktor.http.parsing.GrammarBuilder then(java.lang.String value) {
        kotlin.jvm.internal.m.e(value, "value");
        this.grammars.add(new io.ktor.http.parsing.StringGrammar(value));
        return this;
    }

    public final void unaryPlus(io.ktor.http.parsing.Grammar grammar) {
        kotlin.jvm.internal.m.e(grammar, "<this>");
        this.grammars.add(grammar);
    }

    public final void unaryPlus(java.lang.String str) {
        kotlin.jvm.internal.m.e(str, "<this>");
        this.grammars.add(new io.ktor.http.parsing.StringGrammar(str));
    }
}
