package p114n2;

import D3.j;
import N7.o;
import Y1.v;
import android.app.Activity;
import android.content.Context;
import com.google.android.gms.internal.play_billing.AbstractC1864o0;
import com.google.common.util.concurrent.D;
import kotlin.jvm.internal.m;
import p108m5.c;
import q2.f;

public final class y {

    public final Context f25683a;

    public final f f25684b;

    public final j f25685c;

    public final Activity f25686d;

    public boolean f25687e;

    public final v f25688f;
    public final boolean g;

    public y(Context context) {
        m.e(context, "context");
        this.f25683a = context;
        this.f25684b = new f(this, new C2652k(this, 0));
        this.f25685c = new j(context, (byte) 0);
        for (Object obj : o.m0(context, new c(7))) {
            if (((Context) obj) instanceof Activity) {
                this.f25686d = (Activity) obj;
                this.f25688f = new v(2, this);
                this.g = true;
                L l2 = this.f25684b.f26611s;
                l2.a(new x(l2));
                this.f25684b.f26611s.a(new C2643b(this.f25683a));
                D.B(new C2652k(this, 1));
            }
        }
        obj = null;
        this.f25686d = (Activity) obj;
        this.f25688f = new v(2, this);
        this.g = true;
        L l9 = this.f25684b.f26611s;
        l9.a(new x(l9));
        this.f25684b.f26611s.a(new C2643b(this.f25683a));
        D.B(new C2652k(this, 1));
    }

    public static void b(y yVar, String route) {
        yVar.getClass();
        m.e(route, "route");
        yVar.f25684b.l(route, null);
    }

    public final void a(String route, p194x6.j jVar) {
        m.e(route, "route");
        f fVar = this.f25684b;
        fVar.getClass();
        fVar.l(route, AbstractC1864o0.k0(jVar));
    }

    public final void c() {
        f fVar = this.f25684b;
        if (fVar.f26600f.isEmpty()) {
            return;
        }
        t tVarG = fVar.g();
        m.b(tVarG);
        if (fVar.n(tVarG.f25671i.f8482a, true, false)) {
            fVar.b();
        }
    }
}
