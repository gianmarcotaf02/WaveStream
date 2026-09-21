package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/TMDBVideosResponse;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class TMDBVideosResponse {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.kiptv.core.model.TMDBVideosResponse.Companion INSTANCE = new com.kiptv.core.model.TMDBVideosResponse.Companion();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final kotlinx.serialization.KSerializer[] f20348c = {null, new p153r8.C2691d(com.kiptv.core.model.TMDBVideo$$serializer.INSTANCE, 0)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Integer f20349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.List f20350b;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/TMDBVideosResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/TMDBVideosResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final kotlinx.serialization.KSerializer serializer() {
            return com.kiptv.core.model.TMDBVideosResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TMDBVideosResponse(int i3, java.lang.Integer num, java.util.List list) {
        if (2 != (i3 & 2)) {
            p153r8.AbstractC2686a0.l(i3, 2, com.kiptv.core.model.TMDBVideosResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i3 & 1) == 0) {
            this.f20349a = null;
        } else {
            this.f20349a = num;
        }
        this.f20350b = list;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.model.TMDBVideosResponse)) {
            return false;
        }
        com.kiptv.core.model.TMDBVideosResponse tMDBVideosResponse = (com.kiptv.core.model.TMDBVideosResponse) obj;
        return kotlin.jvm.internal.m.a(this.f20349a, tMDBVideosResponse.f20349a) && kotlin.jvm.internal.m.a(this.f20350b, tMDBVideosResponse.f20350b);
    }

    public final int hashCode() {
        java.lang.Integer num = this.f20349a;
        return this.f20350b.hashCode() + ((num == null ? 0 : num.hashCode()) * 31);
    }

    public final java.lang.String toString() {
        return "TMDBVideosResponse(id=" + this.f20349a + ", results=" + this.f20350b + ")";
    }
}
