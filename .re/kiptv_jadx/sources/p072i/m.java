package p072i;

/* JADX INFO: loaded from: classes.dex */
public final class m extends E8.d {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f22655m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f22656n;

    public /* synthetic */ m(int i3, java.lang.Object obj) {
        this.f22655m = i3;
        this.f22656n = obj;
    }

    @Override // E8.d, D1.InterfaceC0218d0
    public void b() {
        java.lang.Object obj = this.f22656n;
        switch (this.f22655m) {
            case 0:
                ((p072i.j) obj).f22652i.f22723u.setVisibility(0);
                break;
            case 1:
                p072i.v vVar = (p072i.v) obj;
                vVar.f22723u.setVisibility(0);
                if (vVar.f22723u.getParent() instanceof android.view.View) {
                    android.view.View view = (android.view.View) vVar.f22723u.getParent();
                    java.util.WeakHashMap weakHashMap = D1.U.f1980a;
                    D1.J.c(view);
                }
                break;
        }
    }

    @Override // D1.InterfaceC0218d0
    public final void c() {
        java.lang.Object obj = this.f22656n;
        switch (this.f22655m) {
            case 0:
                p072i.v vVar = ((p072i.j) obj).f22652i;
                vVar.f22723u.setAlpha(1.0f);
                vVar.f22726x.d(null);
                vVar.f22726x = null;
                break;
            case 1:
                p072i.v vVar2 = (p072i.v) obj;
                vVar2.f22723u.setAlpha(1.0f);
                vVar2.f22726x.d(null);
                vVar2.f22726x = null;
                break;
            default:
                S2.a aVar = (S2.a) obj;
                ((p072i.v) aVar.j).f22723u.setVisibility(8);
                p072i.v vVar3 = (p072i.v) aVar.j;
                android.widget.PopupWindow popupWindow = vVar3.f22724v;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (vVar3.f22723u.getParent() instanceof android.view.View) {
                    android.view.View view = (android.view.View) vVar3.f22723u.getParent();
                    java.util.WeakHashMap weakHashMap = D1.U.f1980a;
                    D1.J.c(view);
                }
                vVar3.f22723u.e();
                vVar3.f22726x.d(null);
                vVar3.f22726x = null;
                android.view.ViewGroup viewGroup = vVar3.f22684A;
                java.util.WeakHashMap weakHashMap2 = D1.U.f1980a;
                D1.J.c(viewGroup);
                break;
        }
    }
}
