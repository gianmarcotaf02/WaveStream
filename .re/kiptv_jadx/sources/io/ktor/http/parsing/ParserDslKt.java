package io.ktor.http.parsing;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u001a\u0017\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0017\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0002\u0010\u0006\u001a)\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00000\u000b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0000¢\u0006\u0004\b\u0002\u0010\f\u001a\u001c\u0010\r\u001a\u00020\u0000*\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\u0080\u0004¢\u0006\u0004\b\r\u0010\u000e\u001a\u001c\u0010\r\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0080\u0004¢\u0006\u0004\b\r\u0010\u000f\u001a\u001c\u0010\r\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0080\u0004¢\u0006\u0004\b\r\u0010\u0010\u001a\u001c\u0010\u0011\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0080\u0004¢\u0006\u0004\b\u0011\u0010\u000f\u001a\u001c\u0010\u0011\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0080\u0004¢\u0006\u0004\b\u0011\u0010\u0010\u001a\u001c\u0010\u0011\u001a\u00020\u0000*\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\u0080\u0004¢\u0006\u0004\b\u0011\u0010\u000e\u001a\u0017\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0012\u0010\u0003\u001a\u0017\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0013\u0010\u0003\u001a\u001b\u0010\u0015\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0015\u0010\u0010\u001a\u0017\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0016\u0010\u0006\u001a\u001c\u0010\u0019\u001a\u00020\u0000*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H\u0080\u0004¢\u0006\u0004\b\u0019\u0010\u001a\u001a,\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00000\u001d\"\n\b\u0000\u0010\u001c\u0018\u0001*\u00020\u001b*\b\u0012\u0004\u0012\u00020\u00000\u001dH\u0080\b¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lio/ktor/http/parsing/Grammar;", "grammar", "maybe", "(Lio/ktor/http/parsing/Grammar;)Lio/ktor/http/parsing/Grammar;", "", "value", "(Ljava/lang/String;)Lio/ktor/http/parsing/Grammar;", "Lkotlin/Function1;", "Lio/ktor/http/parsing/GrammarBuilder;", "Lh6/A;", "block", "Lkotlin/Function0;", "(Lx6/j;)Lkotlin/jvm/functions/Function0;", "then", "(Ljava/lang/String;Lio/ktor/http/parsing/Grammar;)Lio/ktor/http/parsing/Grammar;", "(Lio/ktor/http/parsing/Grammar;Lio/ktor/http/parsing/Grammar;)Lio/ktor/http/parsing/Grammar;", "(Lio/ktor/http/parsing/Grammar;Ljava/lang/String;)Lio/ktor/http/parsing/Grammar;", "or", "many", "atLeastOne", "name", "named", "anyOf", "", io.sentry.protocol.Request.JsonKeys.OTHER, "to", "(CC)Lio/ktor/http/parsing/Grammar;", "Lio/ktor/http/parsing/ComplexGrammar;", "T", "", "flatten", "(Ljava/util/List;)Ljava/util/List;", "ktor-http"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class ParserDslKt {
    public static final io.ktor.http.parsing.Grammar anyOf(java.lang.String value) {
        kotlin.jvm.internal.m.e(value, "value");
        return new io.ktor.http.parsing.AnyOfGrammar(value);
    }

    public static final io.ktor.http.parsing.Grammar atLeastOne(io.ktor.http.parsing.Grammar grammar) {
        kotlin.jvm.internal.m.e(grammar, "grammar");
        return new io.ktor.http.parsing.AtLeastOne(grammar);
    }

    public static final <T extends io.ktor.http.parsing.ComplexGrammar> java.util.List<io.ktor.http.parsing.Grammar> flatten(java.util.List<? extends io.ktor.http.parsing.Grammar> list) {
        kotlin.jvm.internal.m.e(list, "<this>");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = list.iterator();
        if (!it.hasNext()) {
            return arrayList;
        }
        kotlin.jvm.internal.m.j();
        throw null;
    }

    public static final io.ktor.http.parsing.Grammar many(io.ktor.http.parsing.Grammar grammar) {
        kotlin.jvm.internal.m.e(grammar, "grammar");
        return new io.ktor.http.parsing.ManyGrammar(grammar);
    }

    public static final io.ktor.http.parsing.Grammar maybe(io.ktor.http.parsing.Grammar grammar) {
        kotlin.jvm.internal.m.e(grammar, "grammar");
        return new io.ktor.http.parsing.MaybeGrammar(grammar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final io.ktor.http.parsing.Grammar maybe$lambda$0(p194x6.j jVar) {
        io.ktor.http.parsing.GrammarBuilder grammarBuilder = new io.ktor.http.parsing.GrammarBuilder();
        jVar.invoke(grammarBuilder);
        return maybe(grammarBuilder.build());
    }

    public static final io.ktor.http.parsing.Grammar named(io.ktor.http.parsing.Grammar grammar, java.lang.String name) {
        kotlin.jvm.internal.m.e(grammar, "<this>");
        kotlin.jvm.internal.m.e(name, "name");
        return new io.ktor.http.parsing.NamedGrammar(name, grammar);
    }

    public static final io.ktor.http.parsing.Grammar or(io.ktor.http.parsing.Grammar grammar, io.ktor.http.parsing.Grammar grammar2) {
        kotlin.jvm.internal.m.e(grammar, "<this>");
        kotlin.jvm.internal.m.e(grammar2, "grammar");
        return new io.ktor.http.parsing.OrGrammar(p078i6.p.B0(grammar, grammar2));
    }

    public static final io.ktor.http.parsing.Grammar then(java.lang.String str, io.ktor.http.parsing.Grammar grammar) {
        kotlin.jvm.internal.m.e(str, "<this>");
        kotlin.jvm.internal.m.e(grammar, "grammar");
        return then(new io.ktor.http.parsing.StringGrammar(str), grammar);
    }

    public static final io.ktor.http.parsing.Grammar to(char c9, char c10) {
        return new io.ktor.http.parsing.RangeGrammar(c9, c10);
    }

    public static final io.ktor.http.parsing.Grammar maybe(java.lang.String value) {
        kotlin.jvm.internal.m.e(value, "value");
        return new io.ktor.http.parsing.MaybeGrammar(new io.ktor.http.parsing.StringGrammar(value));
    }

    public static final io.ktor.http.parsing.Grammar or(io.ktor.http.parsing.Grammar grammar, java.lang.String value) {
        kotlin.jvm.internal.m.e(grammar, "<this>");
        kotlin.jvm.internal.m.e(value, "value");
        return or(grammar, new io.ktor.http.parsing.StringGrammar(value));
    }

    public static final io.ktor.http.parsing.Grammar then(io.ktor.http.parsing.Grammar grammar, io.ktor.http.parsing.Grammar grammar2) {
        kotlin.jvm.internal.m.e(grammar, "<this>");
        kotlin.jvm.internal.m.e(grammar2, "grammar");
        return new io.ktor.http.parsing.SequenceGrammar(p078i6.p.B0(grammar, grammar2));
    }

    public static final kotlin.jvm.functions.Function0 maybe(p194x6.j block) {
        kotlin.jvm.internal.m.e(block, "block");
        return new C5.E(12, block);
    }

    public static final io.ktor.http.parsing.Grammar or(java.lang.String str, io.ktor.http.parsing.Grammar grammar) {
        kotlin.jvm.internal.m.e(str, "<this>");
        kotlin.jvm.internal.m.e(grammar, "grammar");
        return or(new io.ktor.http.parsing.StringGrammar(str), grammar);
    }

    public static final io.ktor.http.parsing.Grammar then(io.ktor.http.parsing.Grammar grammar, java.lang.String value) {
        kotlin.jvm.internal.m.e(grammar, "<this>");
        kotlin.jvm.internal.m.e(value, "value");
        return then(grammar, new io.ktor.http.parsing.StringGrammar(value));
    }
}
