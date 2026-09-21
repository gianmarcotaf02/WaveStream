package p114n2;

import kotlin.jvm.internal.B;
import kotlin.jvm.internal.m;

public final class C2648g {

    public final I f25618a;

    public final boolean f25619b;

    public final boolean f25620c;

    public final Object f25621d;

    public C2648g(I i3, boolean z6, Object obj, boolean z9) {
        if (!i3.f25606a && z6) {
            throw new IllegalArgumentException(i3.b().concat(" does not allow nullable values").toString());
        }
        if (!z6 && z9 && obj == null) {
            throw new IllegalArgumentException(("Argument with type " + i3.b() + " has null value but is not nullable.").toString());
        }
        this.f25618a = i3;
        this.f25619b = z6;
        this.f25621d = obj;
        this.f25620c = z9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2648g.class != obj.getClass()) {
            return false;
        }
        C2648g c2648g = (C2648g) obj;
        if (this.f25619b != c2648g.f25619b || this.f25620c != c2648g.f25620c || !this.f25618a.equals(c2648g.f25618a)) {
            return false;
        }
        Object obj2 = c2648g.f25621d;
        Object obj3 = this.f25621d;
        if (obj3 != null) {
            return obj3.equals(obj2);
        }
        return obj2 == null;
    }

    public final int hashCode() {
        int iHashCode = ((((this.f25618a.hashCode() * 31) + (this.f25619b ? 1 : 0)) * 31) + (this.f25620c ? 1 : 0)) * 31;
        Object obj = this.f25621d;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(B.f24540a.b(C2648g.class).h());
        sb.append(" Type: " + this.f25618a);
        sb.append(" Nullable: " + this.f25619b);
        if (this.f25620c) {
            sb.append(" DefaultValue: " + this.f25621d);
        }
        String string = sb.toString();
        m.d(string, "toString(...)");
        return string;
    }
}
