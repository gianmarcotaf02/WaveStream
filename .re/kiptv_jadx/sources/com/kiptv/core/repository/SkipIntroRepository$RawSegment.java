package com.kiptv.core.repository;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0083\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"com/kiptv/core/repository/SkipIntroRepository$RawSegment", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class SkipIntroRepository$RawSegment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.kiptv.core.repository.SkipIntroRepository$RawSegment.Companion INSTANCE = new com.kiptv.core.repository.SkipIntroRepository$RawSegment.Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Integer f20921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.Integer f20922b;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/repository/SkipIntroRepository$RawSegment$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/repository/SkipIntroRepository$RawSegment;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final kotlinx.serialization.KSerializer serializer() {
            return com.kiptv.core.repository.SkipIntroRepository$RawSegment$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SkipIntroRepository$RawSegment(int i3, java.lang.Integer num, java.lang.Integer num2) {
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

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.repository.SkipIntroRepository$RawSegment)) {
            return false;
        }
        com.kiptv.core.repository.SkipIntroRepository$RawSegment skipIntroRepository$RawSegment = (com.kiptv.core.repository.SkipIntroRepository$RawSegment) obj;
        return kotlin.jvm.internal.m.a(this.f20921a, skipIntroRepository$RawSegment.f20921a) && kotlin.jvm.internal.m.a(this.f20922b, skipIntroRepository$RawSegment.f20922b);
    }

    public final int hashCode() {
        java.lang.Integer num = this.f20921a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        java.lang.Integer num2 = this.f20922b;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "RawSegment(start_ms=" + this.f20921a + ", end_ms=" + this.f20922b + ")";
    }
}
