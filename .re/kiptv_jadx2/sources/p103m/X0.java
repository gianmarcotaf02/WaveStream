package p103m;

import android.content.Context;
import android.view.View;
import android.view.Window;
import p095l.C2544a;

public final class X0 implements View.OnClickListener {

    public final C2544a f24981h;

    public final Y0 f24982i;

    public X0(Y0 y9) {
        this.f24982i = y9;
        Context context = y9.f24989a.getContext();
        CharSequence charSequence = y9.f24995h;
        C2544a c2544a = new C2544a();
        c2544a.f24583e = 4096;
        c2544a.g = 4096;
        c2544a.f24588l = null;
        c2544a.f24589m = null;
        c2544a.f24590n = false;
        c2544a.f24591o = false;
        c2544a.f24592p = 16;
        c2544a.f24586i = context;
        c2544a.f24579a = charSequence;
        this.f24981h = c2544a;
    }

    @Override
    public final void onClick(View view) {
        Y0 y9 = this.f24982i;
        Window.Callback callback = y9.f24997k;
        if (callback == null || !y9.f24998l) {
            return;
        }
        callback.onMenuItemSelected(0, this.f24981h);
    }
}
