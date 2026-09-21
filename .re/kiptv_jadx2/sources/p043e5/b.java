package p043e5;

import java.util.List;
import kotlin.jvm.internal.m;

public final class b {

    public final List f21423a;

    public b(List list) {
        this.f21423a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && m.a(this.f21423a, ((b) obj).f21423a);
    }

    public final int hashCode() {
        return this.f21423a.hashCode();
    }

    public final String toString() {
        return "WhatsNewBundle(entries=" + this.f21423a + ")";
    }
}
