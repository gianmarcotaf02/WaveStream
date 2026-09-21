package p072i;

import android.view.Window;
import p095l.w;
import p103m.InterfaceC2563f0;

public final class l implements InterfaceC2563f0, w {

    public final v f22654h;

    public l(v vVar) {
        this.f22654h = vVar;
    }

    @Override
    public void c(p095l.l lVar, boolean z6) {
        u uVar;
        p095l.l lVarK = lVar.k();
        int i3 = 0;
        boolean z9 = lVarK != lVar;
        if (z9) {
            lVar = lVarK;
        }
        v vVar = this.f22654h;
        u[] uVarArr = vVar.f22694L;
        int length = uVarArr != null ? uVarArr.length : 0;
        while (true) {
            if (i3 < length) {
                uVar = uVarArr[i3];
                if (uVar != null && uVar.f22673h == lVar) {
                    break;
                } else {
                    i3++;
                }
            } else {
                uVar = null;
                break;
            }
        }
        if (uVar != null) {
            if (!z9) {
                vVar.h(uVar, z6);
            } else {
                vVar.f(uVar.f22667a, uVar, lVarK);
                vVar.h(uVar, true);
            }
        }
    }

    @Override
    public boolean j(p095l.l lVar) {
        Window.Callback callback;
        if (lVar != lVar.k()) {
            return true;
        }
        v vVar = this.f22654h;
        if (!vVar.f22689F || (callback = vVar.f22715m.getCallback()) == null || vVar.f22699Q) {
            return true;
        }
        callback.onMenuOpened(108, lVar);
        return true;
    }
}
