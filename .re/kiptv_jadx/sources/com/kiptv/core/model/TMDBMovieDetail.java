package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/TMDBMovieDetail;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class TMDBMovieDetail {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.kiptv.core.model.TMDBMovieDetail.Companion INSTANCE = new com.kiptv.core.model.TMDBMovieDetail.Companion();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final kotlinx.serialization.KSerializer[] f20194w = {null, null, null, null, null, null, null, null, null, null, null, new p153r8.C2691d(com.kiptv.core.model.TMDBGenre$$serializer.INSTANCE, 0), new p153r8.C2691d(com.kiptv.core.model.TMDBCountry$$serializer.INSTANCE, 0), new p153r8.C2691d(com.kiptv.core.model.TMDBCompany$$serializer.INSTANCE, 0), null, null, null, null, null, null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f20196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f20197c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f20198d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.String f20199e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.String f20200f;
    public final java.lang.String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f20201h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.Integer f20202i;
    public final java.lang.Double j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final java.lang.Integer f20203k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final java.util.List f20204l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final java.util.List f20205m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final java.util.List f20206n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final com.kiptv.core.model.TMDBMovieCollection f20207o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final java.lang.String f20208p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final java.lang.Long f20209q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final java.lang.Long f20210r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final com.kiptv.core.model.TMDBCredits f20211s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final com.kiptv.core.model.TMDBImages f20212t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final com.kiptv.core.model.TMDBReleaseDatesResponse f20213u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final java.lang.String f20214v;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/TMDBMovieDetail$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/TMDBMovieDetail;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final kotlinx.serialization.KSerializer serializer() {
            return com.kiptv.core.model.TMDBMovieDetail$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TMDBMovieDetail(int i3, int i9, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.Integer num, java.lang.Double d4, java.lang.Integer num2, java.util.List list, java.util.List list2, java.util.List list3, com.kiptv.core.model.TMDBMovieCollection tMDBMovieCollection, java.lang.String str8, java.lang.Long l2, java.lang.Long l9, com.kiptv.core.model.TMDBCredits tMDBCredits, com.kiptv.core.model.TMDBImages tMDBImages, com.kiptv.core.model.TMDBReleaseDatesResponse tMDBReleaseDatesResponse, java.lang.String str9) {
        if (3 != (i3 & 3)) {
            p153r8.AbstractC2686a0.l(i3, 3, com.kiptv.core.model.TMDBMovieDetail$$serializer.INSTANCE.getDescriptor());
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

    public final com.kiptv.core.model.ContentRatingInfo a(java.lang.String str) {
        java.util.List list;
        java.lang.Object next;
        java.lang.Object next2;
        java.lang.String strI;
        com.kiptv.core.model.ContentRatingInfo contentRatingInfoA;
        java.lang.String upperCase;
        java.lang.String strI2;
        java.lang.String upperCase2;
        com.kiptv.core.model.TMDBReleaseDatesResponse tMDBReleaseDatesResponse = this.f20213u;
        if (tMDBReleaseDatesResponse != null && (list = tMDBReleaseDatesResponse.f20285b) != null) {
            if (str == null) {
                str = com.google.android.gms.internal.play_billing.V0.u();
            }
            java.lang.String upperCase3 = str.toUpperCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.m.d(upperCase3, "toUpperCase(...)");
            java.util.Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                upperCase2 = ((com.kiptv.core.model.TMDBReleaseDateResult) next).f20281a.toUpperCase(java.util.Locale.ROOT);
                kotlin.jvm.internal.m.d(upperCase2, "toUpperCase(...)");
            } while (!upperCase2.equals(upperCase3));
            com.kiptv.core.model.TMDBReleaseDateResult tMDBReleaseDateResult = (com.kiptv.core.model.TMDBReleaseDateResult) next;
            if (tMDBReleaseDateResult != null && (strI2 = com.google.android.gms.internal.play_billing.AbstractC1833d1.i(tMDBReleaseDateResult.f20282b)) != null) {
                return new com.kiptv.core.model.ContentRatingInfo(strI2, upperCase3, com.kiptv.core.model.EnumC1948i0.f20778i, X4.b.f10859h);
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(p078i6.q.I0(list, 10));
            java.util.Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(((com.kiptv.core.model.TMDBReleaseDateResult) it2.next()).f20281a);
            }
            for (java.lang.String str2 : com.google.android.gms.internal.play_billing.AbstractC1833d1.n(upperCase3, arrayList)) {
                java.util.Iterator it3 = list.iterator();
                do {
                    if (!it3.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it3.next();
                    upperCase = ((com.kiptv.core.model.TMDBReleaseDateResult) next2).f20281a.toUpperCase(java.util.Locale.ROOT);
                    kotlin.jvm.internal.m.d(upperCase, "toUpperCase(...)");
                } while (!upperCase.equals(str2));
                com.kiptv.core.model.TMDBReleaseDateResult tMDBReleaseDateResult2 = (com.kiptv.core.model.TMDBReleaseDateResult) next2;
                if (tMDBReleaseDateResult2 != null && (strI = com.google.android.gms.internal.play_billing.AbstractC1833d1.i(tMDBReleaseDateResult2.f20282b)) != null && (contentRatingInfoA = com.kiptv.core.model.ContentRatingInfo.a(new com.kiptv.core.model.ContentRatingInfo(strI, str2, com.kiptv.core.model.EnumC1948i0.f20778i, X4.b.f10859h), upperCase3)) != null) {
                    return contentRatingInfoA;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final java.lang.String getF20200f() {
        return this.f20200f;
    }

    public final java.lang.Integer c() {
        java.lang.String str = this.f20201h;
        if (str != null) {
            return O7.x.z0(O7.q.p1(4, str));
        }
        return null;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.model.TMDBMovieDetail)) {
            return false;
        }
        com.kiptv.core.model.TMDBMovieDetail tMDBMovieDetail = (com.kiptv.core.model.TMDBMovieDetail) obj;
        return this.f20195a == tMDBMovieDetail.f20195a && kotlin.jvm.internal.m.a(this.f20196b, tMDBMovieDetail.f20196b) && kotlin.jvm.internal.m.a(this.f20197c, tMDBMovieDetail.f20197c) && kotlin.jvm.internal.m.a(this.f20198d, tMDBMovieDetail.f20198d) && kotlin.jvm.internal.m.a(this.f20199e, tMDBMovieDetail.f20199e) && kotlin.jvm.internal.m.a(this.f20200f, tMDBMovieDetail.f20200f) && kotlin.jvm.internal.m.a(this.g, tMDBMovieDetail.g) && kotlin.jvm.internal.m.a(this.f20201h, tMDBMovieDetail.f20201h) && kotlin.jvm.internal.m.a(this.f20202i, tMDBMovieDetail.f20202i) && kotlin.jvm.internal.m.a(this.j, tMDBMovieDetail.j) && kotlin.jvm.internal.m.a(this.f20203k, tMDBMovieDetail.f20203k) && kotlin.jvm.internal.m.a(this.f20204l, tMDBMovieDetail.f20204l) && kotlin.jvm.internal.m.a(this.f20205m, tMDBMovieDetail.f20205m) && kotlin.jvm.internal.m.a(this.f20206n, tMDBMovieDetail.f20206n) && kotlin.jvm.internal.m.a(this.f20207o, tMDBMovieDetail.f20207o) && kotlin.jvm.internal.m.a(this.f20208p, tMDBMovieDetail.f20208p) && kotlin.jvm.internal.m.a(this.f20209q, tMDBMovieDetail.f20209q) && kotlin.jvm.internal.m.a(this.f20210r, tMDBMovieDetail.f20210r) && kotlin.jvm.internal.m.a(this.f20211s, tMDBMovieDetail.f20211s) && kotlin.jvm.internal.m.a(this.f20212t, tMDBMovieDetail.f20212t) && kotlin.jvm.internal.m.a(this.f20213u, tMDBMovieDetail.f20213u) && kotlin.jvm.internal.m.a(this.f20214v, tMDBMovieDetail.f20214v);
    }

    public final int hashCode() {
        int iA = B2.a.a(java.lang.Integer.hashCode(this.f20195a) * 31, 31, this.f20196b);
        java.lang.String str = this.f20197c;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f20198d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f20199e;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.String str4 = this.f20200f;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        java.lang.String str5 = this.g;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        java.lang.String str6 = this.f20201h;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        java.lang.Integer num = this.f20202i;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        java.lang.Double d4 = this.j;
        int iHashCode8 = (iHashCode7 + (d4 == null ? 0 : d4.hashCode())) * 31;
        java.lang.Integer num2 = this.f20203k;
        int iHashCode9 = (iHashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31;
        java.util.List list = this.f20204l;
        int iHashCode10 = (iHashCode9 + (list == null ? 0 : list.hashCode())) * 31;
        java.util.List list2 = this.f20205m;
        int iHashCode11 = (iHashCode10 + (list2 == null ? 0 : list2.hashCode())) * 31;
        java.util.List list3 = this.f20206n;
        int iHashCode12 = (iHashCode11 + (list3 == null ? 0 : list3.hashCode())) * 31;
        com.kiptv.core.model.TMDBMovieCollection tMDBMovieCollection = this.f20207o;
        int iHashCode13 = (iHashCode12 + (tMDBMovieCollection == null ? 0 : tMDBMovieCollection.hashCode())) * 31;
        java.lang.String str7 = this.f20208p;
        int iHashCode14 = (iHashCode13 + (str7 == null ? 0 : str7.hashCode())) * 31;
        java.lang.Long l2 = this.f20209q;
        int iHashCode15 = (iHashCode14 + (l2 == null ? 0 : l2.hashCode())) * 31;
        java.lang.Long l9 = this.f20210r;
        int iHashCode16 = (iHashCode15 + (l9 == null ? 0 : l9.hashCode())) * 31;
        com.kiptv.core.model.TMDBCredits tMDBCredits = this.f20211s;
        int iHashCode17 = (iHashCode16 + (tMDBCredits == null ? 0 : tMDBCredits.hashCode())) * 31;
        com.kiptv.core.model.TMDBImages tMDBImages = this.f20212t;
        int iHashCode18 = (iHashCode17 + (tMDBImages == null ? 0 : tMDBImages.hashCode())) * 31;
        com.kiptv.core.model.TMDBReleaseDatesResponse tMDBReleaseDatesResponse = this.f20213u;
        int iHashCode19 = (iHashCode18 + (tMDBReleaseDatesResponse == null ? 0 : tMDBReleaseDatesResponse.hashCode())) * 31;
        java.lang.String str8 = this.f20214v;
        return iHashCode19 + (str8 != null ? str8.hashCode() : 0);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TMDBMovieDetail(id=");
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
