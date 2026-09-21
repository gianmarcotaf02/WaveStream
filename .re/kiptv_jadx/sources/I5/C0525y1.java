package I5;

/* JADX INFO: renamed from: I5.y1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C0525y1 implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f5465h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f5466i;
    public final /* synthetic */ p175v0.y j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f5467k;

    public /* synthetic */ C0525y1(java.lang.String str, p175v0.y yVar, java.lang.Object obj, int i3) {
        this.f5465h = i3;
        this.f5466i = str;
        this.j = yVar;
        this.f5467k = obj;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        switch (this.f5465h) {
            case 0:
                com.kiptv.core.model.XtreamSeries it = (com.kiptv.core.model.XtreamSeries) obj;
                kotlin.jvm.internal.m.e(it, "it");
                if (kotlin.jvm.internal.m.a(this.f5467k, this.f5466i + ":" + it.f20684c)) {
                    return this.j;
                }
                return null;
            default:
                com.kiptv.core.model.XtreamVODStream it2 = (com.kiptv.core.model.XtreamVODStream) obj;
                kotlin.jvm.internal.m.e(it2, "it");
                if (kotlin.jvm.internal.m.a(this.f5467k, this.f5466i + ":" + it2.f20725d)) {
                    return this.j;
                }
                return null;
        }
    }
}
