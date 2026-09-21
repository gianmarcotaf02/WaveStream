package com.kiptv.core.local.cache;

import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import p119n8.i;
import p121o0.p;
import p153r8.AbstractC2686a0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0083\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/local/cache/CacheMetadata;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@i
public final class CacheMetadata {

    public static final Companion INSTANCE = new Companion();

    public final long f19595a;

    public final int f19596b;

    public final int f19597c;

    public final int f19598d;

    public final int f19599e;

    public final int f19600f;
    public final int g;

    public final int f19601h;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/kiptv/core/local/cache/CacheMetadata$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/local/cache/CacheMetadata;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "CURRENT_VERSION", "I", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final KSerializer serializer() {
            return CacheMetadata$$serializer.INSTANCE;
        }
    }

    public CacheMetadata(int i3, long j, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
        if (255 != (i3 & 255)) {
            AbstractC2686a0.l(i3, 255, CacheMetadata$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f19595a = j;
        this.f19596b = i9;
        this.f19597c = i10;
        this.f19598d = i11;
        this.f19599e = i12;
        this.f19600f = i13;
        this.g = i14;
        this.f19601h = i15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CacheMetadata)) {
            return false;
        }
        CacheMetadata cacheMetadata = (CacheMetadata) obj;
        return this.f19595a == cacheMetadata.f19595a && this.f19596b == cacheMetadata.f19596b && this.f19597c == cacheMetadata.f19597c && this.f19598d == cacheMetadata.f19598d && this.f19599e == cacheMetadata.f19599e && this.f19600f == cacheMetadata.f19600f && this.g == cacheMetadata.g && this.f19601h == cacheMetadata.f19601h;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f19601h) + p.d(this.g, p.d(this.f19600f, p.d(this.f19599e, p.d(this.f19598d, p.d(this.f19597c, p.d(this.f19596b, Long.hashCode(this.f19595a) * 31, 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        return "CacheMetadata(cachedAt=" + this.f19595a + ", version=" + this.f19596b + ", vodCategoryCount=" + this.f19597c + ", vodStreamCount=" + this.f19598d + ", seriesCategoryCount=" + this.f19599e + ", seriesStreamCount=" + this.f19600f + ", liveCategoryCount=" + this.g + ", liveStreamCount=" + this.f19601h + ")";
    }

    public CacheMetadata(long j, int i3, int i9, int i10, int i11, int i12, int i13) {
        this.f19595a = j;
        this.f19596b = 2;
        this.f19597c = i3;
        this.f19598d = i9;
        this.f19599e = i10;
        this.f19600f = i11;
        this.g = i12;
        this.f19601h = i13;
    }
}
