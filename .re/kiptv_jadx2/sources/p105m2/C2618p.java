package p105m2;

import android.os.Bundle;
import com.google.android.gms.internal.play_billing.M0;

public final class C2618p {

    public final Bundle f25350a;

    public C2623v f25351b;

    public C2618p(C2623v c2623v, boolean z6) {
        if (c2623v == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        Bundle bundle = new Bundle();
        this.f25350a = bundle;
        this.f25351b = c2623v;
        bundle.putBundle("selector", c2623v.f25371a);
        bundle.putBoolean("activeScan", z6);
    }

    public final void a() {
        if (this.f25351b == null) {
            Bundle bundle = this.f25350a.getBundle("selector");
            C2623v c2623v = null;
            if (bundle != null) {
                c2623v = new C2623v(bundle, null);
            } else {
                C2623v c2623v2 = C2623v.f25370c;
            }
            this.f25351b = c2623v;
            if (c2623v == null) {
                this.f25351b = C2623v.f25370c;
            }
        }
    }

    public final boolean b() {
        return this.f25350a.getBoolean("activeScan");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2618p) {
            C2618p c2618p = (C2618p) obj;
            a();
            C2623v c2623v = this.f25351b;
            c2618p.a();
            if (c2623v.equals(c2618p.f25351b) && b() == c2618p.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        a();
        return (this.f25351b.hashCode() ^ (b() ? 1 : 0)) == true ? 1 : 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DiscoveryRequest{ selector=");
        a();
        sb.append(this.f25351b);
        sb.append(", activeScan=");
        sb.append(b());
        sb.append(", isValid=");
        a();
        C2623v c2623v = this.f25351b;
        c2623v.a();
        return M0.o(sb, !c2623v.f25372b.contains(null), " }");
    }
}
