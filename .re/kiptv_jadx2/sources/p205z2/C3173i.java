package p205z2;

import p113n1.f;
import p121o0.p;
import p188x0.C3098s;

public final class C3173i {

    public static final C3173i f32254c = new C3173i(C3098s.f31127f, 0);

    public final long f32255a;

    public final float f32256b;

    public C3173i(long j, float f9) {
        this.f32255a = j;
        this.f32256b = f9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3173i.class != obj.getClass()) {
            return false;
        }
        C3173i c3173i = (C3173i) obj;
        return C3098s.d(this.f32255a, c3173i.f32255a) && f.c(this.f32256b, c3173i.f32256b);
    }

    public final int hashCode() {
        int i3 = C3098s.f31128h;
        return Float.hashCode(this.f32256b) + (Long.hashCode(this.f32255a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Glow(elevationColor=");
        p.x(this.f32255a, ", elevation=", sb);
        sb.append((Object) f.d(this.f32256b));
        sb.append(')');
        return sb.toString();
    }
}
