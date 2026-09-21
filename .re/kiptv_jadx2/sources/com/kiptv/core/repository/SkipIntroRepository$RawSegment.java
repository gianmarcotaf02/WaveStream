package com.kiptv.core.repository;

import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import p119n8.i;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0083\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"com/kiptv/core/repository/SkipIntroRepository$RawSegment", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@i
public final class SkipIntroRepository$RawSegment {

    public static final Companion INSTANCE = new Companion();

    public final Integer f20921a;

    public final Integer f20922b;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/repository/SkipIntroRepository$RawSegment$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/repository/SkipIntroRepository$RawSegment;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final KSerializer serializer() {
            return SkipIntroRepository$RawSegment$$serializer.INSTANCE;
        }
    }

    public SkipIntroRepository$RawSegment(int i3, Integer num, Integer num2) {
        if ((i3 & 1) == 0) {
            this.f20921a = null;
        } else {
            this.f20921a = num;
        }
        if ((i3 & 2) == 0) {
            this.f20922b = null;
        } else {
            this.f20922b = num2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SkipIntroRepository$RawSegment)) {
            return false;
        }
        SkipIntroRepository$RawSegment skipIntroRepository$RawSegment = (SkipIntroRepository$RawSegment) obj;
        return m.a(this.f20921a, skipIntroRepository$RawSegment.f20921a) && m.a(this.f20922b, skipIntroRepository$RawSegment.f20922b);
    }

    public final int hashCode() {
        Integer num = this.f20921a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f20922b;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return "RawSegment(start_ms=" + this.f20921a + ", end_ms=" + this.f20922b + ")";
    }
}
