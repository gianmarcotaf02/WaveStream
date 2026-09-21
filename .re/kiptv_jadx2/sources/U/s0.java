package U;

import p188x0.C3098s;

public final class s0 {

    public final long f10079a;

    public final long f10080b;

    public s0(long j, long j9) {
        this.f10079a = j;
        this.f10080b = j9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        return C3098s.d(this.f10079a, s0Var.f10079a) && C3098s.d(this.f10080b, s0Var.f10080b);
    }

    public final int hashCode() {
        int i3 = C3098s.f31128h;
        return Long.hashCode(this.f10080b) + (Long.hashCode(this.f10079a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionColors(selectionHandleColor=");
        p121o0.p.x(this.f10079a, ", selectionBackgroundColor=", sb);
        sb.append((Object) C3098s.j(this.f10080b));
        sb.append(')');
        return sb.toString();
    }
}
