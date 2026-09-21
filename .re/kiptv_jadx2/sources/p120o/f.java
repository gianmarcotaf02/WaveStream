package p120o;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

public class f implements Iterable {

    public c f25959h;

    public c f25960i;
    public final WeakHashMap j = new WeakHashMap();

    public int f25961k = 0;

    public c d(Object obj) {
        c cVar = this.f25959h;
        while (cVar != null && !cVar.f25954h.equals(obj)) {
            cVar = cVar.j;
        }
        return cVar;
    }

    public Object e(Object obj) {
        c cVarD = d(obj);
        if (cVarD == null) {
            return null;
        }
        this.f25961k--;
        WeakHashMap weakHashMap = this.j;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((e) it.next()).a(cVarD);
            }
        }
        c cVar = cVarD.f25956k;
        if (cVar != null) {
            cVar.j = cVarD.j;
        } else {
            this.f25959h = cVarD.j;
        }
        c cVar2 = cVarD.j;
        if (cVar2 != null) {
            cVar2.f25956k = cVar;
        } else {
            this.f25960i = cVar;
        }
        cVarD.j = null;
        cVarD.f25956k = null;
        return cVarD.f25955i;
    }

    public final boolean equals(Object obj) {
        b bVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f25961k != fVar.f25961k) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = fVar.iterator();
        while (true) {
            bVar = (b) it;
            if (!bVar.hasNext()) {
                break;
            }
            b bVar2 = (b) it2;
            if (!bVar2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) bVar.next();
            Object next = bVar2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return (bVar.hasNext() || ((b) it2).hasNext()) ? false : true;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) bVar.next()).hashCode();
        }
    }

    @Override
    public final Iterator iterator() {
        b bVar = new b(this.f25959h, this.f25960i, 0);
        this.j.put(bVar, Boolean.FALSE);
        return bVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) bVar.next()).toString());
            if (bVar.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
