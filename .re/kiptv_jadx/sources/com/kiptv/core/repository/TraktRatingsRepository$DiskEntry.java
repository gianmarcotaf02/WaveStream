package com.kiptv.core.repository;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0083\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"com/kiptv/core/repository/TraktRatingsRepository$DiskEntry", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class TraktRatingsRepository$DiskEntry {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.kiptv.core.repository.TraktRatingsRepository$DiskEntry.Companion INSTANCE = new com.kiptv.core.repository.TraktRatingsRepository$DiskEntry.Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f20936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.kiptv.core.model.TraktExternalRatings f20937b;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/repository/TraktRatingsRepository$DiskEntry$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/repository/TraktRatingsRepository$DiskEntry;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final kotlinx.serialization.KSerializer serializer() {
            return com.kiptv.core.repository.TraktRatingsRepository$DiskEntry$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TraktRatingsRepository$DiskEntry(int i3, long j, com.kiptv.core.model.TraktExternalRatings traktExternalRatings) {
        if (3 != (i3 & 3)) {
            p153r8.AbstractC2686a0.l(i3, 3, com.kiptv.core.repository.TraktRatingsRepository$DiskEntry$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f20936a = j;
        this.f20937b = traktExternalRatings;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.repository.TraktRatingsRepository$DiskEntry)) {
            return false;
        }
        com.kiptv.core.repository.TraktRatingsRepository$DiskEntry traktRatingsRepository$DiskEntry = (com.kiptv.core.repository.TraktRatingsRepository$DiskEntry) obj;
        return this.f20936a == traktRatingsRepository$DiskEntry.f20936a && kotlin.jvm.internal.m.a(this.f20937b, traktRatingsRepository$DiskEntry.f20937b);
    }

    public final int hashCode() {
        return this.f20937b.hashCode() + (java.lang.Long.hashCode(this.f20936a) * 31);
    }

    public final java.lang.String toString() {
        return "DiskEntry(savedAt=" + this.f20936a + ", data=" + this.f20937b + ")";
    }

    public TraktRatingsRepository$DiskEntry(long j, com.kiptv.core.model.TraktExternalRatings traktExternalRatings) {
        this.f20936a = j;
        this.f20937b = traktExternalRatings;
    }
}
