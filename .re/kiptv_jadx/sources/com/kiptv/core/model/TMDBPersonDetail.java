package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/TMDBPersonDetail;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class TMDBPersonDetail {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.kiptv.core.model.TMDBPersonDetail.Companion INSTANCE = new com.kiptv.core.model.TMDBPersonDetail.Companion();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final kotlinx.serialization.KSerializer[] f20244q = {null, null, null, null, null, null, null, null, null, new p153r8.C2691d(p153r8.p0.f26988a, 0), null, null, null, null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f20246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f20247c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f20248d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.String f20249e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.Integer f20250f;
    public final java.lang.String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f20251h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.String f20252i;
    public final java.util.List j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final java.lang.Double f20253k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final java.lang.String f20254l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final java.lang.String f20255m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final com.kiptv.core.model.TMDBPersonCombinedCredits f20256n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final com.kiptv.core.model.TMDBExternalIds f20257o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final com.kiptv.core.model.TMDBPersonImages f20258p;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/TMDBPersonDetail$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/TMDBPersonDetail;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final kotlinx.serialization.KSerializer serializer() {
            return com.kiptv.core.model.TMDBPersonDetail$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TMDBPersonDetail(int i3, int i9, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.Integer num, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.util.List list, java.lang.Double d4, java.lang.String str8, java.lang.String str9, com.kiptv.core.model.TMDBPersonCombinedCredits tMDBPersonCombinedCredits, com.kiptv.core.model.TMDBExternalIds tMDBExternalIds, com.kiptv.core.model.TMDBPersonImages tMDBPersonImages) {
        if (3 != (i3 & 3)) {
            p153r8.AbstractC2686a0.l(i3, 3, com.kiptv.core.model.TMDBPersonDetail$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f20245a = i9;
        this.f20246b = str;
        if ((i3 & 4) == 0) {
            this.f20247c = null;
        } else {
            this.f20247c = str2;
        }
        if ((i3 & 8) == 0) {
            this.f20248d = null;
        } else {
            this.f20248d = str3;
        }
        if ((i3 & 16) == 0) {
            this.f20249e = null;
        } else {
            this.f20249e = str4;
        }
        if ((i3 & 32) == 0) {
            this.f20250f = null;
        } else {
            this.f20250f = num;
        }
        if ((i3 & 64) == 0) {
            this.g = null;
        } else {
            this.g = str5;
        }
        if ((i3 & 128) == 0) {
            this.f20251h = null;
        } else {
            this.f20251h = str6;
        }
        if ((i3 & 256) == 0) {
            this.f20252i = null;
        } else {
            this.f20252i = str7;
        }
        if ((i3 & 512) == 0) {
            this.j = null;
        } else {
            this.j = list;
        }
        if ((i3 & 1024) == 0) {
            this.f20253k = null;
        } else {
            this.f20253k = d4;
        }
        if ((i3 & 2048) == 0) {
            this.f20254l = null;
        } else {
            this.f20254l = str8;
        }
        if ((i3 & 4096) == 0) {
            this.f20255m = null;
        } else {
            this.f20255m = str9;
        }
        if ((i3 & 8192) == 0) {
            this.f20256n = null;
        } else {
            this.f20256n = tMDBPersonCombinedCredits;
        }
        if ((i3 & 16384) == 0) {
            this.f20257o = null;
        } else {
            this.f20257o = tMDBExternalIds;
        }
        if ((i3 & 32768) == 0) {
            this.f20258p = null;
        } else {
            this.f20258p = tMDBPersonImages;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.model.TMDBPersonDetail)) {
            return false;
        }
        com.kiptv.core.model.TMDBPersonDetail tMDBPersonDetail = (com.kiptv.core.model.TMDBPersonDetail) obj;
        return this.f20245a == tMDBPersonDetail.f20245a && kotlin.jvm.internal.m.a(this.f20246b, tMDBPersonDetail.f20246b) && kotlin.jvm.internal.m.a(this.f20247c, tMDBPersonDetail.f20247c) && kotlin.jvm.internal.m.a(this.f20248d, tMDBPersonDetail.f20248d) && kotlin.jvm.internal.m.a(this.f20249e, tMDBPersonDetail.f20249e) && kotlin.jvm.internal.m.a(this.f20250f, tMDBPersonDetail.f20250f) && kotlin.jvm.internal.m.a(this.g, tMDBPersonDetail.g) && kotlin.jvm.internal.m.a(this.f20251h, tMDBPersonDetail.f20251h) && kotlin.jvm.internal.m.a(this.f20252i, tMDBPersonDetail.f20252i) && kotlin.jvm.internal.m.a(this.j, tMDBPersonDetail.j) && kotlin.jvm.internal.m.a(this.f20253k, tMDBPersonDetail.f20253k) && kotlin.jvm.internal.m.a(this.f20254l, tMDBPersonDetail.f20254l) && kotlin.jvm.internal.m.a(this.f20255m, tMDBPersonDetail.f20255m) && kotlin.jvm.internal.m.a(this.f20256n, tMDBPersonDetail.f20256n) && kotlin.jvm.internal.m.a(this.f20257o, tMDBPersonDetail.f20257o) && kotlin.jvm.internal.m.a(this.f20258p, tMDBPersonDetail.f20258p);
    }

    public final int hashCode() {
        int iA = B2.a.a(java.lang.Integer.hashCode(this.f20245a) * 31, 31, this.f20246b);
        java.lang.String str = this.f20247c;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f20248d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f20249e;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.Integer num = this.f20250f;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        java.lang.String str4 = this.g;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        java.lang.String str5 = this.f20251h;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        java.lang.String str6 = this.f20252i;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        java.util.List list = this.j;
        int iHashCode8 = (iHashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        java.lang.Double d4 = this.f20253k;
        int iHashCode9 = (iHashCode8 + (d4 == null ? 0 : d4.hashCode())) * 31;
        java.lang.String str7 = this.f20254l;
        int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        java.lang.String str8 = this.f20255m;
        int iHashCode11 = (iHashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        com.kiptv.core.model.TMDBPersonCombinedCredits tMDBPersonCombinedCredits = this.f20256n;
        int iHashCode12 = (iHashCode11 + (tMDBPersonCombinedCredits == null ? 0 : tMDBPersonCombinedCredits.hashCode())) * 31;
        com.kiptv.core.model.TMDBExternalIds tMDBExternalIds = this.f20257o;
        int iHashCode13 = (iHashCode12 + (tMDBExternalIds == null ? 0 : tMDBExternalIds.hashCode())) * 31;
        com.kiptv.core.model.TMDBPersonImages tMDBPersonImages = this.f20258p;
        return iHashCode13 + (tMDBPersonImages != null ? tMDBPersonImages.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "TMDBPersonDetail(id=" + this.f20245a + ", name=" + this.f20246b + ", biography=" + this.f20247c + ", birthday=" + this.f20248d + ", deathday=" + this.f20249e + ", gender=" + this.f20250f + ", knownForDepartment=" + this.g + ", placeOfBirth=" + this.f20251h + ", profilePath=" + this.f20252i + ", alsoKnownAs=" + this.j + ", popularity=" + this.f20253k + ", imdbId=" + this.f20254l + ", homepage=" + this.f20255m + ", combinedCredits=" + this.f20256n + ", externalIds=" + this.f20257o + ", images=" + this.f20258p + ")";
    }
}
