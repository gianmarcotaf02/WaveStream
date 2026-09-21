package p011b1;

import kotlin.jvm.internal.m;

public final class w {

    public final v f17858a;

    public w(v vVar) {
        this.f17858a = vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (!m.a(this.f17858a, wVar.f17858a)) {
            return false;
        }
        wVar.getClass();
        return true;
    }

    public final int hashCode() {
        v vVar = this.f17858a;
        if (vVar != null) {
            return vVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "PlatformTextStyle(spanStyle=null, paragraphSyle=" + this.f17858a + ')';
    }

    public w() {
        this(new v());
    }
}
