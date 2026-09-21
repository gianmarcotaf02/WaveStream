package com.kiptv.core.model;

import androidx.media3.container.NalUnitUtil;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import p153r8.AbstractC2686a0;
import p153r8.C2691d;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/TMDBSearchResult;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final class TMDBSearchResult {

    public static final Companion INSTANCE = new Companion();

    public static final KSerializer[] f20291r = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new C2691d(p153r8.K.f26915a, 0)};

    public final int f20292a;

    public final String f20293b;

    public final String f20294c;

    public final String f20295d;

    public final String f20296e;

    public final String f20297f;
    public final String g;

    public final String f20298h;

    public final String f20299i;
    public final String j;

    public final Double f20300k;

    public final Integer f20301l;

    public final Double f20302m;

    public final String f20303n;

    public final Boolean f20304o;

    public final String f20305p;

    public final List f20306q;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/TMDBSearchResult$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/TMDBSearchResult;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final KSerializer serializer() {
            return TMDBSearchResult$$serializer.INSTANCE;
        }
    }

    public TMDBSearchResult(int i3, int i9, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Double d4, Integer num, Double d6, String str10, Boolean bool, String str11, List list) {
        if (1 != (i3 & 1)) {
            AbstractC2686a0.l(i3, 1, TMDBSearchResult$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f20292a = i9;
        if ((i3 & 2) == 0) {
            this.f20293b = null;
        } else {
            this.f20293b = str;
        }
        if ((i3 & 4) == 0) {
            this.f20294c = null;
        } else {
            this.f20294c = str2;
        }
        if ((i3 & 8) == 0) {
            this.f20295d = null;
        } else {
            this.f20295d = str3;
        }
        if ((i3 & 16) == 0) {
            this.f20296e = null;
        } else {
            this.f20296e = str4;
        }
        if ((i3 & 32) == 0) {
            this.f20297f = null;
        } else {
            this.f20297f = str5;
        }
        if ((i3 & 64) == 0) {
            this.g = null;
        } else {
            this.g = str6;
        }
        if ((i3 & 128) == 0) {
            this.f20298h = null;
        } else {
            this.f20298h = str7;
        }
        if ((i3 & 256) == 0) {
            this.f20299i = null;
        } else {
            this.f20299i = str8;
        }
        if ((i3 & 512) == 0) {
            this.j = null;
        } else {
            this.j = str9;
        }
        if ((i3 & 1024) == 0) {
            this.f20300k = null;
        } else {
            this.f20300k = d4;
        }
        if ((i3 & 2048) == 0) {
            this.f20301l = null;
        } else {
            this.f20301l = num;
        }
        if ((i3 & 4096) == 0) {
            this.f20302m = null;
        } else {
            this.f20302m = d6;
        }
        if ((i3 & 8192) == 0) {
            this.f20303n = null;
        } else {
            this.f20303n = str10;
        }
        if ((i3 & 16384) == 0) {
            this.f20304o = null;
        } else {
            this.f20304o = bool;
        }
        if ((32768 & i3) == 0) {
            this.f20305p = null;
        } else {
            this.f20305p = str11;
        }
        if ((i3 & 65536) == 0) {
            this.f20306q = null;
        } else {
            this.f20306q = list;
        }
    }

    public final String a() {
        String str = this.f20293b;
        if (str != null) {
            return str;
        }
        String str2 = this.f20294c;
        return str2 == null ? "Unknown" : str2;
    }

    public final Integer b() {
        String str = this.f20299i;
        if (str == null) {
            str = this.j;
        }
        if (str != null) {
            return O7.x.z0(O7.q.p1(4, str));
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TMDBSearchResult)) {
            return false;
        }
        TMDBSearchResult tMDBSearchResult = (TMDBSearchResult) obj;
        return this.f20292a == tMDBSearchResult.f20292a && kotlin.jvm.internal.m.a(this.f20293b, tMDBSearchResult.f20293b) && kotlin.jvm.internal.m.a(this.f20294c, tMDBSearchResult.f20294c) && kotlin.jvm.internal.m.a(this.f20295d, tMDBSearchResult.f20295d) && kotlin.jvm.internal.m.a(this.f20296e, tMDBSearchResult.f20296e) && kotlin.jvm.internal.m.a(this.f20297f, tMDBSearchResult.f20297f) && kotlin.jvm.internal.m.a(this.g, tMDBSearchResult.g) && kotlin.jvm.internal.m.a(this.f20298h, tMDBSearchResult.f20298h) && kotlin.jvm.internal.m.a(this.f20299i, tMDBSearchResult.f20299i) && kotlin.jvm.internal.m.a(this.j, tMDBSearchResult.j) && kotlin.jvm.internal.m.a(this.f20300k, tMDBSearchResult.f20300k) && kotlin.jvm.internal.m.a(this.f20301l, tMDBSearchResult.f20301l) && kotlin.jvm.internal.m.a(this.f20302m, tMDBSearchResult.f20302m) && kotlin.jvm.internal.m.a(this.f20303n, tMDBSearchResult.f20303n) && kotlin.jvm.internal.m.a(this.f20304o, tMDBSearchResult.f20304o) && kotlin.jvm.internal.m.a(this.f20305p, tMDBSearchResult.f20305p) && kotlin.jvm.internal.m.a(this.f20306q, tMDBSearchResult.f20306q);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f20292a) * 31;
        String str = this.f20293b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f20294c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f20295d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f20296e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f20297f;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.g;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f20298h;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f20299i;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.j;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Double d4 = this.f20300k;
        int iHashCode11 = (iHashCode10 + (d4 == null ? 0 : d4.hashCode())) * 31;
        Integer num = this.f20301l;
        int iHashCode12 = (iHashCode11 + (num == null ? 0 : num.hashCode())) * 31;
        Double d6 = this.f20302m;
        int iHashCode13 = (iHashCode12 + (d6 == null ? 0 : d6.hashCode())) * 31;
        String str10 = this.f20303n;
        int iHashCode14 = (iHashCode13 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Boolean bool = this.f20304o;
        int iHashCode15 = (iHashCode14 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str11 = this.f20305p;
        int iHashCode16 = (iHashCode15 + (str11 == null ? 0 : str11.hashCode())) * 31;
        List list = this.f20306q;
        return iHashCode16 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "TMDBSearchResult(id=" + this.f20292a + ", title=" + this.f20293b + ", name=" + this.f20294c + ", originalTitle=" + this.f20295d + ", originalName=" + this.f20296e + ", overview=" + this.f20297f + ", posterPath=" + this.g + ", backdropPath=" + this.f20298h + ", releaseDate=" + this.f20299i + ", firstAirDate=" + this.j + ", voteAverage=" + this.f20300k + ", voteCount=" + this.f20301l + ", popularity=" + this.f20302m + ", mediaType=" + this.f20303n + ", adult=" + this.f20304o + ", originalLanguage=" + this.f20305p + ", genreIds=" + this.f20306q + ")";
    }

    public TMDBSearchResult(int i3, String str, String str2, String str3, String str4, String str5, String str6, String str7, Double d4, Integer num, String str8) {
        this.f20292a = i3;
        this.f20293b = str;
        this.f20294c = str2;
        this.f20295d = null;
        this.f20296e = null;
        this.f20297f = str3;
        this.g = str4;
        this.f20298h = str5;
        this.f20299i = str6;
        this.j = str7;
        this.f20300k = d4;
        this.f20301l = num;
        this.f20302m = null;
        this.f20303n = str8;
        this.f20304o = null;
        this.f20305p = null;
        this.f20306q = null;
    }
}
