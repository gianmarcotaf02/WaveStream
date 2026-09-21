package S4;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f9425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.kiptv.core.model.E0 f9427c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f9428d;

    public o(java.lang.String id, int i3, com.kiptv.core.model.E0 episode, int i9) {
        kotlin.jvm.internal.m.e(id, "id");
        kotlin.jvm.internal.m.e(episode, "episode");
        this.f9425a = id;
        this.f9426b = i3;
        this.f9427c = episode;
        this.f9428d = i9;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S4.o)) {
            return false;
        }
        S4.o oVar = (S4.o) obj;
        return kotlin.jvm.internal.m.a(this.f9425a, oVar.f9425a) && this.f9426b == oVar.f9426b && kotlin.jvm.internal.m.a(this.f9427c, oVar.f9427c) && this.f9428d == oVar.f9428d;
    }

    public final int hashCode() {
        return java.lang.Integer.hashCode(this.f9428d) + ((this.f9427c.hashCode() + p121o0.p.d(this.f9426b, this.f9425a.hashCode() * 31, 31)) * 31);
    }

    public final java.lang.String toString() {
        return "FlatEpisodeItem(id=" + this.f9425a + ", season=" + this.f9426b + ", episode=" + this.f9427c + ", episodeNumberInSeason=" + this.f9428d + ")";
    }
}
