package p099l5;

import Y6.f;
import kotlin.jvm.internal.m;

public final class r extends v {

    public final String f24792i;
    public final int j;

    public r(String str, int i3) {
        super(str);
        this.f24792i = str;
        this.j = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return m.a(this.f24792i, rVar.f24792i) && this.j == rVar.j;
    }

    public final int hashCode() {
        return Integer.hashCode(this.j) + (this.f24792i.hashCode() * 31);
    }

    @Override
    public final String toString() {
        StringBuilder sb = new StringBuilder("Timeout(msg=");
        sb.append(this.f24792i);
        sb.append(", timeoutSeconds=");
        return f.k(sb, this.j, ")");
    }
}
