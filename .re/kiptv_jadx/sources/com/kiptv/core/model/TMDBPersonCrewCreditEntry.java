package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/TMDBPersonCrewCreditEntry;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class TMDBPersonCrewCreditEntry {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.kiptv.core.model.TMDBPersonCrewCreditEntry.Companion INSTANCE = new com.kiptv.core.model.TMDBPersonCrewCreditEntry.Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f20236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f20237c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f20238d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.String f20239e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.String f20240f;
    public final java.lang.String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f20241h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.String f20242i;
    public final java.lang.Double j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final java.lang.Double f20243k;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/TMDBPersonCrewCreditEntry$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/TMDBPersonCrewCreditEntry;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final kotlinx.serialization.KSerializer serializer() {
            return com.kiptv.core.model.TMDBPersonCrewCreditEntry$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TMDBPersonCrewCreditEntry(int i3, int i9, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.Double d4, java.lang.Double d6) {
        if (1 != (i3 & 1)) {
            p153r8.AbstractC2686a0.l(i3, 1, com.kiptv.core.model.TMDBPersonCrewCreditEntry$$serializer.INSTANCE.getDescriptor());
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

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.model.TMDBPersonCrewCreditEntry)) {
            return false;
        }
        com.kiptv.core.model.TMDBPersonCrewCreditEntry tMDBPersonCrewCreditEntry = (com.kiptv.core.model.TMDBPersonCrewCreditEntry) obj;
        return this.f20235a == tMDBPersonCrewCreditEntry.f20235a && kotlin.jvm.internal.m.a(this.f20236b, tMDBPersonCrewCreditEntry.f20236b) && kotlin.jvm.internal.m.a(this.f20237c, tMDBPersonCrewCreditEntry.f20237c) && kotlin.jvm.internal.m.a(this.f20238d, tMDBPersonCrewCreditEntry.f20238d) && kotlin.jvm.internal.m.a(this.f20239e, tMDBPersonCrewCreditEntry.f20239e) && kotlin.jvm.internal.m.a(this.f20240f, tMDBPersonCrewCreditEntry.f20240f) && kotlin.jvm.internal.m.a(this.g, tMDBPersonCrewCreditEntry.g) && kotlin.jvm.internal.m.a(this.f20241h, tMDBPersonCrewCreditEntry.f20241h) && kotlin.jvm.internal.m.a(this.f20242i, tMDBPersonCrewCreditEntry.f20242i) && kotlin.jvm.internal.m.a(this.j, tMDBPersonCrewCreditEntry.j) && kotlin.jvm.internal.m.a(this.f20243k, tMDBPersonCrewCreditEntry.f20243k);
    }

    public final int hashCode() {
        int iHashCode = java.lang.Integer.hashCode(this.f20235a) * 31;
        java.lang.String str = this.f20236b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f20237c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f20238d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.String str4 = this.f20239e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        java.lang.String str5 = this.f20240f;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        java.lang.String str6 = this.g;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        java.lang.String str7 = this.f20241h;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        java.lang.String str8 = this.f20242i;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        java.lang.Double d4 = this.j;
        int iHashCode10 = (iHashCode9 + (d4 == null ? 0 : d4.hashCode())) * 31;
        java.lang.Double d6 = this.f20243k;
        return iHashCode10 + (d6 != null ? d6.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "TMDBPersonCrewCreditEntry(id=" + this.f20235a + ", title=" + this.f20236b + ", name=" + this.f20237c + ", job=" + this.f20238d + ", department=" + this.f20239e + ", mediaType=" + this.f20240f + ", posterPath=" + this.g + ", releaseDate=" + this.f20241h + ", firstAirDate=" + this.f20242i + ", popularity=" + this.j + ", voteAverage=" + this.f20243k + ")";
    }
}
