package p068h4;

/* JADX INFO: loaded from: classes.dex */
public final class x implements p068h4.v {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final androidx.media3.exoplayer.analytics.x f22514k = new androidx.media3.exoplayer.analytics.x(1);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.Object f22515h = new java.lang.Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile p068h4.v f22516i;
    public java.lang.Object j;

    public x(p068h4.v vVar) {
        this.f22516i = vVar;
    }

    @Override // p068h4.v
    public final java.lang.Object get() {
        p068h4.v vVar = this.f22516i;
        androidx.media3.exoplayer.analytics.x xVar = f22514k;
        if (vVar != xVar) {
            synchronized (this.f22515h) {
                try {
                    if (this.f22516i != xVar) {
                        java.lang.Object obj = this.f22516i.get();
                        this.j = obj;
                        this.f22516i = xVar;
                        return obj;
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
        return this.j;
    }

    public final java.lang.String toString() {
        java.lang.Object obj = this.f22516i;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Suppliers.memoize(");
        if (obj == f22514k) {
            obj = "<supplier that returned " + this.j + ">";
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
