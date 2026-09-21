package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/OSSearchResponse;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class OSSearchResponse {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.kiptv.core.model.OSSearchResponse.Companion INSTANCE = new com.kiptv.core.model.OSSearchResponse.Companion();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final kotlinx.serialization.KSerializer[] f19924e = {null, null, null, new p153r8.C2691d(com.kiptv.core.model.OSSubtitleResult$$serializer.INSTANCE, 0)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f19927c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.util.List f19928d;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/OSSearchResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/OSSearchResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final kotlinx.serialization.KSerializer serializer() {
            return com.kiptv.core.model.OSSearchResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OSSearchResponse(int i3, int i9, int i10, int i11, java.util.List list) {
        if (15 != (i3 & 15)) {
            p153r8.AbstractC2686a0.l(i3, 15, com.kiptv.core.model.OSSearchResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f19925a = i9;
        this.f19926b = i10;
        this.f19927c = i11;
        this.f19928d = list;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.model.OSSearchResponse)) {
            return false;
        }
        com.kiptv.core.model.OSSearchResponse oSSearchResponse = (com.kiptv.core.model.OSSearchResponse) obj;
        return this.f19925a == oSSearchResponse.f19925a && this.f19926b == oSSearchResponse.f19926b && this.f19927c == oSSearchResponse.f19927c && kotlin.jvm.internal.m.a(this.f19928d, oSSearchResponse.f19928d);
    }

    public final int hashCode() {
        return this.f19928d.hashCode() + p121o0.p.d(this.f19927c, p121o0.p.d(this.f19926b, java.lang.Integer.hashCode(this.f19925a) * 31, 31), 31);
    }

    public final java.lang.String toString() {
        return "OSSearchResponse(totalPages=" + this.f19925a + ", totalCount=" + this.f19926b + ", page=" + this.f19927c + ", data=" + this.f19928d + ")";
    }
}
