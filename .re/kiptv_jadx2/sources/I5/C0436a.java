package I5;

public final class C0436a {

    public final int f5024a;

    public final com.kiptv.core.model.E0 f5025b;

    public C0436a(int i3, com.kiptv.core.model.E0 episode) {
        kotlin.jvm.internal.m.e(episode, "episode");
        this.f5024a = i3;
        this.f5025b = episode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0436a)) {
            return false;
        }
        C0436a c0436a = (C0436a) obj;
        return this.f5024a == c0436a.f5024a && kotlin.jvm.internal.m.a(this.f5025b, c0436a.f5025b);
    }

    public final int hashCode() {
        return this.f5025b.hashCode() + (Integer.hashCode(this.f5024a) * 31);
    }

    public final String toString() {
        return "FlatEpisode(season=" + this.f5024a + ", episode=" + this.f5025b + ")";
    }
}
