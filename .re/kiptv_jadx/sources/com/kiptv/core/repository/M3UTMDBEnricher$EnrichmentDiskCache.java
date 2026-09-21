package com.kiptv.core.repository;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0083\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"com/kiptv/core/repository/M3UTMDBEnricher$EnrichmentDiskCache", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class M3UTMDBEnricher$EnrichmentDiskCache {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.kiptv.core.repository.M3UTMDBEnricher$EnrichmentDiskCache.Companion INSTANCE = new com.kiptv.core.repository.M3UTMDBEnricher$EnrichmentDiskCache.Companion();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final kotlinx.serialization.KSerializer[] f20894d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.Map f20895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.Map f20896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f20897c;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/repository/M3UTMDBEnricher$EnrichmentDiskCache$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/repository/M3UTMDBEnricher$EnrichmentDiskCache;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final kotlinx.serialization.KSerializer serializer() {
            return com.kiptv.core.repository.M3UTMDBEnricher$EnrichmentDiskCache$$serializer.INSTANCE;
        }
    }

    static {
        p153r8.p0 p0Var = p153r8.p0.f26988a;
        f20894d = new kotlinx.serialization.KSerializer[]{new p153r8.F(p0Var, p0Var, 1), new p153r8.F(p0Var, p0Var, 1), null};
    }

    public /* synthetic */ M3UTMDBEnricher$EnrichmentDiskCache(int i3, java.util.Map map, java.util.Map map2, long j) {
        if (7 != (i3 & 7)) {
            p153r8.AbstractC2686a0.l(i3, 7, com.kiptv.core.repository.M3UTMDBEnricher$EnrichmentDiskCache$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f20895a = map;
        this.f20896b = map2;
        this.f20897c = j;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.repository.M3UTMDBEnricher$EnrichmentDiskCache)) {
            return false;
        }
        com.kiptv.core.repository.M3UTMDBEnricher$EnrichmentDiskCache m3UTMDBEnricher$EnrichmentDiskCache = (com.kiptv.core.repository.M3UTMDBEnricher$EnrichmentDiskCache) obj;
        return kotlin.jvm.internal.m.a(this.f20895a, m3UTMDBEnricher$EnrichmentDiskCache.f20895a) && kotlin.jvm.internal.m.a(this.f20896b, m3UTMDBEnricher$EnrichmentDiskCache.f20896b) && this.f20897c == m3UTMDBEnricher$EnrichmentDiskCache.f20897c;
    }

    public final int hashCode() {
        return java.lang.Long.hashCode(this.f20897c) + B2.a.c(this.f20895a.hashCode() * 31, 31, this.f20896b);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("EnrichmentDiskCache(moviePaths=");
        sb.append(this.f20895a);
        sb.append(", seriesPaths=");
        sb.append(this.f20896b);
        sb.append(", cachedAtMs=");
        return Y6.f.g(this.f20897c, ")", sb);
    }
}
