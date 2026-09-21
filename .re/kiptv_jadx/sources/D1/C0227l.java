package D1;

/* JADX INFO: renamed from: D1.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0227l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.view.DisplayCutout f2036a;

    public C0227l(android.view.DisplayCutout displayCutout) {
        this.f2036a = displayCutout;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || D1.C0227l.class != obj.getClass()) {
            return false;
        }
        return java.util.Objects.equals(this.f2036a, ((D1.C0227l) obj).f2036a);
    }

    public final int hashCode() {
        return this.f2036a.hashCode();
    }

    public final java.lang.String toString() {
        return "DisplayCutoutCompat{" + this.f2036a + "}";
    }
}
