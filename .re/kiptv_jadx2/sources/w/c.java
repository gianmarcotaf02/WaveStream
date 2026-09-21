package w;

import p121o0.p;
import p188x0.C3098s;

public final class c {

    public final long f29716a;

    public final long f29717b;

    public final long f29718c;

    public final long f29719d;

    public final long f29720e;

    public c(long j, long j9, long j10, long j11, long j12) {
        this.f29716a = j;
        this.f29717b = j9;
        this.f29718c = j10;
        this.f29719d = j11;
        this.f29720e = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return C3098s.d(this.f29716a, cVar.f29716a) && C3098s.d(this.f29717b, cVar.f29717b) && C3098s.d(this.f29718c, cVar.f29718c) && C3098s.d(this.f29719d, cVar.f29719d) && C3098s.d(this.f29720e, cVar.f29720e);
    }

    public final int hashCode() {
        int i3 = C3098s.f31128h;
        return Long.hashCode(this.f29720e) + p.e(p.e(p.e(Long.hashCode(this.f29716a) * 31, 31, this.f29717b), 31, this.f29718c), 31, this.f29719d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContextMenuColors(backgroundColor=");
        p.x(this.f29716a, ", textColor=", sb);
        p.x(this.f29717b, ", iconColor=", sb);
        p.x(this.f29718c, ", disabledTextColor=", sb);
        p.x(this.f29719d, ", disabledIconColor=", sb);
        sb.append((Object) C3098s.j(this.f29720e));
        sb.append(')');
        return sb.toString();
    }
}
