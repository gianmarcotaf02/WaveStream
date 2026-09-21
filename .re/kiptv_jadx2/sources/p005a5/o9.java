package p005a5;

import Y6.f;
import com.kiptv.core.model.I0;

public final class o9 {

    public final I0 f14902a;

    public final long f14903b;

    public o9(I0 i3, long j) {
        this.f14902a = i3;
        this.f14903b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o9)) {
            return false;
        }
        o9 o9Var = (o9) obj;
        return this.f14902a.equals(o9Var.f14902a) && this.f14903b == o9Var.f14903b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f14903b) + (this.f14902a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CacheEntry(data=");
        sb.append(this.f14902a);
        sb.append(", timestamp=");
        return f.g(this.f14903b, ")", sb);
    }
}
