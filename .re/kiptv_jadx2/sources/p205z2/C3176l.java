package p205z2;

import p121o0.p;
import p188x0.C3098s;

public final class C3176l {

    public final long f32267a;

    public final long f32268b;

    public final long f32269c;

    public final long f32270d;

    public final long f32271e;

    public final long f32272f;
    public final long g;

    public final long f32273h;

    public final long f32274i;
    public final long j;

    public final long f32275k;

    public final long f32276l;

    public final long f32277m;

    public final long f32278n;

    public C3176l(long j, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21) {
        this.f32267a = j;
        this.f32268b = j9;
        this.f32269c = j10;
        this.f32270d = j11;
        this.f32271e = j12;
        this.f32272f = j13;
        this.g = j14;
        this.f32273h = j15;
        this.f32274i = j16;
        this.j = j17;
        this.f32275k = j18;
        this.f32276l = j19;
        this.f32277m = j20;
        this.f32278n = j21;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3176l.class != obj.getClass()) {
            return false;
        }
        C3176l c3176l = (C3176l) obj;
        return C3098s.d(this.f32267a, c3176l.f32267a) && C3098s.d(this.f32268b, c3176l.f32268b) && C3098s.d(this.f32269c, c3176l.f32269c) && C3098s.d(this.f32270d, c3176l.f32270d) && C3098s.d(this.f32271e, c3176l.f32271e) && C3098s.d(this.f32272f, c3176l.f32272f) && C3098s.d(this.g, c3176l.g) && C3098s.d(this.f32273h, c3176l.f32273h) && C3098s.d(this.f32274i, c3176l.f32274i) && C3098s.d(this.j, c3176l.j) && C3098s.d(this.f32275k, c3176l.f32275k) && C3098s.d(this.f32276l, c3176l.f32276l) && C3098s.d(this.f32277m, c3176l.f32277m) && C3098s.d(this.f32278n, c3176l.f32278n);
    }

    public final int hashCode() {
        int i3 = C3098s.f31128h;
        return Long.hashCode(this.f32278n) + p.e(p.e(p.e(p.e(p.e(p.e(p.e(p.e(p.e(p.e(p.e(p.e(Long.hashCode(this.f32267a) * 31, 31, this.f32268b), 31, this.f32269c), 31, this.f32270d), 31, this.f32271e), 31, this.f32272f), 31, this.g), 31, this.f32273h), 31, this.f32274i), 31, this.j), 31, this.f32275k), 31, this.f32276l), 31, this.f32277m);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectableSurfaceColors(containerColor=");
        p.x(this.f32267a, ", contentColor=", sb);
        p.x(this.f32268b, ", focusedContainerColor=", sb);
        p.x(this.f32269c, ", focusedContentColor=", sb);
        p.x(this.f32270d, ", pressedContainerColor=", sb);
        p.x(this.f32271e, ", pressedContentColor=", sb);
        p.x(this.f32272f, ", selectedContainerColor=", sb);
        p.x(this.g, ", selectedContentColor=", sb);
        p.x(this.f32273h, ", disabledContainerColor=", sb);
        p.x(this.f32274i, ", disabledContentColor=", sb);
        p.x(this.j, ", focusedSelectedContainerColor=", sb);
        p.x(this.f32275k, ", focusedSelectedContentColor=", sb);
        p.x(this.f32276l, ", pressedSelectedContainerColor=", sb);
        p.x(this.f32277m, ", pressedSelectedContentColor=", sb);
        sb.append((Object) C3098s.j(this.f32278n));
        sb.append(')');
        return sb.toString();
    }
}
