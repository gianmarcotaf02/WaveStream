package p072i;

import D1.J;
import D1.U;
import E8.d;
import S2.a;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;

public final class m extends d {

    public final int f22655m;

    public final Object f22656n;

    public m(int i3, Object obj) {
        this.f22655m = i3;
        this.f22656n = obj;
    }

    @Override
    public void b() {
        Object obj = this.f22656n;
        switch (this.f22655m) {
            case 0:
                ((j) obj).f22652i.f22723u.setVisibility(0);
                break;
            case 1:
                v vVar = (v) obj;
                vVar.f22723u.setVisibility(0);
                if (vVar.f22723u.getParent() instanceof View) {
                    View view = (View) vVar.f22723u.getParent();
                    WeakHashMap weakHashMap = U.f1980a;
                    J.c(view);
                }
                break;
        }
    }

    @Override
    public final void c() {
        Object obj = this.f22656n;
        switch (this.f22655m) {
            case 0:
                v vVar = ((j) obj).f22652i;
                vVar.f22723u.setAlpha(1.0f);
                vVar.f22726x.d(null);
                vVar.f22726x = null;
                break;
            case 1:
                v vVar2 = (v) obj;
                vVar2.f22723u.setAlpha(1.0f);
                vVar2.f22726x.d(null);
                vVar2.f22726x = null;
                break;
            default:
                a aVar = (a) obj;
                ((v) aVar.j).f22723u.setVisibility(8);
                v vVar3 = (v) aVar.j;
                PopupWindow popupWindow = vVar3.f22724v;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (vVar3.f22723u.getParent() instanceof View) {
                    View view = (View) vVar3.f22723u.getParent();
                    WeakHashMap weakHashMap = U.f1980a;
                    J.c(view);
                }
                vVar3.f22723u.e();
                vVar3.f22726x.d(null);
                vVar3.f22726x = null;
                ViewGroup viewGroup = vVar3.f22684A;
                WeakHashMap weakHashMap2 = U.f1980a;
                J.c(viewGroup);
                break;
        }
    }
}
