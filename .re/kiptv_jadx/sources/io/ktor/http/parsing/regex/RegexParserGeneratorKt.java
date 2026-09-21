package io.ktor.http.parsing.regex;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010!\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001aA\u0010\r\u001a\u00020\f*\u00020\u00002\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00042\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a5\u0010\u0012\u001a\u00020\u0011*\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00042\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lio/ktor/http/parsing/Grammar;", "Lio/ktor/http/parsing/Parser;", "buildRegexParser", "(Lio/ktor/http/parsing/Grammar;)Lio/ktor/http/parsing/Parser;", "", "", "", "", "groups", "offset", "", "shouldGroup", "Lio/ktor/http/parsing/regex/GrammarRegex;", "toRegex", "(Lio/ktor/http/parsing/Grammar;Ljava/util/Map;IZ)Lio/ktor/http/parsing/regex/GrammarRegex;", com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt.JSON_NAME_KEY, "value", "Lh6/A;", "add", "(Ljava/util/Map;Ljava/lang/String;I)V", "ktor-http"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class RegexParserGeneratorKt {
    private static final void add(java.util.Map<java.lang.String, java.util.List<java.lang.Integer>> map, java.lang.String str, int i3) {
        if (!map.containsKey(str)) {
            map.put(str, new java.util.ArrayList());
        }
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(i3);
        java.util.List<java.lang.Integer> list = map.get(str);
        kotlin.jvm.internal.m.b(list);
        list.add(numValueOf);
    }

    public static final io.ktor.http.parsing.Parser buildRegexParser(io.ktor.http.parsing.Grammar grammar) {
        kotlin.jvm.internal.m.e(grammar, "<this>");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        return new io.ktor.http.parsing.regex.RegexParser(new O7.o(toRegex$default(grammar, linkedHashMap, 0, false, 6, null).getRegex()), linkedHashMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final io.ktor.http.parsing.regex.GrammarRegex toRegex(io.ktor.http.parsing.Grammar grammar, java.util.Map<java.lang.String, java.util.List<java.lang.Integer>> map, int i3, boolean z6) {
        char c9;
        if (grammar instanceof io.ktor.http.parsing.StringGrammar) {
            java.lang.String literal = ((io.ktor.http.parsing.StringGrammar) grammar).getValue();
            kotlin.jvm.internal.m.e(literal, "literal");
            java.lang.String strQuote = java.util.regex.Pattern.quote(literal);
            kotlin.jvm.internal.m.d(strQuote, "quote(...)");
            return new io.ktor.http.parsing.regex.GrammarRegex(strQuote, 0, false, 6, null);
        }
        if (grammar instanceof io.ktor.http.parsing.RawGrammar) {
            return new io.ktor.http.parsing.regex.GrammarRegex(((io.ktor.http.parsing.RawGrammar) grammar).getValue(), 0, false, 6, null);
        }
        if (grammar instanceof io.ktor.http.parsing.NamedGrammar) {
            io.ktor.http.parsing.NamedGrammar namedGrammar = (io.ktor.http.parsing.NamedGrammar) grammar;
            io.ktor.http.parsing.regex.GrammarRegex regex$default = toRegex$default(namedGrammar.getGrammar(), map, i3 + 1, false, 4, null);
            add(map, namedGrammar.getName(), i3);
            return new io.ktor.http.parsing.regex.GrammarRegex(regex$default.getRegex(), regex$default.getGroupsCount(), true);
        }
        if (grammar instanceof io.ktor.http.parsing.ComplexGrammar) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            int groupsCount = z6 ? i3 + 1 : i3;
            int i9 = 0;
            for (java.lang.Object obj : ((io.ktor.http.parsing.ComplexGrammar) grammar).getGrammars()) {
                int i10 = i9 + 1;
                if (i9 < 0) {
                    p078i6.p.H0();
                    throw null;
                }
                io.ktor.http.parsing.regex.GrammarRegex regex = toRegex((io.ktor.http.parsing.Grammar) obj, map, groupsCount, true);
                if (i9 != 0 && (grammar instanceof io.ktor.http.parsing.OrGrammar)) {
                    sb.append("|");
                }
                sb.append(regex.getRegex());
                groupsCount += regex.getGroupsCount();
                i9 = i10;
            }
            int i11 = groupsCount - i3;
            if (z6) {
                i11--;
            }
            java.lang.String string = sb.toString();
            kotlin.jvm.internal.m.d(string, "toString(...)");
            return new io.ktor.http.parsing.regex.GrammarRegex(string, i11, z6);
        }
        if (grammar instanceof io.ktor.http.parsing.SimpleGrammar) {
            if (grammar instanceof io.ktor.http.parsing.MaybeGrammar) {
                c9 = '?';
            } else if (grammar instanceof io.ktor.http.parsing.ManyGrammar) {
                c9 = io.ktor.util.date.GMTDateParser.ANY;
            } else {
                if (!(grammar instanceof io.ktor.http.parsing.AtLeastOne)) {
                    throw new java.lang.IllegalStateException(("Unsupported simple grammar element: " + grammar).toString());
                }
                c9 = '+';
            }
            io.ktor.http.parsing.regex.GrammarRegex regex2 = toRegex(((io.ktor.http.parsing.SimpleGrammar) grammar).getGrammar(), map, i3, true);
            return new io.ktor.http.parsing.regex.GrammarRegex(Y6.f.l(new java.lang.StringBuilder(), regex2.getRegex(), c9), regex2.getGroupsCount(), false, 4, null);
        }
        if (grammar instanceof io.ktor.http.parsing.AnyOfGrammar) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("[");
            java.lang.String literal2 = ((io.ktor.http.parsing.AnyOfGrammar) grammar).getValue();
            kotlin.jvm.internal.m.e(literal2, "literal");
            java.lang.String strQuote2 = java.util.regex.Pattern.quote(literal2);
            kotlin.jvm.internal.m.d(strQuote2, "quote(...)");
            sb2.append(strQuote2);
            sb2.append(']');
            return new io.ktor.http.parsing.regex.GrammarRegex(sb2.toString(), 0, false, 6, null);
        }
        if (!(grammar instanceof io.ktor.http.parsing.RangeGrammar)) {
            throw new java.lang.IllegalStateException(("Unsupported grammar element: " + grammar).toString());
        }
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("[");
        io.ktor.http.parsing.RangeGrammar rangeGrammar = (io.ktor.http.parsing.RangeGrammar) grammar;
        sb3.append(rangeGrammar.getFrom());
        sb3.append('-');
        sb3.append(rangeGrammar.getTo());
        sb3.append(']');
        return new io.ktor.http.parsing.regex.GrammarRegex(sb3.toString(), 0, false, 6, null);
    }

    public static /* synthetic */ io.ktor.http.parsing.regex.GrammarRegex toRegex$default(io.ktor.http.parsing.Grammar grammar, java.util.Map map, int i3, boolean z6, int i9, java.lang.Object obj) {
        if ((i9 & 2) != 0) {
            i3 = 1;
        }
        if ((i9 & 4) != 0) {
            z6 = false;
        }
        return toRegex(grammar, map, i3, z6);
    }
}
