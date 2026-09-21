package Q8;

import R8.f;
import java.io.Serializable;
import java.util.concurrent.LinkedBlockingQueue;

public final class a implements P8.b, Serializable {

    public String f8715h;

    public f f8716i;
    public LinkedBlockingQueue j;

    @Override
    public final boolean a() {
        return true;
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final void c(String str, Throwable th) {
        k(1);
    }

    @Override
    public final boolean d() {
        return true;
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final void g(String str) {
        k(3);
    }

    @Override
    public final String getName() {
        return this.f8715h;
    }

    @Override
    public final void h(String str) {
        k(2);
    }

    @Override
    public final void i(String str) {
        k(5);
    }

    public final void k(int i3) {
        b bVar = new b();
        System.currentTimeMillis();
        bVar.f8717a = i3;
        bVar.f8718b = this.f8716i;
        Thread.currentThread().getName();
        this.j.add(bVar);
    }
}
