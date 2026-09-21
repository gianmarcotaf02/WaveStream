package D0;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import p105m2.C2623v;

public final class C0206g {

    public ArrayList f1884a;

    public C0206g(int i3) {
        this.f1884a = new ArrayList(i3);
    }

    public void a(Object obj) {
        this.f1884a.add(obj);
    }

    public void b(Object obj) {
        if (obj == null) {
            return;
        }
        boolean z6 = obj instanceof Object[];
        ArrayList arrayList = this.f1884a;
        if (z6) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length > 0) {
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                Collections.addAll(arrayList, objArr);
                return;
            }
            return;
        }
        if (obj instanceof Collection) {
            arrayList.addAll((Collection) obj);
            return;
        }
        if (obj instanceof Iterable) {
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        } else {
            if (!(obj instanceof Iterator)) {
                throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
            }
            Iterator it2 = (Iterator) obj;
            while (it2.hasNext()) {
                arrayList.add(it2.next());
            }
        }
    }

    public void c(float f9, float f10, float f11, float f12, boolean z6) {
        this.f1884a.add(new s(f9, f10, 0.0f, false, z6, f11, f12));
    }

    public C2623v d() {
        if (this.f1884a == null) {
            return C2623v.f25370c;
        }
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("controlCategories", this.f1884a);
        return new C2623v(bundle, this.f1884a);
    }

    public void e() {
        this.f1884a.add(C0210k.f1911c);
    }

    public void f(float f9, float f10, float f11, float f12, float f13, float f14) {
        this.f1884a.add(new l(f9, f10, f11, f12, f13, f14));
    }

    public void g(float f9, float f10, float f11, float f12, float f13, float f14) {
        this.f1884a.add(new t(f9, f10, f11, f12, f13, f14));
    }

    public void h(float f9) {
        this.f1884a.add(new m(f9));
    }

    public void i(float f9) {
        this.f1884a.add(new u(f9));
    }

    public void j(float f9, float f10) {
        this.f1884a.add(new n(f9, f10));
    }

    public void k(float f9, float f10) {
        this.f1884a.add(new v(f9, f10));
    }

    public void l(float f9, float f10) {
        this.f1884a.add(new o(f9, f10));
    }

    public void m(float f9, float f10, float f11, float f12) {
        this.f1884a.add(new q(f9, f10, f11, f12));
    }

    public void n(float f9, float f10, float f11, float f12) {
        this.f1884a.add(new y(f9, f10, f11, f12));
    }

    public void o(float f9) {
        this.f1884a.add(new B(f9));
    }

    public void p(float f9) {
        this.f1884a.add(new A(f9));
    }

    public C0206g() {
        this.f1884a = new ArrayList(32);
    }
}
