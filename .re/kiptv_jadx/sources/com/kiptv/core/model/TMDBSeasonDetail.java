package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/TMDBSeasonDetail;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class TMDBSeasonDetail {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.kiptv.core.model.TMDBSeasonDetail.Companion INSTANCE = new com.kiptv.core.model.TMDBSeasonDetail.Companion();
    public static final kotlinx.serialization.KSerializer[] g = {null, null, null, null, null, new p153r8.C2691d(com.kiptv.core.model.TMDBEpisode$$serializer.INSTANCE, 0)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Integer f20307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f20308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f20309c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f20310d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.Integer f20311e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.util.List f20312f;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/TMDBSeasonDetail$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/TMDBSeasonDetail;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final kotlinx.serialization.KSerializer serializer() {
            return com.kiptv.core.model.TMDBSeasonDetail$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TMDBSeasonDetail(int i3, java.lang.Integer num, java.lang.Integer num2, java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List list) {
        if ((i3 & 1) == 0) {
            this.f20307a = null;
        } else {
            this.f20307a = num;
        }
        if ((i3 & 2) == 0) {
            this.f20308b = null;
        } else {
            this.f20308b = str;
        }
        if ((i3 & 4) == 0) {
            this.f20309c = null;
        } else {
            this.f20309c = str2;
        }
        if ((i3 & 8) == 0) {
            this.f20310d = null;
        } else {
            this.f20310d = str3;
        }
        if ((i3 & 16) == 0) {
            this.f20311e = null;
        } else {
            this.f20311e = num2;
        }
        if ((i3 & 32) == 0) {
            this.f20312f = null;
        } else {
            this.f20312f = list;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.model.TMDBSeasonDetail)) {
            return false;
        }
        com.kiptv.core.model.TMDBSeasonDetail tMDBSeasonDetail = (com.kiptv.core.model.TMDBSeasonDetail) obj;
        return kotlin.jvm.internal.m.a(this.f20307a, tMDBSeasonDetail.f20307a) && kotlin.jvm.internal.m.a(this.f20308b, tMDBSeasonDetail.f20308b) && kotlin.jvm.internal.m.a(this.f20309c, tMDBSeasonDetail.f20309c) && kotlin.jvm.internal.m.a(this.f20310d, tMDBSeasonDetail.f20310d) && kotlin.jvm.internal.m.a(this.f20311e, tMDBSeasonDetail.f20311e) && kotlin.jvm.internal.m.a(this.f20312f, tMDBSeasonDetail.f20312f);
    }

    public final int hashCode() {
        java.lang.Integer num = this.f20307a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        java.lang.String str = this.f20308b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f20309c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f20310d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.Integer num2 = this.f20311e;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        java.util.List list = this.f20312f;
        return iHashCode5 + (list != null ? list.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "TMDBSeasonDetail(id=" + this.f20307a + ", name=" + this.f20308b + ", overview=" + this.f20309c + ", posterPath=" + this.f20310d + ", seasonNumber=" + this.f20311e + ", episodes=" + this.f20312f + ")";
    }
}
