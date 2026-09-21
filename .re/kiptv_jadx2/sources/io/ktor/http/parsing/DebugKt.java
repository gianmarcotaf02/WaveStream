package io.ktor.http.parsing;

import I3.b;
import O7.x;
import androidx.media3.container.NalUnitUtil;
import io.ktor.sse.ServerSentEventKt;
import java.util.Iterator;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\b\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lio/ktor/http/parsing/Grammar;", "", "offset", "Lh6/A;", "printDebug", "(Lio/ktor/http/parsing/Grammar;I)V", "", "node", "printlnWithOffset", "(ILjava/lang/Object;)V", "ktor-http"}, k = 2, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class DebugKt {
    public static final void printDebug(Grammar grammar, int i3) {
        m.e(grammar, "<this>");
        if (grammar instanceof StringGrammar) {
            StringBuilder sb = new StringBuilder("STRING[");
            String literal = ((StringGrammar) grammar).getValue();
            m.e(literal, "literal");
            String strQuote = Pattern.quote(literal);
            m.d(strQuote, "quote(...)");
            sb.append(strQuote);
            sb.append(']');
            printlnWithOffset(i3, sb.toString());
            return;
        }
        if (grammar instanceof RawGrammar) {
            printlnWithOffset(i3, "STRING[" + ((RawGrammar) grammar).getValue() + ']');
            return;
        }
        if (grammar instanceof NamedGrammar) {
            StringBuilder sb2 = new StringBuilder("NAMED[");
            NamedGrammar namedGrammar = (NamedGrammar) grammar;
            sb2.append(namedGrammar.getName());
            sb2.append(']');
            printlnWithOffset(i3, sb2.toString());
            printDebug(namedGrammar.getGrammar(), i3 + 2);
            return;
        }
        if (grammar instanceof SequenceGrammar) {
            printlnWithOffset(i3, "SEQUENCE");
            Iterator<T> it = ((SequenceGrammar) grammar).getGrammars().iterator();
            while (it.hasNext()) {
                printDebug((Grammar) it.next(), i3 + 2);
            }
            return;
        }
        if (grammar instanceof OrGrammar) {
            printlnWithOffset(i3, "OR");
            Iterator<T> it2 = ((OrGrammar) grammar).getGrammars().iterator();
            while (it2.hasNext()) {
                printDebug((Grammar) it2.next(), i3 + 2);
            }
            return;
        }
        if (grammar instanceof MaybeGrammar) {
            printlnWithOffset(i3, "MAYBE");
            printDebug(((MaybeGrammar) grammar).getGrammar(), i3 + 2);
            return;
        }
        if (grammar instanceof ManyGrammar) {
            printlnWithOffset(i3, "MANY");
            printDebug(((ManyGrammar) grammar).getGrammar(), i3 + 2);
            return;
        }
        if (grammar instanceof AtLeastOne) {
            printlnWithOffset(i3, "MANY_NOT_EMPTY");
            printDebug(((AtLeastOne) grammar).getGrammar(), i3 + 2);
            return;
        }
        if (grammar instanceof AnyOfGrammar) {
            StringBuilder sb3 = new StringBuilder("ANY_OF[");
            String literal2 = ((AnyOfGrammar) grammar).getValue();
            m.e(literal2, "literal");
            String strQuote2 = Pattern.quote(literal2);
            m.d(strQuote2, "quote(...)");
            sb3.append(strQuote2);
            sb3.append(']');
            printlnWithOffset(i3, sb3.toString());
            return;
        }
        if (!(grammar instanceof RangeGrammar)) {
            throw new b();
        }
        StringBuilder sb4 = new StringBuilder("RANGE[");
        RangeGrammar rangeGrammar = (RangeGrammar) grammar;
        sb4.append(rangeGrammar.getFrom());
        sb4.append('-');
        sb4.append(rangeGrammar.getTo());
        sb4.append(']');
        printlnWithOffset(i3, sb4.toString());
    }

    public static void printDebug$default(Grammar grammar, int i3, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i3 = 0;
        }
        printDebug(grammar, i3);
    }

    private static final void printlnWithOffset(int i3, Object obj) {
        System.out.println((Object) (x.u0(i3, ServerSentEventKt.SPACE) + (i3 / 2) + ": " + obj));
    }
}
