package O2;

public final class u {

    public final int f7943a;

    public final long f7944b;

    public final long f7945c;

    public final s f7946d;

    public final v f7947e;

    public final Object f7948f;

    public u(int i3, long j, long j9, s sVar, v vVar, Object obj) {
        this.f7943a = i3;
        this.f7944b = j;
        this.f7945c = j9;
        this.f7946d = sVar;
        this.f7947e = vVar;
        this.f7948f = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.f7943a == uVar.f7943a && this.f7944b == uVar.f7944b && this.f7945c == uVar.f7945c && kotlin.jvm.internal.m.a(this.f7946d, uVar.f7946d) && kotlin.jvm.internal.m.a(this.f7947e, uVar.f7947e) && kotlin.jvm.internal.m.a(this.f7948f, uVar.f7948f);
    }

    public final int hashCode() {
        int iC = B2.a.c(p121o0.p.e(p121o0.p.e(this.f7943a * 31, 31, this.f7944b), 31, this.f7945c), 31, this.f7946d.f7938a);
        v vVar = this.f7947e;
        int iHashCode = (iC + (vVar == null ? 0 : vVar.f7949h.hashCode())) * 31;
        Object obj = this.f7948f;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkResponse(code=");
        sb.append(this.f7943a);
        sb.append(", requestMillis=");
        sb.append(this.f7944b);
        sb.append(", responseMillis=");
        sb.append(this.f7945c);
        sb.append(", headers=");
        sb.append(this.f7946d);
        sb.append(", body=");
        sb.append(this.f7947e);
        sb.append(", delegate=");
        return B2.a.n(sb, this.f7948f, ')');
    }
}
