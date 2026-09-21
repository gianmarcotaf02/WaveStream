package com.kiptv.core.repository;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0083\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"com/kiptv/core/repository/NewContentRepository$CachedBadges", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class NewContentRepository$CachedBadges {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.kiptv.core.repository.NewContentRepository$CachedBadges.Companion INSTANCE = new com.kiptv.core.repository.NewContentRepository$CachedBadges.Companion();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final kotlinx.serialization.KSerializer[] f20906e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f20908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f20909c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.util.Map f20910d;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/repository/NewContentRepository$CachedBadges$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/repository/NewContentRepository$CachedBadges;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final kotlinx.serialization.KSerializer serializer() {
            return com.kiptv.core.repository.NewContentRepository$CachedBadges$$serializer.INSTANCE;
        }
    }

    static {
        p153r8.p0 p0Var = p153r8.p0.f26988a;
        f20906e = new kotlinx.serialization.KSerializer[]{null, null, null, new p153r8.F(p0Var, p0Var, 1)};
    }

    public /* synthetic */ NewContentRepository$CachedBadges(int i3, int i9, java.lang.String str, long j, java.util.Map map) {
        if (15 != (i3 & 15)) {
            p153r8.AbstractC2686a0.l(i3, 15, com.kiptv.core.repository.NewContentRepository$CachedBadges$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f20907a = i9;
        this.f20908b = str;
        this.f20909c = j;
        this.f20910d = map;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.repository.NewContentRepository$CachedBadges)) {
            return false;
        }
        com.kiptv.core.repository.NewContentRepository$CachedBadges newContentRepository$CachedBadges = (com.kiptv.core.repository.NewContentRepository$CachedBadges) obj;
        return this.f20907a == newContentRepository$CachedBadges.f20907a && kotlin.jvm.internal.m.a(this.f20908b, newContentRepository$CachedBadges.f20908b) && this.f20909c == newContentRepository$CachedBadges.f20909c && kotlin.jvm.internal.m.a(this.f20910d, newContentRepository$CachedBadges.f20910d);
    }

    public final int hashCode() {
        return this.f20910d.hashCode() + p121o0.p.e(B2.a.a(java.lang.Integer.hashCode(this.f20907a) * 31, 31, this.f20908b), 31, this.f20909c);
    }

    public final java.lang.String toString() {
        return "CachedBadges(schemaVersion=" + this.f20907a + ", playlistId=" + this.f20908b + ", contentCachedAt=" + this.f20909c + ", badges=" + this.f20910d + ")";
    }

    public NewContentRepository$CachedBadges(java.lang.String str, long j, java.util.LinkedHashMap linkedHashMap) {
        this.f20907a = 2;
        this.f20908b = str;
        this.f20909c = j;
        this.f20910d = linkedHashMap;
    }
}
