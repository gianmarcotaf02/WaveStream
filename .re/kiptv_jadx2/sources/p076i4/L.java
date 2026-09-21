package p076i4;

public final class L extends M {
    public static final L j = new L("", 0);

    public static final L f22808k = new L("", 1);

    public final int f22809i;

    public L(Comparable comparable, int i3) {
        super(comparable);
        this.f22809i = i3;
    }

    @Override
    public int compareTo(M m8) {
        switch (this.f22809i) {
            case 0:
                return m8 == this ? 0 : 1;
            case 1:
                return m8 == this ? 0 : -1;
            default:
                return super.compareTo(m8);
        }
    }

    @Override
    public final void b(StringBuilder sb) {
        switch (this.f22809i) {
            case 0:
                throw new AssertionError();
            case 1:
                sb.append("(-∞");
                return;
            default:
                sb.append('[');
                sb.append(this.f22812h);
                return;
        }
    }

    @Override
    public final void c(StringBuilder sb) {
        switch (this.f22809i) {
            case 0:
                sb.append("+∞)");
                return;
            case 1:
                throw new AssertionError();
            default:
                sb.append(this.f22812h);
                sb.append(')');
                return;
        }
    }

    @Override
    public int compareTo(Object obj) {
        switch (this.f22809i) {
            case 0:
                return ((M) obj) == this ? 0 : 1;
            case 1:
                return ((M) obj) == this ? 0 : -1;
            default:
                return super.compareTo(obj);
        }
    }

    @Override
    public Comparable d() {
        switch (this.f22809i) {
            case 0:
                throw new IllegalStateException("range unbounded on this side");
            case 1:
                throw new IllegalStateException("range unbounded on this side");
            default:
                return super.d();
        }
    }

    @Override
    public final boolean e(Comparable comparable) {
        switch (this.f22809i) {
            case 0:
                return false;
            case 1:
                return true;
            default:
                P0 p2 = P0.j;
                return this.f22812h.compareTo(comparable) <= 0;
        }
    }

    @Override
    public final int hashCode() {
        switch (this.f22809i) {
            case 0:
                return System.identityHashCode(this);
            case 1:
                return System.identityHashCode(this);
            default:
                return this.f22812h.hashCode();
        }
    }

    public final String toString() {
        switch (this.f22809i) {
            case 0:
                return "+∞";
            case 1:
                return "-∞";
            default:
                return "\\" + this.f22812h + "/";
        }
    }
}
