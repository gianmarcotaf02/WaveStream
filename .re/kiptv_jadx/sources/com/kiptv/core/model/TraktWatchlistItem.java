package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/TraktWatchlistItem;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class TraktWatchlistItem {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.kiptv.core.model.TraktWatchlistItem.Companion INSTANCE = new com.kiptv.core.model.TraktWatchlistItem.Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Integer f20558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.Long f20559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f20560c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f20561d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.kiptv.core.model.TraktMovie f20562e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.kiptv.core.model.TraktShow f20563f;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/TraktWatchlistItem$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/TraktWatchlistItem;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final kotlinx.serialization.KSerializer serializer() {
            return com.kiptv.core.model.TraktWatchlistItem$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TraktWatchlistItem(int i3, java.lang.Integer num, java.lang.Long l2, java.lang.String str, java.lang.String str2, com.kiptv.core.model.TraktMovie traktMovie, com.kiptv.core.model.TraktShow traktShow) {
        if (8 != (i3 & 8)) {
            p153r8.AbstractC2686a0.l(i3, 8, com.kiptv.core.model.TraktWatchlistItem$$serializer.INSTANCE.getDescriptor());
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

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.model.TraktWatchlistItem)) {
            return false;
        }
        com.kiptv.core.model.TraktWatchlistItem traktWatchlistItem = (com.kiptv.core.model.TraktWatchlistItem) obj;
        return kotlin.jvm.internal.m.a(this.f20558a, traktWatchlistItem.f20558a) && kotlin.jvm.internal.m.a(this.f20559b, traktWatchlistItem.f20559b) && kotlin.jvm.internal.m.a(this.f20560c, traktWatchlistItem.f20560c) && kotlin.jvm.internal.m.a(this.f20561d, traktWatchlistItem.f20561d) && kotlin.jvm.internal.m.a(this.f20562e, traktWatchlistItem.f20562e) && kotlin.jvm.internal.m.a(this.f20563f, traktWatchlistItem.f20563f);
    }

    public final int hashCode() {
        java.lang.Integer num = this.f20558a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        java.lang.Long l2 = this.f20559b;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        java.lang.String str = this.f20560c;
        int iA = B2.a.a((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f20561d);
        com.kiptv.core.model.TraktMovie traktMovie = this.f20562e;
        int iHashCode3 = (iA + (traktMovie == null ? 0 : traktMovie.hashCode())) * 31;
        com.kiptv.core.model.TraktShow traktShow = this.f20563f;
        return iHashCode3 + (traktShow != null ? traktShow.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "TraktWatchlistItem(rank=" + this.f20558a + ", id=" + this.f20559b + ", listedAt=" + this.f20560c + ", type=" + this.f20561d + ", movie=" + this.f20562e + ", show=" + this.f20563f + ")";
    }
}
