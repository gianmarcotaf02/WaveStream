package p005a5;

import com.google.android.gms.internal.play_billing.M0;
import java.util.List;
import kotlin.jvm.internal.m;
import p121o0.p;

public final class X {

    public final List f14071a;

    public final boolean f14072b;

    public final boolean f14073c;

    public X(List items, boolean z6, boolean z9) {
        m.e(items, "items");
        this.f14071a = items;
        this.f14072b = z6;
        this.f14073c = z9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X)) {
            return false;
        }
        X x9 = (X) obj;
        return m.a(this.f14071a, x9.f14071a) && this.f14072b == x9.f14072b && this.f14073c == x9.f14073c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f14073c) + p.f(this.f14071a.hashCode() * 31, 31, this.f14072b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TraktPagesOutcome(items=");
        sb.append(this.f14071a);
        sb.append(", hasMore=");
        sb.append(this.f14072b);
        sb.append(", failed=");
        return M0.o(sb, this.f14073c, ")");
    }
}
