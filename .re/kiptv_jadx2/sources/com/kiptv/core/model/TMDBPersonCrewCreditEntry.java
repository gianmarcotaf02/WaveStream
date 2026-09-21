package com.kiptv.core.model;

import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import p153r8.AbstractC2686a0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/TMDBPersonCrewCreditEntry;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final class TMDBPersonCrewCreditEntry {

    public static final Companion INSTANCE = new Companion();

    public final int f20235a;

    public final String f20236b;

    public final String f20237c;

    public final String f20238d;

    public final String f20239e;

    public final String f20240f;
    public final String g;

    public final String f20241h;

    public final String f20242i;
    public final Double j;

    public final Double f20243k;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/TMDBPersonCrewCreditEntry$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/TMDBPersonCrewCreditEntry;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final KSerializer serializer() {
            return TMDBPersonCrewCreditEntry$$serializer.INSTANCE;
        }
    }

    public TMDBPersonCrewCreditEntry(int i3, int i9, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Double d4, Double d6) {
        if (1 != (i3 & 1)) {
            AbstractC2686a0.l(i3, 1, TMDBPersonCrewCreditEntry$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f20235a = i9;
        if ((i3 & 2) == 0) {
            this.f20236b = null;
        } else {
            this.f20236b = str;
        }
        if ((i3 & 4) == 0) {
            this.f20237c = null;
        } else {
            this.f20237c = str2;
        }
        if ((i3 & 8) == 0) {
            this.f20238d = null;
        } else {
            this.f20238d = str3;
        }
        if ((i3 & 16) == 0) {
            this.f20239e = null;
        } else {
            this.f20239e = str4;
        }
        if ((i3 & 32) == 0) {
            this.f20240f = null;
        } else {
            this.f20240f = str5;
        }
        if ((i3 & 64) == 0) {
            this.g = null;
        } else {
            this.g = str6;
        }
        if ((i3 & 128) == 0) {
            this.f20241h = null;
        } else {
            this.f20241h = str7;
        }
        if ((i3 & 256) == 0) {
            this.f20242i = null;
        } else {
            this.f20242i = str8;
        }
        if ((i3 & 512) == 0) {
            this.j = null;
        } else {
            this.j = d4;
        }
        if ((i3 & 1024) == 0) {
            this.f20243k = null;
        } else {
            this.f20243k = d6;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TMDBPersonCrewCreditEntry)) {
            return false;
        }
        TMDBPersonCrewCreditEntry tMDBPersonCrewCreditEntry = (TMDBPersonCrewCreditEntry) obj;
        return this.f20235a == tMDBPersonCrewCreditEntry.f20235a && kotlin.jvm.internal.m.a(this.f20236b, tMDBPersonCrewCreditEntry.f20236b) && kotlin.jvm.internal.m.a(this.f20237c, tMDBPersonCrewCreditEntry.f20237c) && kotlin.jvm.internal.m.a(this.f20238d, tMDBPersonCrewCreditEntry.f20238d) && kotlin.jvm.internal.m.a(this.f20239e, tMDBPersonCrewCreditEntry.f20239e) && kotlin.jvm.internal.m.a(this.f20240f, tMDBPersonCrewCreditEntry.f20240f) && kotlin.jvm.internal.m.a(this.g, tMDBPersonCrewCreditEntry.g) && kotlin.jvm.internal.m.a(this.f20241h, tMDBPersonCrewCreditEntry.f20241h) && kotlin.jvm.internal.m.a(this.f20242i, tMDBPersonCrewCreditEntry.f20242i) && kotlin.jvm.internal.m.a(this.j, tMDBPersonCrewCreditEntry.j) && kotlin.jvm.internal.m.a(this.f20243k, tMDBPersonCrewCreditEntry.f20243k);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f20235a) * 31;
        String str = this.f20236b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f20237c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f20238d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f20239e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f20240f;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.g;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f20241h;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f20242i;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Double d4 = this.j;
        int iHashCode10 = (iHashCode9 + (d4 == null ? 0 : d4.hashCode())) * 31;
        Double d6 = this.f20243k;
        return iHashCode10 + (d6 != null ? d6.hashCode() : 0);
    }

    public final String toString() {
        return "TMDBPersonCrewCreditEntry(id=" + this.f20235a + ", title=" + this.f20236b + ", name=" + this.f20237c + ", job=" + this.f20238d + ", department=" + this.f20239e + ", mediaType=" + this.f20240f + ", posterPath=" + this.g + ", releaseDate=" + this.f20241h + ", firstAirDate=" + this.f20242i + ", popularity=" + this.j + ", voteAverage=" + this.f20243k + ")";
    }
}
