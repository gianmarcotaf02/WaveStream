package p095l;

/* JADX INFO: renamed from: l.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC2547d implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f24595h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f24596i;

    public /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC2547d(int i3, java.lang.Object obj) {
        this.f24595h = i3;
        this.f24596i = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.f24595h) {
            case 0:
                p095l.f fVar = (p095l.f) this.f24596i;
                if (fVar.a()) {
                    java.util.ArrayList arrayList = fVar.f24612o;
                    if (arrayList.size() > 0 && !((p095l.e) arrayList.get(0)).f24597a.f24883E) {
                        android.view.View view = fVar.f24619v;
                        if (view != null && view.isShown()) {
                            java.util.Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((p095l.e) it.next()).f24597a.e();
                            }
                        } else {
                            fVar.dismiss();
                        }
                        break;
                    }
                }
                break;
            case 1:
                p095l.C c9 = (p095l.C) this.f24596i;
                if (c9.a()) {
                    p103m.G0 g9 = c9.f24566o;
                    if (!g9.f24883E) {
                        android.view.View view2 = c9.f24571t;
                        if (view2 != null && view2.isShown()) {
                            g9.e();
                        } else {
                            c9.dismiss();
                        }
                    }
                }
                break;
            case 2:
                p103m.O o8 = (p103m.O) this.f24596i;
                if (!o8.getInternalPopup().a()) {
                    o8.f24954m.m(o8.getTextDirection(), o8.getTextAlignment());
                }
                android.view.ViewTreeObserver viewTreeObserver = o8.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                }
                break;
            default:
                p103m.L l2 = (p103m.L) this.f24596i;
                p103m.O o9 = l2.f24941M;
                l2.getClass();
                if (o9.isAttachedToWindow() && o9.getGlobalVisibleRect(l2.f24939K)) {
                    l2.r();
                    l2.e();
                } else {
                    l2.dismiss();
                }
                break;
        }
    }
}
