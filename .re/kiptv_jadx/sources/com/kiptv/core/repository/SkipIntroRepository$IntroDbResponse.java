package com.kiptv.core.repository;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0083\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"com/kiptv/core/repository/SkipIntroRepository$IntroDbResponse", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class SkipIntroRepository$IntroDbResponse {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.kiptv.core.repository.SkipIntroRepository$IntroDbResponse.Companion INSTANCE = new com.kiptv.core.repository.SkipIntroRepository$IntroDbResponse.Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.kiptv.core.repository.SkipIntroRepository$RawSegment f20918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.kiptv.core.repository.SkipIntroRepository$RawSegment f20919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.kiptv.core.repository.SkipIntroRepository$RawSegment f20920c;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/repository/SkipIntroRepository$IntroDbResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/repository/SkipIntroRepository$IntroDbResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final kotlinx.serialization.KSerializer serializer() {
            return com.kiptv.core.repository.SkipIntroRepository$IntroDbResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SkipIntroRepository$IntroDbResponse(int i3, com.kiptv.core.repository.SkipIntroRepository$RawSegment skipIntroRepository$RawSegment, com.kiptv.core.repository.SkipIntroRepository$RawSegment skipIntroRepository$RawSegment2, com.kiptv.core.repository.SkipIntroRepository$RawSegment skipIntroRepository$RawSegment3) {
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

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.repository.SkipIntroRepository$IntroDbResponse)) {
            return false;
        }
        com.kiptv.core.repository.SkipIntroRepository$IntroDbResponse skipIntroRepository$IntroDbResponse = (com.kiptv.core.repository.SkipIntroRepository$IntroDbResponse) obj;
        return kotlin.jvm.internal.m.a(this.f20918a, skipIntroRepository$IntroDbResponse.f20918a) && kotlin.jvm.internal.m.a(this.f20919b, skipIntroRepository$IntroDbResponse.f20919b) && kotlin.jvm.internal.m.a(this.f20920c, skipIntroRepository$IntroDbResponse.f20920c);
    }

    public final int hashCode() {
        com.kiptv.core.repository.SkipIntroRepository$RawSegment skipIntroRepository$RawSegment = this.f20918a;
        int iHashCode = (skipIntroRepository$RawSegment == null ? 0 : skipIntroRepository$RawSegment.hashCode()) * 31;
        com.kiptv.core.repository.SkipIntroRepository$RawSegment skipIntroRepository$RawSegment2 = this.f20919b;
        int iHashCode2 = (iHashCode + (skipIntroRepository$RawSegment2 == null ? 0 : skipIntroRepository$RawSegment2.hashCode())) * 31;
        com.kiptv.core.repository.SkipIntroRepository$RawSegment skipIntroRepository$RawSegment3 = this.f20920c;
        return iHashCode2 + (skipIntroRepository$RawSegment3 != null ? skipIntroRepository$RawSegment3.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "IntroDbResponse(intro=" + this.f20918a + ", recap=" + this.f20919b + ", outro=" + this.f20920c + ")";
    }
}
