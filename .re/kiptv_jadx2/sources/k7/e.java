package k7;

import com.google.android.gms.internal.play_billing.V0;
import kotlin.jvm.internal.m;

public final class e extends V0 {

    public final String f24501f;
    public final String g;

    public e(String name, String desc) {
        super(9);
        m.e(name, "name");
        m.e(desc, "desc");
        this.f24501f = name;
        this.g = desc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return m.a(this.f24501f, eVar.f24501f) && m.a(this.g, eVar.g);
    }

    @Override
    public final String g() {
        return this.f24501f + this.g;
    }

    @Override
    public final int hashCode() {
        return this.g.hashCode() + (this.f24501f.hashCode() * 31);
    }
}
