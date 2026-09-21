package W0;

import D0.C0205f;
import Y6.f;
import kotlin.jvm.internal.m;

public final class a {

    public final C0205f f10535a;

    public final int f10536b;

    public a(C0205f c0205f, int i3) {
        this.f10535a = c0205f;
        this.f10536b = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return m.a(this.f10535a, aVar.f10535a) && this.f10536b == aVar.f10536b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f10536b) + (this.f10535a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImageVectorEntry(imageVector=");
        sb.append(this.f10535a);
        sb.append(", configFlags=");
        return f.j(sb, this.f10536b, ')');
    }
}
