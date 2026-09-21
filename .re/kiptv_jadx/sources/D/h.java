package D;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1691h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1692i;

    public /* synthetic */ h(int i3, java.lang.Object obj) {
        this.f1691h = i3;
        this.f1692i = obj;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.List] */
    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        switch (this.f1691h) {
            case 0:
                ((java.lang.Integer) obj).intValue();
                return this.f1692i;
            default:
                com.kiptv.core.model.ContentTypeSettings it = (com.kiptv.core.model.ContentTypeSettings) obj;
                kotlin.jvm.internal.m.e(it, "it");
                return com.kiptv.core.model.ContentTypeSettings.a(it, null, null, this.f1692i, null, "custom", null, null, null, null, null, null, null, null, null, 16363);
        }
    }
}
