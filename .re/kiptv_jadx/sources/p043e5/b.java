package p043e5;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.List f21423a;

    public b(java.util.List list) {
        this.f21423a = list;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p043e5.b) && kotlin.jvm.internal.m.a(this.f21423a, ((p043e5.b) obj).f21423a);
    }

    public final int hashCode() {
        return this.f21423a.hashCode();
    }

    public final java.lang.String toString() {
        return "WhatsNewBundle(entries=" + this.f21423a + ")";
    }
}
