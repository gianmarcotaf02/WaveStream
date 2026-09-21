package W6;

public final class t {

    public static final t f10679c;

    public final v f10680a;

    public final boolean f10681b;

    static {
        p101l7.c cVar = q.f10670a;
        p070h6.g configuredKotlinVersion = p070h6.g.f22532l;
        kotlin.jvm.internal.m.e(configuredKotlinVersion, "configuredKotlinVersion");
        r rVar = q.f10673d;
        p070h6.g gVar = rVar.f10676b;
        B globalReportLevel = (gVar == null || gVar.f22535k - configuredKotlinVersion.f22535k > 0) ? rVar.f10675a : rVar.f10677c;
        kotlin.jvm.internal.m.e(globalReportLevel, "globalReportLevel");
        v vVar = new v(globalReportLevel, globalReportLevel == B.WARN ? null : globalReportLevel);
        s sVar = s.f10678h;
        f10679c = new t(vVar);
    }

    public t(v vVar) {
        s sVar = s.f10678h;
        this.f10680a = vVar;
        this.f10681b = vVar.f10686d || sVar.invoke(q.f10670a) == B.IGNORE;
    }

    public final String toString() {
        return "JavaTypeEnhancementState(jsr305=" + this.f10680a + ", getReportLevelForAnnotation=" + s.f10678h + ')';
    }
}
