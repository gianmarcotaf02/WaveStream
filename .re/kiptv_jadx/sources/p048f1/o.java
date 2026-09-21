package p048f1;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21663a;

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof p048f1.o) {
            return this.f21663a == ((p048f1.o) obj).f21663a;
        }
        return false;
    }

    public final int hashCode() {
        return java.lang.Integer.hashCode(this.f21663a);
    }

    public final java.lang.String toString() {
        int i3 = this.f21663a;
        if (i3 == 0) {
            return "Normal";
        }
        return i3 == 1 ? "Italic" : "Invalid";
    }
}
