package p159s5;

import kotlin.jvm.internal.m;
import p070h6.k;

public final class p {

    public final k f27317a;

    public final k f27318b;

    public final k f27319c;

    public p(k all, k trakt, k kiptv) {
        m.e(all, "all");
        m.e(trakt, "trakt");
        m.e(kiptv, "kiptv");
        this.f27317a = all;
        this.f27318b = trakt;
        this.f27319c = kiptv;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return m.a(this.f27317a, pVar.f27317a) && m.a(this.f27318b, pVar.f27318b) && m.a(this.f27319c, pVar.f27319c);
    }

    public final int hashCode() {
        return this.f27319c.hashCode() + ((this.f27318b.hashCode() + (this.f27317a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "WatchedIds(all=" + this.f27317a + ", trakt=" + this.f27318b + ", kiptv=" + this.f27319c + ")";
    }
}
