package t5;

import java.util.List;
import kotlin.jvm.functions.Function0;

public final class P {

    public final String f28025a;

    public final boolean f28026b;

    public final List f28027c;

    public final Function0 f28028d;

    public P(String label, Function0 onClick, int i3) {
        boolean z6 = (i3 & 2) == 0;
        p078i6.w wVar = p078i6.w.f23205h;
        kotlin.jvm.internal.m.e(label, "label");
        kotlin.jvm.internal.m.e(onClick, "onClick");
        this.f28025a = label;
        this.f28026b = z6;
        this.f28027c = wVar;
        this.f28028d = onClick;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P)) {
            return false;
        }
        P p2 = (P) obj;
        return kotlin.jvm.internal.m.a(this.f28025a, p2.f28025a) && this.f28026b == p2.f28026b && this.f28027c.equals(p2.f28027c) && kotlin.jvm.internal.m.a(this.f28028d, p2.f28028d);
    }

    public final int hashCode() {
        return this.f28028d.hashCode() + p121o0.p.f(p121o0.p.f(B2.a.b(p121o0.p.f(this.f28025a.hashCode() * 31, 961, this.f28026b), 961, this.f28027c), 31, false), 31, true);
    }

    public final String toString() {
        return "TvContextMenuAction(label=" + this.f28025a + ", destructive=" + this.f28026b + ", subtitle=null, badges=" + this.f28027c + ", progress=null, checked=false, enabled=true, onClick=" + this.f28028d + ")";
    }
}
