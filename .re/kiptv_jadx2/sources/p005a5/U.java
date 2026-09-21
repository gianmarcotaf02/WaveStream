package p005a5;

import com.google.android.gms.internal.play_billing.M0;
import java.util.List;

public final class U {

    public final Object f13956a;

    public final boolean f13957b;

    public U(List list, boolean z6) {
        this.f13956a = list;
        this.f13957b = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof U)) {
            return false;
        }
        U u6 = (U) obj;
        return this.f13956a.equals(u6.f13956a) && this.f13957b == u6.f13957b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f13957b) + (this.f13956a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FetchOutcome(items=");
        sb.append(this.f13956a);
        sb.append(", failed=");
        return M0.o(sb, this.f13957b, ")");
    }
}
