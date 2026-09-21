package p129p0;

import com.google.common.util.concurrent.D;
import kotlin.jvm.internal.m;

public final class b {

    public final int f26171a;

    public final Integer f26172b;

    public b(int i3, D d4, Integer num) {
        this.f26171a = i3;
        this.f26172b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f26171a == bVar.f26171a && m.a(null, null) && m.a(this.f26172b, bVar.f26172b);
    }

    public final int hashCode() {
        int iHashCode = ((Integer.hashCode(this.f26171a) * 31) + 0) * 31;
        Integer num = this.f26172b;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "ComposeStackTraceFrame(groupKey=" + this.f26171a + ", sourceInfo=" + ((Object) null) + ", groupOffset=" + this.f26172b + ')';
    }
}
