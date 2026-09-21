package W6;

import java.util.Map;

public final class v {

    public final B f10683a;

    public final B f10684b;

    public final Map f10685c;

    public final boolean f10686d;

    public v(B b9, B b10) {
        p078i6.x xVar = p078i6.x.f23206h;
        this.f10683a = b9;
        this.f10684b = b10;
        this.f10685c = xVar;
        com.google.common.util.concurrent.D.B(new A7.k(22, this));
        B b11 = B.IGNORE;
        this.f10686d = b9 == b11 && b10 == b11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f10683a == vVar.f10683a && this.f10684b == vVar.f10684b && kotlin.jvm.internal.m.a(this.f10685c, vVar.f10685c);
    }

    public final int hashCode() {
        int iHashCode = this.f10683a.hashCode() * 31;
        B b9 = this.f10684b;
        return this.f10685c.hashCode() + ((iHashCode + (b9 == null ? 0 : b9.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Jsr305Settings(globalLevel=");
        sb.append(this.f10683a);
        sb.append(", migrationLevel=");
        sb.append(this.f10684b);
        sb.append(", userDefinedLevelForSpecificAnnotation=");
        return p121o0.p.r(sb, this.f10685c, ')');
    }
}
