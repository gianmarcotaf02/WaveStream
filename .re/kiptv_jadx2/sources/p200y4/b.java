package p200y4;

import java.util.Objects;
import o4.f;

public final class b {

    public final f f31885a;

    public final int f31886b;

    public final String f31887c;

    public final String f31888d;

    public b(f fVar, int i3, String str, String str2) {
        this.f31885a = fVar;
        this.f31886b = i3;
        this.f31887c = str;
        this.f31888d = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f31885a == bVar.f31885a && this.f31886b == bVar.f31886b && this.f31887c.equals(bVar.f31887c) && this.f31888d.equals(bVar.f31888d);
    }

    public final int hashCode() {
        return Objects.hash(this.f31885a, Integer.valueOf(this.f31886b), this.f31887c, this.f31888d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(status=");
        sb.append(this.f31885a);
        sb.append(", keyId=");
        sb.append(this.f31886b);
        sb.append(", keyType='");
        sb.append(this.f31887c);
        sb.append("', keyPrefix='");
        return Y6.f.m(sb, this.f31888d, "')");
    }
}
