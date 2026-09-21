package y5;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class i implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f31909h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f31910i;
    public final /* synthetic */ y5.B j;

    public /* synthetic */ i(java.util.Map map, y5.B b9, int i3) {
        this.f31909h = i3;
        this.f31910i = map;
        this.j = b9;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        switch (this.f31909h) {
            case 0:
                kotlin.jvm.internal.m.e((p175v0.C2906a) obj, "<this>");
                p175v0.y yVar = (p175v0.y) this.f31910i.get(this.j);
                if (yVar != null) {
                    p175v0.y.a(yVar);
                }
                break;
            default:
                p175v0.r focusProperties = (p175v0.r) obj;
                kotlin.jvm.internal.m.e(focusProperties, "$this$focusProperties");
                focusProperties.c(new y5.i(this.f31910i, this.j, 0));
                break;
        }
        return p070h6.A.f22523a;
    }
}
