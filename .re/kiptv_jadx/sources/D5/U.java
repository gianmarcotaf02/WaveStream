package D5;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class U implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f2232h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p175v0.y f2233i;

    public /* synthetic */ U(p175v0.y yVar, int i3) {
        this.f2232h = i3;
        this.f2233i = yVar;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        switch (this.f2232h) {
            case 0:
                p175v0.r focusProperties = (p175v0.r) obj;
                kotlin.jvm.internal.m.e(focusProperties, "$this$focusProperties");
                focusProperties.a(new D5.U(this.f2233i, 1));
                break;
            case 1:
                p175v0.C2906a c2906a = (p175v0.C2906a) obj;
                kotlin.jvm.internal.m.e(c2906a, "<this>");
                int i3 = c2906a.f29060a;
                if (i3 == 5) {
                    p175v0.y yVar = this.f2233i;
                    if (yVar != null) {
                        p175v0.y.a(yVar);
                    }
                } else if (i3 == 3 || i3 == 4) {
                    c2906a.f29061b = true;
                }
                break;
            default:
                p175v0.r focusProperties2 = (p175v0.r) obj;
                kotlin.jvm.internal.m.e(focusProperties2, "$this$focusProperties");
                focusProperties2.d(this.f2233i);
                break;
        }
        return p070h6.A.f22523a;
    }
}
