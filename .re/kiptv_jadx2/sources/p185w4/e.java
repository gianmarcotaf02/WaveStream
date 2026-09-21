package p185w4;

import Y6.f;
import java.util.Objects;
import p131p4.c;

public final class e extends c {

    public final int f29971b;

    public final int f29972c;

    public final d f29973d;

    public e(int i3, int i9, d dVar) {
        this.f29971b = i3;
        this.f29972c = i9;
        this.f29973d = dVar;
    }

    public final int b() {
        d dVar = d.f29961f;
        int i3 = this.f29972c;
        d dVar2 = this.f29973d;
        if (dVar2 == dVar) {
            return i3;
        }
        if (dVar2 == d.f29958c) {
            return i3 + 5;
        }
        if (dVar2 == d.f29959d) {
            return i3 + 5;
        }
        if (dVar2 == d.f29960e) {
            return i3 + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return eVar.f29971b == this.f29971b && eVar.b() == b() && eVar.f29973d == this.f29973d;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f29971b), Integer.valueOf(this.f29972c), this.f29973d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AES-CMAC Parameters (variant: ");
        sb.append(this.f29973d);
        sb.append(", ");
        sb.append(this.f29972c);
        sb.append("-byte tags, and ");
        return f.k(sb, this.f29971b, "-byte key)");
    }
}
