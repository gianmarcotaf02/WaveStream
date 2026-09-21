package D1;

import android.view.View;
import java.lang.ref.WeakReference;

public final class C0216c0 {

    public final WeakReference f2000a;

    public C0216c0(View view) {
        this.f2000a = new WeakReference(view);
    }

    public final void a(float f9) {
        View view = (View) this.f2000a.get();
        if (view != null) {
            view.animate().alpha(f9);
        }
    }

    public final void b() {
        View view = (View) this.f2000a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void c(long j) {
        View view = (View) this.f2000a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
    }

    public final void d(InterfaceC0218d0 interfaceC0218d0) {
        View view = (View) this.f2000a.get();
        if (view != null) {
            if (interfaceC0218d0 != null) {
                view.animate().setListener(new C0214b0(interfaceC0218d0, view, 0));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void e(float f9) {
        View view = (View) this.f2000a.get();
        if (view != null) {
            view.animate().translationY(f9);
        }
    }
}
