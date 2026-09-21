package p103m;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
import p008a8.c;
import p095l.l;
import p095l.n;

public final class G0 extends B0 implements C0 {

    public static final Method f24913J;

    public c f24914I;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f24913J = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override
    public final void E(l lVar, n nVar) {
        c cVar = this.f24914I;
        if (cVar != null) {
            cVar.E(lVar, nVar);
        }
    }

    @Override
    public final void g(l lVar, n nVar) {
        c cVar = this.f24914I;
        if (cVar != null) {
            cVar.g(lVar, nVar);
        }
    }

    @Override
    public final C2581o0 p(Context context, boolean z6) {
        F0 f9 = new F0(context, z6);
        f9.setHoverListener(this);
        return f9;
    }
}
