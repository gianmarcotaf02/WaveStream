package p188x0;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import p121o0.p;

public final class C3092l {

    public final ColorFilter f31116a;

    public final long f31117b;

    public final int f31118c;

    public C3092l(long j, int i3) {
        ColorFilter porterDuffColorFilter;
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC3081a.d();
            porterDuffColorFilter = AbstractC3081a.c(z.H(j), z.E(i3));
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(z.H(j), z.L(i3));
        }
        this.f31116a = porterDuffColorFilter;
        this.f31117b = j;
        this.f31118c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3092l)) {
            return false;
        }
        C3092l c3092l = (C3092l) obj;
        if (C3098s.d(this.f31117b, c3092l.f31117b)) {
            return this.f31118c == c3092l.f31118c;
        }
        return false;
    }

    public final int hashCode() {
        int i3 = C3098s.f31128h;
        return Integer.hashCode(this.f31118c) + (Long.hashCode(this.f31117b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BlendModeColorFilter(color=");
        p.x(this.f31117b, ", blendMode=", sb);
        sb.append((Object) z.M(this.f31118c));
        sb.append(')');
        return sb.toString();
    }
}
