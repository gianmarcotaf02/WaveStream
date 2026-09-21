package p186w5;

import Y6.f;
import kotlin.jvm.internal.m;
import p159s5.C;

public final class H implements J {

    public final String f30074a;

    public final C f30075b;

    public final String f30076c;

    public H(String str, C c9, String title) {
        m.e(title, "title");
        this.f30074a = str;
        this.f30075b = c9;
        this.f30076c = title;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H)) {
            return false;
        }
        H h9 = (H) obj;
        return m.a(this.f30074a, h9.f30074a) && m.a(this.f30075b, h9.f30075b) && m.a(this.f30076c, h9.f30076c);
    }

    public final int hashCode() {
        return this.f30076c.hashCode() + ((this.f30075b.hashCode() + (this.f30074a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Catalog(type=");
        sb.append(this.f30074a);
        sb.append(", source=");
        sb.append(this.f30075b);
        sb.append(", title=");
        return f.m(sb, this.f30076c, ")");
    }
}
