package D5;

/* JADX INFO: renamed from: D5.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0247d extends D5.AbstractC0253g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final D5.C0254h f2276a;

    public C0247d(D5.C0254h c0254h) {
        this.f2276a = c0254h;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof D5.C0247d) && kotlin.jvm.internal.m.a(this.f2276a, ((D5.C0247d) obj).f2276a);
    }

    public final int hashCode() {
        return this.f2276a.hashCode();
    }

    public final java.lang.String toString() {
        return "Option(option=" + this.f2276a + ")";
    }
}
