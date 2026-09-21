package p040e2;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.m;

public abstract class b {

    public final LinkedHashMap f21365a = new LinkedHashMap();

    public abstract Object a(V1.b bVar);

    public final boolean equals(Object obj) {
        return (obj instanceof b) && m.a(this.f21365a, ((b) obj).f21365a);
    }

    public final int hashCode() {
        return this.f21365a.hashCode();
    }

    public final String toString() {
        return "CreationExtras(extras=" + this.f21365a + ')';
    }
}
