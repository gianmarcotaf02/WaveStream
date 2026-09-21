package p186w5;

import kotlin.jvm.internal.m;

public final class C2978e {

    public final String f30217a;

    public final EnumC2986i f30218b;

    public C2978e(String sectionId, EnumC2986i enumC2986i) {
        m.e(sectionId, "sectionId");
        this.f30217a = sectionId;
        this.f30218b = enumC2986i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2978e)) {
            return false;
        }
        C2978e c2978e = (C2978e) obj;
        return m.a(this.f30217a, c2978e.f30217a) && this.f30218b == c2978e.f30218b;
    }

    public final int hashCode() {
        return this.f30218b.hashCode() + (this.f30217a.hashCode() * 31);
    }

    public final String toString() {
        return "FocusTarget(sectionId=" + this.f30217a + ", button=" + this.f30218b + ")";
    }
}
