package io.ktor.http.parsing;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lio/ktor/http/parsing/OrGrammar;", "Lio/ktor/http/parsing/Grammar;", "Lio/ktor/http/parsing/ComplexGrammar;", "", "sourceGrammars", "<init>", "(Ljava/util/List;)V", "grammars", "Ljava/util/List;", "getGrammars", "()Ljava/util/List;", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class OrGrammar extends io.ktor.http.parsing.Grammar implements io.ktor.http.parsing.ComplexGrammar {
    private final java.util.List<io.ktor.http.parsing.Grammar> grammars;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrGrammar(java.util.List<? extends io.ktor.http.parsing.Grammar> sourceGrammars) {
        super(null);
        kotlin.jvm.internal.m.e(sourceGrammars, "sourceGrammars");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : sourceGrammars) {
            if (obj instanceof io.ktor.http.parsing.OrGrammar) {
                p078i6.u.M0(arrayList, ((io.ktor.http.parsing.ComplexGrammar) obj).getGrammars());
            } else {
                arrayList.add(obj);
            }
        }
        this.grammars = arrayList;
    }

    @Override // io.ktor.http.parsing.ComplexGrammar
    public java.util.List<io.ktor.http.parsing.Grammar> getGrammars() {
        return this.grammars;
    }
}
