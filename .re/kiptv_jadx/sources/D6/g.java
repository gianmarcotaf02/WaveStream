package D6;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends D6.e {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final D6.g f2463k = new D6.g(1, 0, 1);

    public final boolean d(int i3) {
        return this.f2458h <= i3 && i3 <= this.f2459i;
    }

    @Override // D6.e
    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof D6.g)) {
            return false;
        }
        if (isEmpty() && ((D6.g) obj).isEmpty()) {
            return true;
        }
        D6.g gVar = (D6.g) obj;
        if (this.f2458h == gVar.f2458h) {
            return this.f2459i == gVar.f2459i;
        }
        return false;
    }

    @Override // D6.e
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f2458h * 31) + this.f2459i;
    }

    @Override // D6.e
    public final boolean isEmpty() {
        return this.f2458h > this.f2459i;
    }

    @Override // D6.e
    public final java.lang.String toString() {
        return this.f2458h + ".." + this.f2459i;
    }
}
