package p076i4;

/* JADX INFO: loaded from: classes.dex */
public final class L extends p076i4.M {
    public static final p076i4.L j = new p076i4.L("", 0);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final p076i4.L f22808k = new p076i4.L("", 1);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f22809i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ L(java.lang.Comparable comparable, int i3) {
        super(comparable);
        this.f22809i = i3;
    }

    @Override // p076i4.M
    /* JADX INFO: renamed from: a */
    public int compareTo(p076i4.M m8) {
        switch (this.f22809i) {
            case 0:
                return m8 == this ? 0 : 1;
            case 1:
                return m8 == this ? 0 : -1;
            default:
                return super.compareTo(m8);
        }
    }

    @Override // p076i4.M
    public final void b(java.lang.StringBuilder sb) {
        switch (this.f22809i) {
            case 0:
                throw new java.lang.AssertionError();
            case 1:
                sb.append("(-∞");
                return;
            default:
                sb.append('[');
                sb.append(this.f22812h);
                return;
        }
    }

    @Override // p076i4.M
    public final void c(java.lang.StringBuilder sb) {
        switch (this.f22809i) {
            case 0:
                sb.append("+∞)");
                return;
            case 1:
                throw new java.lang.AssertionError();
            default:
                sb.append(this.f22812h);
                sb.append(')');
                return;
        }
    }

    @Override // p076i4.M, java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        switch (this.f22809i) {
            case 0:
                return ((p076i4.M) obj) == this ? 0 : 1;
            case 1:
                return ((p076i4.M) obj) == this ? 0 : -1;
            default:
                return super.compareTo(obj);
        }
    }

    @Override // p076i4.M
    public java.lang.Comparable d() {
        switch (this.f22809i) {
            case 0:
                throw new java.lang.IllegalStateException("range unbounded on this side");
            case 1:
                throw new java.lang.IllegalStateException("range unbounded on this side");
            default:
                return super.d();
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Comparable, java.lang.Object] */
    @Override // p076i4.M
    public final boolean e(java.lang.Comparable comparable) {
        switch (this.f22809i) {
            case 0:
                return false;
            case 1:
                return true;
            default:
                p076i4.P0 p2 = p076i4.P0.j;
                return this.f22812h.compareTo(comparable) <= 0;
        }
    }

    @Override // p076i4.M
    public final int hashCode() {
        switch (this.f22809i) {
            case 0:
                return java.lang.System.identityHashCode(this);
            case 1:
                return java.lang.System.identityHashCode(this);
            default:
                return this.f22812h.hashCode();
        }
    }

    public final java.lang.String toString() {
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
