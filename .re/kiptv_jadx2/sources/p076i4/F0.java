package p076i4;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class F0 extends AbstractMap {

    public final int f22796h = 1;

    public final Object f22797i;
    public final Object j;

    public F0(i1 i1Var, Collection collection) {
        this.j = i1Var;
        this.f22797i = collection;
    }

    public final void a() {
        AbstractC2230y.e(b());
    }

    public final Iterator b() {
        switch (this.f22796h) {
            case 0:
                Iterator it = ((Map) this.f22797i).entrySet().iterator();
                E0 e6 = (E0) this.j;
                e6.getClass();
                return new C2219s0(it, new B0(e6, 1));
            default:
                return ((Collection) this.f22797i).iterator();
        }
    }

    @Override
    public void clear() {
        switch (this.f22796h) {
            case 0:
                ((Map) this.f22797i).clear();
                break;
            default:
                a();
                break;
        }
    }

    @Override
    public final boolean containsKey(Object obj) {
        switch (this.f22796h) {
            case 0:
                return ((Map) this.f22797i).containsKey(obj);
            default:
                return get(obj) != null;
        }
    }

    @Override
    public final Set entrySet() {
        return new C2189d(this, 1);
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f22796h) {
            case 0:
                Map map = (Map) this.f22797i;
                Object obj2 = map.get(obj);
                if (obj2 != null || map.containsKey(obj)) {
                    return ((E0) this.j).a(obj, obj2);
                }
                return null;
            default:
                if (obj instanceof P0) {
                    P0 p2 = (P0) obj;
                    h1 h1Var = (h1) ((i1) this.j).f22909a.get(p2.f22823h);
                    if (h1Var != null && h1Var.f22905h.equals(p2)) {
                        return h1Var.f22906i;
                    }
                }
                return null;
        }
    }

    @Override
    public Set keySet() {
        switch (this.f22796h) {
            case 0:
                return ((Map) this.f22797i).keySet();
            default:
                return super.keySet();
        }
    }

    @Override
    public Object remove(Object obj) {
        switch (this.f22796h) {
            case 0:
                Map map = (Map) this.f22797i;
                if (!map.containsKey(obj)) {
                    return null;
                }
                return ((E0) this.j).a(obj, map.remove(obj));
            default:
                return super.remove(obj);
        }
    }

    @Override
    public final int size() {
        switch (this.f22796h) {
            case 0:
                return ((Map) this.f22797i).size();
            default:
                return ((i1) this.j).f22909a.size();
        }
    }

    @Override
    public Collection values() {
        switch (this.f22796h) {
            case 0:
                return new C2218s(this);
            default:
                return super.values();
        }
    }

    public F0(Map map, E0 e6) {
        map.getClass();
        this.f22797i = map;
        this.j = e6;
    }
}
