package p048f1;

import kotlin.jvm.internal.m;

public final class C2146d {

    public final Object f21644a;

    public final boolean equals(Object obj) {
        if (obj instanceof C2146d) {
            return m.a(this.f21644a, ((C2146d) obj).f21644a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f21644a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "AsyncTypefaceResult(result=" + this.f21644a + ')';
    }
}
