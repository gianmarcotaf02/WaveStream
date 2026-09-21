package H5;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class N implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f4117h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p175v0.y f4118i;
    public final /* synthetic */ java.lang.Object j;

    public /* synthetic */ N(p175v0.y yVar, java.lang.Object obj, int i3) {
        this.f4117h = i3;
        this.f4118i = yVar;
        this.j = obj;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        switch (this.f4117h) {
            case 0:
                java.lang.String key = (java.lang.String) obj;
                kotlin.jvm.internal.m.e(key, "key");
                if (kotlin.jvm.internal.m.a(this.j, key)) {
                    return this.f4118i;
                }
                return null;
            case 1:
                com.kiptv.core.model.XtreamSeries it = (com.kiptv.core.model.XtreamSeries) obj;
                kotlin.jvm.internal.m.e(it, "it");
                if (kotlin.jvm.internal.m.a(this.j, "recent:" + it.f20684c)) {
                    return this.f4118i;
                }
                return null;
            default:
                com.kiptv.core.model.XtreamVODStream it2 = (com.kiptv.core.model.XtreamVODStream) obj;
                kotlin.jvm.internal.m.e(it2, "it");
                if (kotlin.jvm.internal.m.a(this.j, "recent:" + it2.f20725d)) {
                    return this.f4118i;
                }
                return null;
        }
    }
}
