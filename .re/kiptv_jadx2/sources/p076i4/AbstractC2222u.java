package p076i4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public abstract class AbstractC2222u implements G0 {

    public transient Collection f22939h;

    public transient Set f22940i;
    public transient Collection j;

    public transient Map f22941k;

    @Override
    public Map a() {
        Map map = this.f22941k;
        if (map != null) {
            return map;
        }
        Map mapD = d();
        this.f22941k = mapD;
        return mapD;
    }

    public final boolean b(Object obj, Object obj2) {
        Collection collection = (Collection) a().get(obj);
        return collection != null && collection.contains(obj2);
    }

    public boolean c(Object obj) {
        Iterator it = a().values().iterator();
        while (it.hasNext()) {
            if (((Collection) it.next()).contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public abstract Map d();

    public abstract Collection e();

    @Override
    public Collection entries() {
        Collection collection = this.f22939h;
        if (collection != null) {
            return collection;
        }
        Collection collectionE = e();
        this.f22939h = collectionE;
        return collectionE;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof G0) {
            return a().equals(((G0) obj).a());
        }
        return false;
    }

    public abstract Set f();

    public abstract Collection g();

    public abstract Iterator h();

    public final int hashCode() {
        return a().hashCode();
    }

    public final void i(String str, ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        get(str).addAll(arrayList);
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public Set keySet() {
        Set set = this.f22940i;
        if (set != null) {
            return set;
        }
        Set setF = f();
        this.f22940i = setF;
        return setF;
    }

    @Override
    public boolean remove(Object obj, Object obj2) {
        Collection collection = (Collection) a().get(obj);
        return collection != null && collection.remove(obj2);
    }

    public final String toString() {
        return a().toString();
    }

    @Override
    public Collection values() {
        Collection collection = this.j;
        if (collection != null) {
            return collection;
        }
        Collection collectionG = g();
        this.j = collectionG;
        return collectionG;
    }
}
