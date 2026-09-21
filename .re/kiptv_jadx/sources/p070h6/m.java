package p070h6;

/* JADX INFO: loaded from: classes4.dex */
public final class m implements java.io.Serializable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.Throwable f22541h;

    public m(java.lang.Throwable exception) {
        kotlin.jvm.internal.m.e(exception, "exception");
        this.f22541h = exception;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof p070h6.m) {
            return kotlin.jvm.internal.m.a(this.f22541h, ((p070h6.m) obj).f22541h);
        }
        return false;
    }

    public final int hashCode() {
        return this.f22541h.hashCode();
    }

    public final java.lang.String toString() {
        return "Failure(" + this.f22541h + ')';
    }
}
