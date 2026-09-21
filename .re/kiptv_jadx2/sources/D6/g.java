package D6;

public final class g extends e {

    public static final g f2463k = new g(1, 0, 1);

    public final boolean d(int i3) {
        return this.f2458h <= i3 && i3 <= this.f2459i;
    }

    @Override
    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        if (isEmpty() && ((g) obj).isEmpty()) {
            return true;
        }
        g gVar = (g) obj;
        if (this.f2458h == gVar.f2458h) {
            return this.f2459i == gVar.f2459i;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f2458h * 31) + this.f2459i;
    }

    @Override
    public final boolean isEmpty() {
        return this.f2458h > this.f2459i;
    }

    @Override
    public final String toString() {
        return this.f2458h + ".." + this.f2459i;
    }
}
