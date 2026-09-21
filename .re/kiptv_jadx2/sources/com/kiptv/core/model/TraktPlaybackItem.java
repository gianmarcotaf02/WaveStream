package com.kiptv.core.model;

import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import p153r8.AbstractC2686a0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/TraktPlaybackItem;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final class TraktPlaybackItem {

    public static final Companion INSTANCE = new Companion();

    public final long f20475a;

    public final double f20476b;

    public final String f20477c;

    public final String f20478d;

    public final TraktMovie f20479e;

    public final TraktEpisode f20480f;
    public final TraktShow g;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/TraktPlaybackItem$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/TraktPlaybackItem;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final KSerializer serializer() {
            return TraktPlaybackItem$$serializer.INSTANCE;
        }
    }

    public TraktPlaybackItem(int i3, long j, double d4, String str, String str2, TraktMovie traktMovie, TraktEpisode traktEpisode, TraktShow traktShow) {
        if (11 != (i3 & 11)) {
            AbstractC2686a0.l(i3, 11, TraktPlaybackItem$$serializer.INSTANCE.getDescriptor());
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TraktPlaybackItem)) {
            return false;
        }
        TraktPlaybackItem traktPlaybackItem = (TraktPlaybackItem) obj;
        return this.f20475a == traktPlaybackItem.f20475a && Double.compare(this.f20476b, traktPlaybackItem.f20476b) == 0 && kotlin.jvm.internal.m.a(this.f20477c, traktPlaybackItem.f20477c) && kotlin.jvm.internal.m.a(this.f20478d, traktPlaybackItem.f20478d) && kotlin.jvm.internal.m.a(this.f20479e, traktPlaybackItem.f20479e) && kotlin.jvm.internal.m.a(this.f20480f, traktPlaybackItem.f20480f) && kotlin.jvm.internal.m.a(this.g, traktPlaybackItem.g);
    }

    public final int hashCode() {
        int iHashCode = (Double.hashCode(this.f20476b) + (Long.hashCode(this.f20475a) * 31)) * 31;
        String str = this.f20477c;
        int iA = B2.a.a((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f20478d);
        TraktMovie traktMovie = this.f20479e;
        int iHashCode2 = (iA + (traktMovie == null ? 0 : traktMovie.hashCode())) * 31;
        TraktEpisode traktEpisode = this.f20480f;
        int iHashCode3 = (iHashCode2 + (traktEpisode == null ? 0 : traktEpisode.hashCode())) * 31;
        TraktShow traktShow = this.g;
        return iHashCode3 + (traktShow != null ? traktShow.hashCode() : 0);
    }

    public final String toString() {
        return "TraktPlaybackItem(id=" + this.f20475a + ", progress=" + this.f20476b + ", pausedAt=" + this.f20477c + ", type=" + this.f20478d + ", movie=" + this.f20479e + ", episode=" + this.f20480f + ", show=" + this.g + ")";
    }
}
