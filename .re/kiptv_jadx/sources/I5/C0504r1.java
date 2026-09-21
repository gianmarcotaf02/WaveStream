package I5;

/* JADX INFO: renamed from: I5.r1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0504r1 implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f5340h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.kiptv.core.model.XtreamCategory f5341i;
    public final /* synthetic */ p175v0.y j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f5342k;

    public /* synthetic */ C0504r1(com.kiptv.core.model.XtreamCategory xtreamCategory, p175v0.y yVar, java.lang.Object obj, int i3) {
        this.f5340h = i3;
        this.f5341i = xtreamCategory;
        this.j = yVar;
        this.f5342k = obj;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        switch (this.f5340h) {
            case 0:
                com.kiptv.core.model.XtreamSeries it = (com.kiptv.core.model.XtreamSeries) obj;
                kotlin.jvm.internal.m.e(it, "it");
                if (kotlin.jvm.internal.m.a(this.f5342k, "cat-" + this.f5341i.f20649a + ":" + it.f20684c)) {
                    return this.j;
                }
                return null;
            default:
                com.kiptv.core.model.XtreamVODStream it2 = (com.kiptv.core.model.XtreamVODStream) obj;
                kotlin.jvm.internal.m.e(it2, "it");
                if (kotlin.jvm.internal.m.a(this.f5342k, "cat-" + this.f5341i.f20649a + ":" + it2.f20725d)) {
                    return this.j;
                }
                return null;
        }
    }
}
