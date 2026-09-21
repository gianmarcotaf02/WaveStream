package J;

public final class V {

    public static final V f5713b = new V(63, null);

    public final p194x6.j f5714a;

    public V(int i3, p194x6.j jVar) {
        this.f5714a = (i3 & 1) != 0 ? null : jVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof V) {
            return this.f5714a == ((V) obj).f5714a;
        }
        return false;
    }

    public final int hashCode() {
        p194x6.j jVar = this.f5714a;
        return (jVar != null ? jVar.hashCode() : 0) * 28629151;
    }
}
