package X2;

import S7.C0895k;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC1540w;
import p070h6.A;

public final class g implements DefaultLifecycleObserver {

    public final C0895k f10831h;

    public g(C0895k c0895k) {
        this.f10831h = c0895k;
    }

    @Override
    public final void onStart(InterfaceC1540w interfaceC1540w) {
        this.f10831h.resumeWith(A.f22523a);
    }
}
