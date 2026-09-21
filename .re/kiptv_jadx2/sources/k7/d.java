package k7;

import com.google.android.gms.internal.play_billing.V0;
import kotlin.jvm.internal.m;

public final class d extends V0 {

    public final String f24500f;
    public final String g;

    public d(String name, String desc) {
        super(9);
        m.e(name, "name");
        m.e(desc, "desc");
        this.f24500f = name;
        this.g = desc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return m.a(this.f24500f, dVar.f24500f) && m.a(this.g, dVar.g);
    }

    @Override
    public final String g() {
        return this.f24500f + ':' + this.g;
    }

    @Override
    public final int hashCode() {
        return this.g.hashCode() + (this.f24500f.hashCode() * 31);
    }
}
