package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/XtreamVODInfo;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class XtreamVODInfo {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.kiptv.core.model.XtreamVODInfo.Companion INSTANCE = new com.kiptv.core.model.XtreamVODInfo.Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.kiptv.core.model.XtreamMovieInfo f20720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.kiptv.core.model.XtreamMovieData f20721b;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/XtreamVODInfo$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/XtreamVODInfo;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final kotlinx.serialization.KSerializer serializer() {
            return com.kiptv.core.model.XtreamVODInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ XtreamVODInfo(int i3, com.kiptv.core.model.XtreamMovieInfo xtreamMovieInfo, com.kiptv.core.model.XtreamMovieData xtreamMovieData) {
        if ((i3 & 1) == 0) {
            this.f20720a = null;
        } else {
            this.f20720a = xtreamMovieInfo;
        }
        if ((i3 & 2) == 0) {
            this.f20721b = null;
        } else {
            this.f20721b = xtreamMovieData;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.model.XtreamVODInfo)) {
            return false;
        }
        com.kiptv.core.model.XtreamVODInfo xtreamVODInfo = (com.kiptv.core.model.XtreamVODInfo) obj;
        return kotlin.jvm.internal.m.a(this.f20720a, xtreamVODInfo.f20720a) && kotlin.jvm.internal.m.a(this.f20721b, xtreamVODInfo.f20721b);
    }

    public final int hashCode() {
        com.kiptv.core.model.XtreamMovieInfo xtreamMovieInfo = this.f20720a;
        int iHashCode = (xtreamMovieInfo == null ? 0 : xtreamMovieInfo.hashCode()) * 31;
        com.kiptv.core.model.XtreamMovieData xtreamMovieData = this.f20721b;
        return iHashCode + (xtreamMovieData != null ? xtreamMovieData.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "XtreamVODInfo(info=" + this.f20720a + ", movieData=" + this.f20721b + ")";
    }
}
