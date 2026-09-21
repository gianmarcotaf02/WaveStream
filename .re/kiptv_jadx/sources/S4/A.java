package S4;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class A implements p194x6.m {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f9300h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.text.Collator f9301i;

    public /* synthetic */ A(java.text.Collator collator, int i3) {
        this.f9300h = i3;
        this.f9301i = collator;
    }

    @Override // p194x6.m
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.f9300h) {
            case 0:
                return java.lang.Integer.valueOf(this.f9301i.compare(((com.kiptv.core.model.XtreamVODStream) obj).f20723b, ((com.kiptv.core.model.XtreamVODStream) obj2).f20723b));
            case 1:
                return java.lang.Integer.valueOf(this.f9301i.compare(((com.kiptv.core.model.XtreamVODStream) obj2).f20723b, ((com.kiptv.core.model.XtreamVODStream) obj).f20723b));
            case 2:
                return java.lang.Integer.valueOf(this.f9301i.compare(((com.kiptv.core.model.XtreamSeries) obj).f20683b, ((com.kiptv.core.model.XtreamSeries) obj2).f20683b));
            case 3:
                return java.lang.Integer.valueOf(this.f9301i.compare(((com.kiptv.core.model.XtreamSeries) obj2).f20683b, ((com.kiptv.core.model.XtreamSeries) obj).f20683b));
            case 4:
                return java.lang.Integer.valueOf(this.f9301i.compare(((com.kiptv.core.model.XtreamCategory) obj).f20650b, ((com.kiptv.core.model.XtreamCategory) obj2).f20650b));
            case 5:
                return java.lang.Integer.valueOf(this.f9301i.compare(((com.kiptv.core.model.XtreamCategory) obj2).f20650b, ((com.kiptv.core.model.XtreamCategory) obj).f20650b));
            case 6:
                return java.lang.Integer.valueOf(this.f9301i.compare(((S4.p) obj).f9430b, ((S4.p) obj2).f9430b));
            default:
                return java.lang.Integer.valueOf(this.f9301i.compare(((S4.p) obj2).f9430b, ((S4.p) obj).f9430b));
        }
    }
}
