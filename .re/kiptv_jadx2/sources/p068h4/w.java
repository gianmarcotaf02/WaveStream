package p068h4;

import java.io.Serializable;

public final class w implements v, Serializable {

    public final transient Object f22511h = new Object();

    public final v f22512i;
    public volatile transient boolean j;

    public transient Object f22513k;

    public w(v vVar) {
        this.f22512i = vVar;
    }

    @Override
    public final Object get() {
        if (!this.j) {
            synchronized (this.f22511h) {
                try {
                    if (!this.j) {
                        Object obj = this.f22512i.get();
                        this.f22513k = obj;
                        this.j = true;
                        return obj;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f22513k;
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
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
