package W6;

public final class s extends kotlin.jvm.internal.j implements p194x6.j {

    public static final s f10678h = new s(1, q.class, "getDefaultReportLevelForAnnotation", "getDefaultReportLevelForAnnotation(Lorg/jetbrains/kotlin/name/FqName;)Lorg/jetbrains/kotlin/load/java/ReportLevel;", 1);

    @Override
    public final Object invoke(Object obj) {
        p101l7.c p2 = (p101l7.c) obj;
        kotlin.jvm.internal.m.e(p2, "p0");
        p101l7.c cVar = q.f10670a;
        A.f10607e.getClass();
        S2.a configuredReportLevels = z.f10719b;
        p070h6.g gVar = new p070h6.g(1, 7, 20);
        kotlin.jvm.internal.m.e(configuredReportLevels, "configuredReportLevels");
        B b9 = (B) ((B7.j) configuredReportLevels.j).invoke(p2);
        if (b9 != null) {
            return b9;
        }
        S2.a aVar = q.f10672c;
        aVar.getClass();
        r rVar = (r) ((B7.j) aVar.j).invoke(p2);
        if (rVar == null) {
            return B.IGNORE;
        }
        p070h6.g gVar2 = rVar.f10676b;
        return (gVar2 == null || gVar2.f22535k - gVar.f22535k > 0) ? rVar.f10675a : rVar.f10677c;
    }
}
