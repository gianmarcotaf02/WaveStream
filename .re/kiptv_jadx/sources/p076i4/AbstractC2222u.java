package p076i4;

/* JADX INFO: renamed from: i4.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2222u implements p076i4.G0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public transient java.util.Collection f22939h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public transient java.util.Set f22940i;
    public transient java.util.Collection j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public transient java.util.Map f22941k;

    @Override // p076i4.G0
    public java.util.Map a() {
        java.util.Map map = this.f22941k;
        if (map != null) {
            return map;
        }
        java.util.Map mapD = d();
        this.f22941k = mapD;
        return mapD;
    }

    public final boolean b(java.lang.Object obj, java.lang.Object obj2) {
        java.util.Collection collection = (java.util.Collection) a().get(obj);
        return collection != null && collection.contains(obj2);
    }

    public boolean c(java.lang.Object obj) {
        java.util.Iterator it = a().values().iterator();
        while (it.hasNext()) {
            if (((java.util.Collection) it.next()).contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public abstract java.util.Map d();

    public abstract java.util.Collection e();

    @Override // p076i4.G0
    public java.util.Collection entries() {
        java.util.Collection collection = this.f22939h;
        if (collection != null) {
            return collection;
        }
        java.util.Collection collectionE = e();
        this.f22939h = collectionE;
        return collectionE;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p076i4.G0) {
            return a().equals(((p076i4.G0) obj).a());
        }
        return false;
    }

    public abstract java.util.Set f();

    public abstract java.util.Collection g();

    public abstract java.util.Iterator h();

    public final int hashCode() {
        return a().hashCode();
    }

    public final void i(java.lang.String str, java.util.ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        get(str).addAll(arrayList);
    }

    @Override // p076i4.G0
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // p076i4.G0
    public java.util.Set keySet() {
        java.util.Set set = this.f22940i;
        if (set != null) {
            return set;
        }
        java.util.Set setF = f();
        this.f22940i = setF;
        return setF;
    }

    @Override // p076i4.G0
    public boolean remove(java.lang.Object obj, java.lang.Object obj2) {
        java.util.Collection collection = (java.util.Collection) a().get(obj);
        return collection != null && collection.remove(obj2);
    }

    public final java.lang.String toString() {
        return a().toString();
    }

    @Override // p076i4.G0
    public java.util.Collection values() {
        java.util.Collection collection = this.j;
        if (collection != null) {
            return collection;
        }
        java.util.Collection collectionG = g();
        this.j = collectionG;
        return collectionG;
    }
}
