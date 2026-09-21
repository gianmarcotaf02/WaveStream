package T2;

/* JADX INFO: loaded from: classes.dex */
public final class a implements T2.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9731a;

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof T2.a) {
            return this.f9731a == ((T2.a) obj).f9731a;
        }
        return false;
    }

    public final int hashCode() {
        return java.lang.Integer.hashCode(this.f9731a);
    }

    public final java.lang.String toString() {
        return "Pixels(px=" + this.f9731a + ')';
    }
}
