package W6;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class s extends kotlin.jvm.internal.j implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final W6.s f10678h = new W6.s(1, W6.q.class, "getDefaultReportLevelForAnnotation", "getDefaultReportLevelForAnnotation(Lorg/jetbrains/kotlin/name/FqName;)Lorg/jetbrains/kotlin/load/java/ReportLevel;", 1);

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        p101l7.c p2 = (p101l7.c) obj;
        kotlin.jvm.internal.m.e(p2, "p0");
        p101l7.c cVar = W6.q.f10670a;
        W6.A.f10607e.getClass();
        S2.a configuredReportLevels = W6.z.f10719b;
        p070h6.g gVar = new p070h6.g(1, 7, 20);
        kotlin.jvm.internal.m.e(configuredReportLevels, "configuredReportLevels");
        W6.B b9 = (W6.B) ((B7.j) configuredReportLevels.j).invoke(p2);
        if (b9 != null) {
            return b9;
        }
        S2.a aVar = W6.q.f10672c;
        aVar.getClass();
        W6.r rVar = (W6.r) ((B7.j) aVar.j).invoke(p2);
        if (rVar == null) {
            return W6.B.IGNORE;
        }
        p070h6.g gVar2 = rVar.f10676b;
        return (gVar2 == null || gVar2.f22535k - gVar.f22535k > 0) ? rVar.f10675a : rVar.f10677c;
    }
}
