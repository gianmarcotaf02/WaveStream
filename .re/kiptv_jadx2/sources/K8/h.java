package K8;

import kotlin.jvm.internal.m;
import v5.L;

public final class h {

    public final boolean f7008a;

    public final Integer f7009b;

    public final boolean f7010c;

    public final Integer f7011d;

    public final boolean f7012e;

    public final boolean f7013f;

    public h(boolean z6, Integer num, boolean z9, Integer num2, boolean z10, boolean z11) {
        this.f7008a = z6;
        this.f7009b = num;
        this.f7010c = z9;
        this.f7011d = num2;
        this.f7012e = z10;
        this.f7013f = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f7008a == hVar.f7008a && m.a(this.f7009b, hVar.f7009b) && this.f7010c == hVar.f7010c && m.a(this.f7011d, hVar.f7011d) && this.f7012e == hVar.f7012e && this.f7013f == hVar.f7013f;
    }

    public final int hashCode() {
        boolean z6 = this.f7008a;
        ?? r9 = z6;
        if (z6) {
            r9 = 1;
        }
        int i3 = r9 * 31;
        Integer num = this.f7009b;
        int iHashCode = (i3 + (num == null ? 0 : num.hashCode())) * 31;
        boolean z9 = this.f7010c;
        ?? r10 = z9;
        if (z9) {
            r10 = 1;
        }
        int i9 = (iHashCode + r10) * 31;
        Integer num2 = this.f7011d;
        int iHashCode2 = (i9 + (num2 != null ? num2.hashCode() : 0)) * 31;
        boolean z10 = this.f7012e;
        ?? r11 = z10;
        if (z10) {
            r11 = 1;
        }
        int i10 = (iHashCode2 + r11) * 31;
        boolean z11 = this.f7013f;
        return i10 + (z11 ? 1 : z11);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebSocketExtensions(perMessageDeflate=");
        sb.append(this.f7008a);
        sb.append(", clientMaxWindowBits=");
        sb.append(this.f7009b);
        sb.append(", clientNoContextTakeover=");
        sb.append(this.f7010c);
        sb.append(", serverMaxWindowBits=");
        sb.append(this.f7011d);
        sb.append(", serverNoContextTakeover=");
        sb.append(this.f7012e);
        sb.append(", unknownValues=");
        return L.a(sb, this.f7013f, ')');
    }
}
