package p005a5;

import com.kiptv.core.local.cache.MovieCollectionStore$Summary;
import java.util.ArrayList;

public final class Y2 {

    public final MovieCollectionStore$Summary f14119a;

    public final ArrayList f14120b;

    public Y2(MovieCollectionStore$Summary movieCollectionStore$Summary, ArrayList arrayList) {
        this.f14119a = movieCollectionStore$Summary;
        this.f14120b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Y2)) {
            return false;
        }
        Y2 y9 = (Y2) obj;
        return this.f14119a.equals(y9.f14119a) && this.f14120b.equals(y9.f14120b);
    }

    public final int hashCode() {
        return this.f14120b.hashCode() + (this.f14119a.hashCode() * 31);
    }

    public final String toString() {
        return "Saga(summary=" + this.f14119a + ", entries=" + this.f14120b + ")";
    }
}
