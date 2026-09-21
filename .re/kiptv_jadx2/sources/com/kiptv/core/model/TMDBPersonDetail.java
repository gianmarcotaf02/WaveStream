package com.kiptv.core.model;

import androidx.media3.container.NalUnitUtil;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import p153r8.AbstractC2686a0;
import p153r8.C2691d;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/TMDBPersonDetail;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final class TMDBPersonDetail {

    public static final Companion INSTANCE = new Companion();

    public static final KSerializer[] f20244q = {null, null, null, null, null, null, null, null, null, new C2691d(p153r8.p0.f26988a, 0), null, null, null, null, null, null};

    public final int f20245a;

    public final String f20246b;

    public final String f20247c;

    public final String f20248d;

    public final String f20249e;

    public final Integer f20250f;
    public final String g;

    public final String f20251h;

    public final String f20252i;
    public final List j;

    public final Double f20253k;

    public final String f20254l;

    public final String f20255m;

    public final TMDBPersonCombinedCredits f20256n;

    public final TMDBExternalIds f20257o;

    public final TMDBPersonImages f20258p;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/TMDBPersonDetail$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/TMDBPersonDetail;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final KSerializer serializer() {
            return TMDBPersonDetail$$serializer.INSTANCE;
        }
    }

    public TMDBPersonDetail(int i3, int i9, String str, String str2, String str3, String str4, Integer num, String str5, String str6, String str7, List list, Double d4, String str8, String str9, TMDBPersonCombinedCredits tMDBPersonCombinedCredits, TMDBExternalIds tMDBExternalIds, TMDBPersonImages tMDBPersonImages) {
        if (3 != (i3 & 3)) {
            AbstractC2686a0.l(i3, 3, TMDBPersonDetail$$serializer.INSTANCE.getDescriptor());
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TMDBPersonDetail)) {
            return false;
        }
        TMDBPersonDetail tMDBPersonDetail = (TMDBPersonDetail) obj;
        return this.f20245a == tMDBPersonDetail.f20245a && kotlin.jvm.internal.m.a(this.f20246b, tMDBPersonDetail.f20246b) && kotlin.jvm.internal.m.a(this.f20247c, tMDBPersonDetail.f20247c) && kotlin.jvm.internal.m.a(this.f20248d, tMDBPersonDetail.f20248d) && kotlin.jvm.internal.m.a(this.f20249e, tMDBPersonDetail.f20249e) && kotlin.jvm.internal.m.a(this.f20250f, tMDBPersonDetail.f20250f) && kotlin.jvm.internal.m.a(this.g, tMDBPersonDetail.g) && kotlin.jvm.internal.m.a(this.f20251h, tMDBPersonDetail.f20251h) && kotlin.jvm.internal.m.a(this.f20252i, tMDBPersonDetail.f20252i) && kotlin.jvm.internal.m.a(this.j, tMDBPersonDetail.j) && kotlin.jvm.internal.m.a(this.f20253k, tMDBPersonDetail.f20253k) && kotlin.jvm.internal.m.a(this.f20254l, tMDBPersonDetail.f20254l) && kotlin.jvm.internal.m.a(this.f20255m, tMDBPersonDetail.f20255m) && kotlin.jvm.internal.m.a(this.f20256n, tMDBPersonDetail.f20256n) && kotlin.jvm.internal.m.a(this.f20257o, tMDBPersonDetail.f20257o) && kotlin.jvm.internal.m.a(this.f20258p, tMDBPersonDetail.f20258p);
    }

    public final int hashCode() {
        int iA = B2.a.a(Integer.hashCode(this.f20245a) * 31, 31, this.f20246b);
        String str = this.f20247c;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f20248d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f20249e;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.f20250f;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.g;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f20251h;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f20252i;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        List list = this.j;
        int iHashCode8 = (iHashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        Double d4 = this.f20253k;
        int iHashCode9 = (iHashCode8 + (d4 == null ? 0 : d4.hashCode())) * 31;
        String str7 = this.f20254l;
        int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f20255m;
        int iHashCode11 = (iHashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        TMDBPersonCombinedCredits tMDBPersonCombinedCredits = this.f20256n;
        int iHashCode12 = (iHashCode11 + (tMDBPersonCombinedCredits == null ? 0 : tMDBPersonCombinedCredits.hashCode())) * 31;
        TMDBExternalIds tMDBExternalIds = this.f20257o;
        int iHashCode13 = (iHashCode12 + (tMDBExternalIds == null ? 0 : tMDBExternalIds.hashCode())) * 31;
        TMDBPersonImages tMDBPersonImages = this.f20258p;
        return iHashCode13 + (tMDBPersonImages != null ? tMDBPersonImages.hashCode() : 0);
    }

    public final String toString() {
        return "TMDBPersonDetail(id=" + this.f20245a + ", name=" + this.f20246b + ", biography=" + this.f20247c + ", birthday=" + this.f20248d + ", deathday=" + this.f20249e + ", gender=" + this.f20250f + ", knownForDepartment=" + this.g + ", placeOfBirth=" + this.f20251h + ", profilePath=" + this.f20252i + ", alsoKnownAs=" + this.j + ", popularity=" + this.f20253k + ", imdbId=" + this.f20254l + ", homepage=" + this.f20255m + ", combinedCredits=" + this.f20256n + ", externalIds=" + this.f20257o + ", images=" + this.f20258p + ")";
    }
}
