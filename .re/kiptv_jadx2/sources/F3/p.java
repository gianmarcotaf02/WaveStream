package F3;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicReference;
import p136q.C2662f;

public final class p implements DialogInterface.OnCancelListener {

    public final Object f3612h;

    public volatile boolean f3613i;
    public final AtomicReference j;

    public final Z3.d f3614k;

    public final D3.e f3615l;

    public final C2662f f3616m;

    public final C0366f f3617n;

    public p(InterfaceC0367g interfaceC0367g, C0366f c0366f) {
        D3.e eVar = D3.e.f2106d;
        this.f3612h = interfaceC0367g;
        this.j = new AtomicReference(null);
        this.f3614k = new Z3.d(Looper.getMainLooper(), 0);
        this.f3615l = eVar;
        this.f3616m = new C2662f(0);
        this.f3617n = c0366f;
        interfaceC0367g.h(this);
    }

    public final Activity a() {
        Activity activityF = this.f3612h.f();
        H3.q.g(activityF);
        return activityF;
    }

    public final void b(Bundle bundle) {
        if (bundle != null) {
            this.j.set(bundle.getBoolean("resolving_error", false) ? new I(new D3.b(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution"), null), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    public final void c() {
        this.f3613i = false;
        C0366f c0366f = this.f3617n;
        c0366f.getClass();
        synchronized (C0366f.y) {
            try {
                if (c0366f.f3593r == this) {
                    c0366f.f3593r = null;
                    c0366f.f3594s.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        if (this.f3616m.isEmpty()) {
            return;
        }
        this.f3617n.a(this);
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        D3.b bVar = new D3.b(13, null, null);
        AtomicReference atomicReference = this.j;
        I i3 = (I) atomicReference.get();
        int i9 = i3 == null ? -1 : i3.f3567a;
        atomicReference.set(null);
        this.f3617n.h(bVar, i9);
    }
}
