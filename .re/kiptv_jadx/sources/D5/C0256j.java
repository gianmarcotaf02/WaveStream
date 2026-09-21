package D5;

/* JADX INFO: renamed from: D5.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C0256j implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f2308h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f2309i;

    public /* synthetic */ C0256j(java.util.Map map, int i3) {
        this.f2308h = i3;
        this.f2309i = map;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        switch (this.f2308h) {
            case 0:
                kotlin.jvm.internal.m.e((p175v0.C2906a) obj, "<this>");
                p175v0.y yVar = (p175v0.y) this.f2309i.get(C5.U.f1139h);
                if (yVar != null) {
                    p175v0.y.a(yVar);
                }
                break;
            default:
                p175v0.r focusProperties = (p175v0.r) obj;
                kotlin.jvm.internal.m.e(focusProperties, "$this$focusProperties");
                focusProperties.c(new D5.C0256j(this.f2309i, 0));
                break;
        }
        return p070h6.A.f22523a;
    }
}
