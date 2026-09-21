package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/TMDBPersonSearchResponse;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class TMDBPersonSearchResponse {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.kiptv.core.model.TMDBPersonSearchResponse.Companion INSTANCE = new com.kiptv.core.model.TMDBPersonSearchResponse.Companion();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final kotlinx.serialization.KSerializer[] f20261e = {null, new p153r8.C2691d(com.kiptv.core.model.TMDBPersonSearchResult$$serializer.INSTANCE, 0), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.List f20263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f20264c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f20265d;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/TMDBPersonSearchResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/TMDBPersonSearchResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final kotlinx.serialization.KSerializer serializer() {
            return com.kiptv.core.model.TMDBPersonSearchResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TMDBPersonSearchResponse(int i3, int i9, int i10, int i11, java.util.List list) {
        if (15 != (i3 & 15)) {
            p153r8.AbstractC2686a0.l(i3, 15, com.kiptv.core.model.TMDBPersonSearchResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f20262a = i9;
        this.f20263b = list;
        this.f20264c = i10;
        this.f20265d = i11;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.model.TMDBPersonSearchResponse)) {
            return false;
        }
        com.kiptv.core.model.TMDBPersonSearchResponse tMDBPersonSearchResponse = (com.kiptv.core.model.TMDBPersonSearchResponse) obj;
        return this.f20262a == tMDBPersonSearchResponse.f20262a && kotlin.jvm.internal.m.a(this.f20263b, tMDBPersonSearchResponse.f20263b) && this.f20264c == tMDBPersonSearchResponse.f20264c && this.f20265d == tMDBPersonSearchResponse.f20265d;
    }

    public final int hashCode() {
        return java.lang.Integer.hashCode(this.f20265d) + p121o0.p.d(this.f20264c, B2.a.b(java.lang.Integer.hashCode(this.f20262a) * 31, 31, this.f20263b), 31);
    }

    public final java.lang.String toString() {
        return "TMDBPersonSearchResponse(page=" + this.f20262a + ", results=" + this.f20263b + ", totalResults=" + this.f20264c + ", totalPages=" + this.f20265d + ")";
    }
}
