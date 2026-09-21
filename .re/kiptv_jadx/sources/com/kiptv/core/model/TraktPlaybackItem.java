package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/TraktPlaybackItem;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class TraktPlaybackItem {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.kiptv.core.model.TraktPlaybackItem.Companion INSTANCE = new com.kiptv.core.model.TraktPlaybackItem.Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f20475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f20476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f20477c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f20478d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.kiptv.core.model.TraktMovie f20479e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.kiptv.core.model.TraktEpisode f20480f;
    public final com.kiptv.core.model.TraktShow g;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/TraktPlaybackItem$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/TraktPlaybackItem;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final kotlinx.serialization.KSerializer serializer() {
            return com.kiptv.core.model.TraktPlaybackItem$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TraktPlaybackItem(int i3, long j, double d4, java.lang.String str, java.lang.String str2, com.kiptv.core.model.TraktMovie traktMovie, com.kiptv.core.model.TraktEpisode traktEpisode, com.kiptv.core.model.TraktShow traktShow) {
        if (11 != (i3 & 11)) {
            p153r8.AbstractC2686a0.l(i3, 11, com.kiptv.core.model.TraktPlaybackItem$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f20475a = j;
        this.f20476b = d4;
        if ((i3 & 4) == 0) {
            this.f20477c = null;
        } else {
            this.f20477c = str;
        }
        this.f20478d = str2;
        if ((i3 & 16) == 0) {
            this.f20479e = null;
        } else {
            this.f20479e = traktMovie;
        }
        if ((i3 & 32) == 0) {
            this.f20480f = null;
        } else {
            this.f20480f = traktEpisode;
        }
        if ((i3 & 64) == 0) {
            this.g = null;
        } else {
            this.g = traktShow;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.model.TraktPlaybackItem)) {
            return false;
        }
        com.kiptv.core.model.TraktPlaybackItem traktPlaybackItem = (com.kiptv.core.model.TraktPlaybackItem) obj;
        return this.f20475a == traktPlaybackItem.f20475a && java.lang.Double.compare(this.f20476b, traktPlaybackItem.f20476b) == 0 && kotlin.jvm.internal.m.a(this.f20477c, traktPlaybackItem.f20477c) && kotlin.jvm.internal.m.a(this.f20478d, traktPlaybackItem.f20478d) && kotlin.jvm.internal.m.a(this.f20479e, traktPlaybackItem.f20479e) && kotlin.jvm.internal.m.a(this.f20480f, traktPlaybackItem.f20480f) && kotlin.jvm.internal.m.a(this.g, traktPlaybackItem.g);
    }

    public final int hashCode() {
        int iHashCode = (java.lang.Double.hashCode(this.f20476b) + (java.lang.Long.hashCode(this.f20475a) * 31)) * 31;
        java.lang.String str = this.f20477c;
        int iA = B2.a.a((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f20478d);
        com.kiptv.core.model.TraktMovie traktMovie = this.f20479e;
        int iHashCode2 = (iA + (traktMovie == null ? 0 : traktMovie.hashCode())) * 31;
        com.kiptv.core.model.TraktEpisode traktEpisode = this.f20480f;
        int iHashCode3 = (iHashCode2 + (traktEpisode == null ? 0 : traktEpisode.hashCode())) * 31;
        com.kiptv.core.model.TraktShow traktShow = this.g;
        return iHashCode3 + (traktShow != null ? traktShow.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "TraktPlaybackItem(id=" + this.f20475a + ", progress=" + this.f20476b + ", pausedAt=" + this.f20477c + ", type=" + this.f20478d + ", movie=" + this.f20479e + ", episode=" + this.f20480f + ", show=" + this.g + ")";
    }
}
