package com.kiptv.core.model;

import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/XtreamSeason;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final class XtreamSeason {

    public static final Companion INSTANCE = new Companion();

    public final String f20679a;

    public final Integer f20680b;

    public final Integer f20681c;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/XtreamSeason$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/XtreamSeason;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final KSerializer serializer() {
            return XtreamSeason$$serializer.INSTANCE;
        }
    }

    public XtreamSeason(int i3, Integer num, Integer num2, String str) {
        if ((i3 & 1) == 0) {
            this.f20679a = null;
        } else {
            this.f20679a = str;
        }
        if ((i3 & 2) == 0) {
            this.f20680b = null;
        } else {
            this.f20680b = num;
        }
        if ((i3 & 4) == 0) {
            this.f20681c = null;
        } else {
            this.f20681c = num2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof XtreamSeason)) {
            return false;
        }
        XtreamSeason xtreamSeason = (XtreamSeason) obj;
        return kotlin.jvm.internal.m.a(this.f20679a, xtreamSeason.f20679a) && kotlin.jvm.internal.m.a(this.f20680b, xtreamSeason.f20680b) && kotlin.jvm.internal.m.a(this.f20681c, xtreamSeason.f20681c);
    }

    public final int hashCode() {
        String str = this.f20679a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f20680b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f20681c;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return "XtreamSeason(name=" + this.f20679a + ", seasonNumber=" + this.f20680b + ", episodeCount=" + this.f20681c + ")";
    }

    public XtreamSeason(String str, Integer num, Integer num2) {
        this.f20679a = str;
        this.f20680b = num;
        this.f20681c = num2;
    }
}
