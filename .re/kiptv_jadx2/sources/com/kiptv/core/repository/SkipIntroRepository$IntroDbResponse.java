package com.kiptv.core.repository;

import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import p119n8.i;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0083\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"com/kiptv/core/repository/SkipIntroRepository$IntroDbResponse", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@i
public final class SkipIntroRepository$IntroDbResponse {

    public static final Companion INSTANCE = new Companion();

    public final SkipIntroRepository$RawSegment f20918a;

    public final SkipIntroRepository$RawSegment f20919b;

    public final SkipIntroRepository$RawSegment f20920c;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/repository/SkipIntroRepository$IntroDbResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/repository/SkipIntroRepository$IntroDbResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final KSerializer serializer() {
            return SkipIntroRepository$IntroDbResponse$$serializer.INSTANCE;
        }
    }

    public SkipIntroRepository$IntroDbResponse(int i3, SkipIntroRepository$RawSegment skipIntroRepository$RawSegment, SkipIntroRepository$RawSegment skipIntroRepository$RawSegment2, SkipIntroRepository$RawSegment skipIntroRepository$RawSegment3) {
        if ((i3 & 1) == 0) {
            this.f20918a = null;
        } else {
            this.f20918a = skipIntroRepository$RawSegment;
        }
        if ((i3 & 2) == 0) {
            this.f20919b = null;
        } else {
            this.f20919b = skipIntroRepository$RawSegment2;
        }
        if ((i3 & 4) == 0) {
            this.f20920c = null;
        } else {
            this.f20920c = skipIntroRepository$RawSegment3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SkipIntroRepository$IntroDbResponse)) {
            return false;
        }
        SkipIntroRepository$IntroDbResponse skipIntroRepository$IntroDbResponse = (SkipIntroRepository$IntroDbResponse) obj;
        return m.a(this.f20918a, skipIntroRepository$IntroDbResponse.f20918a) && m.a(this.f20919b, skipIntroRepository$IntroDbResponse.f20919b) && m.a(this.f20920c, skipIntroRepository$IntroDbResponse.f20920c);
    }

    public final int hashCode() {
        SkipIntroRepository$RawSegment skipIntroRepository$RawSegment = this.f20918a;
        int iHashCode = (skipIntroRepository$RawSegment == null ? 0 : skipIntroRepository$RawSegment.hashCode()) * 31;
        SkipIntroRepository$RawSegment skipIntroRepository$RawSegment2 = this.f20919b;
        int iHashCode2 = (iHashCode + (skipIntroRepository$RawSegment2 == null ? 0 : skipIntroRepository$RawSegment2.hashCode())) * 31;
        SkipIntroRepository$RawSegment skipIntroRepository$RawSegment3 = this.f20920c;
        return iHashCode2 + (skipIntroRepository$RawSegment3 != null ? skipIntroRepository$RawSegment3.hashCode() : 0);
    }

    public final String toString() {
        return "IntroDbResponse(intro=" + this.f20918a + ", recap=" + this.f20919b + ", outro=" + this.f20920c + ")";
    }
}
