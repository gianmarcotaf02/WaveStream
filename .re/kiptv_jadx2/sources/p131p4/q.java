package p131p4;

import Y6.f;
import java.util.Objects;

public final class q extends c {

    public final int f26230b;

    public final j f26231c;

    public q(int i3, j jVar) {
        this.f26230b = i3;
        this.f26231c = jVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return qVar.f26230b == this.f26230b && qVar.f26231c == this.f26231c;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f26230b), this.f26231c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AesGcmSiv Parameters (variant: ");
        sb.append(this.f26231c);
        sb.append(", ");
        return f.k(sb, this.f26230b, "-byte key)");
    }
}
