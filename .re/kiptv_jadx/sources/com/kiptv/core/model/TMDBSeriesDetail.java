package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/TMDBSeriesDetail;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class TMDBSeriesDetail {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.kiptv.core.model.TMDBSeriesDetail.Companion INSTANCE = new com.kiptv.core.model.TMDBSeriesDetail.Companion();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final kotlinx.serialization.KSerializer[] f20313z = {null, null, null, null, null, null, null, null, null, null, new p153r8.C2691d(p153r8.K.f26915a, 0), null, null, new p153r8.C2691d(com.kiptv.core.model.TMDBGenre$$serializer.INSTANCE, 0), null, null, null, null, null, null, new p153r8.C2691d(com.kiptv.core.model.TMDBCountry$$serializer.INSTANCE, 0), new p153r8.C2691d(com.kiptv.core.model.TMDBCompany$$serializer.INSTANCE, 0), new p153r8.C2691d(com.kiptv.core.model.TMDBNetwork$$serializer.INSTANCE, 0), new p153r8.C2691d(p153r8.p0.f26988a, 0), new p153r8.C2691d(com.kiptv.core.model.TMDBCreatedBy$$serializer.INSTANCE, 0)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f20315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f20316c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f20317d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.String f20318e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.String f20319f;
    public final java.lang.String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f20320h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.Integer f20321i;
    public final java.lang.Integer j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final java.util.List f20322k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final java.lang.Double f20323l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final java.lang.Integer f20324m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final java.util.List f20325n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final com.kiptv.core.model.TMDBCredits f20326o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final com.kiptv.core.model.TMDBImages f20327p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final com.kiptv.core.model.TMDBContentRatingsResponse f20328q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final java.lang.String f20329r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final com.kiptv.core.model.TMDBExternalIds f20330s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final java.lang.String f20331t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final java.util.List f20332u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final java.util.List f20333v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final java.util.List f20334w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final java.util.List f20335x;
    public final java.util.List y;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/TMDBSeriesDetail$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/TMDBSeriesDetail;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final kotlinx.serialization.KSerializer serializer() {
            return com.kiptv.core.model.TMDBSeriesDetail$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TMDBSeriesDetail(int i3, int i9, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.Integer num, java.lang.Integer num2, java.util.List list, java.lang.Double d4, java.lang.Integer num3, java.util.List list2, com.kiptv.core.model.TMDBCredits tMDBCredits, com.kiptv.core.model.TMDBImages tMDBImages, com.kiptv.core.model.TMDBContentRatingsResponse tMDBContentRatingsResponse, java.lang.String str8, com.kiptv.core.model.TMDBExternalIds tMDBExternalIds, java.lang.String str9, java.util.List list3, java.util.List list4, java.util.List list5, java.util.List list6, java.util.List list7) {
        if (3 != (i3 & 3)) {
            p153r8.AbstractC2686a0.l(i3, 3, com.kiptv.core.model.TMDBSeriesDetail$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f20314a = i9;
        this.f20315b = str;
        if ((i3 & 4) == 0) {
            this.f20316c = null;
        } else {
            this.f20316c = str2;
        }
        if ((i3 & 8) == 0) {
            this.f20317d = null;
        } else {
            this.f20317d = str3;
        }
        if ((i3 & 16) == 0) {
            this.f20318e = null;
        } else {
            this.f20318e = str4;
        }
        if ((i3 & 32) == 0) {
            this.f20319f = null;
        } else {
            this.f20319f = str5;
        }
        if ((i3 & 64) == 0) {
            this.g = null;
        } else {
            this.g = str6;
        }
        if ((i3 & 128) == 0) {
            this.f20320h = null;
        } else {
            this.f20320h = str7;
        }
        if ((i3 & 256) == 0) {
            this.f20321i = null;
        } else {
            this.f20321i = num;
        }
        if ((i3 & 512) == 0) {
            this.j = null;
        } else {
            this.j = num2;
        }
        if ((i3 & 1024) == 0) {
            this.f20322k = null;
        } else {
            this.f20322k = list;
        }
        if ((i3 & 2048) == 0) {
            this.f20323l = null;
        } else {
            this.f20323l = d4;
        }
        if ((i3 & 4096) == 0) {
            this.f20324m = null;
        } else {
            this.f20324m = num3;
        }
        if ((i3 & 8192) == 0) {
            this.f20325n = null;
        } else {
            this.f20325n = list2;
        }
        if ((i3 & 16384) == 0) {
            this.f20326o = null;
        } else {
            this.f20326o = tMDBCredits;
        }
        if ((32768 & i3) == 0) {
            this.f20327p = null;
        } else {
            this.f20327p = tMDBImages;
        }
        if ((65536 & i3) == 0) {
            this.f20328q = null;
        } else {
            this.f20328q = tMDBContentRatingsResponse;
        }
        if ((131072 & i3) == 0) {
            this.f20329r = null;
        } else {
            this.f20329r = str8;
        }
        if ((262144 & i3) == 0) {
            this.f20330s = null;
        } else {
            this.f20330s = tMDBExternalIds;
        }
        if ((524288 & i3) == 0) {
            this.f20331t = null;
        } else {
            this.f20331t = str9;
        }
        if ((1048576 & i3) == 0) {
            this.f20332u = null;
        } else {
            this.f20332u = list3;
        }
        if ((2097152 & i3) == 0) {
            this.f20333v = null;
        } else {
            this.f20333v = list4;
        }
        if ((4194304 & i3) == 0) {
            this.f20334w = null;
        } else {
            this.f20334w = list5;
        }
        if ((8388608 & i3) == 0) {
            this.f20335x = null;
        } else {
            this.f20335x = list6;
        }
        if ((i3 & 16777216) == 0) {
            this.y = null;
        } else {
            this.y = list7;
        }
    }

    public final com.kiptv.core.model.ContentRatingInfo a(java.lang.String str) {
        java.util.List list;
        java.lang.Object next;
        java.lang.Object next2;
        java.lang.String str2;
        java.lang.String string;
        com.kiptv.core.model.ContentRatingInfo contentRatingInfoA;
        java.lang.String upperCase;
        java.lang.String str3;
        java.lang.String string2;
        java.lang.String upperCase2;
        com.kiptv.core.model.TMDBContentRatingsResponse tMDBContentRatingsResponse = this.f20328q;
        if (tMDBContentRatingsResponse != null && (list = tMDBContentRatingsResponse.f20140b) != null) {
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
                upperCase2 = ((com.kiptv.core.model.TMDBContentRating) next).f20136a.toUpperCase(java.util.Locale.ROOT);
                kotlin.jvm.internal.m.d(upperCase2, "toUpperCase(...)");
            } while (!upperCase2.equals(upperCase3));
            com.kiptv.core.model.TMDBContentRating tMDBContentRating = (com.kiptv.core.model.TMDBContentRating) next;
            if (tMDBContentRating != null && (str3 = tMDBContentRating.f20137b) != null && (string2 = O7.q.r1(str3).toString()) != null) {
                if (string2.length() <= 0) {
                    string2 = null;
                }
                if (string2 != null) {
                    return new com.kiptv.core.model.ContentRatingInfo(string2, upperCase3, com.kiptv.core.model.EnumC1948i0.f20778i, X4.b.f10860i);
                }
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(p078i6.q.I0(list, 10));
            java.util.Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(((com.kiptv.core.model.TMDBContentRating) it2.next()).f20136a);
            }
            for (java.lang.String str4 : com.google.android.gms.internal.play_billing.AbstractC1833d1.n(upperCase3, arrayList)) {
                java.util.Iterator it3 = list.iterator();
                do {
                    if (!it3.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it3.next();
                    upperCase = ((com.kiptv.core.model.TMDBContentRating) next2).f20136a.toUpperCase(java.util.Locale.ROOT);
                    kotlin.jvm.internal.m.d(upperCase, "toUpperCase(...)");
                } while (!upperCase.equals(str4));
                com.kiptv.core.model.TMDBContentRating tMDBContentRating2 = (com.kiptv.core.model.TMDBContentRating) next2;
                if (tMDBContentRating2 != null && (str2 = tMDBContentRating2.f20137b) != null && (string = O7.q.r1(str2).toString()) != null) {
                    if (string.length() <= 0) {
                        string = null;
                    }
                    if (string != null && (contentRatingInfoA = com.kiptv.core.model.ContentRatingInfo.a(new com.kiptv.core.model.ContentRatingInfo(string, str4, com.kiptv.core.model.EnumC1948i0.f20778i, X4.b.f10860i), upperCase3)) != null) {
                        return contentRatingInfoA;
                    }
                }
            }
        }
        return null;
    }

    public final java.lang.Integer b() {
        java.lang.String str = this.g;
        if (str != null) {
            return O7.x.z0(O7.q.p1(4, str));
        }
        return null;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.model.TMDBSeriesDetail)) {
            return false;
        }
        com.kiptv.core.model.TMDBSeriesDetail tMDBSeriesDetail = (com.kiptv.core.model.TMDBSeriesDetail) obj;
        return this.f20314a == tMDBSeriesDetail.f20314a && kotlin.jvm.internal.m.a(this.f20315b, tMDBSeriesDetail.f20315b) && kotlin.jvm.internal.m.a(this.f20316c, tMDBSeriesDetail.f20316c) && kotlin.jvm.internal.m.a(this.f20317d, tMDBSeriesDetail.f20317d) && kotlin.jvm.internal.m.a(this.f20318e, tMDBSeriesDetail.f20318e) && kotlin.jvm.internal.m.a(this.f20319f, tMDBSeriesDetail.f20319f) && kotlin.jvm.internal.m.a(this.g, tMDBSeriesDetail.g) && kotlin.jvm.internal.m.a(this.f20320h, tMDBSeriesDetail.f20320h) && kotlin.jvm.internal.m.a(this.f20321i, tMDBSeriesDetail.f20321i) && kotlin.jvm.internal.m.a(this.j, tMDBSeriesDetail.j) && kotlin.jvm.internal.m.a(this.f20322k, tMDBSeriesDetail.f20322k) && kotlin.jvm.internal.m.a(this.f20323l, tMDBSeriesDetail.f20323l) && kotlin.jvm.internal.m.a(this.f20324m, tMDBSeriesDetail.f20324m) && kotlin.jvm.internal.m.a(this.f20325n, tMDBSeriesDetail.f20325n) && kotlin.jvm.internal.m.a(this.f20326o, tMDBSeriesDetail.f20326o) && kotlin.jvm.internal.m.a(this.f20327p, tMDBSeriesDetail.f20327p) && kotlin.jvm.internal.m.a(this.f20328q, tMDBSeriesDetail.f20328q) && kotlin.jvm.internal.m.a(this.f20329r, tMDBSeriesDetail.f20329r) && kotlin.jvm.internal.m.a(this.f20330s, tMDBSeriesDetail.f20330s) && kotlin.jvm.internal.m.a(this.f20331t, tMDBSeriesDetail.f20331t) && kotlin.jvm.internal.m.a(this.f20332u, tMDBSeriesDetail.f20332u) && kotlin.jvm.internal.m.a(this.f20333v, tMDBSeriesDetail.f20333v) && kotlin.jvm.internal.m.a(this.f20334w, tMDBSeriesDetail.f20334w) && kotlin.jvm.internal.m.a(this.f20335x, tMDBSeriesDetail.f20335x) && kotlin.jvm.internal.m.a(this.y, tMDBSeriesDetail.y);
    }

    public final int hashCode() {
        int iA = B2.a.a(java.lang.Integer.hashCode(this.f20314a) * 31, 31, this.f20315b);
        java.lang.String str = this.f20316c;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f20317d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f20318e;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.String str4 = this.f20319f;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        java.lang.String str5 = this.g;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        java.lang.String str6 = this.f20320h;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        java.lang.Integer num = this.f20321i;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        java.lang.Integer num2 = this.j;
        int iHashCode8 = (iHashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        java.util.List list = this.f20322k;
        int iHashCode9 = (iHashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        java.lang.Double d4 = this.f20323l;
        int iHashCode10 = (iHashCode9 + (d4 == null ? 0 : d4.hashCode())) * 31;
        java.lang.Integer num3 = this.f20324m;
        int iHashCode11 = (iHashCode10 + (num3 == null ? 0 : num3.hashCode())) * 31;
        java.util.List list2 = this.f20325n;
        int iHashCode12 = (iHashCode11 + (list2 == null ? 0 : list2.hashCode())) * 31;
        com.kiptv.core.model.TMDBCredits tMDBCredits = this.f20326o;
        int iHashCode13 = (iHashCode12 + (tMDBCredits == null ? 0 : tMDBCredits.hashCode())) * 31;
        com.kiptv.core.model.TMDBImages tMDBImages = this.f20327p;
        int iHashCode14 = (iHashCode13 + (tMDBImages == null ? 0 : tMDBImages.hashCode())) * 31;
        com.kiptv.core.model.TMDBContentRatingsResponse tMDBContentRatingsResponse = this.f20328q;
        int iHashCode15 = (iHashCode14 + (tMDBContentRatingsResponse == null ? 0 : tMDBContentRatingsResponse.hashCode())) * 31;
        java.lang.String str7 = this.f20329r;
        int iHashCode16 = (iHashCode15 + (str7 == null ? 0 : str7.hashCode())) * 31;
        com.kiptv.core.model.TMDBExternalIds tMDBExternalIds = this.f20330s;
        int iHashCode17 = (iHashCode16 + (tMDBExternalIds == null ? 0 : tMDBExternalIds.hashCode())) * 31;
        java.lang.String str8 = this.f20331t;
        int iHashCode18 = (iHashCode17 + (str8 == null ? 0 : str8.hashCode())) * 31;
        java.util.List list3 = this.f20332u;
        int iHashCode19 = (iHashCode18 + (list3 == null ? 0 : list3.hashCode())) * 31;
        java.util.List list4 = this.f20333v;
        int iHashCode20 = (iHashCode19 + (list4 == null ? 0 : list4.hashCode())) * 31;
        java.util.List list5 = this.f20334w;
        int iHashCode21 = (iHashCode20 + (list5 == null ? 0 : list5.hashCode())) * 31;
        java.util.List list6 = this.f20335x;
        int iHashCode22 = (iHashCode21 + (list6 == null ? 0 : list6.hashCode())) * 31;
        java.util.List list7 = this.y;
        return iHashCode22 + (list7 != null ? list7.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "TMDBSeriesDetail(id=" + this.f20314a + ", name=" + this.f20315b + ", originalName=" + this.f20316c + ", overview=" + this.f20317d + ", posterPath=" + this.f20318e + ", backdropPath=" + this.f20319f + ", firstAirDate=" + this.g + ", lastAirDate=" + this.f20320h + ", numberOfSeasons=" + this.f20321i + ", numberOfEpisodes=" + this.j + ", episodeRunTime=" + this.f20322k + ", voteAverage=" + this.f20323l + ", voteCount=" + this.f20324m + ", genres=" + this.f20325n + ", credits=" + this.f20326o + ", images=" + this.f20327p + ", contentRatings=" + this.f20328q + ", originalLanguage=" + this.f20329r + ", externalIds=" + this.f20330s + ", status=" + this.f20331t + ", productionCountries=" + this.f20332u + ", productionCompanies=" + this.f20333v + ", networks=" + this.f20334w + ", originCountry=" + this.f20335x + ", createdBy=" + this.y + ")";
    }
}
