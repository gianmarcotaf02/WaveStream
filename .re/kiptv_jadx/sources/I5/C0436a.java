package I5;

/* JADX INFO: renamed from: I5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0436a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.kiptv.core.model.E0 f5025b;

    public C0436a(int i3, com.kiptv.core.model.E0 episode) {
        kotlin.jvm.internal.m.e(episode, "episode");
        this.f5024a = i3;
        this.f5025b = episode;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I5.C0436a)) {
            return false;
        }
        I5.C0436a c0436a = (I5.C0436a) obj;
        return this.f5024a == c0436a.f5024a && kotlin.jvm.internal.m.a(this.f5025b, c0436a.f5025b);
    }

    public final int hashCode() {
        return this.f5025b.hashCode() + (java.lang.Integer.hashCode(this.f5024a) * 31);
    }

    public final java.lang.String toString() {
        return "FlatEpisode(season=" + this.f5024a + ", episode=" + this.f5025b + ")";
    }
}
