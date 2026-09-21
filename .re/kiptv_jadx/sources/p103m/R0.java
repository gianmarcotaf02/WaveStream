package p103m;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class R0 implements java.lang.Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f24962h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.widget.Toolbar f24963i;

    public /* synthetic */ R0(androidx.appcompat.widget.Toolbar toolbar, int i3) {
        this.f24962h = i3;
        this.f24963i = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f24962h) {
            case 0:
                p103m.T0 t9 = this.f24963i.f15756S;
                p095l.n nVar = t9 == null ? null : t9.f24965i;
                if (nVar != null) {
                    nVar.collapseActionView();
                }
                break;
            default:
                this.f24963i.m();
                break;
        }
    }
}
