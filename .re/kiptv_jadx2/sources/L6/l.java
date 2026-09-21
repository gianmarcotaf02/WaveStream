package L6;

public final class l {

    public final k f7087a;

    public final int f7088b;

    public l(k kVar, int i3) {
        this.f7087a = kVar;
        this.f7088b = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return kotlin.jvm.internal.m.a(this.f7087a, lVar.f7087a) && this.f7088b == lVar.f7088b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f7088b) + (this.f7087a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("KindWithArity(kind=");
        sb.append(this.f7087a);
        sb.append(", arity=");
        return Y6.f.j(sb, this.f7088b, ')');
    }
}
