package p005a5;

/* JADX INFO: loaded from: classes.dex */
public final class T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.List f13908a;

    public T(java.util.List list) {
        this.f13908a = list;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p005a5.T) && kotlin.jvm.internal.m.a(this.f13908a, ((p005a5.T) obj).f13908a);
    }

    public final int hashCode() {
        return this.f13908a.hashCode();
    }

    public final java.lang.String toString() {
        return "FeedRequest(queries=" + this.f13908a + ")";
    }
}
