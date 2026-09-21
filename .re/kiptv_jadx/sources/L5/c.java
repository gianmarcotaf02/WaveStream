package L5;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f7063h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f7064i;
    public final /* synthetic */ p020c0.C1675d0 j;

    public /* synthetic */ c(int i3, p020c0.C1675d0 c1675d0, int i9) {
        this.f7063h = i9;
        this.f7064i = i3;
        this.j = c1675d0;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        int i3 = this.f7063h;
        boolean zBooleanValue = ((java.lang.Boolean) obj).booleanValue();
        switch (i3) {
            case 0:
                int i9 = this.f7064i;
                p020c0.C1675d0 c1675d0 = this.j;
                if (zBooleanValue) {
                    c1675d0.h(i9);
                } else if (c1675d0.g() == i9) {
                    c1675d0.h(0);
                }
                break;
            default:
                if (zBooleanValue) {
                    this.j.h(this.f7064i);
                }
                break;
        }
        return p070h6.A.f22523a;
    }
}
