package p070h6;

/* JADX INFO: loaded from: classes4.dex */
public final class n implements java.io.Serializable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.Object f22542h;

    public static final java.lang.Throwable a(java.lang.Object obj) {
        if (obj instanceof p070h6.m) {
            return ((p070h6.m) obj).f22541h;
        }
        return null;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof p070h6.n) {
            return kotlin.jvm.internal.m.a(this.f22542h, ((p070h6.n) obj).f22542h);
        }
        return false;
    }

    public final int hashCode() {
        java.lang.Object obj = this.f22542h;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.Object obj = this.f22542h;
        if (obj instanceof p070h6.m) {
            return ((p070h6.m) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
