package p193x5;

/* JADX INFO: renamed from: x5.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3106a0 implements kotlin.jvm.functions.Function0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f31420h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p194x6.j f31421i;
    public final /* synthetic */ com.kiptv.core.model.XtreamCategory j;

    public /* synthetic */ C3106a0(p194x6.j jVar, com.kiptv.core.model.XtreamCategory xtreamCategory, int i3) {
        this.f31420h = i3;
        this.f31421i = jVar;
        this.j = xtreamCategory;
    }

    @Override // kotlin.jvm.functions.Function0
    public final java.lang.Object invoke() {
        switch (this.f31420h) {
            case 0:
                this.f31421i.invoke(this.j);
                break;
            default:
                this.f31421i.invoke(new p193x5.C3129m(this.j.f20649a));
                break;
        }
        return p070h6.A.f22523a;
    }
}
