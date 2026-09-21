package p005a5;

/* JADX INFO: loaded from: classes.dex */
public final class R0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Integer f13836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f13837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f13838c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.Integer f13839d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.Integer f13840e;

    public R0(java.lang.Integer num, java.lang.String title, boolean z6, java.lang.Integer num2, java.lang.Integer num3) {
        kotlin.jvm.internal.m.e(title, "title");
        this.f13836a = num;
        this.f13837b = title;
        this.f13838c = z6;
        this.f13839d = num2;
        this.f13840e = num3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p005a5.R0)) {
            return false;
        }
        p005a5.R0 r9 = (p005a5.R0) obj;
        return kotlin.jvm.internal.m.a(this.f13836a, r9.f13836a) && kotlin.jvm.internal.m.a(this.f13837b, r9.f13837b) && this.f13838c == r9.f13838c && kotlin.jvm.internal.m.a(this.f13839d, r9.f13839d) && kotlin.jvm.internal.m.a(this.f13840e, r9.f13840e);
    }

    public final int hashCode() {
        java.lang.Integer num = this.f13836a;
        int iF = p121o0.p.f(B2.a.a((num == null ? 0 : num.hashCode()) * 31, 31, this.f13837b), 31, this.f13838c);
        java.lang.Integer num2 = this.f13839d;
        int iHashCode = (iF + (num2 == null ? 0 : num2.hashCode())) * 31;
        java.lang.Integer num3 = this.f13840e;
        return iHashCode + (num3 != null ? num3.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "OpenSubtitlesQuery(tmdbId=" + this.f13836a + ", title=" + this.f13837b + ", isEpisode=" + this.f13838c + ", seasonNumber=" + this.f13839d + ", episodeNumber=" + this.f13840e + ")";
    }
}
