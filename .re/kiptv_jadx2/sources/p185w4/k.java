package p185w4;

import Y6.f;
import java.util.Objects;
import p131p4.c;

public final class k extends c {

    public final int f29981b;

    public final int f29982c;

    public final d f29983d;

    public final d f29984e;

    public k(int i3, int i9, d dVar, d dVar2) {
        this.f29981b = i3;
        this.f29982c = i9;
        this.f29983d = dVar;
        this.f29984e = dVar2;
    }

    public final int b() {
        d dVar = d.f29968o;
        int i3 = this.f29982c;
        d dVar2 = this.f29983d;
        if (dVar2 == dVar) {
            return i3;
        }
        if (dVar2 == d.f29965l) {
            return i3 + 5;
        }
        if (dVar2 == d.f29966m) {
            return i3 + 5;
        }
        if (dVar2 == d.f29967n) {
            return i3 + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return kVar.f29981b == this.f29981b && kVar.b() == b() && kVar.f29983d == this.f29983d && kVar.f29984e == this.f29984e;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f29981b), Integer.valueOf(this.f29982c), this.f29983d, this.f29984e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HMAC Parameters (variant: ");
        sb.append(this.f29983d);
        sb.append(", hashType: ");
        sb.append(this.f29984e);
        sb.append(", ");
        sb.append(this.f29982c);
        sb.append("-byte tags, and ");
        return f.k(sb, this.f29981b, "-byte key)");
    }
}
