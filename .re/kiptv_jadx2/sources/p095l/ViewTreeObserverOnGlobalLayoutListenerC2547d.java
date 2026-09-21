package p095l;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;
import p103m.G0;
import p103m.L;
import p103m.O;

public final class ViewTreeObserverOnGlobalLayoutListenerC2547d implements ViewTreeObserver.OnGlobalLayoutListener {

    public final int f24595h;

    public final Object f24596i;

    public ViewTreeObserverOnGlobalLayoutListenerC2547d(int i3, Object obj) {
        this.f24595h = i3;
        this.f24596i = obj;
    }

    @Override
    public final void onGlobalLayout() {
        switch (this.f24595h) {
            case 0:
                f fVar = (f) this.f24596i;
                if (fVar.a()) {
                    ArrayList arrayList = fVar.f24612o;
                    if (arrayList.size() > 0 && !((e) arrayList.get(0)).f24597a.f24883E) {
                        View view = fVar.f24619v;
                        if (view != null && view.isShown()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((e) it.next()).f24597a.e();
                            }
                        } else {
                            fVar.dismiss();
                        }
                        break;
                    }
                }
                break;
            case 1:
                C c9 = (C) this.f24596i;
                if (c9.a()) {
                    G0 g9 = c9.f24566o;
                    if (!g9.f24883E) {
                        View view2 = c9.f24571t;
                        if (view2 != null && view2.isShown()) {
                            g9.e();
                        } else {
                            c9.dismiss();
                        }
                    }
                }
                break;
            case 2:
                O o8 = (O) this.f24596i;
                if (!o8.getInternalPopup().a()) {
                    o8.f24954m.m(o8.getTextDirection(), o8.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = o8.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                }
                break;
            default:
                L l2 = (L) this.f24596i;
                O o9 = l2.f24941M;
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
