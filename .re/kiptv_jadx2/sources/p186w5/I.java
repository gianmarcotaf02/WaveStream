package p186w5;

import Y6.f;
import kotlin.jvm.internal.m;

public final class I implements J {

    public final String f30087a;

    public final String f30088b;

    public I(String sectionId, String str) {
        m.e(sectionId, "sectionId");
        this.f30087a = sectionId;
        this.f30088b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I)) {
            return false;
        }
        I i3 = (I) obj;
        return m.a(this.f30087a, i3.f30087a) && m.a(this.f30088b, i3.f30088b);
    }

    public final int hashCode() {
        return this.f30088b.hashCode() + (this.f30087a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Feed(sectionId=");
        sb.append(this.f30087a);
        sb.append(", title=");
        return f.m(sb, this.f30088b, ")");
    }
}
