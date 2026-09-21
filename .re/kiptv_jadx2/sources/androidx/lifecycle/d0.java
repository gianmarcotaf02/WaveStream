package androidx.lifecycle;

import android.os.Handler;

public final class d0 {

    public final C1542y f16347a;

    public final Handler f16348b = new Handler();

    public c0 f16349c;

    public d0(AbstractServiceC1543z abstractServiceC1543z) {
        this.f16347a = new C1542y(abstractServiceC1543z);
    }

    public final void a(EnumC1532n enumC1532n) {
        c0 c0Var = this.f16349c;
        if (c0Var != null) {
            c0Var.run();
        }
        c0 c0Var2 = new c0(this.f16347a, enumC1532n);
        this.f16349c = c0Var2;
        this.f16348b.postAtFrontOfQueue(c0Var2);
    }
}
