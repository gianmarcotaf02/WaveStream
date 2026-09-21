package p101l7;

import O7.x;
import com.google.common.util.concurrent.D;
import kotlin.jvm.internal.m;

public final class a {

    public final c f24823a;

    public final e f24824b;

    static {
        e eVar = g.f24845f;
        c cVar = c.f24828c;
        D.M(eVar);
    }

    public a(c packageName, e eVar) {
        m.e(packageName, "packageName");
        this.f24823a = packageName;
        this.f24824b = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return m.a(this.f24823a, aVar.f24823a) && this.f24824b.equals(aVar.f24824b);
    }

    public final int hashCode() {
        return this.f24824b.hashCode() + ((this.f24823a.hashCode() + 527) * 961);
    }

    public final String toString() {
        return x.v0(this.f24823a.f24829a.f24832a, '.', '/') + "/" + this.f24824b;
    }
}
