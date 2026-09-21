package p048f1;

/* JADX INFO: renamed from: f1.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2146d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Object f21644a;

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof p048f1.C2146d) {
            return kotlin.jvm.internal.m.a(this.f21644a, ((p048f1.C2146d) obj).f21644a);
        }
        return false;
    }

    public final int hashCode() {
        java.lang.Object obj = this.f21644a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final java.lang.String toString() {
        return "AsyncTypefaceResult(result=" + this.f21644a + ')';
    }
}
