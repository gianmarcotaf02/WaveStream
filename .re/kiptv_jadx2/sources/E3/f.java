package E3;

import F3.A;
import F3.C0361a;
import F3.C0362b;
import F3.C0366f;
import F3.C0368h;
import F3.C0369i;
import F3.G;
import F3.J;
import F3.n;
import F3.v;
import H3.q;
import S.p;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import androidx.credentials.playservices.HiddenActivity;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import p136q.C2662f;

public abstract class f {

    public final Context f2829a;

    public final String f2830b;

    public final p f2831c;

    public final b f2832d;

    public final C0362b f2833e;

    public final Looper f2834f;
    public final int g;

    public final v f2835h;

    public final C0361a f2836i;
    public final C0366f j;

    public f(Context context, HiddenActivity hiddenActivity, p pVar, b bVar, e eVar) {
        J j;
        q.h(context, "Null context is not permitted.");
        q.h(pVar, "Api must not be null.");
        q.h(eVar, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        q.h(applicationContext, "The provided context did not have an application context.");
        this.f2829a = applicationContext;
        String attributionTag = Build.VERSION.SDK_INT >= 30 ? context.getAttributionTag() : null;
        this.f2830b = attributionTag;
        this.f2831c = pVar;
        this.f2832d = bVar;
        this.f2834f = eVar.f2828b;
        C0362b c0362b = new C0362b(pVar, bVar, attributionTag);
        this.f2833e = c0362b;
        this.f2835h = new v(this);
        C0366f c0366fG = C0366f.g(applicationContext);
        this.j = c0366fG;
        this.g = c0366fG.f3590o.getAndIncrement();
        this.f2836i = eVar.f2827a;
        if (hiddenActivity != null && Looper.myLooper() == Looper.getMainLooper()) {
            WeakHashMap weakHashMap = J.f3569i;
            WeakReference weakReference = (WeakReference) weakHashMap.get(hiddenActivity);
            if (weakReference == null || (j = (J) weakReference.get()) == null) {
                try {
                    j = (J) hiddenActivity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
                    if (j == null || j.isRemoving()) {
                        j = new J();
                        hiddenActivity.getFragmentManager().beginTransaction().add(j, "LifecycleFragmentImpl").commitAllowingStateLoss();
                    }
                    weakHashMap.put(hiddenActivity, new WeakReference(j));
                } catch (ClassCastException e6) {
                    throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e6);
                }
            }
            F3.p pVarB = j.b();
            if (pVarB == null) {
                Object obj = D3.e.f2105c;
                pVarB = new F3.p(j, c0366fG);
            }
            pVarB.f3616m.add(c0362b);
            c0366fG.a(pVarB);
        }
        Z3.d dVar = c0366fG.f3596u;
        dVar.sendMessage(dVar.obtainMessage(7, this));
    }

    public final android.support.v4.media.session.q a() {
        android.support.v4.media.session.q qVar = new android.support.v4.media.session.q(9, false);
        Set set = Collections.EMPTY_SET;
        if (((C2662f) qVar.f15617i) == null) {
            qVar.f15617i = new C2662f(0);
        }
        ((C2662f) qVar.f15617i).addAll(set);
        Context context = this.f2829a;
        qVar.f15618k = context.getClass().getName();
        qVar.j = context.getPackageName();
        return qVar;
    }

    public final C0369i b(B3.j jVar) {
        Looper looper = this.f2834f;
        q.h(jVar, "Listener must not be null");
        q.h(looper, "Looper must not be null");
        C0369i c0369i = new C0369i();
        new Z3.d(looper, 1);
        q.e("castDeviceControllerListenerKey");
        c0369i.f3599a = new C0368h(jVar);
        return c0369i;
    }

    public final A0.a c(int i3, n nVar) {
        p059g4.d dVar = new p059g4.d();
        C0366f c0366f = this.j;
        c0366f.getClass();
        c0366f.f(dVar, nVar.f3607c, this);
        A a2 = new A(new G(i3, nVar, dVar, this.f2836i), c0366f.f3591p.get(), this);
        Z3.d dVar2 = c0366f.f3596u;
        dVar2.sendMessage(dVar2.obtainMessage(4, a2));
        return dVar.f21865a;
    }
}
