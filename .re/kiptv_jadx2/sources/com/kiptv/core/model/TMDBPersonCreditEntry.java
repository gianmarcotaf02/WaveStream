package com.kiptv.core.model;

import androidx.media3.container.NalUnitUtil;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import p153r8.AbstractC2686a0;
import p153r8.C2691d;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/TMDBPersonCreditEntry;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final class TMDBPersonCreditEntry {

    public static final Companion INSTANCE = new Companion();

    public static final KSerializer[] f20221p = {null, null, null, null, null, null, null, null, null, null, null, null, null, new C2691d(p153r8.K.f26915a, 0), null};

    public final int f20222a;

    public final String f20223b;

    public final String f20224c;

    public final String f20225d;

    public final String f20226e;

    public final String f20227f;
    public final String g;

    public final Double f20228h;

    public final String f20229i;
    public final String j;

    public final Double f20230k;

    public final Integer f20231l;

    public final String f20232m;

    public final List f20233n;

    public final Integer f20234o;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/TMDBPersonCreditEntry$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/TMDBPersonCreditEntry;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final KSerializer serializer() {
            return TMDBPersonCreditEntry$$serializer.INSTANCE;
        }
    }

    public TMDBPersonCreditEntry(int i3, int i9, String str, String str2, String str3, String str4, String str5, String str6, Double d4, String str7, String str8, Double d6, Integer num, String str9, List list, Integer num2) {
        if (1 != (i3 & 1)) {
            AbstractC2686a0.l(i3, 1, TMDBPersonCreditEntry$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f20222a = i9;
        if ((i3 & 2) == 0) {
            this.f20223b = null;
        } else {
            this.f20223b = str;
        }
        if ((i3 & 4) == 0) {
            this.f20224c = null;
        } else {
            this.f20224c = str2;
        }
        if ((i3 & 8) == 0) {
            this.f20225d = null;
        } else {
            this.f20225d = str3;
        }
        if ((i3 & 16) == 0) {
            this.f20226e = null;
        } else {
            this.f20226e = str4;
        }
        if ((i3 & 32) == 0) {
            this.f20227f = null;
        } else {
            this.f20227f = str5;
        }
        if ((i3 & 64) == 0) {
            this.g = null;
        } else {
            this.g = str6;
        }
        if ((i3 & 128) == 0) {
            this.f20228h = null;
        } else {
            this.f20228h = d4;
        }
        if ((i3 & 256) == 0) {
            this.f20229i = null;
        } else {
            this.f20229i = str7;
        }
        if ((i3 & 512) == 0) {
            this.j = null;
        } else {
            this.j = str8;
        }
        if ((i3 & 1024) == 0) {
            this.f20230k = null;
        } else {
            this.f20230k = d6;
        }
        if ((i3 & 2048) == 0) {
            this.f20231l = null;
        } else {
            this.f20231l = num;
        }
        if ((i3 & 4096) == 0) {
            this.f20232m = null;
        } else {
            this.f20232m = str9;
        }
        if ((i3 & 8192) == 0) {
            this.f20233n = null;
        } else {
            this.f20233n = list;
        }
        if ((i3 & 16384) == 0) {
            this.f20234o = null;
        } else {
            this.f20234o = num2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TMDBPersonCreditEntry)) {
            return false;
        }
        TMDBPersonCreditEntry tMDBPersonCreditEntry = (TMDBPersonCreditEntry) obj;
        return this.f20222a == tMDBPersonCreditEntry.f20222a && kotlin.jvm.internal.m.a(this.f20223b, tMDBPersonCreditEntry.f20223b) && kotlin.jvm.internal.m.a(this.f20224c, tMDBPersonCreditEntry.f20224c) && kotlin.jvm.internal.m.a(this.f20225d, tMDBPersonCreditEntry.f20225d) && kotlin.jvm.internal.m.a(this.f20226e, tMDBPersonCreditEntry.f20226e) && kotlin.jvm.internal.m.a(this.f20227f, tMDBPersonCreditEntry.f20227f) && kotlin.jvm.internal.m.a(this.g, tMDBPersonCreditEntry.g) && kotlin.jvm.internal.m.a(this.f20228h, tMDBPersonCreditEntry.f20228h) && kotlin.jvm.internal.m.a(this.f20229i, tMDBPersonCreditEntry.f20229i) && kotlin.jvm.internal.m.a(this.j, tMDBPersonCreditEntry.j) && kotlin.jvm.internal.m.a(this.f20230k, tMDBPersonCreditEntry.f20230k) && kotlin.jvm.internal.m.a(this.f20231l, tMDBPersonCreditEntry.f20231l) && kotlin.jvm.internal.m.a(this.f20232m, tMDBPersonCreditEntry.f20232m) && kotlin.jvm.internal.m.a(this.f20233n, tMDBPersonCreditEntry.f20233n) && kotlin.jvm.internal.m.a(this.f20234o, tMDBPersonCreditEntry.f20234o);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f20222a) * 31;
        String str = this.f20223b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f20224c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f20225d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f20226e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f20227f;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.g;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Double d4 = this.f20228h;
        int iHashCode8 = (iHashCode7 + (d4 == null ? 0 : d4.hashCode())) * 31;
        String str7 = this.f20229i;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.j;
        int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Double d6 = this.f20230k;
        int iHashCode11 = (iHashCode10 + (d6 == null ? 0 : d6.hashCode())) * 31;
        Integer num = this.f20231l;
        int iHashCode12 = (iHashCode11 + (num == null ? 0 : num.hashCode())) * 31;
        String str9 = this.f20232m;
        int iHashCode13 = (iHashCode12 + (str9 == null ? 0 : str9.hashCode())) * 31;
        List list = this.f20233n;
        int iHashCode14 = (iHashCode13 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num2 = this.f20234o;
        return iHashCode14 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return "TMDBPersonCreditEntry(id=" + this.f20222a + ", title=" + this.f20223b + ", name=" + this.f20224c + ", character=" + this.f20225d + ", mediaType=" + this.f20226e + ", posterPath=" + this.f20227f + ", backdropPath=" + this.g + ", voteAverage=" + this.f20228h + ", releaseDate=" + this.f20229i + ", firstAirDate=" + this.j + ", popularity=" + this.f20230k + ", episodeCount=" + this.f20231l + ", overview=" + this.f20232m + ", genreIds=" + this.f20233n + ", voteCount=" + this.f20234o + ")";
    }
}
