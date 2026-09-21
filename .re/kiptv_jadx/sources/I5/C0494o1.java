package I5;

/* JADX INFO: renamed from: I5.o1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0494o1 implements p194x6.j {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final I5.C0494o1 f5301i = new I5.C0494o1(0);
    public static final I5.C0494o1 j = new I5.C0494o1(1);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f5302h;

    public /* synthetic */ C0494o1(int i3) {
        this.f5302h = i3;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        switch (this.f5302h) {
            case 0:
                com.kiptv.core.model.XtreamSeries it = (com.kiptv.core.model.XtreamSeries) obj;
                kotlin.jvm.internal.m.e(it, "it");
                return java.lang.Integer.valueOf(it.f20684c);
            default:
                com.kiptv.core.model.XtreamSeries it2 = (com.kiptv.core.model.XtreamSeries) obj;
                kotlin.jvm.internal.m.e(it2, "it");
                return it2.f20683b;
        }
    }
}
