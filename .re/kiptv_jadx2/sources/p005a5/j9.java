package p005a5;

import B2.a;
import com.google.android.gms.internal.play_billing.M0;
import kotlin.jvm.internal.m;
import p121o0.p;

public final class j9 {

    public final String f14675a;

    public final String f14676b;

    public final int f14677c;

    public final boolean f14678d;

    public j9(boolean z6, String id, int i3, String name) {
        m.e(id, "id");
        m.e(name, "name");
        this.f14675a = id;
        this.f14676b = name;
        this.f14677c = i3;
        this.f14678d = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j9)) {
            return false;
        }
        j9 j9Var = (j9) obj;
        return m.a(this.f14675a, j9Var.f14675a) && m.a(this.f14676b, j9Var.f14676b) && this.f14677c == j9Var.f14677c && this.f14678d == j9Var.f14678d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f14678d) + p.d(this.f14677c, a.a(this.f14675a.hashCode() * 31, 31, this.f14676b), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("XMLTVChannelOption(id=");
        sb.append(this.f14675a);
        sb.append(", name=");
        sb.append(this.f14676b);
        sb.append(", programCount=");
        sb.append(this.f14677c);
        sb.append(", isDeclared=");
        return M0.o(sb, this.f14678d, ")");
    }
}
