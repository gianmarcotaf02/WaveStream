package com.kiptv.core.repository;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0083\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"com/kiptv/core/repository/SkipIntroRepository$TheIntroDbResponse", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class SkipIntroRepository$TheIntroDbResponse {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.kiptv.core.repository.SkipIntroRepository$TheIntroDbResponse.Companion INSTANCE = new com.kiptv.core.repository.SkipIntroRepository$TheIntroDbResponse.Companion();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final kotlinx.serialization.KSerializer[] f20923e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.List f20924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.List f20925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.util.List f20926c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.util.List f20927d;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/repository/SkipIntroRepository$TheIntroDbResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/repository/SkipIntroRepository$TheIntroDbResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final kotlinx.serialization.KSerializer serializer() {
            return com.kiptv.core.repository.SkipIntroRepository$TheIntroDbResponse$$serializer.INSTANCE;
        }
    }

    static {
        com.kiptv.core.repository.SkipIntroRepository$RawSegment$$serializer skipIntroRepository$RawSegment$$serializer = com.kiptv.core.repository.SkipIntroRepository$RawSegment$$serializer.INSTANCE;
        f20923e = new kotlinx.serialization.KSerializer[]{new p153r8.C2691d(skipIntroRepository$RawSegment$$serializer, 0), new p153r8.C2691d(skipIntroRepository$RawSegment$$serializer, 0), new p153r8.C2691d(skipIntroRepository$RawSegment$$serializer, 0), new p153r8.C2691d(skipIntroRepository$RawSegment$$serializer, 0)};
    }

    public /* synthetic */ SkipIntroRepository$TheIntroDbResponse(int i3, java.util.List list, java.util.List list2, java.util.List list3, java.util.List list4) {
        if ((i3 & 1) == 0) {
            this.f20924a = null;
        } else {
            this.f20924a = list;
        }
        if ((i3 & 2) == 0) {
            this.f20925b = null;
        } else {
            this.f20925b = list2;
        }
        if ((i3 & 4) == 0) {
            this.f20926c = null;
        } else {
            this.f20926c = list3;
        }
        if ((i3 & 8) == 0) {
            this.f20927d = null;
        } else {
            this.f20927d = list4;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.repository.SkipIntroRepository$TheIntroDbResponse)) {
            return false;
        }
        com.kiptv.core.repository.SkipIntroRepository$TheIntroDbResponse skipIntroRepository$TheIntroDbResponse = (com.kiptv.core.repository.SkipIntroRepository$TheIntroDbResponse) obj;
        return kotlin.jvm.internal.m.a(this.f20924a, skipIntroRepository$TheIntroDbResponse.f20924a) && kotlin.jvm.internal.m.a(this.f20925b, skipIntroRepository$TheIntroDbResponse.f20925b) && kotlin.jvm.internal.m.a(this.f20926c, skipIntroRepository$TheIntroDbResponse.f20926c) && kotlin.jvm.internal.m.a(this.f20927d, skipIntroRepository$TheIntroDbResponse.f20927d);
    }

    public final int hashCode() {
        java.util.List list = this.f20924a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        java.util.List list2 = this.f20925b;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        java.util.List list3 = this.f20926c;
        int iHashCode3 = (iHashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        java.util.List list4 = this.f20927d;
        return iHashCode3 + (list4 != null ? list4.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "TheIntroDbResponse(intro=" + this.f20924a + ", recap=" + this.f20925b + ", credits=" + this.f20926c + ", preview=" + this.f20927d + ")";
    }
}
