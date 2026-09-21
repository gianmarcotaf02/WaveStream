package p193x5;

import B2.a;
import Y6.f;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.m;
import p121o0.p;

public final class C3147v0 {

    public final InterfaceC3137q f31663a;

    public final Map f31664b;

    public final Set f31665c;

    public final List f31666d;

    public final int f31667e;

    public C3147v0(InterfaceC3137q interfaceC3137q, Map groups, Set favIds, List recents, int i3) {
        m.e(groups, "groups");
        m.e(favIds, "favIds");
        m.e(recents, "recents");
        this.f31663a = interfaceC3137q;
        this.f31664b = groups;
        this.f31665c = favIds;
        this.f31666d = recents;
        this.f31667e = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3147v0)) {
            return false;
        }
        C3147v0 c3147v0 = (C3147v0) obj;
        return m.a(this.f31663a, c3147v0.f31663a) && m.a(this.f31664b, c3147v0.f31664b) && m.a(this.f31665c, c3147v0.f31665c) && m.a(this.f31666d, c3147v0.f31666d) && this.f31667e == c3147v0.f31667e;
    }

    public final int hashCode() {
        InterfaceC3137q interfaceC3137q = this.f31663a;
        return Integer.hashCode(this.f31667e) + a.b(p.g(this.f31665c, a.c((interfaceC3137q == null ? 0 : interfaceC3137q.hashCode()) * 31, 31, this.f31664b), 31), 31, this.f31666d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RowPrefillKey(sel=");
        sb.append(this.f31663a);
        sb.append(", groups=");
        sb.append(this.f31664b);
        sb.append(", favIds=");
        sb.append(this.f31665c);
        sb.append(", recents=");
        sb.append(this.f31666d);
        sb.append(", overridesVersion=");
        return f.k(sb, this.f31667e, ")");
    }
}
