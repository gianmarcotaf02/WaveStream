package R1;

import B3.o;
import E6.u;
import K0.C0656d;
import M8.q;
import O1.C0740d;
import O1.N;
import S7.A;
import android.content.Context;
import com.google.common.util.concurrent.P;
import java.util.List;
import kotlin.jvm.internal.m;
import p194x6.j;

public final class b implements A6.b {

    public final String f9037h;

    public final j f9038i;
    public final A j;

    public final Object f9039k = new Object();

    public volatile S1.d f9040l;

    public b(String str, j jVar, A a2) {
        this.f9037h = str;
        this.f9038i = jVar;
        this.j = a2;
    }

    @Override
    public final Object getValue(Object obj, u property) {
        S1.d dVar;
        Context thisRef = (Context) obj;
        m.e(thisRef, "thisRef");
        m.e(property, "property");
        S1.d dVar2 = this.f9040l;
        if (dVar2 != null) {
            return dVar2;
        }
        synchronized (this.f9039k) {
            try {
                if (this.f9040l == null) {
                    Context applicationContext = thisRef.getApplicationContext();
                    j jVar = this.f9038i;
                    m.d(applicationContext, "applicationContext");
                    List migrations = (List) jVar.invoke(applicationContext);
                    A a2 = this.j;
                    C0656d c0656d = new C0656d(applicationContext, this, 8);
                    m.e(migrations, "migrations");
                    this.f9040l = new S1.d(new S1.d(new N(new Q1.f(q.f7275h, new A8.m(10, c0656d)), P.i0(new C0740d(migrations, null)), new o(19), a2)));
                }
                dVar = this.f9040l;
                m.b(dVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return dVar;
    }
}
