package H5;

import com.google.android.gms.internal.play_billing.M0;

public final class L {

    public final int f4107a;

    public final int f4108b;

    public final int f4109c;

    public final boolean f4110d;

    public L(boolean z6, int i3, int i9, int i10) {
        this.f4107a = i3;
        this.f4108b = i9;
        this.f4109c = i10;
        this.f4110d = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L)) {
            return false;
        }
        L l2 = (L) obj;
        return this.f4107a == l2.f4107a && this.f4108b == l2.f4108b && this.f4109c == l2.f4109c && this.f4110d == l2.f4110d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f4110d) + p121o0.p.d(this.f4109c, p121o0.p.d(this.f4108b, Integer.hashCode(this.f4107a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TvSagaPlayTarget(streamId=");
        sb.append(this.f4107a);
        sb.append(", index=");
        sb.append(this.f4108b);
        sb.append(", resumeSeconds=");
        sb.append(this.f4109c);
        sb.append(", isRewatch=");
        return M0.o(sb, this.f4110d, ")");
    }
}
