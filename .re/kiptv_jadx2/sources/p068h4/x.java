package p068h4;

public final class x implements v {

    public static final androidx.media3.exoplayer.analytics.x f22514k = new androidx.media3.exoplayer.analytics.x(1);

    public final Object f22515h = new Object();

    public volatile v f22516i;
    public Object j;

    public x(v vVar) {
        this.f22516i = vVar;
    }

    @Override
    public final Object get() {
        v vVar = this.f22516i;
        androidx.media3.exoplayer.analytics.x xVar = f22514k;
        if (vVar != xVar) {
            synchronized (this.f22515h) {
                try {
                    if (this.f22516i != xVar) {
                        Object obj = this.f22516i.get();
                        this.j = obj;
                        this.f22516i = xVar;
                        return obj;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.j;
    }

    public final String toString() {
        Object obj = this.f22516i;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (obj == f22514k) {
            obj = "<supplier that returned " + this.j + ">";
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
