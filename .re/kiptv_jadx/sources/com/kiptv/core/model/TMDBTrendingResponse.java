package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/TMDBTrendingResponse;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class TMDBTrendingResponse {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.kiptv.core.model.TMDBTrendingResponse.Companion INSTANCE = new com.kiptv.core.model.TMDBTrendingResponse.Companion();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final kotlinx.serialization.KSerializer[] f20336e = {null, new p153r8.C2691d(com.kiptv.core.model.TMDBSearchResult$$serializer.INSTANCE, 0), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.List f20338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f20339c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f20340d;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/TMDBTrendingResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/TMDBTrendingResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final kotlinx.serialization.KSerializer serializer() {
            return com.kiptv.core.model.TMDBTrendingResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TMDBTrendingResponse(int i3, int i9, int i10, int i11, java.util.List list) {
        if (15 != (i3 & 15)) {
            p153r8.AbstractC2686a0.l(i3, 15, com.kiptv.core.model.TMDBTrendingResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f20337a = i9;
        this.f20338b = list;
        this.f20339c = i10;
        this.f20340d = i11;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.model.TMDBTrendingResponse)) {
            return false;
        }
        com.kiptv.core.model.TMDBTrendingResponse tMDBTrendingResponse = (com.kiptv.core.model.TMDBTrendingResponse) obj;
        return this.f20337a == tMDBTrendingResponse.f20337a && kotlin.jvm.internal.m.a(this.f20338b, tMDBTrendingResponse.f20338b) && this.f20339c == tMDBTrendingResponse.f20339c && this.f20340d == tMDBTrendingResponse.f20340d;
    }

    public final int hashCode() {
        return java.lang.Integer.hashCode(this.f20340d) + p121o0.p.d(this.f20339c, B2.a.b(java.lang.Integer.hashCode(this.f20337a) * 31, 31, this.f20338b), 31);
    }

    public final java.lang.String toString() {
        return "TMDBTrendingResponse(page=" + this.f20337a + ", results=" + this.f20338b + ", totalResults=" + this.f20339c + ", totalPages=" + this.f20340d + ")";
    }
}
