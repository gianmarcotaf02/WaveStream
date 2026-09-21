package p005a5;

import com.google.android.gms.internal.play_billing.M0;

public final class W {

    public final int f14045a;

    public final boolean f14046b;

    public W(int i3, boolean z6) {
        this.f14045a = i3;
        this.f14046b = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof W)) {
            return false;
        }
        W w6 = (W) obj;
        return this.f14045a == w6.f14045a && this.f14046b == w6.f14046b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f14046b) + (Integer.hashCode(this.f14045a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Seed(tmdbId=");
        sb.append(this.f14045a);
        sb.append(", isMovie=");
        return M0.o(sb, this.f14046b, ")");
    }
}
