package p025c5;

import Y6.f;
import kotlin.jvm.internal.m;
import p121o0.p;

public final class a {

    public final int f18508a;

    public final long f18509b;

    public final long f18510c;

    public final String f18511d;

    public a(String text, int i3, long j, long j9) {
        m.e(text, "text");
        this.f18508a = i3;
        this.f18509b = j;
        this.f18510c = j9;
        this.f18511d = text;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f18508a == aVar.f18508a && this.f18509b == aVar.f18509b && this.f18510c == aVar.f18510c && m.a(this.f18511d, aVar.f18511d);
    }

    public final int hashCode() {
        return this.f18511d.hashCode() + p.e(p.e(Integer.hashCode(this.f18508a) * 31, 31, this.f18509b), 31, this.f18510c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SrtCue(index=");
        sb.append(this.f18508a);
        sb.append(", startMs=");
        sb.append(this.f18509b);
        sb.append(", endMs=");
        sb.append(this.f18510c);
        sb.append(", text=");
        return f.m(sb, this.f18511d, ")");
    }
}
