package io.ktor.http.parsing;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\b\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lio/ktor/http/parsing/Grammar;", "", "offset", "Lh6/A;", "printDebug", "(Lio/ktor/http/parsing/Grammar;I)V", "", "node", "printlnWithOffset", "(ILjava/lang/Object;)V", "ktor-http"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class DebugKt {
    public static final void printDebug(io.ktor.http.parsing.Grammar grammar, int i3) {
        kotlin.jvm.internal.m.e(grammar, "<this>");
        if (grammar instanceof io.ktor.http.parsing.StringGrammar) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("STRING[");
            java.lang.String literal = ((io.ktor.http.parsing.StringGrammar) grammar).getValue();
            kotlin.jvm.internal.m.e(literal, "literal");
            java.lang.String strQuote = java.util.regex.Pattern.quote(literal);
            kotlin.jvm.internal.m.d(strQuote, "quote(...)");
            sb.append(strQuote);
            sb.append(']');
            printlnWithOffset(i3, sb.toString());
            return;
        }
        if (grammar instanceof io.ktor.http.parsing.RawGrammar) {
            printlnWithOffset(i3, "STRING[" + ((io.ktor.http.parsing.RawGrammar) grammar).getValue() + ']');
            return;
        }
        if (grammar instanceof io.ktor.http.parsing.NamedGrammar) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("NAMED[");
            io.ktor.http.parsing.NamedGrammar namedGrammar = (io.ktor.http.parsing.NamedGrammar) grammar;
            sb2.append(namedGrammar.getName());
            sb2.append(']');
            printlnWithOffset(i3, sb2.toString());
            printDebug(namedGrammar.getGrammar(), i3 + 2);
            return;
        }
        if (grammar instanceof io.ktor.http.parsing.SequenceGrammar) {
            printlnWithOffset(i3, "SEQUENCE");
            java.util.Iterator<T> it = ((io.ktor.http.parsing.SequenceGrammar) grammar).getGrammars().iterator();
            while (it.hasNext()) {
                printDebug((io.ktor.http.parsing.Grammar) it.next(), i3 + 2);
            }
            return;
        }
        if (grammar instanceof io.ktor.http.parsing.OrGrammar) {
            printlnWithOffset(i3, "OR");
            java.util.Iterator<T> it2 = ((io.ktor.http.parsing.OrGrammar) grammar).getGrammars().iterator();
            while (it2.hasNext()) {
                printDebug((io.ktor.http.parsing.Grammar) it2.next(), i3 + 2);
            }
            return;
        }
        if (grammar instanceof io.ktor.http.parsing.MaybeGrammar) {
            printlnWithOffset(i3, "MAYBE");
            printDebug(((io.ktor.http.parsing.MaybeGrammar) grammar).getGrammar(), i3 + 2);
            return;
        }
        if (grammar instanceof io.ktor.http.parsing.ManyGrammar) {
            printlnWithOffset(i3, "MANY");
            printDebug(((io.ktor.http.parsing.ManyGrammar) grammar).getGrammar(), i3 + 2);
            return;
        }
        if (grammar instanceof io.ktor.http.parsing.AtLeastOne) {
            printlnWithOffset(i3, "MANY_NOT_EMPTY");
            printDebug(((io.ktor.http.parsing.AtLeastOne) grammar).getGrammar(), i3 + 2);
            return;
        }
        if (grammar instanceof io.ktor.http.parsing.AnyOfGrammar) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("ANY_OF[");
            java.lang.String literal2 = ((io.ktor.http.parsing.AnyOfGrammar) grammar).getValue();
            kotlin.jvm.internal.m.e(literal2, "literal");
            java.lang.String strQuote2 = java.util.regex.Pattern.quote(literal2);
            kotlin.jvm.internal.m.d(strQuote2, "quote(...)");
            sb3.append(strQuote2);
            sb3.append(']');
            printlnWithOffset(i3, sb3.toString());
            return;
        }
        if (!(grammar instanceof io.ktor.http.parsing.RangeGrammar)) {
            throw new I3.b();
        }
        java.lang.StringBuilder sb4 = new java.lang.StringBuilder("RANGE[");
        io.ktor.http.parsing.RangeGrammar rangeGrammar = (io.ktor.http.parsing.RangeGrammar) grammar;
        sb4.append(rangeGrammar.getFrom());
        sb4.append('-');
        sb4.append(rangeGrammar.getTo());
        sb4.append(']');
        printlnWithOffset(i3, sb4.toString());
    }

    public static /* synthetic */ void printDebug$default(io.ktor.http.parsing.Grammar grammar, int i3, int i9, java.lang.Object obj) {
        if ((i9 & 1) != 0) {
            i3 = 0;
        }
        printDebug(grammar, i3);
    }

    private static final void printlnWithOffset(int i3, java.lang.Object obj) {
        java.lang.System.out.println((java.lang.Object) (O7.x.u0(i3, io.ktor.sse.ServerSentEventKt.SPACE) + (i3 / 2) + ": " + obj));
    }
}
