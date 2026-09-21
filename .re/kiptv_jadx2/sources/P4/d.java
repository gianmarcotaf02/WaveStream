package P4;

import com.google.android.gms.internal.play_billing.M0;
import p121o0.p;

public final class d {

    public final boolean f8140a;

    public final boolean f8141b;

    public final boolean f8142c;

    public d(boolean z6, boolean z9, boolean z10) {
        this.f8140a = z6;
        this.f8141b = z9;
        this.f8142c = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f8140a == dVar.f8140a && this.f8141b == dVar.f8141b && this.f8142c == dVar.f8142c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f8142c) + p.f(Boolean.hashCode(this.f8140a) * 31, 31, this.f8141b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Release(images=");
        sb.append(this.f8140a);
        sb.append(", derivedIndexes=");
        sb.append(this.f8141b);
        sb.append(", catalogue=");
        return M0.o(sb, this.f8142c, ")");
    }
}
