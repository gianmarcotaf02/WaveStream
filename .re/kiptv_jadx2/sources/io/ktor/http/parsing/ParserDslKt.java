package io.ktor.http.parsing;

import C5.E;
import androidx.media3.container.NalUnitUtil;
import io.sentry.protocol.Request;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.m;
import p078i6.p;
import p194x6.j;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u001a\u0017\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0017\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0002\u0010\u0006\u001a)\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00000\u000b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0000¢\u0006\u0004\b\u0002\u0010\f\u001a\u001c\u0010\r\u001a\u00020\u0000*\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\u0080\u0004¢\u0006\u0004\b\r\u0010\u000e\u001a\u001c\u0010\r\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0080\u0004¢\u0006\u0004\b\r\u0010\u000f\u001a\u001c\u0010\r\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0080\u0004¢\u0006\u0004\b\r\u0010\u0010\u001a\u001c\u0010\u0011\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0080\u0004¢\u0006\u0004\b\u0011\u0010\u000f\u001a\u001c\u0010\u0011\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0080\u0004¢\u0006\u0004\b\u0011\u0010\u0010\u001a\u001c\u0010\u0011\u001a\u00020\u0000*\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\u0080\u0004¢\u0006\u0004\b\u0011\u0010\u000e\u001a\u0017\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0012\u0010\u0003\u001a\u0017\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0013\u0010\u0003\u001a\u001b\u0010\u0015\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0015\u0010\u0010\u001a\u0017\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0016\u0010\u0006\u001a\u001c\u0010\u0019\u001a\u00020\u0000*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H\u0080\u0004¢\u0006\u0004\b\u0019\u0010\u001a\u001a,\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00000\u001d\"\n\b\u0000\u0010\u001c\u0018\u0001*\u00020\u001b*\b\u0012\u0004\u0012\u00020\u00000\u001dH\u0080\b¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lio/ktor/http/parsing/Grammar;", "grammar", "maybe", "(Lio/ktor/http/parsing/Grammar;)Lio/ktor/http/parsing/Grammar;", "", "value", "(Ljava/lang/String;)Lio/ktor/http/parsing/Grammar;", "Lkotlin/Function1;", "Lio/ktor/http/parsing/GrammarBuilder;", "Lh6/A;", "block", "Lkotlin/Function0;", "(Lx6/j;)Lkotlin/jvm/functions/Function0;", "then", "(Ljava/lang/String;Lio/ktor/http/parsing/Grammar;)Lio/ktor/http/parsing/Grammar;", "(Lio/ktor/http/parsing/Grammar;Lio/ktor/http/parsing/Grammar;)Lio/ktor/http/parsing/Grammar;", "(Lio/ktor/http/parsing/Grammar;Ljava/lang/String;)Lio/ktor/http/parsing/Grammar;", "or", "many", "atLeastOne", "name", "named", "anyOf", "", Request.JsonKeys.OTHER, "to", "(CC)Lio/ktor/http/parsing/Grammar;", "Lio/ktor/http/parsing/ComplexGrammar;", "T", "", "flatten", "(Ljava/util/List;)Ljava/util/List;", "ktor-http"}, k = 2, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class ParserDslKt {
    public static final Grammar anyOf(String value) {
        m.e(value, "value");
        return new AnyOfGrammar(value);
    }

    public static final Grammar atLeastOne(Grammar grammar) {
        m.e(grammar, "grammar");
        return new AtLeastOne(grammar);
    }

    public static final <T extends ComplexGrammar> List<Grammar> flatten(List<? extends Grammar> list) {
        m.e(list, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        if (!it.hasNext()) {
            return arrayList;
        }
        m.j();
        throw null;
    }

    public static final Grammar many(Grammar grammar) {
        m.e(grammar, "grammar");
        return new ManyGrammar(grammar);
    }

    public static final Grammar maybe(Grammar grammar) {
        m.e(grammar, "grammar");
        return new MaybeGrammar(grammar);
    }

    public static final Grammar maybe$lambda$0(j jVar) {
        GrammarBuilder grammarBuilder = new GrammarBuilder();
        jVar.invoke(grammarBuilder);
        return maybe(grammarBuilder.build());
    }

    public static final Grammar named(Grammar grammar, String name) {
        m.e(grammar, "<this>");
        m.e(name, "name");
        return new NamedGrammar(name, grammar);
    }

    public static final Grammar or(Grammar grammar, Grammar grammar2) {
        m.e(grammar, "<this>");
        m.e(grammar2, "grammar");
        return new OrGrammar(p.B0(grammar, grammar2));
    }

    public static final Grammar then(String str, Grammar grammar) {
        m.e(str, "<this>");
        m.e(grammar, "grammar");
        return then(new StringGrammar(str), grammar);
    }

    public static final Grammar to(char c9, char c10) {
        return new RangeGrammar(c9, c10);
    }

    public static final Grammar maybe(String value) {
        m.e(value, "value");
        return new MaybeGrammar(new StringGrammar(value));
    }

    public static final Grammar or(Grammar grammar, String value) {
        m.e(grammar, "<this>");
        m.e(value, "value");
        return or(grammar, new StringGrammar(value));
    }

    public static final Grammar then(Grammar grammar, Grammar grammar2) {
        m.e(grammar, "<this>");
        m.e(grammar2, "grammar");
        return new SequenceGrammar(p.B0(grammar, grammar2));
    }

    public static final Function0 maybe(j block) {
        m.e(block, "block");
        return new E(12, block);
    }

    public static final Grammar or(String str, Grammar grammar) {
        m.e(str, "<this>");
        m.e(grammar, "grammar");
        return or(new StringGrammar(str), grammar);
    }

    public static final Grammar then(Grammar grammar, String value) {
        m.e(grammar, "<this>");
        m.e(value, "value");
        return then(grammar, new StringGrammar(value));
    }
}
