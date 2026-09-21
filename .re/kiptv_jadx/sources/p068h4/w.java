package p068h4;

/* JADX INFO: loaded from: classes.dex */
public final class w implements p068h4.v, java.io.Serializable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final transient java.lang.Object f22511h = new java.lang.Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p068h4.v f22512i;
    public volatile transient boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public transient java.lang.Object f22513k;

    public w(p068h4.v vVar) {
        this.f22512i = vVar;
    }

    @Override // p068h4.v
    public final java.lang.Object get() {
        if (!this.j) {
            synchronized (this.f22511h) {
                try {
                    if (!this.j) {
                        java.lang.Object obj = this.f22512i.get();
                        this.f22513k = obj;
                        this.j = true;
                        return obj;
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
        return this.f22513k;
    }

    public final java.lang.String toString() {
        java.lang.Object obj;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Suppliers.memoize(");
        if (this.j) {
            obj = "<supplier that returned " + this.f22513k + ">";
        } else {
            obj = this.f22512i;
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
