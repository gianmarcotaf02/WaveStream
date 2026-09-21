package p103m;

/* JADX INFO: renamed from: m.x0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC2598x0 implements java.lang.Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f25148h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p103m.B0 f25149i;

    public /* synthetic */ RunnableC2598x0(p103m.B0 b9, int i3) {
        this.f25148h = i3;
        this.f25149i = b9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f25148h) {
            case 0:
                p103m.C2581o0 c2581o0 = this.f25149i.j;
                if (c2581o0 != null) {
                    c2581o0.setListSelectionHidden(true);
                    c2581o0.requestLayout();
                }
                break;
            default:
                p103m.B0 b9 = this.f25149i;
                p103m.C2581o0 c2581o1 = b9.j;
                if (c2581o1 != null && c2581o1.isAttachedToWindow() && b9.j.getCount() > b9.j.getChildCount() && b9.j.getChildCount() <= b9.f24896t) {
                    b9.f24884F.setInputMethodMode(2);
                    b9.e();
                    break;
                }
                break;
        }
    }
}
