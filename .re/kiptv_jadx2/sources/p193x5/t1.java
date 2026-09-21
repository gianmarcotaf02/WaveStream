package p193x5;

import B2.a;
import java.util.Set;
import kotlin.jvm.internal.m;

public final class t1 {

    public final String f31644a;

    public final String f31645b;

    public final Set f31646c;

    public t1(String key, String name, Set set) {
        m.e(key, "key");
        m.e(name, "name");
        this.f31644a = key;
        this.f31645b = name;
        this.f31646c = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t1)) {
            return false;
        }
        t1 t1Var = (t1) obj;
        return m.a(this.f31644a, t1Var.f31644a) && m.a(this.f31645b, t1Var.f31645b) && m.a(this.f31646c, t1Var.f31646c);
    }

    public final int hashCode() {
        return this.f31646c.hashCode() + a.a(this.f31644a.hashCode() * 31, 31, this.f31645b);
    }

    public final String toString() {
        return "TvLiveTagSection(key=" + this.f31644a + ", name=" + this.f31645b + ", contentIds=" + this.f31646c + ")";
    }
}
