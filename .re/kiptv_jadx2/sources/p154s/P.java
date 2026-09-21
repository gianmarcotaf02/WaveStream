package p154s;

import com.google.common.util.concurrent.D;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.m;
import p078i6.C;

public final class P {

    public static final P f27091b = new P(new b0((S) null, (Z) null, (C2739z) null, (D) null, (LinkedHashMap) null, 127));

    public final b0 f27092a;

    public P(b0 b0Var) {
        this.f27092a = b0Var;
    }

    public final P a(P p2) {
        D d4 = null;
        b0 b0Var = p2.f27092a;
        b0 b0Var2 = this.f27092a;
        S s9 = b0Var.f27111a;
        if (s9 == null) {
            s9 = b0Var2.f27111a;
        }
        Z z6 = b0Var.f27112b;
        if (z6 == null) {
            z6 = b0Var2.f27112b;
        }
        C2739z c2739z = b0Var.f27113c;
        if (c2739z == null) {
            c2739z = b0Var2.f27113c;
        }
        return new P(new b0(s9, z6, c2739z, d4, C.R0(b0Var2.f27115e, b0Var.f27115e), 32));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof P) && m.a(((P) obj).f27092a, this.f27092a);
    }

    public final int hashCode() {
        return this.f27092a.hashCode();
    }

    public final String toString() {
        if (equals(f27091b)) {
            return "EnterTransition.None";
        }
        StringBuilder sb = new StringBuilder("EnterTransition: \nFade - ");
        b0 b0Var = this.f27092a;
        S s9 = b0Var.f27111a;
        sb.append(s9 != null ? s9.toString() : null);
        sb.append(",\nSlide - ");
        Z z6 = b0Var.f27112b;
        sb.append(z6 != null ? z6.toString() : null);
        sb.append(",\nShrink - ");
        C2739z c2739z = b0Var.f27113c;
        sb.append(c2739z != null ? c2739z.toString() : null);
        sb.append(",\nScale - ");
        sb.append((String) null);
        return sb.toString();
    }
}
