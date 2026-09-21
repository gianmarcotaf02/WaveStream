package p054f7;

import java.util.ArrayList;
import p020c0.C1668a;
import p020c0.C1690l;
import p020c0.N;
import p044e7.l;
import p044e7.m;
import p101l7.e;
import p121o0.p;
import p142q7.f;

public abstract class b implements m {

    public final ArrayList f21732h;

    public b(int i3) {
        switch (i3) {
            case 1:
                this.f21732h = new ArrayList();
                break;
            default:
                this.f21732h = new ArrayList();
                break;
        }
    }

    public boolean a(int i3, N n3, Object obj) {
        ArrayList arrayList = n3.f18152a;
        if (arrayList == null) {
            b(i3, n3, null);
            return true;
        }
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            Object obj2 = arrayList.get(i9);
            if (obj2 instanceof C1668a) {
                if (kotlin.jvm.internal.m.a(obj2, obj)) {
                    b(0, n3, obj2);
                    return true;
                }
            } else {
                if (!(obj2 instanceof N)) {
                    throw new IllegalStateException(p.n(obj2, "Unexpected child source info "));
                }
                if (a(i3, (N) obj2, obj)) {
                    b(0, n3, obj2);
                    return true;
                }
            }
        }
        return false;
    }

    public void b(int i3, N n3, Object obj) {
        this.f21732h.add(new p129p0.b(i3, null, null));
    }

    @Override
    public void c() {
        e((String[]) this.f21732h.toArray(new String[0]));
    }

    public void d(int i3, Object obj, N n3, Object obj2) {
        if (kotlin.jvm.internal.m.a(obj, C1690l.f18284a)) {
            b(i3, n3, null);
        }
    }

    public abstract void e(String[] strArr);

    @Override
    public void h(Object obj) {
        if (obj instanceof String) {
            this.f21732h.add((String) obj);
        }
    }

    @Override
    public l k(p101l7.b bVar) {
        return null;
    }

    @Override
    public void j(f fVar) {
    }

    @Override
    public void f(p101l7.b bVar, e eVar) {
    }
}
