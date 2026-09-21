package p120o;

/* JADX INFO: loaded from: classes.dex */
public class f implements java.lang.Iterable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p120o.c f25959h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public p120o.c f25960i;
    public final java.util.WeakHashMap j = new java.util.WeakHashMap();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f25961k = 0;

    public p120o.c d(java.lang.Object obj) {
        p120o.c cVar = this.f25959h;
        while (cVar != null && !cVar.f25954h.equals(obj)) {
            cVar = cVar.j;
        }
        return cVar;
    }

    public java.lang.Object e(java.lang.Object obj) {
        p120o.c cVarD = d(obj);
        if (cVarD == null) {
            return null;
        }
        this.f25961k--;
        java.util.WeakHashMap weakHashMap = this.j;
        if (!weakHashMap.isEmpty()) {
            java.util.Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((p120o.e) it.next()).a(cVarD);
            }
        }
        p120o.c cVar = cVarD.f25956k;
        if (cVar != null) {
            cVar.j = cVarD.j;
        } else {
            this.f25959h = cVarD.j;
        }
        p120o.c cVar2 = cVarD.j;
        if (cVar2 != null) {
            cVar2.f25956k = cVar;
        } else {
            this.f25960i = cVar;
        }
        cVarD.j = null;
        cVarD.f25956k = null;
        return cVarD.f25955i;
    }

    public final boolean equals(java.lang.Object obj) {
        p120o.b bVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p120o.f)) {
            return false;
        }
        p120o.f fVar = (p120o.f) obj;
        if (this.f25961k != fVar.f25961k) {
            return false;
        }
        java.util.Iterator it = iterator();
        java.util.Iterator it2 = fVar.iterator();
        while (true) {
            bVar = (p120o.b) it;
            if (!bVar.hasNext()) {
                break;
            }
            p120o.b bVar2 = (p120o.b) it2;
            if (!bVar2.hasNext()) {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) bVar.next();
            java.lang.Object next = bVar2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return (bVar.hasNext() || ((p120o.b) it2).hasNext()) ? false : true;
    }

    public final int hashCode() {
        java.util.Iterator it = iterator();
        int iHashCode = 0;
        while (true) {
            p120o.b bVar = (p120o.b) it;
            if (!bVar.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((java.util.Map.Entry) bVar.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
        p120o.b bVar = new p120o.b(this.f25959h, this.f25960i, 0);
        this.j.put(bVar, java.lang.Boolean.FALSE);
        return bVar;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("[");
        java.util.Iterator it = iterator();
        while (true) {
            p120o.b bVar = (p120o.b) it;
            if (!bVar.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((java.util.Map.Entry) bVar.next()).toString());
            if (bVar.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
