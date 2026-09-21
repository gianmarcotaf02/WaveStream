package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/TMDBEpisode;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class TMDBEpisode {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.kiptv.core.model.TMDBEpisode.Companion INSTANCE = new com.kiptv.core.model.TMDBEpisode.Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f20160b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f20161c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.Integer f20162d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.Integer f20163e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.String f20164f;
    public final java.lang.Integer g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f20165h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.Double f20166i;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/TMDBEpisode$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/TMDBEpisode;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final kotlinx.serialization.KSerializer serializer() {
            return com.kiptv.core.model.TMDBEpisode$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TMDBEpisode(int i3, int i9, java.lang.String str, java.lang.String str2, java.lang.Integer num, java.lang.Integer num2, java.lang.String str3, java.lang.Integer num3, java.lang.String str4, java.lang.Double d4) {
        if (1 != (i3 & 1)) {
            p153r8.AbstractC2686a0.l(i3, 1, com.kiptv.core.model.TMDBEpisode$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f20159a = i9;
        if ((i3 & 2) == 0) {
            this.f20160b = null;
        } else {
            this.f20160b = str;
        }
        if ((i3 & 4) == 0) {
            this.f20161c = null;
        } else {
            this.f20161c = str2;
        }
        if ((i3 & 8) == 0) {
            this.f20162d = null;
        } else {
            this.f20162d = num;
        }
        if ((i3 & 16) == 0) {
            this.f20163e = null;
        } else {
            this.f20163e = num2;
        }
        if ((i3 & 32) == 0) {
            this.f20164f = null;
        } else {
            this.f20164f = str3;
        }
        if ((i3 & 64) == 0) {
            this.g = null;
        } else {
            this.g = num3;
        }
        if ((i3 & 128) == 0) {
            this.f20165h = null;
        } else {
            this.f20165h = str4;
        }
        if ((i3 & 256) == 0) {
            this.f20166i = null;
        } else {
            this.f20166i = d4;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.model.TMDBEpisode)) {
            return false;
        }
        com.kiptv.core.model.TMDBEpisode tMDBEpisode = (com.kiptv.core.model.TMDBEpisode) obj;
        return this.f20159a == tMDBEpisode.f20159a && kotlin.jvm.internal.m.a(this.f20160b, tMDBEpisode.f20160b) && kotlin.jvm.internal.m.a(this.f20161c, tMDBEpisode.f20161c) && kotlin.jvm.internal.m.a(this.f20162d, tMDBEpisode.f20162d) && kotlin.jvm.internal.m.a(this.f20163e, tMDBEpisode.f20163e) && kotlin.jvm.internal.m.a(this.f20164f, tMDBEpisode.f20164f) && kotlin.jvm.internal.m.a(this.g, tMDBEpisode.g) && kotlin.jvm.internal.m.a(this.f20165h, tMDBEpisode.f20165h) && kotlin.jvm.internal.m.a(this.f20166i, tMDBEpisode.f20166i);
    }

    public final int hashCode() {
        int iHashCode = java.lang.Integer.hashCode(this.f20159a) * 31;
        java.lang.String str = this.f20160b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f20161c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.Integer num = this.f20162d;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        java.lang.Integer num2 = this.f20163e;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        java.lang.String str3 = this.f20164f;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.Integer num3 = this.g;
        int iHashCode7 = (iHashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        java.lang.String str4 = this.f20165h;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        java.lang.Double d4 = this.f20166i;
        return iHashCode8 + (d4 != null ? d4.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "TMDBEpisode(id=" + this.f20159a + ", name=" + this.f20160b + ", overview=" + this.f20161c + ", episodeNumber=" + this.f20162d + ", seasonNumber=" + this.f20163e + ", stillPath=" + this.f20164f + ", runtime=" + this.g + ", airDate=" + this.f20165h + ", voteAverage=" + this.f20166i + ")";
    }
}
