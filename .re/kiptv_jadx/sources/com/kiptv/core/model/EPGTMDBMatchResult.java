package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/EPGTMDBMatchResult;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class EPGTMDBMatchResult {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.kiptv.core.model.EPGTMDBMatchResult.Companion INSTANCE = new com.kiptv.core.model.EPGTMDBMatchResult.Companion();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final kotlinx.serialization.KSerializer[] f19752l = {null, null, null, null, null, null, null, null, null, new p153r8.C2691d(p153r8.K.f26915a, 0), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f19754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f19755c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f19756d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.Integer f19757e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.String f19758f;
    public final java.lang.String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f19759h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.Double f19760i;
    public final java.util.List j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final double f19761k;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/EPGTMDBMatchResult$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/EPGTMDBMatchResult;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final kotlinx.serialization.KSerializer serializer() {
            return com.kiptv.core.model.EPGTMDBMatchResult$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EPGTMDBMatchResult(int i3, int i9, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Integer num, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.Double d4, java.util.List list, double d6) {
        if (1031 != (i3 & androidx.media3.exoplayer.analytics.AnalyticsListener.EVENT_AUDIO_TRACK_INITIALIZED)) {
            p153r8.AbstractC2686a0.l(i3, androidx.media3.exoplayer.analytics.AnalyticsListener.EVENT_AUDIO_TRACK_INITIALIZED, com.kiptv.core.model.EPGTMDBMatchResult$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f19753a = i9;
        this.f19754b = str;
        this.f19755c = str2;
        if ((i3 & 8) == 0) {
            this.f19756d = null;
        } else {
            this.f19756d = str3;
        }
        if ((i3 & 16) == 0) {
            this.f19757e = null;
        } else {
            this.f19757e = num;
        }
        if ((i3 & 32) == 0) {
            this.f19758f = null;
        } else {
            this.f19758f = str4;
        }
        if ((i3 & 64) == 0) {
            this.g = null;
        } else {
            this.g = str5;
        }
        if ((i3 & 128) == 0) {
            this.f19759h = null;
        } else {
            this.f19759h = str6;
        }
        if ((i3 & 256) == 0) {
            this.f19760i = null;
        } else {
            this.f19760i = d4;
        }
        if ((i3 & 512) == 0) {
            this.j = null;
        } else {
            this.j = list;
        }
        this.f19761k = d6;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.model.EPGTMDBMatchResult)) {
            return false;
        }
        com.kiptv.core.model.EPGTMDBMatchResult ePGTMDBMatchResult = (com.kiptv.core.model.EPGTMDBMatchResult) obj;
        return this.f19753a == ePGTMDBMatchResult.f19753a && kotlin.jvm.internal.m.a(this.f19754b, ePGTMDBMatchResult.f19754b) && kotlin.jvm.internal.m.a(this.f19755c, ePGTMDBMatchResult.f19755c) && kotlin.jvm.internal.m.a(this.f19756d, ePGTMDBMatchResult.f19756d) && kotlin.jvm.internal.m.a(this.f19757e, ePGTMDBMatchResult.f19757e) && kotlin.jvm.internal.m.a(this.f19758f, ePGTMDBMatchResult.f19758f) && kotlin.jvm.internal.m.a(this.g, ePGTMDBMatchResult.g) && kotlin.jvm.internal.m.a(this.f19759h, ePGTMDBMatchResult.f19759h) && kotlin.jvm.internal.m.a(this.f19760i, ePGTMDBMatchResult.f19760i) && kotlin.jvm.internal.m.a(this.j, ePGTMDBMatchResult.j) && java.lang.Double.compare(this.f19761k, ePGTMDBMatchResult.f19761k) == 0;
    }

    public final int hashCode() {
        int iA = B2.a.a(B2.a.a(java.lang.Integer.hashCode(this.f19753a) * 31, 31, this.f19754b), 31, this.f19755c);
        java.lang.String str = this.f19756d;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.Integer num = this.f19757e;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        java.lang.String str2 = this.f19758f;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.g;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.String str4 = this.f19759h;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        java.lang.Double d4 = this.f19760i;
        int iHashCode6 = (iHashCode5 + (d4 == null ? 0 : d4.hashCode())) * 31;
        java.util.List list = this.j;
        return java.lang.Double.hashCode(this.f19761k) + ((iHashCode6 + (list != null ? list.hashCode() : 0)) * 31);
    }

    public final java.lang.String toString() {
        return "EPGTMDBMatchResult(tmdbId=" + this.f19753a + ", mediaType=" + this.f19754b + ", title=" + this.f19755c + ", originalTitle=" + this.f19756d + ", year=" + this.f19757e + ", overview=" + this.f19758f + ", posterPath=" + this.g + ", backdropPath=" + this.f19759h + ", voteAverage=" + this.f19760i + ", genreIds=" + this.j + ", confidence=" + this.f19761k + ")";
    }

    public EPGTMDBMatchResult(int i3, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Integer num, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.Double d4, java.util.List list, double d6) {
        this.f19753a = i3;
        this.f19754b = str;
        this.f19755c = str2;
        this.f19756d = str3;
        this.f19757e = num;
        this.f19758f = str4;
        this.g = str5;
        this.f19759h = str6;
        this.f19760i = d4;
        this.j = list;
        this.f19761k = d6;
    }
}
