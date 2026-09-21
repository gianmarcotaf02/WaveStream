package p005a5;

import com.google.android.gms.internal.play_billing.M0;
import java.util.List;

public final class C1452x6 {

    public final Object f15303a;

    public final boolean f15304b;

    public C1452x6(List list, boolean z6) {
        this.f15303a = list;
        this.f15304b = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1452x6)) {
            return false;
        }
        C1452x6 c1452x6 = (C1452x6) obj;
        return this.f15303a.equals(c1452x6.f15303a) && this.f15304b == c1452x6.f15304b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f15304b) + (this.f15303a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Page(items=");
        sb.append(this.f15303a);
        sb.append(", hasMore=");
        return M0.o(sb, this.f15304b, ")");
    }
}
