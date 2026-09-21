package p005a5;

import java.util.List;
import kotlin.jvm.internal.m;

public final class T {

    public final List f13908a;

    public T(List list) {
        this.f13908a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof T) && m.a(this.f13908a, ((T) obj).f13908a);
    }

    public final int hashCode() {
        return this.f13908a.hashCode();
    }

    public final String toString() {
        return "FeedRequest(queries=" + this.f13908a + ")";
    }
}
