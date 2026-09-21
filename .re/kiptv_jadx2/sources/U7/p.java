package U7;

public final class p extends q {

    public final Throwable f10217a;

    public p(Throwable th) {
        this.f10217a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p) {
            return kotlin.jvm.internal.m.a(this.f10217a, ((p) obj).f10217a);
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.f10217a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override
    public final String toString() {
        return "Closed(" + this.f10217a + ')';
    }
}
