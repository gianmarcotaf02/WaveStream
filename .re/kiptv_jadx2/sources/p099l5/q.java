package p099l5;

import Y6.f;
import kotlin.jvm.internal.m;

public final class q extends v {

    public final String f24791i;
    public final String j;

    public q(String str) {
        super(str);
        this.f24791i = str;
        this.j = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return m.a(this.f24791i, qVar.f24791i) && m.a(this.j, qVar.j);
    }

    public final int hashCode() {
        int iHashCode = this.f24791i.hashCode() * 31;
        String str = this.j;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override
    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaybackFailed(msg=");
        sb.append(this.f24791i);
        sb.append(", underlyingError=");
        return f.m(sb, this.j, ")");
    }

    public q(String str, String str2) {
        super(str);
        this.f24791i = str;
        this.j = str2;
    }
}
