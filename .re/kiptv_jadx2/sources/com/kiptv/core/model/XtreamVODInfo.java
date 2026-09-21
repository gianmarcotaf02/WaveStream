package com.kiptv.core.model;

import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/XtreamVODInfo;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final class XtreamVODInfo {

    public static final Companion INSTANCE = new Companion();

    public final XtreamMovieInfo f20720a;

    public final XtreamMovieData f20721b;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/XtreamVODInfo$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/XtreamVODInfo;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final KSerializer serializer() {
            return XtreamVODInfo$$serializer.INSTANCE;
        }
    }

    public XtreamVODInfo(int i3, XtreamMovieInfo xtreamMovieInfo, XtreamMovieData xtreamMovieData) {
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof XtreamVODInfo)) {
            return false;
        }
        XtreamVODInfo xtreamVODInfo = (XtreamVODInfo) obj;
        return kotlin.jvm.internal.m.a(this.f20720a, xtreamVODInfo.f20720a) && kotlin.jvm.internal.m.a(this.f20721b, xtreamVODInfo.f20721b);
    }

    public final int hashCode() {
        XtreamMovieInfo xtreamMovieInfo = this.f20720a;
        int iHashCode = (xtreamMovieInfo == null ? 0 : xtreamMovieInfo.hashCode()) * 31;
        XtreamMovieData xtreamMovieData = this.f20721b;
        return iHashCode + (xtreamMovieData != null ? xtreamMovieData.hashCode() : 0);
    }

    public final String toString() {
        return "XtreamVODInfo(info=" + this.f20720a + ", movieData=" + this.f20721b + ")";
    }
}
