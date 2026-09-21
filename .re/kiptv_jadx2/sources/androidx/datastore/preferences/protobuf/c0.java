package androidx.datastore.preferences.protobuf;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import p136q.C2659c;
import p136q.C2661e;

public class c0 extends AbstractSet {

    public final int f16188h;

    public final Map f16189i;

    public c0(Map map, int i3) {
        this.f16188h = i3;
        this.f16189i = map;
    }

    @Override
    public boolean add(Object obj) {
        switch (this.f16188h) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                if (contains(entry)) {
                    return false;
                }
                ((Z) this.f16189i).put((Comparable) entry.getKey(), entry.getValue());
                return true;
            case 1:
                Map.Entry entry2 = (Map.Entry) obj;
                if (contains(entry2)) {
                    return false;
                }
                ((p110m7.A) this.f16189i).put((Comparable) entry2.getKey(), entry2.getValue());
                return true;
            default:
                return super.add(obj);
        }
    }

    @Override
    public void clear() {
        switch (this.f16188h) {
            case 0:
                ((Z) this.f16189i).clear();
                break;
            case 1:
                ((p110m7.A) this.f16189i).clear();
                break;
            default:
                super.clear();
                break;
        }
    }

    @Override
    public boolean contains(Object obj) {
        switch (this.f16188h) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                Object obj2 = ((Z) this.f16189i).get(entry.getKey());
                Object value = entry.getValue();
                return obj2 == value || (obj2 != null && obj2.equals(value));
            case 1:
                Map.Entry entry2 = (Map.Entry) obj;
                Object obj3 = ((p110m7.A) this.f16189i).get(entry2.getKey());
                Object value2 = entry2.getValue();
                return obj3 == value2 || (obj3 != null && obj3.equals(value2));
            default:
                return super.contains(obj);
        }
    }

    @Override
    public Iterator iterator() {
        switch (this.f16188h) {
            case 0:
                return new b0((Z) this.f16189i, 0);
            case 1:
                return new b0((p110m7.A) this.f16189i, 1);
            default:
                return new C2659c((C2661e) this.f16189i);
        }
    }

    @Override
    public boolean remove(Object obj) {
        switch (this.f16188h) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                if (!contains(entry)) {
                    return false;
                }
                ((Z) this.f16189i).remove(entry.getKey());
                return true;
            case 1:
                Map.Entry entry2 = (Map.Entry) obj;
                if (!contains(entry2)) {
                    return false;
                }
                ((p110m7.A) this.f16189i).remove(entry2.getKey());
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override
    public final int size() {
        switch (this.f16188h) {
            case 0:
                return ((Z) this.f16189i).size();
            case 1:
                return ((p110m7.A) this.f16189i).size();
            default:
                return ((C2661e) this.f16189i).j;
        }
    }
}
