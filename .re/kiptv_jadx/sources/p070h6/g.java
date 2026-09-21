package p070h6;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements java.lang.Comparable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final p070h6.g f22532l = new p070h6.g(2, 1, 20);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f22533h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f22534i;
    public final int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f22535k;

    public g(int i3, int i9, int i10) {
        this.f22533h = i3;
        this.f22534i = i9;
        this.j = i10;
        if (i3 >= 0 && i3 < 256 && i9 >= 0 && i9 < 256 && i10 >= 0 && i10 < 256) {
            this.f22535k = (i3 << 16) + (i9 << 8) + i10;
            return;
        }
        throw new java.lang.IllegalArgumentException(("Version components are out of range: " + i3 + '.' + i9 + '.' + i10).toString());
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object obj) {
        p070h6.g other = (p070h6.g) obj;
        kotlin.jvm.internal.m.e(other, "other");
        return this.f22535k - other.f22535k;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        p070h6.g gVar = obj instanceof p070h6.g ? (p070h6.g) obj : null;
        return gVar != null && this.f22535k == gVar.f22535k;
    }

    public final int hashCode() {
        return this.f22535k;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.f22533h);
        sb.append('.');
        sb.append(this.f22534i);
        sb.append('.');
        sb.append(this.j);
        return sb.toString();
    }
}
