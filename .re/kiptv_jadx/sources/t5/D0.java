package t5;

/* JADX INFO: loaded from: classes4.dex */
public final class D0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f27844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f27845b;

    public D0(int i3, java.lang.String label) {
        kotlin.jvm.internal.m.e(label, "label");
        this.f27844a = i3;
        this.f27845b = label;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t5.D0)) {
            return false;
        }
        t5.D0 d4 = (t5.D0) obj;
        return this.f27844a == d4.f27844a && kotlin.jvm.internal.m.a(this.f27845b, d4.f27845b);
    }

    public final int hashCode() {
        return this.f27845b.hashCode() + (java.lang.Integer.hashCode(this.f27844a) * 31);
    }

    public final java.lang.String toString() {
        return "TvMetadataCandidate(tmdbId=" + this.f27844a + ", label=" + this.f27845b + ")";
    }
}
