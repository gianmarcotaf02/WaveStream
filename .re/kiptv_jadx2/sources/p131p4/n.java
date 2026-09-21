package p131p4;

import Y6.f;
import java.util.Objects;

public final class n extends c {

    public final int f26222b;

    public final int f26223c;

    public final int f26224d;

    public final j f26225e;

    public n(int i3, int i9, int i10, j jVar) {
        this.f26222b = i3;
        this.f26223c = i9;
        this.f26224d = i10;
        this.f26225e = jVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return nVar.f26222b == this.f26222b && nVar.f26223c == this.f26223c && nVar.f26224d == this.f26224d && nVar.f26225e == this.f26225e;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f26222b), Integer.valueOf(this.f26223c), Integer.valueOf(this.f26224d), this.f26225e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AesGcm Parameters (variant: ");
        sb.append(this.f26225e);
        sb.append(", ");
        sb.append(this.f26223c);
        sb.append("-byte IV, ");
        sb.append(this.f26224d);
        sb.append("-byte tag, and ");
        return f.k(sb, this.f26222b, "-byte key)");
    }
}
