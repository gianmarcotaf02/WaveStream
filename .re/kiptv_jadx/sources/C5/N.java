package C5;

/* JADX INFO: loaded from: classes4.dex */
public final class N implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1081h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f1082i;

    public /* synthetic */ N(int i3, java.util.ArrayList arrayList) {
        this.f1081h = i3;
        this.f1082i = arrayList;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        switch (this.f1081h) {
            case 0:
                this.f1082i.get(((java.lang.Number) obj).intValue());
                return null;
            case 1:
                this.f1082i.get(((java.lang.Number) obj).intValue());
                return null;
            case 2:
                this.f1082i.get(((java.lang.Number) obj).intValue());
                return null;
            case 3:
                this.f1082i.get(((java.lang.Number) obj).intValue());
                return null;
            case 4:
                this.f1082i.get(((java.lang.Number) obj).intValue());
                return null;
            case 5:
                com.kiptv.core.model.XtreamVODStream m8 = (com.kiptv.core.model.XtreamVODStream) this.f1082i.get(((java.lang.Number) obj).intValue());
                kotlin.jvm.internal.m.e(m8, "m");
                return java.lang.Integer.valueOf(m8.f20725d);
            case 6:
                this.f1082i.get(((java.lang.Number) obj).intValue());
                return null;
            case 7:
                S4.p g = (S4.p) this.f1082i.get(((java.lang.Number) obj).intValue());
                kotlin.jvm.internal.m.e(g, "g");
                return java.lang.Integer.valueOf(g.f9429a);
            default:
                this.f1082i.get(((java.lang.Number) obj).intValue());
                return null;
        }
    }
}
