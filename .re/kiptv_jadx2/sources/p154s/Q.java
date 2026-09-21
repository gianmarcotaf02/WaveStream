package p154s;

import com.google.common.util.concurrent.D;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.m;
import p078i6.C;

public final class Q {

    public static final Q f27093b;

    public static final Q f27094c;

    public final b0 f27095a;

    static {
        D d4 = null;
        LinkedHashMap linkedHashMap = null;
        S s9 = null;
        Z z6 = null;
        C2739z c2739z = null;
        f27093b = new Q(new b0(s9, z6, c2739z, d4, linkedHashMap, 127));
        f27094c = new Q(new b0(s9, z6, c2739z, d4, linkedHashMap, 95));
    }

    public Q(b0 b0Var) {
        this.f27095a = b0Var;
    }

    public final Q a(Q q9) {
        b0 b0Var = q9.f27095a;
        b0 b0Var2 = this.f27095a;
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
        return new Q(new b0(s9, z6, c2739z, (D) null, b0Var.f27114d || b0Var2.f27114d, C.R0(b0Var2.f27115e, b0Var.f27115e)));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof Q) && m.a(((Q) obj).f27095a, this.f27095a);
    }

    public final int hashCode() {
        return this.f27095a.hashCode();
    }

    public final String toString() {
        if (equals(f27093b)) {
            return "ExitTransition.None";
        }
        if (equals(f27094c)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        StringBuilder sb = new StringBuilder("ExitTransition: \nFade - ");
        b0 b0Var = this.f27095a;
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
        sb.append(",\nKeepUntilTransitionsFinished - ");
        sb.append(b0Var.f27114d);
        return sb.toString();
    }
}
