package W6;

/* JADX INFO: loaded from: classes4.dex */
public final class t {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final W6.t f10679c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final W6.v f10680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f10681b;

    static {
        p101l7.c cVar = W6.q.f10670a;
        p070h6.g configuredKotlinVersion = p070h6.g.f22532l;
        kotlin.jvm.internal.m.e(configuredKotlinVersion, "configuredKotlinVersion");
        W6.r rVar = W6.q.f10673d;
        p070h6.g gVar = rVar.f10676b;
        W6.B globalReportLevel = (gVar == null || gVar.f22535k - configuredKotlinVersion.f22535k > 0) ? rVar.f10675a : rVar.f10677c;
        kotlin.jvm.internal.m.e(globalReportLevel, "globalReportLevel");
        W6.v vVar = new W6.v(globalReportLevel, globalReportLevel == W6.B.WARN ? null : globalReportLevel);
        W6.s sVar = W6.s.f10678h;
        f10679c = new W6.t(vVar);
    }

    public t(W6.v vVar) {
        W6.s sVar = W6.s.f10678h;
        this.f10680a = vVar;
        this.f10681b = vVar.f10686d || sVar.invoke(W6.q.f10670a) == W6.B.IGNORE;
    }

    public final java.lang.String toString() {
        return "JavaTypeEnhancementState(jsr305=" + this.f10680a + ", getReportLevelForAnnotation=" + W6.s.f10678h + ')';
    }
}
