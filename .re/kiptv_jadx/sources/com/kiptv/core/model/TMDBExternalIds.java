package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/TMDBExternalIds;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class TMDBExternalIds {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.kiptv.core.model.TMDBExternalIds.Companion INSTANCE = new com.kiptv.core.model.TMDBExternalIds.Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Integer f20170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f20171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.Integer f20172c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.Integer f20173d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.String f20174e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.String f20175f;
    public final java.lang.String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f20176h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.String f20177i;
    public final java.lang.String j;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/TMDBExternalIds$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/TMDBExternalIds;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final kotlinx.serialization.KSerializer serializer() {
            return com.kiptv.core.model.TMDBExternalIds$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TMDBExternalIds(int i3, java.lang.Integer num, java.lang.String str, java.lang.Integer num2, java.lang.Integer num3, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7) {
        if ((i3 & 1) == 0) {
            this.f20170a = null;
        } else {
            this.f20170a = num;
        }
        if ((i3 & 2) == 0) {
            this.f20171b = null;
        } else {
            this.f20171b = str;
        }
        if ((i3 & 4) == 0) {
            this.f20172c = null;
        } else {
            this.f20172c = num2;
        }
        if ((i3 & 8) == 0) {
            this.f20173d = null;
        } else {
            this.f20173d = num3;
        }
        if ((i3 & 16) == 0) {
            this.f20174e = null;
        } else {
            this.f20174e = str2;
        }
        if ((i3 & 32) == 0) {
            this.f20175f = null;
        } else {
            this.f20175f = str3;
        }
        if ((i3 & 64) == 0) {
            this.g = null;
        } else {
            this.g = str4;
        }
        if ((i3 & 128) == 0) {
            this.f20176h = null;
        } else {
            this.f20176h = str5;
        }
        if ((i3 & 256) == 0) {
            this.f20177i = null;
        } else {
            this.f20177i = str6;
        }
        if ((i3 & 512) == 0) {
            this.j = null;
        } else {
            this.j = str7;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.model.TMDBExternalIds)) {
            return false;
        }
        com.kiptv.core.model.TMDBExternalIds tMDBExternalIds = (com.kiptv.core.model.TMDBExternalIds) obj;
        return kotlin.jvm.internal.m.a(this.f20170a, tMDBExternalIds.f20170a) && kotlin.jvm.internal.m.a(this.f20171b, tMDBExternalIds.f20171b) && kotlin.jvm.internal.m.a(this.f20172c, tMDBExternalIds.f20172c) && kotlin.jvm.internal.m.a(this.f20173d, tMDBExternalIds.f20173d) && kotlin.jvm.internal.m.a(this.f20174e, tMDBExternalIds.f20174e) && kotlin.jvm.internal.m.a(this.f20175f, tMDBExternalIds.f20175f) && kotlin.jvm.internal.m.a(this.g, tMDBExternalIds.g) && kotlin.jvm.internal.m.a(this.f20176h, tMDBExternalIds.f20176h) && kotlin.jvm.internal.m.a(this.f20177i, tMDBExternalIds.f20177i) && kotlin.jvm.internal.m.a(this.j, tMDBExternalIds.j);
    }

    public final int hashCode() {
        java.lang.Integer num = this.f20170a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        java.lang.String str = this.f20171b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.Integer num2 = this.f20172c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        java.lang.Integer num3 = this.f20173d;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        java.lang.String str2 = this.f20174e;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f20175f;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.String str4 = this.g;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        java.lang.String str5 = this.f20176h;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        java.lang.String str6 = this.f20177i;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        java.lang.String str7 = this.j;
        return iHashCode9 + (str7 != null ? str7.hashCode() : 0);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TMDBExternalIds(id=");
        sb.append(this.f20170a);
        sb.append(", imdbId=");
        sb.append(this.f20171b);
        sb.append(", tvdbId=");
        sb.append(this.f20172c);
        sb.append(", tvrageId=");
        sb.append(this.f20173d);
        sb.append(", freebaseMid=");
        sb.append(this.f20174e);
        sb.append(", freebaseId=");
        sb.append(this.f20175f);
        sb.append(", facebookId=");
        sb.append(this.g);
        sb.append(", instagramId=");
        sb.append(this.f20176h);
        sb.append(", twitterId=");
        sb.append(this.f20177i);
        sb.append(", wikidataId=");
        return Y6.f.m(sb, this.j, ")");
    }
}
