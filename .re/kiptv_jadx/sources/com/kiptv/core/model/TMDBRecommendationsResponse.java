package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/TMDBRecommendationsResponse;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class TMDBRecommendationsResponse {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.kiptv.core.model.TMDBRecommendationsResponse.Companion INSTANCE = new com.kiptv.core.model.TMDBRecommendationsResponse.Companion();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final kotlinx.serialization.KSerializer[] f20272e = {null, new p153r8.C2691d(com.kiptv.core.model.TMDBSearchResult$$serializer.INSTANCE, 0), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Integer f20273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.List f20274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.Integer f20275c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.Integer f20276d;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/TMDBRecommendationsResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/TMDBRecommendationsResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final kotlinx.serialization.KSerializer serializer() {
            return com.kiptv.core.model.TMDBRecommendationsResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TMDBRecommendationsResponse(int i3, java.lang.Integer num, java.util.List list, java.lang.Integer num2, java.lang.Integer num3) {
        if (2 != (i3 & 2)) {
            p153r8.AbstractC2686a0.l(i3, 2, com.kiptv.core.model.TMDBRecommendationsResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i3 & 1) == 0) {
            this.f20273a = null;
        } else {
            this.f20273a = num;
        }
        this.f20274b = list;
        if ((i3 & 4) == 0) {
            this.f20275c = null;
        } else {
            this.f20275c = num2;
        }
        if ((i3 & 8) == 0) {
            this.f20276d = null;
        } else {
            this.f20276d = num3;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.model.TMDBRecommendationsResponse)) {
            return false;
        }
        com.kiptv.core.model.TMDBRecommendationsResponse tMDBRecommendationsResponse = (com.kiptv.core.model.TMDBRecommendationsResponse) obj;
        return kotlin.jvm.internal.m.a(this.f20273a, tMDBRecommendationsResponse.f20273a) && kotlin.jvm.internal.m.a(this.f20274b, tMDBRecommendationsResponse.f20274b) && kotlin.jvm.internal.m.a(this.f20275c, tMDBRecommendationsResponse.f20275c) && kotlin.jvm.internal.m.a(this.f20276d, tMDBRecommendationsResponse.f20276d);
    }

    public final int hashCode() {
        java.lang.Integer num = this.f20273a;
        int iB = B2.a.b((num == null ? 0 : num.hashCode()) * 31, 31, this.f20274b);
        java.lang.Integer num2 = this.f20275c;
        int iHashCode = (iB + (num2 == null ? 0 : num2.hashCode())) * 31;
        java.lang.Integer num3 = this.f20276d;
        return iHashCode + (num3 != null ? num3.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "TMDBRecommendationsResponse(page=" + this.f20273a + ", results=" + this.f20274b + ", totalResults=" + this.f20275c + ", totalPages=" + this.f20276d + ")";
    }
}
