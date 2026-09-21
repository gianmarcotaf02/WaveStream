package com.kiptv.core.model;

import androidx.media3.container.NalUnitUtil;
import com.google.android.gms.internal.play_billing.AbstractC1833d1;
import com.google.android.gms.internal.play_billing.V0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import p153r8.AbstractC2686a0;
import p153r8.C2691d;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/TMDBMovieDetail;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final class TMDBMovieDetail {

    public static final Companion INSTANCE = new Companion();

    public static final KSerializer[] f20194w = {null, null, null, null, null, null, null, null, null, null, null, new C2691d(TMDBGenre$$serializer.INSTANCE, 0), new C2691d(TMDBCountry$$serializer.INSTANCE, 0), new C2691d(TMDBCompany$$serializer.INSTANCE, 0), null, null, null, null, null, null, null, null};

    public final int f20195a;

    public final String f20196b;

    public final String f20197c;

    public final String f20198d;

    public final String f20199e;

    public final String f20200f;
    public final String g;

    public final String f20201h;

    public final Integer f20202i;
    public final Double j;

    public final Integer f20203k;

    public final List f20204l;

    public final List f20205m;

    public final List f20206n;

    public final TMDBMovieCollection f20207o;

    public final String f20208p;

    public final Long f20209q;

    public final Long f20210r;

    public final TMDBCredits f20211s;

    public final TMDBImages f20212t;

    public final TMDBReleaseDatesResponse f20213u;

    public final String f20214v;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/TMDBMovieDetail$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/TMDBMovieDetail;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final KSerializer serializer() {
            return TMDBMovieDetail$$serializer.INSTANCE;
        }
    }

    public TMDBMovieDetail(int i3, int i9, String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, Double d4, Integer num2, List list, List list2, List list3, TMDBMovieCollection tMDBMovieCollection, String str8, Long l2, Long l9, TMDBCredits tMDBCredits, TMDBImages tMDBImages, TMDBReleaseDatesResponse tMDBReleaseDatesResponse, String str9) {
        if (3 != (i3 & 3)) {
            AbstractC2686a0.l(i3, 3, TMDBMovieDetail$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f20195a = i9;
        this.f20196b = str;
        if ((i3 & 4) == 0) {
            this.f20197c = null;
        } else {
            this.f20197c = str2;
        }
        if ((i3 & 8) == 0) {
            this.f20198d = null;
        } else {
            this.f20198d = str3;
        }
        if ((i3 & 16) == 0) {
            this.f20199e = null;
        } else {
            this.f20199e = str4;
        }
        if ((i3 & 32) == 0) {
            this.f20200f = null;
        } else {
            this.f20200f = str5;
        }
        if ((i3 & 64) == 0) {
            this.g = null;
        } else {
            this.g = str6;
        }
        if ((i3 & 128) == 0) {
            this.f20201h = null;
        } else {
            this.f20201h = str7;
        }
        if ((i3 & 256) == 0) {
            this.f20202i = null;
        } else {
            this.f20202i = num;
        }
        if ((i3 & 512) == 0) {
            this.j = null;
        } else {
            this.j = d4;
        }
        if ((i3 & 1024) == 0) {
            this.f20203k = null;
        } else {
            this.f20203k = num2;
        }
        if ((i3 & 2048) == 0) {
            this.f20204l = null;
        } else {
            this.f20204l = list;
        }
        if ((i3 & 4096) == 0) {
            this.f20205m = null;
        } else {
            this.f20205m = list2;
        }
        if ((i3 & 8192) == 0) {
            this.f20206n = null;
        } else {
            this.f20206n = list3;
        }
        if ((i3 & 16384) == 0) {
            this.f20207o = null;
        } else {
            this.f20207o = tMDBMovieCollection;
        }
        if ((32768 & i3) == 0) {
            this.f20208p = null;
        } else {
            this.f20208p = str8;
        }
        if ((65536 & i3) == 0) {
            this.f20209q = null;
        } else {
            this.f20209q = l2;
        }
        if ((131072 & i3) == 0) {
            this.f20210r = null;
        } else {
            this.f20210r = l9;
        }
        if ((262144 & i3) == 0) {
            this.f20211s = null;
        } else {
            this.f20211s = tMDBCredits;
        }
        if ((524288 & i3) == 0) {
            this.f20212t = null;
        } else {
            this.f20212t = tMDBImages;
        }
        if ((1048576 & i3) == 0) {
            this.f20213u = null;
        } else {
            this.f20213u = tMDBReleaseDatesResponse;
        }
        if ((i3 & 2097152) == 0) {
            this.f20214v = null;
        } else {
            this.f20214v = str9;
        }
    }

    public final ContentRatingInfo a(String str) {
        List list;
        Object next;
        Object next2;
        String strI;
        ContentRatingInfo contentRatingInfoA;
        String upperCase;
        String strI2;
        String upperCase2;
        TMDBReleaseDatesResponse tMDBReleaseDatesResponse = this.f20213u;
        if (tMDBReleaseDatesResponse != null && (list = tMDBReleaseDatesResponse.f20285b) != null) {
            if (str == null) {
                str = V0.u();
            }
            String upperCase3 = str.toUpperCase(Locale.ROOT);
            kotlin.jvm.internal.m.d(upperCase3, "toUpperCase(...)");
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                upperCase2 = ((TMDBReleaseDateResult) next).f20281a.toUpperCase(Locale.ROOT);
                kotlin.jvm.internal.m.d(upperCase2, "toUpperCase(...)");
            } while (!upperCase2.equals(upperCase3));
            TMDBReleaseDateResult tMDBReleaseDateResult = (TMDBReleaseDateResult) next;
            if (tMDBReleaseDateResult != null && (strI2 = AbstractC1833d1.i(tMDBReleaseDateResult.f20282b)) != null) {
                return new ContentRatingInfo(strI2, upperCase3, EnumC1948i0.f20778i, X4.b.f10859h);
            }
            ArrayList arrayList = new ArrayList(p078i6.q.I0(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(((TMDBReleaseDateResult) it2.next()).f20281a);
            }
            for (String str2 : AbstractC1833d1.n(upperCase3, arrayList)) {
                Iterator it3 = list.iterator();
                do {
                    if (!it3.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it3.next();
                    upperCase = ((TMDBReleaseDateResult) next2).f20281a.toUpperCase(Locale.ROOT);
                    kotlin.jvm.internal.m.d(upperCase, "toUpperCase(...)");
                } while (!upperCase.equals(str2));
                TMDBReleaseDateResult tMDBReleaseDateResult2 = (TMDBReleaseDateResult) next2;
                if (tMDBReleaseDateResult2 != null && (strI = AbstractC1833d1.i(tMDBReleaseDateResult2.f20282b)) != null && (contentRatingInfoA = ContentRatingInfo.a(new ContentRatingInfo(strI, str2, EnumC1948i0.f20778i, X4.b.f10859h), upperCase3)) != null) {
                    return contentRatingInfoA;
                }
            }
        }
        return null;
    }

    public final String getF20200f() {
        return this.f20200f;
    }

    public final Integer c() {
        String str = this.f20201h;
        if (str != null) {
            return O7.x.z0(O7.q.p1(4, str));
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TMDBMovieDetail)) {
            return false;
        }
        TMDBMovieDetail tMDBMovieDetail = (TMDBMovieDetail) obj;
        return this.f20195a == tMDBMovieDetail.f20195a && kotlin.jvm.internal.m.a(this.f20196b, tMDBMovieDetail.f20196b) && kotlin.jvm.internal.m.a(this.f20197c, tMDBMovieDetail.f20197c) && kotlin.jvm.internal.m.a(this.f20198d, tMDBMovieDetail.f20198d) && kotlin.jvm.internal.m.a(this.f20199e, tMDBMovieDetail.f20199e) && kotlin.jvm.internal.m.a(this.f20200f, tMDBMovieDetail.f20200f) && kotlin.jvm.internal.m.a(this.g, tMDBMovieDetail.g) && kotlin.jvm.internal.m.a(this.f20201h, tMDBMovieDetail.f20201h) && kotlin.jvm.internal.m.a(this.f20202i, tMDBMovieDetail.f20202i) && kotlin.jvm.internal.m.a(this.j, tMDBMovieDetail.j) && kotlin.jvm.internal.m.a(this.f20203k, tMDBMovieDetail.f20203k) && kotlin.jvm.internal.m.a(this.f20204l, tMDBMovieDetail.f20204l) && kotlin.jvm.internal.m.a(this.f20205m, tMDBMovieDetail.f20205m) && kotlin.jvm.internal.m.a(this.f20206n, tMDBMovieDetail.f20206n) && kotlin.jvm.internal.m.a(this.f20207o, tMDBMovieDetail.f20207o) && kotlin.jvm.internal.m.a(this.f20208p, tMDBMovieDetail.f20208p) && kotlin.jvm.internal.m.a(this.f20209q, tMDBMovieDetail.f20209q) && kotlin.jvm.internal.m.a(this.f20210r, tMDBMovieDetail.f20210r) && kotlin.jvm.internal.m.a(this.f20211s, tMDBMovieDetail.f20211s) && kotlin.jvm.internal.m.a(this.f20212t, tMDBMovieDetail.f20212t) && kotlin.jvm.internal.m.a(this.f20213u, tMDBMovieDetail.f20213u) && kotlin.jvm.internal.m.a(this.f20214v, tMDBMovieDetail.f20214v);
    }

    public final int hashCode() {
        int iA = B2.a.a(Integer.hashCode(this.f20195a) * 31, 31, this.f20196b);
        String str = this.f20197c;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f20198d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f20199e;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f20200f;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.g;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f20201h;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num = this.f20202i;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        Double d4 = this.j;
        int iHashCode8 = (iHashCode7 + (d4 == null ? 0 : d4.hashCode())) * 31;
        Integer num2 = this.f20203k;
        int iHashCode9 = (iHashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List list = this.f20204l;
        int iHashCode10 = (iHashCode9 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f20205m;
        int iHashCode11 = (iHashCode10 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.f20206n;
        int iHashCode12 = (iHashCode11 + (list3 == null ? 0 : list3.hashCode())) * 31;
        TMDBMovieCollection tMDBMovieCollection = this.f20207o;
        int iHashCode13 = (iHashCode12 + (tMDBMovieCollection == null ? 0 : tMDBMovieCollection.hashCode())) * 31;
        String str7 = this.f20208p;
        int iHashCode14 = (iHashCode13 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Long l2 = this.f20209q;
        int iHashCode15 = (iHashCode14 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l9 = this.f20210r;
        int iHashCode16 = (iHashCode15 + (l9 == null ? 0 : l9.hashCode())) * 31;
        TMDBCredits tMDBCredits = this.f20211s;
        int iHashCode17 = (iHashCode16 + (tMDBCredits == null ? 0 : tMDBCredits.hashCode())) * 31;
        TMDBImages tMDBImages = this.f20212t;
        int iHashCode18 = (iHashCode17 + (tMDBImages == null ? 0 : tMDBImages.hashCode())) * 31;
        TMDBReleaseDatesResponse tMDBReleaseDatesResponse = this.f20213u;
        int iHashCode19 = (iHashCode18 + (tMDBReleaseDatesResponse == null ? 0 : tMDBReleaseDatesResponse.hashCode())) * 31;
        String str8 = this.f20214v;
        return iHashCode19 + (str8 != null ? str8.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TMDBMovieDetail(id=");
        sb.append(this.f20195a);
        sb.append(", title=");
        sb.append(this.f20196b);
        sb.append(", originalTitle=");
        sb.append(this.f20197c);
        sb.append(", originalLanguage=");
        sb.append(this.f20198d);
        sb.append(", overview=");
        sb.append(this.f20199e);
        sb.append(", posterPath=");
        sb.append(this.f20200f);
        sb.append(", backdropPath=");
        sb.append(this.g);
        sb.append(", releaseDate=");
        sb.append(this.f20201h);
        sb.append(", runtime=");
        sb.append(this.f20202i);
        sb.append(", voteAverage=");
        sb.append(this.j);
        sb.append(", voteCount=");
        sb.append(this.f20203k);
        sb.append(", genres=");
        sb.append(this.f20204l);
        sb.append(", productionCountries=");
        sb.append(this.f20205m);
        sb.append(", productionCompanies=");
        sb.append(this.f20206n);
        sb.append(", belongsToCollection=");
        sb.append(this.f20207o);
        sb.append(", status=");
        sb.append(this.f20208p);
        sb.append(", budget=");
        sb.append(this.f20209q);
        sb.append(", revenue=");
        sb.append(this.f20210r);
        sb.append(", credits=");
        sb.append(this.f20211s);
        sb.append(", images=");
        sb.append(this.f20212t);
        sb.append(", releaseDates=");
        sb.append(this.f20213u);
        sb.append(", imdbId=");
        return Y6.f.m(sb, this.f20214v, ")");
    }
}
