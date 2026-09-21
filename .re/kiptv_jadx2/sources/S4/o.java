package S4;

import com.kiptv.core.model.E0;

public final class o {

    public final String f9425a;

    public final int f9426b;

    public final E0 f9427c;

    public final int f9428d;

    public o(String id, int i3, E0 episode, int i9) {
        kotlin.jvm.internal.m.e(id, "id");
        kotlin.jvm.internal.m.e(episode, "episode");
        this.f9425a = id;
        this.f9426b = i3;
        this.f9427c = episode;
        this.f9428d = i9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return kotlin.jvm.internal.m.a(this.f9425a, oVar.f9425a) && this.f9426b == oVar.f9426b && kotlin.jvm.internal.m.a(this.f9427c, oVar.f9427c) && this.f9428d == oVar.f9428d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f9428d) + ((this.f9427c.hashCode() + p121o0.p.d(this.f9426b, this.f9425a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "FlatEpisodeItem(id=" + this.f9425a + ", season=" + this.f9426b + ", episode=" + this.f9427c + ", episodeNumberInSeason=" + this.f9428d + ")";
    }
}
