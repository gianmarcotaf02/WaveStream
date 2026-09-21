package p099l5;

import Y6.f;
import kotlin.jvm.internal.m;

public final class o extends v {

    public final String f24789i;
    public final String j;

    public o(String str, String str2) {
        super(str);
        this.f24789i = str;
        this.j = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return m.a(this.f24789i, oVar.f24789i) && m.a(this.j, oVar.j);
    }

    public final int hashCode() {
        int iHashCode = this.f24789i.hashCode() * 31;
        String str = this.j;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override
    public final String toString() {
        StringBuilder sb = new StringBuilder("LoadFailed(msg=");
        sb.append(this.f24789i);
        sb.append(", underlyingError=");
        return f.m(sb, this.j, ")");
    }
}
