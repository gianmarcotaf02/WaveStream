package p131p4;

import Y6.f;
import java.util.Objects;

public final class k extends c {

    public final int f26214b;

    public final int f26215c;

    public final int f26216d;

    public final j f26217e;

    public k(int i3, int i9, int i10, j jVar) {
        this.f26214b = i3;
        this.f26215c = i9;
        this.f26216d = i10;
        this.f26217e = jVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return kVar.f26214b == this.f26214b && kVar.f26215c == this.f26215c && kVar.f26216d == this.f26216d && kVar.f26217e == this.f26217e;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f26214b), Integer.valueOf(this.f26215c), Integer.valueOf(this.f26216d), this.f26217e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AesEax Parameters (variant: ");
        sb.append(this.f26217e);
        sb.append(", ");
        sb.append(this.f26215c);
        sb.append("-byte IV, ");
        sb.append(this.f26216d);
        sb.append("-byte tag, and ");
        return f.k(sb, this.f26214b, "-byte key)");
    }
}
