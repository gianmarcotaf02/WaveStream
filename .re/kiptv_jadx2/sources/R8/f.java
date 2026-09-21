package R8;

import java.lang.reflect.Method;
import java.util.concurrent.LinkedBlockingQueue;

public final class f implements P8.b {

    public final String f9086h;

    public volatile P8.b f9087i;
    public Boolean j;

    public Method f9088k;

    public Q8.a f9089l;

    public final LinkedBlockingQueue f9090m;

    public final boolean f9091n;

    public f(String str, LinkedBlockingQueue linkedBlockingQueue, boolean z6) {
        this.f9086h = str;
        this.f9090m = linkedBlockingQueue;
        this.f9091n = z6;
    }

    @Override
    public final boolean a() {
        return k().a();
    }

    @Override
    public final boolean b() {
        return k().b();
    }

    @Override
    public final void c(String str, Throwable th) {
        k().c(str, th);
    }

    @Override
    public final boolean d() {
        return k().d();
    }

    @Override
    public final boolean e() {
        return k().e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && f.class == obj.getClass() && this.f9086h.equals(((f) obj).f9086h);
    }

    @Override
    public final boolean f() {
        return k().f();
    }

    @Override
    public final void g(String str) {
        k().g(str);
    }

    @Override
    public final String getName() {
        return this.f9086h;
    }

    @Override
    public final void h(String str) {
        k().h(str);
    }

    public final int hashCode() {
        return this.f9086h.hashCode();
    }

    @Override
    public final void i(String str) {
        k().i(str);
    }

    @Override
    public final boolean j(int i3) {
        return k().j(i3);
    }

    public final P8.b k() {
        if (this.f9087i != null) {
            return this.f9087i;
        }
        if (this.f9091n) {
            return b.f9080h;
        }
        if (this.f9089l == null) {
            Q8.a aVar = new Q8.a();
            aVar.f8716i = this;
            aVar.f8715h = this.f9086h;
            aVar.j = this.f9090m;
            this.f9089l = aVar;
        }
        return this.f9089l;
    }

    public final boolean l() {
        Boolean bool = this.j;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            this.f9088k = this.f9087i.getClass().getMethod("log", Q8.b.class);
            this.j = Boolean.TRUE;
        } catch (NoSuchMethodException unused) {
            this.j = Boolean.FALSE;
        }
        return this.j.booleanValue();
    }
}
