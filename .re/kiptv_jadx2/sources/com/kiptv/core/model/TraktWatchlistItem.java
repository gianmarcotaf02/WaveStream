package com.kiptv.core.model;

import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import p153r8.AbstractC2686a0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/TraktWatchlistItem;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final class TraktWatchlistItem {

    public static final Companion INSTANCE = new Companion();

    public final Integer f20558a;

    public final Long f20559b;

    public final String f20560c;

    public final String f20561d;

    public final TraktMovie f20562e;

    public final TraktShow f20563f;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/TraktWatchlistItem$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/TraktWatchlistItem;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final KSerializer serializer() {
            return TraktWatchlistItem$$serializer.INSTANCE;
        }
    }

    public TraktWatchlistItem(int i3, Integer num, Long l2, String str, String str2, TraktMovie traktMovie, TraktShow traktShow) {
        if (8 != (i3 & 8)) {
            AbstractC2686a0.l(i3, 8, TraktWatchlistItem$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i3 & 1) == 0) {
            this.f20558a = null;
        } else {
            this.f20558a = num;
        }
        if ((i3 & 2) == 0) {
            this.f20559b = null;
        } else {
            this.f20559b = l2;
        }
        if ((i3 & 4) == 0) {
            this.f20560c = null;
        } else {
            this.f20560c = str;
        }
        this.f20561d = str2;
        if ((i3 & 16) == 0) {
            this.f20562e = null;
        } else {
            this.f20562e = traktMovie;
        }
        if ((i3 & 32) == 0) {
            this.f20563f = null;
        } else {
            this.f20563f = traktShow;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TraktWatchlistItem)) {
            return false;
        }
        TraktWatchlistItem traktWatchlistItem = (TraktWatchlistItem) obj;
        return kotlin.jvm.internal.m.a(this.f20558a, traktWatchlistItem.f20558a) && kotlin.jvm.internal.m.a(this.f20559b, traktWatchlistItem.f20559b) && kotlin.jvm.internal.m.a(this.f20560c, traktWatchlistItem.f20560c) && kotlin.jvm.internal.m.a(this.f20561d, traktWatchlistItem.f20561d) && kotlin.jvm.internal.m.a(this.f20562e, traktWatchlistItem.f20562e) && kotlin.jvm.internal.m.a(this.f20563f, traktWatchlistItem.f20563f);
    }

    public final int hashCode() {
        Integer num = this.f20558a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Long l2 = this.f20559b;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.f20560c;
        int iA = B2.a.a((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f20561d);
        TraktMovie traktMovie = this.f20562e;
        int iHashCode3 = (iA + (traktMovie == null ? 0 : traktMovie.hashCode())) * 31;
        TraktShow traktShow = this.f20563f;
        return iHashCode3 + (traktShow != null ? traktShow.hashCode() : 0);
    }

    public final String toString() {
        return "TraktWatchlistItem(rank=" + this.f20558a + ", id=" + this.f20559b + ", listedAt=" + this.f20560c + ", type=" + this.f20561d + ", movie=" + this.f20562e + ", show=" + this.f20563f + ")";
    }
}
