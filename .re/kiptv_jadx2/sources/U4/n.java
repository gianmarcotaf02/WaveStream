package U4;

import com.kiptv.core.local.cache.MovieCollectionStore$Part;

public final class n {

    public final int f10148a;

    public final MovieCollectionStore$Part f10149b;

    public n(int i3, MovieCollectionStore$Part movieCollectionStore$Part) {
        this.f10148a = i3;
        this.f10149b = movieCollectionStore$Part;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f10148a == nVar.f10148a && kotlin.jvm.internal.m.a(this.f10149b, nVar.f10149b);
    }

    public final int hashCode() {
        return this.f10149b.hashCode() + (Integer.hashCode(this.f10148a) * 31);
    }

    public final String toString() {
        return "TitleMatch(collectionId=" + this.f10148a + ", part=" + this.f10149b + ")";
    }
}
