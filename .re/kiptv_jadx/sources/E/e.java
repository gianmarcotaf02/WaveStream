package E;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f2617a;

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof E.e) {
            return this.f2617a == ((E.e) obj).f2617a;
        }
        return false;
    }

    public final int hashCode() {
        return java.lang.Long.hashCode(this.f2617a);
    }

    public final java.lang.String toString() {
        return "GridItemSpan(packedValue=" + this.f2617a + ')';
    }
}
