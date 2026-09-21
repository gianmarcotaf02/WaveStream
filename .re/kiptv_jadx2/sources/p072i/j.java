package p072i;

import D1.C0216c0;
import D1.U;
import android.view.ViewGroup;

public final class j implements Runnable {

    public final int f22651h;

    public final v f22652i;

    public j(v vVar, int i3) {
        this.f22651h = i3;
        this.f22652i = vVar;
    }

    @Override
    public final void run() {
        ViewGroup viewGroup;
        switch (this.f22651h) {
            case 0:
                v vVar = this.f22652i;
                if ((vVar.f22705Z & 1) != 0) {
                    vVar.j(0);
                }
                if ((vVar.f22705Z & 4096) != 0) {
                    vVar.j(108);
                }
                vVar.f22704Y = false;
                vVar.f22705Z = 0;
                break;
            default:
                v vVar2 = this.f22652i;
                vVar2.f22724v.showAtLocation(vVar2.f22723u, 55, 0, 0);
                C0216c0 c0216c0 = vVar2.f22726x;
                if (c0216c0 != null) {
                    c0216c0.b();
                }
                if (!(vVar2.f22727z && (viewGroup = vVar2.f22684A) != null && viewGroup.isLaidOut())) {
                    vVar2.f22723u.setAlpha(1.0f);
                    vVar2.f22723u.setVisibility(0);
                } else {
                    vVar2.f22723u.setAlpha(0.0f);
                    C0216c0 c0216c0A = U.a(vVar2.f22723u);
                    c0216c0A.a(1.0f);
                    vVar2.f22726x = c0216c0A;
                    c0216c0A.d(new m(0, this));
                }
                break;
        }
    }
}
