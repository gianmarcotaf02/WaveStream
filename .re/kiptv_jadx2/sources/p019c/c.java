package p019c;

import kotlin.jvm.internal.m;

public final class c implements Runnable {

    public final int f18030h;

    public final k f18031i;

    public c(k kVar, int i3) {
        this.f18030h = i3;
        this.f18031i = kVar;
    }

    @Override
    public final void run() {
        switch (this.f18030h) {
            case 0:
                this.f18031i.invalidateOptionsMenu();
                return;
            default:
                try {
                    super/*android.app.Activity*/.onBackPressed();
                    return;
                } catch (IllegalStateException e6) {
                    if (!m.a(e6.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        throw e6;
                    }
                    return;
                } catch (NullPointerException e9) {
                    if (!m.a(e9.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        throw e9;
                    }
                    return;
                }
        }
    }
}
