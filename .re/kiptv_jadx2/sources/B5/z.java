package B5;

import com.kiptv.core.model.TMDBPersonDetail;
import java.util.ArrayList;
import java.util.List;

public final class z {

    public final boolean f811a;

    public final TMDBPersonDetail f812b;

    public final List f813c;

    public final List f814d;

    public final String f815e;

    public final String f816f;

    public z(boolean z6, TMDBPersonDetail tMDBPersonDetail, List movies, List tv, String str, String str2) {
        kotlin.jvm.internal.m.e(movies, "movies");
        kotlin.jvm.internal.m.e(tv, "tv");
        this.f811a = z6;
        this.f812b = tMDBPersonDetail;
        this.f813c = movies;
        this.f814d = tv;
        this.f815e = str;
        this.f816f = str2;
    }

    public static z a(z zVar, boolean z6, TMDBPersonDetail tMDBPersonDetail, ArrayList arrayList, ArrayList arrayList2, String str, int i3) {
        if ((i3 & 2) != 0) {
            tMDBPersonDetail = zVar.f812b;
        }
        TMDBPersonDetail tMDBPersonDetail2 = tMDBPersonDetail;
        List list = arrayList;
        if ((i3 & 4) != 0) {
            list = zVar.f813c;
        }
        List movies = list;
        List list2 = arrayList2;
        if ((i3 & 8) != 0) {
            list2 = zVar.f814d;
        }
        List tv = list2;
        if ((i3 & 16) != 0) {
            str = zVar.f815e;
        }
        String str2 = zVar.f816f;
        zVar.getClass();
        kotlin.jvm.internal.m.e(movies, "movies");
        kotlin.jvm.internal.m.e(tv, "tv");
        return new z(z6, tMDBPersonDetail2, movies, tv, str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return this.f811a == zVar.f811a && kotlin.jvm.internal.m.a(this.f812b, zVar.f812b) && kotlin.jvm.internal.m.a(this.f813c, zVar.f813c) && kotlin.jvm.internal.m.a(this.f814d, zVar.f814d) && kotlin.jvm.internal.m.a(this.f815e, zVar.f815e) && this.f816f.equals(zVar.f816f);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f811a) * 31;
        TMDBPersonDetail tMDBPersonDetail = this.f812b;
        int iB = B2.a.b(B2.a.b((iHashCode + (tMDBPersonDetail == null ? 0 : tMDBPersonDetail.hashCode())) * 31, 31, this.f813c), 31, this.f814d);
        String str = this.f815e;
        return this.f816f.hashCode() + ((iB + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TvPersonUiState(loading=");
        sb.append(this.f811a);
        sb.append(", person=");
        sb.append(this.f812b);
        sb.append(", movies=");
        sb.append(this.f813c);
        sb.append(", tv=");
        sb.append(this.f814d);
        sb.append(", error=");
        sb.append(this.f815e);
        sb.append(", imageBaseUrl=");
        return Y6.f.m(sb, this.f816f, ")");
    }
}
