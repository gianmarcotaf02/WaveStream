package p015b5;

import com.google.android.gms.internal.play_billing.M0;
import p121o0.p;

public final class z {

    public final int f18006a;

    public final int f18007b;

    public final boolean f18008c;

    public final boolean f18009d;

    public z(int i3, int i9, boolean z6, boolean z9) {
        this.f18006a = i3;
        this.f18007b = i9;
        this.f18008c = z6;
        this.f18009d = z9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return this.f18006a == zVar.f18006a && this.f18007b == zVar.f18007b && this.f18008c == zVar.f18008c && this.f18009d == zVar.f18009d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f18009d) + p.f(p.d(this.f18007b, Integer.hashCode(this.f18006a) * 31, 31), 31, this.f18008c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Merged(progressSeconds=");
        sb.append(this.f18006a);
        sb.append(", totalDuration=");
        sb.append(this.f18007b);
        sb.append(", completed=");
        sb.append(this.f18008c);
        sb.append(", conflicted=");
        return M0.o(sb, this.f18009d, ")");
    }
}
